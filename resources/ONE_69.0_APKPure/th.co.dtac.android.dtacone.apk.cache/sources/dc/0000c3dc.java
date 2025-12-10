package commons.validator.routines;

import java.text.Format;
import java.util.Locale;

/* loaded from: classes5.dex */
public class IntegerValidator extends AbstractNumberValidator {
    private static final IntegerValidator VALIDATOR = new IntegerValidator();
    private static final long serialVersionUID = 422081746310306596L;

    public IntegerValidator() {
        this(true, 0);
    }

    public static IntegerValidator getInstance() {
        return VALIDATOR;
    }

    public boolean isInRange(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    public boolean maxValue(int i, int i2) {
        return i <= i2;
    }

    public boolean minValue(int i, int i2) {
        return i >= i2;
    }

    @Override // commons.validator.routines.AbstractNumberValidator, commons.validator.routines.AbstractFormatValidator
    public Object processParsedValue(Object obj, Format format) {
        long longValue = ((Number) obj).longValue();
        if (longValue >= -2147483648L && longValue <= 2147483647L) {
            return new Integer((int) longValue);
        }
        return null;
    }

    public Integer validate(String str) {
        return (Integer) parse(str, null, null);
    }

    public IntegerValidator(boolean z, int i) {
        super(z, i, false);
    }

    public boolean isInRange(Integer num, int i, int i2) {
        return isInRange(num.intValue(), i, i2);
    }

    public boolean maxValue(Integer num, int i) {
        return maxValue(num.intValue(), i);
    }

    public boolean minValue(Integer num, int i) {
        return minValue(num.intValue(), i);
    }

    public Integer validate(String str, String str2) {
        return (Integer) parse(str, str2, null);
    }

    public Integer validate(String str, Locale locale) {
        return (Integer) parse(str, null, locale);
    }

    public Integer validate(String str, String str2, Locale locale) {
        return (Integer) parse(str, str2, locale);
    }
}