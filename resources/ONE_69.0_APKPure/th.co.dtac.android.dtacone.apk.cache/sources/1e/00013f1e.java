package th.p047co.dtac.android.dtacone.view.appOne.sellerID.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.repository.OneShopListRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.viewModel.OneSellerViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneSellerViewModel_Factory implements Factory<OneSellerViewModel> {

    /* renamed from: a */
    public final Provider f97184a;

    /* renamed from: b */
    public final Provider f97185b;

    /* renamed from: c */
    public final Provider f97186c;

    /* renamed from: d */
    public final Provider f97187d;

    /* renamed from: e */
    public final Provider f97188e;

    public OneSellerViewModel_Factory(Provider<PreferencesRepository> provider, Provider<TemporaryCache> provider2, Provider<OneShopListRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        this.f97184a = provider;
        this.f97185b = provider2;
        this.f97186c = provider3;
        this.f97187d = provider4;
        this.f97188e = provider5;
    }

    public static OneSellerViewModel_Factory create(Provider<PreferencesRepository> provider, Provider<TemporaryCache> provider2, Provider<OneShopListRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        return new OneSellerViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneSellerViewModel newInstance(PreferencesRepository preferencesRepository, TemporaryCache temporaryCache, OneShopListRepository oneShopListRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneSellerViewModel(preferencesRepository, temporaryCache, oneShopListRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneSellerViewModel get() {
        return newInstance((PreferencesRepository) this.f97184a.get(), (TemporaryCache) this.f97185b.get(), (OneShopListRepository) this.f97186c.get(), (Rx2ThreadService) this.f97187d.get(), (OneErrorService) this.f97188e.get());
    }
}