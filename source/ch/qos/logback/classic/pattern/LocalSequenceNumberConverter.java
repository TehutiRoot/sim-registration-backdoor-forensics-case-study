package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class LocalSequenceNumberConverter extends ClassicConverter {

    /* renamed from: e */
    public AtomicLong f39614e = new AtomicLong(System.currentTimeMillis());

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        return Long.toString(this.f39614e.getAndIncrement());
    }
}
