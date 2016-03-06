/*
 * (c) Copyright 2002-2006 Andreas Sch�nknecht
 */
package datenxmlTestPlugin;



import helden.plugin.HeldenXMLDatenPlugin3;
import helden.plugin.datenxmlplugin.DatenAustausch3Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;

import jaxbGenerated.datenxml.Daten;
import jaxbGenerated.datenxml.Talent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Startet das Plugin von der Helden-Software aus.
 */
public class HeldenStart implements HeldenXMLDatenPlugin3, ChangeListener  {


	private DatenAustausch3Interface dai;
	private JFrame frame;
	private boolean tabHatFocus = false;


	/**
	 * @return Liste mit den Strings für die Untemenüs; wenn die Liste Leer ist, werden keine
	 *         Submenüs angezeigt ist
	 */
	@Override
	public ArrayList<JComponent> getUntermenus() {
		ArrayList<JComponent> liste = new ArrayList<JComponent>();

		JMenuItem jmi = new JMenuItem("Zugriff auf den aktuellen Held als XML");
		jmi.addActionListener(
				new ActionListener() {
					@Override
					public final void actionPerformed(final ActionEvent e) {
						show();
					}
				}
				);
		liste.add(jmi);

		jmi = new JMenuItem("Zugriff auf den aktuellen Held via JAXB");
		jmi.addActionListener(
				new ActionListener() {
					@Override
					public final void actionPerformed(final ActionEvent e) {
						Document doc = getCurrentHelden();
						JAXBContext jaxbContext;
						try {
							jaxbContext = JAXBContext.newInstance(Daten.class);
							Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
							Daten daten = (Daten) jaxbUnmarshaller.unmarshal(doc.getDocumentElement());
							System.out.println(daten.getAngaben().getName());
							for (Talent t : daten.getTalentliste().getTalent()) {
								System.out.println(String.format("%40s: %2d", t.getName(), t.getWert()));
							}
						} catch (JAXBException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}						

					}


				}
				);
		liste.add(jmi);


		jmi = new JMenuItem("Properties Test (Helden Unabhängig)");
		jmi.addActionListener(
				new ActionListener() {
					@Override
					public final void actionPerformed(final ActionEvent e) {
						HeldenUnabhaengigeProps.test(dai);
					}


				}
				);
		liste.add(jmi);
		
		jmi = new JMenuItem("Properties Test (Heldenspezifisch)");
		jmi.addActionListener(
				new ActionListener() {
					@Override
					public final void actionPerformed(final ActionEvent e) {
						HeldenSpezifischeProp.test(dai);
					}


				}
				);
		liste.add(jmi);
		return liste;

	}


	/**
	 * Liefert das ImageIcon f�r das Menu
	 * @return ImageIcon oder null 
	 */
	@Override
	public ImageIcon getIcon() {
		return null;
	}




	/**
	 * Defaultconstructor
	 * Gefordert von der Helden-Software
	 */
	public HeldenStart() {
		super();
	}



	/**
	 * Gibt den Namen des Plugins an.
	 * Wird verwendet um das Menu auf zu bauen.
	 * @return name
	 */
	@Override
	public String getMenuName() {
		return "XMLDaten (10.09.2015)";
	}


	/**
	 * @param f Frames des Heldenprogramms.
	 */
	@Override
	public void doWork(JFrame f) {
	}

	/**
	 * Wird von Helden Aufgerufen
	 * @param frame parent Frame
	 * @param menuIdx x
	 * @param dai Datenstruktur für die Daten
	 */
	public void show() {
		final org.w3c.dom.Document doc = getCurrentHelden();
		// Nun speichern wir die Daten als XML-Datei
		XMLTools.save(doc);
		XMLShowDialog dialog = new XMLShowDialog(frame, doc);
		dialog.setVisible(true);

	}


	private org.w3c.dom.Document getCurrentHelden() {
		// Über das DAI-Objekt ist eine Kommunikation mit Helden möglich
		// In diesem Fall wird für den ausgewählten Helden die XML Datei mit allen
		// Informationen angefordert
		org.w3c.dom.Document request;
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			request = factory.newDocumentBuilder().newDocument();
		} catch (Exception ex) {
			request = null;
		}
		Element requestElement = request.createElement("action");
		request.appendChild(requestElement);
		requestElement.setAttribute("action", "held");
		requestElement.setAttribute("id", "selected");
		requestElement.setAttribute("format", "xml");
		requestElement.setAttribute("version", "2");
		// Über die exec-Anweisung können Daten angefordert werden
		final org.w3c.dom.Document doc = (org.w3c.dom.Document) dai.exec(request);
		return doc;
	}	

	/**
	 * Gibt helden den Typ dieses Plugins
	 * @return SIMPLE
	 */
	@Override
	public String getType() {
		return DATEN;
	}
	
	/**
	 * Möchte das Plugin einen eigenen Tab, muss diese Methode überschrieben werden und 
	 * ein JPanel zurückgeliefert werden 
	 */
	@Override
	public JComponent getPanel() {
		JPanel p = new JPanel();
		p.add(new JLabel("Test"));
		return p;
	}

	@Override
	public String getToolTipText() {
		return "Irgendein Tooltip";
	}



	@Override
	public void click() {
	}



	/**
	 * @return Muss true liefern, wenn das Plugin einen Menü Eintrag haben möchte
	 */
	@Override
	public boolean hatMenu() {
		return true;
	}



	/**
	 * @return Muss true liefern, wenn das Plugin einen eigenen Tab haben möchte
	 */
	@Override
	public boolean hatTab() {
		return true;
	}



	@Override
	public void stateChanged(ChangeEvent e) {
		System.out.println("Event: " + e.getSource());
		if (e.getSource().equals("Focus")) {
			tabHatFocus = true;
			System.out.println("	Tab wird angezeigt");
			System.out.println("	Da der Tab nun Fokus hat, muss die Anzeige aktualisiert werden.");
		} else if (e.getSource().equals("Kein Focus")) {
			tabHatFocus = false;
			System.out.println("	Tab wird nicht mehr angezeigt");
		} else if (e.getSource().equals("Änderung")) {
			System.out.println("	Der aktuelle Held wurde verändert.");
			if (tabHatFocus) {
				System.out.println("	Da der Tab Fokus hat, muss die Anzeige aktualisiert werden.");
			} else {
				System.out.println("	Da der Tab kein Fokus hat, sollte die Anzeige nicht aktualisiert werden.");
			}
		} else if (e.getSource().equals("neuer Held")) {
			System.out.println("	Ein neuer Held wurde ausgewählt.");
			if (tabHatFocus) {
				System.out.println("	Da der Tab Fokus hat, muss die Anzeige aktualisiert werden.");
			} else {
				System.out.println("	Da der Tab kein Fokus hat, sollte die Anzeige nicht aktualisiert werden.");
			}
		} else {
			System.out.println("	Unbekannter Event");
		}
	}



	@Override
	public void init(DatenAustausch3Interface dai, JFrame hf) {
		this.dai = dai;
		this.frame = hf;
		dai.addChangeListener(this);
	}

}
