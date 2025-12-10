package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public class Wrappers {

    /* renamed from: b */
    public static final Wrappers f45343b = new Wrappers();

    /* renamed from: a */
    public PackageManagerWrapper f45344a = null;

    @NonNull
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@NonNull Context context) {
        return f45343b.zza(context);
    }

    @NonNull
    @VisibleForTesting
    public final synchronized PackageManagerWrapper zza(@NonNull Context context) {
        try {
            if (this.f45344a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f45344a = new PackageManagerWrapper(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f45344a;
    }
}
