package net.klyde.klydeauctionsapi.model;

import java.util.UUID;

public interface AuctionPlayer {

	UUID getUUID();

	boolean isQuickBuy();

	boolean isQuickSell();

	boolean isNotifications();

	double getTotalSpent();

	double getTotalEarned();

	void increaseTotalSpent();

	void increaseTotalEarned();
}
