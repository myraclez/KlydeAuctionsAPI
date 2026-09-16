package net.klyde.klydeauctionsapi.service;

import net.klyde.klydeauctionsapi.model.AuctionModel;
import net.klyde.klydeauctionsapi.model.CancelResponse;
import net.klyde.klydeauctionsapi.model.PurchaseResponse;
import net.klyde.klydeauctionsapi.model.RemoveResponse;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AuctionService {

	List<AuctionModel> getActiveAuctions();

	List<AuctionModel> getActiveAuctions(String search);

	AuctionModel createAuction(UUID seller, ItemStack item, double price);

	PurchaseResponse buyAuction(UUID buyer, UUID auctionId);

	Optional<AuctionModel> getAuctionById(UUID id);

	RemoveResponse removeAuction(UUID id);

	CancelResponse cancelAuction(UUID auctionId);
}
