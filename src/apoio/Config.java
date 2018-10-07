package apoio;
// java -classpath /usr/local/lib/javacc/bin/javacc.jar javacc Compilador.jj

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectOutput;

public interface Config extends Serializable {

    /**
     *
     */
    public String NOMEARQ = Config.lerDoDisco();
    public String EXTFONT = ".spc";
    public String EXT1PASSAGEM = ".j";
    public String EXT2PASSAGEM = ".cir";

    static public void salvarEmDisco(String x) {
        File arquivo = new File("config.spc");
        try (FileOutputStream fout = new FileOutputStream(arquivo);
                ObjectOutput oos = new ObjectOutputStream(fout)) {

            oos.writeObject(x);
            oos.flush();

        } catch (Exception ex) {
            System.out.println("Arquivo não carregado, está com problema no SPC");
        }
    }

    static public String lerDoDisco(){

        String path = null;
        File arquivo = new File("config.spc");
        try (FileInputStream fin = new FileInputStream(arquivo);
                ObjectInputStream oin = new ObjectInputStream(fin)) {

            path = (String) oin.readObject();

        } catch (Exception ex) {
            System.out.println("Arquivo não carregado, está com problema no SPC");
        }
        return path;
    }

    static public ArrayList<String> lerDoDiscoMultiplos() throws FileNotFoundException {
        Scanner leitor = new Scanner(new File("config.spc"));
        ArrayList<String> linhas = new ArrayList<String>();
        while (leitor.hasNextLine()) {
            linhas.add(leitor.nextLine());
        }
        leitor.close();
        return linhas;
        //String[] vetorDeLinhas = linhas.toArray();
    }
}
