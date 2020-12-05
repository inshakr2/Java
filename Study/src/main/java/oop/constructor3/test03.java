package main.java.oop.constructor3;

public class test03 {
    public static void main(String[] args) {

        Character yurin = new Character("yr", "도적");
        Character cy = new Character("cy", "궁수", 200, 999999);

        yurin.print();

        System.out.println("\n\n");
        cy.print();
    }
}
