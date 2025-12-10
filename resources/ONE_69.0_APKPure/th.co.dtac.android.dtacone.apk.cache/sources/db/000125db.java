package th.p047co.dtac.android.dtacone.presenter.user_session;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.data.cache.realm.RtrRepository;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.user_session.SelfUpdatePermissionPresenter_Factory */
/* loaded from: classes8.dex */
public final class SelfUpdatePermissionPresenter_Factory implements Factory<SelfUpdatePermissionPresenter> {

    /* renamed from: a */
    public final Provider f86748a;

    public SelfUpdatePermissionPresenter_Factory(Provider<RtrRepository> provider) {
        this.f86748a = provider;
    }

    public static SelfUpdatePermissionPresenter_Factory create(Provider<RtrRepository> provider) {
        return new SelfUpdatePermissionPresenter_Factory(provider);
    }

    public static SelfUpdatePermissionPresenter newInstance(RtrRepository rtrRepository) {
        return new SelfUpdatePermissionPresenter(rtrRepository);
    }

    @Override // javax.inject.Provider
    public SelfUpdatePermissionPresenter get() {
        return newInstance((RtrRepository) this.f86748a.get());
    }
}