package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.identifier.a */
/* loaded from: classes3.dex */
public final class C6304a extends Thread {

    /* renamed from: a */
    public final /* synthetic */ Map f44377a;

    public C6304a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f44377a = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f44377a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.zza(buildUpon.build().toString());
    }
}