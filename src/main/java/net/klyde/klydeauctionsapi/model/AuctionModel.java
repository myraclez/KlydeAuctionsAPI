package net.klyde.klydeauctionsapi.model;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public interface AuctionModel {

	UUID getId();
	UUID getOwner();
	ItemStack getItem();
	double getPrice();
	long getCreatedAt();
	long getExpiredAt();
	AuctionState getState();

	enum AuctionState {
		ACTIVE,
		EXPIRED,
		SOLD
	}
}
