package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Redagavimas {
    public Redagavimas() {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    "");


            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `studentas`");

        } catch (Exception error) {

        }
    }

    public void pasisveijkink() {
    }

    public void paklausk() {
        System.out.println("Norite Istrinti ar Ivesti Duomenis");
    }

    public void nuskaityk() {
        Scanner sc = new Scanner(System.in);
        int pasirinkimas = sc.nextInt();
        switch (pasirinkimas) {
            case 1:
                trinti();
                break;
            case 2:
                prideti();
                break;

        }
    }

    public void trinti() {
    }

    public void prideti() {
    }
}
