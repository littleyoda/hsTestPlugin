package datenxmlTestPlugin;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLShowDialog extends JDialog {

	public XMLShowDialog(JFrame frame, final Document doc) {
		super(frame, "Test für das Daten-XML-Plugin", true);

		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		JLabel jl = new JLabel("<html>" +
				"Die XML-Daten wurden als MeineTextDatei.txt gespeichert!<br>" +
				"Mit Hilfe dieses Interfaces können Daten aus der XML-Datei extrahiert werden.<br>" +
				"Mit /daten/angaben/name erhält man z.B. den Namen des Helden.<br>" 
				);
		jp.add(jl, BorderLayout.NORTH);
		final JTextArea ta = new JTextArea();
		jp.add(new JScrollPane(ta), BorderLayout.CENTER);

		JPanel jpUnten = new JPanel();
		jpUnten.setLayout(new BorderLayout());

		final JTextField tf = new JTextField("/daten");
		jpUnten.add(tf, BorderLayout.CENTER);

		JButton b = new JButton("Anzeigen");
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String s = tf.getText();
				if ((s != null) && (s.length() > 0)) {
					// xpath für den Suchausdruck
					XPath xpath = XPathFactory.newInstance().newXPath();
					try  { 
						XPathExpression expr 
						= xpath.compile(s);
						Object result = expr.evaluate(doc, XPathConstants.NODESET);

						// Nun die ganzen Suchtreffer in ein neues Document
						NodeList nodes = (NodeList) result;
						Document ret;
						try {
							final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
							ret = factory.newDocumentBuilder().newDocument();
						} catch (Exception ex) {
							ret = null;
						}
						ret.appendChild(ret.createElement("result"));
						for (int i = 0; i < nodes.getLength(); i++) {
							ret.getDocumentElement().appendChild(ret.importNode(nodes.item(i), true));
						}
						// Und das Document sauber als XML ausgeben
						ta.setText(XMLTools.doc2string(ret));
					} catch (Exception ex) {
						ta.setText(ex.toString());
						ex.printStackTrace();
					}
				}
			}

		});
		jpUnten.add(b, BorderLayout.EAST);

		jp.add(jpUnten, BorderLayout.SOUTH);
		add(jp);
		setSize(600, 450);
		setModal(false);
	}

}
