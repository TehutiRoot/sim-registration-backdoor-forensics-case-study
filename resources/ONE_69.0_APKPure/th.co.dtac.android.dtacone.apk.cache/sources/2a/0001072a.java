package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;

/* renamed from: qi2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C21866qi2 implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ zze f77282a;

    public C21866qi2(zze zzeVar) {
        this.f77282a = zzeVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgz
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (!this.f77282a.f54568a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", zzc.zzc(str2));
        analyticsConnectorListener = this.f77282a.f54569b;
        analyticsConnectorListener.onMessageTriggered(2, bundle2);
    }
}