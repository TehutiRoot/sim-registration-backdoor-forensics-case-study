package p000;

import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimePrinter;

/* renamed from: ZD */
/* loaded from: classes5.dex */
public class C1809ZD implements InterfaceC18556Uf0 {

    /* renamed from: a */
    public final DateTimePrinter f7979a;

    public C1809ZD(DateTimePrinter dateTimePrinter) {
        this.f7979a = dateTimePrinter;
    }

    /* renamed from: b */
    public static InterfaceC18556Uf0 m65258b(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter instanceof C18620Vf0) {
            return (InterfaceC18556Uf0) dateTimePrinter;
        }
        if (dateTimePrinter == null) {
            return null;
        }
        return new C1809ZD(dateTimePrinter);
    }

    /* renamed from: a */
    public DateTimePrinter m65259a() {
        return this.f7979a;
    }

    @Override // p000.InterfaceC18556Uf0
    public int estimatePrintedLength() {
        return this.f7979a.estimatePrintedLength();
    }

    @Override // p000.InterfaceC18556Uf0
    public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
        if (appendable instanceof StringBuffer) {
            this.f7979a.printTo((StringBuffer) appendable, j, chronology, i, dateTimeZone, locale);
        }
        if (appendable instanceof Writer) {
            this.f7979a.printTo((Writer) appendable, j, chronology, i, dateTimeZone, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.f7979a.printTo(stringBuffer, j, chronology, i, dateTimeZone, locale);
        appendable.append(stringBuffer);
    }

    @Override // p000.InterfaceC18556Uf0
    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        if (appendable instanceof StringBuffer) {
            this.f7979a.printTo((StringBuffer) appendable, readablePartial, locale);
        }
        if (appendable instanceof Writer) {
            this.f7979a.printTo((Writer) appendable, readablePartial, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.f7979a.printTo(stringBuffer, readablePartial, locale);
        appendable.append(stringBuffer);
    }
}
