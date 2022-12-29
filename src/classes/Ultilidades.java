package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Ultilidades {
    public static boolean isNumeric (String Numero){
    try {
        Integer.parseInt(Numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public double converterVirgula (String pValor) {
        String retorno = "";
        for (int i = 0; i < pValor.length(); i++){
            if (pValor.charAt(i) == ',') {
                retorno += '.';
            } else{
                retorno += pValor.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }

    public static Date StringToDate (String Data){
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
        Date x = null;
        try {
            x = formatotexto.parse(Data);
        } catch (ParseException ex) {
        }
        return x;
    }
    
    public static String formatDate(Date Data){
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatotexto.format(Data);
    }
    
    public static double objectToInt(Object Obj){
        double NumInt = Double.parseDouble(objectToString(Obj));
        return NumInt;
    }
    
    public static String objectToString(Object Obj){
        String Str = "";
        if (Obj != null){
            Str = Obj.toString();
        }
        return Str;
    }
}