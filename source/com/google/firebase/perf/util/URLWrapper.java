package com.google.firebase.perf.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes4.dex */
public class URLWrapper {

    /* renamed from: a */
    public final URL f56287a;

    public URLWrapper(URL url) {
        this.f56287a = url;
    }

    public URLConnection openConnection() throws IOException {
        return this.f56287a.openConnection();
    }

    public String toString() {
        return this.f56287a.toString();
    }
}
