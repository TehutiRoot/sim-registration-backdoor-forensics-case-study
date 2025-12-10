package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes6.dex */
public class ParametersWithID implements CipherParameters {

    /* renamed from: id */
    private byte[] f75307id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f75307id = bArr;
    }

    public byte[] getID() {
        return this.f75307id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}