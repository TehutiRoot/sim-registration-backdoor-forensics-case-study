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
/* renamed from: th.co.dtac.android.dtacone.configuration.ThreadingModule_ProvideCompSchedulerFactory */
/* loaded from: classes7.dex */
public final class ThreadingModule_ProvideCompSchedulerFactory implements Factory<Scheduler> {

    /* renamed from: a */
    public final ThreadingModule f83412a;

    public ThreadingModule_ProvideCompSchedulerFactory(ThreadingModule threadingModule) {
        this.f83412a = threadingModule;
    }

    public static ThreadingModule_ProvideCompSchedulerFactory create(ThreadingModule threadingModule) {
        return new ThreadingModule_ProvideCompSchedulerFactory(threadingModule);
    }

    public static Scheduler provideCompScheduler(ThreadingModule threadingModule) {
        return (Scheduler) Preconditions.checkNotNullFromProvides(threadingModule.provideCompScheduler());
    }

    @Override // javax.inject.Provider
    public Scheduler get() {
        return provideCompScheduler(this.f83412a);
    }
}
