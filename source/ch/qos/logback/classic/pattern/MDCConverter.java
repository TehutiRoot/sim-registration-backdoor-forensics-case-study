package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

/* loaded from: classes.dex */
public class MDCConverter extends ClassicConverter {

    /* renamed from: e */
    public String f39615e;

    /* renamed from: f */
    public String f39616f = "";

    /* renamed from: a */
    public final String m51597a(Map map) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap == null) {
            return this.f39616f;
        }
        String str = this.f39615e;
        if (str == null) {
            return m51597a(mDCPropertyMap);
        }
        String str2 = mDCPropertyMap.get(str);
        return str2 != null ? str2 : this.f39616f;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String[] extractDefaultReplacement = OptionHelper.extractDefaultReplacement(getFirstOption());
        this.f39615e = extractDefaultReplacement[0];
        String str = extractDefaultReplacement[1];
        if (str != null) {
            this.f39616f = str;
        }
        super.start();
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f39615e = null;
        super.stop();
    }
}
