package net.klyde.klydeauctionsapi.event;

import net.klyde.klydeauctionsapi.model.AuctionModel;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public abstract class AuctionEvent extends Event {

	private final AuctionModel auctionModel;

	public AuctionEvent(AuctionModel auctionModel) {
		this.auctionModel = auctionModel;
	}

	public AuctionModel getAuctionModel() {
		return auctionModel;
	}

	private static final HandlerList HANDLERS = new HandlerList();

	@Override
	public @NotNull HandlerList getHandlers() {
		return HANDLERS;
	}

	public static HandlerList getHandlerList() {
		return HANDLERS;
	}
}
