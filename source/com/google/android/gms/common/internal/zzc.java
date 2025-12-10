package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class zzc {

    /* renamed from: a */
    public Object f45176a;

    /* renamed from: b */
    public boolean f45177b = false;

    /* renamed from: c */
    public final /* synthetic */ BaseGmsClient f45178c;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.f45178c = baseGmsClient;
        this.f45176a = obj;
    }

    public abstract void zza(Object obj);

    public abstract void zzc();

    public final void zze() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f45176a;
                if (this.f45177b) {
                    String obj2 = toString();
                    Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            zza(obj);
        }
        synchronized (this) {
            this.f45177b = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.f45176a = null;
        }
    }

    public final void zzg() {
        ArrayList arrayList;
        ArrayList arrayList2;
        zzf();
        arrayList = this.f45178c.f45039q;
        synchronized (arrayList) {
            arrayList2 = this.f45178c.f45039q;
            arrayList2.remove(this);
        }
    }
}
