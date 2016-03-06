package helden.plugin.datenxmlplugin;

import javax.swing.event.ChangeListener;

import org.w3c.dom.Document;

/**
 * Interface
 * @author sven
 *
 */
public interface DatenAustausch3Interface {

    /**
     * F�hrt eine Aktion aus und liefert das Ergebnis zur�ck
     * @param d (XML-kodiert)
     * @return Ergebnis der Aktion 
     */
    Object exec(Document d);

    /**
     * Benachrichtigt die Plugins bei relevanten Ereignissen in der Software
     * 
     * @param c Nachricht
     */
    void addChangeListener(ChangeListener c);

}
