package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzbz extends zzce {

    /* renamed from: a */
    public final AtomicReference f46263a = new AtomicReference();

    /* renamed from: b */
    public boolean f46264b;

    public static final Object zze(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(PDPageLabelRange.STYLE_ROMAN_LOWER)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    public final Bundle zzb(long j) {
        Bundle bundle;
        synchronized (this.f46263a) {
            if (!this.f46264b) {
                try {
                    this.f46263a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f46263a.get();
        }
        return bundle;
    }

    public final String zzc(long j) {
        return (String) zze(zzb(j), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zzd(Bundle bundle) {
        synchronized (this.f46263a) {
            try {
                this.f46263a.set(bundle);
                this.f46264b = true;
                this.f46263a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}