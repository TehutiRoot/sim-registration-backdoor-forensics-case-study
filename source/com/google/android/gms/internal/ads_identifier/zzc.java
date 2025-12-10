package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* loaded from: classes3.dex */
public final class zzc {

    /* renamed from: a */
    public static final ClassLoader f45419a = zzc.class.getClassLoader();

    public static void zza(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean zzb(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
