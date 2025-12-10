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
/* renamed from: th.co.dtac.android.dtacone.configuration.ThreadingModule_ProvideMainThreadSchedulerFactory */
/* loaded from: classes7.dex */
public final class ThreadingModule_ProvideMainThreadSchedulerFactory implements Factory<Scheduler> {

    /* renamed from: a */
    public final ThreadingModule f83414a;

    public ThreadingModule_ProvideMainThreadSchedulerFactory(ThreadingModule threadingModule) {
        this.f83414a = threadingModule;
    }

    public static ThreadingModule_ProvideMainThreadSchedulerFactory create(ThreadingModule threadingModule) {
        return new ThreadingModule_ProvideMainThreadSchedulerFactory(threadingModule);
    }

    public static Scheduler provideMainThreadScheduler(ThreadingModule threadingModule) {
        return (Scheduler) Preconditions.checkNotNullFromProvides(threadingModule.provideMainThreadScheduler());
    }

    @Override // javax.inject.Provider
    public Scheduler get() {
        return provideMainThreadScheduler(this.f83414a);
    }
}
