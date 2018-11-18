package com.company.map;

import java.awt.*;

enum BaseMapCellType {
    PLAYER,
    ENEMY,
    WALL,
    EMPTY
}

public class BaseMap {
    private BaseMapCellType[][] map;

BaseMap() { //рисовка стен                        
    map = new BaseMapCellType [10][10];
    for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map[i].length;j++) {
            if (map[i][9] == BaseMapCellType.WALL){

            }
        for (int i = 0; i < map.length; j++){
            for (int j = 0; j < map[i].length;j++){
            if (map[9][i] == BaseMapCellType.WALL){

                     }
   
    public BaseMapCellType[][] getMap() {
        return map;
    }

    public void setMap(BaseMapCellType[][] map) {
        this.map = map;
        
                      }
     void drawMap (Graphics graphics){
         for (int i = 0; i< map.length;i++){
             for (int j = 0; j < map[i].length;j++){
                 if (map [i][j] == BaseMapCellType.PLAYER){
                                 }
                            }
                        }
                     }                
                  }    
             }
        }
    }   
}
    // TODO: - realize map drawing
}
