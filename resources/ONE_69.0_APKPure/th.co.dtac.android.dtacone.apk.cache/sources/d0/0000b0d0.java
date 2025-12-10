package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.BinderC8546e;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes4.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: b */
    public Binder f55614b;

    /* renamed from: d */
    public int f55616d;

    /* renamed from: a */
    public final ExecutorService f55613a = AbstractC11636kW.m29203d();

    /* renamed from: c */
    public final Object f55615c = new Object();

    /* renamed from: e */
    public int f55617e = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    /* loaded from: classes4.dex */
    public class C8535a implements BinderC8546e.InterfaceC8547a {
        public C8535a() {
            EnhancedIntentService.this = r1;
        }

        @Override // com.google.firebase.messaging.BinderC8546e.InterfaceC8547a
        /* renamed from: a */
        public Task mo38411a(Intent intent) {
            return EnhancedIntentService.this.m38551g(intent);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m38557a(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        enhancedIntentService.m38552f(intent, taskCompletionSource);
    }

    /* renamed from: b */
    public static /* synthetic */ void m38556b(EnhancedIntentService enhancedIntentService, Intent intent, Task task) {
        enhancedIntentService.m38553e(intent, task);
    }

    /* renamed from: d */
    public final void m38554d(Intent intent) {
        if (intent != null) {
            I42.m68067c(intent);
        }
        synchronized (this.f55615c) {
            try {
                int i = this.f55617e - 1;
                this.f55617e = i;
                if (i == 0) {
                    m38550h(this.f55616d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m38553e(Intent intent, Task task) {
        m38554d(intent);
    }

    /* renamed from: f */
    public final /* synthetic */ void m38552f(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* renamed from: g */
    public final Task m38551g(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f55613a.execute(new Runnable() { // from class: GS
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.m38557a(EnhancedIntentService.this, intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    /* renamed from: h */
    public boolean m38550h(int i) {
        return stopSelfResult(i);
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.f55614b == null) {
                this.f55614b = new BinderC8546e(new C8535a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f55614b;
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.f55613a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f55615c) {
            this.f55616d = i2;
            this.f55617e++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            m38554d(intent);
            return 2;
        }
        Task m38551g = m38551g(startCommandIntent);
        if (m38551g.isComplete()) {
            m38554d(intent);
            return 2;
        }
        m38551g.addOnCompleteListener(new ExecutorC21540op1(), new OnCompleteListener() { // from class: FS
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                EnhancedIntentService.m38556b(EnhancedIntentService.this, intent, task);
            }
        });
        return 3;
    }
}