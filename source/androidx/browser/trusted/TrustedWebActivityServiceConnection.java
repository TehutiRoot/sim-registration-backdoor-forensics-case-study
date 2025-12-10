package androidx.browser.trusted;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public final class TrustedWebActivityServiceConnection {

    /* renamed from: a */
    public final ITrustedWebActivityService f10237a;

    /* renamed from: b */
    public final ComponentName f10238b;

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$a */
    /* loaded from: classes.dex */
    public class BinderC2330a extends ITrustedWebActivityCallback.Stub {

        /* renamed from: a */
        public final /* synthetic */ TrustedWebActivityCallback f10239a;

        public BinderC2330a(TrustedWebActivityCallback trustedWebActivityCallback) {
            this.f10239a = trustedWebActivityCallback;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public void onExtraCallback(String str, Bundle bundle) {
            this.f10239a.onExtraCallback(str, bundle);
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$b */
    /* loaded from: classes.dex */
    public static class C2331b {

        /* renamed from: a */
        public final Parcelable[] f10240a;

        public C2331b(Parcelable[] parcelableArr) {
            this.f10240a = parcelableArr;
        }

        /* renamed from: a */
        public static C2331b m63999a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS");
            return new C2331b(bundle.getParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"));
        }

        /* renamed from: b */
        public Bundle m63998b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f10240a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$c */
    /* loaded from: classes.dex */
    public static class C2332c {

        /* renamed from: a */
        public final String f10241a;

        /* renamed from: b */
        public final int f10242b;

        public C2332c(String str, int i) {
            this.f10241a = str;
            this.f10242b = i;
        }

        /* renamed from: a */
        public static C2332c m63997a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new C2332c(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }

        /* renamed from: b */
        public Bundle m63996b() {
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.f10241a);
            bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.f10242b);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$d */
    /* loaded from: classes.dex */
    public static class C2333d {

        /* renamed from: a */
        public final String f10243a;

        public C2333d(String str) {
            this.f10243a = str;
        }

        /* renamed from: a */
        public static C2333d m63995a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C2333d(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        /* renamed from: b */
        public Bundle m63994b() {
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.f10243a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$e */
    /* loaded from: classes.dex */
    public static class C2334e {

        /* renamed from: a */
        public final String f10244a;

        /* renamed from: b */
        public final int f10245b;

        /* renamed from: c */
        public final Notification f10246c;

        /* renamed from: d */
        public final String f10247d;

        public C2334e(String str, int i, Notification notification, String str2) {
            this.f10244a = str;
            this.f10245b = i;
            this.f10246c = notification;
            this.f10247d = str2;
        }

        /* renamed from: a */
        public static C2334e m63993a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C2334e(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        /* renamed from: b */
        public Bundle m63992b() {
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.f10244a);
            bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.f10245b);
            bundle.putParcelable("android.support.customtabs.trusted.NOTIFICATION", this.f10246c);
            bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.f10247d);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$f */
    /* loaded from: classes.dex */
    public static class C2335f {

        /* renamed from: a */
        public final boolean f10248a;

        public C2335f(boolean z) {
            this.f10248a = z;
        }

        /* renamed from: a */
        public static C2335f m63991a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m64001a(bundle, "android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
            return new C2335f(bundle.getBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS"));
        }

        /* renamed from: b */
        public Bundle m63990b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f10248a);
            return bundle;
        }
    }

    public TrustedWebActivityServiceConnection(ITrustedWebActivityService iTrustedWebActivityService, ComponentName componentName) {
        this.f10237a = iTrustedWebActivityService;
        this.f10238b = componentName;
    }

    /* renamed from: a */
    public static void m64001a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }

    /* renamed from: b */
    public static ITrustedWebActivityCallback m64000b(TrustedWebActivityCallback trustedWebActivityCallback) {
        if (trustedWebActivityCallback == null) {
            return null;
        }
        return new BinderC2330a(trustedWebActivityCallback);
    }

    public boolean areNotificationsEnabled(@NonNull String str) throws RemoteException {
        return C2335f.m63991a(this.f10237a.areNotificationsEnabled(new C2333d(str).m63994b())).f10248a;
    }

    public void cancel(@NonNull String str, int i) throws RemoteException {
        this.f10237a.cancelNotification(new C2332c(str, i).m63996b());
    }

    @NonNull
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] getActiveNotifications() throws RemoteException {
        return C2331b.m63999a(this.f10237a.getActiveNotifications()).f10240a;
    }

    @NonNull
    public ComponentName getComponentName() {
        return this.f10238b;
    }

    @Nullable
    public Bitmap getSmallIconBitmap() throws RemoteException {
        return (Bitmap) this.f10237a.getSmallIconBitmap().getParcelable(TrustedWebActivityService.KEY_SMALL_ICON_BITMAP);
    }

    public int getSmallIconId() throws RemoteException {
        return this.f10237a.getSmallIconId();
    }

    public boolean notify(@NonNull String str, int i, @NonNull Notification notification, @NonNull String str2) throws RemoteException {
        return C2335f.m63991a(this.f10237a.notifyNotificationWithChannel(new C2334e(str, i, notification, str2).m63992b())).f10248a;
    }

    @Nullable
    public Bundle sendExtraCommand(@NonNull String str, @NonNull Bundle bundle, @Nullable TrustedWebActivityCallback trustedWebActivityCallback) throws RemoteException {
        IBinder asBinder;
        ITrustedWebActivityCallback m64000b = m64000b(trustedWebActivityCallback);
        if (m64000b == null) {
            asBinder = null;
        } else {
            asBinder = m64000b.asBinder();
        }
        return this.f10237a.extraCommand(str, bundle, asBinder);
    }
}
