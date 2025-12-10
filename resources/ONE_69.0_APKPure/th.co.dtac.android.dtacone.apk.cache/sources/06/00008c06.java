package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
/* loaded from: classes3.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: b */
    public static final Object f45084b = new Object();

    /* renamed from: a */
    public boolean f45085a = false;

    @KeepForSdk
    public static boolean canUnparcelSafely(@NonNull String str) {
        synchronized (f45084b) {
        }
        return true;
    }

    @Nullable
    @KeepForSdk
    public static Integer getUnparcelClientVersion() {
        synchronized (f45084b) {
        }
        return null;
    }

    @KeepForSdk
    public abstract boolean prepareForClientVersion(int i);

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
        this.f45085a = z;
    }

    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.f45085a;
    }
}