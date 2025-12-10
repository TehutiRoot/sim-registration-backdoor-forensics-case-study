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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.viewModel.OneSellerViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneSellerViewModelFactory_Factory implements Factory<OneSellerViewModelFactory> {

    /* renamed from: a */
    public final Provider f97179a;

    /* renamed from: b */
    public final Provider f97180b;

    /* renamed from: c */
    public final Provider f97181c;

    /* renamed from: d */
    public final Provider f97182d;

    /* renamed from: e */
    public final Provider f97183e;

    public OneSellerViewModelFactory_Factory(Provider<PreferencesRepository> provider, Provider<TemporaryCache> provider2, Provider<OneShopListRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        this.f97179a = provider;
        this.f97180b = provider2;
        this.f97181c = provider3;
        this.f97182d = provider4;
        this.f97183e = provider5;
    }

    public static OneSellerViewModelFactory_Factory create(Provider<PreferencesRepository> provider, Provider<TemporaryCache> provider2, Provider<OneShopListRepository> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5) {
        return new OneSellerViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneSellerViewModelFactory newInstance(PreferencesRepository preferencesRepository, TemporaryCache temporaryCache, OneShopListRepository oneShopListRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneSellerViewModelFactory(preferencesRepository, temporaryCache, oneShopListRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneSellerViewModelFactory get() {
        return newInstance((PreferencesRepository) this.f97179a.get(), (TemporaryCache) this.f97180b.get(), (OneShopListRepository) this.f97181c.get(), (Rx2ThreadService) this.f97182d.get(), (OneErrorService) this.f97183e.get());
    }
}