package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.spi.FilterReply;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.MDC;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class DynamicThresholdFilter extends TurboFilter {

    /* renamed from: g */
    public String f39671g;

    /* renamed from: e */
    public Map f39669e = new HashMap();

    /* renamed from: f */
    public Level f39670f = Level.ERROR;

    /* renamed from: h */
    public FilterReply f39672h = FilterReply.NEUTRAL;

    /* renamed from: i */
    public FilterReply f39673i = FilterReply.DENY;

    public void addMDCValueLevelPair(MDCValueLevelPair mDCValueLevelPair) {
        if (!this.f39669e.containsKey(mDCValueLevelPair.getValue())) {
            this.f39669e.put(mDCValueLevelPair.getValue(), mDCValueLevelPair.getLevel());
            return;
        }
        addError(mDCValueLevelPair.getValue() + " has been already set");
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th2) {
        String str2 = MDC.get(this.f39671g);
        if (isStarted()) {
            Level level2 = str2 != null ? (Level) this.f39669e.get(str2) : null;
            if (level2 == null) {
                level2 = this.f39670f;
            }
            return level.isGreaterOrEqual(level2) ? this.f39672h : this.f39673i;
        }
        return FilterReply.NEUTRAL;
    }

    public Level getDefaultThreshold() {
        return this.f39670f;
    }

    public String getKey() {
        return this.f39671g;
    }

    public FilterReply getOnHigherOrEqual() {
        return this.f39672h;
    }

    public FilterReply getOnLower() {
        return this.f39673i;
    }

    public void setDefaultThreshold(Level level) {
        this.f39670f = level;
    }

    public void setKey(String str) {
        this.f39671g = str;
    }

    public void setOnHigherOrEqual(FilterReply filterReply) {
        this.f39672h = filterReply;
    }

    public void setOnLower(FilterReply filterReply) {
        this.f39673i = filterReply;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.f39671g == null) {
            addError("No key name was specified");
        }
        super.start();
    }
}
