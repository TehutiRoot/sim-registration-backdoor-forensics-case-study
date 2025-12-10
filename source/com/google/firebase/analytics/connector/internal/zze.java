package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zze implements zza {

    /* renamed from: a */
    public final Set f54556a;

    /* renamed from: b */
    public final AnalyticsConnector.AnalyticsConnectorListener f54557b;

    /* renamed from: c */
    public final AppMeasurementSdk f54558c;

    /* renamed from: d */
    public final C22316th2 f54559d;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f54557b = analyticsConnectorListener;
        this.f54558c = appMeasurementSdk;
        C22316th2 c22316th2 = new C22316th2(this);
        this.f54559d = c22316th2;
        appMeasurementSdk.registerOnMeasurementEventListener(c22316th2);
        this.f54556a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.f54557b;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
        this.f54556a.clear();
        Set set2 = this.f54556a;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() >= 50) {
                break;
            } else if (zzc.zzf(str) && zzc.zzg(str)) {
                String zzd = zzc.zzd(str);
                Preconditions.checkNotNull(zzd);
                hashSet.add(zzd);
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.f54556a.clear();
    }
}
