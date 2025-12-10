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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel_Factory */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel_Factory implements Factory<OnePostpaidRegistrationViewModel> {

    /* renamed from: a */
    public final Provider f94681a;

    /* renamed from: b */
    public final Provider f94682b;

    /* renamed from: c */
    public final Provider f94683c;

    /* renamed from: d */
    public final Provider f94684d;

    /* renamed from: e */
    public final Provider f94685e;

    /* renamed from: f */
    public final Provider f94686f;

    /* renamed from: g */
    public final Provider f94687g;

    /* renamed from: h */
    public final Provider f94688h;

    public OnePostpaidRegistrationViewModel_Factory(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<FileUtil> provider5, Provider<OneErrorService> provider6, Provider<PreferencesViewModel> provider7, Provider<RtrRx2Repository> provider8) {
        this.f94681a = provider;
        this.f94682b = provider2;
        this.f94683c = provider3;
        this.f94684d = provider4;
        this.f94685e = provider5;
        this.f94686f = provider6;
        this.f94687g = provider7;
        this.f94688h = provider8;
    }

    public static OnePostpaidRegistrationViewModel_Factory create(Provider<OnePostpaidRepository> provider, Provider<ConfigurationRepository> provider2, Provider<CompressImage> provider3, Provider<Rx2ThreadService> provider4, Provider<FileUtil> provider5, Provider<OneErrorService> provider6, Provider<PreferencesViewModel> provider7, Provider<RtrRx2Repository> provider8) {
        return new OnePostpaidRegistrationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static OnePostpaidRegistrationViewModel newInstance(OnePostpaidRepository onePostpaidRepository, ConfigurationRepository configurationRepository, CompressImage compressImage, Rx2ThreadService rx2ThreadService, FileUtil fileUtil, OneErrorService oneErrorService, PreferencesViewModel preferencesViewModel, RtrRx2Repository rtrRx2Repository) {
        return new OnePostpaidRegistrationViewModel(onePostpaidRepository, configurationRepository, compressImage, rx2ThreadService, fileUtil, oneErrorService, preferencesViewModel, rtrRx2Repository);
    }

    @Override // javax.inject.Provider
    public OnePostpaidRegistrationViewModel get() {
        return newInstance((OnePostpaidRepository) this.f94681a.get(), (ConfigurationRepository) this.f94682b.get(), (CompressImage) this.f94683c.get(), (Rx2ThreadService) this.f94684d.get(), (FileUtil) this.f94685e.get(), (OneErrorService) this.f94686f.get(), (PreferencesViewModel) this.f94687g.get(), (RtrRx2Repository) this.f94688h.get());
    }
}