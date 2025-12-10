package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.DatePatternToRegexUtil;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class DateTokenConverter<E> extends DynamicConverter<E> implements MonoTypedConverter {
    public static final String AUXILIARY_TOKEN = "AUX";
    public static final String CONVERTER_KEY = "d";
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

    /* renamed from: e */
    public String f40071e;

    /* renamed from: f */
    public TimeZone f40072f;

    /* renamed from: g */
    public CachingDateFormatter f40073g;

    /* renamed from: h */
    public boolean f40074h = true;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(Object obj) {
        if (obj != null) {
            if (obj instanceof Date) {
                return convert((Date) obj);
            }
            throw new IllegalArgumentException("Cannot convert " + obj + " of type" + obj.getClass().getName());
        }
        throw new IllegalArgumentException("Null argument forbidden");
    }

    public String getDatePattern() {
        return this.f40071e;
    }

    public TimeZone getTimeZone() {
        return this.f40072f;
    }

    @Override // ch.qos.logback.core.rolling.helper.MonoTypedConverter
    public boolean isApplicable(Object obj) {
        return obj instanceof Date;
    }

    public boolean isPrimary() {
        return this.f40074h;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String firstOption = getFirstOption();
        this.f40071e = firstOption;
        if (firstOption == null) {
            this.f40071e = "yyyy-MM-dd";
        }
        List<String> optionList = getOptionList();
        if (optionList != null) {
            for (int i = 1; i < optionList.size(); i++) {
                String str = optionList.get(i);
                if (AUXILIARY_TOKEN.equalsIgnoreCase(str)) {
                    this.f40074h = false;
                } else {
                    this.f40072f = TimeZone.getTimeZone(str);
                }
            }
        }
        CachingDateFormatter cachingDateFormatter = new CachingDateFormatter(this.f40071e);
        this.f40073g = cachingDateFormatter;
        TimeZone timeZone = this.f40072f;
        if (timeZone != null) {
            cachingDateFormatter.setTimeZone(timeZone);
        }
    }

    public String toRegex() {
        return new DatePatternToRegexUtil(this.f40071e).toRegex();
    }

    public String convert(Date date) {
        return this.f40073g.format(date.getTime());
    }
}
