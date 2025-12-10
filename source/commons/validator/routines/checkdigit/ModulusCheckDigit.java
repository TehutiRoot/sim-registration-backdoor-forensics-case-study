package commons.validator.routines.checkdigit;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class ModulusCheckDigit implements CheckDigit, Serializable {
    private static final long serialVersionUID = 2948962251251528941L;
    private final int modulus;

    public ModulusCheckDigit(int i) {
        this.modulus = i;
    }

    public static int sumDigits(int i) {
        int i2 = 0;
        while (i > 0) {
            i2 += i % 10;
            i /= 10;
        }
        return i2;
    }

    @Override // commons.validator.routines.checkdigit.CheckDigit
    public String calculate(String str) throws CheckDigitException {
        if (str != null && str.length() != 0) {
            int calculateModulus = calculateModulus(str, false);
            int i = this.modulus;
            return toCheckDigit((i - calculateModulus) % i);
        }
        throw new CheckDigitException("Code is missing");
    }

    public int calculateModulus(String str, boolean z) throws CheckDigitException {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 1;
            int length = (str.length() + (!z ? 1 : 0)) - i;
            i2 += weightedValue(toInt(str.charAt(i), i3, length), i3, length);
            i = i3;
        }
        if (i2 != 0) {
            return i2 % this.modulus;
        }
        throw new CheckDigitException("Invalid code, sum is zero");
    }

    public int getModulus() {
        return this.modulus;
    }

    @Override // commons.validator.routines.checkdigit.CheckDigit
    public boolean isValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            if (calculateModulus(str, true) != 0) {
                return false;
            }
            return true;
        } catch (CheckDigitException unused) {
            return false;
        }
    }

    public String toCheckDigit(int i) throws CheckDigitException {
        if (i >= 0 && i <= 9) {
            return Integer.toString(i);
        }
        throw new CheckDigitException("Invalid Check Digit Value =" + i);
    }

    public int toInt(char c, int i, int i2) throws CheckDigitException {
        if (Character.isDigit(c)) {
            return Character.getNumericValue(c);
        }
        throw new CheckDigitException("Invalid Character[" + i + "] = '" + c + OperatorName.SHOW_TEXT_LINE);
    }

    public abstract int weightedValue(int i, int i2, int i3) throws CheckDigitException;
}
