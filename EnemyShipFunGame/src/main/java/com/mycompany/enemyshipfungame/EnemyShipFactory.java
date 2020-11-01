package com.mycompany.enemyshipfungame;


public class EnemyShipFactory {
    
    public EnemyShip makeEnemyShip(String ShipChoice){
        EnemyShip preferredEnemyShip = null;
        
        if(ShipChoice.equals("U")){
            preferredEnemyShip =  new UFOEnemyShip(); 
        }
        
        if(ShipChoice.equals("R")){
            preferredEnemyShip = new RocketEnemyShip();
        }
        
        if(ShipChoice.equals("B")){
            preferredEnemyShip = new bigUFOEnemyShip();
        }
        
        return preferredEnemyShip;
    }
    
}
