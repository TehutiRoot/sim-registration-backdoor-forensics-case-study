package p000;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

/* renamed from: Sy */
/* loaded from: classes4.dex */
public class C1350Sy implements AnalyticsConnector.AnalyticsConnectorListener {

    /* renamed from: a */
    public AnalyticsEventReceiver f5880a;

    /* renamed from: b */
    public AnalyticsEventReceiver f5881b;

    /* renamed from: a */
    public static void m66256a(AnalyticsEventReceiver analyticsEventReceiver, String str, Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(str, bundle);
    }

    /* renamed from: b */
    public final void m66255b(String str, Bundle bundle) {
        AnalyticsEventReceiver analyticsEventReceiver;
        if ("clx".equals(bundle.getString("_o"))) {
            analyticsEventReceiver = this.f5880a;
        } else {
            analyticsEventReceiver = this.f5881b;
        }
        m66256a(analyticsEventReceiver, str, bundle);
    }

    /* renamed from: c */
    public void m66254c(AnalyticsEventReceiver analyticsEventReceiver) {
        this.f5881b = analyticsEventReceiver;
    }

    /* renamed from: d */
    public void m66253d(AnalyticsEventReceiver analyticsEventReceiver) {
        this.f5880a = analyticsEventReceiver;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i, Bundle bundle) {
        String string;
        Logger.getLogger().m39134v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m66255b(string, bundle2);
        }
    }
}
