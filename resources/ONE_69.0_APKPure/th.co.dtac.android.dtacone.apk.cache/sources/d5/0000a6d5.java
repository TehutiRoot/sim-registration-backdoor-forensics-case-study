package com.google.auth.oauth2;

import java.io.File;

/* loaded from: classes4.dex */
public class GoogleAuthUtils {
    /* renamed from: a */
    public static final File m41634a(C7363c c7363c) {
        File file;
        String m41500d = c7363c.m41500d("CLOUDSDK_CONFIG");
        if (m41500d != null) {
            file = new File(m41500d);
        } else if (c7363c.m41499e().indexOf("windows") >= 0) {
            file = new File(new File(c7363c.m41500d("APPDATA")), "gcloud");
        } else {
            file = new File(new File(c7363c.m41498f("user.home", ""), ".config"), "gcloud");
        }
        return new File(file, "application_default_credentials.json");
    }

    public static final String getWellKnownCredentialsPath() {
        return m41634a(C7363c.f52669d).getAbsolutePath();
    }
}