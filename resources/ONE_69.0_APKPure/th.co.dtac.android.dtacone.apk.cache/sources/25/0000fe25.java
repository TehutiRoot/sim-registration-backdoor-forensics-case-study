package org.bouncycastle.jce.provider;

import java.security.cert.X509Certificate;

/* renamed from: org.bouncycastle.jce.provider.c */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC12818c {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ X509Certificate m24628a(ProvRevocationChecker provRevocationChecker) {
        return provRevocationChecker.getOcspResponderCert();
    }
}