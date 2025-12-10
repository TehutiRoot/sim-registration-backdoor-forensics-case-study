package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* loaded from: classes3.dex */
public class Uploader {

    /* renamed from: a */
    public final Context f44172a;

    /* renamed from: b */
    public final BackendRegistry f44173b;

    /* renamed from: c */
    public final EventStore f44174c;

    /* renamed from: d */
    public final WorkScheduler f44175d;

    /* renamed from: e */
    public final Executor f44176e;

    /* renamed from: f */
    public final SynchronizationGuard f44177f;

    /* renamed from: g */
    public final Clock f44178g;

    /* renamed from: h */
    public final Clock f44179h;

    /* renamed from: i */
    public final ClientHealthMetricsStore f44180i;

    @Inject
    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f44172a = context;
        this.f44173b = backendRegistry;
        this.f44174c = eventStore;
        this.f44175d = workScheduler;
        this.f44176e = executor;
        this.f44177f = synchronizationGuard;
        this.f44178g = clock;
        this.f44179h = clock2;
        this.f44180i = clientHealthMetricsStore;
    }

    /* renamed from: a */
    public static /* synthetic */ Iterable m49093a(Uploader uploader, TransportContext transportContext) {
        return uploader.m49082l(transportContext);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m49092b(Uploader uploader, Iterable iterable, TransportContext transportContext, long j) {
        return uploader.m49081m(iterable, transportContext, j);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m49091c(Uploader uploader) {
        return uploader.m49079o();
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m49090d(Uploader uploader, TransportContext transportContext) {
        return uploader.m49083k(transportContext);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m49089e(Uploader uploader, Iterable iterable) {
        return uploader.m49080n(iterable);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m49088f(Uploader uploader, TransportContext transportContext, int i) {
        return uploader.m49076r(transportContext, i);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m49087g(Uploader uploader, TransportContext transportContext, long j) {
        return uploader.m49077q(transportContext, j);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m49086h(Uploader uploader, Map map) {
        return uploader.m49078p(map);
    }

    /* renamed from: i */
    public static /* synthetic */ void m49085i(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
        uploader.m49075s(transportContext, i, runnable);
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.f44177f;
        final ClientHealthMetricsStore clientHealthMetricsStore = this.f44180i;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.f44178g.getTime()).setUptimeMillis(this.f44179h.getTime()).setTransportName("GDT_CLIENT_METRICS").setEncodedPayload(new EncodedPayload(Encoding.m49169of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: JZ1
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return ClientHealthMetricsStore.this.loadClientMetrics();
            }
        })).toByteArray())).build());
    }

    /* renamed from: j */
    public boolean m49084j() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f44172a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final /* synthetic */ Boolean m49083k(TransportContext transportContext) {
        return Boolean.valueOf(this.f44174c.hasPendingEventsFor(transportContext));
    }

    /* renamed from: l */
    public final /* synthetic */ Iterable m49082l(TransportContext transportContext) {
        return this.f44174c.loadBatch(transportContext);
    }

    @CanIgnoreReturnValue
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public BackendResponse logAndUpdateState(final TransportContext transportContext, int i) {
        BackendResponse send;
        TransportBackend transportBackend = this.f44173b.get(transportContext.getBackendName());
        long j = 0;
        BackendResponse m49131ok = BackendResponse.m49131ok(0L);
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f44177f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: KZ1
                {
                    Uploader.this = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Uploader.m49090d(Uploader.this, transportContext);
                }
            })).booleanValue()) {
                final Iterable<PersistedEvent> iterable = (Iterable) this.f44177f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: LZ1
                    {
                        Uploader.this = this;
                    }

                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m49093a(Uploader.this, transportContext);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m49131ok;
                }
                if (transportBackend == null) {
                    Logging.m49116d("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                    send = BackendResponse.fatalError();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (PersistedEvent persistedEvent : iterable) {
                        arrayList.add(persistedEvent.getEvent());
                    }
                    if (transportContext.shouldUploadClientHealthMetrics()) {
                        arrayList.add(createMetricsEvent(transportBackend));
                    }
                    send = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
                }
                m49131ok = send;
                if (m49131ok.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f44177f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: MZ1
                        {
                            Uploader.this = this;
                        }

                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return Uploader.m49092b(Uploader.this, iterable, transportContext, j2);
                        }
                    });
                    this.f44175d.schedule(transportContext, i + 1, true);
                    return m49131ok;
                }
                this.f44177f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: NZ1
                    {
                        Uploader.this = this;
                    }

                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Uploader.m49089e(Uploader.this, iterable);
                    }
                });
                if (m49131ok.getStatus() == BackendResponse.Status.OK) {
                    j = Math.max(j2, m49131ok.getNextRequestWaitMillis());
                    if (transportContext.shouldUploadClientHealthMetrics()) {
                        this.f44177f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: OZ1
                            {
                                Uploader.this = this;
                            }

                            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                            public final Object execute() {
                                return Uploader.m49091c(Uploader.this);
                            }
                        });
                    }
                } else if (m49131ok.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (PersistedEvent persistedEvent2 : iterable) {
                        String transportName = persistedEvent2.getEvent().getTransportName();
                        if (!hashMap.containsKey(transportName)) {
                            hashMap.put(transportName, 1);
                        } else {
                            hashMap.put(transportName, Integer.valueOf(((Integer) hashMap.get(transportName)).intValue() + 1));
                        }
                    }
                    this.f44177f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: PZ1
                        {
                            Uploader.this = this;
                        }

                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return Uploader.m49086h(Uploader.this, hashMap);
                        }
                    });
                }
            }
            this.f44177f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: QZ1
                {
                    Uploader.this = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return Uploader.m49087g(Uploader.this, transportContext, j2);
                }
            });
            return m49131ok;
        }
    }

    /* renamed from: m */
    public final /* synthetic */ Object m49081m(Iterable iterable, TransportContext transportContext, long j) {
        this.f44174c.recordFailure(iterable);
        this.f44174c.recordNextCallTime(transportContext, this.f44178g.getTime() + j);
        return null;
    }

    /* renamed from: n */
    public final /* synthetic */ Object m49080n(Iterable iterable) {
        this.f44174c.recordSuccess(iterable);
        return null;
    }

    /* renamed from: o */
    public final /* synthetic */ Object m49079o() {
        this.f44180i.resetClientMetrics();
        return null;
    }

    /* renamed from: p */
    public final /* synthetic */ Object m49078p(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f44180i.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* renamed from: q */
    public final /* synthetic */ Object m49077q(TransportContext transportContext, long j) {
        this.f44174c.recordNextCallTime(transportContext, this.f44178g.getTime() + j);
        return null;
    }

    /* renamed from: r */
    public final /* synthetic */ Object m49076r(TransportContext transportContext, int i) {
        this.f44175d.schedule(transportContext, i + 1);
        return null;
    }

    /* renamed from: s */
    public final /* synthetic */ void m49075s(final TransportContext transportContext, final int i, Runnable runnable) {
        try {
            try {
                SynchronizationGuard synchronizationGuard = this.f44177f;
                final EventStore eventStore = this.f44174c;
                Objects.requireNonNull(eventStore);
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: RZ1
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Integer.valueOf(eventStore.cleanUp());
                    }
                });
                if (!m49084j()) {
                    this.f44177f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: IZ1
                        {
                            Uploader.this = this;
                        }

                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return Uploader.m49088f(Uploader.this, transportContext, i);
                        }
                    });
                } else {
                    logAndUpdateState(transportContext, i);
                }
            } catch (SynchronizationException unused) {
                this.f44175d.schedule(transportContext, i + 1);
            }
            runnable.run();
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    public void upload(final TransportContext transportContext, final int i, final Runnable runnable) {
        this.f44176e.execute(new Runnable() { // from class: HZ1
            {
                Uploader.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Uploader.m49085i(Uploader.this, transportContext, i, runnable);
            }
        });
    }
}
