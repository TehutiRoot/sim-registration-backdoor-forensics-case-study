package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.BuildConfig;

/* renamed from: Yo1 */
/* loaded from: classes4.dex */
public abstract class AbstractC18838Yo1 {
    /* renamed from: a */
    public static /* synthetic */ void m65301a(Context context, boolean z, Void r2) {
        m65294h(context, z);
    }

    /* renamed from: b */
    public static SharedPreferences m65300b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
    }

    /* renamed from: c */
    public static boolean m65299c(Context context) {
        return m65300b(context).getBoolean("proxy_notification_initialized", false);
    }

    /* renamed from: d */
    public static boolean m65298d(SharedPreferences sharedPreferences, boolean z) {
        if (!sharedPreferences.contains("proxy_retention") || sharedPreferences.getBoolean("proxy_retention", false) != z) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static void m65296f(Context context, boolean z) {
        SharedPreferences.Editor edit = m65300b(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }

    /* renamed from: g */
    public static void m65295g(final Context context, C22733w60 c22733w60, final boolean z) {
        if (PlatformVersion.isAtLeastQ() && !m65298d(m65300b(context), z)) {
            c22733w60.m909l(z).addOnSuccessListener(new ExecutorC21992ro1(), new OnSuccessListener() { // from class: Xo1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    AbstractC18838Yo1.m65301a(context, z, (Void) obj);
                }
            });
        }
    }

    /* renamed from: h */
    public static void m65294h(Context context, boolean z) {
        SharedPreferences.Editor edit = m65300b(context).edit();
        edit.putBoolean("proxy_retention", z);
        edit.apply();
    }
}
