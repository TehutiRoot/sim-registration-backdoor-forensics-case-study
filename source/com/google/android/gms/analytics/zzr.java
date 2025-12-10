package com.google.android.gms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbc;
import com.google.android.gms.internal.gtm.zzfu;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@SuppressLint({"StaticFieldLeak"})
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzr {

    /* renamed from: g */
    public static volatile zzr f44418g;

    /* renamed from: a */
    public final Context f44419a;

    /* renamed from: b */
    public final List f44420b;

    /* renamed from: c */
    public final zzg f44421c;

    /* renamed from: d */
    public final RH2 f44422d;

    /* renamed from: e */
    public volatile zzax f44423e;

    /* renamed from: f */
    public Thread.UncaughtExceptionHandler f44424f;

    public zzr(Context context) {
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f44419a = applicationContext;
        this.f44422d = new RH2(this);
        this.f44420b = new CopyOnWriteArrayList();
        this.f44421c = new zzg();
    }

    public static zzr zzb(Context context) {
        Preconditions.checkNotNull(context);
        if (f44418g == null) {
            synchronized (zzr.class) {
                try {
                    if (f44418g == null) {
                        f44418g = new zzr(context);
                    }
                } finally {
                }
            }
        }
        return f44418g;
    }

    public static void zzh() {
        if (Thread.currentThread() instanceof RI2) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    /* renamed from: c */
    public final void m48727c(zzh zzhVar) {
        if (!zzhVar.m48732d()) {
            if (!zzhVar.zzm()) {
                zzh zzhVar2 = new zzh(zzhVar);
                zzhVar2.m48733c();
                this.f44422d.execute(new UD2(this, zzhVar2));
                return;
            }
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        throw new IllegalStateException("Measurement prototype can't be submitted");
    }

    public final Context zza() {
        return this.f44419a;
    }

    public final zzax zzc() {
        if (this.f44423e == null) {
            synchronized (this) {
                try {
                    if (this.f44423e == null) {
                        zzax zzaxVar = new zzax();
                        PackageManager packageManager = this.f44419a.getPackageManager();
                        String packageName = this.f44419a.getPackageName();
                        zzaxVar.zzi(packageName);
                        zzaxVar.zzj(packageManager.getInstallerPackageName(packageName));
                        String str = null;
                        try {
                            PackageInfo packageInfo = packageManager.getPackageInfo(this.f44419a.getPackageName(), 0);
                            if (packageInfo != null) {
                                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    packageName = applicationLabel.toString();
                                }
                                str = packageInfo.versionName;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error retrieving package info: appName set to ");
                            sb.append(packageName);
                        }
                        zzaxVar.zzk(packageName);
                        zzaxVar.zzl(str);
                        this.f44423e = zzaxVar;
                    }
                } finally {
                }
            }
        }
        return this.f44423e;
    }

    public final zzbc zzd() {
        DisplayMetrics displayMetrics = this.f44419a.getResources().getDisplayMetrics();
        zzbc zzbcVar = new zzbc();
        zzbcVar.zze(zzfu.zzd(Locale.getDefault()));
        zzbcVar.zza = displayMetrics.widthPixels;
        zzbcVar.zzb = displayMetrics.heightPixels;
        return zzbcVar;
    }

    public final Future zzg(Callable callable) {
        Preconditions.checkNotNull(callable);
        if (Thread.currentThread() instanceof RI2) {
            FutureTask futureTask = new FutureTask(callable);
            futureTask.run();
            return futureTask;
        }
        return this.f44422d.submit(callable);
    }

    public final void zzi(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.f44422d.submit(runnable);
    }

    public final void zzj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f44424f = uncaughtExceptionHandler;
    }
}
