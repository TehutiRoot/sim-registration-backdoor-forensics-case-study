package th.p047co.dtac.android.dtacone.presenter.runtime_permission;

import com.tbruyelle.rxpermissions2.RxPermissions;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.runtime_permission.CallPermissionPresenter_Factory */
/* loaded from: classes8.dex */
public final class CallPermissionPresenter_Factory implements Factory<CallPermissionPresenter> {

    /* renamed from: a */
    public final Provider f86398a;

    public CallPermissionPresenter_Factory(Provider<RxPermissions> provider) {
        this.f86398a = provider;
    }

    public static CallPermissionPresenter_Factory create(Provider<RxPermissions> provider) {
        return new CallPermissionPresenter_Factory(provider);
    }

    public static CallPermissionPresenter newInstance(RxPermissions rxPermissions) {
        return new CallPermissionPresenter(rxPermissions);
    }

    @Override // javax.inject.Provider
    public CallPermissionPresenter get() {
        return newInstance((RxPermissions) this.f86398a.get());
    }
}