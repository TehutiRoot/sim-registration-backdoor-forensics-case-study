package com.fasterxml.jackson.datatype.joda.cfg;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.util.Locale;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;

/* loaded from: classes3.dex */
public class JacksonJodaPeriodFormat extends AbstractC17471Dg0 {
    protected final PeriodFormatter _formatter;

    public JacksonJodaPeriodFormat(PeriodFormatter periodFormatter) {
        this._formatter = periodFormatter;
    }

    public PeriodFormatter createFormatter(SerializerProvider serializerProvider) {
        Locale locale;
        PeriodFormatter periodFormatter = this._formatter;
        if (!this._explicitLocale && (locale = serializerProvider.getLocale()) != null && !locale.equals(this._locale)) {
            return periodFormatter.withLocale(locale);
        }
        return periodFormatter;
    }

    public PeriodFormatter nativeFormatter() {
        return this._formatter;
    }

    public Period parsePeriod(DeserializationContext deserializationContext, String str) throws IOException {
        return this._formatter.parsePeriod(str);
    }

    @Override // p000.AbstractC17471Dg0
    public /* bridge */ /* synthetic */ boolean useTimestamp(SerializerProvider serializerProvider, SerializationFeature serializationFeature) {
        return super.useTimestamp(serializerProvider, serializationFeature);
    }

    public JacksonJodaPeriodFormat withFormat(String str) {
        return this;
    }

    public JacksonJodaPeriodFormat withLocale(Locale locale) {
        Locale locale2;
        if (locale != null && ((locale2 = this._locale) == null || !locale2.equals(locale))) {
            return new JacksonJodaPeriodFormat(this, locale);
        }
        return this;
    }

    public JacksonJodaPeriodFormat withUseTimestamp(Boolean bool) {
        Boolean bool2 = this._useTimestamp;
        if (bool2 != null && bool2.equals(bool)) {
            return this;
        }
        return new JacksonJodaPeriodFormat(this, bool);
    }

    public JacksonJodaPeriodFormat(JacksonJodaPeriodFormat jacksonJodaPeriodFormat, Locale locale) {
        super(jacksonJodaPeriodFormat, locale);
        PeriodFormatter periodFormatter = jacksonJodaPeriodFormat._formatter;
        this._formatter = locale != null ? periodFormatter.withLocale(locale) : periodFormatter;
    }

    public JacksonJodaPeriodFormat(JacksonJodaPeriodFormat jacksonJodaPeriodFormat, Boolean bool) {
        super(jacksonJodaPeriodFormat, bool);
        this._formatter = jacksonJodaPeriodFormat._formatter;
    }
}
