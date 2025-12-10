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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneBuyDolViewModel_Factory implements Factory<OneBuyDolViewModel> {

    /* renamed from: a */
    public final Provider f88676a;

    /* renamed from: b */
    public final Provider f88677b;

    /* renamed from: c */
    public final Provider f88678c;

    /* renamed from: d */
    public final Provider f88679d;

    public OneBuyDolViewModel_Factory(Provider<OneBuyDolRepository> provider, Provider<RtrRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4) {
        this.f88676a = provider;
        this.f88677b = provider2;
        this.f88678c = provider3;
        this.f88679d = provider4;
    }

    public static OneBuyDolViewModel_Factory create(Provider<OneBuyDolRepository> provider, Provider<RtrRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<OneErrorService> provider4) {
        return new OneBuyDolViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OneBuyDolViewModel newInstance(OneBuyDolRepository oneBuyDolRepository, RtrRepository rtrRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneBuyDolViewModel(oneBuyDolRepository, rtrRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneBuyDolViewModel get() {
        return newInstance((OneBuyDolRepository) this.f88676a.get(), (RtrRepository) this.f88677b.get(), (Rx2ThreadService) this.f88678c.get(), (OneErrorService) this.f88679d.get());
    }
}