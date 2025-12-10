package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import javax.inject.Provider;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class Uploader_Factory implements Factory<Uploader> {

    /* renamed from: a */
    public final Provider f44193a;

    /* renamed from: b */
    public final Provider f44194b;

    /* renamed from: c */
    public final Provider f44195c;

    /* renamed from: d */
    public final Provider f44196d;

    /* renamed from: e */
    public final Provider f44197e;

    /* renamed from: f */
    public final Provider f44198f;

    /* renamed from: g */
    public final Provider f44199g;

    /* renamed from: h */
    public final Provider f44200h;

    /* renamed from: i */
    public final Provider f44201i;

    public Uploader_Factory(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        this.f44193a = provider;
        this.f44194b = provider2;
        this.f44195c = provider3;
        this.f44196d = provider4;
        this.f44197e = provider5;
        this.f44198f = provider6;
        this.f44199g = provider7;
        this.f44200h = provider8;
        this.f44201i = provider9;
    }

    public static Uploader_Factory create(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        return new Uploader_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // javax.inject.Provider
    public Uploader get() {
        return newInstance((Context) this.f44193a.get(), (BackendRegistry) this.f44194b.get(), (EventStore) this.f44195c.get(), (WorkScheduler) this.f44196d.get(), (Executor) this.f44197e.get(), (SynchronizationGuard) this.f44198f.get(), (Clock) this.f44199g.get(), (Clock) this.f44200h.get(), (ClientHealthMetricsStore) this.f44201i.get());
    }
}