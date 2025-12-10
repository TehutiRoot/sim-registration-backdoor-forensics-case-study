package ch.qos.logback.classic.android;

import android.util.Log;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class LogcatAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {

    /* renamed from: g */
    public PatternLayoutEncoder f39517g = null;

    /* renamed from: h */
    public PatternLayoutEncoder f39518h = null;

    /* renamed from: i */
    public boolean f39519i = false;

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            String tag = getTag(iLoggingEvent);
            int i = iLoggingEvent.getLevel().levelInt;
            if (i == Integer.MIN_VALUE || i == 5000) {
                if (this.f39519i && !Log.isLoggable(tag, 2)) {
                    return;
                }
            } else if (i != 10000) {
                if (i != 20000) {
                    if (i == 30000) {
                        if (!this.f39519i || Log.isLoggable(tag, 5)) {
                            Log.w(tag, this.f39517g.getLayout().doLayout(iLoggingEvent));
                            return;
                        }
                        return;
                    } else if (i != 40000) {
                        return;
                    } else {
                        if (this.f39519i && !Log.isLoggable(tag, 6)) {
                            return;
                        }
                    }
                } else if (this.f39519i && !Log.isLoggable(tag, 4)) {
                    return;
                }
            } else if (this.f39519i && !Log.isLoggable(tag, 3)) {
                return;
            }
            this.f39517g.getLayout().doLayout(iLoggingEvent);
        }
    }

    public boolean getCheckLoggable() {
        return this.f39519i;
    }

    public PatternLayoutEncoder getEncoder() {
        return this.f39517g;
    }

    public String getTag(ILoggingEvent iLoggingEvent) {
        PatternLayoutEncoder patternLayoutEncoder = this.f39518h;
        String doLayout = patternLayoutEncoder != null ? patternLayoutEncoder.getLayout().doLayout(iLoggingEvent) : iLoggingEvent.getLoggerName();
        if (!this.f39519i || doLayout.length() <= 23) {
            return doLayout;
        }
        return doLayout.substring(0, 22) + Marker.ANY_MARKER;
    }

    public PatternLayoutEncoder getTagEncoder() {
        return this.f39518h;
    }

    public void setCheckLoggable(boolean z) {
        this.f39519i = z;
    }

    public void setEncoder(PatternLayoutEncoder patternLayoutEncoder) {
        this.f39517g = patternLayoutEncoder;
    }

    public void setTagEncoder(PatternLayoutEncoder patternLayoutEncoder) {
        this.f39518h = patternLayoutEncoder;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        StringBuilder sb;
        String str;
        PatternLayoutEncoder patternLayoutEncoder = this.f39517g;
        if (patternLayoutEncoder != null && patternLayoutEncoder.getLayout() != null) {
            PatternLayoutEncoder patternLayoutEncoder2 = this.f39518h;
            if (patternLayoutEncoder2 != null) {
                Layout<ILoggingEvent> layout = patternLayoutEncoder2.getLayout();
                if (layout == null) {
                    sb = new StringBuilder();
                    str = "No tag layout set for the appender named [";
                } else if (layout instanceof PatternLayout) {
                    String pattern = this.f39518h.getPattern();
                    if (!pattern.contains("%nopex")) {
                        this.f39518h.stop();
                        PatternLayoutEncoder patternLayoutEncoder3 = this.f39518h;
                        patternLayoutEncoder3.setPattern(pattern + "%nopex");
                        this.f39518h.start();
                    }
                    ((PatternLayout) layout).setPostCompileProcessor(null);
                }
            }
            super.start();
            return;
        }
        sb = new StringBuilder();
        str = "No layout set for the appender named [";
        sb.append(str);
        sb.append(this.name);
        sb.append("].");
        addError(sb.toString());
    }
}
