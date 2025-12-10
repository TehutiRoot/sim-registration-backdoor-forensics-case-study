package th.p047co.dtac.android.dtacone.repository.mrtr_postpaid;

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
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository_Factory */
/* loaded from: classes8.dex */
public final class MrtrPostpaidRepository_Factory implements Factory<MrtrPostpaidRepository> {

    /* renamed from: a */
    public final Provider f86905a;

    /* renamed from: b */
    public final Provider f86906b;

    /* renamed from: c */
    public final Provider f86907c;

    /* renamed from: d */
    public final Provider f86908d;

    /* renamed from: e */
    public final Provider f86909e;

    public MrtrPostpaidRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        this.f86905a = provider;
        this.f86906b = provider2;
        this.f86907c = provider3;
        this.f86908d = provider4;
        this.f86909e = provider5;
    }

    public static MrtrPostpaidRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<PreferencesRepository> provider3, Provider<ConfigurationRepository> provider4, Provider<FileUtil> provider5) {
        return new MrtrPostpaidRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MrtrPostpaidRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, PreferencesRepository preferencesRepository, ConfigurationRepository configurationRepository, FileUtil fileUtil) {
        return new MrtrPostpaidRepository(rTRApiRx2, rtrRx2Repository, preferencesRepository, configurationRepository, fileUtil);
    }

    @Override // javax.inject.Provider
    public MrtrPostpaidRepository get() {
        return newInstance((RTRApiRx2) this.f86905a.get(), (RtrRx2Repository) this.f86906b.get(), (PreferencesRepository) this.f86907c.get(), (ConfigurationRepository) this.f86908d.get(), (FileUtil) this.f86909e.get());
    }
}