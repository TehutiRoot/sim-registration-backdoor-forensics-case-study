package th.p047co.dtac.android.dtacone.configuration;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.Scheduler;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.configuration.Rx2ThreadingModule_ProvideMainThreadSchedulerFactory */
/* loaded from: classes7.dex */
public final class Rx2ThreadingModule_ProvideMainThreadSchedulerFactory implements Factory<Scheduler> {

    /* renamed from: a */
    public final Rx2ThreadingModule f83217a;

    public Rx2ThreadingModule_ProvideMainThreadSchedulerFactory(Rx2ThreadingModule rx2ThreadingModule) {
        this.f83217a = rx2ThreadingModule;
    }

    public static Rx2ThreadingModule_ProvideMainThreadSchedulerFactory create(Rx2ThreadingModule rx2ThreadingModule) {
        return new Rx2ThreadingModule_ProvideMainThreadSchedulerFactory(rx2ThreadingModule);
    }

    public static Scheduler provideMainThreadScheduler(Rx2ThreadingModule rx2ThreadingModule) {
        return (Scheduler) Preconditions.checkNotNullFromProvides(rx2ThreadingModule.provideMainThreadScheduler());
    }

    @Override // javax.inject.Provider
    public Scheduler get() {
        return provideMainThreadScheduler(this.f83217a);
    }
}
