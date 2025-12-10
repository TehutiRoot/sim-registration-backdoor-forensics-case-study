package com.google.auth.oauth2;

import java.io.Serializable;

/* loaded from: classes4.dex */
class SystemEnvironmentProvider implements InterfaceC0866MS, Serializable {
    static final SystemEnvironmentProvider INSTANCE = new SystemEnvironmentProvider();
    private static final long serialVersionUID = -4698164985883575244L;

    private SystemEnvironmentProvider() {
    }

    public static SystemEnvironmentProvider getInstance() {
        return INSTANCE;
    }

    @Override // p000.InterfaceC0866MS
    public String getEnv(String str) {
        return System.getenv(str);
    }
}