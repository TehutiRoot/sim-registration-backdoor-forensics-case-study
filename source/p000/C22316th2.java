package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;

/* renamed from: th2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22316th2 implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ zze f107159a;

    public C22316th2(zze zzeVar) {
        this.f107159a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgz
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (!this.f107159a.f54556a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", zzc.zzc(str2));
        analyticsConnectorListener = this.f107159a.f54557b;
        analyticsConnectorListener.onMessageTriggered(2, bundle2);
    }
}
