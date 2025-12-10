package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import io.reactivex.annotations.SchedulerSupport;

/* renamed from: dR1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19574dR1 {

    /* renamed from: h */
    public static C19574dR1 f61236h;

    /* renamed from: i */
    public static final Object f61237i = new Object();

    /* renamed from: a */
    public final Context f61238a;

    /* renamed from: b */
    public final Boolean f61239b;

    /* renamed from: c */
    public final Boolean f61240c;

    /* renamed from: d */
    public final DisplayMetrics f61241d;

    /* renamed from: e */
    public final String f61242e;

    /* renamed from: f */
    public final Integer f61243f;

    /* renamed from: g */
    public final String f61244g;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:2|3)|(2:4|5)|6|(2:8|(1:10)(1:35))(1:36)|11|12|13|(5:19|20|22|23|24)(1:15)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        r11 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C19574dR1(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it."
            java.lang.String r3 = "MixpanelAPI.SysInfo"
            r10.<init>()
            r10.f61238a = r11
            android.content.pm.PackageManager r4 = r11.getPackageManager()
            r5 = 0
            java.lang.String r6 = r11.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            java.lang.String r7 = r6.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L21
            int r6 = r6.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            goto L28
        L21:
            r7 = r5
        L22:
            java.lang.String r6 = "System information constructed with a context that apparently doesn't exist."
            com.mixpanel.android.util.MPLog.m33443w(r3, r6)
            r6 = r5
        L28:
            android.content.pm.ApplicationInfo r8 = r11.getApplicationInfo()
            int r9 = r8.labelRes
            r10.f61242e = r7
            r10.f61243f = r6
            if (r9 != 0) goto L40
            java.lang.CharSequence r11 = r8.nonLocalizedLabel
            if (r11 != 0) goto L3b
            java.lang.String r11 = "Misc"
            goto L44
        L3b:
            java.lang.String r11 = r11.toString()
            goto L44
        L40:
            java.lang.String r11 = r11.getString(r9)
        L44:
            r10.f61244g = r11
            java.lang.Class r11 = r4.getClass()
            java.lang.String r6 = "hasSystemFeature"
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L57
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r1] = r8     // Catch: java.lang.NoSuchMethodException -> L57
            java.lang.reflect.Method r11 = r11.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L57
            goto L59
        L57:
            r11 = r5
        L59:
            if (r11 == 0) goto L82
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.IllegalAccessException -> L75 java.lang.reflect.InvocationTargetException -> L77
            java.lang.String r7 = "android.hardware.nfc"
            r6[r1] = r7     // Catch: java.lang.IllegalAccessException -> L75 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r6 = r11.invoke(r4, r6)     // Catch: java.lang.IllegalAccessException -> L75 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.IllegalAccessException -> L75 java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L7e
            java.lang.String r7 = "android.hardware.telephony"
            r0[r1] = r7     // Catch: java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L7e
            java.lang.Object r11 = r11.invoke(r4, r0)     // Catch: java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L7e
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.IllegalAccessException -> L79 java.lang.reflect.InvocationTargetException -> L7e
        L73:
            r5 = r6
            goto L83
        L75:
            r6 = r5
            goto L79
        L77:
            r6 = r5
            goto L7e
        L79:
            com.mixpanel.android.util.MPLog.m33443w(r3, r2)
        L7c:
            r11 = r5
            goto L73
        L7e:
            com.mixpanel.android.util.MPLog.m33443w(r3, r2)
            goto L7c
        L82:
            r11 = r5
        L83:
            r10.f61239b = r5
            r10.f61240c = r11
            android.util.DisplayMetrics r11 = new android.util.DisplayMetrics
            r11.<init>()
            r10.f61241d = r11
            android.content.Context r0 = r10.f61238a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C19574dR1.<init>(android.content.Context):void");
    }

    /* renamed from: g */
    public static C19574dR1 m31836g(Context context) {
        synchronized (f61237i) {
            try {
                if (f61236h == null) {
                    f61236h = new C19574dR1(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f61236h;
    }

    /* renamed from: a */
    public String m31842a() {
        return this.f61244g;
    }

    /* renamed from: b */
    public Integer m31841b() {
        return this.f61243f;
    }

    /* renamed from: c */
    public String m31840c() {
        return this.f61242e;
    }

    /* renamed from: d */
    public String m31839d() {
        if (this.f61238a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            return "ble";
        }
        if (this.f61238a.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
            return "classic";
        }
        return SchedulerSupport.NONE;
    }

    /* renamed from: e */
    public String m31838e() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f61238a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    /* renamed from: f */
    public DisplayMetrics m31837f() {
        return this.f61241d;
    }

    /* renamed from: h */
    public boolean m31835h() {
        return this.f61239b.booleanValue();
    }

    /* renamed from: i */
    public boolean m31834i() {
        return this.f61240c.booleanValue();
    }

    /* renamed from: j */
    public Boolean m31833j() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.f61238a.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.f61238a.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (NoClassDefFoundError | SecurityException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r0.isConnected() != false) goto L9;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean m31832k() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f61238a
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L2e
            android.content.Context r0 = r3.f61238a
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L28
            int r1 = r0.getType()
            r2 = 1
            if (r1 != r2) goto L28
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L28
            goto L29
        L28:
            r2 = 0
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C19574dR1.m31832k():java.lang.Boolean");
    }
}