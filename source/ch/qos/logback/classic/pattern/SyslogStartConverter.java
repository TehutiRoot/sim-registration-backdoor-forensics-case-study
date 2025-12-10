package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.net.SyslogAppenderBase;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.http.message.TokenParser;

/* loaded from: classes.dex */
public class SyslogStartConverter extends ClassicConverter {

    /* renamed from: g */
    public SimpleDateFormat f39624g;

    /* renamed from: h */
    public SimpleDateFormat f39625h;

    /* renamed from: k */
    public int f39628k;

    /* renamed from: e */
    public long f39622e = -1;

    /* renamed from: f */
    public String f39623f = null;

    /* renamed from: i */
    public final Calendar f39626i = Calendar.getInstance(Locale.US);

    /* renamed from: j */
    public final String f39627j = "localhost";

    /* renamed from: a */
    public final String m51596a(long j) {
        String str;
        synchronized (this) {
            try {
                if (j / 1000 != this.f39622e) {
                    this.f39622e = j / 1000;
                    Date date = new Date(j);
                    this.f39626i.setTime(date);
                    this.f39623f = String.format(Locale.US, "%s %2d %s", this.f39624g.format(date), Integer.valueOf(this.f39626i.get(5)), this.f39625h.format(date));
                }
                str = this.f39623f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        return "<" + (this.f39628k + LevelToSyslogSeverity.convert(iLoggingEvent)) + ">" + m51596a(iLoggingEvent.getTimeStamp()) + TokenParser.f74560SP + "localhost" + TokenParser.f74560SP;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String firstOption = getFirstOption();
        if (firstOption == null) {
            addError("was expecting a facility string as an option");
            return;
        }
        this.f39628k = SyslogAppenderBase.facilityStringToint(firstOption);
        try {
            Locale locale = Locale.US;
            this.f39624g = new SimpleDateFormat("MMM", locale);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", locale);
            this.f39625h = simpleDateFormat;
            simpleDateFormat.setDateFormatSymbols(new DateFormatSymbols(locale));
            this.f39624g.setDateFormatSymbols(new DateFormatSymbols(locale));
            super.start();
        } catch (IllegalArgumentException e) {
            addError("Could not instantiate SimpleDateFormat", e);
        }
    }
}
