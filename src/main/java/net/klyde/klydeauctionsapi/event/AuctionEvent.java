package net.klyde.klydeauctionsapi.event;

import net.klyde.klydeauctionsapi.model.AuctionModel;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public abstract class AuctionEvent extends Event {

	private final AuctionModel auctionModel;

	public AuctionEvent(AuctionModel auctionModel) {
		this.auctionModel = auctionModel;
	}

	public UUID getAuctionId() {
		return auctionModel.getId();
	}

	public UUID getOwnerUuid() {
		return auctionModel.getOwner();
	}

	public ItemStack getItemCopy() {
		return auctionModel.getItem().clone();
	}

	public double getPrice() {
		return auctionModel.getPrice();
	}

	public long getCreationTimeMillis() {
		return auctionModel.getCreatedAt();
	}

	public long getExpiredMillis() {
		return auctionModel.getExpiredAt();
	}

	public AuctionModel.AuctionState getState() {
		return auctionModel.getState();
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
