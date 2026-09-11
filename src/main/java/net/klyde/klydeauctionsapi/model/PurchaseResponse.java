package net.klyde.klydeauctionsapi.model;

public enum PurchaseResponse {
	SUCCESS,
	AUCTION_NOT_FOUND,
	ALREADY_SOLD,
	NOT_ENOUGH_MONEY,
	CANNOT_BUY_OWN_AUCTION,
	INVENTORY_FULL,
	FAIL_TRANSACTION,
	FAIL_OTHER
}
