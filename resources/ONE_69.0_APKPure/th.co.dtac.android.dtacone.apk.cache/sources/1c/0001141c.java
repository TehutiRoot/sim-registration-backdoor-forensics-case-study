package th.p047co.dtac.android.dtacone.configuration.tracker;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import java.util.ArrayList;
import java.util.List;

/* renamed from: th.co.dtac.android.dtacone.configuration.tracker.DtacTracker */
/* loaded from: classes7.dex */
public class DtacTracker {

    /* renamed from: d */
    public static List f83519d;

    /* renamed from: a */
    public Tracker f83520a;

    /* renamed from: b */
    public String f83521b;

    /* renamed from: c */
    public List f83522c;

    public DtacTracker(String str) {
        setId(str);
    }

    /* renamed from: c */
    public static DtacTracker m19767c(String str) {
        if (f83519d == null) {
            f83519d = new ArrayList();
        }
        f83519d.add(new DtacTracker(str));
        List list = f83519d;
        return (DtacTracker) list.get(list.size() - 1);
    }

    public static DtacTracker getInstance(String str) {
        List list = f83519d;
        if (list != null && !list.isEmpty()) {
            for (DtacTracker dtacTracker : f83519d) {
                if (dtacTracker != null && dtacTracker.getId().equals(str)) {
                    return dtacTracker;
                }
            }
            return m19767c(str);
        }
        return m19767c(str);
    }

    /* renamed from: a */
    public final void m19769a(String str, boolean z) {
        if (z) {
            str = new C21300nP1().m26418a(str);
        }
        if (this.f83522c == null) {
            this.f83522c = new ArrayList();
        }
        this.f83522c.add(str);
    }

    public DtacTracker addOrUpdateTelNo(String str) {
        m19768b();
        m19769a(str, true);
        return this;
    }

    public DtacTracker addOrUpdateTelNoAndTelType(String str, String str2) {
        m19768b();
        m19769a(str, true);
        m19769a(str2, false);
        return this;
    }

    /* renamed from: b */
    public final void m19768b() {
        List list = this.f83522c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m19766d(String str) {
    }

    /* renamed from: e */
    public final DtacTracker m19765e(Context context) {
        if (this.f83520a == null) {
            this.f83520a = getDefaultTracker(context);
            m19766d("SUCCESS");
        } else {
            m19766d("START TRACKER  ALREADY CREATED");
        }
        return this;
    }

    public synchronized Tracker getDefaultTracker(Context context) {
        try {
            if (this.f83520a == null) {
                this.f83520a = GoogleAnalytics.getInstance(context).newTracker(this.f83521b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f83520a;
    }

    public String getId() {
        if (this.f83521b == null) {
            this.f83521b = "";
        }
        return this.f83521b;
    }

    public void setId(String str) {
        this.f83521b = str;
    }

    public void trackEvent(String str, String str2, String str3, long j) {
        HitBuilders.EventBuilder value = new HitBuilders.EventBuilder().setCategory(str).setAction(str2).setLabel(str3).setValue(j);
        List list = this.f83522c;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f83522c.size()) {
                int i2 = i + 1;
                value.setCustomDimension(i2, (String) this.f83522c.get(i));
                i = i2;
            }
        }
        this.f83520a.send(value.build());
        m19766d("EVENT TRACKER : Category = " + str + ", Event = " + str2);
    }

    public void trackScreen(String str) {
        this.f83520a.setScreenName(str);
        HitBuilders.ScreenViewBuilder screenViewBuilder = new HitBuilders.ScreenViewBuilder();
        List list = this.f83522c;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f83522c.size()) {
                int i2 = i + 1;
                screenViewBuilder.setCustomDimension(i2, (String) this.f83522c.get(i));
                i = i2;
            }
        }
        this.f83520a.send(screenViewBuilder.build());
        m19766d("SCREEN TRACKER  : " + str);
    }

    public static DtacTracker getInstance(Context context, String str) {
        return getInstance(str).m19765e(context);
    }
}