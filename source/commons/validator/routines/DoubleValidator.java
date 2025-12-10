package commons.validator.routines;

import java.text.Format;
import java.util.Locale;

/* loaded from: classes5.dex */
public class DoubleValidator extends AbstractNumberValidator {
    private static final DoubleValidator VALIDATOR = new DoubleValidator();
    private static final long serialVersionUID = 5867946581318211330L;

    public DoubleValidator() {
        this(true, 0);
    }

    public static DoubleValidator getInstance() {
        return VALIDATOR;
    }

    public boolean isInRange(double d, double d2, double d3) {
        return d >= d2 && d <= d3;
    }

    public boolean maxValue(double d, double d2) {
        return d <= d2;
    }

    public boolean minValue(double d, double d2) {
        return d >= d2;
    }

    @Override // commons.validator.routines.AbstractNumberValidator, commons.validator.routines.AbstractFormatValidator
    public Object processParsedValue(Object obj, Format format) {
        if (obj instanceof Double) {
            return obj;
        }
        return new Double(((Number) obj).doubleValue());
    }

    public Double validate(String str) {
        return (Double) parse(str, null, null);
    }

    public DoubleValidator(boolean z, int i) {
        super(z, i, true);
    }

    public boolean isInRange(Double d, double d2, double d3) {
        return isInRange(d.doubleValue(), d2, d3);
    }

    public boolean maxValue(Double d, double d2) {
        return maxValue(d.doubleValue(), d2);
    }

    public boolean minValue(Double d, double d2) {
        return minValue(d.doubleValue(), d2);
    }

    public Double validate(String str, String str2) {
        return (Double) parse(str, str2, null);
    }

    public Double validate(String str, Locale locale) {
        return (Double) parse(str, null, locale);
    }

    public Double validate(String str, String str2, Locale locale) {
        return (Double) parse(str, str2, locale);
    }
}
