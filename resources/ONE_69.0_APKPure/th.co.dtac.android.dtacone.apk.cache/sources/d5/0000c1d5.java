package com.tom_roush.pdfbox.pdmodel.encryption;

import java.security.cert.X509Certificate;

/* loaded from: classes5.dex */
public class PublicKeyRecipient {

    /* renamed from: a */
    public X509Certificate f60322a;

    /* renamed from: b */
    public AccessPermission f60323b;

    public AccessPermission getPermission() {
        return this.f60323b;
    }

    public X509Certificate getX509() {
        return this.f60322a;
    }

    public void setPermission(AccessPermission accessPermission) {
        this.f60323b = accessPermission;
    }

    public void setX509(X509Certificate x509Certificate) {
        this.f60322a = x509Certificate;
    }
}