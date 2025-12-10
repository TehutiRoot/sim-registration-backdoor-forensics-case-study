package com.google.auth.oauth2;

import java.io.File;

/* loaded from: classes4.dex */
public class GoogleAuthUtils {
    /* renamed from: a */
    public static final File m41647a(C7374c c7374c) {
        File file;
        String m41513d = c7374c.m41513d("CLOUDSDK_CONFIG");
        if (m41513d != null) {
            file = new File(m41513d);
        } else if (c7374c.m41512e().indexOf("windows") >= 0) {
            file = new File(new File(c7374c.m41513d("APPDATA")), "gcloud");
        } else {
            file = new File(new File(c7374c.m41511f("user.home", ""), ".config"), "gcloud");
        }
        return new File(file, "application_default_credentials.json");
    }

    public static final String getWellKnownCredentialsPath() {
        return m41647a(C7374c.f52657d).getAbsolutePath();
    }
}
