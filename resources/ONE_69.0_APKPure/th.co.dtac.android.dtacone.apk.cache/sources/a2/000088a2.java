package com.feitian.reader.protocol;

import com.feitian.reader.devicecontrol.CardCmd;
import com.feitian.readerdk.Tool.Javacrc;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* loaded from: classes3.dex */
public class ProtocolT1 implements IProto {

    /* renamed from: A */
    public int f43513A;

    /* renamed from: a */
    public CardCmd f43514a;

    /* renamed from: b */
    public int f43515b = 32;

    /* renamed from: c */
    public int f43516c = 0;

    /* renamed from: d */
    public int f43517d = 0;

    /* renamed from: e */
    public final int f43518e = 0;

    /* renamed from: f */
    public final int f43519f = 128;

    /* renamed from: g */
    public final int f43520g = CertificateHolderAuthorization.CVCA;

    /* renamed from: h */
    public final int f43521h = 224;

    /* renamed from: i */
    public final int f43522i = 0;

    /* renamed from: j */
    public final int f43523j = 1;

    /* renamed from: k */
    public final int f43524k = 2;

    /* renamed from: l */
    public final int f43525l = 3;

    /* renamed from: m */
    public final int f43526m = 4;

    /* renamed from: n */
    public final int f43527n = 5;

    /* renamed from: o */
    public final int f43528o = 6;

    /* renamed from: p */
    public final int f43529p = 7;

    /* renamed from: q */
    public final int f43530q = 8;

    /* renamed from: r */
    public final int f43531r = 9;

    /* renamed from: s */
    public final int f43532s = 10;

    /* renamed from: t */
    public final int f43533t = 11;

    /* renamed from: u */
    public final int f43534u = 12;

    /* renamed from: v */
    public final byte f43535v = 0;

    /* renamed from: w */
    public final byte f43536w = 1;

    /* renamed from: x */
    public final byte f43537x = 2;

    /* renamed from: y */
    public final byte f43538y = 3;

    /* renamed from: z */
    public int f43539z;

    public ProtocolT1(CardCmd cardCmd) {
        this.f43514a = cardCmd;
    }

    /* renamed from: a */
    public final byte m49359a(byte[] bArr) {
        byte b = bArr[1];
        int i = b & 15;
        if (i != 0) {
            if (i == 1) {
                this.f43515b = bArr[3] & 255;
            }
        } else {
            this.f43517d = 0;
            this.f43516c = 0;
        }
        return (byte) (b & 15);
    }

    /* renamed from: b */
    public final boolean m49358b(byte[] bArr, int i) {
        int i2 = i - 1;
        if (bArr[i2] == Javacrc.csum_lrc_compute(bArr, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m49357c(byte b, int i) {
        int i2 = b & 128;
        if (i2 == 0) {
            if (((b & 64) >> 6) == i % 2) {
                return true;
            }
            return false;
        } else if (i2 == 128 && ((b & 16) >> 4) == i % 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final int m49356d(byte b) {
        if ((b & 128) == 0) {
            return 0;
        }
        if ((b & 192) == 128) {
            return 128;
        }
        if ((b & 224) == 224) {
            return 224;
        }
        return CertificateHolderAuthorization.CVCA;
    }

    /* renamed from: e */
    public final int m49355e(byte[] bArr) {
        return m49356d(bArr[1]);
    }

    /* renamed from: f */
    public final boolean m49354f(byte b) {
        return (b & 32) != 0;
    }

    @Override // com.feitian.reader.protocol.IProto
    public int protoIctl(String str, String str2) {
        if (str.equalsIgnoreCase("IFSC")) {
            this.f43515b = Integer.parseInt(str2);
            return 0;
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0126, code lost:
        return -1;
     */
    @Override // com.feitian.reader.protocol.IProto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int protoTransmit(byte[] r19, int r20, byte[] r21, int[] r22) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.feitian.reader.protocol.ProtocolT1.protoTransmit(byte[], int, byte[], int[]):int");
    }
}