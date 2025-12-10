package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes6.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g */
    private GF2Matrix f75554g;

    /* renamed from: n */
    private int f75555n;

    /* renamed from: t */
    private int f75556t;

    public McEliecePublicKeyParameters(int i, int i2, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f75555n = i;
        this.f75556t = i2;
        this.f75554g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f75554g;
    }

    public int getK() {
        return this.f75554g.getNumRows();
    }

    public int getN() {
        return this.f75555n;
    }

    public int getT() {
        return this.f75556t;
    }
}
