package com.fasterxml.jackson.datatype.joda.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/* loaded from: classes3.dex */
public class JacksonJodaDateFormat extends AbstractC17471Dg0 {
    protected final Boolean _adjustToContextTZOverride;
    protected final boolean _explicitTimezone;
    protected final DateTimeFormatter _formatter;
    protected final TimeZone _jdkTimezone;
    protected transient DateTimeZone _jodaTimezone;
    protected final Boolean _writeZoneId;

    public JacksonJodaDateFormat(DateTimeFormatter dateTimeFormatter) {
        this._formatter = dateTimeFormatter;
        DateTimeZone zone = dateTimeFormatter.getZone();
        this._jdkTimezone = zone == null ? null : zone.toTimeZone();
        this._explicitTimezone = false;
        this._adjustToContextTZOverride = null;
        this._writeZoneId = null;
    }

    public static boolean _isStyle(String str) {
        if (str.length() != 2 || "SMLF-".indexOf(str.charAt(0)) < 0 || "SMLF-".indexOf(str.charAt(0)) < 0) {
            return false;
        }
        return true;
    }

    public DateTimeFormatter createFormatter(SerializerProvider serializerProvider) {
        TimeZone timeZone;
        DateTimeFormatter createFormatterWithLocale = createFormatterWithLocale(serializerProvider);
        if (!this._explicitTimezone && (timeZone = serializerProvider.getTimeZone()) != null && !timeZone.equals(this._jdkTimezone)) {
            return createFormatterWithLocale.withZone(DateTimeZone.forTimeZone(timeZone));
        }
        return createFormatterWithLocale;
    }

    public DateTimeFormatter createFormatterWithLocale(SerializerProvider serializerProvider) {
        Locale locale;
        DateTimeFormatter dateTimeFormatter = this._formatter;
        if (!this._explicitLocale && (locale = serializerProvider.getLocale()) != null && !locale.equals(this._locale)) {
            return dateTimeFormatter.withLocale(locale);
        }
        return dateTimeFormatter;
    }

    public DateTimeFormatter createParser(DeserializationContext deserializationContext) {
        Locale locale;
        DateTimeFormatter dateTimeFormatter = this._formatter;
        if (!this._explicitLocale && (locale = deserializationContext.getLocale()) != null && !locale.equals(this._locale)) {
            dateTimeFormatter = dateTimeFormatter.withLocale(locale);
        }
        if (!this._explicitTimezone) {
            if (shouldAdjustToContextTimeZone(deserializationContext)) {
                TimeZone timeZone = deserializationContext.getTimeZone();
                if (timeZone != null && !timeZone.equals(this._jdkTimezone)) {
                    return dateTimeFormatter.withZone(DateTimeZone.forTimeZone(timeZone));
                }
                return dateTimeFormatter;
            }
            return dateTimeFormatter.withOffsetParsed();
        }
        return dateTimeFormatter;
    }

    public Locale getLocale() {
        return this._locale;
    }

    public DateTimeZone getTimeZone() {
        DateTimeZone dateTimeZone = this._jodaTimezone;
        if (dateTimeZone != null) {
            return dateTimeZone;
        }
        TimeZone timeZone = this._jdkTimezone;
        if (timeZone == null) {
            return null;
        }
        DateTimeZone forTimeZone = DateTimeZone.forTimeZone(timeZone);
        this._jodaTimezone = forTimeZone;
        return forTimeZone;
    }

    public boolean isTimezoneExplicit() {
        return this._explicitTimezone;
    }

    public DateTimeFormatter rawFormatter() {
        return this._formatter;
    }

    public boolean shouldAdjustToContextTimeZone(DeserializationContext deserializationContext) {
        Boolean bool = this._adjustToContextTZOverride;
        if (bool != null) {
            return bool.booleanValue();
        }
        return deserializationContext.isEnabled(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
    }

    public boolean shouldWriteWithZoneId(SerializerProvider serializerProvider) {
        Boolean bool = this._writeZoneId;
        if (bool != null) {
            return bool.booleanValue();
        }
        return serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_WITH_ZONE_ID);
    }

    public String toString() {
        return String.format("[JacksonJodaFormat, explicitTZ? %s, JDK tz = %s, formatter = %s]", Boolean.valueOf(this._explicitTimezone), this._jdkTimezone.getID(), this._formatter);
    }

    @Override // p000.AbstractC17471Dg0
    public /* bridge */ /* synthetic */ boolean useTimestamp(SerializerProvider serializerProvider, SerializationFeature serializationFeature) {
        return super.useTimestamp(serializerProvider, serializationFeature);
    }

    public JacksonJodaDateFormat with(JsonFormat.Value value) {
        JacksonJodaDateFormat withFormat = withLocale(value.getLocale()).withTimeZone(value.getTimeZone()).withFormat(value.getPattern().trim());
        Boolean feature = value.getFeature(JsonFormat.Feature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
        Boolean feature2 = value.getFeature(JsonFormat.Feature.WRITE_DATES_WITH_ZONE_ID);
        if (feature != this._adjustToContextTZOverride || feature2 != this._writeZoneId) {
            return new JacksonJodaDateFormat(withFormat, feature, feature2);
        }
        return withFormat;
    }

    public JacksonJodaDateFormat withAdjustToContextTZOverride(Boolean bool) {
        if (bool == this._adjustToContextTZOverride) {
            return this;
        }
        return new JacksonJodaDateFormat(this, bool, this._writeZoneId);
    }

    public JacksonJodaDateFormat withFormat(String str) {
        DateTimeFormatter forPattern;
        if (str != null && !str.isEmpty()) {
            if (_isStyle(str)) {
                forPattern = DateTimeFormat.forStyle(str);
            } else {
                forPattern = DateTimeFormat.forPattern(str);
            }
            Locale locale = this._locale;
            if (locale != null) {
                forPattern = forPattern.withLocale(locale);
            }
            return new JacksonJodaDateFormat(this, forPattern);
        }
        return this;
    }

    public JacksonJodaDateFormat withLocale(Locale locale) {
        Locale locale2;
        if (locale != null && ((locale2 = this._locale) == null || !locale2.equals(locale))) {
            return new JacksonJodaDateFormat(this, locale);
        }
        return this;
    }

    public JacksonJodaDateFormat withTimeZone(TimeZone timeZone) {
        TimeZone timeZone2;
        if (timeZone != null && ((timeZone2 = this._jdkTimezone) == null || !timeZone2.equals(timeZone))) {
            return new JacksonJodaDateFormat(this, timeZone);
        }
        return this;
    }

    public JacksonJodaDateFormat withUseTimestamp(Boolean bool) {
        Boolean bool2 = this._useTimestamp;
        if (bool2 != null && bool2.equals(bool)) {
            return this;
        }
        return new JacksonJodaDateFormat(this, bool);
    }

    public JacksonJodaDateFormat withWriteZoneId(Boolean bool) {
        if (bool == this._writeZoneId) {
            return this;
        }
        return new JacksonJodaDateFormat(this, this._adjustToContextTZOverride, bool);
    }

    public JacksonJodaDateFormat(JacksonJodaDateFormat jacksonJodaDateFormat, Boolean bool) {
        super(jacksonJodaDateFormat, bool);
        this._formatter = jacksonJodaDateFormat._formatter;
        this._jdkTimezone = jacksonJodaDateFormat._jdkTimezone;
        this._explicitTimezone = jacksonJodaDateFormat._explicitTimezone;
        this._adjustToContextTZOverride = jacksonJodaDateFormat._adjustToContextTZOverride;
        this._writeZoneId = jacksonJodaDateFormat._writeZoneId;
    }

    public JacksonJodaDateFormat(JacksonJodaDateFormat jacksonJodaDateFormat, DateTimeFormatter dateTimeFormatter) {
        super(jacksonJodaDateFormat);
        this._formatter = dateTimeFormatter;
        this._jdkTimezone = jacksonJodaDateFormat._jdkTimezone;
        this._explicitTimezone = jacksonJodaDateFormat._explicitTimezone;
        this._adjustToContextTZOverride = jacksonJodaDateFormat._adjustToContextTZOverride;
        this._writeZoneId = jacksonJodaDateFormat._writeZoneId;
    }

    public JacksonJodaDateFormat(JacksonJodaDateFormat jacksonJodaDateFormat, TimeZone timeZone) {
        super(jacksonJodaDateFormat, timeZone);
        this._formatter = jacksonJodaDateFormat._formatter.withZone(DateTimeZone.forTimeZone(timeZone));
        this._jdkTimezone = timeZone;
        this._explicitTimezone = true;
        this._adjustToContextTZOverride = jacksonJodaDateFormat._adjustToContextTZOverride;
        this._writeZoneId = jacksonJodaDateFormat._writeZoneId;
    }

    public JacksonJodaDateFormat(JacksonJodaDateFormat jacksonJodaDateFormat, Locale locale) {
        super(jacksonJodaDateFormat, locale);
        this._formatter = jacksonJodaDateFormat._formatter.withLocale(locale);
        this._jdkTimezone = jacksonJodaDateFormat._jdkTimezone;
        this._explicitTimezone = jacksonJodaDateFormat._explicitTimezone;
        this._adjustToContextTZOverride = jacksonJodaDateFormat._adjustToContextTZOverride;
        this._writeZoneId = jacksonJodaDateFormat._writeZoneId;
    }

    public JacksonJodaDateFormat(JacksonJodaDateFormat jacksonJodaDateFormat, Boolean bool, Boolean bool2) {
        super(jacksonJodaDateFormat);
        this._formatter = jacksonJodaDateFormat._formatter;
        this._jdkTimezone = jacksonJodaDateFormat._jdkTimezone;
        this._explicitTimezone = jacksonJodaDateFormat._explicitTimezone;
        this._adjustToContextTZOverride = bool;
        this._writeZoneId = bool2;
    }
}
