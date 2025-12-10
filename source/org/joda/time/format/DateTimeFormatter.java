package org.joda.time.format;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/* loaded from: classes5.dex */
public class DateTimeFormatter {

    /* renamed from: a */
    public final InterfaceC18556Uf0 f76166a;

    /* renamed from: b */
    public final InterfaceC18428Sf0 f76167b;

    /* renamed from: c */
    public final Locale f76168c;

    /* renamed from: d */
    public final boolean f76169d;

    /* renamed from: e */
    public final Chronology f76170e;

    /* renamed from: f */
    public final DateTimeZone f76171f;

    /* renamed from: g */
    public final Integer f76172g;

    /* renamed from: h */
    public final int f76173h;

    public DateTimeFormatter(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this(C1809ZD.m65258b(dateTimePrinter), C1739YD.m65384b(dateTimeParser));
    }

    /* renamed from: a */
    public InterfaceC18428Sf0 m24029a() {
        return this.f76167b;
    }

    /* renamed from: b */
    public InterfaceC18556Uf0 m24028b() {
        return this.f76166a;
    }

    /* renamed from: c */
    public final void m24027c(Appendable appendable, long j, Chronology chronology) {
        InterfaceC18556Uf0 m24025e = m24025e();
        Chronology m24024f = m24024f(chronology);
        DateTimeZone zone = m24024f.getZone();
        int offset = zone.getOffset(j);
        long j2 = offset;
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j2 ^ j) >= 0) {
            zone = DateTimeZone.UTC;
            offset = 0;
            j3 = j;
        }
        m24025e.printTo(appendable, j3, m24024f.withUTC(), offset, zone, this.f76168c);
    }

    /* renamed from: d */
    public final InterfaceC18428Sf0 m24026d() {
        InterfaceC18428Sf0 interfaceC18428Sf0 = this.f76167b;
        if (interfaceC18428Sf0 != null) {
            return interfaceC18428Sf0;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    /* renamed from: e */
    public final InterfaceC18556Uf0 m24025e() {
        InterfaceC18556Uf0 interfaceC18556Uf0 = this.f76166a;
        if (interfaceC18556Uf0 != null) {
            return interfaceC18556Uf0;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    /* renamed from: f */
    public final Chronology m24024f(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        Chronology chronology3 = this.f76170e;
        if (chronology3 != null) {
            chronology2 = chronology3;
        }
        DateTimeZone dateTimeZone = this.f76171f;
        if (dateTimeZone != null) {
            return chronology2.withZone(dateTimeZone);
        }
        return chronology2;
    }

    @Deprecated
    public Chronology getChronolgy() {
        return this.f76170e;
    }

    public Chronology getChronology() {
        return this.f76170e;
    }

    public int getDefaultYear() {
        return this.f76173h;
    }

    public Locale getLocale() {
        return this.f76168c;
    }

    public DateTimeParser getParser() {
        return C18492Tf0.m66185a(this.f76167b);
    }

    public Integer getPivotYear() {
        return this.f76172g;
    }

    public DateTimePrinter getPrinter() {
        return C18620Vf0.m65750a(this.f76166a);
    }

    public DateTimeZone getZone() {
        return this.f76171f;
    }

    public boolean isOffsetParsed() {
        return this.f76169d;
    }

    public boolean isParser() {
        if (this.f76167b != null) {
            return true;
        }
        return false;
    }

    public boolean isPrinter() {
        if (this.f76166a != null) {
            return true;
        }
        return false;
    }

    public DateTime parseDateTime(String str) {
        InterfaceC18428Sf0 m24026d = m24026d();
        Chronology m24024f = m24024f(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, m24024f, this.f76168c, this.f76172g, this.f76173h);
        int parseInto = m24026d.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (this.f76169d && dateTimeParserBucket.getOffsetInteger() != null) {
                    m24024f = m24024f.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                } else if (dateTimeParserBucket.getZone() != null) {
                    m24024f = m24024f.withZone(dateTimeParserBucket.getZone());
                }
                DateTime dateTime = new DateTime(computeMillis, m24024f);
                DateTimeZone dateTimeZone = this.f76171f;
                if (dateTimeZone != null) {
                    return dateTime.withZone(dateTimeZone);
                }
                return dateTime;
            }
        } else {
            parseInto = ~parseInto;
        }
        throw new IllegalArgumentException(FormatUtils.m23981a(str, parseInto));
    }

    public int parseInto(ReadWritableInstant readWritableInstant, String str, int i) {
        InterfaceC18428Sf0 m24026d = m24026d();
        if (readWritableInstant != null) {
            long millis = readWritableInstant.getMillis();
            Chronology chronology = readWritableInstant.getChronology();
            int i2 = DateTimeUtils.getChronology(chronology).year().get(millis);
            long offset = millis + chronology.getZone().getOffset(millis);
            Chronology m24024f = m24024f(chronology);
            DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(offset, m24024f, this.f76168c, this.f76172g, i2);
            int parseInto = m24026d.parseInto(dateTimeParserBucket, str, i);
            readWritableInstant.setMillis(dateTimeParserBucket.computeMillis(false, str));
            if (this.f76169d && dateTimeParserBucket.getOffsetInteger() != null) {
                m24024f = m24024f.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                m24024f = m24024f.withZone(dateTimeParserBucket.getZone());
            }
            readWritableInstant.setChronology(m24024f);
            DateTimeZone dateTimeZone = this.f76171f;
            if (dateTimeZone != null) {
                readWritableInstant.setZone(dateTimeZone);
            }
            return parseInto;
        }
        throw new IllegalArgumentException("Instant must not be null");
    }

    public LocalDate parseLocalDate(String str) {
        return parseLocalDateTime(str).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String str) {
        InterfaceC18428Sf0 m24026d = m24026d();
        Chronology withUTC = m24024f(null).withUTC();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, withUTC, this.f76168c, this.f76172g, this.f76173h);
        int parseInto = m24026d.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (dateTimeParserBucket.getOffsetInteger() != null) {
                    withUTC = withUTC.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                } else if (dateTimeParserBucket.getZone() != null) {
                    withUTC = withUTC.withZone(dateTimeParserBucket.getZone());
                }
                return new LocalDateTime(computeMillis, withUTC);
            }
        } else {
            parseInto = ~parseInto;
        }
        throw new IllegalArgumentException(FormatUtils.m23981a(str, parseInto));
    }

    public LocalTime parseLocalTime(String str) {
        return parseLocalDateTime(str).toLocalTime();
    }

    public long parseMillis(String str) {
        return new DateTimeParserBucket(0L, m24024f(this.f76170e), this.f76168c, this.f76172g, this.f76173h).m23989k(m24026d(), str);
    }

    public MutableDateTime parseMutableDateTime(String str) {
        InterfaceC18428Sf0 m24026d = m24026d();
        Chronology m24024f = m24024f(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, m24024f, this.f76168c, this.f76172g, this.f76173h);
        int parseInto = m24026d.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (this.f76169d && dateTimeParserBucket.getOffsetInteger() != null) {
                    m24024f = m24024f.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
                } else if (dateTimeParserBucket.getZone() != null) {
                    m24024f = m24024f.withZone(dateTimeParserBucket.getZone());
                }
                MutableDateTime mutableDateTime = new MutableDateTime(computeMillis, m24024f);
                DateTimeZone dateTimeZone = this.f76171f;
                if (dateTimeZone != null) {
                    mutableDateTime.setZone(dateTimeZone);
                }
                return mutableDateTime;
            }
        } else {
            parseInto = ~parseInto;
        }
        throw new IllegalArgumentException(FormatUtils.m23981a(str, parseInto));
    }

    public String print(ReadableInstant readableInstant) {
        StringBuilder sb = new StringBuilder(m24025e().estimatePrintedLength());
        try {
            printTo((Appendable) sb, readableInstant);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(StringBuffer stringBuffer, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) stringBuffer, readableInstant);
        } catch (IOException unused) {
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        if (this.f76170e == chronology) {
            return this;
        }
        return new DateTimeFormatter(this.f76166a, this.f76167b, this.f76168c, this.f76169d, chronology, this.f76171f, this.f76172g, this.f76173h);
    }

    public DateTimeFormatter withDefaultYear(int i) {
        return new DateTimeFormatter(this.f76166a, this.f76167b, this.f76168c, this.f76169d, this.f76170e, this.f76171f, this.f76172g, i);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (locale != getLocale() && (locale == null || !locale.equals(getLocale()))) {
            return new DateTimeFormatter(this.f76166a, this.f76167b, locale, this.f76169d, this.f76170e, this.f76171f, this.f76172g, this.f76173h);
        }
        return this;
    }

    public DateTimeFormatter withOffsetParsed() {
        if (this.f76169d) {
            return this;
        }
        return new DateTimeFormatter(this.f76166a, this.f76167b, this.f76168c, true, this.f76170e, null, this.f76172g, this.f76173h);
    }

    public DateTimeFormatter withPivotYear(Integer num) {
        Integer num2 = this.f76172g;
        return (num2 == num || (num2 != null && num2.equals(num))) ? this : new DateTimeFormatter(this.f76166a, this.f76167b, this.f76168c, this.f76169d, this.f76170e, this.f76171f, num, this.f76173h);
    }

    public DateTimeFormatter withZone(DateTimeZone dateTimeZone) {
        if (this.f76171f == dateTimeZone) {
            return this;
        }
        return new DateTimeFormatter(this.f76166a, this.f76167b, this.f76168c, false, this.f76170e, dateTimeZone, this.f76172g, this.f76173h);
    }

    public DateTimeFormatter withZoneUTC() {
        return withZone(DateTimeZone.UTC);
    }

    public DateTimeFormatter(InterfaceC18556Uf0 interfaceC18556Uf0, InterfaceC18428Sf0 interfaceC18428Sf0) {
        this.f76166a = interfaceC18556Uf0;
        this.f76167b = interfaceC18428Sf0;
        this.f76168c = null;
        this.f76169d = false;
        this.f76170e = null;
        this.f76171f = null;
        this.f76172g = null;
        this.f76173h = Constants.MAX_URL_LENGTH;
    }

    public void printTo(StringBuilder sb, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) sb, readableInstant);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, ReadableInstant readableInstant) throws IOException {
        printTo((Appendable) writer, readableInstant);
    }

    public DateTimeFormatter withPivotYear(int i) {
        return withPivotYear(Integer.valueOf(i));
    }

    public String print(long j) {
        StringBuilder sb = new StringBuilder(m24025e().estimatePrintedLength());
        try {
            printTo((Appendable) sb, j);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(Appendable appendable, ReadableInstant readableInstant) throws IOException {
        m24027c(appendable, DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantChronology(readableInstant));
    }

    public String print(ReadablePartial readablePartial) {
        StringBuilder sb = new StringBuilder(m24025e().estimatePrintedLength());
        try {
            printTo((Appendable) sb, readablePartial);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public void printTo(StringBuffer stringBuffer, long j) {
        try {
            printTo((Appendable) stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb, long j) {
        try {
            printTo((Appendable) sb, j);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, long j) throws IOException {
        printTo((Appendable) writer, j);
    }

    public void printTo(Appendable appendable, long j) throws IOException {
        m24027c(appendable, j, null);
    }

    public DateTimeFormatter(InterfaceC18556Uf0 interfaceC18556Uf0, InterfaceC18428Sf0 interfaceC18428Sf0, Locale locale, boolean z, Chronology chronology, DateTimeZone dateTimeZone, Integer num, int i) {
        this.f76166a = interfaceC18556Uf0;
        this.f76167b = interfaceC18428Sf0;
        this.f76168c = locale;
        this.f76169d = z;
        this.f76170e = chronology;
        this.f76171f = dateTimeZone;
        this.f76172g = num;
        this.f76173h = i;
    }

    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) stringBuffer, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) sb, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, ReadablePartial readablePartial) throws IOException {
        printTo((Appendable) writer, readablePartial);
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial) throws IOException {
        InterfaceC18556Uf0 m24025e = m24025e();
        if (readablePartial != null) {
            m24025e.printTo(appendable, readablePartial, this.f76168c);
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }
}
