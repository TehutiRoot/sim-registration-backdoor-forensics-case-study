package com.netcetera.threeds.sdk.infrastructure;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qk */
/* loaded from: classes5.dex */
public class C9699qk extends AbstractC9700ql {
    private String cleanup;

    public C9699qk(ECPublicKey eCPublicKey) {
        super(eCPublicKey);
        this.cleanup = C9718rc.valueOf(eCPublicKey.getParams().getCurve());
    }

    private int ThreeDS2Service$InitializationCallback() {
        return (int) Math.ceil(C9718rc.ThreeDS2ServiceInstance(values()).getCurve().getField().getFieldSize() / 8.0d);
    }

    public ECPublicKey ThreeDS2Service() {
        return (ECPublicKey) this.ThreeDS2ServiceInstance;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9696qh
    public String ThreeDS2ServiceInstance() {
        return "EC";
    }

    public ECPrivateKey valueOf() {
        return (ECPrivateKey) ((AbstractC9700ql) this).valueOf;
    }

    public String values() {
        return this.cleanup;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9700ql
    public void ThreeDS2Service(Map<String, Object> map) {
        ECPrivateKey valueOf = valueOf();
        if (valueOf != null) {
            ThreeDS2Service(map, "d", valueOf.getS(), ThreeDS2Service$InitializationCallback());
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9700ql
    public void valueOf(Map<String, Object> map) {
        ECPoint w = ThreeDS2Service().getW();
        int ThreeDS2Service$InitializationCallback = ThreeDS2Service$InitializationCallback();
        ThreeDS2Service(map, "x", w.getAffineX(), ThreeDS2Service$InitializationCallback);
        ThreeDS2Service(map, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, w.getAffineY(), ThreeDS2Service$InitializationCallback);
        map.put("crv", values());
    }

    public C9699qk(Map<String, Object> map) throws C9727rl {
        this(map, null);
    }

    public C9699qk(Map<String, Object> map, String str) throws C9727rl {
        super(map, str);
        String ThreeDS2Service = AbstractC9696qh.ThreeDS2Service(map, "crv", true);
        this.cleanup = ThreeDS2Service;
        ECParameterSpec ThreeDS2ServiceInstance = C9718rc.ThreeDS2ServiceInstance(ThreeDS2Service);
        BigInteger values = values(map, "x", true);
        BigInteger values2 = values(map, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, true);
        C9712qx c9712qx = new C9712qx(str, null);
        this.ThreeDS2ServiceInstance = c9712qx.valueOf(values, values2, ThreeDS2ServiceInstance);
        onCompleted();
        if (map.containsKey("d")) {
            ((AbstractC9700ql) this).valueOf = c9712qx.values(values(map, "d", false), ThreeDS2ServiceInstance);
        }
        valueOf("crv", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "d");
    }
}
