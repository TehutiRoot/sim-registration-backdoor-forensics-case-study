package th.p047co.dtac.android.dtacone.presenter.stv;

import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvSubmitCollection;
import th.p047co.dtac.android.dtacone.model.stv.SubmitProsermRecommendReq;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IMixpanelTracker;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvConfirmPresenter */
/* loaded from: classes8.dex */
public interface StvConfirmPresenter extends IPresenter {

    /* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvConfirmPresenter$InteractorView */
    /* loaded from: classes8.dex */
    public interface InteractorView extends IPresenter.IView, ILoadingViewable, IMixpanelTracker {
        void clearPin();

        void onDuplicateStv(ErrorCollection errorCollection);

        void onRefreshStvList(ErrorCollection errorCollection);

        void onSubmitFail(ErrorCollection errorCollection);

        void onSubmitSuccess();
    }

    void submitNormalPack(StvSubmitCollection stvSubmitCollection, StvPackageCollection stvPackageCollection, String str, String str2);

    void submitProsermRecommend(StvSubmitCollection stvSubmitCollection, StvPackageCollection stvPackageCollection, String str, String str2, SubmitProsermRecommendReq submitProsermRecommendReq);
}