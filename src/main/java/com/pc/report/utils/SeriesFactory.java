package com.pc.report.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeriesFactory {

	private static final Logger LOGGER = LoggerFactory.getLogger(SeriesFactory.class);

	public static List<LocalDateTime> getLastDaysOfMonthSeries(LocalDateTime givenDate, int numberOfMonths) {
		LOGGER.debug("Given Date: {}", givenDate);
		LOGGER.debug("Computing {} elements for the series", numberOfMonths);
		List<LocalDateTime> series = new ArrayList<LocalDateTime>();

		LocalDateTime tempSeriesItem = givenDate;
		for (int i = 0; i < numberOfMonths; i++) {
			LocalDateTime seriesItem = null;
			if (i == 0)
				seriesItem = tempSeriesItem.with(TemporalAdjusters.lastDayOfMonth());
			else
				seriesItem = tempSeriesItem.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

			series.add(seriesItem);
			tempSeriesItem = seriesItem;
		}

		LOGGER.debug("Computed series: {}", series);
		return series;
	}
	
	public static List<LocalDate> getLastDaysOfMonthSeries(LocalDate givenDate, int numberOfMonths) {
		LOGGER.debug("Given Date: {}", givenDate);
		LOGGER.debug("Computing {} elements for the series", numberOfMonths);
		List<LocalDate> series = new ArrayList<LocalDate>();

		LocalDate tempSeriesItem = givenDate;
		for (int i = 0; i < numberOfMonths; i++) {
			LocalDate seriesItem = null;
			if (i == 0)
				seriesItem = tempSeriesItem.with(TemporalAdjusters.lastDayOfMonth());
			else
				seriesItem = tempSeriesItem.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

			series.add(seriesItem);
			tempSeriesItem = seriesItem;
		}

		LOGGER.debug("Computed series: {}", series);
		return series;
	}

	public static void main(String[] args) {
		getLastDaysOfMonthSeries(LocalDateTime.now(), 6);
	}

}
