package p000;

import androidx.annotation.DoNotInline;
import androidx.core.p005os.LocaleListCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* renamed from: ak0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C19097ak0 implements InterfaceC19794ek0 {

    /* renamed from: c */
    public static final Locale[] f8498c = new Locale[0];

    /* renamed from: d */
    public static final Locale f8499d = new Locale(LanguageSupport.LANG_EN, "XA");

    /* renamed from: e */
    public static final Locale f8500e = new Locale("ar", "XB");

    /* renamed from: f */
    public static final Locale f8501f = LocaleListCompat.m57137a("en-Latn");

    /* renamed from: a */
    public final Locale[] f8502a;

    /* renamed from: b */
    public final String f8503b;

    /* renamed from: ak0$a */
    /* loaded from: classes2.dex */
    public static class C1896a {
        @DoNotInline
        /* renamed from: a */
        public static String m65056a(Locale locale) {
            return locale.getScript();
        }
    }

    public C19097ak0(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f8502a = f8498c;
            this.f8503b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m65057k(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f8502a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f8503b = sb.toString();
    }

    /* renamed from: h */
    public static String m65060h(Locale locale) {
        String m65056a = C1896a.m65056a(locale);
        if (!m65056a.isEmpty()) {
            return m65056a;
        }
        return "";
    }

    /* renamed from: i */
    public static boolean m65059i(Locale locale) {
        if (!f8499d.equals(locale) && !f8500e.equals(locale)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static int m65058j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m65059i(locale) || m65059i(locale2)) {
            return 0;
        }
        String m65060h = m65060h(locale);
        if (m65060h.isEmpty()) {
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return 1;
            }
            return 0;
        }
        return m65060h.equals(m65060h(locale2)) ? 1 : 0;
    }

    /* renamed from: k */
    public static void m65057k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    @Override // p000.InterfaceC19794ek0
    /* renamed from: a */
    public String mo29155a() {
        return this.f8503b;
    }

    @Override // p000.InterfaceC19794ek0
    /* renamed from: b */
    public Object mo29154b() {
        return null;
    }

    @Override // p000.InterfaceC19794ek0
    /* renamed from: c */
    public Locale mo29153c(String[] strArr) {
        return m65063e(Arrays.asList(strArr), false);
    }

    @Override // p000.InterfaceC19794ek0
    /* renamed from: d */
    public int mo29152d(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f8502a;
            if (i < localeArr.length) {
                if (localeArr[i].equals(locale)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: e */
    public final Locale m65063e(Collection collection, boolean z) {
        int m65062f = m65062f(collection, z);
        if (m65062f == -1) {
            return null;
        }
        return this.f8502a[m65062f];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19097ak0)) {
            return false;
        }
        Locale[] localeArr = ((C19097ak0) obj).f8502a;
        if (this.f8502a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f8502a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L14;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m65062f(java.util.Collection r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f8502a
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = p000.C19097ak0.f8501f
            int r6 = r4.m65061g(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L21
        L1e:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L21:
            java.util.Iterator r5 = r5.iterator()
        L25:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.p005os.LocaleListCompat.m57137a(r1)
            int r1 = r4.m65061g(r1)
            if (r1 != 0) goto L3c
            return r3
        L3c:
            if (r1 >= r6) goto L25
            r6 = r1
            goto L25
        L40:
            if (r6 != r0) goto L43
            return r3
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C19097ak0.m65062f(java.util.Collection, boolean):int");
    }

    /* renamed from: g */
    public final int m65061g(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f8502a;
            if (i < localeArr.length) {
                if (m65058j(locale, localeArr[i]) > 0) {
                    return i;
                }
                i++;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    @Override // p000.InterfaceC19794ek0
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f8502a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.f8502a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // p000.InterfaceC19794ek0
    public boolean isEmpty() {
        if (this.f8502a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC19794ek0
    public int size() {
        return this.f8502a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f8502a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f8502a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}