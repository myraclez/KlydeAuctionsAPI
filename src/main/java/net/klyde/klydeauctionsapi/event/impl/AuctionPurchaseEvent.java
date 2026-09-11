package net.klyde.klydeauctionsapi.event.impl;

import net.klyde.klydeauctionsapi.event.AuctionEvent;
import net.klyde.klydeauctionsapi.model.AuctionModel;

public class AuctionPurchaseEvent extends AuctionEvent {

	public AuctionPurchaseEvent(AuctionModel auctionModel) {
		super(auctionModel);
	}

}
