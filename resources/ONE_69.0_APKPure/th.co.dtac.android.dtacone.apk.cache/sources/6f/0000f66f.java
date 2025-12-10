package org.bouncycastle.crypto.p035ec;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.p041ec.ECPoint;

/* renamed from: org.bouncycastle.crypto.ec.ECDecryptor */
/* loaded from: classes6.dex */
public interface ECDecryptor {
    ECPoint decrypt(ECPair eCPair);

    void init(CipherParameters cipherParameters);
}