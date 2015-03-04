
import java.util.ArrayList;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.ExecCmd;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica93 {
    public static void main(String[] args) {
        ArrayList<ExecCmd> cmdl = new ArrayList<>();
        boolean fim = false;
        String cmd;
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        
        while(!fim){
            System.out.print("comando> ");
            cmd = in.next();
            if(cmd.equalsIgnoreCase("fim")){
                System.out.print("Há "+cmdl.size()+" processos em execução. Deseja terminá-los? (s/n) ");
                cmd = in.next();
                if(cmd.equalsIgnoreCase("s")){
                    int l=cmdl.size();
                    ExecCmd c;
                    for(int i=0;i<l;i++){
                        c = cmdl.get(i);
                        if(!c.terminado())
                            c.cancela();
                        cmdl.remove(c);
                    }
                    fim = true;
                }
            }else{
                ExecCmd c = new ExecCmd(cmd);
                c.start();
                cmdl.add(c);
            }
        }
    }
}
