package com.feitian.reader.protocol;

import com.feitian.reader.devicecontrol.CardCmd;

/* loaded from: classes3.dex */
public class ProtocolT0 implements IProto {

    /* renamed from: a */
    public CardCmd f43512a;

    public ProtocolT0(CardCmd cardCmd) {
        this.f43512a = cardCmd;
    }

    @Override // com.feitian.reader.protocol.IProto
    public int protoIctl(String str, String str2) {
        return 0;
    }

    @Override // com.feitian.reader.protocol.IProto
    public int protoRecv(byte[] bArr, int[] iArr) {
        return 0;
    }

    @Override // com.feitian.reader.protocol.IProto
    public int protoSend(byte[] bArr, int i) {
        return 0;
    }

    @Override // com.feitian.reader.protocol.IProto
    public int protoTransmit(byte[] bArr, int i, byte[] bArr2, int[] iArr) {
        this.f43512a.BuildApdu(bArr, i, 0, 0);
        if (this.f43512a.Transmit(bArr, i, bArr2, iArr) != 0) {
            bArr[0] = 0;
            iArr[0] = 0;
            return -1;
        }
        int i2 = iArr[0];
        if (i2 <= 10) {
            bArr[0] = 0;
            iArr[0] = 0;
            return -1;
        }
        int i3 = i2 - 10;
        iArr[0] = i3;
        System.arraycopy(bArr2, 10, bArr2, 0, i3);
        return 0;
    }
}