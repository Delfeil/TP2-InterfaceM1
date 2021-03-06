/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.URL;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javax.swing.JPanel;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Exceptions;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//m1.piu//MainPanel//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "MainPanelTopComponent",
        iconBase = "m1/piu/clean2.png",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "m1.piu.MainPanelTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_MainPanelAction",
        preferredID = "MainPanelTopComponent"
)
@Messages({
    "CTL_MainPanelAction=MainPanel",
    "CTL_MainPanelTopComponent=MainPanel Window",
    "HINT_MainPanelTopComponent=This is a MainPanel window"
})
public final class MainPanelTopComponent extends TopComponent {
    
    private static FXMLMainPannelController c;
    
    JFXPanel panel;
    private static final URL url = Tool.class.getResource("/m1/piu/FXMLToolBar.fxml");

    public MainPanelTopComponent() {
        initComponents();
        setName(Bundle.CTL_MainPanelTopComponent());
        setToolTipText(Bundle.HINT_MainPanelTopComponent());
        setLayout(new BorderLayout());
        init();

    }
    
    public void init() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JFXPanel fxPanel = new JFXPanel();
        panel.add(fxPanel, BorderLayout.NORTH);
        add(fxPanel, BorderLayout.CENTER);
        Platform.setImplicitExit(false);
        createFXScene(fxPanel);

        //Platform.runLater(() -> {
        //    createFXScene(fxPanel);
        //});
    }
    
    private void createFXScene(JFXPanel fxPanel) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMainPanel.fxml"));
            
            Parent root = loader.load();
   
            c = loader.getController();
                            
            Scene scene = new Scene(root);
            fxPanel.setScene(scene);
        } catch (IOException ex) {
            System.out.println("ici");
            Exceptions.printStackTrace(ex);
        }
    }
    
    public static FXMLMainPannelController getController( ) {
        return c;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
