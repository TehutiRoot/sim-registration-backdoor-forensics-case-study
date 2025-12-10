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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneStaffViewModelFactory_Factory implements Factory<OneStaffViewModelFactory> {

    /* renamed from: a */
    public final Provider f97497a;

    /* renamed from: b */
    public final Provider f97498b;

    /* renamed from: c */
    public final Provider f97499c;

    public OneStaffViewModelFactory_Factory(Provider<OneStaffRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        this.f97497a = provider;
        this.f97498b = provider2;
        this.f97499c = provider3;
    }

    public static OneStaffViewModelFactory_Factory create(Provider<OneStaffRepository> provider, Provider<Rx2ThreadService> provider2, Provider<OneErrorService> provider3) {
        return new OneStaffViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static OneStaffViewModelFactory newInstance(OneStaffRepository oneStaffRepository, Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService) {
        return new OneStaffViewModelFactory(oneStaffRepository, rx2ThreadService, oneErrorService);
    }

    @Override // javax.inject.Provider
    public OneStaffViewModelFactory get() {
        return newInstance((OneStaffRepository) this.f97497a.get(), (Rx2ThreadService) this.f97498b.get(), (OneErrorService) this.f97499c.get());
    }
}