package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistValidateCardViewModelFactory_Factory implements Factory<MrtrPrepaidReregistValidateCardViewModelFactory> {

    /* renamed from: a */
    public final Provider f106858a;

    /* renamed from: b */
    public final Provider f106859b;

    /* renamed from: c */
    public final Provider f106860c;

    /* renamed from: d */
    public final Provider f106861d;

    /* renamed from: e */
    public final Provider f106862e;

    public MrtrPrepaidReregistValidateCardViewModelFactory_Factory(Provider<MrtrPrepaidReregistRepository> provider, Provider<ConfigurationRepository> provider2, Provider<BitmapUtil> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        this.f106858a = provider;
        this.f106859b = provider2;
        this.f106860c = provider3;
        this.f106861d = provider4;
        this.f106862e = provider5;
    }

    public static MrtrPrepaidReregistValidateCardViewModelFactory_Factory create(Provider<MrtrPrepaidReregistRepository> provider, Provider<ConfigurationRepository> provider2, Provider<BitmapUtil> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        return new MrtrPrepaidReregistValidateCardViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPrepaidReregistValidateCardViewModelFactory newInstance(MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository, ConfigurationRepository configurationRepository, BitmapUtil bitmapUtil, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidReregistValidateCardViewModelFactory(mrtrPrepaidReregistRepository, configurationRepository, bitmapUtil, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidReregistValidateCardViewModelFactory get() {
        return newInstance((MrtrPrepaidReregistRepository) this.f106858a.get(), (ConfigurationRepository) this.f106859b.get(), (BitmapUtil) this.f106860c.get(), (Rx2ThreadService) this.f106861d.get(), (MrtrErrorService) this.f106862e.get());
    }
}