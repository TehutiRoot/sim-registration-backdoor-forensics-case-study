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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModel_Factory */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistValidateCardViewModel_Factory implements Factory<MrtrPrepaidReregistValidateCardViewModel> {

    /* renamed from: a */
    public final Provider f106863a;

    /* renamed from: b */
    public final Provider f106864b;

    /* renamed from: c */
    public final Provider f106865c;

    /* renamed from: d */
    public final Provider f106866d;

    /* renamed from: e */
    public final Provider f106867e;

    public MrtrPrepaidReregistValidateCardViewModel_Factory(Provider<MrtrPrepaidReregistRepository> provider, Provider<ConfigurationRepository> provider2, Provider<BitmapUtil> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        this.f106863a = provider;
        this.f106864b = provider2;
        this.f106865c = provider3;
        this.f106866d = provider4;
        this.f106867e = provider5;
    }

    public static MrtrPrepaidReregistValidateCardViewModel_Factory create(Provider<MrtrPrepaidReregistRepository> provider, Provider<ConfigurationRepository> provider2, Provider<BitmapUtil> provider3, Provider<Rx2ThreadService> provider4, Provider<MrtrErrorService> provider5) {
        return new MrtrPrepaidReregistValidateCardViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPrepaidReregistValidateCardViewModel newInstance(MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository, ConfigurationRepository configurationRepository, BitmapUtil bitmapUtil, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new MrtrPrepaidReregistValidateCardViewModel(mrtrPrepaidReregistRepository, configurationRepository, bitmapUtil, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidReregistValidateCardViewModel get() {
        return newInstance((MrtrPrepaidReregistRepository) this.f106863a.get(), (ConfigurationRepository) this.f106864b.get(), (BitmapUtil) this.f106865c.get(), (Rx2ThreadService) this.f106866d.get(), (MrtrErrorService) this.f106867e.get());
    }
}