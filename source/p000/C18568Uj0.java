package p000;

import androidx.annotation.DoNotInline;
import androidx.core.p005os.LocaleListCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* renamed from: Uj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18568Uj0 implements InterfaceC18824Yj0 {

    /* renamed from: c */
    public static final Locale[] f6418c = new Locale[0];

    /* renamed from: d */
    public static final Locale f6419d = new Locale(LanguageSupport.LANG_EN, "XA");

    /* renamed from: e */
    public static final Locale f6420e = new Locale("ar", "XB");

    /* renamed from: f */
    public static final Locale f6421f = LocaleListCompat.m57187a("en-Latn");

    /* renamed from: a */
    public final Locale[] f6422a;

    /* renamed from: b */
    public final String f6423b;

    /* renamed from: Uj0$a */
    /* loaded from: classes2.dex */
    public static class C1483a {
        @DoNotInline
        /* renamed from: a */
        public static String m65976a(Locale locale) {
            return locale.getScript();
        }
    }

    public C18568Uj0(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f6422a = f6418c;
            this.f6423b = "";
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
                    m65977k(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f6422a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f6423b = sb.toString();
    }

    /* renamed from: h */
    public static String m65980h(Locale locale) {
        String m65976a = C1483a.m65976a(locale);
        if (!m65976a.isEmpty()) {
            return m65976a;
        }
        return "";
    }

    /* renamed from: i */
    public static boolean m65979i(Locale locale) {
        if (!f6419d.equals(locale) && !f6420e.equals(locale)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static int m65978j(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m65979i(locale) || m65979i(locale2)) {
            return 0;
        }
        String m65980h = m65980h(locale);
        if (m65980h.isEmpty()) {
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return 1;
            }
            return 0;
        }
        return m65980h.equals(m65980h(locale2)) ? 1 : 0;
    }

    /* renamed from: k */
    public static void m65977k(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    @Override // p000.InterfaceC18824Yj0
    /* renamed from: a */
    public String mo31497a() {
        return this.f6423b;
    }

    @Override // p000.InterfaceC18824Yj0
    /* renamed from: b */
    public Object mo31496b() {
        return null;
    }

    @Override // p000.InterfaceC18824Yj0
    /* renamed from: c */
    public Locale mo31495c(String[] strArr) {
        return m65983e(Arrays.asList(strArr), false);
    }

    @Override // p000.InterfaceC18824Yj0
    /* renamed from: d */
    public int mo31494d(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f6422a;
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
    public final Locale m65983e(Collection collection, boolean z) {
        int m65982f = m65982f(collection, z);
        if (m65982f == -1) {
            return null;
        }
        return this.f6422a[m65982f];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18568Uj0)) {
            return false;
        }
        Locale[] localeArr = ((C18568Uj0) obj).f6422a;
        if (this.f6422a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f6422a;
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
    public final int m65982f(java.util.Collection r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f6422a
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
            java.util.Locale r6 = p000.C18568Uj0.f6421f
            int r6 = r4.m65981g(r6)
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
            java.util.Locale r1 = androidx.core.p005os.LocaleListCompat.m57187a(r1)
            int r1 = r4.m65981g(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C18568Uj0.m65982f(java.util.Collection, boolean):int");
    }

    /* renamed from: g */
    public final int m65981g(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f6422a;
            if (i < localeArr.length) {
                if (m65978j(locale, localeArr[i]) > 0) {
                    return i;
                }
                i++;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    @Override // p000.InterfaceC18824Yj0
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f6422a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.f6422a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // p000.InterfaceC18824Yj0
    public boolean isEmpty() {
        if (this.f6422a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC18824Yj0
    public int size() {
        return this.f6422a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f6422a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f6422a.length - 1) {
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
