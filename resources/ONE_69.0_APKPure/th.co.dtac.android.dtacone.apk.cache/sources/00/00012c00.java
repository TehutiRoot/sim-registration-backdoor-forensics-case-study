package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerValidateViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneChangeOwnerValidateViewModel_Factory implements Factory<OneChangeOwnerValidateViewModel> {

    /* renamed from: a */
    public final Provider f89374a;

    /* renamed from: b */
    public final Provider f89375b;

    /* renamed from: c */
    public final Provider f89376c;

    /* renamed from: d */
    public final Provider f89377d;

    /* renamed from: e */
    public final Provider f89378e;

    /* renamed from: f */
    public final Provider f89379f;

    public OneChangeOwnerValidateViewModel_Factory(Provider<OneChangeOwnerRepository> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesViewModel> provider3, Provider<BitmapUtil> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        this.f89374a = provider;
        this.f89375b = provider2;
        this.f89376c = provider3;
        this.f89377d = provider4;
        this.f89378e = provider5;
        this.f89379f = provider6;
    }

    public static OneChangeOwnerValidateViewModel_Factory create(Provider<OneChangeOwnerRepository> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesViewModel> provider3, Provider<BitmapUtil> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        return new OneChangeOwnerValidateViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneChangeOwnerValidateViewModel newInstance(OneChangeOwnerRepository oneChangeOwnerRepository, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, BitmapUtil bitmapUtil, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneChangeOwnerValidateViewModel(oneChangeOwnerRepository, configurationRepository, preferencesViewModel, bitmapUtil, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneChangeOwnerValidateViewModel get() {
        return newInstance((OneChangeOwnerRepository) this.f89374a.get(), (ConfigurationRepository) this.f89375b.get(), (PreferencesViewModel) this.f89376c.get(), (BitmapUtil) this.f89377d.get(), (Rx2ThreadService) this.f89378e.get(), (OneErrorService) this.f89379f.get());
    }
}