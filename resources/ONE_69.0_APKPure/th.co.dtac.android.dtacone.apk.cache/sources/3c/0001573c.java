package th.p047co.dtac.android.dtacone.viewmodel.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.manager.service.UdidService;
import th.p047co.dtac.android.dtacone.repository.home.HomeRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.GetProfileImageViewModel_Factory */
/* loaded from: classes9.dex */
public final class GetProfileImageViewModel_Factory implements Factory<GetProfileImageViewModel> {

    /* renamed from: a */
    public final Provider f105978a;

    /* renamed from: b */
    public final Provider f105979b;

    /* renamed from: c */
    public final Provider f105980c;

    /* renamed from: d */
    public final Provider f105981d;

    /* renamed from: e */
    public final Provider f105982e;

    /* renamed from: f */
    public final Provider f105983f;

    /* renamed from: g */
    public final Provider f105984g;

    public GetProfileImageViewModel_Factory(Provider<HomeRepository> provider, Provider<PreferencesRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<ServerErrorService> provider4, Provider<OneErrorService> provider5, Provider<RtrRx2Repository> provider6, Provider<UdidService> provider7) {
        this.f105978a = provider;
        this.f105979b = provider2;
        this.f105980c = provider3;
        this.f105981d = provider4;
        this.f105982e = provider5;
        this.f105983f = provider6;
        this.f105984g = provider7;
    }

    public static GetProfileImageViewModel_Factory create(Provider<HomeRepository> provider, Provider<PreferencesRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<ServerErrorService> provider4, Provider<OneErrorService> provider5, Provider<RtrRx2Repository> provider6, Provider<UdidService> provider7) {
        return new GetProfileImageViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static GetProfileImageViewModel newInstance(HomeRepository homeRepository, PreferencesRepository preferencesRepository, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, OneErrorService oneErrorService, RtrRx2Repository rtrRx2Repository, UdidService udidService) {
        return new GetProfileImageViewModel(homeRepository, preferencesRepository, rx2ThreadService, serverErrorService, oneErrorService, rtrRx2Repository, udidService);
    }

    @Override // javax.inject.Provider
    public GetProfileImageViewModel get() {
        return newInstance((HomeRepository) this.f105978a.get(), (PreferencesRepository) this.f105979b.get(), (Rx2ThreadService) this.f105980c.get(), (ServerErrorService) this.f105981d.get(), (OneErrorService) this.f105982e.get(), (RtrRx2Repository) this.f105983f.get(), (UdidService) this.f105984g.get());
    }
}