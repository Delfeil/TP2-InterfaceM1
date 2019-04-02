/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javax.swing.JLabel;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.awt.StatusLineElementProvider;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author casanova
 */
/*@ActionID(
        category = "Status",
        id = "m1.piu.MyStatusLineElementProvider"
)
/*@ActionRegistration(
        iconBase = "m1/piu/54257998_2357457401153276_2699110482786123776_n.png",
        displayName = "#CTL_MyStatusLineElementProvider"
)
@ActionReference(path = "Toolbars/Status", position = 300)
@NbBundle.Messages("CTL_MyStatusLineElementProvider=MyStatusLineElementProvider")*/
@ServiceProvider(service = StatusLineElementProvider.class, position = 100)
public final class MyStatusLineElementProvider implements StatusLineElementProvider {
    
    /*JFXPanel panel;
    private static final URL url = Tool.class.getResource("/m1/piu/FXMLStatus.fxml");*/

    @Override
    public Component getStatusLineElement() {
        return new JLabel("Status");
        /*if (panel == null){
            panel = new JFXPanel();
            try {
                panel.setScene(new Scene(FXMLLoader.<Parent>load(url)));
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return panel;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }
    
}
