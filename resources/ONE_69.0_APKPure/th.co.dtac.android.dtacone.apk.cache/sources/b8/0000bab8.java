package com.netcetera.threeds.sdk.api.info;

import java.util.Date;

/* loaded from: classes5.dex */
public interface CertificateInfo {

    /* loaded from: classes5.dex */
    public enum CertificateType {
        CERTIFICATE,
        PUBLIC_KEY;
        
        private static int ThreeDS2Service = 1;
        private static int valueOf;

        static {
            int i = valueOf + 111;
            ThreeDS2Service = i % 128;
            if (i % 2 == 0) {
                int i2 = 17 / 0;
            }
        }

        public static CertificateType valueOf(String str) {
            valueOf = (ThreeDS2Service + 75) % 128;
            CertificateType certificateType = (CertificateType) Enum.valueOf(CertificateType.class, str);
            int i = valueOf + 53;
            ThreeDS2Service = i % 128;
            if (i % 2 != 0) {
                return certificateType;
            }
            throw null;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CertificateType[] valuesCustom() {
            ThreeDS2Service = (valueOf + 1) % 128;
            CertificateType[] certificateTypeArr = (CertificateType[]) values().clone();
            int i = ThreeDS2Service + 83;
            valueOf = i % 128;
            if (i % 2 != 0) {
                int i2 = 5 / 0;
            }
            return certificateTypeArr;
        }
    }

    String getCertPrefix();

    Date getExpiryDate();

    String getName();

    CertificateType getType();
}