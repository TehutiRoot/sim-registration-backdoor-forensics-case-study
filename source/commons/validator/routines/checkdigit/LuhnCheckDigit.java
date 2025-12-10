package commons.validator.routines.checkdigit;

/* loaded from: classes5.dex */
public final class LuhnCheckDigit extends ModulusCheckDigit {
    public static final CheckDigit LUHN_CHECK_DIGIT = new LuhnCheckDigit();
    private static final int[] POSITION_WEIGHT = {2, 1};
    private static final long serialVersionUID = -2976900113942875999L;

    public LuhnCheckDigit() {
        super(10);
    }

    @Override // commons.validator.routines.checkdigit.ModulusCheckDigit
    public int weightedValue(int i, int i2, int i3) {
        int i4 = i * POSITION_WEIGHT[i3 % 2];
        if (i4 > 9) {
            return i4 - 9;
        }
        return i4;
    }
}
