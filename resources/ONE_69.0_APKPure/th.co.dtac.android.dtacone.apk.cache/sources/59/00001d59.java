package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class TrustedWebActivityServiceConnectionPool {

    /* renamed from: a */
    public final Context f10337a;

    /* renamed from: b */
    public final Map f10338b = new HashMap();

    /* renamed from: androidx.browser.trusted.TrustedWebActivityServiceConnectionPool$a */
    /* loaded from: classes.dex */
    public static class AsyncTaskC2318a extends AsyncTask {

        /* renamed from: a */
        public final Context f10339a;

        /* renamed from: b */
        public final Intent f10340b;

        /* renamed from: c */
        public final ServiceConnectionC1124Pw f10341c;

        public AsyncTaskC2318a(Context context, Intent intent, ServiceConnectionC1124Pw serviceConnectionC1124Pw) {
            this.f10339a = context.getApplicationContext();
            this.f10340b = intent;
            this.f10341c = serviceConnectionC1124Pw;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f10339a.bindService(this.f10340b, this.f10341c, FragmentTransaction.TRANSIT_FRAGMENT_OPEN)) {
                    return null;
                }
                this.f10339a.unbindService(this.f10341c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e) {
                Log.w("TWAConnectionPool", "SecurityException while binding.", e);
                return e;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f10341c.m66870b(exc);
            }
        }
    }

    public TrustedWebActivityServiceConnectionPool(Context context) {
        this.f10337a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* synthetic */ void m63940a(TrustedWebActivityServiceConnectionPool trustedWebActivityServiceConnectionPool, Uri uri) {
        trustedWebActivityServiceConnectionPool.m63938c(uri);
    }

    @NonNull
    public static TrustedWebActivityServiceConnectionPool create(@NonNull Context context) {
        return new TrustedWebActivityServiceConnectionPool(context);
    }

    /* renamed from: b */
    public final Intent m63939b(Context context, Uri uri, Set set, boolean z) {
        if (set == null || set.size() == 0) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        String str = null;
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str2 = resolveInfo.activityInfo.packageName;
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Token) it.next()).matches(str2, context.getPackageManager())) {
                        str = str2;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (str == null) {
            if (z) {
                Log.w("TWAConnectionPool", "No TWA candidates for " + uri + " have been registered.");
            }
            return null;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(str);
        intent2.setAction(TrustedWebActivityService.ACTION_TRUSTED_WEB_ACTIVITY_SERVICE);
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 131072);
        if (resolveService == null) {
            if (z) {
                Log.w("TWAConnectionPool", "Could not find TWAService for " + str);
            }
            return null;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Found ");
            sb.append(resolveService.serviceInfo.name);
            sb.append(" to handle request for ");
            sb.append(uri);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName(str, resolveService.serviceInfo.name));
        return intent3;
    }

    /* renamed from: c */
    public final /* synthetic */ void m63938c(Uri uri) {
        this.f10338b.remove(uri);
    }

    @NonNull
    @MainThread
    public ListenableFuture<TrustedWebActivityServiceConnection> connect(@NonNull final Uri uri, @NonNull Set<Token> set, @NonNull Executor executor) {
        ServiceConnectionC1124Pw serviceConnectionC1124Pw = (ServiceConnectionC1124Pw) this.f10338b.get(uri);
        if (serviceConnectionC1124Pw != null) {
            return serviceConnectionC1124Pw.m66869c();
        }
        Intent m63939b = m63939b(this.f10337a, uri, set, true);
        if (m63939b == null) {
            return AbstractC22452u50.m1260a(new IllegalArgumentException("No service exists for scope"));
        }
        ServiceConnectionC1124Pw serviceConnectionC1124Pw2 = new ServiceConnectionC1124Pw(new Runnable() { // from class: HW1
            @Override // java.lang.Runnable
            public final void run() {
                TrustedWebActivityServiceConnectionPool.m63940a(TrustedWebActivityServiceConnectionPool.this, uri);
            }
        });
        this.f10338b.put(uri, serviceConnectionC1124Pw2);
        new AsyncTaskC2318a(this.f10337a, m63939b, serviceConnectionC1124Pw2).executeOnExecutor(executor, new Void[0]);
        return serviceConnectionC1124Pw2.m66869c();
    }

    @MainThread
    public boolean serviceExistsForScope(@NonNull Uri uri, @NonNull Set<Token> set) {
        if (this.f10338b.get(uri) != null || m63939b(this.f10337a, uri, set, false) != null) {
            return true;
        }
        return false;
    }
}