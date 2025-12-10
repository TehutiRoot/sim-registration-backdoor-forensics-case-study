package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzhh {

    /* renamed from: a */
    public static final Logger f45840a = Logger.getLogger(zzhh.class.getName());

    /* renamed from: b */
    public static final String[] f45841b;

    static {
        String[] strArr = {"DELETE", "GET", "POST", "PUT"};
        f45841b = strArr;
        Arrays.sort(strArr);
    }

    public final zzhb zza(zzhe zzheVar) {
        return new zzhb(this, zzheVar);
    }

    public boolean zzaj(String str) throws IOException {
        if (Arrays.binarySearch(f45841b, str) >= 0) {
            return true;
        }
        return false;
    }

    public abstract zzhk zzc(String str, String str2) throws IOException;
}
