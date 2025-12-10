package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.repository.OneRetailerProfileUpdateRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneRetailerProfileUpdateViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateViewModel_Factory implements Factory<OneRetailerProfileUpdateViewModel> {

    /* renamed from: a */
    public final Provider f97062a;

    /* renamed from: b */
    public final Provider f97063b;

    /* renamed from: c */
    public final Provider f97064c;

    /* renamed from: d */
    public final Provider f97065d;

    /* renamed from: e */
    public final Provider f97066e;

    /* renamed from: f */
    public final Provider f97067f;

    /* renamed from: g */
    public final Provider f97068g;

    public OneRetailerProfileUpdateViewModel_Factory(Provider<OneRetailerProfileUpdateRepository> provider, Provider<RtrRepository> provider2, Provider<UdidService> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5, Provider<ConfigurationRepository> provider6, Provider<CompressImage> provider7) {
        this.f97062a = provider;
        this.f97063b = provider2;
        this.f97064c = provider3;
        this.f97065d = provider4;
        this.f97066e = provider5;
        this.f97067f = provider6;
        this.f97068g = provider7;
    }

    public static OneRetailerProfileUpdateViewModel_Factory create(Provider<OneRetailerProfileUpdateRepository> provider, Provider<RtrRepository> provider2, Provider<UdidService> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5, Provider<ConfigurationRepository> provider6, Provider<CompressImage> provider7) {
        return new OneRetailerProfileUpdateViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OneRetailerProfileUpdateViewModel newInstance(OneRetailerProfileUpdateRepository oneRetailerProfileUpdateRepository, RtrRepository rtrRepository, UdidService udidService, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, CompressImage compressImage) {
        return new OneRetailerProfileUpdateViewModel(oneRetailerProfileUpdateRepository, rtrRepository, udidService, rx2ThreadService, oneErrorService, configurationRepository, compressImage);
    }

    @Override // javax.inject.Provider
    public OneRetailerProfileUpdateViewModel get() {
        return newInstance((OneRetailerProfileUpdateRepository) this.f97062a.get(), (RtrRepository) this.f97063b.get(), (UdidService) this.f97064c.get(), (Rx2ThreadService) this.f97065d.get(), (OneErrorService) this.f97066e.get(), (ConfigurationRepository) this.f97067f.get(), (CompressImage) this.f97068g.get());
    }
}