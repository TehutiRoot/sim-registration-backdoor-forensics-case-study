package com.google.android.gms.internal.vision;

import com.google.android.gms.vision.C6768L;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzr {

    /* renamed from: a */
    public static final Object f47678a = new Object();

    /* renamed from: b */
    public static final HashMap f47679b = new HashMap();

    public static boolean zza(String str, String str2) {
        String str3;
        int i;
        synchronized (f47678a) {
            try {
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(str2);
                if (valueOf2.length() != 0) {
                    str3 = valueOf.concat(valueOf2);
                } else {
                    str3 = new String(valueOf);
                }
                HashMap hashMap = f47679b;
                if (hashMap.containsKey(str3)) {
                    i = ((Integer) hashMap.get(str3)).intValue();
                } else {
                    i = 0;
                }
                if ((i & 1) != 0) {
                    return true;
                }
                try {
                    System.loadLibrary(str2);
                    hashMap.put(str3, Integer.valueOf(i | 1));
                    return true;
                } catch (UnsatisfiedLinkError e) {
                    if ((i & 4) == 0) {
                        C6768L.m45993e(e, "System.loadLibrary failed: %s", str2);
                        f47679b.put(str3, Integer.valueOf(i | 4));
                    }
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}