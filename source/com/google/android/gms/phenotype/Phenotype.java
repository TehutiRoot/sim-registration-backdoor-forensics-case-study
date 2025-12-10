package com.google.android.gms.phenotype;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.phenotype.zzd;

@KeepForSdk
/* loaded from: classes3.dex */
public final class Phenotype {

    /* renamed from: a */
    public static final Api.ClientKey f48504a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder f48505b;

    /* renamed from: c */
    public static final Api f48506c;

    /* renamed from: d */
    public static final zzm f48507d;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.phenotype.zzm, com.google.android.gms.internal.phenotype.zzd] */
    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f48504a = clientKey;
        SD2 sd2 = new SD2();
        f48505b = sd2;
        f48506c = new Api("Phenotype.API", sd2, clientKey);
        f48507d = new zzd();
    }

    @KeepForSdk
    public static Uri getContentProviderUri(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
