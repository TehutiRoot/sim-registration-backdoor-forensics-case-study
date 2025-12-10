package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class zzht extends zzhh {

    /* renamed from: f */
    public static final String[] f45849f;

    /* renamed from: c */
    public final zzhq f45850c;

    /* renamed from: d */
    public final SSLSocketFactory f45851d;

    /* renamed from: e */
    public final HostnameVerifier f45852e;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        f45849f = strArr;
        Arrays.sort(strArr);
    }

    public zzht() {
        this(null, null, null);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhh
    public final boolean zzaj(String str) {
        if (Arrays.binarySearch(f45849f, str) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhh
    public final /* synthetic */ zzhk zzc(String str, String str2) throws IOException {
        Object[] objArr = {str};
        if (zzaj(str)) {
            HttpURLConnection zza = this.f45850c.zza(new URL(str2));
            zza.setRequestMethod(str);
            if (zza instanceof HttpsURLConnection) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) zza;
            }
            return new C22014rv2(zza);
        }
        throw new IllegalArgumentException(zzmt.zzb("HTTP method %s not supported", objArr));
    }

    public zzht(zzhq zzhqVar, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        zzhp zzhpVar;
        if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
            zzhpVar = new zzhp(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort")))));
        } else {
            zzhpVar = new zzhp();
        }
        this.f45850c = zzhpVar;
        this.f45851d = null;
        this.f45852e = null;
    }
}
