package th.p047co.dtac.android.dtacone.repository.esim;

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
/* renamed from: th.co.dtac.android.dtacone.repository.esim.ESimRepository_Factory */
/* loaded from: classes8.dex */
public final class ESimRepository_Factory implements Factory<ESimRepository> {

    /* renamed from: a */
    public final Provider f86852a;

    /* renamed from: b */
    public final Provider f86853b;

    /* renamed from: c */
    public final Provider f86854c;

    /* renamed from: d */
    public final Provider f86855d;

    /* renamed from: e */
    public final Provider f86856e;

    public ESimRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        this.f86852a = provider;
        this.f86853b = provider2;
        this.f86854c = provider3;
        this.f86855d = provider4;
        this.f86856e = provider5;
    }

    public static ESimRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        return new ESimRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ESimRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil) {
        return new ESimRepository(rTRApiRx2, rtrRx2Repository, preferencesRepository, configurationRepository, fileUtil);
    }

    @Override // javax.inject.Provider
    public ESimRepository get() {
        return newInstance((RTRApiRx2) this.f86852a.get(), (RtrRx2Repository) this.f86853b.get(), (PreferencesRepository) this.f86854c.get(), (ConfigurationRepository) this.f86855d.get(), (FileUtil) this.f86856e.get());
    }
}