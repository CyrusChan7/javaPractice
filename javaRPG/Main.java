// no error handling, assume all appropriate input for all sections
// professions, abilities, and game mechanics influenced by NCSOFT's 2004 game Lineage II
// all code are original and development started on Dec. 16, 2019 by Cyrus Chan

import java.util.Scanner;   // user input library

public class Main {
    public static void main(String[] args) {

        String[] professions = {"Abyss Walker", "Moonlight Sentinel"};
        String[] monsterList = {"Brown Fox", "Elder Wolf", "Goblin"};

        System.out.println("Welcome! Please select a profession:\nPress '1' to select Abyss Walker\nPress '2' to select Moonlight Sentinel");
        Scanner userChoice = new Scanner(System.in);
        int professionChoice = userChoice.nextInt();       // user input needs to be an int so index can work
        professionChoice--;     // to match index position with professions array

        String userClass = professions[professionChoice];

        System.out.println("Congratulations! You have chosen " + userClass + " as your class.");

        // ----------------------------------------------------------------------
        
        if (userClass.equals("Abyss Walker")) {
            Character userCharacter = new Character("Abyss Walker", 80, 100, 22, 4.2);

            System.out.println("Your class " + userCharacter.getProfessionName() + " has " + userCharacter.getHitPoints() + " HP, " + userCharacter.getManaPoints() + " MP, " + userCharacter.getAttackDamage() + " attack damage (AD), and " + userCharacter.getHealthRegen() + " health regen.");

        } else if (userClass.equals("Moonlight Sentinel")) {
            Character userCharacter = new Character("Moonlight Sentinel", 120, 110, 15, 6.5);

            System.out.println("Your class " + userCharacter.getProfessionName() + " has " + userCharacter.getHitPoints() + " HP, " + userCharacter.getManaPoints() + " MP, " + userCharacter.getAttackDamage() + " attack damage (AD), and " + userCharacter.getHealthRegen() + " health regen.");
            
        }

    }
}