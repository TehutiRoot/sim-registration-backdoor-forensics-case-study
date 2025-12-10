package org.joda.time;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes5.dex */
public class DateTimeUtils {

    /* renamed from: a */
    public static final C12974c f76091a;

    /* renamed from: b */
    public static volatile MillisProvider f76092b;

    /* renamed from: c */
    public static final AtomicReference f76093c;

    /* loaded from: classes5.dex */
    public interface MillisProvider {
        long getMillis();
    }

    /* renamed from: org.joda.time.DateTimeUtils$a */
    /* loaded from: classes5.dex */
    public static class C12972a implements MillisProvider {

        /* renamed from: a */
        public final long f76094a;

        public C12972a(long j) {
            this.f76094a = j;
        }

        @Override // org.joda.time.DateTimeUtils.MillisProvider
        public long getMillis() {
            return this.f76094a;
        }
    }

    /* renamed from: org.joda.time.DateTimeUtils$b */
    /* loaded from: classes5.dex */
    public static class C12973b implements MillisProvider {

        /* renamed from: a */
        public final long f76095a;

        public C12973b(long j) {
            this.f76095a = j;
        }

        @Override // org.joda.time.DateTimeUtils.MillisProvider
        public long getMillis() {
            return System.currentTimeMillis() + this.f76095a;
        }
    }

    /* renamed from: org.joda.time.DateTimeUtils$c */
    /* loaded from: classes5.dex */
    public static class C12974c implements MillisProvider {
        @Override // org.joda.time.DateTimeUtils.MillisProvider
        public long getMillis() {
            return System.currentTimeMillis();
        }
    }

    static {
        C12974c c12974c = new C12974c();
        f76091a = c12974c;
        f76092b = c12974c;
        f76093c = new AtomicReference();
    }

    /* renamed from: a */
    public static Map m24057a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        linkedHashMap.put("UT", dateTimeZone);
        linkedHashMap.put("UTC", dateTimeZone);
        linkedHashMap.put("GMT", dateTimeZone);
        m24055c(linkedHashMap, "EST", "America/New_York");
        m24055c(linkedHashMap, "EDT", "America/New_York");
        m24055c(linkedHashMap, "CST", "America/Chicago");
        m24055c(linkedHashMap, "CDT", "America/Chicago");
        m24055c(linkedHashMap, "MST", "America/Denver");
        m24055c(linkedHashMap, "MDT", "America/Denver");
        m24055c(linkedHashMap, "PST", "America/Los_Angeles");
        m24055c(linkedHashMap, "PDT", "America/Los_Angeles");
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: b */
    public static void m24056b() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("CurrentTime.setProvider"));
        }
    }

    /* renamed from: c */
    public static void m24055c(Map map, String str, String str2) {
        try {
            map.put(str, DateTimeZone.forID(str2));
        } catch (RuntimeException unused) {
        }
    }

    public static final long currentTimeMillis() {
        return f76092b.getMillis();
    }

    public static final long fromJulianDay(double d) {
        return (long) ((d - 2440587.5d) * 8.64E7d);
    }

    public static final Chronology getChronology(Chronology chronology) {
        if (chronology == null) {
            return ISOChronology.getInstance();
        }
        return chronology;
    }

    public static final DateFormatSymbols getDateFormatSymbols(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final Map<String, DateTimeZone> getDefaultTimeZoneNames() {
        AtomicReference atomicReference = f76093c;
        Map<String, DateTimeZone> map = (Map) atomicReference.get();
        if (map == null) {
            Map<String, DateTimeZone> m24057a = m24057a();
            if (!AbstractC17300An1.m69050a(atomicReference, null, m24057a)) {
                return (Map) atomicReference.get();
            }
            return m24057a;
        }
        return map;
    }

    public static final long getDurationMillis(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            return 0L;
        }
        return readableDuration.getMillis();
    }

    public static final Chronology getInstantChronology(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return ISOChronology.getInstance();
        }
        Chronology chronology = readableInstant.getChronology();
        if (chronology == null) {
            return ISOChronology.getInstance();
        }
        return chronology;
    }

    public static final long getInstantMillis(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return currentTimeMillis();
        }
        return readableInstant.getMillis();
    }

    public static final Chronology getIntervalChronology(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        Chronology chronology;
        if (readableInstant != null) {
            chronology = readableInstant.getChronology();
        } else {
            chronology = readableInstant2 != null ? readableInstant2.getChronology() : null;
        }
        return chronology == null ? ISOChronology.getInstance() : chronology;
    }

    public static final PeriodType getPeriodType(PeriodType periodType) {
        if (periodType == null) {
            return PeriodType.standard();
        }
        return periodType;
    }

    public static final ReadableInterval getReadableInterval(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            long currentTimeMillis = currentTimeMillis();
            return new Interval(currentTimeMillis, currentTimeMillis);
        }
        return readableInterval;
    }

    public static final DateTimeZone getZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            return DateTimeZone.getDefault();
        }
        return dateTimeZone;
    }

    public static final boolean isContiguous(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            DurationFieldType durationFieldType = null;
            for (int i = 0; i < readablePartial.size(); i++) {
                DateTimeField field = readablePartial.getField(i);
                if (i > 0 && (field.getRangeDurationField() == null || field.getRangeDurationField().getType() != durationFieldType)) {
                    return false;
                }
                durationFieldType = field.getDurationField().getType();
            }
            return true;
        }
        throw new IllegalArgumentException("Partial must not be null");
    }

    public static final void setCurrentMillisFixed(long j) throws SecurityException {
        m24056b();
        f76092b = new C12972a(j);
    }

    public static final void setCurrentMillisOffset(long j) throws SecurityException {
        m24056b();
        if (j == 0) {
            f76092b = f76091a;
        } else {
            f76092b = new C12973b(j);
        }
    }

    public static final void setCurrentMillisProvider(MillisProvider millisProvider) throws SecurityException {
        if (millisProvider != null) {
            m24056b();
            f76092b = millisProvider;
            return;
        }
        throw new IllegalArgumentException("The MillisProvider must not be null");
    }

    public static final void setCurrentMillisSystem() throws SecurityException {
        m24056b();
        f76092b = f76091a;
    }

    public static final void setDefaultTimeZoneNames(Map<String, DateTimeZone> map) {
        f76093c.set(Collections.unmodifiableMap(new HashMap(map)));
    }

    public static final double toJulianDay(long j) {
        return (j / 8.64E7d) + 2440587.5d;
    }

    public static final long toJulianDayNumber(long j) {
        return (long) Math.floor(toJulianDay(j) + 0.5d);
    }

    public static final Chronology getIntervalChronology(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return ISOChronology.getInstance();
        }
        Chronology chronology = readableInterval.getChronology();
        return chronology == null ? ISOChronology.getInstance() : chronology;
    }
}
