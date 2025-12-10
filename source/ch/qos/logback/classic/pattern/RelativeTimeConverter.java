package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

/* loaded from: classes.dex */
public class RelativeTimeConverter extends ClassicConverter {

    /* renamed from: e */
    public long f39620e = -1;

    /* renamed from: f */
    public String f39621f = null;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        String str;
        long timeStamp = iLoggingEvent.getTimeStamp();
        synchronized (this) {
            try {
                if (timeStamp != this.f39620e) {
                    this.f39620e = timeStamp;
                    this.f39621f = Long.toString(timeStamp - iLoggingEvent.getLoggerContextVO().getBirthTime());
                }
                str = this.f39621f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
