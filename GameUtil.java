package de.hrw.progra2.assignment4;

import java.util.ArrayList;
import java.util.List;

public class GameUtil {

    /**
     * Lets a being eat some stuff.
     *
     * @param being being
     * @param stuff list of objects, only edible objects are actually eaten
     */
    public static void eatStuff(AbstractBeing being, Object[] stuff) {
        //   for(stuff : CanBeEaten){
        return;
    }


    /**
     * Returns all object in a world that can be put into an inventory.
     *
     * @param world world
     * @return array of elements
     */
    public static AbstractGameElement[] getPotentialInventoryItems(World world) {
       /* AbstractGameElement[] abstractGameElements = new AbstractGameElement[];
        for(AbstractGameElement : world){
            int i++;
             if(world instanceof CanBeCarriedInInventory){
                  abstractGameElements[i] = ;
              }
         }*/

        return null;
    }

    /**
     * Compute the monthly revenue that this world generates.
     *
     * @param world world
     * @return monthly revenue
     */
    public static double getMonthlyProfit(World world) {
        double Profit = 0;
      /*  for(AbstractGameElement abstractGameElement : world) {
            Profit++;
                if(abstractGameElement instanceof PayingCustomerPlayer){
                    inventory items
                }
            }*/

        return Profit;
    }
}

