package org.joda.time.format;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.eac.EACTags;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* loaded from: classes5.dex */
public class PeriodFormatterBuilder {

    /* renamed from: j */
    public static final ConcurrentMap f76297j = new ConcurrentHashMap();

    /* renamed from: a */
    public int f76298a;

    /* renamed from: b */
    public int f76299b;

    /* renamed from: c */
    public int f76300c;

    /* renamed from: d */
    public boolean f76301d;

    /* renamed from: e */
    public InterfaceC13017f f76302e;

    /* renamed from: f */
    public List f76303f;

    /* renamed from: g */
    public boolean f76304g;

    /* renamed from: h */
    public boolean f76305h;

    /* renamed from: i */
    public C13014c[] f76306i;

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$b */
    /* loaded from: classes5.dex */
    public static class C13013b extends AbstractC13015d {

        /* renamed from: b */
        public final InterfaceC13017f f76309b;

        /* renamed from: c */
        public final InterfaceC13017f f76310c;

        /* renamed from: d */
        public final String[] f76311d;

        public C13013b(InterfaceC13017f interfaceC13017f, InterfaceC13017f interfaceC13017f2) {
            String[] mo23824f;
            this.f76309b = interfaceC13017f;
            this.f76310c = interfaceC13017f2;
            HashSet hashSet = new HashSet();
            for (String str : interfaceC13017f.mo23824f()) {
                for (String str2 : this.f76310c.mo23824f()) {
                    hashSet.add(str + str2);
                }
            }
            this.f76311d = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: a */
        public int mo23829a(String str, int i) {
            int mo23829a;
            int mo23829a2 = this.f76309b.mo23829a(str, i);
            if (mo23829a2 >= 0 && ((mo23829a = this.f76310c.mo23829a(str, this.f76309b.mo23828b(str, mo23829a2))) < 0 || !m23836h(this.f76310c.mo23828b(str, mo23829a) - mo23829a2, str, i))) {
                if (mo23829a2 > 0) {
                    return mo23829a2;
                }
                return mo23829a;
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: b */
        public int mo23828b(String str, int i) {
            int mo23828b = this.f76309b.mo23828b(str, i);
            if (mo23828b >= 0 && (mo23828b = this.f76310c.mo23828b(str, mo23828b)) >= 0 && m23836h(mo23828b(str, mo23828b) - mo23828b, str, i)) {
                return ~i;
            }
            return mo23828b;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: c */
        public void mo23827c(StringBuffer stringBuffer, int i) {
            this.f76309b.mo23827c(stringBuffer, i);
            this.f76310c.mo23827c(stringBuffer, i);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: d */
        public int mo23826d(int i) {
            return this.f76309b.mo23826d(i) + this.f76310c.mo23826d(i);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: e */
        public void mo23825e(Writer writer, int i) {
            this.f76309b.mo23825e(writer, i);
            this.f76310c.mo23825e(writer, i);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: f */
        public String[] mo23824f() {
            return (String[]) this.f76311d.clone();
        }
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$d */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC13015d implements InterfaceC13017f {

        /* renamed from: a */
        public volatile String[] f76320a;

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: g */
        public void mo23835g(Set set) {
            String[] mo23824f;
            String[] mo23824f2;
            if (this.f76320a == null) {
                int i = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : mo23824f()) {
                    if (str2.length() < i) {
                        i = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    InterfaceC13017f interfaceC13017f = (InterfaceC13017f) it.next();
                    if (interfaceC13017f != null) {
                        for (String str3 : interfaceC13017f.mo23824f()) {
                            if (str3.length() > i || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.f76320a = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        /* renamed from: h */
        public boolean m23836h(int i, String str, int i2) {
            String[] strArr;
            if (this.f76320a != null) {
                for (String str2 : this.f76320a) {
                    int length = str2.length();
                    if (i >= length || !str.regionMatches(true, i2, str2, 0, length)) {
                        if (i == length && str.regionMatches(false, i2, str2, 0, length)) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$e */
    /* loaded from: classes5.dex */
    public static class C13016e implements PeriodPrinter, PeriodParser {

        /* renamed from: b */
        public static final C13016e f76321b = new C13016e("");

        /* renamed from: a */
        public final String f76322a;

        public C13016e(String str) {
            this.f76322a = str;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return this.f76322a.length();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            return 0;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            String str2 = this.f76322a;
            if (str.regionMatches(true, i, str2, 0, str2.length())) {
                return i + this.f76322a.length();
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            stringBuffer.append(this.f76322a);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            writer.write(this.f76322a);
        }
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$f */
    /* loaded from: classes5.dex */
    public interface InterfaceC13017f {
        /* renamed from: a */
        int mo23829a(String str, int i);

        /* renamed from: b */
        int mo23828b(String str, int i);

        /* renamed from: c */
        void mo23827c(StringBuffer stringBuffer, int i);

        /* renamed from: d */
        int mo23826d(int i);

        /* renamed from: e */
        void mo23825e(Writer writer, int i);

        /* renamed from: f */
        String[] mo23824f();

        /* renamed from: g */
        void mo23835g(Set set);
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$g */
    /* loaded from: classes5.dex */
    public static class C13018g extends AbstractC13015d {

        /* renamed from: b */
        public final String f76323b;

        /* renamed from: c */
        public final String f76324c;

        public C13018g(String str, String str2) {
            this.f76323b = str;
            this.f76324c = str2;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: a */
        public int mo23829a(String str, int i) {
            String str2;
            String str3;
            String str4 = this.f76324c;
            String str5 = this.f76323b;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            int length = str2.length();
            int length2 = str3.length();
            int length3 = str.length();
            for (int i2 = i; i2 < length3; i2++) {
                if (str.regionMatches(true, i2, str2, 0, length) && !m23836h(str2.length(), str, i2)) {
                    return i2;
                }
                if (str.regionMatches(true, i2, str3, 0, length2) && !m23836h(str3.length(), str, i2)) {
                    return i2;
                }
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: b */
        public int mo23828b(String str, int i) {
            String str2;
            int length;
            String str3 = this.f76324c;
            String str4 = this.f76323b;
            if (str3.length() < str4.length()) {
                str2 = str3;
                str3 = str4;
            } else {
                str2 = str4;
            }
            if (str.regionMatches(true, i, str3, 0, str3.length()) && !m23836h(str3.length(), str, i)) {
                length = str3.length();
            } else {
                if (str.regionMatches(true, i, str2, 0, str2.length()) && !m23836h(str2.length(), str, i)) {
                    length = str2.length();
                } else {
                    return ~i;
                }
            }
            return i + length;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: c */
        public void mo23827c(StringBuffer stringBuffer, int i) {
            String str;
            if (i == 1) {
                str = this.f76323b;
            } else {
                str = this.f76324c;
            }
            stringBuffer.append(str);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: d */
        public int mo23826d(int i) {
            String str;
            if (i == 1) {
                str = this.f76323b;
            } else {
                str = this.f76324c;
            }
            return str.length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: e */
        public void mo23825e(Writer writer, int i) {
            String str;
            if (i == 1) {
                str = this.f76323b;
            } else {
                str = this.f76324c;
            }
            writer.write(str);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: f */
        public String[] mo23824f() {
            return new String[]{this.f76323b, this.f76324c};
        }
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$h */
    /* loaded from: classes5.dex */
    public static class C13019h extends AbstractC13015d {

        /* renamed from: e */
        public static final Comparator f76325e = new C13020a();

        /* renamed from: b */
        public final String[] f76326b;

        /* renamed from: c */
        public final Pattern[] f76327c;

        /* renamed from: d */
        public final String[] f76328d;

        /* renamed from: org.joda.time.format.PeriodFormatterBuilder$h$a */
        /* loaded from: classes5.dex */
        public static class C13020a implements Comparator {
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        }

        public C13019h(String[] strArr, String[] strArr2) {
            this.f76326b = (String[]) strArr2.clone();
            this.f76327c = new Pattern[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                Pattern pattern = (Pattern) PeriodFormatterBuilder.f76297j.get(strArr[i]);
                if (pattern == null) {
                    pattern = Pattern.compile(strArr[i]);
                    PeriodFormatterBuilder.f76297j.putIfAbsent(strArr[i], pattern);
                }
                this.f76327c[i] = pattern;
            }
            String[] strArr3 = (String[]) this.f76326b.clone();
            this.f76328d = strArr3;
            Arrays.sort(strArr3, f76325e);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: a */
        public int mo23829a(String str, int i) {
            String[] strArr;
            int length = str.length();
            for (int i2 = i; i2 < length; i2++) {
                for (String str2 : this.f76328d) {
                    if (str.regionMatches(true, i2, str2, 0, str2.length()) && !m23836h(str2.length(), str, i2)) {
                        return i2;
                    }
                }
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: b */
        public int mo23828b(String str, int i) {
            String[] strArr;
            for (String str2 : this.f76328d) {
                if (str.regionMatches(true, i, str2, 0, str2.length()) && !m23836h(str2.length(), str, i)) {
                    return i + str2.length();
                }
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: c */
        public void mo23827c(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.f76326b[m23834i(i)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: d */
        public int mo23826d(int i) {
            return this.f76326b[m23834i(i)].length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: e */
        public void mo23825e(Writer writer, int i) {
            writer.write(this.f76326b[m23834i(i)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: f */
        public String[] mo23824f() {
            return (String[]) this.f76326b.clone();
        }

        /* renamed from: i */
        public final int m23834i(int i) {
            String valueOf = String.valueOf(i);
            int i2 = 0;
            while (true) {
                Pattern[] patternArr = this.f76327c;
                if (i2 < patternArr.length) {
                    if (patternArr[i2].matcher(valueOf).matches()) {
                        return i2;
                    }
                    i2++;
                } else {
                    return patternArr.length - 1;
                }
            }
        }
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$j */
    /* loaded from: classes5.dex */
    public static class C13022j extends AbstractC13015d {

        /* renamed from: b */
        public final String f76338b;

        public C13022j(String str) {
            this.f76338b = str;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: a */
        public int mo23829a(String str, int i) {
            String str2 = this.f76338b;
            int length = str2.length();
            int length2 = str.length();
            for (int i2 = i; i2 < length2; i2++) {
                if (str.regionMatches(true, i2, str2, 0, length) && !m23836h(length, str, i2)) {
                    return i2;
                }
                switch (str.charAt(i2)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case EACTags.TRANSACTION_DATE /* 51 */:
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    case EACTags.SEX /* 53 */:
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '/':
                    default:
                        return ~i;
                }
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: b */
        public int mo23828b(String str, int i) {
            String str2 = this.f76338b;
            int length = str2.length();
            if (str.regionMatches(true, i, str2, 0, length) && !m23836h(length, str, i)) {
                return i + length;
            }
            return ~i;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: c */
        public void mo23827c(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.f76338b);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: d */
        public int mo23826d(int i) {
            return this.f76338b.length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: e */
        public void mo23825e(Writer writer, int i) {
            writer.write(this.f76338b);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.InterfaceC13017f
        /* renamed from: f */
        public String[] mo23824f() {
            return new String[]{this.f76338b};
        }
    }

    public PeriodFormatterBuilder() {
        clear();
    }

    /* renamed from: i */
    public static Object[] m23847i(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                C13012a c13012a = new C13012a(list);
                return new Object[]{c13012a, c13012a};
            }
            return new Object[]{list.get(0), list.get(1)};
        }
        C13016e c13016e = C13016e.f76321b;
        return new Object[]{c13016e, c13016e};
    }

    /* renamed from: j */
    public static PeriodFormatter m23846j(List list, boolean z, boolean z2) {
        if (z && z2) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof C13021i)) {
            C13021i c13021i = (C13021i) list.get(0);
            if (c13021i.f76337i == null && c13021i.f76335g == null) {
                PeriodFormatter m23846j = m23846j(list.subList(2, size), z, z2);
                C13021i m23830c = c13021i.m23830c(m23846j.getPrinter(), m23846j.getParser());
                return new PeriodFormatter(m23830c, m23830c);
            }
        }
        Object[] m23847i = m23847i(list);
        if (z) {
            return new PeriodFormatter(null, (PeriodParser) m23847i[1]);
        }
        if (z2) {
            return new PeriodFormatter((PeriodPrinter) m23847i[0], null);
        }
        return new PeriodFormatter((PeriodPrinter) m23847i[0], (PeriodParser) m23847i[1]);
    }

    public PeriodFormatterBuilder append(PeriodFormatter periodFormatter) {
        if (periodFormatter != null) {
            m23848h();
            m23854b(periodFormatter.getPrinter(), periodFormatter.getParser());
            return this;
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public PeriodFormatterBuilder appendDays() {
        m23853c(3);
        return this;
    }

    public PeriodFormatterBuilder appendHours() {
        m23853c(4);
        return this;
    }

    public PeriodFormatterBuilder appendLiteral(String str) {
        if (str != null) {
            m23848h();
            C13016e c13016e = new C13016e(str);
            m23854b(c13016e, c13016e);
            return this;
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    public PeriodFormatterBuilder appendMillis() {
        m23853c(7);
        return this;
    }

    public PeriodFormatterBuilder appendMillis3Digit() {
        m23852d(7, 3);
        return this;
    }

    public PeriodFormatterBuilder appendMinutes() {
        m23853c(5);
        return this;
    }

    public PeriodFormatterBuilder appendMonths() {
        m23853c(1);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String str) {
        if (str != null) {
            return m23851e(new C13022j(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSeconds() {
        m23853c(6);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithMillis() {
        m23853c(8);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {
        m23853c(9);
        return this;
    }

    public PeriodFormatterBuilder appendSeparator(String str) {
        return m23850f(str, str, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String str) {
        return m23850f(str, str, null, false, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String str) {
        return m23850f(str, str, null, true, false);
    }

    public PeriodFormatterBuilder appendSuffix(String str) {
        if (str != null) {
            return m23849g(new C13022j(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendWeeks() {
        m23853c(2);
        return this;
    }

    public PeriodFormatterBuilder appendYears() {
        m23853c(0);
        return this;
    }

    /* renamed from: b */
    public final PeriodFormatterBuilder m23854b(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        boolean z;
        this.f76303f.add(periodPrinter);
        this.f76303f.add(periodParser);
        boolean z2 = this.f76304g;
        boolean z3 = false;
        if (periodPrinter == null) {
            z = true;
        } else {
            z = false;
        }
        this.f76304g = z | z2;
        boolean z4 = this.f76305h;
        if (periodParser == null) {
            z3 = true;
        }
        this.f76305h = z4 | z3;
        return this;
    }

    /* renamed from: c */
    public final void m23853c(int i) {
        m23852d(i, this.f76298a);
    }

    public void clear() {
        this.f76298a = 1;
        this.f76299b = 2;
        this.f76300c = 10;
        this.f76301d = false;
        this.f76302e = null;
        List list = this.f76303f;
        if (list == null) {
            this.f76303f = new ArrayList();
        } else {
            list.clear();
        }
        this.f76304g = false;
        this.f76305h = false;
        this.f76306i = new C13014c[10];
    }

    /* renamed from: d */
    public final void m23852d(int i, int i2) {
        C13014c c13014c = new C13014c(i2, this.f76299b, this.f76300c, this.f76301d, i, this.f76306i, this.f76302e, null);
        m23854b(c13014c, c13014c);
        this.f76306i[i] = c13014c;
        this.f76302e = null;
    }

    /* renamed from: e */
    public final PeriodFormatterBuilder m23851e(InterfaceC13017f interfaceC13017f) {
        if (interfaceC13017f != null) {
            InterfaceC13017f interfaceC13017f2 = this.f76302e;
            if (interfaceC13017f2 != null) {
                interfaceC13017f = new C13013b(interfaceC13017f2, interfaceC13017f);
            }
            this.f76302e = interfaceC13017f;
            return this;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final PeriodFormatterBuilder m23850f(String str, String str2, String[] strArr, boolean z, boolean z2) {
        C13021i c13021i;
        if (str != null && str2 != null) {
            m23848h();
            List list = this.f76303f;
            if (list.size() == 0) {
                if (z2 && !z) {
                    C13016e c13016e = C13016e.f76321b;
                    C13021i c13021i2 = new C13021i(str, str2, strArr, c13016e, c13016e, z, z2);
                    m23854b(c13021i2, c13021i2);
                }
                return this;
            }
            int size = list.size();
            while (true) {
                int i = size - 1;
                if (i >= 0) {
                    if (list.get(i) instanceof C13021i) {
                        c13021i = (C13021i) list.get(i);
                        list = list.subList(size, list.size());
                        break;
                    }
                    size -= 2;
                } else {
                    c13021i = null;
                    break;
                }
            }
            List list2 = list;
            if (c13021i != null && list2.size() == 0) {
                throw new IllegalStateException("Cannot have two adjacent separators");
            }
            Object[] m23847i = m23847i(list2);
            list2.clear();
            C13021i c13021i3 = new C13021i(str, str2, strArr, (PeriodPrinter) m23847i[0], (PeriodParser) m23847i[1], z, z2);
            list2.add(c13021i3);
            list2.add(c13021i3);
            return this;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public final PeriodFormatterBuilder m23849g(InterfaceC13017f interfaceC13017f) {
        Object obj;
        Object obj2;
        List list;
        List list2;
        List list3;
        List list4;
        if (this.f76303f.size() > 0) {
            obj = this.f76303f.get(list3.size() - 2);
            obj2 = this.f76303f.get(list4.size() - 1);
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj != null && obj2 != null && obj == obj2 && (obj instanceof C13014c)) {
            m23848h();
            C13014c c13014c = new C13014c((C13014c) obj, interfaceC13017f);
            this.f76303f.set(list.size() - 2, c13014c);
            this.f76303f.set(list2.size() - 1, c13014c);
            this.f76306i[c13014c.m23842b()] = c13014c;
            return this;
        }
        throw new IllegalStateException("No field to apply suffix to");
    }

    /* renamed from: h */
    public final void m23848h() {
        if (this.f76302e == null) {
            this.f76302e = null;
            return;
        }
        throw new IllegalStateException("Prefix not followed by field");
    }

    public PeriodFormatterBuilder maximumParsedDigits(int i) {
        this.f76300c = i;
        return this;
    }

    public PeriodFormatterBuilder minimumPrintedDigits(int i) {
        this.f76298a = i;
        return this;
    }

    public PeriodFormatterBuilder printZeroAlways() {
        this.f76299b = 4;
        return this;
    }

    public PeriodFormatterBuilder printZeroIfSupported() {
        this.f76299b = 3;
        return this;
    }

    public PeriodFormatterBuilder printZeroNever() {
        this.f76299b = 5;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyFirst() {
        this.f76299b = 1;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyLast() {
        this.f76299b = 2;
        return this;
    }

    public PeriodFormatterBuilder rejectSignedValues(boolean z) {
        this.f76301d = z;
        return this;
    }

    public PeriodFormatter toFormatter() {
        C13014c[] c13014cArr;
        PeriodFormatter m23846j = m23846j(this.f76303f, this.f76304g, this.f76305h);
        for (C13014c c13014c : this.f76306i) {
            if (c13014c != null) {
                c13014c.m23843a(this.f76306i);
            }
        }
        this.f76306i = (C13014c[]) this.f76306i.clone();
        return m23846j;
    }

    public PeriodParser toParser() {
        if (this.f76305h) {
            return null;
        }
        return toFormatter().getParser();
    }

    public PeriodPrinter toPrinter() {
        if (this.f76304g) {
            return null;
        }
        return toFormatter().getPrinter();
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2) {
        return m23850f(str, str2, null, true, true);
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$a */
    /* loaded from: classes5.dex */
    public static class C13012a implements PeriodPrinter, PeriodParser {

        /* renamed from: a */
        public final PeriodPrinter[] f76307a;

        /* renamed from: b */
        public final PeriodParser[] f76308b;

        public C13012a(List list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m23844b(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.f76307a = null;
            } else {
                this.f76307a = (PeriodPrinter[]) arrayList.toArray(new PeriodPrinter[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.f76308b = null;
            } else {
                this.f76308b = (PeriodParser[]) arrayList2.toArray(new PeriodParser[arrayList2.size()]);
            }
        }

        /* renamed from: a */
        public final void m23845a(List list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        /* renamed from: b */
        public final void m23844b(List list, List list2, List list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof PeriodPrinter) {
                    if (obj instanceof C13012a) {
                        m23845a(list2, ((C13012a) obj).f76307a);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof PeriodParser) {
                    if (obj2 instanceof C13012a) {
                        m23845a(list3, ((C13012a) obj2).f76308b);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.f76307a;
            int length = periodPrinterArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    i += periodPrinterArr[length].calculatePrintedLength(readablePeriod, locale);
                } else {
                    return i;
                }
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.f76307a;
            int length = periodPrinterArr.length;
            int i2 = 0;
            while (i2 < i) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 += periodPrinterArr[length].countFieldsToPrint(readablePeriod, Integer.MAX_VALUE, locale);
            }
            return i2;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i, Locale locale) {
            PeriodParser[] periodParserArr = this.f76308b;
            if (periodParserArr != null) {
                int length = periodParserArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = periodParserArr[i2].parseInto(readWritablePeriod, str, i, locale);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.f76307a) {
                periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.f76307a) {
                periodPrinter.printTo(writer, readablePeriod, locale);
            }
        }
    }

    public PeriodFormatterBuilder appendPrefix(String str, String str2) {
        if (str != null && str2 != null) {
            return m23851e(new C13018g(str, str2));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr) {
        return m23850f(str, str2, strArr, true, true);
    }

    public PeriodFormatterBuilder appendSuffix(String str, String str2) {
        if (str != null && str2 != null) {
            return m23849g(new C13018g(str, str2));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder append(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        if (periodPrinter == null && periodParser == null) {
            throw new IllegalArgumentException("No printer or parser supplied");
        }
        m23848h();
        m23854b(periodPrinter, periodParser);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return m23851e(new C13019h(strArr, strArr2));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSuffix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return m23849g(new C13019h(strArr, strArr2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$c */
    /* loaded from: classes5.dex */
    public static class C13014c implements PeriodPrinter, PeriodParser {

        /* renamed from: a */
        public final int f76312a;

        /* renamed from: b */
        public final int f76313b;

        /* renamed from: c */
        public final int f76314c;

        /* renamed from: d */
        public final boolean f76315d;

        /* renamed from: e */
        public final int f76316e;

        /* renamed from: f */
        public final C13014c[] f76317f;

        /* renamed from: g */
        public final InterfaceC13017f f76318g;

        /* renamed from: h */
        public final InterfaceC13017f f76319h;

        public C13014c(int i, int i2, int i3, boolean z, int i4, C13014c[] c13014cArr, InterfaceC13017f interfaceC13017f, InterfaceC13017f interfaceC13017f2) {
            this.f76312a = i;
            this.f76313b = i2;
            this.f76314c = i3;
            this.f76315d = z;
            this.f76316e = i4;
            this.f76317f = c13014cArr;
            this.f76318g = interfaceC13017f;
            this.f76319h = interfaceC13017f2;
        }

        /* renamed from: a */
        public void m23843a(C13014c[] c13014cArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (C13014c c13014c : c13014cArr) {
                if (c13014c != null && !equals(c13014c)) {
                    hashSet.add(c13014c.f76318g);
                    hashSet2.add(c13014c.f76319h);
                }
            }
            InterfaceC13017f interfaceC13017f = this.f76318g;
            if (interfaceC13017f != null) {
                interfaceC13017f.mo23835g(hashSet);
            }
            InterfaceC13017f interfaceC13017f2 = this.f76319h;
            if (interfaceC13017f2 != null) {
                interfaceC13017f2.mo23835g(hashSet2);
            }
        }

        /* renamed from: b */
        public int m23842b() {
            return this.f76316e;
        }

        /* renamed from: c */
        public long m23841c(ReadablePeriod readablePeriod) {
            PeriodType periodType;
            int i;
            long j;
            if (this.f76313b == 4) {
                periodType = null;
            } else {
                periodType = readablePeriod.getPeriodType();
            }
            if (periodType != null && !m23840d(periodType, this.f76316e)) {
                return Long.MAX_VALUE;
            }
            switch (this.f76316e) {
                case 0:
                    i = readablePeriod.get(DurationFieldType.years());
                    j = i;
                    break;
                case 1:
                    i = readablePeriod.get(DurationFieldType.months());
                    j = i;
                    break;
                case 2:
                    i = readablePeriod.get(DurationFieldType.weeks());
                    j = i;
                    break;
                case 3:
                    i = readablePeriod.get(DurationFieldType.days());
                    j = i;
                    break;
                case 4:
                    i = readablePeriod.get(DurationFieldType.hours());
                    j = i;
                    break;
                case 5:
                    i = readablePeriod.get(DurationFieldType.minutes());
                    j = i;
                    break;
                case 6:
                    i = readablePeriod.get(DurationFieldType.seconds());
                    j = i;
                    break;
                case 7:
                    i = readablePeriod.get(DurationFieldType.millis());
                    j = i;
                    break;
                case 8:
                case 9:
                    j = (readablePeriod.get(DurationFieldType.seconds()) * 1000) + readablePeriod.get(DurationFieldType.millis());
                    break;
                default:
                    return Long.MAX_VALUE;
            }
            if (j == 0) {
                int i2 = this.f76313b;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 5) {
                            return Long.MAX_VALUE;
                        }
                    } else {
                        if (m23839e(readablePeriod)) {
                            C13014c[] c13014cArr = this.f76317f;
                            int i3 = this.f76316e;
                            if (c13014cArr[i3] == this) {
                                for (int i4 = i3 + 1; i4 <= 9; i4++) {
                                    if (m23840d(periodType, i4) && this.f76317f[i4] != null) {
                                        return Long.MAX_VALUE;
                                    }
                                }
                            }
                        }
                        return Long.MAX_VALUE;
                    }
                } else {
                    if (m23839e(readablePeriod)) {
                        C13014c[] c13014cArr2 = this.f76317f;
                        int i5 = this.f76316e;
                        if (c13014cArr2[i5] == this) {
                            int min = Math.min(i5, 8);
                            while (true) {
                                min--;
                                if (min >= 0 && min <= 9) {
                                    if (!m23840d(periodType, min) || this.f76317f[min] == null) {
                                    }
                                }
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                }
            }
            return j;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            int i;
            long m23841c = m23841c(readablePeriod);
            if (m23841c == Long.MAX_VALUE) {
                return 0;
            }
            int max = Math.max(FormatUtils.calculateDigitCount(m23841c), this.f76312a);
            if (this.f76316e >= 8) {
                if (m23841c < 0) {
                    i = 5;
                } else {
                    i = 4;
                }
                int max2 = Math.max(max, i);
                int i2 = max2 + 1;
                if (this.f76316e == 9 && Math.abs(m23841c) % 1000 == 0) {
                    max = max2 - 3;
                } else {
                    max = i2;
                }
                m23841c /= 1000;
            }
            int i3 = (int) m23841c;
            InterfaceC13017f interfaceC13017f = this.f76318g;
            if (interfaceC13017f != null) {
                max += interfaceC13017f.mo23826d(i3);
            }
            InterfaceC13017f interfaceC13017f2 = this.f76319h;
            if (interfaceC13017f2 != null) {
                return max + interfaceC13017f2.mo23826d(i3);
            }
            return max;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            if (i <= 0) {
                return 0;
            }
            if (this.f76313b != 4 && m23841c(readablePeriod) == Long.MAX_VALUE) {
                return 0;
            }
            return 1;
        }

        /* renamed from: d */
        public boolean m23840d(PeriodType periodType, int i) {
            switch (i) {
                case 0:
                    return periodType.isSupported(DurationFieldType.years());
                case 1:
                    return periodType.isSupported(DurationFieldType.months());
                case 2:
                    return periodType.isSupported(DurationFieldType.weeks());
                case 3:
                    return periodType.isSupported(DurationFieldType.days());
                case 4:
                    return periodType.isSupported(DurationFieldType.hours());
                case 5:
                    return periodType.isSupported(DurationFieldType.minutes());
                case 6:
                    return periodType.isSupported(DurationFieldType.seconds());
                case 7:
                    return periodType.isSupported(DurationFieldType.millis());
                case 8:
                case 9:
                    if (!periodType.isSupported(DurationFieldType.seconds()) && !periodType.isSupported(DurationFieldType.millis())) {
                        return false;
                    }
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: e */
        public boolean m23839e(ReadablePeriod readablePeriod) {
            int size = readablePeriod.size();
            for (int i = 0; i < size; i++) {
                if (readablePeriod.getValue(i) != 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int m23838f(String str, int i, int i2) {
            if (i2 >= 10) {
                return Integer.parseInt(str.substring(i, i2 + i));
            }
            boolean z = false;
            if (i2 <= 0) {
                return 0;
            }
            int i3 = i + 1;
            char charAt = str.charAt(i);
            int i4 = i2 - 1;
            if (charAt == '-') {
                i4 = i2 - 2;
                if (i4 < 0) {
                    return 0;
                }
                charAt = str.charAt(i3);
                z = true;
                i3 = i + 2;
            }
            int i5 = charAt - '0';
            while (true) {
                int i6 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                i4 = i6;
                i3++;
                i5 = (((i5 << 3) + (i5 << 1)) + str.charAt(i3)) - 48;
            }
            if (z) {
                return -i5;
            }
            return i5;
        }

        /* renamed from: g */
        public void m23837g(ReadWritablePeriod readWritablePeriod, int i, int i2) {
            switch (i) {
                case 0:
                    readWritablePeriod.setYears(i2);
                    return;
                case 1:
                    readWritablePeriod.setMonths(i2);
                    return;
                case 2:
                    readWritablePeriod.setWeeks(i2);
                    return;
                case 3:
                    readWritablePeriod.setDays(i2);
                    return;
                case 4:
                    readWritablePeriod.setHours(i2);
                    return;
                case 5:
                    readWritablePeriod.setMinutes(i2);
                    return;
                case 6:
                    readWritablePeriod.setSeconds(i2);
                    return;
                case 7:
                    readWritablePeriod.setMillis(i2);
                    return;
                default:
                    return;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ac, code lost:
            if (r15 > '9') goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00ae, code lost:
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00d9, code lost:
            return ~r3;
         */
        @Override // org.joda.time.format.PeriodParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.ReadWritablePeriod r17, java.lang.String r18, int r19, java.util.Locale r20) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.C13014c.parseInto(org.joda.time.ReadWritablePeriod, java.lang.String, int, java.util.Locale):int");
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            long m23841c = m23841c(readablePeriod);
            if (m23841c == Long.MAX_VALUE) {
                return;
            }
            int i = (int) m23841c;
            if (this.f76316e >= 8) {
                i = (int) (m23841c / 1000);
            }
            InterfaceC13017f interfaceC13017f = this.f76318g;
            if (interfaceC13017f != null) {
                interfaceC13017f.mo23827c(stringBuffer, i);
            }
            int length = stringBuffer.length();
            int i2 = this.f76312a;
            if (i2 <= 1) {
                FormatUtils.appendUnpaddedInteger(stringBuffer, i);
            } else {
                FormatUtils.appendPaddedInteger(stringBuffer, i, i2);
            }
            if (this.f76316e >= 8) {
                int abs = (int) (Math.abs(m23841c) % 1000);
                if (this.f76316e == 8 || abs > 0) {
                    if (m23841c < 0 && m23841c > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    FormatUtils.appendPaddedInteger(stringBuffer, abs, 3);
                }
            }
            InterfaceC13017f interfaceC13017f2 = this.f76319h;
            if (interfaceC13017f2 != null) {
                interfaceC13017f2.mo23827c(stringBuffer, i);
            }
        }

        public C13014c(C13014c c13014c, InterfaceC13017f interfaceC13017f) {
            this.f76312a = c13014c.f76312a;
            this.f76313b = c13014c.f76313b;
            this.f76314c = c13014c.f76314c;
            this.f76315d = c13014c.f76315d;
            this.f76316e = c13014c.f76316e;
            this.f76317f = c13014c.f76317f;
            this.f76318g = c13014c.f76318g;
            InterfaceC13017f interfaceC13017f2 = c13014c.f76319h;
            this.f76319h = interfaceC13017f2 != null ? new C13013b(interfaceC13017f2, interfaceC13017f) : interfaceC13017f;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            long m23841c = m23841c(readablePeriod);
            if (m23841c == Long.MAX_VALUE) {
                return;
            }
            int i = (int) m23841c;
            if (this.f76316e >= 8) {
                i = (int) (m23841c / 1000);
            }
            InterfaceC13017f interfaceC13017f = this.f76318g;
            if (interfaceC13017f != null) {
                interfaceC13017f.mo23825e(writer, i);
            }
            int i2 = this.f76312a;
            if (i2 <= 1) {
                FormatUtils.writeUnpaddedInteger(writer, i);
            } else {
                FormatUtils.writePaddedInteger(writer, i, i2);
            }
            if (this.f76316e >= 8) {
                int abs = (int) (Math.abs(m23841c) % 1000);
                if (this.f76316e == 8 || abs > 0) {
                    writer.write(46);
                    FormatUtils.writePaddedInteger(writer, abs, 3);
                }
            }
            InterfaceC13017f interfaceC13017f2 = this.f76319h;
            if (interfaceC13017f2 != null) {
                interfaceC13017f2.mo23825e(writer, i);
            }
        }
    }

    /* renamed from: org.joda.time.format.PeriodFormatterBuilder$i */
    /* loaded from: classes5.dex */
    public static class C13021i implements PeriodPrinter, PeriodParser {

        /* renamed from: a */
        public final String f76329a;

        /* renamed from: b */
        public final String f76330b;

        /* renamed from: c */
        public final String[] f76331c;

        /* renamed from: d */
        public final boolean f76332d;

        /* renamed from: e */
        public final boolean f76333e;

        /* renamed from: f */
        public final PeriodPrinter f76334f;

        /* renamed from: g */
        public volatile PeriodPrinter f76335g;

        /* renamed from: h */
        public final PeriodParser f76336h;

        /* renamed from: i */
        public volatile PeriodParser f76337i;

        public C13021i(String str, String str2, String[] strArr, PeriodPrinter periodPrinter, PeriodParser periodParser, boolean z, boolean z2) {
            this.f76329a = str;
            this.f76330b = str2;
            if ((str2 != null && !str.equals(str2)) || (strArr != null && strArr.length != 0)) {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        }
                        treeSet.add(strArr[length]);
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.f76331c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } else {
                this.f76331c = new String[]{str};
            }
            this.f76334f = periodPrinter;
            this.f76336h = periodParser;
            this.f76332d = z;
            this.f76333e = z2;
        }

        /* renamed from: c */
        public C13021i m23830c(PeriodPrinter periodPrinter, PeriodParser periodParser) {
            this.f76335g = periodPrinter;
            this.f76337i = periodParser;
            return this;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            int length;
            String str;
            PeriodPrinter periodPrinter = this.f76334f;
            PeriodPrinter periodPrinter2 = this.f76335g;
            int calculatePrintedLength = periodPrinter.calculatePrintedLength(readablePeriod, locale) + periodPrinter2.calculatePrintedLength(readablePeriod, locale);
            if (this.f76332d) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.f76333e) {
                        int countFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (countFieldsToPrint > 0) {
                            if (countFieldsToPrint > 1) {
                                str = this.f76329a;
                            } else {
                                str = this.f76330b;
                            }
                            length = str.length();
                        } else {
                            return calculatePrintedLength;
                        }
                    } else {
                        length = this.f76329a.length();
                    }
                } else {
                    return calculatePrintedLength;
                }
            } else if (this.f76333e && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                length = this.f76329a.length();
            } else {
                return calculatePrintedLength;
            }
            return calculatePrintedLength + length;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i, Locale locale) {
            int countFieldsToPrint = this.f76334f.countFieldsToPrint(readablePeriod, i, locale);
            if (countFieldsToPrint < i) {
                return countFieldsToPrint + this.f76335g.countFieldsToPrint(readablePeriod, i, locale);
            }
            return countFieldsToPrint;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
        @Override // org.joda.time.format.PeriodParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.ReadWritablePeriod r12, java.lang.String r13, int r14, java.util.Locale r15) {
            /*
                r11 = this;
                org.joda.time.format.PeriodParser r0 = r11.f76336h
                int r0 = r0.parseInto(r12, r13, r14, r15)
                if (r0 >= 0) goto L9
                return r0
            L9:
                r7 = 0
                if (r0 <= r14) goto L3b
                java.lang.String[] r14 = r11.f76331c
                int r8 = r14.length
                r9 = 0
            L10:
                if (r9 >= r8) goto L3b
                r10 = r14[r9]
                if (r10 == 0) goto L2f
                int r1 = r10.length()
                if (r1 == 0) goto L2f
                r5 = 0
                int r6 = r10.length()
                r2 = 1
                r1 = r13
                r3 = r0
                r4 = r10
                boolean r1 = r1.regionMatches(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L2c
                goto L2f
            L2c:
                int r9 = r9 + 1
                goto L10
            L2f:
                if (r10 != 0) goto L32
                goto L36
            L32:
                int r7 = r10.length()
            L36:
                int r0 = r0 + r7
                r14 = 1
                r14 = r7
                r7 = 1
                goto L3c
            L3b:
                r14 = -1
            L3c:
                org.joda.time.format.PeriodParser r1 = r11.f76337i
                int r12 = r1.parseInto(r12, r13, r0, r15)
                if (r12 >= 0) goto L45
                return r12
            L45:
                if (r7 == 0) goto L4d
                if (r12 != r0) goto L4d
                if (r14 <= 0) goto L4d
                int r12 = ~r0
                return r12
            L4d:
                if (r12 <= r0) goto L56
                if (r7 != 0) goto L56
                boolean r13 = r11.f76332d
                if (r13 != 0) goto L56
                int r12 = ~r0
            L56:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.C13021i.parseInto(org.joda.time.ReadWritablePeriod, java.lang.String, int, java.util.Locale):int");
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.f76334f;
            PeriodPrinter periodPrinter2 = this.f76335g;
            periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            if (this.f76332d) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.f76333e) {
                        int countFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (countFieldsToPrint > 0) {
                            stringBuffer.append(countFieldsToPrint > 1 ? this.f76329a : this.f76330b);
                        }
                    } else {
                        stringBuffer.append(this.f76329a);
                    }
                }
            } else if (this.f76333e && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                stringBuffer.append(this.f76329a);
            }
            periodPrinter2.printTo(stringBuffer, readablePeriod, locale);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.f76334f;
            PeriodPrinter periodPrinter2 = this.f76335g;
            periodPrinter.printTo(writer, readablePeriod, locale);
            if (this.f76332d) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.f76333e) {
                        int countFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (countFieldsToPrint > 0) {
                            writer.write(countFieldsToPrint > 1 ? this.f76329a : this.f76330b);
                        }
                    } else {
                        writer.write(this.f76329a);
                    }
                }
            } else if (this.f76333e && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                writer.write(this.f76329a);
            }
            periodPrinter2.printTo(writer, readablePeriod, locale);
        }
    }
}
