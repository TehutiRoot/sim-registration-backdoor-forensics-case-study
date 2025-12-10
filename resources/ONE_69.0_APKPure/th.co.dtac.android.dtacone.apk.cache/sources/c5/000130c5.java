package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModelFactory_Factory implements Factory<OneConsentAndESignViewModelFactory> {

    /* renamed from: a */
    public final Provider f90987a;

    /* renamed from: b */
    public final Provider f90988b;

    /* renamed from: c */
    public final Provider f90989c;

    /* renamed from: d */
    public final Provider f90990d;

    /* renamed from: e */
    public final Provider f90991e;

    /* renamed from: f */
    public final Provider f90992f;

    public OneConsentAndESignViewModelFactory_Factory(Provider<OneConsentAndESignRepository> provider, Provider<BitmapUtil> provider2, Provider<FileUtil> provider3, Provider<RtrRx2Repository> provider4, Provider<PreferencesViewModel> provider5, Provider<ConfigurationRepository> provider6) {
        this.f90987a = provider;
        this.f90988b = provider2;
        this.f90989c = provider3;
        this.f90990d = provider4;
        this.f90991e = provider5;
        this.f90992f = provider6;
    }

    public static OneConsentAndESignViewModelFactory_Factory create(Provider<OneConsentAndESignRepository> provider, Provider<BitmapUtil> provider2, Provider<FileUtil> provider3, Provider<RtrRx2Repository> provider4, Provider<PreferencesViewModel> provider5, Provider<ConfigurationRepository> provider6) {
        return new OneConsentAndESignViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneConsentAndESignViewModelFactory newInstance(OneConsentAndESignRepository oneConsentAndESignRepository, BitmapUtil bitmapUtil, FileUtil fileUtil, RtrRx2Repository rtrRx2Repository, PreferencesViewModel preferencesViewModel, ConfigurationRepository configurationRepository) {
        return new OneConsentAndESignViewModelFactory(oneConsentAndESignRepository, bitmapUtil, fileUtil, rtrRx2Repository, preferencesViewModel, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneConsentAndESignViewModelFactory get() {
        return newInstance((OneConsentAndESignRepository) this.f90987a.get(), (BitmapUtil) this.f90988b.get(), (FileUtil) this.f90989c.get(), (RtrRx2Repository) this.f90990d.get(), (PreferencesViewModel) this.f90991e.get(), (ConfigurationRepository) this.f90992f.get());
    }
}