package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.vision.C6779L;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public abstract class zzt<T> {

    /* renamed from: a */
    public final Context f47668a;

    /* renamed from: c */
    public final String f47670c;

    /* renamed from: d */
    public final String f47671d;

    /* renamed from: e */
    public final String f47672e;

    /* renamed from: h */
    public Object f47675h;

    /* renamed from: b */
    public final Object f47669b = new Object();

    /* renamed from: f */
    public boolean f47673f = false;

    /* renamed from: g */
    public boolean f47674g = false;

    public zzt(Context context, String str, String str2) {
        String str3;
        this.f47668a = context;
        this.f47670c = str;
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str3 = "com.google.android.gms.vision.dynamite.".concat(valueOf);
        } else {
            str3 = new String("com.google.android.gms.vision.dynamite.");
        }
        this.f47671d = str3;
        this.f47672e = str2;
    }

    @Nullable
    public abstract T zza(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException;

    public abstract void zza() throws RemoteException;

    public final boolean zzb() {
        if (zzd() != null) {
            return true;
        }
        return false;
    }

    public final void zzc() {
        synchronized (this.f47669b) {
            if (this.f47675h == null) {
                return;
            }
            try {
                zza();
            } catch (RemoteException unused) {
            }
        }
    }

    @Nullable
    @RequiresNonNull({CoreConstants.CONTEXT_SCOPE_VALUE, "thickFeatureName", "featureName"})
    public final T zzd() {
        DynamiteModule dynamiteModule;
        synchronized (this.f47669b) {
            T t = (T) this.f47675h;
            if (t != null) {
                return t;
            }
            try {
                dynamiteModule = DynamiteModule.load(this.f47668a, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, this.f47671d);
            } catch (DynamiteModule.LoadingException unused) {
                String format = String.format("%s.%s", "com.google.android.gms.vision", this.f47672e);
                C6779L.m46011d("Cannot load thick client module, fall back to load optional module %s", format);
                try {
                    dynamiteModule = DynamiteModule.load(this.f47668a, DynamiteModule.PREFER_REMOTE, format);
                } catch (DynamiteModule.LoadingException e) {
                    C6779L.m46008e(e, "Error loading optional module %s", format);
                    if (!this.f47673f) {
                        C6779L.m46011d("Broadcasting download intent for dependency %s", this.f47672e);
                        String str = this.f47672e;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f47668a.sendBroadcast(intent);
                        this.f47673f = true;
                    }
                    dynamiteModule = null;
                }
            }
            if (dynamiteModule != null) {
                try {
                    this.f47675h = zza(dynamiteModule, this.f47668a);
                } catch (RemoteException | DynamiteModule.LoadingException unused2) {
                }
            }
            boolean z = this.f47674g;
            if (!z && this.f47675h == null) {
                Log.w(this.f47670c, "Native handle not yet available. Reverting to no-op handle.");
                this.f47674g = true;
            } else if (z && this.f47675h != null) {
                Log.w(this.f47670c, "Native handle is now available.");
            }
            return (T) this.f47675h;
        }
    }
}
