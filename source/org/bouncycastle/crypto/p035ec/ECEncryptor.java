package org.bouncycastle.crypto.p035ec;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.p041ec.ECPoint;

/* renamed from: org.bouncycastle.crypto.ec.ECEncryptor */
/* loaded from: classes6.dex */
public interface ECEncryptor {
    ECPair encrypt(ECPoint eCPoint);

    void init(CipherParameters cipherParameters);
}
