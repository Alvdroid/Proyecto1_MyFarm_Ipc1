/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainMenu;

import Farm.Farm;

/**
 *
 * @author alvin
 */
public class MainMenu {
    
    public static void playGame(){
    
        Farm.farm();
        Market.Market.market();
        Reports.Reports.reports();
    }
}
