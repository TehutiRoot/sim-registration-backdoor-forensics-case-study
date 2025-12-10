package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.Constants;
import java.util.List;

/* renamed from: rs0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C22003rs0 {

    /* renamed from: a */
    public final Context f77440a;

    /* renamed from: b */
    public String f77441b;

    /* renamed from: c */
    public String f77442c;

    /* renamed from: d */
    public int f77443d;

    /* renamed from: e */
    public int f77444e = 0;

    public C22003rs0(Context context) {
        this.f77440a = context;
    }

    /* renamed from: c */
    public static String m23250c(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            return applicationId;
        }
        String[] split = applicationId.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized String m23252a() {
        try {
            if (this.f77441b == null) {
                m23245h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77441b;
    }

    /* renamed from: b */
    public synchronized String m23251b() {
        try {
            if (this.f77442c == null) {
                m23245h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77442c;
    }

    /* renamed from: d */
    public synchronized int m23249d() {
        PackageInfo m23247f;
        try {
            if (this.f77443d == 0 && (m23247f = m23247f("com.google.android.gms")) != null) {
                this.f77443d = m23247f.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f77443d;
    }

    /* renamed from: e */
    public synchronized int m23248e() {
        int i = this.f77444e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f77440a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f77444e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f77444e = 2;
            return 2;
        }
        Log.w(Constants.TAG, "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f77444e = 2;
        } else {
            this.f77444e = 1;
        }
        return this.f77444e;
    }

    /* renamed from: f */
    public final PackageInfo m23247f(String str) {
        try {
            return this.f77440a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(Constants.TAG, "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: g */
    public boolean m23246g() {
        if (m23248e() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final synchronized void m23245h() {
        PackageInfo m23247f = m23247f(this.f77440a.getPackageName());
        if (m23247f != null) {
            this.f77441b = Integer.toString(m23247f.versionCode);
            this.f77442c = m23247f.versionName;
        }
    }
}
