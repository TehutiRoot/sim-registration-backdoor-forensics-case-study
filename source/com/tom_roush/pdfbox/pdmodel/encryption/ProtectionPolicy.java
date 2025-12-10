package com.tom_roush.pdfbox.pdmodel.encryption;

/* loaded from: classes5.dex */
public abstract class ProtectionPolicy {

    /* renamed from: a */
    public short f60303a = 40;

    /* renamed from: b */
    public boolean f60304b = false;

    public int getEncryptionKeyLength() {
        return this.f60303a;
    }

    public boolean isPreferAES() {
        return this.f60304b;
    }

    public void setEncryptionKeyLength(int i) {
        if (i != 40 && i != 128 && i != 256) {
            throw new IllegalArgumentException("Invalid key length '" + i + "' value must be 40, 128 or 256!");
        }
        this.f60303a = (short) i;
    }

    public void setPreferAES(boolean z) {
        this.f60304b = z;
    }
}
