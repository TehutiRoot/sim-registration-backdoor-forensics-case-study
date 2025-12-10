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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.change_pack.ChangePackViewModel_Factory */
/* loaded from: classes9.dex */
public final class ChangePackViewModel_Factory implements Factory<ChangePackViewModel> {

    /* renamed from: a */
    public final Provider f105188a;

    /* renamed from: b */
    public final Provider f105189b;

    /* renamed from: c */
    public final Provider f105190c;

    /* renamed from: d */
    public final Provider f105191d;

    public ChangePackViewModel_Factory(Provider<ChangePackRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        this.f105188a = provider;
        this.f105189b = provider2;
        this.f105190c = provider3;
        this.f105191d = provider4;
    }

    public static ChangePackViewModel_Factory create(Provider<ChangePackRepository> provider, Provider<RtrRx2Repository> provider2, Provider<Rx2ThreadService> provider3, Provider<MrtrErrorService> provider4) {
        return new ChangePackViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static ChangePackViewModel newInstance(ChangePackRepository changePackRepository, RtrRx2Repository rtrRx2Repository, Rx2ThreadService rx2ThreadService, MrtrErrorService mrtrErrorService) {
        return new ChangePackViewModel(changePackRepository, rtrRx2Repository, rx2ThreadService, mrtrErrorService);
    }

    @Override // javax.inject.Provider
    public ChangePackViewModel get() {
        return newInstance((ChangePackRepository) this.f105188a.get(), (RtrRx2Repository) this.f105189b.get(), (Rx2ThreadService) this.f105190c.get(), (MrtrErrorService) this.f105191d.get());
    }
}