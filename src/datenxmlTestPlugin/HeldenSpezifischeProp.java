package datenxmlTestPlugin;

import helden.plugin.datenxmlplugin.DatenAustausch3Interface;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class HeldenSpezifischeProp {

	public static void test(DatenAustausch3Interface dai) {
		getSavedProp(dai);
		storeProp(dai);
	}

	public static Document getSavedProp(DatenAustausch3Interface dai) {
		// XML-Datei mit allen Properies für dieses Plugin anzeigen
		org.w3c.dom.Document request;
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			request = factory.newDocumentBuilder().newDocument();
		} catch (Exception ex) {
			request = null;
		}
		Element requestElement = request.createElement("action");
		request.appendChild(requestElement);
		requestElement.setAttribute("action", "getHeldProperties");
		requestElement.setAttribute("heldenkey", "selected"); // den aktuell ausgewählten Helden
		requestElement.setAttribute("key", "testPlugin-LetzterAufruf"); 
		// Über die exec-Anweisung können Daten angefordert werden
		final org.w3c.dom.Document doc = (org.w3c.dom.Document) dai.exec(request);
		
		String value = doc.getChildNodes().item(0).getTextContent();

		System.out.println("Gespeicherte Informationen für den Key 'testPlugin-LetzterAufruf' für den aktuellen Held:\n" + value); 
		
		return doc;
	}
	
	/**
	 * Speichert neue globale Werte für dieses Plugin
	 * 
 	 * Vorsicht! Hierbei werden alle Werte gelöscht. 
	 * Es müssen also immer alle Werte neu gesetzt werden. 
	 * Am besten, das XML-Dokument aus getSavedProp übernehmen 
	 * 
	 * @param dai
	 */
	public static void storeProp(DatenAustausch3Interface dai) {
		org.w3c.dom.Document request;
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// Neue Werte setzten
		try {
			request = factory.newDocumentBuilder().newDocument();
		} catch (Exception ex) {
			request = null;
		}
		Element actionElement = request.createElement("action");
		request.appendChild(actionElement);
		actionElement.setAttribute("action", "setHeldProperties");
		actionElement.setAttribute("heldenkey", "selected"); // den aktuell ausgewählten Helden
		actionElement.setAttribute("key", "testPlugin-LetzterAufruf");
		actionElement.setTextContent("letzter Aufruf: " + System.currentTimeMillis());
		final org.w3c.dom.Document ret = (org.w3c.dom.Document) dai.exec(request);
		System.out.println("Rückmeldung von storeProp: " + XMLTools.doc2string(ret));

	}

	
}
