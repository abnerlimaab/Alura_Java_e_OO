package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        // Fluxo de entrada com um arquivo
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis, "UTF-8"); // Transforma os Bytes em caracteres
        BufferedReader br = new BufferedReader(isr); // Junta os caractéres linha a linha

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
