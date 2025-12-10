package org.bouncycastle.math.p041ec;

/* renamed from: org.bouncycastle.math.ec.ECLookupTable */
/* loaded from: classes6.dex */
public interface ECLookupTable {
    int getSize();

    ECPoint lookup(int i);

    ECPoint lookupVar(int i);
}
