package datenxmlTestPlugin;

import helden.plugin.datenxmlplugin.DatenAustausch3Interface;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class HeldenUnabhaengigeProps {

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
		requestElement.setAttribute("action", "listProperties");
		requestElement.setAttribute("pluginName", "datenxml3test");
		// Über die exec-Anweisung können Daten angefordert werden
		final org.w3c.dom.Document doc = (org.w3c.dom.Document) dai.exec(request);
		System.out.println("Gespeicherte Informationen: " + XMLTools.doc2string(doc));
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
		actionElement.setAttribute("action", "saveProperties");
		actionElement.setAttribute("pluginName", "datenxml3test");

		Element requestElement = request.createElement("prop");
		actionElement.appendChild(requestElement);
		requestElement.setAttribute("key", "letzterAufrufMs");
		requestElement.setAttribute("value", "testvalue" + System.currentTimeMillis());
		final org.w3c.dom.Document ret = (org.w3c.dom.Document) dai.exec(request);
		System.out.println("Rückmeldung von storeProp: " + XMLTools.doc2string(ret));

	}


}
