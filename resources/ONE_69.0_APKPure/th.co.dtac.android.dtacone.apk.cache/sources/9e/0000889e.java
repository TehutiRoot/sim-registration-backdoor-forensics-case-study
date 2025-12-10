package com.feitian.reader.devicecontrol;

/* loaded from: classes3.dex */
public class cardencryption {
    static {
        System.loadLibrary("ftcrypt");
    }

    public native void randomCrypt(byte[] bArr, byte b, byte[] bArr2, byte b2, byte b3, byte[] bArr3);
}