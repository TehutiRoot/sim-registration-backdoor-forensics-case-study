package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GmsClientSupervisor {

    /* renamed from: a */
    public static final Object f45093a = new Object();

    /* renamed from: b */
    public static C21570pJ2 f45094b = null;

    /* renamed from: c */
    public static HandlerThread f45095c = null;

    /* renamed from: d */
    public static Executor f45096d = null;

    /* renamed from: e */
    public static boolean f45097e = false;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @NonNull
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@NonNull Context context) {
        Looper mainLooper;
        synchronized (f45093a) {
            try {
                if (f45094b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f45097e) {
                        mainLooper = getOrStartHandlerThread().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    f45094b = new C21570pJ2(applicationContext, mainLooper, f45096d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f45094b;
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (f45093a) {
            try {
                HandlerThread handlerThread = f45095c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f45095c = handlerThread2;
                handlerThread2.start();
                return f45095c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(@Nullable Executor executor) {
        synchronized (f45093a) {
            try {
                C21570pJ2 c21570pJ2 = f45094b;
                if (c21570pJ2 != null) {
                    c21570pJ2.m23702f(executor);
                }
                f45096d = executor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (f45093a) {
            try {
                C21570pJ2 c21570pJ2 = f45094b;
                if (c21570pJ2 != null && !f45097e) {
                    c21570pJ2.m23701g(getOrStartHandlerThread().getLooper());
                }
                f45097e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        return zzc(new zzo(componentName, 4225), serviceConnection, str, null);
    }

    @KeepForSdk
    public void unbindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        zza(new zzo(componentName, 4225), serviceConnection, str);
    }

    public abstract void zza(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public final void zzb(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z) {
        zza(new zzo(str, str2, 4225, z), serviceConnection, str3);
    }

    public abstract boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor);

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str, @Nullable Executor executor) {
        return zzc(new zzo(componentName, 4225), serviceConnection, str, executor);
    }

    @KeepForSdk
    public void unbindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        zza(new zzo(str, 4225, false), serviceConnection, str2);
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread(int i) {
        synchronized (f45093a) {
            try {
                HandlerThread handlerThread = f45095c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i);
                f45095c = handlerThread2;
                handlerThread2.start();
                return f45095c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public boolean bindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        return zzc(new zzo(str, 4225, false), serviceConnection, str2, null);
    }
}
