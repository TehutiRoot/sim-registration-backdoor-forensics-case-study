package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* loaded from: classes3.dex */
public final class zzhp {

    /* renamed from: a */
    public static final ArrayMap f46298a = new ArrayMap();

    public static synchronized Uri zza(String str) {
        synchronized (zzhp.class) {
            ArrayMap arrayMap = f46298a;
            Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                arrayMap.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
