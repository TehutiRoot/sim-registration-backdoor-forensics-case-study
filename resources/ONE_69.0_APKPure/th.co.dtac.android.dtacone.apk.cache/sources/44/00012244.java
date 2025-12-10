package th.p047co.dtac.android.dtacone.presenter.buy_dol;

import com.tbruyelle.rxpermissions2.RxPermissions;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.PermissionManager;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.presenter.buy_dol.BuyDolSaveBillPresenter_Factory */
/* loaded from: classes8.dex */
public final class BuyDolSaveBillPresenter_Factory implements Factory<BuyDolSaveBillPresenter> {

    /* renamed from: a */
    public final Provider f85479a;

    /* renamed from: b */
    public final Provider f85480b;

    public BuyDolSaveBillPresenter_Factory(Provider<RxPermissions> provider, Provider<PermissionManager> provider2) {
        this.f85479a = provider;
        this.f85480b = provider2;
    }

    public static BuyDolSaveBillPresenter_Factory create(Provider<RxPermissions> provider, Provider<PermissionManager> provider2) {
        return new BuyDolSaveBillPresenter_Factory(provider, provider2);
    }

    public static BuyDolSaveBillPresenter newInstance(RxPermissions rxPermissions, PermissionManager permissionManager) {
        return new BuyDolSaveBillPresenter(rxPermissions, permissionManager);
    }

    @Override // javax.inject.Provider
    public BuyDolSaveBillPresenter get() {
        return newInstance((RxPermissions) this.f85479a.get(), (PermissionManager) this.f85480b.get());
    }
}