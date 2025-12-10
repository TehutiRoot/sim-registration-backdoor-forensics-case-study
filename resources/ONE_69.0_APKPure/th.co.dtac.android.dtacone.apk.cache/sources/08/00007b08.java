package ch.qos.logback.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class CachingDateFormatter {

    /* renamed from: a */
    public long f40156a;

    /* renamed from: b */
    public String f40157b;

    /* renamed from: c */
    public final SimpleDateFormat f40158c;

    public CachingDateFormatter(String str) {
        this(str, Locale.US);
    }

    public final String format(long j) {
        String str;
        synchronized (this) {
            try {
                if (j != this.f40156a) {
                    this.f40156a = j;
                    this.f40157b = this.f40158c.format(new Date(j));
                }
                str = this.f40157b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.f40158c.setTimeZone(timeZone);
    }

    public CachingDateFormatter(String str, Locale locale) {
        this.f40156a = -1L;
        this.f40157b = null;
        this.f40158c = new SimpleDateFormat(str, locale);
    }
}