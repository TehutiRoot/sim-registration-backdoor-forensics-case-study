package com.netcetera.threeds.sdk.infrastructure;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Key;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qn */
/* loaded from: classes5.dex */
public class C9702qn extends AbstractC9716ra {
    private String ThreeDS2Service;
    private Boolean ThreeDS2ServiceInstance;
    private String get = "UTF-8";
    private byte[] valueOf;

    public C9702qn() {
        if (!Boolean.getBoolean("org.jose4j.jws.default-allow-none")) {
            values(C9690pf.ThreeDS2Service);
        }
    }

    private String cleanup() {
        return C9730ro.ThreeDS2Service(this.valueOf, this.get);
    }

    private byte[] getWarnings() throws C9727rl {
        if (!get()) {
            return C9730ro.values(C9710qv.valueOf(createTransaction(), initialize()));
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(C9730ro.values(createTransaction()));
            byteArrayOutputStream.write(46);
            byteArrayOutputStream.write(this.valueOf);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C9727rl("This should never happen from a ByteArrayOutputStream", e);
        }
    }

    public InterfaceC9706qr ThreeDS2Service() throws C9731rp {
        return valueOf(true);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9716ra
    public boolean ThreeDS2ServiceInstance(String str) {
        return "b64".equals(str);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9716ra
    /* renamed from: a_ */
    public void mo33352a_() {
        this.ThreeDS2ServiceInstance = null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9716ra
    public void get(String[] strArr) throws C9727rl {
        if (strArr.length == 3) {
            getSDKInfo(strArr[0]);
            get(strArr[1]);
            valueOf(this.values.ThreeDS2ServiceInstance(strArr[2]));
            return;
        }
        throw new C9727rl("A JWS Compact Serialization must have exactly 3 parts separated by period ('.') characters");
    }

    public String getSDKInfo() {
        return cleanup();
    }

    public byte[] getSDKVersion() {
        return getParamValue();
    }

    public String initialize() {
        String str = this.ThreeDS2Service;
        if (str == null) {
            return this.values.ThreeDS2Service(this.valueOf);
        }
        return str;
    }

    public boolean valueOf() throws C9727rl {
        InterfaceC9706qr ThreeDS2Service = ThreeDS2Service();
        Key onError = onError();
        if (ConfigurationBuilder()) {
            ThreeDS2Service.ThreeDS2Service(onError);
        }
        if (this.ThreeDS2ServiceInstance == null) {
            apiKey();
            this.ThreeDS2ServiceInstance = Boolean.valueOf(ThreeDS2Service.ThreeDS2Service(getSDKVersion(), onError, getWarnings(), removeParam()));
        }
        return this.ThreeDS2ServiceInstance.booleanValue();
    }

    public String ThreeDS2ServiceInstance() throws C9727rl {
        if (!Boolean.getBoolean("org.jose4j.jws.getPayload-skip-verify") && !valueOf()) {
            throw new C9726rk("JWS signature is invalid.");
        }
        return cleanup();
    }

    public boolean get() {
        Object valueOf = this.cleanup.valueOf("b64");
        return (valueOf == null || !(valueOf instanceof Boolean) || ((Boolean) valueOf).booleanValue()) ? false : true;
    }

    public void get(String str) {
        this.ThreeDS2Service = str;
        this.valueOf = this.values.ThreeDS2ServiceInstance(str);
    }

    private InterfaceC9706qr valueOf(boolean z) throws C9731rp {
        String ThreeDS2Service$InitializationCallback = ThreeDS2Service$InitializationCallback();
        if (ThreeDS2Service$InitializationCallback != null) {
            if (z) {
                addParam().get(ThreeDS2Service$InitializationCallback);
            }
            return C9693ph.valueOf().ThreeDS2ServiceInstance().ThreeDS2ServiceInstance(ThreeDS2Service$InitializationCallback);
        }
        throw new C9731rp("Signature algorithm header (alg) not set.");
    }

    public void valueOf(byte[] bArr) {
        values(bArr);
    }
}
