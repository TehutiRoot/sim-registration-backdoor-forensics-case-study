package p000;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.convert.AbstractConverter;
import org.joda.time.convert.DurationConverter;
import org.joda.time.convert.InstantConverter;
import org.joda.time.convert.IntervalConverter;
import org.joda.time.convert.PartialConverter;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* renamed from: TM1 */
/* loaded from: classes5.dex */
public class TM1 extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {

    /* renamed from: a */
    public static final TM1 f6002a = new TM1();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        long parseLong;
        long j;
        long j2;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i = length - 1;
            if (str.charAt(i) == 'S' || str.charAt(i) == 's') {
                String substring = str.substring(2, i);
                int i2 = 0;
                int i3 = -1;
                for (int i4 = 0; i4 < substring.length(); i4++) {
                    if (substring.charAt(i4) < '0' || substring.charAt(i4) > '9') {
                        if (i4 == 0 && substring.charAt(0) == '-') {
                            i2 = 1;
                        } else if (i4 > i2 && substring.charAt(i4) == '.' && i3 == -1) {
                            i3 = i4;
                        } else {
                            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
                        }
                    }
                }
                if (i3 > 0) {
                    j2 = Long.parseLong(substring.substring(i2, i3));
                    String substring2 = substring.substring(i3 + 1);
                    if (substring2.length() != 3) {
                        substring2 = (substring2 + "000").substring(0, 3);
                    }
                    j = Integer.parseInt(substring2);
                } else {
                    if (i2 != 0) {
                        parseLong = Long.parseLong(substring.substring(i2, substring.length()));
                    } else {
                        parseLong = Long.parseLong(substring);
                    }
                    j = 0;
                    j2 = parseLong;
                }
                if (i2 != 0) {
                    return FieldUtils.safeAdd(FieldUtils.safeMultiply(-j2, 1000), -j);
                }
                return FieldUtils.safeAdd(FieldUtils.safeMultiply(j2, 1000), j);
            }
        }
        throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ISODateTimeFormat.dateTimeParser().withChronology(chronology).parseMillis((String) obj);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter.getZone() != null) {
            chronology = chronology.withZone(dateTimeFormatter.getZone());
        }
        return chronology.get(readablePartial, dateTimeFormatter.withChronology(chronology).parseMillis((String) obj));
    }

    @Override // org.joda.time.convert.Converter
    public Class getSupportedType() {
        return String.class;
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        String str = (String) obj;
        PeriodFormatter standard = ISOPeriodFormat.standard();
        readWritablePeriod.clear();
        int parseInto = standard.parseInto(readWritablePeriod, str, 0);
        if (parseInto < str.length()) {
            if (parseInto < 0) {
                standard.withParseType(readWritablePeriod.getPeriodType()).parseMutablePeriod(str);
            }
            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
        }
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        Period parsePeriod;
        long j;
        long add;
        String str = (String) obj;
        int indexOf = str.indexOf(47);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            if (substring.length() > 0) {
                String substring2 = str.substring(indexOf + 1);
                if (substring2.length() > 0) {
                    DateTimeFormatter withChronology = ISODateTimeFormat.dateTimeParser().withChronology(chronology);
                    PeriodFormatter standard = ISOPeriodFormat.standard();
                    char charAt = substring.charAt(0);
                    Chronology chronology2 = null;
                    if (charAt != 'P' && charAt != 'p') {
                        DateTime parseDateTime = withChronology.parseDateTime(substring);
                        j = parseDateTime.getMillis();
                        chronology2 = parseDateTime.getChronology();
                        parsePeriod = null;
                    } else {
                        parsePeriod = standard.withParseType(getPeriodType(substring)).parsePeriod(substring);
                        j = 0;
                    }
                    char charAt2 = substring2.charAt(0);
                    if (charAt2 != 'P' && charAt2 != 'p') {
                        DateTime parseDateTime2 = withChronology.parseDateTime(substring2);
                        add = parseDateTime2.getMillis();
                        if (chronology2 == null) {
                            chronology2 = parseDateTime2.getChronology();
                        }
                        if (chronology != null) {
                            chronology2 = chronology;
                        }
                        if (parsePeriod != null) {
                            j = chronology2.add(parsePeriod, add, -1);
                        }
                    } else if (parsePeriod == null) {
                        Period parsePeriod2 = standard.withParseType(getPeriodType(substring2)).parsePeriod(substring2);
                        if (chronology != null) {
                            chronology2 = chronology;
                        }
                        add = chronology2.add(parsePeriod2, j, 1);
                    } else {
                        throw new IllegalArgumentException("Interval composed of two durations: " + str);
                    }
                    readWritableInterval.setInterval(j, add);
                    readWritableInterval.setChronology(chronology2);
                    return;
                }
                throw new IllegalArgumentException("Format invalid: " + str);
            }
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        throw new IllegalArgumentException("Format requires a '/' separator: " + str);
    }
}
