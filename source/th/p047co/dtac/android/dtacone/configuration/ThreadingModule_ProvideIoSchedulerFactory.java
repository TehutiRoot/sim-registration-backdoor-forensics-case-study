package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import p046rx.Scheduler;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.ThreadingModule_ProvideIoSchedulerFactory */
/* loaded from: classes7.dex */
public final class ThreadingModule_ProvideIoSchedulerFactory implements Factory<Scheduler> {

    /* renamed from: a */
    public final ThreadingModule f83413a;

    public ThreadingModule_ProvideIoSchedulerFactory(ThreadingModule threadingModule) {
        this.f83413a = threadingModule;
    }

    public static ThreadingModule_ProvideIoSchedulerFactory create(ThreadingModule threadingModule) {
        return new ThreadingModule_ProvideIoSchedulerFactory(threadingModule);
    }

    public static Scheduler provideIoScheduler(ThreadingModule threadingModule) {
        return (Scheduler) Preconditions.checkNotNullFromProvides(threadingModule.provideIoScheduler());
    }

    @Override // javax.inject.Provider
    public Scheduler get() {
        return provideIoScheduler(this.f83413a);
    }
}
