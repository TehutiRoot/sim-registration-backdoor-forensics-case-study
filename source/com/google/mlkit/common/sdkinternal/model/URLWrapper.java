package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@KeepForSdk
/* loaded from: classes4.dex */
public class URLWrapper {

    /* renamed from: a */
    public final URL f56990a;

    @KeepForSdk
    public URLWrapper(@NonNull String str) throws MalformedURLException {
        this.f56990a = new URL(str);
    }

    @NonNull
    @KeepForSdk
    public URLConnection openConnection() throws IOException {
        return this.f56990a.openConnection();
    }
}
