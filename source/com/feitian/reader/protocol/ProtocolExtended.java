package com.feitian.reader.protocol;

import com.feitian.reader.devicecontrol.CardCmd;

/* loaded from: classes3.dex */
public class ProtocolExtended implements IProto {

    /* renamed from: a */
    public CardCmd f43499a;

    public ProtocolExtended(CardCmd cardCmd) {
        this.f43499a = cardCmd;
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        r0 = r10.f43499a.CmdRecv(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (r0 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (r0 == 612) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        if ((r2[8] & 255) != 254) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        return com.feitian.readerdk.Tool.C6150DK.CARD_TIMEOUT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        r0 = r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r0 >= 10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
        return com.feitian.readerdk.Tool.C6150DK.TRANS_RETURN_ERROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        if (r0 <= 10) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        java.lang.System.arraycopy(r2, 10, r13, r11, r0 - 10);
        r11 = (r11 + r4[0]) - 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
        r0 = r2[9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
        if (r0 == 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        if (r0 == 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
        if (r0 == 16) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
        r14[0] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
        r10.f43499a.BuildApdu(null, 0, 16, 0);
        r0 = r10.f43499a.CmdSend();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
        if (r0 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:
        return r0;
     */
    @Override // com.feitian.reader.protocol.IProto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int protoTransmit(byte[] r11, int r12, byte[] r13, int[] r14) {
        /*
            r10 = this;
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]
            byte[] r2 = new byte[r0]
            r3 = 1
            int[] r4 = new int[r3]
            if (r12 <= r0) goto Lc
            goto Ld
        Lc:
            r0 = r12
        Ld:
            r5 = 261(0x105, float:3.66E-43)
            r6 = 0
            if (r12 <= r5) goto L17
            r12 = 261(0x105, float:3.66E-43)
            r7 = 0
            r8 = 1
            goto L19
        L17:
            r7 = 0
            r8 = 0
        L19:
            java.lang.System.arraycopy(r11, r7, r1, r6, r12)
            com.feitian.reader.devicecontrol.CardCmd r9 = r10.f43499a
            r9.BuildApdu(r1, r12, r8, r6)
            com.feitian.reader.devicecontrol.CardCmd r9 = r10.f43499a
            int r9 = r9.CmdSend()
            if (r9 == 0) goto L2a
            return r9
        L2a:
            int r7 = r7 + r12
            int r0 = r0 - r12
            r12 = 3
            r9 = 2
            if (r9 == r8) goto L45
            if (r8 != 0) goto L33
            goto L45
        L33:
            com.feitian.reader.devicecontrol.CardCmd r8 = r10.f43499a
            int r8 = r8.CmdRecv(r2, r4)
            if (r8 == 0) goto L3c
            return r8
        L3c:
            if (r0 <= r5) goto L42
            r12 = 261(0x105, float:3.66E-43)
            r8 = 3
            goto L19
        L42:
            r12 = r0
            r8 = 2
            goto L19
        L45:
            r11 = 0
        L46:
            com.feitian.reader.devicecontrol.CardCmd r0 = r10.f43499a
            int r0 = r0.CmdRecv(r2, r4)
            if (r0 == 0) goto L61
            r11 = 612(0x264, float:8.58E-43)
            if (r0 == r11) goto L60
            r11 = 8
            r11 = r2[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 254(0xfe, float:3.56E-43)
            if (r11 != r12) goto L60
            r11 = 61445(0xf005, float:8.6103E-41)
            return r11
        L60:
            return r0
        L61:
            r0 = r4[r6]
            r1 = 10
            if (r0 >= r1) goto L6b
            r11 = 61441(0xf001, float:8.6097E-41)
            return r11
        L6b:
            if (r0 <= r1) goto L76
            int r0 = r0 + (-10)
            java.lang.System.arraycopy(r2, r1, r13, r11, r0)
            r0 = r4[r6]
            int r11 = r11 + r0
            int r11 = r11 - r1
        L76:
            r0 = 9
            r0 = r2[r0]
            r1 = 16
            if (r0 == r3) goto L85
            if (r0 == r12) goto L85
            if (r0 == r1) goto L85
            r14[r6] = r11
            return r6
        L85:
            com.feitian.reader.devicecontrol.CardCmd r0 = r10.f43499a
            r5 = 0
            r0.BuildApdu(r5, r6, r1, r6)
            com.feitian.reader.devicecontrol.CardCmd r0 = r10.f43499a
            int r0 = r0.CmdSend()
            if (r0 == 0) goto L46
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.feitian.reader.protocol.ProtocolExtended.protoTransmit(byte[], int, byte[], int[]):int");
    }
}
