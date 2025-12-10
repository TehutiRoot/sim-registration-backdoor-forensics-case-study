package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.pqc.crypto.rainbow.Layer;

/* loaded from: classes6.dex */
public class RainbowPrivateKeySpec implements KeySpec {
    private short[][] A1inv;
    private short[][] A2inv;

    /* renamed from: b1 */
    private short[] f75672b1;

    /* renamed from: b2 */
    private short[] f75673b2;
    private Layer[] layers;

    /* renamed from: vi */
    private int[] f75674vi;

    public RainbowPrivateKeySpec(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.A1inv = sArr;
        this.f75672b1 = sArr2;
        this.A2inv = sArr3;
        this.f75673b2 = sArr4;
        this.f75674vi = iArr;
        this.layers = layerArr;
    }

    public short[] getB1() {
        return this.f75672b1;
    }

    public short[] getB2() {
        return this.f75673b2;
    }

    public short[][] getInvA1() {
        return this.A1inv;
    }

    public short[][] getInvA2() {
        return this.A2inv;
    }

    public Layer[] getLayers() {
        return this.layers;
    }

    public int[] getVi() {
        return this.f75674vi;
    }
}