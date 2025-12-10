package commons.validator.routines.checkdigit;

/* loaded from: classes5.dex */
public interface CheckDigit {
    String calculate(String str) throws CheckDigitException;

    boolean isValid(String str);
}
