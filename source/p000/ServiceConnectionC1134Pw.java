package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.browser.trusted.TrustedWebActivityServiceConnection;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Pw */
/* loaded from: classes.dex */
public class ServiceConnectionC1134Pw implements ServiceConnection {

    /* renamed from: a */
    public final Runnable f4904a;

    /* renamed from: b */
    public final C1135a f4905b;

    /* renamed from: c */
    public int f4906c;

    /* renamed from: d */
    public TrustedWebActivityServiceConnection f4907d;

    /* renamed from: e */
    public List f4908e;

    /* renamed from: f */
    public Exception f4909f;

    /* renamed from: Pw$a */
    /* loaded from: classes.dex */
    public static class C1135a {
        /* renamed from: a */
        public TrustedWebActivityServiceConnection m66701a(ComponentName componentName, IBinder iBinder) {
            return new TrustedWebActivityServiceConnection(ITrustedWebActivityService.Stub.asInterface(iBinder), componentName);
        }
    }

    public ServiceConnectionC1134Pw(Runnable runnable) {
        this(runnable, new C1135a());
    }

    /* renamed from: a */
    public static /* synthetic */ Object m66705a(ServiceConnectionC1134Pw serviceConnectionC1134Pw, CallbackToFutureAdapter.Completer completer) {
        return serviceConnectionC1134Pw.m66702d(completer);
    }

    /* renamed from: b */
    public void m66704b(Exception exc) {
        for (CallbackToFutureAdapter.Completer completer : this.f4908e) {
            completer.setException(exc);
        }
        this.f4908e.clear();
        this.f4904a.run();
        this.f4906c = 3;
        this.f4909f = exc;
    }

    /* renamed from: c */
    public ListenableFuture m66703c() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Ow
            {
                ServiceConnectionC1134Pw.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ServiceConnectionC1134Pw.m66705a(ServiceConnectionC1134Pw.this, completer);
            }
        });
    }

    /* renamed from: d */
    public final /* synthetic */ Object m66702d(CallbackToFutureAdapter.Completer completer) {
        int i = this.f4906c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("Connection state is invalid");
                    }
                    throw this.f4909f;
                }
                throw new IllegalStateException("Service has been disconnected.");
            }
            TrustedWebActivityServiceConnection trustedWebActivityServiceConnection = this.f4907d;
            if (trustedWebActivityServiceConnection != null) {
                completer.set(trustedWebActivityServiceConnection);
            } else {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
        } else {
            this.f4908e.add(completer);
        }
        return "ConnectionHolder, state = " + this.f4906c;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4907d = this.f4905b.m66701a(componentName, iBinder);
        for (CallbackToFutureAdapter.Completer completer : this.f4908e) {
            completer.set(this.f4907d);
        }
        this.f4908e.clear();
        this.f4906c = 1;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f4907d = null;
        this.f4904a.run();
        this.f4906c = 2;
    }

    public ServiceConnectionC1134Pw(Runnable runnable, C1135a c1135a) {
        this.f4906c = 0;
        this.f4908e = new ArrayList();
        this.f4904a = runnable;
        this.f4905b = c1135a;
    }
}
