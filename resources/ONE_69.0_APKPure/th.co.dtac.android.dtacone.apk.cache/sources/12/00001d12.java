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
    public final ICustomTabsService f10227a;

    /* renamed from: b */
    public final ComponentName f10228b;

    /* renamed from: c */
    public final Context f10229c;

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$a */
    /* loaded from: classes.dex */
    public class C2287a extends CustomTabsServiceConnection {

        /* renamed from: b */
        public final /* synthetic */ Context f10230b;

        public C2287a(Context context) {
            this.f10230b = context;
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            customTabsClient.warmup(0L);
            this.f10230b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsClient$b */
    /* loaded from: classes.dex */
    public class BinderC2288b extends ICustomTabsCallback.Stub {

        /* renamed from: a */
        public Handler f10231a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public final /* synthetic */ CustomTabsCallback f10232b;

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$a */
        /* loaded from: classes.dex */
        public class RunnableC2289a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f10234a;

            public RunnableC2289a(Bundle bundle) {
                this.f10234a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onUnminimized(this.f10234a);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$b */
        /* loaded from: classes.dex */
        public class RunnableC2290b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10236a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f10237b;

            public RunnableC2290b(int i, Bundle bundle) {
                this.f10236a = i;
                this.f10237b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onNavigationEvent(this.f10236a, this.f10237b);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$c */
        /* loaded from: classes.dex */
        public class RunnableC2291c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f10239a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f10240b;

            public RunnableC2291c(String str, Bundle bundle) {
                this.f10239a = str;
                this.f10240b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.extraCallback(this.f10239a, this.f10240b);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$d */
        /* loaded from: classes.dex */
        public class RunnableC2292d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f10242a;

            public RunnableC2292d(Bundle bundle) {
                this.f10242a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onMessageChannelReady(this.f10242a);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$e */
        /* loaded from: classes.dex */
        public class RunnableC2293e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f10244a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f10245b;

            public RunnableC2293e(String str, Bundle bundle) {
                this.f10244a = str;
                this.f10245b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onPostMessage(this.f10244a, this.f10245b);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$f */
        /* loaded from: classes.dex */
        public class RunnableC2294f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10247a;

            /* renamed from: b */
            public final /* synthetic */ Uri f10248b;

            /* renamed from: c */
            public final /* synthetic */ boolean f10249c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f10250d;

            public RunnableC2294f(int i, Uri uri, boolean z, Bundle bundle) {
                this.f10247a = i;
                this.f10248b = uri;
                this.f10249c = z;
                this.f10250d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onRelationshipValidationResult(this.f10247a, this.f10248b, this.f10249c, this.f10250d);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$g */
        /* loaded from: classes.dex */
        public class RunnableC2295g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10252a;

            /* renamed from: b */
            public final /* synthetic */ int f10253b;

            /* renamed from: c */
            public final /* synthetic */ Bundle f10254c;

            public RunnableC2295g(int i, int i2, Bundle bundle) {
                this.f10252a = i;
                this.f10253b = i2;
                this.f10254c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onActivityResized(this.f10252a, this.f10253b, this.f10254c);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$h */
        /* loaded from: classes.dex */
        public class RunnableC2296h implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f10256a;

            public RunnableC2296h(Bundle bundle) {
                this.f10256a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onWarmupCompleted(this.f10256a);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$i */
        /* loaded from: classes.dex */
        public class RunnableC2297i implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f10258a;

            /* renamed from: b */
            public final /* synthetic */ int f10259b;

            /* renamed from: c */
            public final /* synthetic */ int f10260c;

            /* renamed from: d */
            public final /* synthetic */ int f10261d;

            /* renamed from: e */
            public final /* synthetic */ int f10262e;

            /* renamed from: f */
            public final /* synthetic */ Bundle f10263f;

            public RunnableC2297i(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                this.f10258a = i;
                this.f10259b = i2;
                this.f10260c = i3;
                this.f10261d = i4;
                this.f10262e = i5;
                this.f10263f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onActivityLayout(this.f10258a, this.f10259b, this.f10260c, this.f10261d, this.f10262e, this.f10263f);
            }
        }

        /* renamed from: androidx.browser.customtabs.CustomTabsClient$b$j */
        /* loaded from: classes.dex */
        public class RunnableC2298j implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f10265a;

            public RunnableC2298j(Bundle bundle) {
                this.f10265a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC2288b.this.f10232b.onMinimized(this.f10265a);
            }
        }

        public BinderC2288b(CustomTabsCallback customTabsCallback) {
            this.f10232b = customTabsCallback;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2291c(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            CustomTabsCallback customTabsCallback = this.f10232b;
            if (customTabsCallback == null) {
                return null;
            }
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2297i(i, i2, i3, i4, i5, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i, int i2, Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2295g(i, i2, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2292d(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2298j(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2290b(i, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2293e(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2294f(i, uri, z, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2289a(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(Bundle bundle) {
            if (this.f10232b == null) {
                return;
            }
            this.f10231a.post(new RunnableC2296h(bundle));
        }
    }

    public CustomTabsClient(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f10227a = iCustomTabsService;
        this.f10228b = componentName;
        this.f10229c = context;
    }

    /* renamed from: b */
    public static PendingIntent m64004b(Context context, int i) {
        return PendingIntent.getActivity(context, i, new Intent(), 67108864);
    }

    public static boolean bindCustomTabsService(@NonNull Context context, @Nullable String str, @NonNull CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.m63987a(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(@NonNull Context context, @Nullable String str, @NonNull CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.m63987a(context.getApplicationContext());
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
            return bindCustomTabsService(applicationContext, str, new C2287a(applicationContext));
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
        return new CustomTabsSession.PendingSession(customTabsCallback, m64004b(context, i));
    }

    /* renamed from: a */
    public final ICustomTabsCallback.Stub m64005a(CustomTabsCallback customTabsCallback) {
        return new BinderC2288b(customTabsCallback);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public CustomTabsSession attachSession(@NonNull CustomTabsSession.PendingSession pendingSession) {
        return m64003c(pendingSession.m63978a(), pendingSession.m63977b());
    }

    /* renamed from: c */
    public final CustomTabsSession m64003c(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
        boolean newSession;
        ICustomTabsCallback.Stub m64005a = m64005a(customTabsCallback);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                newSession = this.f10227a.newSessionWithExtras(m64005a, bundle);
            } else {
                newSession = this.f10227a.newSession(m64005a);
            }
            if (!newSession) {
                return null;
            }
            return new CustomTabsSession(this.f10227a, m64005a, this.f10228b, pendingIntent);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    public Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle) {
        try {
            return this.f10227a.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    public CustomTabsSession newSession(@Nullable CustomTabsCallback customTabsCallback) {
        return m64003c(customTabsCallback, null);
    }

    public boolean warmup(long j) {
        try {
            return this.f10227a.warmup(j);
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
        return m64003c(customTabsCallback, m64004b(this.f10229c, i));
    }
}