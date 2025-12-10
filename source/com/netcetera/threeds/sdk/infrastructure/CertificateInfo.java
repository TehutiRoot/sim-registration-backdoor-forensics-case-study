package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SDKAlreadyInitializedException;

/* loaded from: classes5.dex */
class CertificateInfo implements getSDKEphemeralPublicKey {
    private final SDKAlreadyInitializedException.ThreeDS2Service values;

    /* loaded from: classes5.dex */
    class CertificateType implements getSDKEphemeralPublicKey {
        private final SDKAlreadyInitializedException.ThreeDS2Service get;

        public CertificateType(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
            this.get = threeDS2Service;
        }

        @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
        public Object ThreeDS2Service() {
            setSelectionAfterHeaderView SchemeConfiguration;
            SchemeConfiguration = SDKAlreadyInitializedException.SchemeConfiguration(this.get);
            return SchemeConfiguration;
        }
    }

    public CertificateInfo(SDKAlreadyInitializedException.ThreeDS2Service threeDS2Service) {
        this.values = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getSDKEphemeralPublicKey
    public Object ThreeDS2Service() {
        C9582lz configureScheme;
        configureScheme = SDKAlreadyInitializedException.configureScheme(this.values);
        return configureScheme;
    }
}
