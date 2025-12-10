package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzg implements zza {

    /* renamed from: a */
    public final AnalyticsConnector.AnalyticsConnectorListener f54560a;

    /* renamed from: b */
    public final AppMeasurementSdk f54561b;

    /* renamed from: c */
    public final Sm2 f54562c;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f54560a = analyticsConnectorListener;
        this.f54561b = appMeasurementSdk;
        Sm2 sm2 = new Sm2(this);
        this.f54562c = sm2;
        appMeasurementSdk.registerOnMeasurementEventListener(sm2);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.f54560a;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
    }
}
