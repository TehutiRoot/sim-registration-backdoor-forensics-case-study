package com.google.firebase.remoteconfig.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@AnyThread
/* loaded from: classes4.dex */
public class ConfigCacheClient {

    /* renamed from: d */
    public static final Map f56360d = new HashMap();

    /* renamed from: e */
    public static final Executor f56361e = new ExecutorC21992ro1();

    /* renamed from: a */
    public final Executor f56362a;

    /* renamed from: b */
    public final ConfigStorageClient f56363b;

    /* renamed from: c */
    public Task f56364c = null;

    /* renamed from: com.google.firebase.remoteconfig.internal.ConfigCacheClient$b */
    /* loaded from: classes4.dex */
    public static class C8632b implements OnSuccessListener, OnFailureListener, OnCanceledListener {

        /* renamed from: a */
        public final CountDownLatch f56365a;

        public C8632b() {
            this.f56365a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public boolean m37760a(long j, TimeUnit timeUnit) {
            return this.f56365a.await(j, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f56365a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f56365a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(Object obj) {
            this.f56365a.countDown();
        }
    }

    public ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.f56362a = executor;
        this.f56363b = configStorageClient;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m37767a(ConfigCacheClient configCacheClient, boolean z, ConfigContainer configContainer, Void r3) {
        return configCacheClient.m37762f(z, configContainer, r3);
    }

    /* renamed from: b */
    public static /* synthetic */ Void m37766b(ConfigCacheClient configCacheClient, ConfigContainer configContainer) {
        return configCacheClient.m37763e(configContainer);
    }

    /* renamed from: c */
    public static Object m37765c(Task task, long j, TimeUnit timeUnit) {
        C8632b c8632b = new C8632b();
        Executor executor = f56361e;
        task.addOnSuccessListener(executor, c8632b);
        task.addOnFailureListener(executor, c8632b);
        task.addOnCanceledListener(executor, c8632b);
        if (c8632b.m37760a(j, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        synchronized (ConfigCacheClient.class) {
            f56360d.clear();
        }
    }

    public static synchronized ConfigCacheClient getInstance(Executor executor, ConfigStorageClient configStorageClient) {
        ConfigCacheClient configCacheClient;
        synchronized (ConfigCacheClient.class) {
            try {
                String m37662a = configStorageClient.m37662a();
                Map map = f56360d;
                if (!map.containsKey(m37662a)) {
                    map.put(m37662a, new ConfigCacheClient(executor, configStorageClient));
                }
                configCacheClient = (ConfigCacheClient) map.get(m37662a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configCacheClient;
    }

    public void clear() {
        synchronized (this) {
            this.f56364c = Tasks.forResult(null);
        }
        this.f56363b.clear();
    }

    /* renamed from: d */
    public ConfigContainer m37764d(long j) {
        synchronized (this) {
            try {
                Task task = this.f56364c;
                if (task != null && task.isSuccessful()) {
                    return (ConfigContainer) this.f56364c.getResult();
                }
                try {
                    return (ConfigContainer) m37765c(get(), j, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ Void m37763e(ConfigContainer configContainer) {
        return this.f56363b.write(configContainer);
    }

    /* renamed from: f */
    public final /* synthetic */ Task m37762f(boolean z, ConfigContainer configContainer, Void r3) {
        if (z) {
            m37761g(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    /* renamed from: g */
    public final synchronized void m37761g(ConfigContainer configContainer) {
        this.f56364c = Tasks.forResult(configContainer);
    }

    public synchronized Task<ConfigContainer> get() {
        try {
            Task task = this.f56364c;
            if (task != null) {
                if (task.isComplete() && !this.f56364c.isSuccessful()) {
                }
            }
            Executor executor = this.f56362a;
            final ConfigStorageClient configStorageClient = this.f56363b;
            Objects.requireNonNull(configStorageClient);
            this.f56364c = Tasks.call(executor, new Callable() { // from class: ow
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return configStorageClient.read();
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f56364c;
    }

    @Nullable
    public ConfigContainer getBlocking() {
        return m37764d(5L);
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z) {
        return Tasks.call(this.f56362a, new Callable() { // from class: mw
            {
                ConfigCacheClient.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ConfigCacheClient.m37766b(ConfigCacheClient.this, configContainer);
            }
        }).onSuccessTask(this.f56362a, new SuccessContinuation() { // from class: nw
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return ConfigCacheClient.m37767a(ConfigCacheClient.this, z, configContainer, (Void) obj);
            }
        });
    }
}
