package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CustomTabsClient {

    /* renamed from: a */
    public final ICustomTabsService f10139a;

    /* renamed from: b */
    public final ComponentName f10140b;

    /* renamed from: c */
    public final Context f10141c;

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$a */
    /* loaded from: classes.dex */
    public class C2305a extends CustomTabsServiceConnection {

        /* renamed from: b */
        public final /* synthetic */ Context f10142b;

        public C2305a(Context context) {
            this.f10142b = context;
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            customTabsClient.warmup(0L);
            this.f10142b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$b */
    /* loaded from: classes.dex */
    public class BinderC2306b extends ICustomTabsCallback.Stub {

        /* renamed from: a */
        public Handler f10143a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public final /* synthetic */ CustomTabsCallback f10144b;

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$a */
        /* loaded from: classes.dex */
        public class RunnableC2307a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f10146a;

            public RunnableC2307a(Bundle bundle) {
                this.f10146a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onUnminimized(this.f10146a);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$b */
        /* loaded from: classes.dex */
        public class RunnableC2308b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10148a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f10149b;

            public RunnableC2308b(int i, Bundle bundle) {
                this.f10148a = i;
                this.f10149b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onNavigationEvent(this.f10148a, this.f10149b);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$c */
        /* loaded from: classes.dex */
        public class RunnableC2309c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f10151a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f10152b;

            public RunnableC2309c(String str, Bundle bundle) {
                this.f10151a = str;
                this.f10152b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.extraCallback(this.f10151a, this.f10152b);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$d */
        /* loaded from: classes.dex */
        public class RunnableC2310d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f10154a;

            public RunnableC2310d(Bundle bundle) {
                this.f10154a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onMessageChannelReady(this.f10154a);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$e */
        /* loaded from: classes.dex */
        public class RunnableC2311e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f10156a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f10157b;

            public RunnableC2311e(String str, Bundle bundle) {
                this.f10156a = str;
                this.f10157b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onPostMessage(this.f10156a, this.f10157b);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$f */
        /* loaded from: classes.dex */
        public class RunnableC2312f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10159a;

            /* renamed from: b */
            public final /* synthetic */ Uri f10160b;

            /* renamed from: c */
            public final /* synthetic */ boolean f10161c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f10162d;

            public RunnableC2312f(int i, Uri uri, boolean z, Bundle bundle) {
                this.f10159a = i;
                this.f10160b = uri;
                this.f10161c = z;
                this.f10162d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onRelationshipValidationResult(this.f10159a, this.f10160b, this.f10161c, this.f10162d);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$g */
        /* loaded from: classes.dex */
        public class RunnableC2313g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10164a;

            /* renamed from: b */
            public final /* synthetic */ int f10165b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f10166c;

            public RunnableC2313g(int i, int i2, Bundle bundle) {
                this.f10164a = i;
                this.f10165b = i2;
                this.f10166c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onActivityResized(this.f10164a, this.f10165b, this.f10166c);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$h */
        /* loaded from: classes.dex */
        public class RunnableC2314h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f10168a;

            public RunnableC2314h(Bundle bundle) {
                this.f10168a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onWarmupCompleted(this.f10168a);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$i */
        /* loaded from: classes.dex */
        public class RunnableC2315i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10170a;

            /* renamed from: b */
            public final /* synthetic */ int f10171b;

            /* renamed from: c */
            public final /* synthetic */ int f10172c;

            /* renamed from: d */
            public final /* synthetic */ int f10173d;

            /* renamed from: e */
            public final /* synthetic */ int f10174e;

            /* renamed from: f */
            public final /* synthetic */ Bundle f10175f;

            public RunnableC2315i(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                this.f10170a = i;
                this.f10171b = i2;
                this.f10172c = i3;
                this.f10173d = i4;
                this.f10174e = i5;
                this.f10175f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onActivityLayout(this.f10170a, this.f10171b, this.f10172c, this.f10173d, this.f10174e, this.f10175f);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$j */
        /* loaded from: classes.dex */
        public class RunnableC2316j implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f10177a;

            public RunnableC2316j(Bundle bundle) {
                this.f10177a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2306b.this.f10144b.onMinimized(this.f10177a);
            }
        }

        public BinderC2306b(CustomTabsCallback customTabsCallback) {
            this.f10144b = customTabsCallback;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2309c(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            CustomTabsCallback customTabsCallback = this.f10144b;
            if (customTabsCallback == null) {
                return null;
            }
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2315i(i, i2, i3, i4, i5, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i, int i2, Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2313g(i, i2, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2310d(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2316j(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2308b(i, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2311e(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2312f(i, uri, z, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2307a(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(Bundle bundle) {
            if (this.f10144b == null) {
                return;
            }
            this.f10143a.post(new RunnableC2314h(bundle));
        }
    }

    public CustomTabsClient(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f10139a = iCustomTabsService;
        this.f10140b = componentName;
        this.f10141c = context;
    }

    /* renamed from: b */
    public static PendingIntent m64053b(Context context, int i) {
        return PendingIntent.getActivity(context, i, new Intent(), 67108864);
    }

    public static boolean bindCustomTabsService(@NonNull Context context, @Nullable String str, @NonNull CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.m64036a(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(@NonNull Context context, @Nullable String str, @NonNull CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.m64036a(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 1);
    }

    public static boolean connectAndInitialize(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new C2305a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Nullable
    public static String getPackageName(@NonNull Context context, @Nullable List<String> list) {
        return getPackageName(context, list, false);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static CustomTabsSession.PendingSession newPendingSession(@NonNull Context context, @Nullable CustomTabsCallback customTabsCallback, int i) {
        return new CustomTabsSession.PendingSession(customTabsCallback, m64053b(context, i));
    }

    /* renamed from: a */
    public final ICustomTabsCallback.Stub m64054a(CustomTabsCallback customTabsCallback) {
        return new BinderC2306b(customTabsCallback);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public CustomTabsSession attachSession(@NonNull CustomTabsSession.PendingSession pendingSession) {
        return m64052c(pendingSession.m64027a(), pendingSession.m64026b());
    }

    /* renamed from: c */
    public final CustomTabsSession m64052c(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
        boolean newSession;
        ICustomTabsCallback.Stub m64054a = m64054a(customTabsCallback);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                newSession = this.f10139a.newSessionWithExtras(m64054a, bundle);
            } else {
                newSession = this.f10139a.newSession(m64054a);
            }
            if (!newSession) {
                return null;
            }
            return new CustomTabsSession(this.f10139a, m64054a, this.f10140b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    public Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle) {
        try {
            return this.f10139a.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    public CustomTabsSession newSession(@Nullable CustomTabsCallback customTabsCallback) {
        return m64052c(customTabsCallback, null);
    }

    public boolean warmup(long j) {
        try {
            return this.f10139a.warmup(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Nullable
    public static String getPackageName(@NonNull Context context, @Nullable List<String> list, boolean z) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    @Nullable
    public CustomTabsSession newSession(@Nullable CustomTabsCallback customTabsCallback, int i) {
        return m64052c(customTabsCallback, m64053b(this.f10141c, i));
    }
}
