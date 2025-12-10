package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLNumber extends CLElement {

    /* renamed from: c */
    public float f32384c;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.f32384c = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.f32384c)) {
            this.f32384c = Float.parseFloat(content());
        }
        return this.f32384c;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.f32384c)) {
            this.f32384c = Integer.parseInt(content());
        }
        return (int) this.f32384c;
    }

    public boolean isInt() {
        float f = getFloat();
        if (((int) f) == f) {
            return true;
        }
        return false;
    }

    public void putValue(float f) {
        this.f32384c = f;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        float f = getFloat();
        int i3 = (int) f;
        if (i3 == f) {
            sb.append(i3);
        } else {
            sb.append(f);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f = getFloat();
        int i = (int) f;
        if (i == f) {
            return "" + i;
        }
        return "" + f;
    }

    public CLNumber(float f) {
        super(null);
        this.f32384c = f;
    }
}