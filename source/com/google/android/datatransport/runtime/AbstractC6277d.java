package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.AbstractC6282f;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import javax.inject.Provider;

/* renamed from: com.google.android.datatransport.runtime.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6277d {

    /* renamed from: com.google.android.datatransport.runtime.d$b */
    /* loaded from: classes3.dex */
    public static final class C6279b implements AbstractC6282f.InterfaceC6283a {

        /* renamed from: a */
        public Context f44089a;

        public C6279b() {
        }

        @Override // com.google.android.datatransport.runtime.AbstractC6282f.InterfaceC6283a
        /* renamed from: b */
        public C6279b mo49120a(Context context) {
            this.f44089a = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC6282f.InterfaceC6283a
        public AbstractC6282f build() {
            Preconditions.checkBuilderRequirement(this.f44089a, Context.class);
            return new C6280c(this.f44089a);
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.d$c */
    /* loaded from: classes3.dex */
    public static final class C6280c extends AbstractC6282f {

        /* renamed from: a */
        public final C6280c f44090a;

        /* renamed from: b */
        public Provider f44091b;

        /* renamed from: c */
        public Provider f44092c;

        /* renamed from: d */
        public Provider f44093d;

        /* renamed from: e */
        public Provider f44094e;

        /* renamed from: f */
        public Provider f44095f;

        /* renamed from: g */
        public Provider f44096g;

        /* renamed from: h */
        public Provider f44097h;

        /* renamed from: i */
        public Provider f44098i;

        /* renamed from: j */
        public Provider f44099j;

        /* renamed from: k */
        public Provider f44100k;

        /* renamed from: l */
        public Provider f44101l;

        /* renamed from: m */
        public Provider f44102m;

        /* renamed from: n */
        public Provider f44103n;

        @Override // com.google.android.datatransport.runtime.AbstractC6282f
        /* renamed from: b */
        public EventStore mo49122b() {
            return (EventStore) this.f44097h.get();
        }

        @Override // com.google.android.datatransport.runtime.AbstractC6282f
        /* renamed from: d */
        public TransportRuntime mo49121d() {
            return (TransportRuntime) this.f44103n.get();
        }

        /* renamed from: g */
        public final void m49128g(Context context) {
            this.f44091b = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
            Factory create = InstanceFactory.create(context);
            this.f44092c = create;
            CreationContextFactory_Factory create2 = CreationContextFactory_Factory.create(create, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
            this.f44093d = create2;
            this.f44094e = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(this.f44092c, create2));
            this.f44095f = SchemaManager_Factory.create(this.f44092c, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
            this.f44096g = DoubleCheck.provider(EventStoreModule_PackageNameFactory.create(this.f44092c));
            this.f44097h = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), this.f44095f, this.f44096g));
            SchedulingConfigModule_ConfigFactory create3 = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
            this.f44098i = create3;
            SchedulingModule_WorkSchedulerFactory create4 = SchedulingModule_WorkSchedulerFactory.create(this.f44092c, this.f44097h, create3, TimeModule_UptimeClockFactory.create());
            this.f44099j = create4;
            Provider provider = this.f44091b;
            Provider provider2 = this.f44094e;
            Provider provider3 = this.f44097h;
            this.f44100k = DefaultScheduler_Factory.create(provider, provider2, create4, provider3, provider3);
            Provider provider4 = this.f44092c;
            Provider provider5 = this.f44094e;
            Provider provider6 = this.f44097h;
            this.f44101l = Uploader_Factory.create(provider4, provider5, provider6, this.f44099j, this.f44091b, provider6, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.f44097h);
            Provider provider7 = this.f44091b;
            Provider provider8 = this.f44097h;
            this.f44102m = WorkInitializer_Factory.create(provider7, provider8, this.f44099j, provider8);
            this.f44103n = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.f44100k, this.f44101l, this.f44102m));
        }

        public C6280c(Context context) {
            this.f44090a = this;
            m49128g(context);
        }
    }

    /* renamed from: a */
    public static AbstractC6282f.InterfaceC6283a m49130a() {
        return new C6279b();
    }
}
