package org.joda.time.format;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Utf8;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* loaded from: classes5.dex */
public class DateTimeFormatterBuilder {

    /* renamed from: a */
    public ArrayList f76174a = new ArrayList();

    /* renamed from: b */
    public Object f76175b;

    /* loaded from: classes5.dex */
    public enum TimeZoneId implements InterfaceC18556Uf0, InterfaceC18428Sf0 {
        INSTANCE;
        
        private static final List<String> ALL_IDS;
        static final int MAX_LENGTH;

        static {
            int i = 0;
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            for (String str : arrayList) {
                i = Math.max(i, str.length());
            }
            MAX_LENGTH = i;
        }

        private static int prefixedStartPosition(CharSequence charSequence, int i) {
            int size = ALL_IDS.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                int m24018f = DateTimeFormatterBuilder.m24018f(charSequence, i, ALL_IDS.get(i3));
                if (m24018f > 0) {
                    size = i3 - 1;
                } else if (m24018f < 0) {
                    i2 = i3 + 1;
                } else {
                    return i3;
                }
            }
            return i2;
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int prefixedStartPosition = prefixedStartPosition(charSequence, i);
            String str = null;
            while (true) {
                List<String> list = ALL_IDS;
                if (prefixedStartPosition >= list.size()) {
                    break;
                }
                String str2 = list.get(prefixedStartPosition);
                if (!DateTimeFormatterBuilder.m24017g(charSequence, i, str2)) {
                    break;
                }
                if (str == null || str2.length() > str.length()) {
                    str = str2;
                }
                prefixedStartPosition++;
            }
            if (str != null) {
                dateTimeParserBucket.setZone(DateTimeZone.forID(str));
                return i + str.length();
            }
            return ~i;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$a */
    /* loaded from: classes5.dex */
    public static class C12995a implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: a */
        public final char f76176a;

        public C12995a(char c) {
            this.f76176a = c;
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return 1;
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            char upperCase;
            char upperCase2;
            if (i >= charSequence.length()) {
                return ~i;
            }
            char charAt = charSequence.charAt(i);
            char c = this.f76176a;
            if (charAt != c && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(c)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return ~i;
            }
            return i + 1;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            appendable.append(this.f76176a);
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            appendable.append(this.f76176a);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$c */
    /* loaded from: classes5.dex */
    public static class C12997c extends C13001g {
        public C12997c(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.AbstractC13000f, p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            char charAt;
            int parseInto = super.parseInto(dateTimeParserBucket, charSequence, i);
            if (parseInto < 0) {
                return parseInto;
            }
            int i2 = this.f76187b + i;
            if (parseInto != i2) {
                if (this.f76188c && ((charAt = charSequence.charAt(i)) == '-' || charAt == '+')) {
                    i2++;
                }
                if (parseInto > i2) {
                    return ~(i2 + 1);
                }
                if (parseInto < i2) {
                    return ~parseInto;
                }
                return parseInto;
            }
            return parseInto;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$d */
    /* loaded from: classes5.dex */
    public static class C12998d implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: a */
        public final DateTimeFieldType f76181a;

        /* renamed from: b */
        public int f76182b;

        /* renamed from: c */
        public int f76183c;

        public C12998d(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.f76181a = dateTimeFieldType;
            i2 = i2 > 18 ? 18 : i2;
            this.f76182b = i;
            this.f76183c = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[LOOP:0: B:3:0x000a->B:27:0x007a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long[] m24007a(long r8, org.joda.time.DateTimeField r10) {
            /*
                r7 = this;
                org.joda.time.DurationField r10 = r10.getDurationField()
                long r0 = r10.getUnitMillis()
                int r10 = r7.f76183c
            La:
                switch(r10) {
                    case 1: goto L63;
                    case 2: goto L60;
                    case 3: goto L5d;
                    case 4: goto L5a;
                    case 5: goto L56;
                    case 6: goto L52;
                    case 7: goto L4e;
                    case 8: goto L4a;
                    case 9: goto L46;
                    case 10: goto L40;
                    case 11: goto L3a;
                    case 12: goto L34;
                    case 13: goto L2e;
                    case 14: goto L28;
                    case 15: goto L22;
                    case 16: goto L1c;
                    case 17: goto L16;
                    case 18: goto L10;
                    default: goto Ld;
                }
            Ld:
                r2 = 1
                goto L65
            L10:
                r2 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
                goto L65
            L16:
                r2 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
                goto L65
            L1c:
                r2 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
                goto L65
            L22:
                r2 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
                goto L65
            L28:
                r2 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
                goto L65
            L2e:
                r2 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
                goto L65
            L34:
                r2 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
                goto L65
            L3a:
                r2 = 100000000000(0x174876e800, double:4.9406564584E-313)
                goto L65
            L40:
                r2 = 10000000000(0x2540be400, double:4.9406564584E-314)
                goto L65
            L46:
                r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                goto L65
            L4a:
                r2 = 100000000(0x5f5e100, double:4.94065646E-316)
                goto L65
            L4e:
                r2 = 10000000(0x989680, double:4.9406565E-317)
                goto L65
            L52:
                r2 = 1000000(0xf4240, double:4.940656E-318)
                goto L65
            L56:
                r2 = 100000(0x186a0, double:4.94066E-319)
                goto L65
            L5a:
                r2 = 10000(0x2710, double:4.9407E-320)
                goto L65
            L5d:
                r2 = 1000(0x3e8, double:4.94E-321)
                goto L65
            L60:
                r2 = 100
                goto L65
            L63:
                r2 = 10
            L65:
                long r4 = r0 * r2
                long r4 = r4 / r2
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 != 0) goto L7a
                long r8 = r8 * r2
                long r8 = r8 / r0
                long r0 = (long) r10
                r10 = 2
                long[] r10 = new long[r10]
                r2 = 0
                r10[r2] = r8
                r8 = 1
                r10[r8] = r0
                return r10
            L7a:
                int r10 = r10 + (-1)
                goto La
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.C12998d.m24007a(long, org.joda.time.DateTimeField):long[]");
        }

        /* renamed from: b */
        public void m24006b(Appendable appendable, long j, Chronology chronology) {
            String l;
            DateTimeField field = this.f76181a.getField(chronology);
            int i = this.f76182b;
            try {
                long remainder = field.remainder(j);
                if (remainder != 0) {
                    long[] m24007a = m24007a(remainder, field);
                    long j2 = m24007a[0];
                    int i2 = (int) m24007a[1];
                    if ((2147483647L & j2) == j2) {
                        l = Integer.toString((int) j2);
                    } else {
                        l = Long.toString(j2);
                    }
                    int length = l.length();
                    while (length < i2) {
                        appendable.append('0');
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        while (i < i2 && length > 1 && l.charAt(length - 1) == '0') {
                            i2--;
                            length--;
                        }
                        if (length < l.length()) {
                            for (int i3 = 0; i3 < length; i3++) {
                                appendable.append(l.charAt(i3));
                            }
                            return;
                        }
                    }
                    appendable.append(l);
                    return;
                }
                while (true) {
                    i--;
                    if (i >= 0) {
                        appendable.append('0');
                    } else {
                        return;
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.m24021c(appendable, i);
            }
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return this.f76183c;
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return this.f76183c;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            DateTimeField field = this.f76181a.getField(dateTimeParserBucket.getChronology());
            int min = Math.min(this.f76183c, charSequence.length() - i);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min) {
                char charAt = charSequence.charAt(i + i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2++;
                unitMillis /= 10;
                j += (charAt - '0') * unitMillis;
            }
            long j2 = j / 10;
            if (i2 == 0) {
                return ~i;
            }
            if (j2 > 2147483647L) {
                return ~i;
            }
            dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j2);
            return i + i2;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            m24006b(appendable, j, chronology);
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            m24006b(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$e */
    /* loaded from: classes5.dex */
    public static class C12999e implements InterfaceC18428Sf0 {

        /* renamed from: a */
        public final InterfaceC18428Sf0[] f76184a;

        /* renamed from: b */
        public final int f76185b;

        public C12999e(InterfaceC18428Sf0[] interfaceC18428Sf0Arr) {
            int estimateParsedLength;
            this.f76184a = interfaceC18428Sf0Arr;
            int length = interfaceC18428Sf0Arr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    InterfaceC18428Sf0 interfaceC18428Sf0 = interfaceC18428Sf0Arr[length];
                    if (interfaceC18428Sf0 != null && (estimateParsedLength = interfaceC18428Sf0.estimateParsedLength()) > i) {
                        i = estimateParsedLength;
                    }
                } else {
                    this.f76185b = i;
                    return;
                }
            }
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return this.f76185b;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            InterfaceC18428Sf0[] interfaceC18428Sf0Arr = this.f76184a;
            int length = interfaceC18428Sf0Arr.length;
            Object saveState = dateTimeParserBucket.saveState();
            boolean z = false;
            Object obj = null;
            int i4 = i;
            int i5 = i4;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                InterfaceC18428Sf0 interfaceC18428Sf0 = interfaceC18428Sf0Arr[i6];
                if (interfaceC18428Sf0 == null) {
                    if (i4 <= i) {
                        return i;
                    }
                    z = true;
                } else {
                    int parseInto = interfaceC18428Sf0.parseInto(dateTimeParserBucket, charSequence, i);
                    if (parseInto >= i) {
                        if (parseInto <= i4) {
                            continue;
                        } else if (parseInto >= charSequence.length() || (i3 = i6 + 1) >= length || interfaceC18428Sf0Arr[i3] == null) {
                            break;
                        } else {
                            obj = dateTimeParserBucket.saveState();
                            i4 = parseInto;
                        }
                    } else if (parseInto < 0 && (i2 = ~parseInto) > i5) {
                        i5 = i2;
                    }
                    dateTimeParserBucket.restoreState(saveState);
                    i6++;
                }
            }
            if (i4 <= i && (i4 != i || !z)) {
                return ~i5;
            }
            if (obj != null) {
                dateTimeParserBucket.restoreState(obj);
            }
            return i4;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$f */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC13000f implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: a */
        public final DateTimeFieldType f76186a;

        /* renamed from: b */
        public final int f76187b;

        /* renamed from: c */
        public final boolean f76188c;

        public AbstractC13000f(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f76186a = dateTimeFieldType;
            this.f76187b = i;
            this.f76188c = z;
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return this.f76187b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
            if (r10 <= '9') goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
            r5 = r5 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r17, java.lang.CharSequence r18, int r19) {
            /*
                Method dump skipped, instructions count: 194
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.AbstractC13000f.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$h */
    /* loaded from: classes5.dex */
    public static class C13002h implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: a */
        public final String f76190a;

        public C13002h(String str) {
            this.f76190a = str;
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return this.f76190a.length();
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return this.f76190a.length();
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            if (DateTimeFormatterBuilder.m24016h(charSequence, i, this.f76190a)) {
                return i + this.f76190a.length();
            }
            return ~i;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            appendable.append(this.f76190a);
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            appendable.append(this.f76190a);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$j */
    /* loaded from: classes5.dex */
    public static class C13004j implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: a */
        public final Map f76194a;

        /* renamed from: b */
        public final int f76195b;

        public C13004j(int i, Map map) {
            this.f76195b = i;
            this.f76194a = map;
        }

        /* renamed from: a */
        public final String m24003a(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i = this.f76195b;
            if (i != 0) {
                if (i != 1) {
                    return "";
                }
                return dateTimeZone.getShortName(j, locale);
            }
            return dateTimeZone.getName(j, locale);
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            if (this.f76195b == 1) {
                return 4;
            }
            return 20;
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            if (this.f76195b == 1) {
                return 4;
            }
            return 20;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            Map<String, DateTimeZone> map = this.f76194a;
            if (map == null) {
                map = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : map.keySet()) {
                if (DateTimeFormatterBuilder.m24017g(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str != null) {
                dateTimeParserBucket.setZone(map.get(str));
                return i + str.length();
            }
            return ~i;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            appendable.append(m24003a(j - i, dateTimeZone, locale));
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$k */
    /* loaded from: classes5.dex */
    public static class C13005k implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: a */
        public final String f76196a;

        /* renamed from: b */
        public final String f76197b;

        /* renamed from: c */
        public final boolean f76198c;

        /* renamed from: d */
        public final int f76199d;

        /* renamed from: e */
        public final int f76200e;

        public C13005k(String str, String str2, boolean z, int i, int i2) {
            this.f76196a = str;
            this.f76197b = str2;
            this.f76198c = z;
            if (i > 0 && i2 >= i) {
                if (i > 4) {
                    i = 4;
                    i2 = 4;
                }
                this.f76199d = i;
                this.f76200e = i2;
                return;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: a */
        public final int m24002a(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (int min = Math.min(charSequence.length() - i, i2); min > 0; min--) {
                char charAt = charSequence.charAt(i + i3);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            int i = this.f76199d;
            int i2 = (i + 1) << 1;
            if (this.f76198c) {
                i2 += i - 1;
            }
            String str = this.f76196a;
            if (str != null && str.length() > i2) {
                return this.f76196a.length();
            }
            return i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
            if (r8 <= '9') goto L36;
         */
        @Override // p000.InterfaceC18428Sf0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r12, java.lang.CharSequence r13, int r14) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.C13005k.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i == 0 && (str = this.f76196a) != null) {
                appendable.append(str);
                return;
            }
            if (i >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i = -i;
            }
            int i2 = i / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i2, 2);
            if (this.f76200e == 1) {
                return;
            }
            int i3 = i - (i2 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i3 != 0 || this.f76199d > 1) {
                int i4 = i3 / 60000;
                if (this.f76198c) {
                    appendable.append(':');
                }
                FormatUtils.appendPaddedInteger(appendable, i4, 2);
                if (this.f76200e == 2) {
                    return;
                }
                int i5 = i3 - (i4 * 60000);
                if (i5 != 0 || this.f76199d > 2) {
                    int i6 = i5 / 1000;
                    if (this.f76198c) {
                        appendable.append(':');
                    }
                    FormatUtils.appendPaddedInteger(appendable, i6, 2);
                    if (this.f76200e == 3) {
                        return;
                    }
                    int i7 = i5 - (i6 * 1000);
                    if (i7 != 0 || this.f76199d > 3) {
                        if (this.f76198c) {
                            appendable.append('.');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i7, 3);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static void m24021c(Appendable appendable, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static int m24018f(CharSequence charSequence, int i, String str) {
        int length = charSequence.length() - i;
        int length2 = str.length();
        int min = Math.min(length, length2);
        for (int i2 = 0; i2 < min; i2++) {
            int charAt = str.charAt(i2) - charSequence.charAt(i + i2);
            if (charAt != 0) {
                return charAt;
            }
        }
        return length2 - length;
    }

    /* renamed from: g */
    public static boolean m24017g(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m24016h(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final DateTimeFormatterBuilder m24023a(InterfaceC18556Uf0 interfaceC18556Uf0, InterfaceC18428Sf0 interfaceC18428Sf0) {
        this.f76175b = null;
        this.f76174a.add(interfaceC18556Uf0);
        this.f76174a.add(interfaceC18428Sf0);
        return this;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return m24023a(dateTimeFormatter.m24028b(), dateTimeFormatter.m24029a());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i, i2);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                if (i <= 1) {
                    return m24022b(new C13007m(dateTimeFieldType, i2, false));
                }
                return m24022b(new C13001g(dateTimeFieldType, i2, false, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            if (i > 0) {
                return m24022b(new C12997c(dateTimeFieldType, i, false));
            }
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType != null) {
            if (i > 0) {
                return m24022b(new C12997c(dateTimeFieldType, i, true));
            }
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return m24022b(new C12998d(dateTimeFieldType, i, i2));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i, int i2) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i, int i2) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i, int i2) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i, int i2) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i, i2);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        return m24022b(new C12995a(c));
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        m24020d(dateTimeParser);
        return m24023a(null, new C12999e(new InterfaceC18428Sf0[]{C1739YD.m65384b(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.m24040a(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return m24022b(new C13003i(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                if (i <= 1) {
                    return m24022b(new C13007m(dateTimeFieldType, i2, true));
                }
                return m24022b(new C13001g(dateTimeFieldType, i2, true, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return m24022b(new C13003i(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return m24023a(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return m24023a(new C13004j(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z, int i, int i2) {
        return m24022b(new C13005k(str, str, z, i, i2));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return m24023a(new C13004j(1, null), null);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i) {
        return appendTwoDigitWeekyear(i, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i) {
        return appendTwoDigitYear(i, false);
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i, i2);
    }

    public DateTimeFormatterBuilder appendYear(int i, int i2) {
        return appendSignedDecimal(DateTimeFieldType.year(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i, i2);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i, int i2) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i, i2);
    }

    /* renamed from: b */
    public final DateTimeFormatterBuilder m24022b(Object obj) {
        this.f76175b = null;
        this.f76174a.add(obj);
        this.f76174a.add(obj);
        return this;
    }

    public boolean canBuildFormatter() {
        return m24014j(m24015i());
    }

    public boolean canBuildParser() {
        return m24013k(m24015i());
    }

    public boolean canBuildPrinter() {
        return m24012l(m24015i());
    }

    public void clear() {
        this.f76175b = null;
        this.f76174a.clear();
    }

    /* renamed from: d */
    public final void m24020d(DateTimeParser dateTimeParser) {
        if (dateTimeParser != null) {
            return;
        }
        throw new IllegalArgumentException("No parser supplied");
    }

    /* renamed from: e */
    public final void m24019e(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter != null) {
            return;
        }
        throw new IllegalArgumentException("No printer supplied");
    }

    /* renamed from: i */
    public final Object m24015i() {
        Object obj = this.f76175b;
        if (obj == null) {
            if (this.f76174a.size() == 2) {
                Object obj2 = this.f76174a.get(0);
                Object obj3 = this.f76174a.get(1);
                if (obj2 != null) {
                    if (obj2 == obj3 || obj3 == null) {
                        obj = obj2;
                    }
                } else {
                    obj = obj3;
                }
            }
            if (obj == null) {
                obj = new C12996b(this.f76174a);
            }
            this.f76175b = obj;
        }
        return obj;
    }

    /* renamed from: j */
    public final boolean m24014j(Object obj) {
        if (!m24012l(obj) && !m24013k(obj)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m24013k(Object obj) {
        if (obj instanceof InterfaceC18428Sf0) {
            if (obj instanceof C12996b) {
                return ((C12996b) obj).m24009c();
            }
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m24012l(Object obj) {
        if (obj instanceof InterfaceC18556Uf0) {
            if (obj instanceof C12996b) {
                return ((C12996b) obj).m24008d();
            }
            return true;
        }
        return false;
    }

    public DateTimeFormatter toFormatter() {
        InterfaceC18556Uf0 interfaceC18556Uf0;
        Object m24015i = m24015i();
        InterfaceC18428Sf0 interfaceC18428Sf0 = null;
        if (m24012l(m24015i)) {
            interfaceC18556Uf0 = (InterfaceC18556Uf0) m24015i;
        } else {
            interfaceC18556Uf0 = null;
        }
        if (m24013k(m24015i)) {
            interfaceC18428Sf0 = (InterfaceC18428Sf0) m24015i;
        }
        if (interfaceC18556Uf0 == null && interfaceC18428Sf0 == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new DateTimeFormatter(interfaceC18556Uf0, interfaceC18428Sf0);
    }

    public DateTimeParser toParser() {
        Object m24015i = m24015i();
        if (m24013k(m24015i)) {
            return C18492Tf0.m66185a((InterfaceC18428Sf0) m24015i);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object m24015i = m24015i();
        if (m24012l(m24015i)) {
            return C18620Vf0.m65750a((InterfaceC18556Uf0) m24015i);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$i */
    /* loaded from: classes5.dex */
    public static class C13003i implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: c */
        public static Map f76191c = new ConcurrentHashMap();

        /* renamed from: a */
        public final DateTimeFieldType f76192a;

        /* renamed from: b */
        public final boolean f76193b;

        public C13003i(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.f76192a = dateTimeFieldType;
            this.f76193b = z;
        }

        /* renamed from: a */
        public final String m24005a(long j, Chronology chronology, Locale locale) {
            DateTimeField field = this.f76192a.getField(chronology);
            if (this.f76193b) {
                return field.getAsShortText(j, locale);
            }
            return field.getAsText(j, locale);
        }

        /* renamed from: b */
        public final String m24004b(ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.f76192a)) {
                DateTimeField field = this.f76192a.getField(readablePartial.getChronology());
                if (this.f76193b) {
                    return field.getAsShortText(readablePartial, locale);
                }
                return field.getAsText(readablePartial, locale);
            }
            return "�";
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            if (this.f76193b) {
                return 6;
            }
            return 20;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int intValue;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map map2 = (Map) f76191c.get(locale);
            if (map2 == null) {
                map2 = new ConcurrentHashMap();
                f76191c.put(locale, map2);
            }
            Object[] objArr = (Object[]) map2.get(this.f76192a);
            if (objArr == null) {
                map = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.f76192a);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i;
                }
                intValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    map.put(asShortText, bool);
                    map.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    map.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    map.put(property.getAsText(locale), bool);
                    map.put(property.getAsText(locale).toLowerCase(locale), bool);
                    map.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if (LanguageSupport.LANG_EN.equals(locale.getLanguage()) && this.f76192a == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    map.put("BCE", bool2);
                    map.put("bce", bool2);
                    map.put("CE", bool2);
                    map.put("ce", bool2);
                    intValue = 3;
                }
                map2.put(this.f76192a, new Object[]{map, Integer.valueOf(intValue)});
            } else {
                intValue = ((Integer) objArr[1]).intValue();
                map = (Map) objArr[0];
            }
            for (int min = Math.min(charSequence.length(), intValue + i); min > i; min--) {
                String obj = charSequence.subSequence(i, min).toString();
                if (map.containsKey(obj)) {
                    dateTimeParserBucket.saveField(this.f76192a, obj, locale);
                    return min;
                }
            }
            return ~i;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                appendable.append(m24005a(j, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            try {
                appendable.append(m24004b(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 0) {
                if (length != 1) {
                    return m24022b(new C13002h(str));
                }
                return m24022b(new C12995a(str.charAt(0)));
            }
            return this;
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        C13004j c13004j = new C13004j(0, map);
        return m24023a(c13004j, c13004j);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z, int i, int i2) {
        return m24022b(new C13005k(str, str2, z, i, i2));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        C13004j c13004j = new C13004j(1, map);
        return m24023a(c13004j, c13004j);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i, boolean z) {
        return m24022b(new C13006l(DateTimeFieldType.weekyear(), i, z));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i, boolean z) {
        return m24022b(new C13006l(DateTimeFieldType.year(), i, z));
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$g */
    /* loaded from: classes5.dex */
    public static class C13001g extends AbstractC13000f {

        /* renamed from: d */
        public final int f76189d;

        public C13001g(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.f76189d = i2;
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return this.f76187b;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.f76186a.getField(chronology).get(j), this.f76189d);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.m24021c(appendable, this.f76189d);
            }
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.f76186a)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.f76186a), this.f76189d);
                    return;
                } catch (RuntimeException unused) {
                    DateTimeFormatterBuilder.m24021c(appendable, this.f76189d);
                    return;
                }
            }
            DateTimeFormatterBuilder.m24021c(appendable, this.f76189d);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$m */
    /* loaded from: classes5.dex */
    public static class C13007m extends AbstractC13000f {
        public C13007m(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return this.f76187b;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.f76186a.getField(chronology).get(j));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.f76186a)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.f76186a));
                    return;
                } catch (RuntimeException unused) {
                    appendable.append(Utf8.REPLACEMENT_CHARACTER);
                    return;
                }
            }
            appendable.append(Utf8.REPLACEMENT_CHARACTER);
        }
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        m24019e(dateTimePrinter);
        return m24023a(C1809ZD.m65258b(dateTimePrinter), null);
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$l */
    /* loaded from: classes5.dex */
    public static class C13006l implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: a */
        public final DateTimeFieldType f76201a;

        /* renamed from: b */
        public final int f76202b;

        /* renamed from: c */
        public final boolean f76203c;

        public C13006l(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f76201a = dateTimeFieldType;
            this.f76202b = i;
            this.f76203c = z;
        }

        /* renamed from: a */
        public final int m24001a(long j, Chronology chronology) {
            try {
                int i = this.f76201a.getField(chronology).get(j);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        /* renamed from: b */
        public final int m24000b(ReadablePartial readablePartial) {
            if (readablePartial.isSupported(this.f76201a)) {
                try {
                    int i = readablePartial.get(this.f76201a);
                    if (i < 0) {
                        i = -i;
                    }
                    return i % 100;
                } catch (RuntimeException unused) {
                    return -1;
                }
            }
            return -1;
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            if (this.f76203c) {
                return 4;
            }
            return 2;
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int length = charSequence.length() - i;
            int i6 = 0;
            if (!this.f76203c) {
                if (Math.min(2, length) < 2) {
                    return ~i;
                }
            } else {
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i7 < length) {
                    char charAt = charSequence.charAt(i + i7);
                    if (i7 == 0 && (charAt == '-' || charAt == '+')) {
                        if (charAt == '-') {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i7++;
                        } else {
                            i++;
                            length--;
                        }
                        z = true;
                    } else if (charAt < '0' || charAt > '9') {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 == 0) {
                    return ~i;
                }
                if (z || i7 != 2) {
                    if (i7 >= 9) {
                        i3 = i7 + i;
                        i4 = Integer.parseInt(charSequence.subSequence(i, i3).toString());
                    } else {
                        if (z2) {
                            i2 = i + 1;
                        } else {
                            i2 = i;
                        }
                        int i8 = i2 + 1;
                        try {
                            int charAt2 = charSequence.charAt(i2) - '0';
                            i3 = i7 + i;
                            while (i8 < i3) {
                                i8++;
                                charAt2 = (((charAt2 << 3) + (charAt2 << 1)) + charSequence.charAt(i8)) - 48;
                            }
                            if (z2) {
                                i4 = -charAt2;
                            } else {
                                i4 = charAt2;
                            }
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i;
                        }
                    }
                    dateTimeParserBucket.saveField(this.f76201a, i4);
                    return i3;
                }
            }
            char charAt3 = charSequence.charAt(i);
            if (charAt3 >= '0' && charAt3 <= '9') {
                int i9 = charAt3 - '0';
                char charAt4 = charSequence.charAt(i + 1);
                if (charAt4 >= '0' && charAt4 <= '9') {
                    int i10 = (((i9 << 3) + (i9 << 1)) + charAt4) - 48;
                    int i11 = this.f76202b;
                    if (dateTimeParserBucket.getPivotYear() != null) {
                        i11 = dateTimeParserBucket.getPivotYear().intValue();
                    }
                    int i12 = i11 - 50;
                    if (i12 >= 0) {
                        i5 = i12 % 100;
                    } else {
                        i5 = ((i11 - 49) % 100) + 99;
                    }
                    if (i10 < i5) {
                        i6 = 100;
                    }
                    dateTimeParserBucket.saveField(this.f76201a, i10 + ((i12 + i6) - i5));
                    return i + 2;
                }
                return ~i;
            }
            return ~i;
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            int m24001a = m24001a(j, chronology);
            if (m24001a < 0) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            FormatUtils.appendPaddedInteger(appendable, m24001a, 2);
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            int m24000b = m24000b(readablePartial);
            if (m24000b < 0) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            FormatUtils.appendPaddedInteger(appendable, m24000b, 2);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$b */
    /* loaded from: classes5.dex */
    public static class C12996b implements InterfaceC18556Uf0, InterfaceC18428Sf0 {

        /* renamed from: a */
        public final InterfaceC18556Uf0[] f76177a;

        /* renamed from: b */
        public final InterfaceC18428Sf0[] f76178b;

        /* renamed from: c */
        public final int f76179c;

        /* renamed from: d */
        public final int f76180d;

        public C12996b(List list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m24010b(list, arrayList, arrayList2);
            if (!arrayList.contains(null) && !arrayList.isEmpty()) {
                int size = arrayList.size();
                this.f76177a = new InterfaceC18556Uf0[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    InterfaceC18556Uf0 interfaceC18556Uf0 = (InterfaceC18556Uf0) arrayList.get(i2);
                    i += interfaceC18556Uf0.estimatePrintedLength();
                    this.f76177a[i2] = interfaceC18556Uf0;
                }
                this.f76179c = i;
            } else {
                this.f76177a = null;
                this.f76179c = 0;
            }
            if (!arrayList2.contains(null) && !arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                this.f76178b = new InterfaceC18428Sf0[size2];
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    InterfaceC18428Sf0 interfaceC18428Sf0 = (InterfaceC18428Sf0) arrayList2.get(i4);
                    i3 += interfaceC18428Sf0.estimateParsedLength();
                    this.f76178b[i4] = interfaceC18428Sf0;
                }
                this.f76180d = i3;
                return;
            }
            this.f76178b = null;
            this.f76180d = 0;
        }

        /* renamed from: a */
        public final void m24011a(List list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        /* renamed from: b */
        public final void m24010b(List list, List list2, List list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof C12996b) {
                    m24011a(list2, ((C12996b) obj).f76177a);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof C12996b) {
                    m24011a(list3, ((C12996b) obj2).f76178b);
                } else {
                    list3.add(obj2);
                }
            }
        }

        /* renamed from: c */
        public boolean m24009c() {
            if (this.f76178b != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean m24008d() {
            if (this.f76177a != null) {
                return true;
            }
            return false;
        }

        @Override // p000.InterfaceC18428Sf0
        public int estimateParsedLength() {
            return this.f76180d;
        }

        @Override // p000.InterfaceC18556Uf0
        public int estimatePrintedLength() {
            return this.f76179c;
        }

        @Override // p000.InterfaceC18428Sf0
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i) {
            InterfaceC18428Sf0[] interfaceC18428Sf0Arr = this.f76178b;
            if (interfaceC18428Sf0Arr != null) {
                int length = interfaceC18428Sf0Arr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = interfaceC18428Sf0Arr[i2].parseInto(dateTimeParserBucket, charSequence, i);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
            InterfaceC18556Uf0[] interfaceC18556Uf0Arr = this.f76177a;
            if (interfaceC18556Uf0Arr != null) {
                Locale locale2 = locale == null ? Locale.getDefault() : locale;
                for (InterfaceC18556Uf0 interfaceC18556Uf0 : interfaceC18556Uf0Arr) {
                    interfaceC18556Uf0.printTo(appendable, j, chronology, i, dateTimeZone, locale2);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }

        @Override // p000.InterfaceC18556Uf0
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            InterfaceC18556Uf0[] interfaceC18556Uf0Arr = this.f76177a;
            if (interfaceC18556Uf0Arr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (InterfaceC18556Uf0 interfaceC18556Uf0 : interfaceC18556Uf0Arr) {
                    interfaceC18556Uf0.printTo(appendable, readablePartial, locale);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        m24020d(dateTimeParser);
        return m24023a(null, C1739YD.m65384b(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        m24019e(dateTimePrinter);
        m24020d(dateTimeParser);
        return m24023a(C1809ZD.m65258b(dateTimePrinter), C1739YD.m65384b(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            m24019e(dateTimePrinter);
        }
        if (dateTimeParserArr != null) {
            int length = dateTimeParserArr.length;
            int i = 0;
            if (length == 1) {
                if (dateTimeParserArr[0] != null) {
                    return m24023a(C1809ZD.m65258b(dateTimePrinter), C1739YD.m65384b(dateTimeParserArr[0]));
                }
                throw new IllegalArgumentException("No parser supplied");
            }
            InterfaceC18428Sf0[] interfaceC18428Sf0Arr = new InterfaceC18428Sf0[length];
            while (i < length - 1) {
                InterfaceC18428Sf0 m65384b = C1739YD.m65384b(dateTimeParserArr[i]);
                interfaceC18428Sf0Arr[i] = m65384b;
                if (m65384b == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i++;
            }
            interfaceC18428Sf0Arr[i] = C1739YD.m65384b(dateTimeParserArr[i]);
            return m24023a(C1809ZD.m65258b(dateTimePrinter), new C12999e(interfaceC18428Sf0Arr));
        }
        throw new IllegalArgumentException("No parsers supplied");
    }
}
