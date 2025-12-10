package th.p047co.dtac.android.dtacone.presenter.topup;

import th.p047co.dtac.android.dtacone.model.topup.BalanceCollection;
import th.p047co.dtac.android.dtacone.model.topup.TopUpCollection;
import th.p047co.dtac.android.dtacone.model.topup.offer.TopupOfferResponse;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IMixpanelTracker;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.topup.TopUpPresenter */
/* loaded from: classes8.dex */
public interface TopUpPresenter extends IPresenter {

    /* renamed from: th.co.dtac.android.dtacone.presenter.topup.TopUpPresenter$InteractorTopUpView */
    /* loaded from: classes8.dex */
    public interface InteractorTopUpView extends IPresenter.IView, ILoadingViewable, IMixpanelTracker {
        void onTopUpError();

        void onTopUpSuccess(BalanceCollection balanceCollection);
    }

    void callTopUp(TopUpCollection topUpCollection, TopupOfferResponse topupOfferResponse);
}