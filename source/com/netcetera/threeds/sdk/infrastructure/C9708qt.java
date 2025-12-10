package com.netcetera.threeds.sdk.infrastructure;

import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qt */
/* loaded from: classes5.dex */
public class C9708qt extends AbstractC9705qq {

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qt$ThreeDS2Service */
    /* loaded from: classes5.dex */
    public static class ThreeDS2Service extends C9708qt {
        public ThreeDS2Service() {
            super("PS256", "SHA256withRSAandMGF1");
            MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            get(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 32, 1));
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qt$ThreeDS2ServiceInstance */
    /* loaded from: classes5.dex */
    public static class ThreeDS2ServiceInstance extends C9708qt {
        public ThreeDS2ServiceInstance() {
            super("RS384", "SHA384withRSA");
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qt$cleanup */
    /* loaded from: classes5.dex */
    public static class cleanup extends C9708qt {
        public cleanup() {
            super("RS512", "SHA512withRSA");
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qt$get */
    /* loaded from: classes5.dex */
    public static class get extends C9708qt {
        public get() {
            super("RS256", "SHA256withRSA");
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qt$valueOf */
    /* loaded from: classes5.dex */
    public static class valueOf extends C9708qt {
        public valueOf() {
            super("PS384", "SHA384withRSAandMGF1");
            MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            get(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 48, 1));
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.qt$values */
    /* loaded from: classes5.dex */
    public static class values extends C9708qt {
        public values() {
            super("PS512", "SHA512withRSAandMGF1");
            MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            get(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 64, 1));
        }
    }

    public C9708qt(String str, String str2) {
        super(str, str2, "RSA");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9705qq
    public void ThreeDS2ServiceInstance(PublicKey publicKey) throws C9728rm {
        C9714qz.values(publicKey);
    }
}
