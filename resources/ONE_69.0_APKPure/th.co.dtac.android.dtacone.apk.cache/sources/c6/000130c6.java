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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel_Factory implements Factory<OneConsentAndESignViewModel> {

    /* renamed from: a */
    public final Provider f90993a;

    /* renamed from: b */
    public final Provider f90994b;

    /* renamed from: c */
    public final Provider f90995c;

    /* renamed from: d */
    public final Provider f90996d;

    /* renamed from: e */
    public final Provider f90997e;

    /* renamed from: f */
    public final Provider f90998f;

    public OneConsentAndESignViewModel_Factory(Provider<OneConsentAndESignRepository> provider, Provider<BitmapUtil> provider2, Provider<FileUtil> provider3, Provider<RtrRx2Repository> provider4, Provider<PreferencesViewModel> provider5, Provider<ConfigurationRepository> provider6) {
        this.f90993a = provider;
        this.f90994b = provider2;
        this.f90995c = provider3;
        this.f90996d = provider4;
        this.f90997e = provider5;
        this.f90998f = provider6;
    }

    public static OneConsentAndESignViewModel_Factory create(Provider<OneConsentAndESignRepository> provider, Provider<BitmapUtil> provider2, Provider<FileUtil> provider3, Provider<RtrRx2Repository> provider4, Provider<PreferencesViewModel> provider5, Provider<ConfigurationRepository> provider6) {
        return new OneConsentAndESignViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static OneConsentAndESignViewModel newInstance(OneConsentAndESignRepository oneConsentAndESignRepository, BitmapUtil bitmapUtil, FileUtil fileUtil, RtrRx2Repository rtrRx2Repository, PreferencesViewModel preferencesViewModel, ConfigurationRepository configurationRepository) {
        return new OneConsentAndESignViewModel(oneConsentAndESignRepository, bitmapUtil, fileUtil, rtrRx2Repository, preferencesViewModel, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneConsentAndESignViewModel get() {
        return newInstance((OneConsentAndESignRepository) this.f90993a.get(), (BitmapUtil) this.f90994b.get(), (FileUtil) this.f90995c.get(), (RtrRx2Repository) this.f90996d.get(), (PreferencesViewModel) this.f90997e.get(), (ConfigurationRepository) this.f90998f.get());
    }
}