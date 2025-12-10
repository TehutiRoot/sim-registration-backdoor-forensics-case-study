package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public class GOST3410PublicKeyParameters extends GOST3410KeyParameters {

    /* renamed from: y */
    private BigInteger f75209y;

    public GOST3410PublicKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(false, gOST3410Parameters);
        this.f75209y = bigInteger;
    }

    public BigInteger getY() {
        return this.f75209y;
    }
}
