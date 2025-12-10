package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class CustomTabsSessionToken {

    /* renamed from: a */
    public final ICustomTabsCallback f10208a;

    /* renamed from: b */
    public final PendingIntent f10209b;

    /* renamed from: c */
    public final CustomTabsCallback f10210c;

    /* renamed from: androidx.browser.customtabs.CustomTabsSessionToken$a */
    /* loaded from: classes.dex */
    public class C2326a extends CustomTabsCallback {
        public C2326a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.extraCallback(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            try {
                return CustomTabsSessionToken.this.f10208a.extraCallbackWithResult(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onActivityLayout(i, i2, i3, i4, i5, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onActivityResized(int i, int i2, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onActivityResized(i, i2, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onMinimized(Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onMinimized(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onNavigationEvent(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onRelationshipValidationResult(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onUnminimized(Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onUnminimized(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onWarmupCompleted(Bundle bundle) {
            try {
                CustomTabsSessionToken.this.f10208a.onWarmupCompleted(bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsSessionToken$b */
    /* loaded from: classes.dex */
    public static class BinderC2327b extends ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i, int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(Bundle bundle) {
        }
    }

    public CustomTabsSessionToken(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        C2326a c2326a;
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f10208a = iCustomTabsCallback;
        this.f10209b = pendingIntent;
        if (iCustomTabsCallback == null) {
            c2326a = null;
        } else {
            c2326a = new C2326a();
        }
        this.f10210c = c2326a;
    }

    @NonNull
    public static CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new CustomTabsSessionToken(new BinderC2327b(), null);
    }

    @Nullable
    public static CustomTabsSessionToken getSessionTokenFromIntent(@NonNull Intent intent) {
        Bundle extras = intent.getExtras();
        ICustomTabsCallback iCustomTabsCallback = null;
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder(CustomTabsIntent.EXTRA_SESSION);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(CustomTabsIntent.EXTRA_SESSION_ID);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        if (binder != null) {
            iCustomTabsCallback = ICustomTabsCallback.Stub.asInterface(binder);
        }
        return new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
    }

    /* renamed from: a */
    public IBinder m64013a() {
        ICustomTabsCallback iCustomTabsCallback = this.f10208a;
        if (iCustomTabsCallback == null) {
            return null;
        }
        return iCustomTabsCallback.asBinder();
    }

    /* renamed from: b */
    public final IBinder m64012b() {
        ICustomTabsCallback iCustomTabsCallback = this.f10208a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    /* renamed from: c */
    public PendingIntent m64011c() {
        return this.f10209b;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof CustomTabsSessionToken)) {
            return false;
        }
        CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
        PendingIntent m64011c = customTabsSessionToken.m64011c();
        PendingIntent pendingIntent = this.f10209b;
        boolean z2 = true;
        if (pendingIntent == null) {
            z = true;
        } else {
            z = false;
        }
        if (m64011c != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(m64011c);
        }
        return m64012b().equals(customTabsSessionToken.m64012b());
    }

    @Nullable
    public CustomTabsCallback getCallback() {
        return this.f10210c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasCallback() {
        if (this.f10208a != null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasId() {
        if (this.f10209b != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f10209b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return m64012b().hashCode();
    }

    public boolean isAssociatedWith(@NonNull CustomTabsSession customTabsSession) {
        return customTabsSession.m64030f().equals(this.f10208a);
    }
}
