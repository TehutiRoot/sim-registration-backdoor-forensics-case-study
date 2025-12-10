package commons.validator.routines;

import commons.validator.routines.checkdigit.CheckDigit;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class CodeValidator implements Serializable {
    private static final long serialVersionUID = 446960910870938233L;
    private final CheckDigit checkdigit;
    private final int maxLength;
    private final int minLength;
    private final RegexValidator regexValidator;

    public CodeValidator(String str, CheckDigit checkDigit) {
        this(str, -1, -1, checkDigit);
    }

    public CheckDigit getCheckDigit() {
        return this.checkdigit;
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public int getMinLength() {
        return this.minLength;
    }

    public RegexValidator getRegexValidator() {
        return this.regexValidator;
    }

    public boolean isValid(String str) {
        if (validate(str) != null) {
            return true;
        }
        return false;
    }

    public Object validate(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        RegexValidator regexValidator = this.regexValidator;
        if (regexValidator != null && (trim = regexValidator.validate(trim)) == null) {
            return null;
        }
        if ((this.minLength >= 0 && trim.length() < this.minLength) || (this.maxLength >= 0 && trim.length() > this.maxLength)) {
            return null;
        }
        CheckDigit checkDigit = this.checkdigit;
        if (checkDigit != null && !checkDigit.isValid(trim)) {
            return null;
        }
        return trim;
    }

    public CodeValidator(String str, int i, CheckDigit checkDigit) {
        this(str, i, i, checkDigit);
    }

    public CodeValidator(String str, int i, int i2, CheckDigit checkDigit) {
        if (str != null && str.length() > 0) {
            this.regexValidator = new RegexValidator(str);
        } else {
            this.regexValidator = null;
        }
        this.minLength = i;
        this.maxLength = i2;
        this.checkdigit = checkDigit;
    }

    public CodeValidator(RegexValidator regexValidator, CheckDigit checkDigit) {
        this(regexValidator, -1, -1, checkDigit);
    }

    public CodeValidator(RegexValidator regexValidator, int i, CheckDigit checkDigit) {
        this(regexValidator, i, i, checkDigit);
    }

    public CodeValidator(RegexValidator regexValidator, int i, int i2, CheckDigit checkDigit) {
        this.regexValidator = regexValidator;
        this.minLength = i;
        this.maxLength = i2;
        this.checkdigit = checkDigit;
    }
}