package th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.util.FileUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository_Factory */
/* loaded from: classes8.dex */
public final class MrtrPrepaidMultiSimRepository_Factory implements Factory<MrtrPrepaidMultiSimRepository> {

    /* renamed from: a */
    public final Provider f86942a;

    /* renamed from: b */
    public final Provider f86943b;

    /* renamed from: c */
    public final Provider f86944c;

    public MrtrPrepaidMultiSimRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3) {
        this.f86942a = provider;
        this.f86943b = provider2;
        this.f86944c = provider3;
    }

    public static MrtrPrepaidMultiSimRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3) {
        return new MrtrPrepaidMultiSimRepository_Factory(provider, provider2, provider3);
    }

    public static MrtrPrepaidMultiSimRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil) {
        return new MrtrPrepaidMultiSimRepository(rTRApiRx2, rtrRx2Repository, fileUtil);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidMultiSimRepository get() {
        return newInstance((RTRApiRx2) this.f86942a.get(), (RtrRx2Repository) this.f86943b.get(), (FileUtil) this.f86944c.get());
    }
}