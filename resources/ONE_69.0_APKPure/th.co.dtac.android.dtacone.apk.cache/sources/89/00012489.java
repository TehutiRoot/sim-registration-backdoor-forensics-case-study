package th.p047co.dtac.android.dtacone.presenter.prepaid;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import p046rx.Observable;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.prepaid.PreviewIdCardPresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Deprecated
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PreviewIdCardPresenter */
/* loaded from: classes8.dex */
public class PreviewIdCardPresenter extends LifecyclePresenter {

    /* renamed from: a */
    public CompositeSubscription f86238a = new CompositeSubscription();

    /* renamed from: b */
    public RxThreadService f86239b;

    /* renamed from: c */
    public View f86240c;

    /* renamed from: d */
    public BitmapUtil f86241d;

    /* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.PreviewIdCardPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends ILoadingViewable, IPresenter.IView {
        void onError(String str);

        void onLoadIdCardSuccess(byte[] bArr);
    }

    @Inject
    public PreviewIdCardPresenter(RxThreadService rxThreadService, BitmapUtil bitmapUtil) {
        this.f86239b = rxThreadService;
        this.f86241d = bitmapUtil;
    }

    /* renamed from: a */
    public static /* synthetic */ void m17592a(PreviewIdCardPresenter previewIdCardPresenter, byte[] bArr) {
        previewIdCardPresenter.m17583j(bArr);
    }

    /* renamed from: b */
    public static /* synthetic */ void m17591b(PreviewIdCardPresenter previewIdCardPresenter) {
        previewIdCardPresenter.m17584i();
    }

    /* renamed from: c */
    public static /* synthetic */ void m17590c(PreviewIdCardPresenter previewIdCardPresenter, Throwable th2) {
        previewIdCardPresenter.m17582k(th2);
    }

    /* renamed from: d */
    public static /* synthetic */ Bitmap m17589d(PreviewIdCardPresenter previewIdCardPresenter) {
        return previewIdCardPresenter.m17586g();
    }

    /* renamed from: e */
    public static /* synthetic */ byte[] m17588e(PreviewIdCardPresenter previewIdCardPresenter, Bitmap bitmap) {
        return previewIdCardPresenter.m17585h(bitmap);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(IPresenter.IView iView) {
        this.f86240c = (View) iView;
    }

    /* renamed from: f */
    public final Observable m17587f() {
        return Observable.fromCallable(new Callable() { // from class: Yn1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PreviewIdCardPresenter.m17589d(PreviewIdCardPresenter.this);
            }
        });
    }

    /* renamed from: g */
    public final /* synthetic */ Bitmap m17586g() {
        return this.f86241d.rotateExistImage(BitmapUtil.IMAGE_ID_CARD);
    }

    /* renamed from: h */
    public final /* synthetic */ byte[] m17585h(Bitmap bitmap) {
        return this.f86241d.cropImage(bitmap);
    }

    /* renamed from: i */
    public final /* synthetic */ void m17584i() {
        this.f86240c.dismissLoading();
    }

    /* renamed from: j */
    public final /* synthetic */ void m17583j(byte[] bArr) {
        this.f86240c.onLoadIdCardSuccess(bArr);
    }

    /* renamed from: k */
    public final /* synthetic */ void m17582k(Throwable th2) {
        this.f86240c.onError(th2.getMessage());
    }

    public void loadIdCard() {
        this.f86240c.showLoading();
        this.f86238a.add(m17587f().map(new Func1() { // from class: Un1
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                return PreviewIdCardPresenter.m17588e(PreviewIdCardPresenter.this, (Bitmap) obj);
            }
        }).compose(this.f86239b.applyAsync()).doOnTerminate(new Action0() { // from class: Vn1
            @Override // p046rx.functions.Action0
            public final void call() {
                PreviewIdCardPresenter.m17591b(PreviewIdCardPresenter.this);
            }
        }).subscribe(new Action1() { // from class: Wn1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                PreviewIdCardPresenter.m17592a(PreviewIdCardPresenter.this, (byte[]) obj);
            }
        }, new Action1() { // from class: Xn1
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                PreviewIdCardPresenter.m17590c(PreviewIdCardPresenter.this, (Throwable) obj);
            }
        }));
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        this.f86238a.clear();
    }
}