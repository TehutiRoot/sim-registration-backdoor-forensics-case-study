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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneChangeOwnerViewModel_Factory implements Factory<OneChangeOwnerViewModel> {

    /* renamed from: a */
    public final Provider f89433a;

    /* renamed from: b */
    public final Provider f89434b;

    /* renamed from: c */
    public final Provider f89435c;

    /* renamed from: d */
    public final Provider f89436d;

    /* renamed from: e */
    public final Provider f89437e;

    /* renamed from: f */
    public final Provider f89438f;

    /* renamed from: g */
    public final Provider f89439g;

    public OneChangeOwnerViewModel_Factory(Provider<OneChangeOwnerRepository> provider, Provider<OtpTransactionRepository> provider2, Provider<PreferencesViewModel> provider3, Provider<CompressImage> provider4, Provider<ConfigurationRepository> provider5, Provider<Rx2ThreadService> provider6, Provider<OneErrorService> provider7) {
        this.f89433a = provider;
        this.f89434b = provider2;
        this.f89435c = provider3;
        this.f89436d = provider4;
        this.f89437e = provider5;
        this.f89438f = provider6;
        this.f89439g = provider7;
    }

    public static OneChangeOwnerViewModel_Factory create(Provider<OneChangeOwnerRepository> provider, Provider<OtpTransactionRepository> provider2, Provider<PreferencesViewModel> provider3, Provider<CompressImage> provider4, Provider<ConfigurationRepository> provider5, Provider<Rx2ThreadService> provider6, Provider<OneErrorService> provider7) {
        return new OneChangeOwnerViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OneChangeOwnerViewModel newInstance(OneChangeOwnerRepository oneChangeOwnerRepository, OtpTransactionRepository otpTransactionRepository, PreferencesViewModel preferencesViewModel, CompressImage compressImage, ConfigurationRepository configurationRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneChangeOwnerViewModel(oneChangeOwnerRepository, otpTransactionRepository, preferencesViewModel, compressImage, configurationRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneChangeOwnerViewModel get() {
        return newInstance((OneChangeOwnerRepository) this.f89433a.get(), (OtpTransactionRepository) this.f89434b.get(), (PreferencesViewModel) this.f89435c.get(), (CompressImage) this.f89436d.get(), (ConfigurationRepository) this.f89437e.get(), (Rx2ThreadService) this.f89438f.get(), (OneErrorService) this.f89439g.get());
    }
}