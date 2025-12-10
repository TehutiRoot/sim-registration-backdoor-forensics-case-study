package org.bouncycastle.math.p041ec;

/* renamed from: org.bouncycastle.math.ec.AbstractECLookupTable */
/* loaded from: classes6.dex */
public abstract class AbstractECLookupTable implements ECLookupTable {
    @Override // org.bouncycastle.math.p041ec.ECLookupTable
    public ECPoint lookupVar(int i) {
        return lookup(i);
    }
}