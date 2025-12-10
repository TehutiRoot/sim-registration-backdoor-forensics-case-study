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
    public static final Logger f44146f = Logger.getLogger(TransportRuntime.class.getName());

    /* renamed from: a */
    public final WorkScheduler f44147a;

    /* renamed from: b */
    public final Executor f44148b;

    /* renamed from: c */
    public final BackendRegistry f44149c;

    /* renamed from: d */
    public final EventStore f44150d;

    /* renamed from: e */
    public final SynchronizationGuard f44151e;

    @Inject
    public DefaultScheduler(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        this.f44148b = executor;
        this.f44149c = backendRegistry;
        this.f44147a = workScheduler;
        this.f44150d = eventStore;
        this.f44151e = synchronizationGuard;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m49110a(DefaultScheduler defaultScheduler, TransportContext transportContext, EventInternal eventInternal) {
        return defaultScheduler.m49108c(transportContext, eventInternal);
    }

    /* renamed from: b */
    public static /* synthetic */ void m49109b(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        defaultScheduler.m49107d(transportContext, transportScheduleCallback, eventInternal);
    }

    /* renamed from: c */
    public final /* synthetic */ Object m49108c(TransportContext transportContext, EventInternal eventInternal) {
        this.f44150d.persist(transportContext, eventInternal);
        this.f44147a.schedule(transportContext, 1);
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ void m49107d(final TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        try {
            TransportBackend transportBackend = this.f44149c.get(transportContext.getBackendName());
            if (transportBackend == null) {
                String format = String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                f44146f.warning(format);
                transportScheduleCallback.onSchedule(new IllegalArgumentException(format));
                return;
            }
            final EventInternal decorate = transportBackend.decorate(eventInternal);
            this.f44151e.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: NE
                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    return DefaultScheduler.m49110a(DefaultScheduler.this, transportContext, decorate);
                }
            });
            transportScheduleCallback.onSchedule(null);
        } catch (Exception e) {
            Logger logger = f44146f;
            logger.warning("Error scheduling event " + e.getMessage());
            transportScheduleCallback.onSchedule(e);
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final TransportContext transportContext, final EventInternal eventInternal, final TransportScheduleCallback transportScheduleCallback) {
        this.f44148b.execute(new Runnable() { // from class: ME
            @Override // java.lang.Runnable
            public final void run() {
                DefaultScheduler.m49109b(DefaultScheduler.this, transportContext, transportScheduleCallback, eventInternal);
            }
        });
    }
}
