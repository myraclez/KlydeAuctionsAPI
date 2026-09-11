package net.klyde.klydeauctionsapi;

import net.klyde.klydeauctionsapi.service.AuctionHistoryService;
import net.klyde.klydeauctionsapi.service.AuctionPlayerService;
import net.klyde.klydeauctionsapi.service.AuctionService;

public interface AuctionApi {

	static AuctionApi getInstance() {
		return AuctionApiProvider.getApi();
	}

	AuctionService getAuctionService();
	AuctionPlayerService getAuctionPlayerService();
	AuctionHistoryService getAuctionHistoryService();
}
