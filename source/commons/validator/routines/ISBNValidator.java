package commons.validator.routines;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import commons.validator.routines.checkdigit.CheckDigitException;
import commons.validator.routines.checkdigit.EAN13CheckDigit;
import commons.validator.routines.checkdigit.ISBN10CheckDigit;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ISBNValidator implements Serializable {
    private static final String GROUP = "(\\d{1,5})";
    static final String ISBN10_REGEX = "^(?:(\\d{9}[0-9X])|(?:(\\d{1,5})(?:\\-|\\s)(\\d{1,7})(?:\\-|\\s)(\\d{1,6})(?:\\-|\\s)([0-9X])))$";
    static final String ISBN13_REGEX = "^(978|979)(?:(\\d{10})|(?:(?:\\-|\\s)(\\d{1,5})(?:\\-|\\s)(\\d{1,7})(?:\\-|\\s)(\\d{1,6})(?:\\-|\\s)([0-9])))$";
    private static final ISBNValidator ISBN_VALIDATOR = new ISBNValidator();
    private static final ISBNValidator ISBN_VALIDATOR_NO_CONVERT = new ISBNValidator(false);
    private static final String PUBLISHER = "(\\d{1,7})";
    private static final String SEP = "(?:\\-|\\s)";
    private static final String TITLE = "(\\d{1,6})";
    private static final long serialVersionUID = 4319515687976420405L;
    private final boolean convert;
    private final CodeValidator isbn10Validator;
    private final CodeValidator isbn13Validator;

    public ISBNValidator() {
        this(true);
    }

    public static ISBNValidator getInstance() {
        return ISBN_VALIDATOR;
    }

    public String convertToISBN13(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 10) {
            String str2 = "978" + trim.substring(0, 9);
            try {
                return str2 + this.isbn13Validator.getCheckDigit().calculate(str2);
            } catch (CheckDigitException e) {
                throw new IllegalArgumentException("Check digit error for '" + trim + "' - " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("Invalid length " + trim.length() + " for '" + trim + OperatorName.SHOW_TEXT_LINE);
    }

    public boolean isValid(String str) {
        if (!isValidISBN13(str) && !isValidISBN10(str)) {
            return false;
        }
        return true;
    }

    public boolean isValidISBN10(String str) {
        return this.isbn10Validator.isValid(str);
    }

    public boolean isValidISBN13(String str) {
        return this.isbn13Validator.isValid(str);
    }

    public String validate(String str) {
        String validateISBN13 = validateISBN13(str);
        if (validateISBN13 == null) {
            String validateISBN10 = validateISBN10(str);
            if (validateISBN10 != null && this.convert) {
                return convertToISBN13(validateISBN10);
            }
            return validateISBN10;
        }
        return validateISBN13;
    }

    public String validateISBN10(String str) {
        Object validate = this.isbn10Validator.validate(str);
        if (validate == null) {
            return null;
        }
        return validate.toString();
    }

    public String validateISBN13(String str) {
        Object validate = this.isbn13Validator.validate(str);
        if (validate == null) {
            return null;
        }
        return validate.toString();
    }

    public ISBNValidator(boolean z) {
        this.isbn10Validator = new CodeValidator(ISBN10_REGEX, 10, ISBN10CheckDigit.ISBN10_CHECK_DIGIT);
        this.isbn13Validator = new CodeValidator(ISBN13_REGEX, 13, EAN13CheckDigit.EAN13_CHECK_DIGIT);
        this.convert = z;
    }

    public static ISBNValidator getInstance(boolean z) {
        return z ? ISBN_VALIDATOR : ISBN_VALIDATOR_NO_CONVERT;
    }
}
