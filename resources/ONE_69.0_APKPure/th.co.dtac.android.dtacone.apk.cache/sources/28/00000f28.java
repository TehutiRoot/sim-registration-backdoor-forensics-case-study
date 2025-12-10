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
public class ServiceConnectionC1124Pw implements ServiceConnection {

    /* renamed from: a */
    public final Runnable f5065a;

    /* renamed from: b */
    public final C1125a f5066b;

    /* renamed from: c */
    public int f5067c;

    /* renamed from: d */
    public TrustedWebActivityServiceConnection f5068d;

    /* renamed from: e */
    public List f5069e;

    /* renamed from: f */
    public Exception f5070f;

    /* renamed from: Pw$a */
    /* loaded from: classes.dex */
    public static class C1125a {
        /* renamed from: a */
        public TrustedWebActivityServiceConnection m66867a(ComponentName componentName, IBinder iBinder) {
            return new TrustedWebActivityServiceConnection(ITrustedWebActivityService.Stub.asInterface(iBinder), componentName);
        }
    }

    public ServiceConnectionC1124Pw(Runnable runnable) {
        this(runnable, new C1125a());
    }

    /* renamed from: a */
    public static /* synthetic */ Object m66871a(ServiceConnectionC1124Pw serviceConnectionC1124Pw, CallbackToFutureAdapter.Completer completer) {
        return serviceConnectionC1124Pw.m66868d(completer);
    }

    /* renamed from: b */
    public void m66870b(Exception exc) {
        for (CallbackToFutureAdapter.Completer completer : this.f5069e) {
            completer.setException(exc);
        }
        this.f5069e.clear();
        this.f5065a.run();
        this.f5067c = 3;
        this.f5070f = exc;
    }

    /* renamed from: c */
    public ListenableFuture m66869c() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Ow
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ServiceConnectionC1124Pw.m66871a(ServiceConnectionC1124Pw.this, completer);
            }
        });
    }

    /* renamed from: d */
    public final /* synthetic */ Object m66868d(CallbackToFutureAdapter.Completer completer) {
        int i = this.f5067c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("Connection state is invalid");
                    }
                    throw this.f5070f;
                }
                throw new IllegalStateException("Service has been disconnected.");
            }
            TrustedWebActivityServiceConnection trustedWebActivityServiceConnection = this.f5068d;
            if (trustedWebActivityServiceConnection != null) {
                completer.set(trustedWebActivityServiceConnection);
            } else {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
        } else {
            this.f5069e.add(completer);
        }
        return "ConnectionHolder, state = " + this.f5067c;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5068d = this.f5066b.m66867a(componentName, iBinder);
        for (CallbackToFutureAdapter.Completer completer : this.f5069e) {
            completer.set(this.f5068d);
        }
        this.f5069e.clear();
        this.f5067c = 1;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f5068d = null;
        this.f5065a.run();
        this.f5067c = 2;
    }

    public ServiceConnectionC1124Pw(Runnable runnable, C1125a c1125a) {
        this.f5067c = 0;
        this.f5069e = new ArrayList();
        this.f5065a = runnable;
        this.f5066b = c1125a;
    }
}