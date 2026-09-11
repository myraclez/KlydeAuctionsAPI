package net.klyde.klydeauctionsapi.service;

import net.klyde.klydeauctionsapi.model.HistoryEntry;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.UUID;

public interface AuctionHistoryService {

	List<HistoryEntry> getAuctionHistory(UUID uuid);

	HistoryEntry createHistoryEntry(UUID seller, UUID buyer, ItemStack item, double price);
}
