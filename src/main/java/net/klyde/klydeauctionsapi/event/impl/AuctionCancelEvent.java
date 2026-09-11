package net.klyde.klydeauctionsapi.event.impl;

import net.klyde.klydeauctionsapi.event.AuctionEvent;
import net.klyde.klydeauctionsapi.model.AuctionModel;

public class AuctionCancelEvent extends AuctionEvent {

	public AuctionCancelEvent(AuctionModel auctionModel) {
		super(auctionModel);
	}

}
