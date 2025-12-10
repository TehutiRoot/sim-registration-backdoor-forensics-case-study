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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.notification.viewmodel.OneNewsNotificationViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneNewsNotificationViewModelFactory_Factory implements Factory<OneNewsNotificationViewModelFactory> {

    /* renamed from: a */
    public final Provider f92485a;

    /* renamed from: b */
    public final Provider f92486b;

    /* renamed from: c */
    public final Provider f92487c;

    /* renamed from: d */
    public final Provider f92488d;

    /* renamed from: e */
    public final Provider f92489e;

    public OneNewsNotificationViewModelFactory_Factory(Provider<Rx2ThreadService> provider, Provider<OneErrorService> provider2, Provider<RtrRepository> provider3, Provider<RtrRx2Repository> provider4, Provider<OneNewsNotificationRepository> provider5) {
        this.f92485a = provider;
        this.f92486b = provider2;
        this.f92487c = provider3;
        this.f92488d = provider4;
        this.f92489e = provider5;
    }

    public static OneNewsNotificationViewModelFactory_Factory create(Provider<Rx2ThreadService> provider, Provider<OneErrorService> provider2, Provider<RtrRepository> provider3, Provider<RtrRx2Repository> provider4, Provider<OneNewsNotificationRepository> provider5) {
        return new OneNewsNotificationViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OneNewsNotificationViewModelFactory newInstance(Rx2ThreadService rx2ThreadService, OneErrorService oneErrorService, RtrRepository rtrRepository, RtrRx2Repository rtrRx2Repository, OneNewsNotificationRepository oneNewsNotificationRepository) {
        return new OneNewsNotificationViewModelFactory(rx2ThreadService, oneErrorService, rtrRepository, rtrRx2Repository, oneNewsNotificationRepository);
    }

    @Override // javax.inject.Provider
    public OneNewsNotificationViewModelFactory get() {
        return newInstance((Rx2ThreadService) this.f92485a.get(), (OneErrorService) this.f92486b.get(), (RtrRepository) this.f92487c.get(), (RtrRx2Repository) this.f92488d.get(), (OneNewsNotificationRepository) this.f92489e.get());
    }
}