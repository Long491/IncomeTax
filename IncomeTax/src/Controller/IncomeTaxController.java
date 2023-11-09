/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.IncomeTaxRepository;
import View.Menu;

/**
 *
 * @author Asus
 */
public class IncomeTaxController extends Menu<String> {

    static String[] mc = {"Income Tax Calculator", "Exit"};

    IncomeTaxRepository program;

    public IncomeTaxController() {
        super("\nIncome Tax Calculator", mc);
        program = new IncomeTaxRepository();

    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                program.addFamily();
                break;
            case 2:
                System.exit(0);
        }
    }
}