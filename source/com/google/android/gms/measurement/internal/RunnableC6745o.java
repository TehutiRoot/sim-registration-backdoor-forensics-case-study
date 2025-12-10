package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: com.google.android.gms.measurement.internal.o */
/* loaded from: classes3.dex */
public final class RunnableC6745o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bundle f48206a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48207b;

    public RunnableC6745o(zzid zzidVar, Bundle bundle) {
        this.f48207b = zzidVar;
        this.f48206a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzid zzidVar = this.f48207b;
        Bundle bundle = this.f48206a;
        zzidVar.zzg();
        zzidVar.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!zzidVar.zzs.zzJ()) {
            zzidVar.zzs.zzay().zzj().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzidVar.zzs.zzt().zzE(new zzac(bundle.getString("app_id"), "", new zzlc(checkNotEmpty, 0L, null, ""), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzidVar.zzs.zzv().m46111S(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), "", bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
