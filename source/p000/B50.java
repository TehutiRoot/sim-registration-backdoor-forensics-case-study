package p000;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.IllegalFieldValueException;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* renamed from: B50 */
/* loaded from: classes5.dex */
public class B50 {

    /* renamed from: p */
    public static ConcurrentMap f285p = new ConcurrentHashMap();

    /* renamed from: a */
    public final String[] f286a;

    /* renamed from: b */
    public final String[] f287b;

    /* renamed from: c */
    public final String[] f288c;

    /* renamed from: d */
    public final String[] f289d;

    /* renamed from: e */
    public final String[] f290e;

    /* renamed from: f */
    public final String[] f291f;

    /* renamed from: g */
    public final TreeMap f292g;

    /* renamed from: h */
    public final TreeMap f293h;

    /* renamed from: i */
    public final TreeMap f294i;

    /* renamed from: j */
    public final int f295j;

    /* renamed from: k */
    public final int f296k;

    /* renamed from: l */
    public final int f297l;

    /* renamed from: m */
    public final int f298m;

    /* renamed from: n */
    public final int f299n;

    /* renamed from: o */
    public final int f300o;

    public B50(Locale locale) {
        DateFormatSymbols dateFormatSymbols = DateTimeUtils.getDateFormatSymbols(locale);
        this.f286a = dateFormatSymbols.getEras();
        this.f287b = m69001u(dateFormatSymbols.getWeekdays());
        this.f288c = m69001u(dateFormatSymbols.getShortWeekdays());
        this.f289d = m69000v(dateFormatSymbols.getMonths());
        this.f290e = m69000v(dateFormatSymbols.getShortMonths());
        this.f291f = dateFormatSymbols.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap treeMap = new TreeMap(comparator);
        this.f292g = treeMap;
        m69020b(treeMap, this.f286a, numArr);
        if (LanguageSupport.LANG_EN.equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap treeMap2 = new TreeMap(comparator);
        this.f293h = treeMap2;
        m69020b(treeMap2, this.f287b, numArr);
        m69020b(treeMap2, this.f288c, numArr);
        m69021a(treeMap2, 1, 7, numArr);
        TreeMap treeMap3 = new TreeMap(comparator);
        this.f294i = treeMap3;
        m69020b(treeMap3, this.f289d, numArr);
        m69020b(treeMap3, this.f290e, numArr);
        m69021a(treeMap3, 1, 12, numArr);
        this.f295j = m69005q(this.f286a);
        this.f296k = m69005q(this.f287b);
        this.f297l = m69005q(this.f288c);
        this.f298m = m69005q(this.f289d);
        this.f299n = m69005q(this.f290e);
        this.f300o = m69005q(this.f291f);
    }

    /* renamed from: a */
    public static void m69021a(TreeMap treeMap, int i, int i2, Integer[] numArr) {
        while (i <= i2) {
            treeMap.put(String.valueOf(i).intern(), numArr[i]);
            i++;
        }
    }

    /* renamed from: b */
    public static void m69020b(TreeMap treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                String str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public static B50 m69014h(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        B50 b50 = (B50) f285p.get(locale);
        if (b50 == null) {
            B50 b502 = new B50(locale);
            B50 b503 = (B50) f285p.putIfAbsent(locale, b502);
            if (b503 != null) {
                return b503;
            }
            return b502;
        }
        return b50;
    }

    /* renamed from: q */
    public static int m69005q(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 >= 0) {
                String str = strArr[length2];
                if (str != null && (length = str.length()) > i) {
                    i = length;
                }
            } else {
                return i;
            }
        }
    }

    /* renamed from: u */
    public static String[] m69001u(String[] strArr) {
        int i;
        String[] strArr2 = new String[8];
        for (int i2 = 1; i2 < 8; i2++) {
            if (i2 < 7) {
                i = i2 + 1;
            } else {
                i = 1;
            }
            strArr2[i2] = strArr[i];
        }
        return strArr2;
    }

    /* renamed from: v */
    public static String[] m69000v(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    /* renamed from: c */
    public int m69019c(String str) {
        Integer num = (Integer) this.f293h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), str);
    }

    /* renamed from: d */
    public String m69018d(int i) {
        return this.f288c[i];
    }

    /* renamed from: e */
    public String m69017e(int i) {
        return this.f287b[i];
    }

    /* renamed from: f */
    public int m69016f(String str) {
        Integer num = (Integer) this.f292g.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }

    /* renamed from: g */
    public String m69015g(int i) {
        return this.f286a[i];
    }

    /* renamed from: i */
    public int m69013i() {
        return this.f297l;
    }

    /* renamed from: j */
    public int m69012j() {
        return this.f296k;
    }

    /* renamed from: k */
    public int m69011k() {
        return this.f295j;
    }

    /* renamed from: l */
    public int m69010l() {
        return this.f300o;
    }

    /* renamed from: m */
    public int m69009m() {
        return this.f299n;
    }

    /* renamed from: n */
    public int m69008n() {
        return this.f298m;
    }

    /* renamed from: o */
    public int m69007o(String str) {
        String[] strArr = this.f291f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.halfdayOfDay(), str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    /* renamed from: p */
    public String m69006p(int i) {
        return this.f291f[i];
    }

    /* renamed from: r */
    public int m69004r(String str) {
        Integer num = (Integer) this.f294i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), str);
    }

    /* renamed from: s */
    public String m69003s(int i) {
        return this.f290e[i];
    }

    /* renamed from: t */
    public String m69002t(int i) {
        return this.f289d[i];
    }
}
