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
    public final ITrustedWebActivityService f10325a;

    /* renamed from: b */
    public final ComponentName f10326b;

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$a */
    /* loaded from: classes.dex */
    public class BinderC2312a extends ITrustedWebActivityCallback.Stub {

        /* renamed from: a */
        public final /* synthetic */ TrustedWebActivityCallback f10327a;

        public BinderC2312a(TrustedWebActivityCallback trustedWebActivityCallback) {
            this.f10327a = trustedWebActivityCallback;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityCallback
        public void onExtraCallback(String str, Bundle bundle) {
            this.f10327a.onExtraCallback(str, bundle);
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$b */
    /* loaded from: classes.dex */
    public static class C2313b {

        /* renamed from: a */
        public final Parcelable[] f10328a;

        public C2313b(Parcelable[] parcelableArr) {
            this.f10328a = parcelableArr;
        }

        /* renamed from: a */
        public static C2313b m63950a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS");
            return new C2313b(bundle.getParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"));
        }

        /* renamed from: b */
        public Bundle m63949b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f10328a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$c */
    /* loaded from: classes.dex */
    public static class C2314c {

        /* renamed from: a */
        public final String f10329a;

        /* renamed from: b */
        public final int f10330b;

        public C2314c(String str, int i) {
            this.f10329a = str;
            this.f10330b = i;
        }

        /* renamed from: a */
        public static C2314c m63948a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new C2314c(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }

        /* renamed from: b */
        public Bundle m63947b() {
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.f10329a);
            bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.f10330b);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$d */
    /* loaded from: classes.dex */
    public static class C2315d {

        /* renamed from: a */
        public final String f10331a;

        public C2315d(String str) {
            this.f10331a = str;
        }

        /* renamed from: a */
        public static C2315d m63946a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C2315d(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        /* renamed from: b */
        public Bundle m63945b() {
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.f10331a);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$e */
    /* loaded from: classes.dex */
    public static class C2316e {

        /* renamed from: a */
        public final String f10332a;

        /* renamed from: b */
        public final int f10333b;

        /* renamed from: c */
        public final Notification f10334c;

        /* renamed from: d */
        public final String f10335d;

        public C2316e(String str, int i, Notification notification, String str2) {
            this.f10332a = str;
            this.f10333b = i;
            this.f10334c = notification;
            this.f10335d = str2;
        }

        /* renamed from: a */
        public static C2316e m63944a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new C2316e(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }

        /* renamed from: b */
        public Bundle m63943b() {
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.f10332a);
            bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.f10333b);
            bundle.putParcelable("android.support.customtabs.trusted.NOTIFICATION", this.f10334c);
            bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.f10335d);
            return bundle;
        }
    }

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnection$f */
    /* loaded from: classes.dex */
    public static class C2317f {

        /* renamed from: a */
        public final boolean f10336a;

        public C2317f(boolean z) {
            this.f10336a = z;
        }

        /* renamed from: a */
        public static C2317f m63942a(Bundle bundle) {
            TrustedWebActivityServiceConnection.m63952a(bundle, "android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
            return new C2317f(bundle.getBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS"));
        }

        /* renamed from: b */
        public Bundle m63941b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f10336a);
            return bundle;
        }
    }

    public TrustedWebActivityServiceConnection(ITrustedWebActivityService iTrustedWebActivityService, ComponentName componentName) {
        this.f10325a = iTrustedWebActivityService;
        this.f10326b = componentName;
    }

    /* renamed from: a */
    public static void m63952a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }

    /* renamed from: b */
    public static ITrustedWebActivityCallback m63951b(TrustedWebActivityCallback trustedWebActivityCallback) {
        if (trustedWebActivityCallback == null) {
            return null;
        }
        return new BinderC2312a(trustedWebActivityCallback);
    }

    public boolean areNotificationsEnabled(@NonNull String str) throws RemoteException {
        return C2317f.m63942a(this.f10325a.areNotificationsEnabled(new C2315d(str).m63945b())).f10336a;
    }

    public void cancel(@NonNull String str, int i) throws RemoteException {
        this.f10325a.cancelNotification(new C2314c(str, i).m63947b());
    }

    @NonNull
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable[] getActiveNotifications() throws RemoteException {
        return C2313b.m63950a(this.f10325a.getActiveNotifications()).f10328a;
    }

    @NonNull
    public ComponentName getComponentName() {
        return this.f10326b;
    }

    @Nullable
    public Bitmap getSmallIconBitmap() throws RemoteException {
        return (Bitmap) this.f10325a.getSmallIconBitmap().getParcelable(TrustedWebActivityService.KEY_SMALL_ICON_BITMAP);
    }

    public int getSmallIconId() throws RemoteException {
        return this.f10325a.getSmallIconId();
    }

    public boolean notify(@NonNull String str, int i, @NonNull Notification notification, @NonNull String str2) throws RemoteException {
        return C2317f.m63942a(this.f10325a.notifyNotificationWithChannel(new C2316e(str, i, notification, str2).m63943b())).f10336a;
    }

    @Nullable
    public Bundle sendExtraCommand(@NonNull String str, @NonNull Bundle bundle, @Nullable TrustedWebActivityCallback trustedWebActivityCallback) throws RemoteException {
        IBinder asBinder;
        ITrustedWebActivityCallback m63951b = m63951b(trustedWebActivityCallback);
        if (m63951b == null) {
            asBinder = null;
        } else {
            asBinder = m63951b.asBinder();
        }
        return this.f10325a.extraCommand(str, bundle, asBinder);
    }
}