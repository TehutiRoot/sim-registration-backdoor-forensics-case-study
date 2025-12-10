package com.feitian.reader.protocol;

/* loaded from: classes3.dex */
public interface IProto {
    public static final String Tag = "FeiTianApdu";

    int protoIctl(String str, String str2);

    int protoRecv(byte[] bArr, int[] iArr);

    int protoSend(byte[] bArr, int i);

    int protoTransmit(byte[] bArr, int i, byte[] bArr2, int[] iArr);
}
