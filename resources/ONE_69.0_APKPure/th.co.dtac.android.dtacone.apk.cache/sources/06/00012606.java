package th.p047co.dtac.android.dtacone.repository.change_pack;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.model.change_pack.ChangePackModel;
import th.p047co.dtac.android.dtacone.model.change_pack.OfferPackageModel;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.change_pack.ChangePackRepository_Factory */
/* loaded from: classes8.dex */
public final class ChangePackRepository_Factory implements Factory<ChangePackRepository> {

    /* renamed from: a */
    public final Provider f86806a;

    /* renamed from: b */
    public final Provider f86807b;

    /* renamed from: c */
    public final Provider f86808c;

    /* renamed from: d */
    public final Provider f86809d;

    /* renamed from: e */
    public final Provider f86810e;

    public ChangePackRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<ChangePackModel> provider4, Provider<OfferPackageModel> provider5) {
        this.f86806a = provider;
        this.f86807b = provider2;
        this.f86808c = provider3;
        this.f86809d = provider4;
        this.f86810e = provider5;
    }

    public static ChangePackRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<ChangePackModel> provider4, Provider<OfferPackageModel> provider5) {
        return new ChangePackRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChangePackRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, ChangePackModel changePackModel, OfferPackageModel offerPackageModel) {
        return new ChangePackRepository(rTRApiRx2, rtrRx2Repository, configurationRepository, changePackModel, offerPackageModel);
    }

    @Override // javax.inject.Provider
    public ChangePackRepository get() {
        return newInstance((RTRApiRx2) this.f86806a.get(), (RtrRx2Repository) this.f86807b.get(), (ConfigurationRepository) this.f86808c.get(), (ChangePackModel) this.f86809d.get(), (OfferPackageModel) this.f86810e.get());
    }
}