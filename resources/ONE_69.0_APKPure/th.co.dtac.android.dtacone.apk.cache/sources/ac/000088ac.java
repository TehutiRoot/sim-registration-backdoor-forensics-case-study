package com.feitian.readerdk.deviceconnect;

/* loaded from: classes3.dex */
public interface IDeviceConnect {
    public static final String Tag = "fei_tian_device";

    int IDeviceIctl(String str, Object obj);

    int IDeviceRead(byte[] bArr, int[] iArr);

    int IDeviceTransmit(byte[] bArr, int i, byte[] bArr2, int[] iArr);

    int IDeviceWrite(byte[] bArr, int i);

    void releaseReource();
}