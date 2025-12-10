package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class MarkerConverter extends ClassicConverter {

    /* renamed from: e */
    public static String f39617e = "";

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        Marker marker = iLoggingEvent.getMarker();
        return marker == null ? f39617e : marker.toString();
    }
}
