package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public abstract class PostMessageServiceConnection implements PostMessageBackend, ServiceConnection {

    /* renamed from: a */
    public final Object f10302a = new Object();

    /* renamed from: b */
    public final ICustomTabsCallback f10303b;

    /* renamed from: c */
    public IPostMessageService f10304c;

    /* renamed from: d */
    public String f10305d;

    /* renamed from: e */
    public boolean f10306e;

    public PostMessageServiceConnection(@NonNull CustomTabsSessionToken customTabsSessionToken) {
        IBinder m63964a = customTabsSessionToken.m63964a();
        if (m63964a != null) {
            this.f10303b = ICustomTabsCallback.Stub.asInterface(m63964a);
            return;
        }
        throw new IllegalArgumentException("Provided session must have binder.");
    }

    /* renamed from: a */
    public final boolean m63961a() {
        if (this.f10304c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m63960b(Bundle bundle) {
        if (this.f10304c == null) {
            return false;
        }
        synchronized (this.f10302a) {
            try {
                try {
                    this.f10304c.onMessageChannelReady(this.f10303b, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public boolean bindSessionToPostMessageService(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent();
        intent.setClassName(str, PostMessageService.class.getName());
        boolean bindService = context.bindService(intent, this, 1);
        if (!bindService) {
            Log.w("PostMessageServConn", "Could not bind to PostMessageService in client.");
        }
        return bindService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void cleanup(@NonNull Context context) {
        if (m63961a()) {
            unbindFromContext(context);
        }
    }

    public final boolean notifyMessageChannelReady(@Nullable Bundle bundle) {
        this.f10306e = true;
        return m63960b(bundle);
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onDisconnectChannel(@NonNull Context context) {
        unbindFromContext(context);
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean onNotifyMessageChannelReady(@Nullable Bundle bundle) {
        return notifyMessageChannelReady(bundle);
    }

    @Override // androidx.browser.customtabs.PostMessageBackend
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean onPostMessage(@NonNull String str, @Nullable Bundle bundle) {
        return postMessage(str, bundle);
    }

    public void onPostMessageServiceConnected() {
        if (this.f10306e) {
            m63960b(null);
        }
    }

    public void onPostMessageServiceDisconnected() {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f10304c = IPostMessageService.Stub.asInterface(iBinder);
        onPostMessageServiceConnected();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f10304c = null;
        onPostMessageServiceDisconnected();
    }

    public final boolean postMessage(@NonNull String str, @Nullable Bundle bundle) {
        if (this.f10304c == null) {
            return false;
        }
        synchronized (this.f10302a) {
            try {
                try {
                    this.f10304c.onPostMessage(this.f10303b, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPackageName(@NonNull String str) {
        this.f10305d = str;
    }

    public void unbindFromContext(@NonNull Context context) {
        if (m63961a()) {
            context.unbindService(this);
            this.f10304c = null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean bindSessionToPostMessageService(@NonNull Context context) {
        String str = this.f10305d;
        if (str != null) {
            return bindSessionToPostMessageService(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }
}