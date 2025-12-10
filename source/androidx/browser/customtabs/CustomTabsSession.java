package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CustomTabsSession {

    /* renamed from: a */
    public final Object f10194a = new Object();

    /* renamed from: b */
    public final ICustomTabsService f10195b;

    /* renamed from: c */
    public final ICustomTabsCallback f10196c;

    /* renamed from: d */
    public final ComponentName f10197d;

    /* renamed from: e */
    public final PendingIntent f10198e;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class PendingSession {

        /* renamed from: a */
        public final CustomTabsCallback f10199a;

        /* renamed from: b */
        public final PendingIntent f10200b;

        public PendingSession(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
            this.f10199a = customTabsCallback;
            this.f10200b = pendingIntent;
        }

        /* renamed from: a */
        public CustomTabsCallback m64027a() {
            return this.f10199a;
        }

        /* renamed from: b */
        public PendingIntent m64026b() {
            return this.f10200b;
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$a */
    /* loaded from: classes.dex */
    public class BinderC2323a extends IEngagementSignalsCallback.Stub {

        /* renamed from: a */
        public final Handler f10201a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public final /* synthetic */ EngagementSignalsCallback f10202b;

        public BinderC2323a(EngagementSignalsCallback engagementSignalsCallback) {
            CustomTabsSession.this = r1;
            this.f10202b = engagementSignalsCallback;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            Handler handler = this.f10201a;
            final EngagementSignalsCallback engagementSignalsCallback = this.f10202b;
            handler.post(new Runnable() { // from class: JA
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            Handler handler = this.f10201a;
            final EngagementSignalsCallback engagementSignalsCallback = this.f10202b;
            handler.post(new Runnable() { // from class: IA
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onSessionEnded(z, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            Handler handler = this.f10201a;
            final EngagementSignalsCallback engagementSignalsCallback = this.f10202b;
            handler.post(new Runnable() { // from class: KA
                @Override // java.lang.Runnable
                public final void run() {
                    engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                }
            });
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$b */
    /* loaded from: classes.dex */
    public class BinderC2324b extends IEngagementSignalsCallback.Stub {

        /* renamed from: a */
        public final Executor f10204a;

        /* renamed from: b */
        public final /* synthetic */ Executor f10205b;

        /* renamed from: c */
        public final /* synthetic */ EngagementSignalsCallback f10206c;

        public BinderC2324b(Executor executor, EngagementSignalsCallback engagementSignalsCallback) {
            CustomTabsSession.this = r1;
            this.f10205b = executor;
            this.f10206c = engagementSignalsCallback;
            this.f10204a = executor;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f10204a;
                final EngagementSignalsCallback engagementSignalsCallback = this.f10206c;
                executor.execute(new Runnable() { // from class: MA
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onGreatestScrollPercentageIncreased(i, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f10204a;
                final EngagementSignalsCallback engagementSignalsCallback = this.f10206c;
                executor.execute(new Runnable() { // from class: NA
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onSessionEnded(z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Executor executor = this.f10204a;
                final EngagementSignalsCallback engagementSignalsCallback = this.f10206c;
                executor.execute(new Runnable() { // from class: LA
                    @Override // java.lang.Runnable
                    public final void run() {
                        engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                    }
                });
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSession$c */
    /* loaded from: classes.dex */
    public static class BinderC2325c extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j) {
            return false;
        }
    }

    public CustomTabsSession(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f10195b = iCustomTabsService;
        this.f10196c = iCustomTabsCallback;
        this.f10197d = componentName;
        this.f10198e = pendingIntent;
    }

    @NonNull
    @VisibleForTesting
    public static CustomTabsSession createMockSessionForTesting(@NonNull ComponentName componentName) {
        return new CustomTabsSession(new BinderC2325c(), new CustomTabsSessionToken.BinderC2327b(), componentName, null);
    }

    /* renamed from: a */
    public final void m64035a(Bundle bundle) {
        PendingIntent pendingIntent = this.f10198e;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    /* renamed from: b */
    public final Bundle m64034b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m64035a(bundle2);
        return bundle2;
    }

    /* renamed from: c */
    public final IEngagementSignalsCallback.Stub m64033c(EngagementSignalsCallback engagementSignalsCallback) {
        return new BinderC2323a(engagementSignalsCallback);
    }

    /* renamed from: d */
    public final IEngagementSignalsCallback.Stub m64032d(EngagementSignalsCallback engagementSignalsCallback, Executor executor) {
        return new BinderC2324b(executor, engagementSignalsCallback);
    }

    /* renamed from: e */
    public final Bundle m64031e(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f10198e != null) {
            m64035a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* renamed from: f */
    public IBinder m64030f() {
        return this.f10196c.asBinder();
    }

    /* renamed from: g */
    public ComponentName m64029g() {
        return this.f10197d;
    }

    /* renamed from: h */
    public PendingIntent m64028h() {
        return this.f10198e;
    }

    public boolean isEngagementSignalsApiAvailable(@NonNull Bundle bundle) throws RemoteException {
        try {
            return this.f10195b.isEngagementSignalsApiAvailable(this.f10196c, m64034b(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean mayLaunchUrl(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.f10195b.mayLaunchUrl(this.f10196c, uri, m64034b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(@NonNull String str, @Nullable Bundle bundle) {
        int postMessage;
        Bundle m64034b = m64034b(bundle);
        synchronized (this.f10194a) {
            try {
                try {
                    postMessage = this.f10195b.postMessage(this.f10196c, str, m64034b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return postMessage;
    }

    public boolean receiveFile(@NonNull Uri uri, int i, @Nullable Bundle bundle) {
        try {
            return this.f10195b.receiveFile(this.f10196c, uri, i, m64034b(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri) {
        return requestPostMessageChannel(uri, null, new Bundle());
    }

    public boolean setActionButton(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        m64035a(bundle);
        try {
            return this.f10195b.updateVisuals(this.f10196c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(@NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.f10195b.setEngagementSignalsCallback(this.f10196c, m64033c(engagementSignalsCallback).asBinder(), m64034b(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean setSecondaryToolbarSwipeUpGesture(@Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
        m64035a(bundle);
        try {
            return this.f10195b.updateVisuals(this.f10196c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@Nullable RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        m64035a(bundle);
        try {
            return this.f10195b.updateVisuals(this.f10196c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        m64035a(bundle2);
        try {
            return this.f10195b.updateVisuals(this.f10196c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i, @NonNull Uri uri, @Nullable Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.f10195b.validateRelationship(this.f10196c, i, uri, m64034b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri, @Nullable Uri uri2, @NonNull Bundle bundle) {
        try {
            Bundle m64031e = m64031e(uri2);
            if (m64031e != null) {
                bundle.putAll(m64031e);
                return this.f10195b.requestPostMessageChannelWithExtras(this.f10196c, uri, bundle);
            }
            return this.f10195b.requestPostMessageChannel(this.f10196c, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setEngagementSignalsCallback(@NonNull Executor executor, @NonNull EngagementSignalsCallback engagementSignalsCallback, @NonNull Bundle bundle) throws RemoteException {
        try {
            return this.f10195b.setEngagementSignalsCallback(this.f10196c, m64032d(engagementSignalsCallback, executor).asBinder(), m64034b(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }
}
