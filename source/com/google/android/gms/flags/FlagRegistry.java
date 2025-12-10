package com.google.android.gms.flags;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public class FlagRegistry {

    /* renamed from: a */
    public final Collection f45385a = new ArrayList();

    /* renamed from: b */
    public final Collection f45386b = new ArrayList();

    /* renamed from: c */
    public final Collection f45387c = new ArrayList();

    @KeepForSdk
    public static void initialize(Context context) {
        Singletons.zzd().initialize(context);
    }

    public final void zza(Flag flag) {
        this.f45385a.add(flag);
    }
}
