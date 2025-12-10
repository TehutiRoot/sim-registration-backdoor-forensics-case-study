package org.bouncycastle.crypto.params;

/* loaded from: classes6.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c */
    private int f75294c;

    /* renamed from: cL */
    private long f75295cL;

    /* renamed from: x0 */
    private int f75296x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f75296x0 = i;
        this.f75294c = i2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410ValidationParameters) {
            GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
            return gOST3410ValidationParameters.f75294c == this.f75294c && gOST3410ValidationParameters.f75296x0 == this.f75296x0 && gOST3410ValidationParameters.f75295cL == this.f75295cL && gOST3410ValidationParameters.x0L == this.x0L;
        }
        return false;
    }

    public int getC() {
        return this.f75294c;
    }

    public long getCL() {
        return this.f75295cL;
    }

    public int getX0() {
        return this.f75296x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f75296x0 ^ this.f75294c;
        long j = this.x0L;
        long j2 = this.f75295cL;
        return (((i ^ ((int) j)) ^ ((int) (j >> 32))) ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f75295cL = j2;
    }
}