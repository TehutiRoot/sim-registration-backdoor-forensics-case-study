package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class WorkInitializer {

    /* renamed from: a */
    public final Executor f44190a;

    /* renamed from: b */
    public final EventStore f44191b;

    /* renamed from: c */
    public final WorkScheduler f44192c;

    /* renamed from: d */
    public final SynchronizationGuard f44193d;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f44190a = executor;
        this.f44191b = eventStore;
        this.f44192c = workScheduler;
        this.f44193d = synchronizationGuard;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m49074a(WorkInitializer workInitializer) {
        return workInitializer.m49072c();
    }

    /* renamed from: b */
    public static /* synthetic */ void m49073b(WorkInitializer workInitializer) {
        workInitializer.m49071d();
    }

    /* renamed from: c */
    public final /* synthetic */ Object m49072c() {
        for (TransportContext transportContext : this.f44191b.loadActiveContexts()) {
            this.f44192c.schedule(transportContext, 1);
        }
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ void m49071d() {
        this.f44193d.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: m62
            {
                WorkInitializer.this = this;
            }

            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return WorkInitializer.m49074a(WorkInitializer.this);
            }
        });
    }

    public void ensureContextsScheduled() {
        this.f44190a.execute(new Runnable() { // from class: l62
            {
                WorkInitializer.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WorkInitializer.m49073b(WorkInitializer.this);
            }
        });
    }
}
