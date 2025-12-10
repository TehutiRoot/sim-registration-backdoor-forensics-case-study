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
/* renamed from: th.co.dtac.android.dtacone.presenter.runtime_permission.CameraPermissionPresenter_Factory */
/* loaded from: classes8.dex */
public final class CameraPermissionPresenter_Factory implements Factory<CameraPermissionPresenter> {

    /* renamed from: a */
    public final Provider f86402a;

    public CameraPermissionPresenter_Factory(Provider<RxPermissions> provider) {
        this.f86402a = provider;
    }

    public static CameraPermissionPresenter_Factory create(Provider<RxPermissions> provider) {
        return new CameraPermissionPresenter_Factory(provider);
    }

    public static CameraPermissionPresenter newInstance(RxPermissions rxPermissions) {
        return new CameraPermissionPresenter(rxPermissions);
    }

    @Override // javax.inject.Provider
    public CameraPermissionPresenter get() {
        return newInstance((RxPermissions) this.f86402a.get());
    }
}