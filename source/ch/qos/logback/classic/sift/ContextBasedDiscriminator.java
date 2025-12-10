package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.AbstractDiscriminator;

/* loaded from: classes.dex */
public class ContextBasedDiscriminator extends AbstractDiscriminator<ILoggingEvent> {

    /* renamed from: c */
    public String f39635c;

    public String getDefaultValue() {
        return this.f39635c;
    }

    @Override // ch.qos.logback.core.sift.Discriminator
    public String getDiscriminatingValue(ILoggingEvent iLoggingEvent) {
        String name = iLoggingEvent.getLoggerContextVO().getName();
        return name == null ? this.f39635c : name;
    }

    @Override // ch.qos.logback.core.sift.Discriminator
    public String getKey() {
        return "contextName";
    }

    public void setDefaultValue(String str) {
        this.f39635c = str;
    }

    public void setKey(String str) {
        throw new UnsupportedOperationException("Key cannot be set. Using fixed key contextName");
    }
}
