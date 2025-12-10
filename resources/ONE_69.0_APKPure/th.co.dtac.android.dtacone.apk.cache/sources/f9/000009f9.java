package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.PermissionChecker;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* renamed from: KW1 */
/* loaded from: classes.dex */
public class KW1 {

    /* renamed from: d */
    public static KW1 f3338d;

    /* renamed from: a */
    public final Context f3339a;

    /* renamed from: b */
    public final LocationManager f3340b;

    /* renamed from: c */
    public final C0735a f3341c = new C0735a();

    /* renamed from: KW1$a */
    /* loaded from: classes.dex */
    public static class C0735a {

        /* renamed from: a */
        public boolean f3342a;

        /* renamed from: b */
        public long f3343b;
    }

    public KW1(Context context, LocationManager locationManager) {
        this.f3339a = context;
        this.f3340b = locationManager;
    }

    /* renamed from: a */
    public static KW1 m67713a(Context context) {
        if (f3338d == null) {
            Context applicationContext = context.getApplicationContext();
            f3338d = new KW1(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
        }
        return f3338d;
    }

    /* renamed from: b */
    public final Location m67712b() {
        Location location;
        Location location2 = null;
        if (PermissionChecker.checkSelfPermission(this.f3339a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m67711c("network");
        } else {
            location = null;
        }
        if (PermissionChecker.checkSelfPermission(this.f3339a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m67711c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        } else if (location2 != null) {
            return location2;
        } else {
            return location;
        }
    }

    /* renamed from: c */
    public final Location m67711c(String str) {
        try {
            if (this.f3340b.isProviderEnabled(str)) {
                return this.f3340b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean m67710d() {
        C0735a c0735a = this.f3341c;
        if (m67709e()) {
            return c0735a.f3342a;
        }
        Location m67712b = m67712b();
        if (m67712b != null) {
            m67708f(m67712b);
            return c0735a.f3342a;
        }
        int i = Calendar.getInstance().get(11);
        if (i >= 6 && i < 22) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m67709e() {
        if (this.f3341c.f3343b > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m67708f(Location location) {
        boolean z;
        long j;
        C0735a c0735a = this.f3341c;
        long currentTimeMillis = System.currentTimeMillis();
        JW1 m67868b = JW1.m67868b();
        m67868b.m67869a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        m67868b.m67869a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (m67868b.f3029c == 1) {
            z = true;
        } else {
            z = false;
        }
        long j2 = m67868b.f3028b;
        long j3 = m67868b.f3027a;
        m67868b.m67869a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = m67868b.f3028b;
        if (j2 != -1 && j3 != -1) {
            if (currentTimeMillis <= j3) {
                if (currentTimeMillis > j2) {
                    j4 = j3;
                } else {
                    j4 = j2;
                }
            }
            j = j4 + 60000;
        } else {
            j = currentTimeMillis + 43200000;
        }
        c0735a.f3342a = z;
        c0735a.f3343b = j;
    }
}