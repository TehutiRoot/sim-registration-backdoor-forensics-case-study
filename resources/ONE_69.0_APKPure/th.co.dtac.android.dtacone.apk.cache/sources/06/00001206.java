package p000;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

/* renamed from: Sy */
/* loaded from: classes4.dex */
public class C1333Sy implements AnalyticsConnector.AnalyticsConnectorListener {

    /* renamed from: a */
    public AnalyticsEventReceiver f6080a;

    /* renamed from: b */
    public AnalyticsEventReceiver f6081b;

    /* renamed from: a */
    public static void m66431a(AnalyticsEventReceiver analyticsEventReceiver, String str, Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(str, bundle);
    }

    /* renamed from: b */
    public final void m66430b(String str, Bundle bundle) {
        AnalyticsEventReceiver analyticsEventReceiver;
        if ("clx".equals(bundle.getString("_o"))) {
            analyticsEventReceiver = this.f6080a;
        } else {
            analyticsEventReceiver = this.f6081b;
        }
        m66431a(analyticsEventReceiver, str, bundle);
    }

    /* renamed from: c */
    public void m66429c(AnalyticsEventReceiver analyticsEventReceiver) {
        this.f6081b = analyticsEventReceiver;
    }

    /* renamed from: d */
    public void m66428d(AnalyticsEventReceiver analyticsEventReceiver) {
        this.f6080a = analyticsEventReceiver;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i, Bundle bundle) {
        String string;
        Logger.getLogger().m39126v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m66430b(string, bundle2);
        }
    }
}