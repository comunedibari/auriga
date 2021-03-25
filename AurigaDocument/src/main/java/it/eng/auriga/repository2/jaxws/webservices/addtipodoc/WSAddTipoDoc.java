package it.eng.auriga.repository2.jaxws.webservices.addtipodoc;

import it.eng.auriga.database.store.dmpk_ws.bean.DmpkWsAddtipodocBean;
import it.eng.auriga.database.store.dmpk_ws.store.Addtipodoc;
import it.eng.auriga.database.store.result.bean.StoreResultBean;
import it.eng.auriga.module.business.beans.AurigaLoginBean;
import it.eng.auriga.module.business.beans.SpecializzazioneBean;
import it.eng.auriga.repository2.util.DBHelperSavePoint;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import it.eng.auriga.repository2.jaxws.webservices.common.JAXWSAbstractAurigaService;

/**
 * @author Ottavio Passalacqua
 */

@WebService(targetNamespace = "http://addtipodoc.webservices.repository2.auriga.eng.it",  endpointInterface="it.eng.auriga.repository2.jaxws.webservices.addtipodoc.WSIAddTipoDoc", name = "WSAddTipoDoc")
@MTOM(enabled = true, threshold = 0)

public class WSAddTipoDoc extends JAXWSAbstractAurigaService implements WSIAddTipoDoc{

    private final String K_SAVEPOINTNAME = "INIZIOWSADDTIPODOC";
   
    static Logger aLogger = Logger.getLogger(WSAddTipoDoc.class.getName());    
    
    public WSAddTipoDoc() {
	super();

    }

    /**
     * <code>serviceImplementation</code> biz logik del webservice.
     *
     * @param user a <code>String</code>
     * @param token a <code>String</code>
     * @param codAppl a <code>String</code>
     * @param conn a <code>Connection</code>
     * @param xmlDomDoc a <code>Document</code>
     * @param xml a <code>String</code>
     * @param istanzaAppl a <code>String</code>
     * @return a <code>String</code>
     * @exception Exception
     */
    @WebMethod(exclude=true)
    public final String serviceImplementation(final String user,
					      final String token,
					      final String codiceApplicazione,
					      final String istanzaAppl,
					      final Connection conn,
					      final Document xmlDomDoc,
					      final String xml,
					      final String schemaDb,
					      final String idDominio,
					      final String desDominio,
					      final String tipoDominio) throws Exception {


    String risposta = null;
    String outRispostaWS = null;
    String outWS = null;
    String errMsg = null;
    String xmlIn = null;

    try {
    	 aLogger.info("Inizio WSAddTipoDoc");
    	
    	 //setto il savepoint
  		 DBHelperSavePoint.SetSavepoint(conn, K_SAVEPOINTNAME);
  		
  		 // creo bean connessione
         AurigaLoginBean loginBean = new AurigaLoginBean();         
         loginBean.setToken(token);
         loginBean.setCodApplicazione(codiceApplicazione);
         loginBean.setIdApplicazione(istanzaAppl);
         loginBean.setSchema(schemaDb);  

         SpecializzazioneBean lspecializzazioneBean = new SpecializzazioneBean();
  		 lspecializzazioneBean.setCodIdConnectionToken(token);  		
	     if (idDominio!=null && !idDominio.equalsIgnoreCase(""))
	    	  lspecializzazioneBean.setIdDominio(new BigDecimal(idDominio));
  		
  		 if (tipoDominio!=null && !tipoDominio.equalsIgnoreCase(""))
 			  lspecializzazioneBean.setTipoDominio(new Integer(tipoDominio));
  		
  		loginBean.setSpecializzazioneBean(lspecializzazioneBean);
  		         
  		
         /*************************************************************
          * Chiamo il WS
          ************************************************************/ 
         
         try {
        	 outWS =  callWS(loginBean,xml);
	 		}
	 		catch (Exception e){	 
	 			if(e.getMessage()!=null)
		 			 errMsg = "Errore = " + e.getMessage();
		 		 else
		 			errMsg = "Errore imprevisto.";
	 		}
          
	 	if (errMsg==null){
	 	  		xmlIn = outWS;	
	 	}
	 	else{
	 	 		xmlIn = errMsg;
	 	}

				
	 	/**************************************************************************
		 * Creo XML di risposta del servzio e lo metto in attach alla response
		 **************************************************************************/
	 	try {		    	 
	    	  // Creo XML di risposta
	 		  outRispostaWS = generaXMLRispostaWS(xmlIn);
	 		
	 		  // Creo la lista di attach
	  		  List<InputStream> lListInputStreams = new ArrayList<InputStream>();
	  		  	  		  
	 		  // Converto l'XML
	 		  ByteArrayInputStream inputStreamXml = new ByteArrayInputStream(outRispostaWS.getBytes());
	 		  
	  		  // Aggiungo l'XML
	  		  lListInputStreams.add(inputStreamXml); 
	  		  
	  		  // Salvo gli ATTACH alla response
	  		  attachListInputStream(lListInputStreams);
	 		}
	 	catch (Exception e){
	 		if(e.getMessage()!=null)
	 			 errMsg = "Errore = " + e.getMessage();
	 		 else
	 			errMsg = "Errore imprevisto.";	
	 	}

	 		
	 	/*************************************************************
	      * Restituisco XML di risposta del WS
	      ************************************************************/		 		
	 	if (errMsg==null){
	 	 		risposta = generaXMLRisposta( JAXWSAbstractAurigaService.SUCCESSO, JAXWSAbstractAurigaService.SUCCESSO, "Tutto OK", "", "");
	 	}
	 	else{
	 	 		risposta = generaXMLRisposta( JAXWSAbstractAurigaService.FALLIMENTO, JAXWSAbstractAurigaService.ERR_ERRORE_APPLICATIVO,  errMsg, "", "");
	 	}
            	
	     aLogger.info("Fine WSAddTipoDoc");
	    
	     return risposta;
    }
  
    catch (Exception excptn) {
        aLogger.error("WSAddTipoDoc: " + excptn.getMessage(), excptn);
        return   generaXMLRisposta( JAXWSAbstractAurigaService.FALLIMENTO, JAXWSAbstractAurigaService.ERR_ERRORE_APPLICATIVO, JAXWSAbstractAurigaService.ERROR_ERRORE_APPLICATIVO, "", "" );
        //throw excptn;
	}
	finally
	{
    	try { DBHelperSavePoint.RollbackToSavepoint(conn, K_SAVEPOINTNAME); } catch (Exception ee) {}
	    aLogger.info("Fine WSAddTipoDoc serviceImplementation");
	}

    }

        
    private String callWS(AurigaLoginBean loginBean, String xmlIn) throws Exception {
    	    	
    	aLogger.debug("Eseguo il WS DmpkWSAddTipoDoc.");
    	
    	String result = null;    	
    	try {    		
    		  // Inizializzo l'INPUT    		
    		  DmpkWsAddtipodocBean input = new DmpkWsAddtipodocBean();
    		  input.setCodidconnectiontokenin(loginBean.getToken());
    		  input.setXmlin(xmlIn);
    		  
    		  // Eseguo il servizio
    		  Addtipodoc service = new Addtipodoc();
    		  StoreResultBean<DmpkWsAddtipodocBean> output = service.execute(loginBean, input);

    		  if (output.isInError()){
    			  throw new Exception(output.getDefaultMessage());	
    			}	

    		  if (output.getResultBean().getIdtipodocout()!=null)
    			  result = output.getResultBean().getIdtipodocout().toString();
    		  
    		  if (result== null || result.equalsIgnoreCase(""))
    			  throw new Exception("La store procedure ha ritornato IdTipoDocDoc nullo");
    			  
    		  return result;
 			}
 		catch (Exception e){
 			throw new Exception(e.getMessage()); 			
 		}
    }
    

	/**
     * Genera il file XML contenente l'id del tipo doc aggiunto
     * Questo file viene passato come allegato in caso di successo.
     *
     * @param String idTipoDoc
     * @return String stringa XML secondo il formato per il ritorno dell'idTipoDoc
     */
    private String generaXMLRispostaWS(String xmlIn)  throws Exception {
    
        StringBuffer xml = new StringBuffer();
        String xmlInEsc = null;
        
        try {
        	// ...se il token non e' null
            if (xmlIn != null) {
            	// effettuo l'escape di tutti i caratteri
            	xmlInEsc = eng.util.XMLUtil.xmlEscape(xmlIn);
            }
            aLogger.debug("generaXMLToken: token = " + xmlIn);
            aLogger.debug("generaXMLToken: tokenEsc = " + xmlInEsc);
            xml.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n");
            xml.append("<IdTipoDoc>" + xmlInEsc + "</IdTipoDoc>\n");
            aLogger.debug(xml.toString());
        }
        catch (Exception e){
 			throw new Exception(e.getMessage());
 		}        
        return xml.toString();
    }
}