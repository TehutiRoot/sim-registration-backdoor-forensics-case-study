package com.google.android.gms.flags;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* loaded from: classes3.dex */
public final class zzb {

    /* renamed from: a */
    public boolean f45395a = false;

    /* renamed from: b */
    public zzc f45396b = null;

    public final void initialize(Context context) {
        synchronized (this) {
            if (this.f45395a) {
                return;
            }
            try {
                zzc asInterface = zzd.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.flags.impl.FlagProviderImpl"));
                this.f45396b = asInterface;
                asInterface.init(ObjectWrapper.wrap(context));
                this.f45395a = true;
            } catch (RemoteException | DynamiteModule.LoadingException e) {
                Log.w("FlagValueProvider", "Failed to initialize flags module.", e);
            }
        }
    }

    public final <T> T zzb(Flag<T> flag) {
        synchronized (this) {
            try {
                if (!this.f45395a) {
                    return flag.zzb();
                }
                return flag.zza(this.f45396b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
