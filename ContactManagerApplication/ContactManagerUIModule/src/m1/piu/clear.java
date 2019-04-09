/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "m1.piu.clear"
)
@ActionRegistration(
        iconBase = "m1/piu/clean3.png",
        displayName = "#CTL_clear"
)
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_clear=Clear")
public final class clear implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        System.out.println("Clear event");
               Object result = DialogDisplayer.getDefault().notify(new NotifyDescriptor.Confirmation("Êtes vous sure de vouloir supprimer ce contact?", NotifyDescriptor.YES_NO_OPTION, NotifyDescriptor.WARNING_MESSAGE));
               System.out.println(result);
               if(result.equals(NotifyDescriptor.YES_OPTION)) {
                   DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("Le contact a été supprimé", NotifyDescriptor.INFORMATION_MESSAGE));
               } else {
                   System.out.println("No");
               }
    }
}
