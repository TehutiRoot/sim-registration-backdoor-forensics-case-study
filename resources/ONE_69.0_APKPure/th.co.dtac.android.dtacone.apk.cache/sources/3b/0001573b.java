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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.GetProfileImageViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class GetProfileImageViewModelFactory_Factory implements Factory<GetProfileImageViewModelFactory> {

    /* renamed from: a */
    public final Provider f105971a;

    /* renamed from: b */
    public final Provider f105972b;

    /* renamed from: c */
    public final Provider f105973c;

    /* renamed from: d */
    public final Provider f105974d;

    /* renamed from: e */
    public final Provider f105975e;

    /* renamed from: f */
    public final Provider f105976f;

    /* renamed from: g */
    public final Provider f105977g;

    public GetProfileImageViewModelFactory_Factory(Provider<HomeRepository> provider, Provider<PreferencesRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<ServerErrorService> provider4, Provider<OneErrorService> provider5, Provider<RtrRx2Repository> provider6, Provider<UdidService> provider7) {
        this.f105971a = provider;
        this.f105972b = provider2;
        this.f105973c = provider3;
        this.f105974d = provider4;
        this.f105975e = provider5;
        this.f105976f = provider6;
        this.f105977g = provider7;
    }

    public static GetProfileImageViewModelFactory_Factory create(Provider<HomeRepository> provider, Provider<PreferencesRepository> provider2, Provider<Rx2ThreadService> provider3, Provider<ServerErrorService> provider4, Provider<OneErrorService> provider5, Provider<RtrRx2Repository> provider6, Provider<UdidService> provider7) {
        return new GetProfileImageViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static GetProfileImageViewModelFactory newInstance(HomeRepository homeRepository, PreferencesRepository preferencesRepository, Rx2ThreadService rx2ThreadService, ServerErrorService serverErrorService, OneErrorService oneErrorService, RtrRx2Repository rtrRx2Repository, UdidService udidService) {
        return new GetProfileImageViewModelFactory(homeRepository, preferencesRepository, rx2ThreadService, serverErrorService, oneErrorService, rtrRx2Repository, udidService);
    }

    @Override // javax.inject.Provider
    public GetProfileImageViewModelFactory get() {
        return newInstance((HomeRepository) this.f105971a.get(), (PreferencesRepository) this.f105972b.get(), (Rx2ThreadService) this.f105973c.get(), (ServerErrorService) this.f105974d.get(), (OneErrorService) this.f105975e.get(), (RtrRx2Repository) this.f105976f.get(), (UdidService) this.f105977g.get());
    }
}