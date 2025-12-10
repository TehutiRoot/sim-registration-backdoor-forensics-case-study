package com.netcetera.threeds.sdk.infrastructure;

import java.io.InputStream;

/* loaded from: classes5.dex */
public class setBaseline$19871$valueOf {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final char[] valueOf;
    private final InputStream values;

    public /* synthetic */ setBaseline$19871$valueOf(InputStream inputStream, char[] cArr, setBaseline$19871$5 setbaseline_19871_5) {
        this(inputStream, cArr);
    }

    public InputStream get() {
        int i = ThreeDS2Service;
        int i2 = ((i & 117) + (i | 117)) % 128;
        get = i2;
        InputStream inputStream = this.values;
        int i3 = (i2 | 17) << 1;
        int i4 = -(((~i2) & 17) | (i2 & (-18)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 != 0) {
            return inputStream;
        }
        throw null;
    }

    public char[] values() {
        int i = get;
        int i2 = i & 99;
        int i3 = (i ^ 99) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = this.valueOf;
        if (i5 == 0) {
            int i6 = 57 / 0;
        }
        return cArr;
    }

    private setBaseline$19871$valueOf(InputStream inputStream, char[] cArr) {
        this.values = inputStream;
        this.valueOf = cArr;
    }
}
