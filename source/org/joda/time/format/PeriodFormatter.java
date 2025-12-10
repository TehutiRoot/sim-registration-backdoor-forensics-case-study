package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* loaded from: classes5.dex */
public class PeriodFormatter {

    /* renamed from: a */
    public final PeriodPrinter f76293a;

    /* renamed from: b */
    public final PeriodParser f76294b;

    /* renamed from: c */
    public final Locale f76295c;

    /* renamed from: d */
    public final PeriodType f76296d;

    public PeriodFormatter(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.f76293a = periodPrinter;
        this.f76294b = periodParser;
        this.f76295c = null;
        this.f76296d = null;
    }

    /* renamed from: a */
    public final void m23858a() {
        if (this.f76294b != null) {
            return;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    /* renamed from: b */
    public final void m23857b(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            return;
        }
        throw new IllegalArgumentException("Period must not be null");
    }

    /* renamed from: c */
    public final void m23856c() {
        if (this.f76293a != null) {
            return;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public Locale getLocale() {
        return this.f76295c;
    }

    public PeriodType getParseType() {
        return this.f76296d;
    }

    public PeriodParser getParser() {
        return this.f76294b;
    }

    public PeriodPrinter getPrinter() {
        return this.f76293a;
    }

    public boolean isParser() {
        if (this.f76294b != null) {
            return true;
        }
        return false;
    }

    public boolean isPrinter() {
        if (this.f76293a != null) {
            return true;
        }
        return false;
    }

    public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i) {
        m23858a();
        m23857b(readWritablePeriod);
        return getParser().parseInto(readWritablePeriod, str, i, this.f76295c);
    }

    public MutablePeriod parseMutablePeriod(String str) {
        m23858a();
        MutablePeriod mutablePeriod = new MutablePeriod(0L, this.f76296d);
        int parseInto = getParser().parseInto(mutablePeriod, str, 0, this.f76295c);
        if (parseInto >= 0) {
            if (parseInto >= str.length()) {
                return mutablePeriod;
            }
        } else {
            parseInto = ~parseInto;
        }
        throw new IllegalArgumentException(FormatUtils.m23981a(str, parseInto));
    }

    public Period parsePeriod(String str) {
        m23858a();
        return parseMutablePeriod(str).toPeriod();
    }

    public String print(ReadablePeriod readablePeriod) {
        m23856c();
        m23857b(readablePeriod);
        PeriodPrinter printer = getPrinter();
        StringBuffer stringBuffer = new StringBuffer(printer.calculatePrintedLength(readablePeriod, this.f76295c));
        printer.printTo(stringBuffer, readablePeriod, this.f76295c);
        return stringBuffer.toString();
    }

    public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod) {
        m23856c();
        m23857b(readablePeriod);
        getPrinter().printTo(stringBuffer, readablePeriod, this.f76295c);
    }

    public PeriodFormatter withLocale(Locale locale) {
        if (locale != getLocale() && (locale == null || !locale.equals(getLocale()))) {
            return new PeriodFormatter(this.f76293a, this.f76294b, locale, this.f76296d);
        }
        return this;
    }

    public PeriodFormatter withParseType(PeriodType periodType) {
        if (periodType == this.f76296d) {
            return this;
        }
        return new PeriodFormatter(this.f76293a, this.f76294b, this.f76295c, periodType);
    }

    public void printTo(Writer writer, ReadablePeriod readablePeriod) throws IOException {
        m23856c();
        m23857b(readablePeriod);
        getPrinter().printTo(writer, readablePeriod, this.f76295c);
    }

    public PeriodFormatter(PeriodPrinter periodPrinter, PeriodParser periodParser, Locale locale, PeriodType periodType) {
        this.f76293a = periodPrinter;
        this.f76294b = periodParser;
        this.f76295c = locale;
        this.f76296d = periodType;
    }
}
