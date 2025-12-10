package commons.validator.routines;

import java.io.Serializable;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class AbstractFormatValidator implements Serializable {
    private static final long serialVersionUID = -4690687565200568258L;
    private final boolean strict;

    public AbstractFormatValidator(boolean z) {
        this.strict = z;
    }

    public String format(Object obj) {
        return format(obj, null, null);
    }

    public abstract Format getFormat(String str, Locale locale);

    public boolean isStrict() {
        return this.strict;
    }

    public boolean isValid(String str) {
        return isValid(str, null, null);
    }

    public abstract boolean isValid(String str, String str2, Locale locale);

    public Object parse(String str, Format format) {
        ParsePosition parsePosition = new ParsePosition(0);
        Object parseObject = format.parseObject(str, parsePosition);
        if (parsePosition.getErrorIndex() > -1) {
            return null;
        }
        if (isStrict() && parsePosition.getIndex() < str.length()) {
            return null;
        }
        if (parseObject != null) {
            return processParsedValue(parseObject, format);
        }
        return parseObject;
    }

    public abstract Object processParsedValue(Object obj, Format format);

    public String format(Object obj, String str) {
        return format(obj, str, null);
    }

    public boolean isValid(String str, String str2) {
        return isValid(str, str2, null);
    }

    public String format(Object obj, Locale locale) {
        return format(obj, null, locale);
    }

    public boolean isValid(String str, Locale locale) {
        return isValid(str, null, locale);
    }

    public String format(Object obj, String str, Locale locale) {
        return format(obj, getFormat(str, locale));
    }

    public String format(Object obj, Format format) {
        return format.format(obj);
    }
}