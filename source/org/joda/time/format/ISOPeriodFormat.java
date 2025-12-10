package org.joda.time.format;

import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes5.dex */
public class ISOPeriodFormat {

    /* renamed from: a */
    public static PeriodFormatter f76286a;

    /* renamed from: b */
    public static PeriodFormatter f76287b;

    /* renamed from: c */
    public static PeriodFormatter f76288c;

    /* renamed from: d */
    public static PeriodFormatter f76289d;

    /* renamed from: e */
    public static PeriodFormatter f76290e;

    public static PeriodFormatter alternate() {
        if (f76287b == null) {
            f76287b = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendMonths().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return f76287b;
    }

    public static PeriodFormatter alternateExtended() {
        if (f76288c == null) {
            f76288c = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator(HelpFormatter.DEFAULT_OPT_PREFIX).minimumPrintedDigits(2).appendMonths().appendSeparator(HelpFormatter.DEFAULT_OPT_PREFIX).appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(":").appendMinutes().appendSeparator(":").appendSecondsWithOptionalMillis().toFormatter();
        }
        return f76288c;
    }

    public static PeriodFormatter alternateExtendedWithWeeks() {
        if (f76290e == null) {
            f76290e = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator(HelpFormatter.DEFAULT_OPT_PREFIX).minimumPrintedDigits(2).appendPrefix("W").appendWeeks().appendSeparator(HelpFormatter.DEFAULT_OPT_PREFIX).appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(":").appendMinutes().appendSeparator(":").appendSecondsWithOptionalMillis().toFormatter();
        }
        return f76290e;
    }

    public static PeriodFormatter alternateWithWeeks() {
        if (f76289d == null) {
            f76289d = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendPrefix("W").appendWeeks().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return f76289d;
    }

    public static PeriodFormatter standard() {
        if (f76286a == null) {
            f76286a = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix("W").appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter();
        }
        return f76286a;
    }
}
