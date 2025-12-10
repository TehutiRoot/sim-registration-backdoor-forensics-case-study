package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes3.dex */
public class LifecycleActivity {

    /* renamed from: a */
    public final Object f44786a;

    public LifecycleActivity(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.f44786a = activity;
    }

    @NonNull
    public final Activity zza() {
        return (Activity) this.f44786a;
    }

    @NonNull
    public final FragmentActivity zzb() {
        return (FragmentActivity) this.f44786a;
    }

    public final boolean zzc() {
        return this.f44786a instanceof Activity;
    }

    public final boolean zzd() {
        return this.f44786a instanceof FragmentActivity;
    }

    @KeepForSdk
    public LifecycleActivity(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}