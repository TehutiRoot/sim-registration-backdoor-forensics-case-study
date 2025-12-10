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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.viewModel.OneRetailerProfileUpdateViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateViewModelFactory_Factory implements Factory<OneRetailerProfileUpdateViewModelFactory> {

    /* renamed from: a */
    public final Provider f97055a;

    /* renamed from: b */
    public final Provider f97056b;

    /* renamed from: c */
    public final Provider f97057c;

    /* renamed from: d */
    public final Provider f97058d;

    /* renamed from: e */
    public final Provider f97059e;

    /* renamed from: f */
    public final Provider f97060f;

    /* renamed from: g */
    public final Provider f97061g;

    public OneRetailerProfileUpdateViewModelFactory_Factory(Provider<OneRetailerProfileUpdateRepository> provider, Provider<RtrRepository> provider2, Provider<UdidService> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5, Provider<ConfigurationRepository> provider6, Provider<CompressImage> provider7) {
        this.f97055a = provider;
        this.f97056b = provider2;
        this.f97057c = provider3;
        this.f97058d = provider4;
        this.f97059e = provider5;
        this.f97060f = provider6;
        this.f97061g = provider7;
    }

    public static OneRetailerProfileUpdateViewModelFactory_Factory create(Provider<OneRetailerProfileUpdateRepository> provider, Provider<RtrRepository> provider2, Provider<UdidService> provider3, Provider<Rx2ThreadService> provider4, Provider<OneErrorService> provider5, Provider<ConfigurationRepository> provider6, Provider<CompressImage> provider7) {
        return new OneRetailerProfileUpdateViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OneRetailerProfileUpdateViewModelFactory newInstance(OneRetailerProfileUpdateRepository oneRetailerProfileUpdateRepository, RtrRepository rtrRepository, UdidService udidService, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, ConfigurationRepository configurationRepository, CompressImage compressImage) {
        return new OneRetailerProfileUpdateViewModelFactory(oneRetailerProfileUpdateRepository, rtrRepository, udidService, rx2ThreadService, oneErrorService, configurationRepository, compressImage);
    }

    @Override // javax.inject.Provider
    public OneRetailerProfileUpdateViewModelFactory get() {
        return newInstance((OneRetailerProfileUpdateRepository) this.f97055a.get(), (RtrRepository) this.f97056b.get(), (UdidService) this.f97057c.get(), (Rx2ThreadService) this.f97058d.get(), (OneErrorService) this.f97059e.get(), (ConfigurationRepository) this.f97060f.get(), (CompressImage) this.f97061g.get());
    }
}