package th.p047co.dtac.android.dtacone.manager.service;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.reactivex.Scheduler;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.manager.service.Rx2ThreadService_Factory */
/* loaded from: classes7.dex */
public final class Rx2ThreadService_Factory implements Factory<Rx2ThreadService> {

    /* renamed from: a */
    public final Provider f85011a;

    /* renamed from: b */
    public final Provider f85012b;

    /* renamed from: c */
    public final Provider f85013c;

    public Rx2ThreadService_Factory(Provider<Scheduler> provider, Provider<Scheduler> provider2, Provider<Scheduler> provider3) {
        this.f85011a = provider;
        this.f85012b = provider2;
        this.f85013c = provider3;
    }

    public static Rx2ThreadService_Factory create(Provider<Scheduler> provider, Provider<Scheduler> provider2, Provider<Scheduler> provider3) {
        return new Rx2ThreadService_Factory(provider, provider2, provider3);
    }

    public static Rx2ThreadService newInstance(Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        return new Rx2ThreadService(scheduler, scheduler2, scheduler3);
    }

    @Override // javax.inject.Provider
    public Rx2ThreadService get() {
        return newInstance((Scheduler) this.f85011a.get(), (Scheduler) this.f85012b.get(), (Scheduler) this.f85013c.get());
    }
}
