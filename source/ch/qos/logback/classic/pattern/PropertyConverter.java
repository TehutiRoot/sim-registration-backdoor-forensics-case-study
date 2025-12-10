package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

/* loaded from: classes.dex */
public final class PropertyConverter extends ClassicConverter {

    /* renamed from: e */
    public String f39619e;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        if (this.f39619e == null) {
            return "Property_HAS_NO_KEY";
        }
        String str = iLoggingEvent.getLoggerContextVO().getPropertyMap().get(this.f39619e);
        return str != null ? str : System.getProperty(this.f39619e);
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String firstOption = getFirstOption();
        if (firstOption != null) {
            this.f39619e = firstOption;
            super.start();
        }
    }
}
