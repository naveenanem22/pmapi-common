package com.pc.constants;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum SortOrder {
	ASCENDING("ascending"), DESCENDING("descending");

	private final String key;

	SortOrder(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public static SortOrder getMatchingSortOrder(String sortOrder) {
		return Stream.of(SortOrder.values()).filter(e -> {
			return e.getKey().equalsIgnoreCase(sortOrder);
		}).findFirst().get();
	}

	public static boolean contains(String sortOrder) {
		List<SortOrder> matched = Stream.of(SortOrder.values()).filter(item -> {
			return item.getKey().equalsIgnoreCase(sortOrder);
		}).collect(Collectors.toList());
		return !matched.isEmpty();
	}

}
