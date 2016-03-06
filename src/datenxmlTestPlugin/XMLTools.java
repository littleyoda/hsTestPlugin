package datenxmlTestPlugin;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XMLTools {

    /**
     * Wandelt ein XML-Dokument in ein String um
     * @param doc
     */
	static public String doc2string(org.w3c.dom.Document doc)  {
        Transformer transformer;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
            return  result.getWriter().toString();
        } catch (Exception e) {
            return e.toString();
        }
    }
    /**
     * Speichert ein XML-Datei als Dokument.
     * @param doc
     */
    static public void save(org.w3c.dom.Document doc) {
        try {
            BufferedWriter out = new BufferedWriter(
                                 new OutputStreamWriter(
                                 new FileOutputStream("MeineTextDatei.txt"), "UTF-8"));
            out.append(doc2string(doc));
            out.close();
          } catch (Exception ex) {
              //pdf.FehlermeldungPlugin.zeige("Fehler beim Speichern", ex);
          }

    }



}
