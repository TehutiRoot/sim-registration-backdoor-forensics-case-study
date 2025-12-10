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
import com.google.firebase.messaging.BinderC8557e;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes4.dex */
public abstract class EnhancedIntentService extends Service {

    /* renamed from: b */
    public Binder f55602b;

    /* renamed from: d */
    public int f55604d;

    /* renamed from: a */
    public final ExecutorService f55601a = AbstractC10308gW.m31109d();

    /* renamed from: c */
    public final Object f55603c = new Object();

    /* renamed from: e */
    public int f55605e = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    /* loaded from: classes4.dex */
    public class C8546a implements BinderC8557e.InterfaceC8558a {
        public C8546a() {
            EnhancedIntentService.this = r1;
        }

        @Override // com.google.firebase.messaging.BinderC8557e.InterfaceC8558a
        /* renamed from: a */
        public Task mo38419a(Intent intent) {
            return EnhancedIntentService.this.m38559g(intent);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m38565a(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        enhancedIntentService.m38560f(intent, taskCompletionSource);
    }

    /* renamed from: b */
    public static /* synthetic */ void m38564b(EnhancedIntentService enhancedIntentService, Intent intent, Task task) {
        enhancedIntentService.m38561e(intent, task);
    }

    /* renamed from: d */
    public final void m38562d(Intent intent) {
        if (intent != null) {
            L32.m67563c(intent);
        }
        synchronized (this.f55603c) {
            try {
                int i = this.f55605e - 1;
                this.f55605e = i;
                if (i == 0) {
                    m38558h(this.f55604d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m38561e(Intent intent, Task task) {
        m38562d(intent);
    }

    /* renamed from: f */
    public final /* synthetic */ void m38560f(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* renamed from: g */
    public final Task m38559g(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f55601a.execute(new Runnable() { // from class: CS
            {
                EnhancedIntentService.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.m38565a(EnhancedIntentService.this, intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    /* renamed from: h */
    public boolean m38558h(int i) {
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
            if (this.f55602b == null) {
                this.f55602b = new BinderC8557e(new C8546a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f55602b;
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.f55601a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f55603c) {
            this.f55604d = i2;
            this.f55605e++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            m38562d(intent);
            return 2;
        }
        Task m38559g = m38559g(startCommandIntent);
        if (m38559g.isComplete()) {
            m38562d(intent);
            return 2;
        }
        m38559g.addOnCompleteListener(new ExecutorC21992ro1(), new OnCompleteListener() { // from class: BS
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                EnhancedIntentService.m38564b(EnhancedIntentService.this, intent, task);
            }
        });
        return 3;
    }
}
