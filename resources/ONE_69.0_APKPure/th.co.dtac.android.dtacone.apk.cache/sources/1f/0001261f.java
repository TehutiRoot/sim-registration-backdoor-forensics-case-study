package th.p047co.dtac.android.dtacone.repository.mrtr_change_sim;

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
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository_Factory */
/* loaded from: classes8.dex */
public final class MrtrChangeSimRepository_Factory implements Factory<MrtrChangeSimRepository> {

    /* renamed from: a */
    public final Provider f86884a;

    /* renamed from: b */
    public final Provider f86885b;

    /* renamed from: c */
    public final Provider f86886c;

    /* renamed from: d */
    public final Provider f86887d;

    public MrtrChangeSimRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<FileUtil> provider4) {
        this.f86884a = provider;
        this.f86885b = provider2;
        this.f86886c = provider3;
        this.f86887d = provider4;
    }

    public static MrtrChangeSimRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<ConfigurationRepository> provider3, Provider<FileUtil> provider4) {
        return new MrtrChangeSimRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static MrtrChangeSimRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, ConfigurationRepository configurationRepository, FileUtil fileUtil) {
        return new MrtrChangeSimRepository(rTRApiRx2, rtrRx2Repository, configurationRepository, fileUtil);
    }

    @Override // javax.inject.Provider
    public MrtrChangeSimRepository get() {
        return newInstance((RTRApiRx2) this.f86884a.get(), (RtrRx2Repository) this.f86885b.get(), (ConfigurationRepository) this.f86886c.get(), (FileUtil) this.f86887d.get());
    }
}