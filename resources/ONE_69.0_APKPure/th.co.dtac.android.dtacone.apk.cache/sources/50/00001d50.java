package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.browser.trusted.TrustedWebActivityServiceConnection;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;
import org.apache.http.message.TokenParser;

/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {
    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String ACTION_TRUSTED_WEB_ACTIVITY_SERVICE = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String KEY_SMALL_ICON_BITMAP = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String KEY_SUCCESS = "androidx.browser.trusted.SUCCESS";
    public static final String META_DATA_NAME_SMALL_ICON = "android.support.customtabs.trusted.SMALL_ICON";
    public static final int SMALL_ICON_NOT_SET = -1;

    /* renamed from: a */
    public NotificationManager f10321a;

    /* renamed from: b */
    public int f10322b = -1;

    /* renamed from: c */
    public final ITrustedWebActivityService.Stub f10323c = new BinderC2311a();

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    /* loaded from: classes.dex */
    public class BinderC2311a extends ITrustedWebActivityService.Stub {
        public BinderC2311a() {
        }

        /* renamed from: a */
        public final void m63953a() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f10322b == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                int i = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                Token load = TrustedWebActivityService.this.getTokenStore().load();
                PackageManager packageManager = TrustedWebActivityService.this.getPackageManager();
                if (load != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (load.matches(packagesForUid[i], packageManager)) {
                            TrustedWebActivityService.this.f10322b = Binder.getCallingUid();
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (TrustedWebActivityService.this.f10322b == Binder.getCallingUid()) {
                return;
            }
            throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle areNotificationsEnabled(Bundle bundle) {
            m63953a();
            return new TrustedWebActivityServiceConnection.C2317f(TrustedWebActivityService.this.onAreNotificationsEnabled(TrustedWebActivityServiceConnection.C2315d.m63946a(bundle).f10331a)).m63941b();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(Bundle bundle) {
            m63953a();
            TrustedWebActivityServiceConnection.C2314c m63948a = TrustedWebActivityServiceConnection.C2314c.m63948a(bundle);
            TrustedWebActivityService.this.onCancelNotification(m63948a.f10329a, m63948a.f10330b);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
            m63953a();
            return TrustedWebActivityService.this.onExtraCommand(str, bundle, TrustedWebActivityCallbackRemote.m63958a(iBinder));
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getActiveNotifications() {
            m63953a();
            return new TrustedWebActivityServiceConnection.C2313b(TrustedWebActivityService.this.onGetActiveNotifications()).m63949b();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getSmallIconBitmap() {
            m63953a();
            return TrustedWebActivityService.this.onGetSmallIconBitmap();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() {
            m63953a();
            return TrustedWebActivityService.this.onGetSmallIconId();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle notifyNotificationWithChannel(Bundle bundle) {
            m63953a();
            TrustedWebActivityServiceConnection.C2316e m63944a = TrustedWebActivityServiceConnection.C2316e.m63944a(bundle);
            return new TrustedWebActivityServiceConnection.C2317f(TrustedWebActivityService.this.onNotifyNotificationWithChannel(m63944a.f10332a, m63944a.f10333b, m63944a.f10334c, m63944a.f10335d)).m63941b();
        }
    }

    /* renamed from: a */
    public static String m63955a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(TokenParser.f74644SP, '_') + "_channel_id";
    }

    /* renamed from: b */
    public final void m63954b() {
        if (this.f10321a != null) {
            return;
        }
        throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
    }

    @NonNull
    @BinderThread
    public abstract TokenStore getTokenStore();

    @BinderThread
    public boolean onAreNotificationsEnabled(@NonNull String str) {
        m63954b();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return AbstractC19029aJ0.m65157b(this.f10321a, m63955a(str));
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public final IBinder onBind(@Nullable Intent intent) {
        return this.f10323c;
    }

    @BinderThread
    public void onCancelNotification(@NonNull String str, int i) {
        m63954b();
        this.f10321a.cancel(str, i);
    }

    @Override // android.app.Service
    @CallSuper
    @MainThread
    public void onCreate() {
        super.onCreate();
        this.f10321a = (NotificationManager) getSystemService("notification");
    }

    @Nullable
    @BinderThread
    public Bundle onExtraCommand(@NonNull String str, @NonNull Bundle bundle, @Nullable TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote) {
        return null;
    }

    @NonNull
    @BinderThread
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] onGetActiveNotifications() {
        m63954b();
        if (Build.VERSION.SDK_INT >= 23) {
            return NotificationApiHelperForM.m63959a(this.f10321a);
        }
        throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
    }

    @NonNull
    @BinderThread
    public Bundle onGetSmallIconBitmap() {
        int onGetSmallIconId = onGetSmallIconId();
        Bundle bundle = new Bundle();
        if (onGetSmallIconId == -1) {
            return bundle;
        }
        bundle.putParcelable(KEY_SMALL_ICON_BITMAP, BitmapFactory.decodeResource(getResources(), onGetSmallIconId));
        return bundle;
    }

    @BinderThread
    public int onGetSmallIconId() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(META_DATA_NAME_SMALL_ICON, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @BinderThread
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public boolean onNotifyNotificationWithChannel(@NonNull String str, int i, @NonNull Notification notification, @NonNull String str2) {
        m63954b();
        if (!NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String m63955a = m63955a(str2);
            notification = AbstractC19029aJ0.m65158a(this, this.f10321a, notification, m63955a, str2);
            if (!AbstractC19029aJ0.m65157b(this.f10321a, m63955a)) {
                return false;
            }
        }
        this.f10321a.notify(str, i, notification);
        return true;
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@Nullable Intent intent) {
        this.f10322b = -1;
        return super.onUnbind(intent);
    }
}