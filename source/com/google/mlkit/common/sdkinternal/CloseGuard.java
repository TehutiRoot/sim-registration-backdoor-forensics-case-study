package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzmm;
import com.google.android.gms.internal.mlkit_common.zzmn;
import com.google.android.gms.internal.mlkit_common.zzmv;
import com.google.android.gms.internal.mlkit_common.zzmw;
import com.google.android.gms.internal.mlkit_common.zzsh;
import com.google.android.gms.internal.mlkit_common.zzsk;
import com.google.android.gms.internal.mlkit_common.zzss;
import com.google.mlkit.common.sdkinternal.Cleaner;
import java.io.Closeable;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
/* loaded from: classes4.dex */
public class CloseGuard implements Closeable {
    @KeepForSdk
    public static final int API_TRANSLATE = 1;

    /* renamed from: a */
    public final AtomicBoolean f56907a = new AtomicBoolean();

    /* renamed from: b */
    public final String f56908b;

    /* renamed from: c */
    public final Cleaner.Cleanable f56909c;

    @KeepForSdk
    /* loaded from: classes4.dex */
    public static class Factory {

        /* renamed from: a */
        public final Cleaner f56910a;

        public Factory(@NonNull Cleaner cleaner) {
            this.f56910a = cleaner;
        }

        @NonNull
        @KeepForSdk
        public CloseGuard create(@NonNull Object obj, int i, @NonNull Runnable runnable) {
            return new CloseGuard(obj, i, this.f56910a, runnable, zzss.zzb("common"));
        }
    }

    public CloseGuard(Object obj, final int i, Cleaner cleaner, final Runnable runnable, final zzsh zzshVar) {
        this.f56908b = obj.toString();
        this.f56909c = cleaner.register(obj, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zze
            @Override // java.lang.Runnable
            public final void run() {
                CloseGuard.this.m37241b(i, zzshVar, runnable);
            }
        });
    }

    /* renamed from: b */
    public final /* synthetic */ void m37241b(int i, zzsh zzshVar, Runnable runnable) {
        if (!this.f56907a.get()) {
            String.format(Locale.ENGLISH, "%s has not been closed", this.f56908b);
            zzmw zzmwVar = new zzmw();
            zzmn zzmnVar = new zzmn();
            zzmnVar.zzb(zzmm.zzb(i));
            zzmwVar.zzh(zzmnVar.zzc());
            zzshVar.zzd(zzsk.zzf(zzmwVar), zzmv.HANDLE_LEAKED);
        }
        runnable.run();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f56907a.set(true);
        this.f56909c.clean();
    }
}
