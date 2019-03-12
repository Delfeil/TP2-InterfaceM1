/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javax.swing.AbstractAction;
import javax.swing.JLabel;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "m1.piu.Tool"
)
@ActionRegistration(
        iconBase = "m1/piu/54257998_2357457401153276_2699110482786123776_n.png",
        displayName = "#CTL_Tool"
)
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_Tool=Tool")
public final class Tool extends AbstractAction implements Presenter.Toolbar {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
    @Override
    public Component getToolbarPresenter() {
        return new JLabel("Label in toolbar demo");
    }
}
