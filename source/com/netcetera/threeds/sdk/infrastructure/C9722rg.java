package com.netcetera.threeds.sdk.infrastructure;

import java.io.ByteArrayInputStream;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.rg */
/* loaded from: classes5.dex */
public class C9722rg {
    private CertificateFactory get;

    public C9722rg() {
        try {
            this.get = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            throw new IllegalStateException("Couldn't find X.509 CertificateFactory!?!", e);
        }
    }

    public static C9722rg ThreeDS2ServiceInstance(String str) throws C9727rl {
        if (str == null) {
            return new C9722rg();
        }
        try {
            return new C9722rg(str);
        } catch (NoSuchProviderException e) {
            throw new C9727rl("Provider " + str + " not found when creating X509Util.", e);
        }
    }

    public String get(X509Certificate x509Certificate) {
        try {
            return C9668ol.get(x509Certificate.getEncoded());
        } catch (CertificateEncodingException e) {
            throw new IllegalStateException("Unexpected problem getting encoded certificate.", e);
        }
    }

    public X509Certificate valueOf(String str) throws C9727rl {
        try {
            return (X509Certificate) this.get.generateCertificate(new ByteArrayInputStream(C9668ol.valueOf(str)));
        } catch (CertificateException e) {
            throw new C9727rl("Unable to convert " + str + " value to X509Certificate: " + e, e);
        }
    }

    public C9722rg(String str) throws NoSuchProviderException {
        try {
            this.get = CertificateFactory.getInstance("X.509", str);
        } catch (CertificateException e) {
            throw new IllegalStateException("Couldn't find X.509 CertificateFactory!?!", e);
        }
    }
}
