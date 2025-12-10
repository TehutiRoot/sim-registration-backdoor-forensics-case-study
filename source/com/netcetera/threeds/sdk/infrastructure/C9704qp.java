package com.netcetera.threeds.sdk.infrastructure;

import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qp */
/* loaded from: classes5.dex */
public class C9704qp extends AbstractC9694pm implements InterfaceC9706qr {
    private int ThreeDS2ServiceInstance;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qp$ThreeDS2Service */
    /* loaded from: classes5.dex */
    public static class ThreeDS2Service extends C9704qp {
        public ThreeDS2Service() {
            super("HS384", "HmacSHA384", 384);
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qp$ThreeDS2ServiceInstance */
    /* loaded from: classes5.dex */
    public static class ThreeDS2ServiceInstance extends C9704qp {
        public ThreeDS2ServiceInstance() {
            super("HS256", "HmacSHA256", 256);
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qp$valueOf */
    /* loaded from: classes5.dex */
    public static class valueOf extends C9704qp {
        public valueOf() {
            super("HS512", "HmacSHA512", 512);
        }
    }

    public C9704qp(String str, String str2, int i) {
        valueOf(str);
        values(str2);
        ThreeDS2Service(EnumC9717rb.SYMMETRIC);
        get("oct");
        this.ThreeDS2ServiceInstance = i;
    }

    private Mac valueOf(Key key, C9674or c9674or) throws C9727rl {
        return C9733rs.ThreeDS2Service(ThreeDS2Service(), key, c9674or.get().get());
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9706qr
    public boolean ThreeDS2Service(byte[] bArr, Key key, byte[] bArr2, C9674or c9674or) throws C9727rl {
        if (key instanceof SecretKey) {
            return C9725rj.ThreeDS2Service(bArr, valueOf(key, c9674or).doFinal(bArr2));
        }
        throw new C9728rm(key.getClass() + " cannot be used for HMAC verification.");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9688pd
    public boolean ThreeDS2ServiceInstance() {
        return C9689pe.valueOf("Mac", ThreeDS2Service());
    }

    public void values(Key key) throws C9728rm {
        int values;
        if (key != null) {
            if (key.getEncoded() != null && (values = C9725rj.values(key.getEncoded())) < this.ThreeDS2ServiceInstance) {
                throw new C9728rm("A key of the same size as the hash output (i.e. " + this.ThreeDS2ServiceInstance + " bits for " + valueOf() + ") or larger MUST be used with the HMAC SHA algorithms but this key is only " + values + " bits");
            }
            return;
        }
        throw new C9728rm("key is null");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9706qr
    public void ThreeDS2Service(Key key) throws C9728rm {
        values(key);
    }
}
