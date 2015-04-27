import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author askoda
 */
public class Pratica31 {
    private static String meuNome = "Caique Destro";
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1996, 7, 03);
    private static Date inicio, fim;
    
    public static void main(String[] args) {
        inicio = new Date();
        
        String n;
        n = meuNome.toUpperCase();
        
        System.out.println(n);
        
        String m;
        
        m = meuNome.substring(7, 8).toUpperCase() +
                meuNome.substring(8, 13).toLowerCase() + ", "
                + meuNome.substring(0, 1).toUpperCase() + ". ";
        
        System.out.println(m + "\n");
        
        long dias;
        
        dias = (inicio.getTime() - dataNascimento.getTimeInMillis())
        /(86400000);
        
        System.out.println(dias);
        
        fim = new Date();
        
        long tempo = fim.getTime() - inicio.getTime();
        
        System.out.println(tempo);
        
    }
}