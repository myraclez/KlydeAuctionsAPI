package net.klyde.klydeauctionsapi.model;

import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public record HistoryEntry(UUID id,
						   UUID seller,
						   UUID buyer,
						   ItemStack item,
						   double amount,
						   long soldAt) {}
