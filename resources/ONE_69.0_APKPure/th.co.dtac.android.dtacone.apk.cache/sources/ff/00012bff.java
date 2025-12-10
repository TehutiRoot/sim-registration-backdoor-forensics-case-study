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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerValidateViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneChangeOwnerValidateViewModelFactory_Factory implements Factory<OneChangeOwnerValidateViewModelFactory> {

    /* renamed from: a */
    public final Provider f89368a;

    /* renamed from: b */
    public final Provider f89369b;

    /* renamed from: c */
    public final Provider f89370c;

    /* renamed from: d */
    public final Provider f89371d;

    /* renamed from: e */
    public final Provider f89372e;

    /* renamed from: f */
    public final Provider f89373f;

    public OneChangeOwnerValidateViewModelFactory_Factory(Provider<OneChangeOwnerRepository> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesViewModel> provider3, Provider<BitmapUtil> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        this.f89368a = provider;
        this.f89369b = provider2;
        this.f89370c = provider3;
        this.f89371d = provider4;
        this.f89372e = provider5;
        this.f89373f = provider6;
    }

    public static OneChangeOwnerValidateViewModelFactory_Factory create(Provider<OneChangeOwnerRepository> provider, Provider<ConfigurationRepository> provider2, Provider<PreferencesViewModel> provider3, Provider<BitmapUtil> provider4, Provider<Rx2ThreadService> provider5, Provider<OneErrorService> provider6) {
        return new OneChangeOwnerValidateViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneChangeOwnerValidateViewModelFactory newInstance(OneChangeOwnerRepository oneChangeOwnerRepository, ConfigurationRepository configurationRepository, PreferencesViewModel preferencesViewModel, BitmapUtil bitmapUtil, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneChangeOwnerValidateViewModelFactory(oneChangeOwnerRepository, configurationRepository, preferencesViewModel, bitmapUtil, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneChangeOwnerValidateViewModelFactory get() {
        return newInstance((OneChangeOwnerRepository) this.f89368a.get(), (ConfigurationRepository) this.f89369b.get(), (PreferencesViewModel) this.f89370c.get(), (BitmapUtil) this.f89371d.get(), (Rx2ThreadService) this.f89372e.get(), (OneErrorService) this.f89373f.get());
    }
}