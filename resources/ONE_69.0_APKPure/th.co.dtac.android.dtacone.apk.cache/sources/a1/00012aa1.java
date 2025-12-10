package th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.repository.OneBuyDolRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneBuyDolViewModelFactory_Factory implements Factory<OneBuyDolViewModelFactory> {

    /* renamed from: a */
    public final Provider f88672a;

    /* renamed from: b */
    public final Provider f88673b;

    /* renamed from: c */
    public final Provider f88674c;

    /* renamed from: d */
    public final Provider f88675d;

    public OneBuyDolViewModelFactory_Factory(Provider<OneBuyDolRepository> provider, Provider<RtrRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4) {
        this.f88672a = provider;
        this.f88673b = provider2;
        this.f88674c = provider3;
        this.f88675d = provider4;
    }

    public static OneBuyDolViewModelFactory_Factory create(Provider<OneBuyDolRepository> provider, Provider<RtrRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4) {
        return new OneBuyDolViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OneBuyDolViewModelFactory newInstance(OneBuyDolRepository oneBuyDolRepository, RtrRepository rtrRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneBuyDolViewModelFactory(oneBuyDolRepository, rtrRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneBuyDolViewModelFactory get() {
        return newInstance((OneBuyDolRepository) this.f88672a.get(), (RtrRepository) this.f88673b.get(), (Rx2ThreadService) this.f88674c.get(), (OneErrorService) this.f88675d.get());
    }
}