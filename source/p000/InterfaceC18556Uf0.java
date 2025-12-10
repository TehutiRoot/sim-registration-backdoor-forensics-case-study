package p000;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* renamed from: Uf0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC18556Uf0 {
    int estimatePrintedLength();

    void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale);

    void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale);
}
