package net.klyde.klydeauctionsapi.service;

import java.util.UUID;

public interface AuctionPlayerService {

	boolean hasQuickBuyEnabled(UUID uuid);

	boolean hasQuickSellEnabled(UUID uuid);

	double getTotalSpent(UUID uuid);

	double getTotalEarned(UUID uuid);

	boolean hasAuctionNotificationsEnabled(UUID uuid);

	void setQuickSell(UUID uuid, boolean value);

	void setQuickBuy(UUID uuid, boolean value);

	void increaseTotalSpent(UUID uuid, double value);

	void increaseTotalEarned(UUID uuid, double value);

}
