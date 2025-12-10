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
    public static List f83422d;

    /* renamed from: a */
    public Tracker f83423a;

    /* renamed from: b */
    public String f83424b;

    /* renamed from: c */
    public List f83425c;

    public DtacTracker(String str) {
        setId(str);
    }

    /* renamed from: c */
    public static DtacTracker m19593c(String str) {
        if (f83422d == null) {
            f83422d = new ArrayList();
        }
        f83422d.add(new DtacTracker(str));
        List list = f83422d;
        return (DtacTracker) list.get(list.size() - 1);
    }

    public static DtacTracker getInstance(String str) {
        List list = f83422d;
        if (list != null && !list.isEmpty()) {
            for (DtacTracker dtacTracker : f83422d) {
                if (dtacTracker != null && dtacTracker.getId().equals(str)) {
                    return dtacTracker;
                }
            }
            return m19593c(str);
        }
        return m19593c(str);
    }

    /* renamed from: a */
    public final void m19595a(String str, boolean z) {
        if (z) {
            str = new C21754qO1().m23505a(str);
        }
        if (this.f83425c == null) {
            this.f83425c = new ArrayList();
        }
        this.f83425c.add(str);
    }

    public DtacTracker addOrUpdateTelNo(String str) {
        m19594b();
        m19595a(str, true);
        return this;
    }

    public DtacTracker addOrUpdateTelNoAndTelType(String str, String str2) {
        m19594b();
        m19595a(str, true);
        m19595a(str2, false);
        return this;
    }

    /* renamed from: b */
    public final void m19594b() {
        List list = this.f83425c;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m19592d(String str) {
    }

    /* renamed from: e */
    public final DtacTracker m19591e(Context context) {
        if (this.f83423a == null) {
            this.f83423a = getDefaultTracker(context);
            m19592d("SUCCESS");
        } else {
            m19592d("START TRACKER  ALREADY CREATED");
        }
        return this;
    }

    public synchronized Tracker getDefaultTracker(Context context) {
        try {
            if (this.f83423a == null) {
                this.f83423a = GoogleAnalytics.getInstance(context).newTracker(this.f83424b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f83423a;
    }

    public String getId() {
        if (this.f83424b == null) {
            this.f83424b = "";
        }
        return this.f83424b;
    }

    public void setId(String str) {
        this.f83424b = str;
    }

    public void trackEvent(String str, String str2, String str3, long j) {
        HitBuilders.EventBuilder value = new HitBuilders.EventBuilder().setCategory(str).setAction(str2).setLabel(str3).setValue(j);
        List list = this.f83425c;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f83425c.size()) {
                int i2 = i + 1;
                value.setCustomDimension(i2, (String) this.f83425c.get(i));
                i = i2;
            }
        }
        this.f83423a.send(value.build());
        m19592d("EVENT TRACKER : Category = " + str + ", Event = " + str2);
    }

    public void trackScreen(String str) {
        this.f83423a.setScreenName(str);
        HitBuilders.ScreenViewBuilder screenViewBuilder = new HitBuilders.ScreenViewBuilder();
        List list = this.f83425c;
        if (list != null && !list.isEmpty()) {
            int i = 0;
            while (i < this.f83425c.size()) {
                int i2 = i + 1;
                screenViewBuilder.setCustomDimension(i2, (String) this.f83425c.get(i));
                i = i2;
            }
        }
        this.f83423a.send(screenViewBuilder.build());
        m19592d("SCREEN TRACKER  : " + str);
    }

    public static DtacTracker getInstance(Context context, String str) {
        return getInstance(str).m19591e(context);
    }
}
