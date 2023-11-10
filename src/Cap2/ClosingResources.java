package Cap2;

import java.io.*;

public class ClosingResources {

    // try-finally - Não é mais a melhor maneira d efechar recursos
    static String firstLineOfFile() throws IOException {
        BufferedReader br = null;
                try {
                    return br.readLine();
                } finally {
                    br.close();
                }
    }

    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);

        try {
            OutputStream out = new FileOutputStream(dst);


        } finally {

        }
    }

}
