package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

/* loaded from: classes.dex */
public abstract class NamedConverter extends ClassicConverter {

    /* renamed from: e */
    public Abbreviator f39616e = null;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        String fullyQualifiedName = getFullyQualifiedName(iLoggingEvent);
        Abbreviator abbreviator = this.f39616e;
        return abbreviator == null ? fullyQualifiedName : abbreviator.abbreviate(fullyQualifiedName);
    }

    public abstract String getFullyQualifiedName(ILoggingEvent iLoggingEvent);

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String firstOption = getFirstOption();
        if (firstOption != null) {
            try {
                int parseInt = Integer.parseInt(firstOption);
                if (parseInt == 0) {
                    this.f39616e = new ClassNameOnlyAbbreviator();
                } else if (parseInt > 0) {
                    this.f39616e = new TargetLengthBasedClassNameAbbreviator(parseInt);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}