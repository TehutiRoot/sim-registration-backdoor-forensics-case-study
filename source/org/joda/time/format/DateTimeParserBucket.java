package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.perf.util.Constants;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* loaded from: classes5.dex */
public class DateTimeParserBucket {

    /* renamed from: a */
    public final Chronology f76204a;

    /* renamed from: b */
    public final long f76205b;

    /* renamed from: c */
    public final Locale f76206c;

    /* renamed from: d */
    public final int f76207d;

    /* renamed from: e */
    public final DateTimeZone f76208e;

    /* renamed from: f */
    public final Integer f76209f;

    /* renamed from: g */
    public DateTimeZone f76210g;

    /* renamed from: h */
    public Integer f76211h;

    /* renamed from: i */
    public Integer f76212i;

    /* renamed from: j */
    public C13008a[] f76213j;

    /* renamed from: k */
    public int f76214k;

    /* renamed from: l */
    public boolean f76215l;

    /* renamed from: m */
    public Object f76216m;

    /* renamed from: org.joda.time.format.DateTimeParserBucket$a */
    /* loaded from: classes5.dex */
    public static class C13008a implements Comparable {

        /* renamed from: a */
        public DateTimeField f76217a;

        /* renamed from: b */
        public int f76218b;

        /* renamed from: c */
        public String f76219c;

        /* renamed from: d */
        public Locale f76220d;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C13008a c13008a) {
            DateTimeField dateTimeField = c13008a.f76217a;
            int m23990j = DateTimeParserBucket.m23990j(this.f76217a.getRangeDurationField(), dateTimeField.getRangeDurationField());
            if (m23990j != 0) {
                return m23990j;
            }
            return DateTimeParserBucket.m23990j(this.f76217a.getDurationField(), dateTimeField.getDurationField());
        }

        /* renamed from: b */
        public void m23985b(DateTimeField dateTimeField, int i) {
            this.f76217a = dateTimeField;
            this.f76218b = i;
            this.f76219c = null;
            this.f76220d = null;
        }

        /* renamed from: c */
        public void m23984c(DateTimeField dateTimeField, String str, Locale locale) {
            this.f76217a = dateTimeField;
            this.f76218b = 0;
            this.f76219c = str;
            this.f76220d = locale;
        }

        /* renamed from: d */
        public long m23983d(long j, boolean z) {
            long j2;
            String str = this.f76219c;
            if (str == null) {
                j2 = this.f76217a.setExtended(j, this.f76218b);
            } else {
                j2 = this.f76217a.set(j, str, this.f76220d);
            }
            if (z) {
                return this.f76217a.roundFloor(j2);
            }
            return j2;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeParserBucket$b */
    /* loaded from: classes5.dex */
    public class C13009b {

        /* renamed from: a */
        public final DateTimeZone f76221a;

        /* renamed from: b */
        public final Integer f76222b;

        /* renamed from: c */
        public final C13008a[] f76223c;

        /* renamed from: d */
        public final int f76224d;

        public C13009b() {
            this.f76221a = DateTimeParserBucket.this.f76210g;
            this.f76222b = DateTimeParserBucket.this.f76211h;
            this.f76223c = DateTimeParserBucket.this.f76213j;
            this.f76224d = DateTimeParserBucket.this.f76214k;
        }

        /* renamed from: a */
        public boolean m23982a(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket == DateTimeParserBucket.this) {
                dateTimeParserBucket.f76210g = this.f76221a;
                dateTimeParserBucket.f76211h = this.f76222b;
                dateTimeParserBucket.f76213j = this.f76223c;
                if (this.f76224d < dateTimeParserBucket.f76214k) {
                    dateTimeParserBucket.f76215l = true;
                }
                dateTimeParserBucket.f76214k = this.f76224d;
                return true;
            }
            return false;
        }
    }

    @Deprecated
    public DateTimeParserBucket(long j, Chronology chronology, Locale locale) {
        this(j, chronology, locale, null, Constants.MAX_URL_LENGTH);
    }

    /* renamed from: j */
    public static int m23990j(DurationField durationField, DurationField durationField2) {
        if (durationField != null && durationField.isSupported()) {
            if (durationField2 != null && durationField2.isSupported()) {
                return -durationField.compareTo(durationField2);
            }
            return 1;
        } else if (durationField2 != null && durationField2.isSupported()) {
            return -1;
        } else {
            return 0;
        }
    }

    /* renamed from: m */
    public static void m23987m(C13008a[] c13008aArr, int i) {
        if (i > 10) {
            Arrays.sort(c13008aArr, 0, i);
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = i2; i3 > 0; i3--) {
                int i4 = i3 - 1;
                if (c13008aArr[i4].compareTo(c13008aArr[i3]) > 0) {
                    C13008a c13008a = c13008aArr[i3];
                    c13008aArr[i3] = c13008aArr[i4];
                    c13008aArr[i4] = c13008a;
                }
            }
        }
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }

    public Chronology getChronology() {
        return this.f76204a;
    }

    public Locale getLocale() {
        return this.f76206c;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.f76211h;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Integer getOffsetInteger() {
        return this.f76211h;
    }

    public Integer getPivotYear() {
        return this.f76212i;
    }

    public DateTimeZone getZone() {
        return this.f76210g;
    }

    /* renamed from: k */
    public long m23989k(InterfaceC18428Sf0 interfaceC18428Sf0, CharSequence charSequence) {
        int parseInto = interfaceC18428Sf0.parseInto(this, charSequence, 0);
        if (parseInto >= 0) {
            if (parseInto >= charSequence.length()) {
                return computeMillis(true, charSequence);
            }
        } else {
            parseInto = ~parseInto;
        }
        throw new IllegalArgumentException(FormatUtils.m23981a(charSequence.toString(), parseInto));
    }

    /* renamed from: l */
    public final C13008a m23988l() {
        int length;
        C13008a[] c13008aArr = this.f76213j;
        int i = this.f76214k;
        if (i == c13008aArr.length || this.f76215l) {
            if (i == c13008aArr.length) {
                length = i * 2;
            } else {
                length = c13008aArr.length;
            }
            C13008a[] c13008aArr2 = new C13008a[length];
            System.arraycopy(c13008aArr, 0, c13008aArr2, 0, i);
            this.f76213j = c13008aArr2;
            this.f76215l = false;
            c13008aArr = c13008aArr2;
        }
        this.f76216m = null;
        C13008a c13008a = c13008aArr[i];
        if (c13008a == null) {
            c13008a = new C13008a();
            c13008aArr[i] = c13008a;
        }
        this.f76214k = i + 1;
        return c13008a;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return m23989k(C1739YD.m65384b(dateTimeParser), charSequence);
    }

    public void reset() {
        this.f76210g = this.f76208e;
        this.f76211h = null;
        this.f76212i = this.f76209f;
        this.f76214k = 0;
        this.f76215l = false;
        this.f76216m = null;
    }

    public boolean restoreState(Object obj) {
        if ((obj instanceof C13009b) && ((C13009b) obj).m23982a(this)) {
            this.f76216m = obj;
            return true;
        }
        return false;
    }

    public void saveField(DateTimeField dateTimeField, int i) {
        m23988l().m23985b(dateTimeField, i);
    }

    public Object saveState() {
        if (this.f76216m == null) {
            this.f76216m = new C13009b();
        }
        return this.f76216m;
    }

    @Deprecated
    public void setOffset(int i) {
        this.f76216m = null;
        this.f76211h = Integer.valueOf(i);
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.f76212i = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.f76216m = null;
        this.f76210g = dateTimeZone;
    }

    @Deprecated
    public DateTimeParserBucket(long j, Chronology chronology, Locale locale, Integer num) {
        this(j, chronology, locale, num, Constants.MAX_URL_LENGTH);
    }

    public long computeMillis(boolean z) {
        return computeMillis(z, (CharSequence) null);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i) {
        m23988l().m23985b(dateTimeFieldType.getField(this.f76204a), i);
    }

    public DateTimeParserBucket(long j, Chronology chronology, Locale locale, Integer num, int i) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.f76205b = j;
        DateTimeZone zone = chronology2.getZone();
        this.f76208e = zone;
        this.f76204a = chronology2.withUTC();
        this.f76206c = locale == null ? Locale.getDefault() : locale;
        this.f76207d = i;
        this.f76209f = num;
        this.f76210g = zone;
        this.f76212i = num;
        this.f76213j = new C13008a[8];
    }

    public long computeMillis(boolean z, String str) {
        return computeMillis(z, (CharSequence) str);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        m23988l().m23984c(dateTimeFieldType.getField(this.f76204a), str, locale);
    }

    public void setOffset(Integer num) {
        this.f76216m = null;
        this.f76211h = num;
    }

    public long computeMillis(boolean z, CharSequence charSequence) {
        Integer num;
        C13008a[] c13008aArr = this.f76213j;
        int i = this.f76214k;
        if (this.f76215l) {
            c13008aArr = (C13008a[]) c13008aArr.clone();
            this.f76213j = c13008aArr;
            this.f76215l = false;
        }
        m23987m(c13008aArr, i);
        if (i > 0) {
            DurationField field = DurationFieldType.months().getField(this.f76204a);
            DurationField field2 = DurationFieldType.days().getField(this.f76204a);
            DurationField durationField = c13008aArr[0].f76217a.getDurationField();
            if (m23990j(durationField, field) >= 0 && m23990j(durationField, field2) <= 0) {
                saveField(DateTimeFieldType.year(), this.f76207d);
                return computeMillis(z, charSequence);
            }
        }
        long j = this.f76205b;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                j = c13008aArr[i2].m23983d(j, z);
            } catch (IllegalFieldValueException e) {
                if (charSequence != null) {
                    e.prependMessage("Cannot parse \"" + ((Object) charSequence) + '\"');
                }
                throw e;
            }
        }
        if (z) {
            int i3 = 0;
            while (i3 < i) {
                j = c13008aArr[i3].m23983d(j, i3 == i + (-1));
                i3++;
            }
        }
        if (this.f76211h != null) {
            return j - num.intValue();
        }
        DateTimeZone dateTimeZone = this.f76210g;
        if (dateTimeZone != null) {
            int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j);
            long j2 = j - offsetFromLocal;
            if (offsetFromLocal != this.f76210g.getOffset(j2)) {
                String str = "Illegal instant due to time zone offset transition (" + this.f76210g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                if (charSequence != null) {
                    str = "Cannot parse \"" + ((Object) charSequence) + "\": " + str;
                }
                throw new IllegalInstantException(str);
            }
            return j2;
        }
        return j;
    }
}
