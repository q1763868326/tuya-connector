package com.tuya.topfunc.core.func;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public interface DateFunc extends ObjectFunc {
    String DEFAULT_DATE_PATTERN = "uuuu-MM-dd";
    String DEFAULT_DATE_TIME_PATTERN = "uuuu-MM-dd HH:mm:ss";
    String DEFAULT_TIME_PATTERN = "HH:mm:ss";

    //format
    default String format(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(DEFAULT_DATE_PATTERN));
    }

    default String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    default String format(LocalDateTime date) {
        return date.format(DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_PATTERN));
    }

    default String format(LocalDateTime date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
    default String format(LocalTime date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
    default String format(LocalTime date) {
        return date.format(DateTimeFormatter.ofPattern(DEFAULT_TIME_PATTERN));
    }

    default String format(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_PATTERN));
    }

    default String format(Date date, String pattern) {
        return date.toInstant().atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(pattern));
    }

    //toLocalDate
    default LocalDate toLocalDate(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(DEFAULT_DATE_PATTERN));
    }

    default LocalDate toLocalDate(String date, String pattern) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    default LocalDate toLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    //toLocalDateTime
    default LocalDateTime toLocalDateTime(String date) {
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_PATTERN));
    }

    default LocalDateTime toLocalDateTime(String date, String pattern) {
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern(pattern));
    }

    default LocalDateTime toLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    //toDate
    default Date toDate(String date) {
        return toDate(toLocalDateTime(date));
    }

    default Date toDate(String date, String pattern) {
        return toDate(toLocalDateTime(date, pattern));
    }

    default Date toDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    default Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
