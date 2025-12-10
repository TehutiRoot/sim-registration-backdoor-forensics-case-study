package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes6.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* renamed from: l */
    private final int f75272l;

    /* renamed from: n */
    private final int f75273n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i, int i2, int i3, SecureRandom secureRandom) {
        this(i, i2, i3, secureRandom, -1);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f75272l;
    }

    public int getN() {
        return this.f75273n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i, int i2, int i3, SecureRandom secureRandom, int i4) {
        this.f75272l = i;
        this.f75273n = i2;
        this.certainty = i3;
        this.usageIndex = i4;
        this.random = secureRandom;
    }
}