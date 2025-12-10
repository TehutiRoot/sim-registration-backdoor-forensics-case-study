package com.tom_roush.pdfbox.pdmodel.encryption;

import java.security.cert.X509Certificate;

/* loaded from: classes5.dex */
public class PublicKeyRecipient {

    /* renamed from: a */
    public X509Certificate f60310a;

    /* renamed from: b */
    public AccessPermission f60311b;

    public AccessPermission getPermission() {
        return this.f60311b;
    }

    public X509Certificate getX509() {
        return this.f60310a;
    }

    public void setPermission(AccessPermission accessPermission) {
        this.f60311b = accessPermission;
    }

    public void setX509(X509Certificate x509Certificate) {
        this.f60310a = x509Certificate;
    }
}
