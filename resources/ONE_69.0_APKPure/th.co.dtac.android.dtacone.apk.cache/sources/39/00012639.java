package th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository_Factory */
/* loaded from: classes8.dex */
public final class MrtrPrepaidReregistRepository_Factory implements Factory<MrtrPrepaidReregistRepository> {

    /* renamed from: a */
    public final Provider f86951a;

    /* renamed from: b */
    public final Provider f86952b;

    /* renamed from: c */
    public final Provider f86953c;

    /* renamed from: d */
    public final Provider f86954d;

    public MrtrPrepaidReregistRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4) {
        this.f86951a = provider;
        this.f86952b = provider2;
        this.f86953c = provider3;
        this.f86954d = provider4;
    }

    public static MrtrPrepaidReregistRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3, Provider<ConfigurationRepository> provider4) {
        return new MrtrPrepaidReregistRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrPrepaidReregistRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil, ConfigurationRepository configurationRepository) {
        return new MrtrPrepaidReregistRepository(rTRApiRx2, rtrRx2Repository, fileUtil, configurationRepository);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidReregistRepository get() {
        return newInstance((RTRApiRx2) this.f86951a.get(), (RtrRx2Repository) this.f86952b.get(), (FileUtil) this.f86953c.get(), (ConfigurationRepository) this.f86954d.get());
    }
}