package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() {
        String nom = "Albert Sola Roca";
        int edat = 22;
        String comment = "Ruben xq me abandonaste puto :v";
        try {
            comUtils.write_string_variable(2,nom);
            comUtils.write_int32(edat);
            comUtils.write_string(comment);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public String readTest() {
        String result = "";
        String nom = "";
        int edat = 0;
        String comment = "";
        try {
            nom = comUtils.read_string_variable(2);
            edat = comUtils.read_int32();
            comment= comUtils.read_string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        result += nom + " ";
        result += edat + " ";
        result += comment + " ";
        return result;
    }



}
