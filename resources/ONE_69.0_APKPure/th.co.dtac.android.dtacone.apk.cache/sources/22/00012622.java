package th.p047co.dtac.android.dtacone.repository.mrtr_mnp;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_mnp.MrtrMnpRepository_Factory */
/* loaded from: classes8.dex */
public final class MrtrMnpRepository_Factory implements Factory<MrtrMnpRepository> {

    /* renamed from: a */
    public final Provider f86894a;

    /* renamed from: b */
    public final Provider f86895b;

    /* renamed from: c */
    public final Provider f86896c;

    /* renamed from: d */
    public final Provider f86897d;

    /* renamed from: e */
    public final Provider f86898e;

    public MrtrMnpRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        this.f86894a = provider;
        this.f86895b = provider2;
        this.f86896c = provider3;
        this.f86897d = provider4;
        this.f86898e = provider5;
    }

    public static MrtrMnpRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        return new MrtrMnpRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrMnpRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil) {
        return new MrtrMnpRepository(rTRApiRx2, rtrRx2Repository, preferencesRepository, configurationRepository, fileUtil);
    }

    @Override // javax.inject.Provider
    public MrtrMnpRepository get() {
        return newInstance((RTRApiRx2) this.f86894a.get(), (RtrRx2Repository) this.f86895b.get(), (PreferencesRepository) this.f86896c.get(), (ConfigurationRepository) this.f86897d.get(), (FileUtil) this.f86898e.get());
    }
}