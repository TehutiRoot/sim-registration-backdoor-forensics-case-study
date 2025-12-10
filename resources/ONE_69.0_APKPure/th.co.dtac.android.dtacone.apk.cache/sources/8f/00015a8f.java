package th.p047co.dtac.android.dtacone.viewmodel.online_store;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.online_store.AuthenticationOnlineStoreFactory_Factory */
/* loaded from: classes9.dex */
public final class AuthenticationOnlineStoreFactory_Factory implements Factory<AuthenticationOnlineStoreFactory> {

    /* renamed from: a */
    public final Provider f106966a;

    /* renamed from: b */
    public final Provider f106967b;

    /* renamed from: c */
    public final Provider f106968c;

    /* renamed from: d */
    public final Provider f106969d;

    public AuthenticationOnlineStoreFactory_Factory(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        this.f106966a = provider;
        this.f106967b = provider2;
        this.f106968c = provider3;
        this.f106969d = provider4;
    }

    public static AuthenticationOnlineStoreFactory_Factory create(Provider<RTRApiRx2> provider, Provider<Rx2ThreadService> provider2, Provider<ServerErrorService> provider3, Provider<RtrRepository> provider4) {
        return new AuthenticationOnlineStoreFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static AuthenticationOnlineStoreFactory newInstance(RTRApiRx2 rTRApiRx2, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, RtrRepository rtrRepository) {
        return new AuthenticationOnlineStoreFactory(rTRApiRx2, rx2ThreadService, serverErrorService, rtrRepository);
    }

    @Override // javax.inject.Provider
    public AuthenticationOnlineStoreFactory get() {
        return newInstance((RTRApiRx2) this.f106966a.get(), (Rx2ThreadService) this.f106967b.get(), (ServerErrorService) this.f106968c.get(), (RtrRepository) this.f106969d.get());
    }
}