package commons.validator.routines;

import commons.validator.routines.checkdigit.CheckDigit;
import commons.validator.routines.checkdigit.LuhnCheckDigit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class CreditCardValidator implements Serializable {
    public static final long AMEX = 1;
    public static final CodeValidator AMEX_VALIDATOR;
    public static final long DINERS = 16;
    public static final CodeValidator DINERS_VALIDATOR;
    public static final long DISCOVER = 8;
    private static final RegexValidator DISCOVER_REGEX;
    public static final CodeValidator DISCOVER_VALIDATOR;
    private static final CheckDigit LUHN_VALIDATOR;
    public static final long MASTERCARD = 4;
    public static final CodeValidator MASTERCARD_VALIDATOR;
    public static final long NONE = 0;
    public static final long VISA = 2;
    public static final CodeValidator VISA_VALIDATOR;
    private static final long serialVersionUID = 5955978921148959496L;
    private final List cardTypes;

    static {
        CheckDigit checkDigit = LuhnCheckDigit.LUHN_CHECK_DIGIT;
        LUHN_VALIDATOR = checkDigit;
        AMEX_VALIDATOR = new CodeValidator("^(3[47]\\d{13})$", checkDigit);
        DINERS_VALIDATOR = new CodeValidator("^(30[0-5]\\d{11}|3095\\d{10}|36\\d{12}|3[8-9]\\d{12})$", checkDigit);
        RegexValidator regexValidator = new RegexValidator(new String[]{"^(6011\\d{12})$", "^(64[4-9]\\d{13})$", "^(65\\d{14})$"});
        DISCOVER_REGEX = regexValidator;
        DISCOVER_VALIDATOR = new CodeValidator(regexValidator, checkDigit);
        MASTERCARD_VALIDATOR = new CodeValidator("^(5[1-5]\\d{14})$", checkDigit);
        VISA_VALIDATOR = new CodeValidator("^(4)(\\d{12}|\\d{15})$", checkDigit);
    }

    public CreditCardValidator() {
        this(15L);
    }

    private boolean isOn(long j, long j2) {
        return (j & j2) > 0;
    }

    public boolean isValid(String str) {
        if (str != null && str.length() != 0) {
            for (int i = 0; i < this.cardTypes.size(); i++) {
                if (((CodeValidator) this.cardTypes.get(i)).isValid(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Object validate(String str) {
        if (str != null && str.length() != 0) {
            for (int i = 0; i < this.cardTypes.size(); i++) {
                Object validate = ((CodeValidator) this.cardTypes.get(i)).validate(str);
                if (validate != null) {
                    return validate;
                }
            }
        }
        return null;
    }

    public CreditCardValidator(long j) {
        ArrayList arrayList = new ArrayList();
        this.cardTypes = arrayList;
        if (isOn(j, 2L)) {
            arrayList.add(VISA_VALIDATOR);
        }
        if (isOn(j, 1L)) {
            arrayList.add(AMEX_VALIDATOR);
        }
        if (isOn(j, 4L)) {
            arrayList.add(MASTERCARD_VALIDATOR);
        }
        if (isOn(j, 8L)) {
            arrayList.add(DISCOVER_VALIDATOR);
        }
        if (isOn(j, 16L)) {
            arrayList.add(DINERS_VALIDATOR);
        }
    }

    public CreditCardValidator(CodeValidator[] codeValidatorArr) {
        this.cardTypes = new ArrayList();
        if (codeValidatorArr != null) {
            for (CodeValidator codeValidator : codeValidatorArr) {
                this.cardTypes.add(codeValidator);
            }
            return;
        }
        throw new IllegalArgumentException("Card validators are missing");
    }
}
