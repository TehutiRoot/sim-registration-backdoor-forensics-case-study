package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.AbstractDiscriminator;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

/* loaded from: classes.dex */
public class MDCBasedDiscriminator extends AbstractDiscriminator<ILoggingEvent> {

    /* renamed from: c */
    public String f39634c;

    /* renamed from: d */
    public String f39635d;

    public String getDefaultValue() {
        return this.f39635d;
    }

    @Override // ch.qos.logback.core.sift.Discriminator
    public String getDiscriminatingValue(ILoggingEvent iLoggingEvent) {
        String str;
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        return (mDCPropertyMap == null || (str = mDCPropertyMap.get(this.f39634c)) == null) ? this.f39635d : str;
    }

    @Override // ch.qos.logback.core.sift.Discriminator
    public String getKey() {
        return this.f39634c;
    }

    public void setDefaultValue(String str) {
        this.f39635d = str;
    }

    public void setKey(String str) {
        this.f39634c = str;
    }

    @Override // ch.qos.logback.core.sift.AbstractDiscriminator, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i;
        if (OptionHelper.isEmpty(this.f39634c)) {
            addError("The \"Key\" property must be set");
            i = 1;
        } else {
            i = 0;
        }
        if (OptionHelper.isEmpty(this.f39635d)) {
            i++;
            addError("The \"DefaultValue\" property must be set");
        }
        if (i == 0) {
            this.started = true;
        }
    }
}