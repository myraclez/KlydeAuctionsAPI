package net.klyde.klydeauctionsapi.service;

import net.klyde.klydeauctionsapi.model.AuctionPlayer;

import java.util.Map;
import java.util.UUID;

public interface AuctionPlayerService {

	Map<UUID, AuctionPlayer> getAuctionPlayers();

}
