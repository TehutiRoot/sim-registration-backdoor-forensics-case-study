package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

/* loaded from: classes6.dex */
class DateUtil {
    private static Long ZERO = longValueOf(0);
    private static final Map localeCache = new HashMap();
    static Locale EN_Locale = forEN();

    public static Date epochAdjust(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = localeCache;
        synchronized (map) {
            try {
                Long l = (Long) map.get(locale);
                if (l == null) {
                    long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                    l = time == 0 ? ZERO : longValueOf(time);
                    map.put(locale, l);
                }
                if (l != ZERO) {
                    return new Date(date.getTime() - l.longValue());
                }
                return date;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Locale forEN() {
        if (LanguageSupport.LANG_EN.equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (int i = 0; i != availableLocales.length; i++) {
            if (LanguageSupport.LANG_EN.equalsIgnoreCase(availableLocales[i].getLanguage())) {
                return availableLocales[i];
            }
        }
        return Locale.getDefault();
    }

    private static Long longValueOf(long j) {
        return Long.valueOf(j);
    }
}