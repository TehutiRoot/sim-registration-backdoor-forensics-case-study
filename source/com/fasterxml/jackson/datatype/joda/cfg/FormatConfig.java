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
    public static final DateTimeZone f43482a = DateTimeZone.getDefault();
    public static final JacksonJodaDateFormat DEFAULT_DATEONLY_FORMAT = m49364b(ISODateTimeFormat.date());
    public static final JacksonJodaDateFormat DEFAULT_TIMEONLY_FORMAT = m49364b(ISODateTimeFormat.time());
    public static final JacksonJodaDateFormat DEFAULT_DATETIME_PARSER = m49364b(ISODateTimeFormat.dateTimeParser());

    static {
        JacksonJodaDateFormat m49364b = m49364b(ISODateTimeFormat.dateTime());
        DEFAULT_DATETIME_PRINTER = m49364b;
        DEFAULT_DATETIME_FORMAT = m49364b;
        DEFAULT_LOCAL_DATEONLY_FORMAT = m49365a(ISODateTimeFormat.date());
        DEFAULT_LOCAL_TIMEONLY_PRINTER = m49365a(ISODateTimeFormat.time());
        DEFAULT_LOCAL_TIMEONLY_PARSER = m49365a(ISODateTimeFormat.localTimeParser());
        DEFAULT_LOCAL_DATETIME_PRINTER = m49365a(ISODateTimeFormat.dateTime());
        DEFAULT_LOCAL_DATETIME_PARSER = m49365a(ISODateTimeFormat.localDateOptionalTimeParser());
        DEFAULT_PERIOD_FORMAT = new JacksonJodaPeriodFormat(ISOPeriodFormat.standard());
    }

    /* renamed from: a */
    public static final JacksonJodaDateFormat m49365a(DateTimeFormatter dateTimeFormatter) {
        return new JacksonJodaDateFormat(dateTimeFormatter.withZone(f43482a));
    }

    /* renamed from: b */
    public static final JacksonJodaDateFormat m49364b(DateTimeFormatter dateTimeFormatter) {
        return new JacksonJodaDateFormat(dateTimeFormatter.withZoneUTC());
    }
}
