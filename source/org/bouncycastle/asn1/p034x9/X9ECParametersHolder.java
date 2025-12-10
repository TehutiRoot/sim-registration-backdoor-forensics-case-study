package org.bouncycastle.asn1.p034x9;

/* renamed from: org.bouncycastle.asn1.x9.X9ECParametersHolder */
/* loaded from: classes6.dex */
public abstract class X9ECParametersHolder {
    private X9ECParameters params;

    public abstract X9ECParameters createParameters();

    public synchronized X9ECParameters getParameters() {
        try {
            if (this.params == null) {
                this.params = createParameters();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.params;
    }
}
