package com.google.android.gms.internal.gtm;

import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzsk extends zzsj {
    public static boolean zza(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
