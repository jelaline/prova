/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
       Medico medico = new Medico("343334", "34334343434", "334345454", "645453", Setor.SAUDE, 30000, LocalDate.of(1994, Month.FEBRUARY, 21), Genero.MASCULINO, "Henri", "71966636363", "henri@gmail.com", 
       new Endereco("rua antonio viana", "43", "rua", "354545353", "Salvador", UnidadeFederativa.BAHIA));
       
       Cliente cliente = new Cliente("6464634", LocalDate.of(1998, Month.NOVEMBER, 27), Genero.FEMININO, "Jessica", "71986654321", "jessica@gmail.com", 
       new Endereco("Rua da Penha", "43", "Avenida", "636363534", "Santos", UnidadeFederativa.SAO_PAULO));
       
       Motoboy motoboy = new Motoboy("33433545345", "12345678906", "5334634373", "5336643654", Setor.OPERACOES, 500, LocalDate.of(2000, Month.MARCH, 23), Genero.MASCULINO, "Bruno", "719863453434", "bruno@gmail.com", 
       new Endereco("rua jardim", "65", "avenida", "56367474", "Alagoinhas", UnidadeFederativa.BAHIA));
       
       Advogado advogado = new Advogado("6767436746", "6363636737344", "774747474", "53543536", Setor.ENGENHARIA, 21000, LocalDate.of(1996, Month.JANUARY, 22), Genero.FEMININO, "Camila", "71985563216", "camila@gmail.com", 
       new Endereco("rua margarida", "66", "prédio", "654636464", "Rio", UnidadeFederativa.RIO_DE_JANEIRO));
       
        System.out.println("");
       System.out.println("Médico: ");
        System.out.println(medico.toString());
        
        
        System.out.println("\nCliente: ");
        System.out.println(cliente.toString());
        
        System.out.println("\nMotoboy: ");
        System.out.println(motoboy.toString());
        
        System.out.println("\nAdvogado: ");
        System.out.println(advogado.toString());
    }
    
    
}
