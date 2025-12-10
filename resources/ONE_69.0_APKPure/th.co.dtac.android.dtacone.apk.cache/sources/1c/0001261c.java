package th.p047co.dtac.android.dtacone.repository.login;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.repository.login.LoginRepository_Factory */
/* loaded from: classes8.dex */
public final class LoginRepository_Factory implements Factory<LoginRepository> {

    /* renamed from: a */
    public final Provider f86874a;

    /* renamed from: b */
    public final Provider f86875b;

    /* renamed from: c */
    public final Provider f86876c;

    /* renamed from: d */
    public final Provider f86877d;

    public LoginRepository_Factory(Provider<RTRApiRx2> provider, Provider<TemporaryCache> provider2, Provider<RtrRx2Repository> provider3, Provider<RtrRepository> provider4) {
        this.f86874a = provider;
        this.f86875b = provider2;
        this.f86876c = provider3;
        this.f86877d = provider4;
    }

    public static LoginRepository_Factory create(Provider<RTRApiRx2> provider, Provider<TemporaryCache> provider2, Provider<RtrRx2Repository> provider3, Provider<RtrRepository> provider4) {
        return new LoginRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static LoginRepository newInstance(RTRApiRx2 rTRApiRx2, TemporaryCache temporaryCache, RtrRx2Repository rtrRx2Repository, RtrRepository rtrRepository) {
        return new LoginRepository(rTRApiRx2, temporaryCache, rtrRx2Repository, rtrRepository);
    }

    @Override // javax.inject.Provider
    public LoginRepository get() {
        return newInstance((RTRApiRx2) this.f86874a.get(), (TemporaryCache) this.f86875b.get(), (RtrRx2Repository) this.f86876c.get(), (RtrRepository) this.f86877d.get());
    }
}