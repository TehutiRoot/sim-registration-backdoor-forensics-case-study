package th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.staff.repository.OneStaffRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneStaffViewModel_Factory implements Factory<OneStaffViewModel> {

    /* renamed from: a */
    public final Provider f97500a;

    /* renamed from: b */
    public final Provider f97501b;

    /* renamed from: c */
    public final Provider f97502c;

    public OneStaffViewModel_Factory(Provider<OneStaffRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f97500a = provider;
        this.f97501b = provider2;
        this.f97502c = provider3;
    }

    public static OneStaffViewModel_Factory create(Provider<OneStaffRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OneStaffViewModel_Factory(provider, provider2, provider3);
    }

    public static OneStaffViewModel newInstance(OneStaffRepository oneStaffRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneStaffViewModel(oneStaffRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneStaffViewModel get() {
        return newInstance((OneStaffRepository) this.f97500a.get(), (Rx2ThreadService) this.f97501b.get(), (OneErrorService) this.f97502c.get());
    }
}