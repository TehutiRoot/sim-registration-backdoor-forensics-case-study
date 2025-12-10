package th.p047co.dtac.android.dtacone.presenter;

/* renamed from: th.co.dtac.android.dtacone.presenter.IPresenter */
/* loaded from: classes8.dex */
public interface IPresenter {

    /* renamed from: th.co.dtac.android.dtacone.presenter.IPresenter$IView */
    /* loaded from: classes8.dex */
    public interface IView {
    }

    void attachView(IView iView);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}