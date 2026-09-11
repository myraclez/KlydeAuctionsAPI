package net.klyde.klydeauctionsapi.event.impl;

import net.klyde.klydeauctionsapi.event.AuctionEvent;
import net.klyde.klydeauctionsapi.model.AuctionModel;

public class AuctionCreateEvent extends AuctionEvent {

	public AuctionCreateEvent(AuctionModel auctionModel) {
		super(auctionModel);
	}

}
