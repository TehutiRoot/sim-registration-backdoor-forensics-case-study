package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public final class zzhp implements zzhq {

    /* renamed from: a */
    public final Proxy f45860a;

    public zzhp() {
        this(null);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhq
    public final HttpURLConnection zza(URL url) throws IOException {
        URLConnection openConnection;
        Proxy proxy = this.f45860a;
        if (proxy == null) {
            openConnection = url.openConnection();
        } else {
            openConnection = url.openConnection(proxy);
        }
        return (HttpURLConnection) openConnection;
    }

    public zzhp(Proxy proxy) {
        this.f45860a = proxy;
    }
}