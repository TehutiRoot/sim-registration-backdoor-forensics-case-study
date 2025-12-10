package p000;

import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimePrinter;

/* renamed from: aE */
/* loaded from: classes5.dex */
public class C1857aE implements InterfaceC19085ag0 {

    /* renamed from: a */
    public final DateTimePrinter f8382a;

    public C1857aE(DateTimePrinter dateTimePrinter) {
        this.f8382a = dateTimePrinter;
    }

    /* renamed from: b */
    public static InterfaceC19085ag0 m65164b(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter instanceof C19263bg0) {
            return (InterfaceC19085ag0) dateTimePrinter;
        }
        if (dateTimePrinter == null) {
            return null;
        }
        return new C1857aE(dateTimePrinter);
    }

    /* renamed from: a */
    public DateTimePrinter m65165a() {
        return this.f8382a;
    }

    @Override // p000.InterfaceC19085ag0
    public int estimatePrintedLength() {
        return this.f8382a.estimatePrintedLength();
    }

    @Override // p000.InterfaceC19085ag0
    public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
        if (appendable instanceof StringBuffer) {
            this.f8382a.printTo((StringBuffer) appendable, j, chronology, i, dateTimeZone, locale);
        }
        if (appendable instanceof Writer) {
            this.f8382a.printTo((Writer) appendable, j, chronology, i, dateTimeZone, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.f8382a.printTo(stringBuffer, j, chronology, i, dateTimeZone, locale);
        appendable.append(stringBuffer);
    }

    @Override // p000.InterfaceC19085ag0
    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        if (appendable instanceof StringBuffer) {
            this.f8382a.printTo((StringBuffer) appendable, readablePartial, locale);
        }
        if (appendable instanceof Writer) {
            this.f8382a.printTo((Writer) appendable, readablePartial, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.f8382a.printTo(stringBuffer, readablePartial, locale);
        appendable.append(stringBuffer);
    }
}