package commons.validator.routines.checkdigit;

/* loaded from: classes5.dex */
public final class EAN13CheckDigit extends ModulusCheckDigit {
    public static final CheckDigit EAN13_CHECK_DIGIT = new EAN13CheckDigit();
    private static final int[] POSITION_WEIGHT = {3, 1};
    private static final long serialVersionUID = 1726347093230424107L;

    public EAN13CheckDigit() {
        super(10);
    }

    @Override // commons.validator.routines.checkdigit.ModulusCheckDigit
    public int weightedValue(int i, int i2, int i3) {
        return i * POSITION_WEIGHT[i3 % 2];
    }
}