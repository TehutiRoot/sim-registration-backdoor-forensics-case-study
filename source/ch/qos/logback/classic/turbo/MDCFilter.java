package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import org.slf4j.MDC;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class MDCFilter extends MatchingFilter {

    /* renamed from: e */
    public String f39674e;

    /* renamed from: f */
    public String f39675f;

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th2) {
        if (isStarted()) {
            return this.f39675f.equals(MDC.get(this.f39674e)) ? this.onMatch : this.onMismatch;
        }
        return FilterReply.NEUTRAL;
    }

    public void setMDCKey(String str) {
        this.f39674e = str;
    }

    public void setValue(String str) {
        this.f39675f = str;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i;
        if (this.f39675f == null) {
            addError("'value' parameter is mandatory. Cannot start.");
            i = 1;
        } else {
            i = 0;
        }
        if (this.f39674e == null) {
            addError("'MDCKey' parameter is mandatory. Cannot start.");
            i++;
        }
        if (i == 0) {
            this.f39687d = true;
        }
    }
}
