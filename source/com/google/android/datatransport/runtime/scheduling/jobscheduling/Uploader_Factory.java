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
    public final Provider f44181a;

    /* renamed from: b */
    public final Provider f44182b;

    /* renamed from: c */
    public final Provider f44183c;

    /* renamed from: d */
    public final Provider f44184d;

    /* renamed from: e */
    public final Provider f44185e;

    /* renamed from: f */
    public final Provider f44186f;

    /* renamed from: g */
    public final Provider f44187g;

    /* renamed from: h */
    public final Provider f44188h;

    /* renamed from: i */
    public final Provider f44189i;

    public Uploader_Factory(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        this.f44181a = provider;
        this.f44182b = provider2;
        this.f44183c = provider3;
        this.f44184d = provider4;
        this.f44185e = provider5;
        this.f44186f = provider6;
        this.f44187g = provider7;
        this.f44188h = provider8;
        this.f44189i = provider9;
    }

    public static Uploader_Factory create(Provider<Context> provider, Provider<BackendRegistry> provider2, Provider<EventStore> provider3, Provider<WorkScheduler> provider4, Provider<Executor> provider5, Provider<SynchronizationGuard> provider6, Provider<Clock> provider7, Provider<Clock> provider8, Provider<ClientHealthMetricsStore> provider9) {
        return new Uploader_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // javax.inject.Provider
    public Uploader get() {
        return newInstance((Context) this.f44181a.get(), (BackendRegistry) this.f44182b.get(), (EventStore) this.f44183c.get(), (WorkScheduler) this.f44184d.get(), (Executor) this.f44185e.get(), (SynchronizationGuard) this.f44186f.get(), (Clock) this.f44187g.get(), (Clock) this.f44188h.get(), (ClientHealthMetricsStore) this.f44189i.get());
    }
}
