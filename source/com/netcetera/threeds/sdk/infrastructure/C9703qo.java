package com.netcetera.threeds.sdk.infrastructure;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.security.interfaces.ECKey;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qo */
/* loaded from: classes5.dex */
public class C9703qo extends AbstractC9705qq {
    private int ThreeDS2ServiceInstance;
    private String values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qo$ThreeDS2Service */
    /* loaded from: classes5.dex */
    public static class ThreeDS2Service extends C9703qo {
        public ThreeDS2Service() {
            super("ES256", "SHA256withECDSA", "P-256", 64);
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qo$ThreeDS2ServiceInstance */
    /* loaded from: classes5.dex */
    public static class ThreeDS2ServiceInstance extends C9703qo {
        public ThreeDS2ServiceInstance() {
            super("ES512", "SHA512withECDSA", "P-521", 132);
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qo$values */
    /* loaded from: classes5.dex */
    public static class values extends C9703qo {
        public values() {
            super("ES384", "SHA384withECDSA", "P-384", 96);
        }
    }

    public C9703qo(String str, String str2, String str3, int i) {
        super(str, str2, "EC");
        this.values = str3;
        this.ThreeDS2ServiceInstance = i;
    }

    public static byte[] get(byte[] bArr) throws IOException {
        int i;
        int i2;
        byte[] bArr2;
        int length = bArr.length / 2;
        int i3 = length;
        while (i3 > 0 && bArr[length - i3] == 0) {
            i3--;
        }
        int i4 = length - i3;
        if (bArr[i4] < 0) {
            i = i3 + 1;
        } else {
            i = i3;
        }
        int i5 = length;
        while (i5 > 0 && bArr[(length * 2) - i5] == 0) {
            i5--;
        }
        int i6 = (length * 2) - i5;
        if (bArr[i6] < 0) {
            i2 = i5 + 1;
        } else {
            i2 = i5;
        }
        int i7 = i + 4 + i2;
        if (i7 <= 255) {
            int i8 = 1;
            if (i7 < 128) {
                bArr2 = new byte[i + 6 + i2];
            } else {
                bArr2 = new byte[i + 7 + i2];
                bArr2[1] = -127;
                i8 = 2;
            }
            bArr2[0] = 48;
            bArr2[i8] = (byte) i7;
            bArr2[i8 + 1] = 2;
            bArr2[i8 + 2] = (byte) i;
            int i9 = i8 + 3 + i;
            System.arraycopy(bArr, i4, bArr2, i9 - i3, i3);
            bArr2[i9] = 2;
            bArr2[i9 + 1] = (byte) i2;
            System.arraycopy(bArr, i6, bArr2, ((i9 + 2) + i2) - i5, i5);
            return bArr2;
        }
        throw new IOException("Invalid format of ECDSA signature");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9705qq, com.netcetera.threeds.sdk.infrastructure.InterfaceC9706qr
    public boolean ThreeDS2Service(byte[] bArr, Key key, byte[] bArr2, C9674or c9674or) throws C9727rl {
        try {
            return super.ThreeDS2Service(get(bArr), key, bArr2, c9674or);
        } catch (IOException e) {
            throw new C9727rl("Unable to convert R and S as a concatenated byte array to DER encoding.", e);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9705qq
    public void ThreeDS2ServiceInstance(PublicKey publicKey) throws C9728rm {
        ThreeDS2ServiceInstance((Key) publicKey);
    }

    public String values() {
        return this.values;
    }

    private void ThreeDS2ServiceInstance(Key key) throws C9728rm {
        if (key instanceof ECKey) {
            String valueOf = C9718rc.valueOf(((ECKey) key).getParams().getCurve());
            if (values().equals(valueOf)) {
                return;
            }
            throw new C9728rm(valueOf() + RemoteSettings.FORWARD_SLASH_STRING + ThreeDS2Service() + " expects a key using " + values() + " but was " + valueOf);
        }
    }
}
