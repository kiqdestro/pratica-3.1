
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Pratica31 {
    private static String meuNome;
    private static Date inicio, fim;
    private static GregorianCalendar dataNascimento;
    
    public static void main(String[] args){
        inicio = new Date();
        dataNascimento = new GregorianCalendar (1996, Calendar.AUGUST, 03);
        meuNome = "Caique Destro";
        String n = "";
        GregorianCalendar dataAtual;
        
        for (int i = 0; i < meuNome.length(); i++) {
            n += Character.toUpperCase(meuNome.charAt(i));
            
        }
        meuNome = n;
        System.out.println(meuNome);
        n = "";
        for (int i = 0; i < meuNome.length(); i++) {
            if (i==7){
                n += meuNome.charAt(i);
            }
            if (i>7){
            n += Character.toLowerCase(meuNome.charAt(i));
            }
        }
            n += ", ";
            n += meuNome.charAt(0);
            n += ".";
        System.out.println(n);

        dataAtual = new GregorianCalendar();
        long diferenca = dataAtual.getTimeInMillis() - dataNascimento.getTimeInMillis();
        diferenca = diferenca/86400000;
        System.out.println(diferenca);
        fim = new Date();
        long tempoDecorrido = fim.getTime() - inicio.getTime();
        System.out.println(tempoDecorrido);
    }
}