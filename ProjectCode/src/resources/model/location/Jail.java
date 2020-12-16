package resources.model.location;

import resources.Player;

import java.util.ArrayList;

public class Jail extends Location{
    private ArrayList<Player> prisoners;

    Jail(){

    }

    @Override
    public void activate() {
        super.activate();
    }

    public void freePlayer(Player player){
        for (int i = 0; i < prisoners.size(); i++){
            if (prisoners.get(i).equals(player)){
                prisoners.remove(i);
                return;
            }
        }
    }

    public void arrestPlayer(Player player){
        prisoners.add(player);
    }
}