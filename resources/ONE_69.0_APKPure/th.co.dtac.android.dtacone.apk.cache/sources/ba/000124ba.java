package th.p047co.dtac.android.dtacone.presenter.register;

import th.p047co.dtac.android.dtacone.model.RegisterOwnerCollection;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.register.RegisterOwnerPresenter */
/* loaded from: classes8.dex */
public interface RegisterOwnerPresenter extends IPresenter {

    /* renamed from: th.co.dtac.android.dtacone.presenter.register.RegisterOwnerPresenter$InteractorView */
    /* loaded from: classes8.dex */
    public interface InteractorView extends IPresenter.IView, ILoadingViewable {
        void onRegisterOwnerFail();

        void onRegisterOwnerSuccess(RegisterOwnerCollection registerOwnerCollection);
    }

    void callRegisterOwner(RegisterOwnerCollection registerOwnerCollection);
}