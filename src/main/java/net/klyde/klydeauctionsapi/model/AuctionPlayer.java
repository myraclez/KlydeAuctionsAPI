package net.klyde.klydeauctionsapi.model;

import java.util.UUID;

public interface AuctionPlayer {

	UUID getUUID();

	boolean isQuickBuy();

	boolean isQuickSell();

	boolean isNotifications();

	double getTotalSpent();

	double getTotalEarned();

	void setQuickSell(boolean value);

	void setQuickBuy(boolean value);

	void setNotifications(boolean value);

	void increaseTotalSpent(double amount);

	void increaseTotalEarned(double amount);
}
