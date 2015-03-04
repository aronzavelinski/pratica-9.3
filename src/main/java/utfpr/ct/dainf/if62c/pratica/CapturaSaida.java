import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Exemplo de Programação em Java.
 * Esta classe implementa um thread que tenta ler a saída de um
 * processo enquanto o processo estiver ativo.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class CapturaSaida extends Thread {

    private final OutputStream os;

    public CapturaSaida(OutputStream os) {
        this.os = os;
    }

    @Override
    public void run() {
        /*try {
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            String linha;
            
            bw.println(linha);
            
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }*/
    }
}