package commons.validator.routines;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class AbstractNumberValidator extends AbstractFormatValidator {
    public static final int CURRENCY_FORMAT = 1;
    public static final int PERCENT_FORMAT = 2;
    public static final int STANDARD_FORMAT = 0;
    private static final long serialVersionUID = -3088817875906765463L;
    private final boolean allowFractions;
    private final int formatType;

    public AbstractNumberValidator(boolean z, int i, boolean z2) {
        super(z);
        this.allowFractions = z2;
        this.formatType = i;
    }

    public int determineScale(NumberFormat numberFormat) {
        if (!isStrict()) {
            return -1;
        }
        if (isAllowFractions() && !numberFormat.isParseIntegerOnly()) {
            int minimumFractionDigits = numberFormat.getMinimumFractionDigits();
            if (minimumFractionDigits != numberFormat.getMaximumFractionDigits()) {
                return -1;
            }
            if (numberFormat instanceof DecimalFormat) {
                int multiplier = ((DecimalFormat) numberFormat).getMultiplier();
                if (multiplier != 100) {
                    if (multiplier == 1000) {
                        return minimumFractionDigits + 3;
                    }
                    return minimumFractionDigits;
                }
            } else if (this.formatType != 2) {
                return minimumFractionDigits;
            }
            return minimumFractionDigits + 2;
        }
        return 0;
    }

    @Override // commons.validator.routines.AbstractFormatValidator
    public Format getFormat(String str, Locale locale) {
        NumberFormat numberFormat;
        if (str == null || str.length() <= 0) {
            numberFormat = (NumberFormat) getFormat(locale);
        } else if (locale == null) {
            numberFormat = new DecimalFormat(str);
        } else {
            numberFormat = new DecimalFormat(str, new DecimalFormatSymbols(locale));
        }
        if (determineScale(numberFormat) == 0) {
            numberFormat.setParseIntegerOnly(true);
        }
        return numberFormat;
    }

    public int getFormatType() {
        return this.formatType;
    }

    public boolean isAllowFractions() {
        return this.allowFractions;
    }

    public boolean isInRange(Number number, Number number2, Number number3) {
        if (minValue(number, number2) && maxValue(number, number3)) {
            return true;
        }
        return false;
    }

    @Override // commons.validator.routines.AbstractFormatValidator
    public boolean isValid(String str, String str2, Locale locale) {
        if (parse(str, str2, locale) == null) {
            return false;
        }
        return true;
    }

    public boolean maxValue(Number number, Number number2) {
        if (isAllowFractions()) {
            if (number.doubleValue() > number2.doubleValue()) {
                return false;
            }
            return true;
        } else if (number.longValue() > number2.longValue()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean minValue(Number number, Number number2) {
        if (isAllowFractions()) {
            if (number.doubleValue() < number2.doubleValue()) {
                return false;
            }
            return true;
        } else if (number.longValue() < number2.longValue()) {
            return false;
        } else {
            return true;
        }
    }

    public Object parse(String str, String str2, Locale locale) {
        String trim;
        if (str == null) {
            trim = null;
        } else {
            trim = str.trim();
        }
        if (trim == null || trim.length() == 0) {
            return null;
        }
        return parse(trim, getFormat(str2, locale));
    }

    @Override // commons.validator.routines.AbstractFormatValidator
    public abstract Object processParsedValue(Object obj, Format format);

    public Format getFormat(Locale locale) {
        int i = this.formatType;
        if (i == 1) {
            if (locale == null) {
                return NumberFormat.getCurrencyInstance();
            }
            return NumberFormat.getCurrencyInstance(locale);
        } else if (i != 2) {
            if (locale == null) {
                return NumberFormat.getInstance();
            }
            return NumberFormat.getInstance(locale);
        } else if (locale == null) {
            return NumberFormat.getPercentInstance();
        } else {
            return NumberFormat.getPercentInstance(locale);
        }
    }
}
