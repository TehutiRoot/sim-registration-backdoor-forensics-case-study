package p000;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimePrinter;

/* renamed from: Vf0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18620Vf0 implements DateTimePrinter, InterfaceC18556Uf0 {

    /* renamed from: a */
    public final InterfaceC18556Uf0 f6768a;

    public C18620Vf0(InterfaceC18556Uf0 interfaceC18556Uf0) {
        this.f6768a = interfaceC18556Uf0;
    }

    /* renamed from: a */
    public static DateTimePrinter m65750a(InterfaceC18556Uf0 interfaceC18556Uf0) {
        if (interfaceC18556Uf0 instanceof C1809ZD) {
            return ((C1809ZD) interfaceC18556Uf0).m65259a();
        }
        if (interfaceC18556Uf0 instanceof DateTimePrinter) {
            return (DateTimePrinter) interfaceC18556Uf0;
        }
        if (interfaceC18556Uf0 == null) {
            return null;
        }
        return new C18620Vf0(interfaceC18556Uf0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18620Vf0) {
            return this.f6768a.equals(((C18620Vf0) obj).f6768a);
        }
        return false;
    }

    @Override // org.joda.time.format.DateTimePrinter, p000.InterfaceC18556Uf0
    public int estimatePrintedLength() {
        return this.f6768a.estimatePrintedLength();
    }

    @Override // org.joda.time.format.DateTimePrinter
    public void printTo(StringBuffer stringBuffer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
        try {
            this.f6768a.printTo(stringBuffer, j, chronology, i, dateTimeZone, locale);
        } catch (IOException unused) {
        }
    }

    @Override // org.joda.time.format.DateTimePrinter
    public void printTo(Writer writer, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
        this.f6768a.printTo(writer, j, chronology, i, dateTimeZone, locale);
    }

    @Override // p000.InterfaceC18556Uf0
    public void printTo(Appendable appendable, long j, Chronology chronology, int i, DateTimeZone dateTimeZone, Locale locale) {
        this.f6768a.printTo(appendable, j, chronology, i, dateTimeZone, locale);
    }

    @Override // org.joda.time.format.DateTimePrinter
    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
        try {
            this.f6768a.printTo(stringBuffer, readablePartial, locale);
        } catch (IOException unused) {
        }
    }

    @Override // org.joda.time.format.DateTimePrinter
    public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) {
        this.f6768a.printTo(writer, readablePartial, locale);
    }

    @Override // p000.InterfaceC18556Uf0
    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        this.f6768a.printTo(appendable, readablePartial, locale);
    }
}
