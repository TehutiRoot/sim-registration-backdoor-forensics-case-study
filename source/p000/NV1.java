package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.PermissionChecker;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* renamed from: NV1 */
/* loaded from: classes.dex */
public class NV1 {

    /* renamed from: d */
    public static NV1 f4122d;

    /* renamed from: a */
    public final Context f4123a;

    /* renamed from: b */
    public final LocationManager f4124b;

    /* renamed from: c */
    public final C0949a f4125c = new C0949a();

    /* renamed from: NV1$a */
    /* loaded from: classes.dex */
    public static class C0949a {

        /* renamed from: a */
        public boolean f4126a;

        /* renamed from: b */
        public long f4127b;
    }

    public NV1(Context context, LocationManager locationManager) {
        this.f4123a = context;
        this.f4124b = locationManager;
    }

    /* renamed from: a */
    public static NV1 m67216a(Context context) {
        if (f4122d == null) {
            Context applicationContext = context.getApplicationContext();
            f4122d = new NV1(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
        }
        return f4122d;
    }

    /* renamed from: b */
    public final Location m67215b() {
        Location location;
        Location location2 = null;
        if (PermissionChecker.checkSelfPermission(this.f4123a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m67214c("network");
        } else {
            location = null;
        }
        if (PermissionChecker.checkSelfPermission(this.f4123a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m67214c("gps");
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
    public final Location m67214c(String str) {
        try {
            if (this.f4124b.isProviderEnabled(str)) {
                return this.f4124b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean m67213d() {
        C0949a c0949a = this.f4125c;
        if (m67212e()) {
            return c0949a.f4126a;
        }
        Location m67215b = m67215b();
        if (m67215b != null) {
            m67211f(m67215b);
            return c0949a.f4126a;
        }
        int i = Calendar.getInstance().get(11);
        if (i >= 6 && i < 22) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m67212e() {
        if (this.f4125c.f4127b > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m67211f(Location location) {
        boolean z;
        long j;
        C0949a c0949a = this.f4125c;
        long currentTimeMillis = System.currentTimeMillis();
        MV1 m67375b = MV1.m67375b();
        m67375b.m67376a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        m67375b.m67376a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (m67375b.f3796c == 1) {
            z = true;
        } else {
            z = false;
        }
        long j2 = m67375b.f3795b;
        long j3 = m67375b.f3794a;
        m67375b.m67376a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = m67375b.f3795b;
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
        c0949a.f4126a = z;
        c0949a.f4127b = j;
    }
}
