package models.location;
import models.Player;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class MayfestTile extends Location{
    private int collectedTax;

    public MayfestTile(int locationId, String name, Point2D point, ArrayList<Player> playersHere, int collectedTax) {
        super(locationId, name, point, playersHere);
        this.collectedTax = collectedTax;
    }

    @Override
    public void activate() {
        super.activate();
    }

    public void addTax(int tax){
        this.collectedTax += tax;
    }

    public void giveTaxMoney(Player player){ // TODO Should not get player as param
        player.setUsableMoney(player.getUsableMoney()+this.collectedTax);
        this.collectedTax = 0;
    }
}
