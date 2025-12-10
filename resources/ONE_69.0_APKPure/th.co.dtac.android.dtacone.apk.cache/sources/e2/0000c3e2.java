package commons.validator.routines.checkdigit;

/* loaded from: classes5.dex */
public final class ISBN10CheckDigit extends ModulusCheckDigit {
    public static final CheckDigit ISBN10_CHECK_DIGIT = new ISBN10CheckDigit();
    private static final long serialVersionUID = 8000855044504864964L;

    public ISBN10CheckDigit() {
        super(11);
    }

    @Override // commons.validator.routines.checkdigit.ModulusCheckDigit
    public String toCheckDigit(int i) throws CheckDigitException {
        if (i == 10) {
            return "X";
        }
        return super.toCheckDigit(i);
    }

    @Override // commons.validator.routines.checkdigit.ModulusCheckDigit
    public int toInt(char c, int i, int i2) throws CheckDigitException {
        if (i2 == 1 && c == 'X') {
            return 10;
        }
        return super.toInt(c, i, i2);
    }

    @Override // commons.validator.routines.checkdigit.ModulusCheckDigit
    public int weightedValue(int i, int i2, int i3) {
        return i * i3;
    }
}