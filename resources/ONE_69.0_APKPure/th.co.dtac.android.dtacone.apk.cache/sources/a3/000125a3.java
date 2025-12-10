package th.p047co.dtac.android.dtacone.presenter.stv;

import java.util.List;
import th.p047co.dtac.android.dtacone.model.stv.StvCollection;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPresenter */
/* loaded from: classes8.dex */
public interface StvPresenter extends IPresenter {

    /* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPresenter$InteractorStvView */
    /* loaded from: classes8.dex */
    public interface InteractorStvView extends IPresenter.IView, ILoadingViewable {
        void dismissRefreshingProgress();

        void displayPackage(List<StvCollection> list);

        void showError(String str);

        void showRefreshingProgress();
    }

    void callSTVList(boolean z);
}