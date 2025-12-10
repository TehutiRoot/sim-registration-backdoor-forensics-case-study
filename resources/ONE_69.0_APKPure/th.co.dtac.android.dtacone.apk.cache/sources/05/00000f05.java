package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzg;

/* renamed from: Pn2 */
/* loaded from: classes4.dex */
public final class Pn2 implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ zzg f4888a;

    public Pn2(zzg zzgVar) {
        this.f4888a = zzgVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgz
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener;
        if (str != null && !str.equals(AppMeasurement.CRASH_ORIGIN) && zzc.zzk(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            analyticsConnectorListener = this.f4888a.f54572a;
            analyticsConnectorListener.onMessageTriggered(3, bundle2);
        }
    }
}