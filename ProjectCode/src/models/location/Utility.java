package models.location;

import models.Player;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import gamePresenter.GameManager;
import gamePresenter.LocationManager;

public class Utility extends BuyableLocation {

	/**
	 * Constructor with given parameters
	 * @param locationId
	 * @param name
	 * @param point
	 * @param playersHere
	 * @param groupColor
	 * @param owner
	 * @param price
	 * @param currentRentValue
	 * @param mortgageValue
	 * @param breakMortgageValue
	 * @param underMortgage
	 * @param rentValues
	 */
    public Utility(int locationId, String name, Point2D point, ArrayList<Player> playersHere, GroupColor groupColor, Player owner, int price, int currentRentValue, int mortgageValue, int breakMortgageValue, boolean underMortgage, ArrayList<Integer> rentValues) {
        super(locationId, name, point, playersHere, groupColor, owner, price, currentRentValue, mortgageValue, breakMortgageValue, underMortgage, rentValues, LOCATION_TYPES.UTILITY);
    }
    /**
     * Copy Construcotr
     * @param copy
     */
    public Utility(Utility copy) {
    	super(copy);
    }
    @Override
    public void activate() {
        super.activate();
    }
    /**
     * Get rent value
     */
    @Override
    public int getRentValue() {
		int i = LocationManager.getInstance().noOfOwnedByPlayerInGroup(this.getOwner(),this.getGroupColor());
		int k = GameManager.getInstance().totalDiceResultForUtility();
		int money = this.getAllRentValues().get(i-1) * k;
		this.setCurrentRentValue(money);
		return money;
    }
}
