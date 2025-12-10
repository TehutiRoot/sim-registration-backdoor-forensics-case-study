package org.joda.time.p045tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.DateTimeUtils;

/* renamed from: org.joda.time.tz.DefaultNameProvider */
/* loaded from: classes5.dex */
public class DefaultNameProvider implements NameProvider {

    /* renamed from: a */
    public HashMap f76369a = m23780a();

    /* renamed from: b */
    public HashMap f76370b = m23780a();

    /* renamed from: a */
    public final HashMap m23780a() {
        return new HashMap(7);
    }

    /* renamed from: b */
    public final synchronized String[] m23779b(Locale locale, String str, String str2) {
        Object[] objArr;
        Object[] objArr2 = null;
        if (locale == null || str == null || str2 == null) {
            return null;
        }
        try {
            Map map = (Map) this.f76369a.get(locale);
            if (map == null) {
                HashMap hashMap = this.f76369a;
                HashMap m23780a = m23780a();
                hashMap.put(locale, m23780a);
                map = m23780a;
            }
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = m23780a();
                map.put(str, map2);
                Object[][] zoneStrings = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        objArr = zoneStrings[i];
                        if (objArr != null && objArr.length >= 5 && str.equals(objArr[0])) {
                            break;
                        }
                        i++;
                    } else {
                        objArr = null;
                        break;
                    }
                }
                Object[][] zoneStrings2 = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        Object[] objArr3 = zoneStrings2[i2];
                        if (objArr3 != null && objArr3.length >= 5 && str.equals(objArr3[0])) {
                            objArr2 = objArr3;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                if (objArr != null && objArr2 != null) {
                    map2.put(objArr[2], new String[]{objArr2[2], objArr2[1]});
                    if (objArr[2].equals(objArr[4])) {
                        map2.put(objArr[4] + "-Summer", new String[]{objArr2[4], objArr2[3]});
                    } else {
                        map2.put(objArr[4], new String[]{objArr2[4], objArr2[3]});
                    }
                }
            }
            return (String[]) map2.get(str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final synchronized String[] m23778c(Locale locale, String str, String str2, boolean z) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == null || str2 == null) {
            return null;
        }
        try {
            if (str.startsWith("Etc/")) {
                str = str.substring(4);
            }
            Map map = (Map) this.f76370b.get(locale);
            if (map == null) {
                HashMap hashMap = this.f76370b;
                HashMap m23780a = m23780a();
                hashMap.put(locale, m23780a);
                map = m23780a;
            }
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = m23780a();
                map.put(str, map2);
                String[][] zoneStrings = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        strArr = zoneStrings[i];
                        if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                            break;
                        }
                        i++;
                    } else {
                        strArr = null;
                        break;
                    }
                }
                String[][] zoneStrings2 = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        String[] strArr3 = zoneStrings2[i2];
                        if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                            strArr2 = strArr3;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    map2.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                    map2.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                }
            }
            return (String[]) map2.get(Boolean.valueOf(z));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.joda.time.p045tz.NameProvider
    public String getName(Locale locale, String str, String str2) {
        String[] m23779b = m23779b(locale, str, str2);
        if (m23779b == null) {
            return null;
        }
        return m23779b[1];
    }

    @Override // org.joda.time.p045tz.NameProvider
    public String getShortName(Locale locale, String str, String str2) {
        String[] m23779b = m23779b(locale, str, str2);
        if (m23779b == null) {
            return null;
        }
        return m23779b[0];
    }

    public String getName(Locale locale, String str, String str2, boolean z) {
        String[] m23778c = m23778c(locale, str, str2, z);
        if (m23778c == null) {
            return null;
        }
        return m23778c[1];
    }

    public String getShortName(Locale locale, String str, String str2, boolean z) {
        String[] m23778c = m23778c(locale, str, str2, z);
        if (m23778c == null) {
            return null;
        }
        return m23778c[0];
    }
}
