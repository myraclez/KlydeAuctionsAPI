package net.klyde.klydeauctionsapi;

public final class AuctionApiProvider {

	private static AuctionApi instance;

	public static AuctionApi getApi() {
		return instance;
	}

	public static void register(AuctionApi api) {
		instance = api;
	}

}
