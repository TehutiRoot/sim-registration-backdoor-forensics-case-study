package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.compressor.CompressImage;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.otp_transaction.OtpTransactionRepository;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneChangeOwnerViewModelFactory_Factory implements Factory<OneChangeOwnerViewModelFactory> {

    /* renamed from: a */
    public final Provider f89426a;

    /* renamed from: b */
    public final Provider f89427b;

    /* renamed from: c */
    public final Provider f89428c;

    /* renamed from: d */
    public final Provider f89429d;

    /* renamed from: e */
    public final Provider f89430e;

    /* renamed from: f */
    public final Provider f89431f;

    /* renamed from: g */
    public final Provider f89432g;

    public OneChangeOwnerViewModelFactory_Factory(Provider<OneChangeOwnerRepository> provider, Provider<OtpTransactionRepository> provider2, Provider<PreferencesViewModel> provider3, Provider<CompressImage> provider4, Provider<ConfigurationRepository> provider5, Provider<Rx2ThreadService> provider6, Provider<OneErrorService> provider7) {
        this.f89426a = provider;
        this.f89427b = provider2;
        this.f89428c = provider3;
        this.f89429d = provider4;
        this.f89430e = provider5;
        this.f89431f = provider6;
        this.f89432g = provider7;
    }

    public static OneChangeOwnerViewModelFactory_Factory create(Provider<OneChangeOwnerRepository> provider, Provider<OtpTransactionRepository> provider2, Provider<PreferencesViewModel> provider3, Provider<CompressImage> provider4, Provider<ConfigurationRepository> provider5, Provider<Rx2ThreadService> provider6, Provider<OneErrorService> provider7) {
        return new OneChangeOwnerViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OneChangeOwnerViewModelFactory newInstance(OneChangeOwnerRepository oneChangeOwnerRepository, OtpTransactionRepository otpTransactionRepository, PreferencesViewModel preferencesViewModel, CompressImage compressImage, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneChangeOwnerViewModelFactory(oneChangeOwnerRepository, otpTransactionRepository, preferencesViewModel, compressImage, configurationRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneChangeOwnerViewModelFactory get() {
        return newInstance((OneChangeOwnerRepository) this.f89426a.get(), (OtpTransactionRepository) this.f89427b.get(), (PreferencesViewModel) this.f89428c.get(), (CompressImage) this.f89429d.get(), (ConfigurationRepository) this.f89430e.get(), (Rx2ThreadService) this.f89431f.get(), (OneErrorService) this.f89432g.get());
    }
}