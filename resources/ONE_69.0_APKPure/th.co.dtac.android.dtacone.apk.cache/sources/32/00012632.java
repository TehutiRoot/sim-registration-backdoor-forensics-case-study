package th.p047co.dtac.android.dtacone.repository.mrtr_prepaid;

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
/* renamed from: th.co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository_Factory */
/* loaded from: classes8.dex */
public final class MrtrPrepaidRepository_Factory implements Factory<MrtrPrepaidRepository> {

    /* renamed from: a */
    public final Provider f86935a;

    /* renamed from: b */
    public final Provider f86936b;

    /* renamed from: c */
    public final Provider f86937c;

    public MrtrPrepaidRepository_Factory(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3) {
        this.f86935a = provider;
        this.f86936b = provider2;
        this.f86937c = provider3;
    }

    public static MrtrPrepaidRepository_Factory create(Provider<RTRApiRx2> provider, Provider<RtrRx2Repository> provider2, Provider<FileUtil> provider3) {
        return new MrtrPrepaidRepository_Factory(provider, provider2, provider3);
    }

    public static MrtrPrepaidRepository newInstance(RTRApiRx2 rTRApiRx2, RtrRx2Repository rtrRx2Repository, FileUtil fileUtil) {
        return new MrtrPrepaidRepository(rTRApiRx2, rtrRx2Repository, fileUtil);
    }

    @Override // javax.inject.Provider
    public MrtrPrepaidRepository get() {
        return newInstance((RTRApiRx2) this.f86935a.get(), (RtrRx2Repository) this.f86936b.get(), (FileUtil) this.f86937c.get());
    }
}