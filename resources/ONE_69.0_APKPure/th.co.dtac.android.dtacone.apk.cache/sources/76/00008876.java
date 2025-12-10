package com.fasterxml.jackson.datatype.joda.cfg;

import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;

/* loaded from: classes3.dex */
public class FormatConfig {
    @Deprecated
    public static final JacksonJodaDateFormat DEFAULT_DATETIME_FORMAT;
    public static final JacksonJodaDateFormat DEFAULT_DATETIME_PRINTER;
    public static final JacksonJodaDateFormat DEFAULT_LOCAL_DATEONLY_FORMAT;
    public static final JacksonJodaDateFormat DEFAULT_LOCAL_DATETIME_PARSER;
    public static final JacksonJodaDateFormat DEFAULT_LOCAL_DATETIME_PRINTER;
    public static final JacksonJodaDateFormat DEFAULT_LOCAL_TIMEONLY_PARSER;
    public static final JacksonJodaDateFormat DEFAULT_LOCAL_TIMEONLY_PRINTER;
    public static final JacksonJodaPeriodFormat DEFAULT_PERIOD_FORMAT;

    /* renamed from: a */
    public static final DateTimeZone f43494a = DateTimeZone.getDefault();
    public static final JacksonJodaDateFormat DEFAULT_DATEONLY_FORMAT = m49361b(ISODateTimeFormat.date());
    public static final JacksonJodaDateFormat DEFAULT_TIMEONLY_FORMAT = m49361b(ISODateTimeFormat.time());
    public static final JacksonJodaDateFormat DEFAULT_DATETIME_PARSER = m49361b(ISODateTimeFormat.dateTimeParser());

    static {
        JacksonJodaDateFormat m49361b = m49361b(ISODateTimeFormat.dateTime());
        DEFAULT_DATETIME_PRINTER = m49361b;
        DEFAULT_DATETIME_FORMAT = m49361b;
        DEFAULT_LOCAL_DATEONLY_FORMAT = m49362a(ISODateTimeFormat.date());
        DEFAULT_LOCAL_TIMEONLY_PRINTER = m49362a(ISODateTimeFormat.time());
        DEFAULT_LOCAL_TIMEONLY_PARSER = m49362a(ISODateTimeFormat.localTimeParser());
        DEFAULT_LOCAL_DATETIME_PRINTER = m49362a(ISODateTimeFormat.dateTime());
        DEFAULT_LOCAL_DATETIME_PARSER = m49362a(ISODateTimeFormat.localDateOptionalTimeParser());
        DEFAULT_PERIOD_FORMAT = new JacksonJodaPeriodFormat(ISOPeriodFormat.standard());
    }

    /* renamed from: a */
    public static final JacksonJodaDateFormat m49362a(DateTimeFormatter dateTimeFormatter) {
        return new JacksonJodaDateFormat(dateTimeFormatter.withZone(f43494a));
    }

    /* renamed from: b */
    public static final JacksonJodaDateFormat m49361b(DateTimeFormatter dateTimeFormatter) {
        return new JacksonJodaDateFormat(dateTimeFormatter.withZoneUTC());
    }
}