import com.company.Redagavimas;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Redagavimas objektas = new Redagavimas();
        objektas.pasisveijkink();
        while (true){
            objektas.paklausk();
            objektas.nuskaityk();
        }

    }

    public void nuspresk() {

    }

    public void istrinti() {
        System.out.println("Pasirinkote istrinti");
    }

    public void ivesti() {
        System.out.println("Pasirinkote ivesti");
    }
}



