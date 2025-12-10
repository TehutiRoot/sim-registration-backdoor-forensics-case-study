package th.p047co.dtac.android.dtacone.viewmodel.change_pack;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.repository.change_pack.ChangePackRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_pack.ChangePackViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class ChangePackViewModelFactory_Factory implements Factory<ChangePackViewModelFactory> {

    /* renamed from: a */
    public final Provider f105184a;

    /* renamed from: b */
    public final Provider f105185b;

    /* renamed from: c */
    public final Provider f105186c;

    /* renamed from: d */
    public final Provider f105187d;

    public ChangePackViewModelFactory_Factory(Provider<ChangePackRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f105184a = provider;
        this.f105185b = provider2;
        this.f105186c = provider3;
        this.f105187d = provider4;
    }

    public static ChangePackViewModelFactory_Factory create(Provider<ChangePackRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new ChangePackViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static ChangePackViewModelFactory newInstance(ChangePackRepository changePackRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new ChangePackViewModelFactory(changePackRepository, rtrRx2Repository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public ChangePackViewModelFactory get() {
        return newInstance((ChangePackRepository) this.f105184a.get(), (RtrRx2Repository) this.f105185b.get(), (Rx2ThreadService) this.f105186c.get(), (MrtrErrorService) this.f105187d.get());
    }
}