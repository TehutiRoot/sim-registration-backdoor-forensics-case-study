package ch.qos.logback.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class CachingDateFormatter {

    /* renamed from: a */
    public long f40158a;

    /* renamed from: b */
    public String f40159b;

    /* renamed from: c */
    public final SimpleDateFormat f40160c;

    public CachingDateFormatter(String str) {
        this(str, Locale.US);
    }

    public final String format(long j) {
        String str;
        synchronized (this) {
            try {
                if (j != this.f40158a) {
                    this.f40158a = j;
                    this.f40159b = this.f40160c.format(new Date(j));
                }
                str = this.f40159b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.f40160c.setTimeZone(timeZone);
    }

    public CachingDateFormatter(String str, Locale locale) {
        this.f40158a = -1L;
        this.f40159b = null;
        this.f40160c = new SimpleDateFormat(str, locale);
    }
}
