package com.mycompany.enemyshipfungame;
import java.util.Scanner;


public class EnemyShipGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        EnemyShip theEnemy;
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        System.out.println("What type of Ship Do You Want to Fight? (U or R or B)");
        
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }
        
        theEnemy = shipFactory.makeEnemyShip(enemyShipOption);
        
        playGame(theEnemy);
        
    }
    
    public static void playGame(EnemyShip anEnemyShip){
        if(anEnemyShip != null){
            anEnemyShip.displayEnemyShip();
            anEnemyShip.enemyShipShoots();
        }
    }
    
}
