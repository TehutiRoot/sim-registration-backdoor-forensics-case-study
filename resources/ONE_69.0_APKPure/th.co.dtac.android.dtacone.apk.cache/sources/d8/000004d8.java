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

/* renamed from: F50 */
/* loaded from: classes5.dex */
public class F50 {

    /* renamed from: p */
    public static ConcurrentMap f1568p = new ConcurrentHashMap();

    /* renamed from: a */
    public final String[] f1569a;

    /* renamed from: b */
    public final String[] f1570b;

    /* renamed from: c */
    public final String[] f1571c;

    /* renamed from: d */
    public final String[] f1572d;

    /* renamed from: e */
    public final String[] f1573e;

    /* renamed from: f */
    public final String[] f1574f;

    /* renamed from: g */
    public final TreeMap f1575g;

    /* renamed from: h */
    public final TreeMap f1576h;

    /* renamed from: i */
    public final TreeMap f1577i;

    /* renamed from: j */
    public final int f1578j;

    /* renamed from: k */
    public final int f1579k;

    /* renamed from: l */
    public final int f1580l;

    /* renamed from: m */
    public final int f1581m;

    /* renamed from: n */
    public final int f1582n;

    /* renamed from: o */
    public final int f1583o;

    public F50(Locale locale) {
        DateFormatSymbols dateFormatSymbols = DateTimeUtils.getDateFormatSymbols(locale);
        this.f1569a = dateFormatSymbols.getEras();
        this.f1570b = m68517u(dateFormatSymbols.getWeekdays());
        this.f1571c = m68517u(dateFormatSymbols.getShortWeekdays());
        this.f1572d = m68516v(dateFormatSymbols.getMonths());
        this.f1573e = m68516v(dateFormatSymbols.getShortMonths());
        this.f1574f = dateFormatSymbols.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap treeMap = new TreeMap(comparator);
        this.f1575g = treeMap;
        m68536b(treeMap, this.f1569a, numArr);
        if (LanguageSupport.LANG_EN.equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap treeMap2 = new TreeMap(comparator);
        this.f1576h = treeMap2;
        m68536b(treeMap2, this.f1570b, numArr);
        m68536b(treeMap2, this.f1571c, numArr);
        m68537a(treeMap2, 1, 7, numArr);
        TreeMap treeMap3 = new TreeMap(comparator);
        this.f1577i = treeMap3;
        m68536b(treeMap3, this.f1572d, numArr);
        m68536b(treeMap3, this.f1573e, numArr);
        m68537a(treeMap3, 1, 12, numArr);
        this.f1578j = m68521q(this.f1569a);
        this.f1579k = m68521q(this.f1570b);
        this.f1580l = m68521q(this.f1571c);
        this.f1581m = m68521q(this.f1572d);
        this.f1582n = m68521q(this.f1573e);
        this.f1583o = m68521q(this.f1574f);
    }

    /* renamed from: a */
    public static void m68537a(TreeMap treeMap, int i, int i2, Integer[] numArr) {
        while (i <= i2) {
            treeMap.put(String.valueOf(i).intern(), numArr[i]);
            i++;
        }
    }

    /* renamed from: b */
    public static void m68536b(TreeMap treeMap, String[] strArr, Integer[] numArr) {
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
    public static F50 m68530h(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        F50 f50 = (F50) f1568p.get(locale);
        if (f50 == null) {
            F50 f502 = new F50(locale);
            F50 f503 = (F50) f1568p.putIfAbsent(locale, f502);
            if (f503 != null) {
                return f503;
            }
            return f502;
        }
        return f50;
    }

    /* renamed from: q */
    public static int m68521q(String[] strArr) {
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
    public static String[] m68517u(String[] strArr) {
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
    public static String[] m68516v(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    /* renamed from: c */
    public int m68535c(String str) {
        Integer num = (Integer) this.f1576h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), str);
    }

    /* renamed from: d */
    public String m68534d(int i) {
        return this.f1571c[i];
    }

    /* renamed from: e */
    public String m68533e(int i) {
        return this.f1570b[i];
    }

    /* renamed from: f */
    public int m68532f(String str) {
        Integer num = (Integer) this.f1575g.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }

    /* renamed from: g */
    public String m68531g(int i) {
        return this.f1569a[i];
    }

    /* renamed from: i */
    public int m68529i() {
        return this.f1580l;
    }

    /* renamed from: j */
    public int m68528j() {
        return this.f1579k;
    }

    /* renamed from: k */
    public int m68527k() {
        return this.f1578j;
    }

    /* renamed from: l */
    public int m68526l() {
        return this.f1583o;
    }

    /* renamed from: m */
    public int m68525m() {
        return this.f1582n;
    }

    /* renamed from: n */
    public int m68524n() {
        return this.f1581m;
    }

    /* renamed from: o */
    public int m68523o(String str) {
        String[] strArr = this.f1574f;
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
    public String m68522p(int i) {
        return this.f1574f[i];
    }

    /* renamed from: r */
    public int m68520r(String str) {
        Integer num = (Integer) this.f1577i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), str);
    }

    /* renamed from: s */
    public String m68519s(int i) {
        return this.f1573e[i];
    }

    /* renamed from: t */
    public String m68518t(int i) {
        return this.f1572d[i];
    }
}