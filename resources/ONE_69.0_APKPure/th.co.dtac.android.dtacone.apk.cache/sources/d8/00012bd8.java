package th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository_Factory */
/* loaded from: classes10.dex */
public final class OneChangeOwnerRepository_Factory implements Factory<OneChangeOwnerRepository> {

    /* renamed from: a */
    public final Provider f89339a;

    /* renamed from: b */
    public final Provider f89340b;

    /* renamed from: c */
    public final Provider f89341c;

    /* renamed from: d */
    public final Provider f89342d;

    /* renamed from: e */
    public final Provider f89343e;

    public OneChangeOwnerRepository_Factory(Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<RtrRx2Repository> provider3, Provider<FileUtil> provider4, Provider<ConfigurationRepository> provider5) {
        this.f89339a = provider;
        this.f89340b = provider2;
        this.f89341c = provider3;
        this.f89342d = provider4;
        this.f89343e = provider5;
    }

    public static OneChangeOwnerRepository_Factory create(Provider<RTRApiRx2> provider, Provider<OneChangeOwnerApi> provider2, Provider<RtrRx2Repository> provider3, Provider<FileUtil> provider4, Provider<ConfigurationRepository> provider5) {
        return new OneChangeOwnerRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneChangeOwnerRepository newInstance(RTRApiRx2 rTRApiRx2, OneChangeOwnerApi oneChangeOwnerApi, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, ConfigurationRepository configurationRepository) {
        return new OneChangeOwnerRepository(rTRApiRx2, oneChangeOwnerApi, rtrRx2Repository, fileUtil, configurationRepository);
    }

    @Override // javax.inject.Provider
    public OneChangeOwnerRepository get() {
        return newInstance((RTRApiRx2) this.f89339a.get(), (OneChangeOwnerApi) this.f89340b.get(), (RtrRx2Repository) this.f89341c.get(), (FileUtil) this.f89342d.get(), (ConfigurationRepository) this.f89343e.get());
    }
}