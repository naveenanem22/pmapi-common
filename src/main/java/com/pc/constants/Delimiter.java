package com.pc.constants;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Delimiter {
	COMMA(","), COLON(":");

	private final String key;

	Delimiter(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public static Delimiter getMatchingSortOrder(String delimiter) {
		return Stream.of(Delimiter.values()).filter(e -> {
			return e.getKey().equalsIgnoreCase(delimiter);
		}).findFirst().get();
	}

	public static boolean contains(String sortOrder) {
		List<Delimiter> matched = Stream.of(Delimiter.values()).filter(item -> {
			return item.getKey().equalsIgnoreCase(sortOrder);
		}).collect(Collectors.toList());
		return !matched.isEmpty();
	}

}
