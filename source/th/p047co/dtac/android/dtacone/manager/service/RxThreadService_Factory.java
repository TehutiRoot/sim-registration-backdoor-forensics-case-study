package th.p047co.dtac.android.dtacone.manager.service;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import p046rx.Scheduler;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.manager.service.RxThreadService_Factory */
/* loaded from: classes7.dex */
public final class RxThreadService_Factory implements Factory<RxThreadService> {

    /* renamed from: a */
    public final Provider f85017a;

    /* renamed from: b */
    public final Provider f85018b;

    /* renamed from: c */
    public final Provider f85019c;

    public RxThreadService_Factory(Provider<Scheduler> provider, Provider<Scheduler> provider2, Provider<Scheduler> provider3) {
        this.f85017a = provider;
        this.f85018b = provider2;
        this.f85019c = provider3;
    }

    public static RxThreadService_Factory create(Provider<Scheduler> provider, Provider<Scheduler> provider2, Provider<Scheduler> provider3) {
        return new RxThreadService_Factory(provider, provider2, provider3);
    }

    public static RxThreadService newInstance(Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        return new RxThreadService(scheduler, scheduler2, scheduler3);
    }

    @Override // javax.inject.Provider
    public RxThreadService get() {
        return newInstance((Scheduler) this.f85017a.get(), (Scheduler) this.f85018b.get(), (Scheduler) this.f85019c.get());
    }
}
