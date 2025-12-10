package com.google.android.gms.internal.vision;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* loaded from: classes3.dex */
public final class zzbj {

    /* renamed from: a */
    public static final ArrayMap f47579a = new ArrayMap();

    public static synchronized Uri zza(String str) {
        Uri uri;
        String str2;
        synchronized (zzbj.class) {
            try {
                ArrayMap arrayMap = f47579a;
                uri = (Uri) arrayMap.get(str);
                if (uri == null) {
                    String valueOf = String.valueOf(Uri.encode(str));
                    if (valueOf.length() != 0) {
                        str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                    } else {
                        str2 = new String("content://com.google.android.gms.phenotype/");
                    }
                    uri = Uri.parse(str2);
                    arrayMap.put(str, uri);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uri;
    }
}
