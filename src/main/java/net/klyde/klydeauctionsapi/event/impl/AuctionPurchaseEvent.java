package net.klyde.klydeauctionsapi.event.impl;

import net.klyde.klydeauctionsapi.event.AuctionEvent;
import net.klyde.klydeauctionsapi.model.AuctionModel;
import net.klyde.klydeauctionsapi.model.AuctionPlayer;

public class AuctionPurchaseEvent extends AuctionEvent {

	private final AuctionPlayer buyer;

	public AuctionPurchaseEvent(AuctionModel auctionModel, AuctionPlayer buyer) {
		super(auctionModel);

		this.buyer = buyer;
	}

	AuctionPlayer getBuyer() {
		return this.buyer;
	}
}
