package helden.plugin;

import helden.plugin.datenxmlplugin.DatenAustausch3Interface;

import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Dritte Version der XMLDatenPlugin-Schnittstelle
 * @author sven
 *
 */
public interface HeldenXMLDatenPlugin3 extends HeldenPlugin  {

    /**
     * Konstante für Simple Execution Inteface
     */
    String DATEN = "DatenXMLPlugin3";


    /**
     * Liefert die Namen der Menuunterpunkte zurueck
     * @return Liste der Namen der Spielbögen
     */
    ArrayList<JComponent> getUntermenus();
    
    /**
     * Wird nach der Initalisierung aufgerufen, damit das Tool bereits Informationen
     * anfordern kann xde3
     * @param dai Dai
     * @param hf Frame 
     */
    void init(DatenAustausch3Interface dai, JFrame hf);
  
    /** Wird aufgerufen, wenn der Menüeintrag ausgewählt wurde und es 
     * keine Untermenüs gibt 
     */
    void click();
    
    /**
     * 
     * @return true, wenn Menüeinträge angezeigt werden sollen
     */
    boolean hatMenu();

    /**
     * 
     * @return true, wenn ein eigener Tab angezeigt werden soll
     */
    boolean hatTab();
    
    /**
     * 
     * @return Componente für das Panel
     */
    JComponent getPanel();

}
