package com.netcetera.threeds.sdk.api.info;

import java.util.List;

/* loaded from: classes5.dex */
public interface SchemeInfo {
    CertificateInfo getEncryptionCertificate();

    String getEncryptionCertificateKid();

    List<String> getIds();

    String getName();

    List<CertificateInfo> getRootCertificates();
}
