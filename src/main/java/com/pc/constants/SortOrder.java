package com.pc.constants;

import java.util.stream.Stream;

public enum SortOrder {
	ASCENDING("ascending", "ASC"), DESCENDING("descending", "DESC");

	private final String key;
	private final String value;

	SortOrder(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public static SortOrder getMatchingSortOrder(String sortOrder) {
		return Stream.of(SortOrder.values()).filter(e -> {
			return e.getKey().equalsIgnoreCase(sortOrder);
		}).findFirst().get();
	}

}
