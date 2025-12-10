package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.AbstractC9696qh;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.BigInteger;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ql */
/* loaded from: classes5.dex */
public abstract class AbstractC9700ql extends AbstractC9696qh {
    protected boolean ThreeDS2Service;
    private String cleanup;
    private String getSDKInfo;
    private List<X509Certificate> getSDKVersion;
    private String getWarnings;
    protected PrivateKey valueOf;
    protected String values;

    public AbstractC9700ql(PublicKey publicKey) {
        super(publicKey);
    }

    public abstract void ThreeDS2Service(Map<String, Object> map);

    public void ThreeDS2Service(Map<String, Object> map, String str, BigInteger bigInteger, int i) {
        map.put(str, C9713qy.valueOf(bigInteger, i));
    }

    public void ThreeDS2ServiceInstance(PrivateKey privateKey) {
        this.valueOf = privateKey;
    }

    public PrivateKey createTransaction() {
        return this.valueOf;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9696qh
    public void get(Map<String, Object> map, AbstractC9696qh.get getVar) {
        valueOf(map);
        if (this.getSDKVersion != null) {
            C9722rg c9722rg = new C9722rg();
            ArrayList arrayList = new ArrayList(this.getSDKVersion.size());
            for (X509Certificate x509Certificate : this.getSDKVersion) {
                arrayList.add(c9722rg.get(x509Certificate));
            }
            map.put("x5c", arrayList);
        }
        ThreeDS2Service("x5t", this.cleanup, map);
        ThreeDS2Service("x5t#S256", this.getWarnings, map);
        ThreeDS2Service("x5u", this.getSDKInfo, map);
        if (this.ThreeDS2Service || getVar == AbstractC9696qh.get.INCLUDE_PRIVATE) {
            ThreeDS2Service(map);
        }
    }

    public void onCompleted() {
        X509Certificate onError = onError();
        if (onError != null && !onError.getPublicKey().equals(get())) {
            throw new IllegalArgumentException("The key in the first certificate MUST match the bare public key represented by other members of the JWK. Public key = " + get() + " cert = " + onError);
        }
    }

    public X509Certificate onError() {
        List<X509Certificate> list = this.getSDKVersion;
        if (list != null && !list.isEmpty()) {
            return this.getSDKVersion.get(0);
        }
        return null;
    }

    public abstract void valueOf(Map<String, Object> map);

    public BigInteger values(Map<String, Object> map, String str, boolean z) throws C9727rl {
        return C9713qy.get(AbstractC9696qh.ThreeDS2Service(map, str, z));
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.ql$valueOf */
    /* loaded from: classes5.dex */
    public static class valueOf {
        public static AbstractC9700ql get(String str) throws C9727rl {
            return values(str, null);
        }

        public static AbstractC9700ql valueOf(Map<String, Object> map, String str) throws C9727rl {
            String ThreeDS2ServiceInstance = AbstractC9696qh.ThreeDS2ServiceInstance(map, "kty");
            ThreeDS2ServiceInstance.hashCode();
            if (!ThreeDS2ServiceInstance.equals("EC")) {
                if (ThreeDS2ServiceInstance.equals("RSA")) {
                    return new C9701qm(map, str);
                }
                throw new C9727rl("Unknown key type (for public keys): '" + ThreeDS2ServiceInstance + OperatorName.SHOW_TEXT_LINE);
            }
            return new C9699qk(map, str);
        }

        public static AbstractC9700ql values(Key key) throws C9727rl {
            return (AbstractC9700ql) AbstractC9696qh.values.ThreeDS2Service(key);
        }

        public static AbstractC9700ql values(String str, String str2) throws C9727rl {
            return valueOf(C9675os.values(str), str2);
        }
    }

    public AbstractC9700ql(Map<String, Object> map, String str) throws C9727rl {
        super(map);
        this.values = str;
        if (map.containsKey("x5c")) {
            List<String> valueOf2 = C9729rn.valueOf(map, "x5c");
            this.getSDKVersion = new ArrayList(valueOf2.size());
            C9722rg ThreeDS2ServiceInstance = C9722rg.ThreeDS2ServiceInstance(str);
            for (String str2 : valueOf2) {
                this.getSDKVersion.add(ThreeDS2ServiceInstance.valueOf(str2));
            }
        }
        this.cleanup = AbstractC9696qh.get(map, "x5t");
        this.getWarnings = AbstractC9696qh.get(map, "x5t#S256");
        this.getSDKInfo = AbstractC9696qh.get(map, "x5u");
        valueOf("x5c", "x5t#S256", "x5t", "x5u");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9696qh
    public PublicKey get() {
        return (PublicKey) this.ThreeDS2ServiceInstance;
    }

    public void get(Map<String, Object> map, String str, BigInteger bigInteger) {
        map.put(str, C9713qy.valueOf(bigInteger));
    }
}
