package com.netcetera.threeds.sdk.infrastructure;

import java.util.List;

/* loaded from: classes5.dex */
public class setTooltipText implements com.netcetera.threeds.sdk.api.info.SchemeInfo {
    private static int cleanup = 0;
    private static int initialize = 1;
    private final String ThreeDS2Service;
    private final List<String> ThreeDS2ServiceInstance;
    private final String get;
    private final com.netcetera.threeds.sdk.api.info.CertificateInfo valueOf;
    private final List<com.netcetera.threeds.sdk.api.info.CertificateInfo> values;

    public setTooltipText(List<com.netcetera.threeds.sdk.api.info.CertificateInfo> list, com.netcetera.threeds.sdk.api.info.CertificateInfo certificateInfo, String str, String str2, List<String> list2) {
        this.values = list;
        this.valueOf = certificateInfo;
        this.get = str;
        this.ThreeDS2Service = str2;
        this.ThreeDS2ServiceInstance = list2;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public com.netcetera.threeds.sdk.api.info.CertificateInfo getEncryptionCertificate() {
        int i = initialize;
        com.netcetera.threeds.sdk.api.info.CertificateInfo certificateInfo = this.valueOf;
        cleanup = (i + 105) % 128;
        return certificateInfo;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public String getEncryptionCertificateKid() {
        int i = cleanup;
        int i2 = i & 101;
        int i3 = (((((i ^ 101) | i2) << 1) - (~(-((i | 101) & (~i2))))) - 1) % 128;
        initialize = i3;
        String str = this.get;
        int i4 = i3 & 33;
        cleanup = ((i4 - (~((i3 ^ 33) | i4))) - 1) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public List<String> getIds() {
        int i = initialize;
        List<String> list = this.ThreeDS2ServiceInstance;
        int i2 = i & 41;
        int i3 = (i ^ 41) | i2;
        cleanup = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return list;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public String getName() {
        int i = cleanup;
        int i2 = i & 5;
        int i3 = -(-((i ^ 5) | i2));
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            String str = this.ThreeDS2Service;
            int i5 = i & 41;
            int i6 = -(-((i ^ 41) | i5));
            initialize = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SchemeInfo
    public List<com.netcetera.threeds.sdk.api.info.CertificateInfo> getRootCertificates() {
        List<com.netcetera.threeds.sdk.api.info.CertificateInfo> list;
        int i = cleanup;
        int i2 = i & 7;
        int i3 = i2 + ((i ^ 7) | i2);
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.values;
            int i4 = 23 / 0;
        } else {
            list = this.values;
        }
        int i5 = (i ^ 78) + ((i & 78) << 1);
        initialize = ((~i5) + (i5 << 1)) % 128;
        return list;
    }
}
