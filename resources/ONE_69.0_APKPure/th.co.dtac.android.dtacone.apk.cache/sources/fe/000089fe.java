package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

/* loaded from: classes3.dex */
public class DefaultScheduler implements Scheduler {

    /* renamed from: f */
    public static final Logger f44158f = Logger.getLogger(TransportRuntime.class.getName());

    /* renamed from: a */
    public final WorkScheduler f44159a;

    /* renamed from: b */
    public final Executor f44160b;

    /* renamed from: c */
    public final BackendRegistry f44161c;

    /* renamed from: d */
    public final EventStore f44162d;

    /* renamed from: e */
    public final SynchronizationGuard f44163e;

    @Inject
    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f44160b = executor;
        this.f44161c = backendRegistry;
        this.f44159a = workScheduler;
        this.f44162d = eventStore;
        this.f44163e = synchronizationGuard;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m49107a(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        return defaultScheduler.m49105c(transportContext, eventInternal);
    }

    /* renamed from: b */
    public static /* synthetic */ void m49106b(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        defaultScheduler.m49104d(transportContext, transportScheduleCallback, eventInternal);
    }

    /* renamed from: c */
    public final /* synthetic */ Object m49105c(TransportContext transportContext, EventInternal eventInternal) {
        this.f44162d.persist(transportContext, eventInternal);
        this.f44159a.schedule(transportContext, 1);
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ void m49104d(final TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = this.f44161c.get(transportContext.getBackendName());
            if (transportBackend == null) {
                String format = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                f44158f.warning(format);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(format));
                return;
            }
            final EventInternal decorate = transportBackend.decorate(eventInternal);
            this.f44163e.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: OE
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return DefaultScheduler.m49107a(DefaultScheduler.this, transportContext, decorate);
                }
            });
            transportScheduleCallback.onSchedule(null);
        } catch (Exception e) {
            Logger logger = f44158f;
            logger.warning("Error scheduling event " + e.getMessage());
            transportScheduleCallback.onSchedule(e);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.f44160b.execute(new Runnable() { // from class: NE
            @Override // java.lang.Runnable
            public final void run() {
                DefaultScheduler.m49106b(DefaultScheduler.this, transportContext, transportScheduleCallback, eventInternal);
            }
        });
    }
}