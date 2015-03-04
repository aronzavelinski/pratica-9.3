/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aron
 */
public class ExecCmd extends Thread{
    String cmd;
    Process proc;
    
    public ExecCmd(String cmd){
        this.cmd = cmd;
    }
    
    @Override
    public void run(){
        Runtime rt = Runtime.getRuntime();
        try {
            proc = rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(ExecCmd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cancela(){
        if(proc != null)
            if(proc.isAlive())
                proc.destroy();
        interrupt();
    }
    
    public boolean terminado(){
        return interrupted();
    }
}
