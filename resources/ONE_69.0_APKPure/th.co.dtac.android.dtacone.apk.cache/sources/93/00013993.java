package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModelFactory_Factory implements Factory<OnePostpaidRegistrationViewModelFactory> {

    /* renamed from: a */
    public final Provider f94673a;

    /* renamed from: b */
    public final Provider f94674b;

    /* renamed from: c */
    public final Provider f94675c;

    /* renamed from: d */
    public final Provider f94676d;

    /* renamed from: e */
    public final Provider f94677e;

    /* renamed from: f */
    public final Provider f94678f;

    /* renamed from: g */
    public final Provider f94679g;

    /* renamed from: h */
    public final Provider f94680h;

    public OnePostpaidRegistrationViewModelFactory_Factory(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<FileUtil> provider5, Provider<OneErrorService> provider6, Provider<PreferencesViewModel> provider7, Provider<RtrRx2Repository> provider8) {
        this.f94673a = provider;
        this.f94674b = provider2;
        this.f94675c = provider3;
        this.f94676d = provider4;
        this.f94677e = provider5;
        this.f94678f = provider6;
        this.f94679g = provider7;
        this.f94680h = provider8;
    }

    public static OnePostpaidRegistrationViewModelFactory_Factory create(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<FileUtil> provider5, Provider<OneErrorService> provider6, Provider<PreferencesViewModel> provider7, Provider<RtrRx2Repository> provider8) {
        return new OnePostpaidRegistrationViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OnePostpaidRegistrationViewModelFactory newInstance(OnePostpaidRepository onePostpaidRepository, ConfigurationRepository configurationRepository, CompressImage compressImage, Rx2ThreadService rx2ThreadService, FileUtil fileUtil, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel, RtrRx2Repository rtrRx2Repository) {
        return new OnePostpaidRegistrationViewModelFactory(onePostpaidRepository, configurationRepository, compressImage, rx2ThreadService, fileUtil, oneErrorService, preferencesViewModel, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public OnePostpaidRegistrationViewModelFactory get() {
        return newInstance((OnePostpaidRepository) this.f94673a.get(), (ConfigurationRepository) this.f94674b.get(), (CompressImage) this.f94675c.get(), (Rx2ThreadService) this.f94676d.get(), (FileUtil) this.f94677e.get(), (OneErrorService) this.f94678f.get(), (PreferencesViewModel) this.f94679g.get(), (RtrRx2Repository) this.f94680h.get());
    }
}