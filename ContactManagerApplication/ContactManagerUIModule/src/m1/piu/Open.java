/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.util.RequestProcessor;

@ActionID(
        category = "File",
        id = "m1.piu.Open"
)
@ActionRegistration(
        iconBase = "m1/piu/icons8-dossier-ouvert-16.png",
        displayName = "#CTL_Open"
)
@ActionReference(path = "Menu/File", position = 1300)
@Messages("CTL_Open=Open")
public final class Open implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
        Runnable myRunnable = new Runnable() {
            public void run() {
                ProgressHandle myProgressHandle = ProgressHandleFactory.createHandle("Chargement du fichier...");
                int i=0;
                myProgressHandle.start(100);
                //DO TASK HERE
                
                while(i<100) {
                    try {
                        myProgressHandle.progress("Chargement du fichier...", i);
                        Thread.sleep(1000);
                        i+=10;
                    } catch (InterruptedException ex) {
                        Exceptions.printStackTrace(ex);
                    }
                }
                myProgressHandle.progress("Chargement du fichier...", i);
                myProgressHandle.finish();
            }
        };
        RequestProcessor.Task myTask = RequestProcessor.getDefault().post(myRunnable);
    }
}
