package th.p047co.dtac.android.dtacone.view.appOne.notification.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.view.appOne.notification.repository.OneNewsNotificationRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.notification.viewmodel.OneNewsNotificationViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneNewsNotificationViewModel_Factory implements Factory<OneNewsNotificationViewModel> {

    /* renamed from: a */
    public final Provider f92490a;

    /* renamed from: b */
    public final Provider f92491b;

    /* renamed from: c */
    public final Provider f92492c;

    /* renamed from: d */
    public final Provider f92493d;

    /* renamed from: e */
    public final Provider f92494e;

    public OneNewsNotificationViewModel_Factory(Provider<Rx2ThreadService> provider, Provider<OneErrorService> provider2, Provider<RtrRepository> provider3, Provider<RtrRx2Repository> provider4, Provider<OneNewsNotificationRepository> provider5) {
        this.f92490a = provider;
        this.f92491b = provider2;
        this.f92492c = provider3;
        this.f92493d = provider4;
        this.f92494e = provider5;
    }

    public static OneNewsNotificationViewModel_Factory create(Provider<Rx2ThreadService> provider, Provider<OneErrorService> provider2, Provider<RtrRepository> provider3, Provider<RtrRx2Repository> provider4, Provider<OneNewsNotificationRepository> provider5) {
        return new OneNewsNotificationViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneNewsNotificationViewModel newInstance(Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository, OneNewsNotificationRepository oneNewsNotificationRepository) {
        return new OneNewsNotificationViewModel(rx2ThreadService, oneErrorService, rtrRepository, rtrRx2Repository, oneNewsNotificationRepository);
    }

    @Override // javax.inject.Provider
    public OneNewsNotificationViewModel get() {
        return newInstance((Rx2ThreadService) this.f92490a.get(), (OneErrorService) this.f92491b.get(), (RtrRepository) this.f92492c.get(), (RtrRx2Repository) this.f92493d.get(), (OneNewsNotificationRepository) this.f92494e.get());
    }
}