package th.p047co.dtac.android.dtacone.presenter.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import p046rx.Observable;
import p046rx.functions.Action1;
import p046rx.subscriptions.CompositeSubscription;
import th.p047co.dtac.android.dtacone.manager.bus.RxBus;
import th.p047co.dtac.android.dtacone.manager.bus.event.ReaderStatusEvent;
import th.p047co.dtac.android.dtacone.manager.service.RxThreadService;
import th.p047co.dtac.android.dtacone.presenter.ICrashlyticsExceptionTracker;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.prepaid.CameraIdCardPresenter;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001'B'\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/prepaid/CameraIdCardPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/manager/bus/RxBus;", "", "bus", "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", "threadService", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "<init>", "(Lth/co/dtac/android/dtacone/manager/bus/RxBus;Lth/co/dtac/android/dtacone/manager/service/RxThreadService;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;)V", "", OperatorName.FILL_NON_ZERO, "()V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "", "imageData", "saveImage", "([B)V", Constant.ServiceAPIName.onStart, "onStop", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/bus/RxBus;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/RxThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "getBitmapUtil", "()Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "Lrx/subscriptions/CompositeSubscription;", "d", "Lrx/subscriptions/CompositeSubscription;", "subscription", "Lth/co/dtac/android/dtacone/presenter/prepaid/CameraIdCardPresenter$View;", "e", "Lth/co/dtac/android/dtacone/presenter/prepaid/CameraIdCardPresenter$View;", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.CameraIdCardPresenter */
/* loaded from: classes8.dex */
public final class CameraIdCardPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RxBus f86136a;

    /* renamed from: b */
    public final RxThreadService f86137b;

    /* renamed from: c */
    public final BitmapUtil f86138c;

    /* renamed from: d */
    public final CompositeSubscription f86139d;

    /* renamed from: e */
    public View f86140e;

    @Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH&¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/prepaid/CameraIdCardPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "Lth/co/dtac/android/dtacone/presenter/ICrashlyticsExceptionTracker;", "onConnectedBluetooth", "", "onDisconnectBluetooth", "onSaveImageError", "message", "", "onSaveImageSuccess", ClientCookie.PATH_ATTR, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.CameraIdCardPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable, ICrashlyticsExceptionTracker {
        void onConnectedBluetooth();

        void onDisconnectBluetooth();

        void onSaveImageError(@NotNull String str);

        void onSaveImageSuccess(@NotNull String str);
    }

    @Inject
    public CameraIdCardPresenter(@NotNull RxBus<Object> bus, @NotNull RxThreadService threadService, @NotNull BitmapUtil bitmapUtil) {
        Intrinsics.checkNotNullParameter(bus, "bus");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        this.f86136a = bus;
        this.f86137b = threadService;
        this.f86138c = bitmapUtil;
        this.f86139d = new CompositeSubscription();
    }

    /* renamed from: a */
    public static /* synthetic */ void m17712a(Function1 function1, Object obj) {
        m17706g(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ String m17711b(CameraIdCardPresenter cameraIdCardPresenter, byte[] bArr) {
        return m17704i(cameraIdCardPresenter, bArr);
    }

    /* renamed from: c */
    public static /* synthetic */ void m17710c(CameraIdCardPresenter cameraIdCardPresenter, Throwable th2) {
        m17702k(cameraIdCardPresenter, th2);
    }

    /* renamed from: d */
    public static /* synthetic */ void m17709d(Function1 function1, Object obj) {
        m17703j(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m17708e(Throwable th2) {
        m17705h(th2);
    }

    /* renamed from: f */
    private final void m17707f() {
        CompositeSubscription compositeSubscription = this.f86139d;
        Observable compose = this.f86136a.observeEvents(ReaderStatusEvent.class).compose(this.f86137b.applyAsync());
        final CameraIdCardPresenter$registerEvent$1 cameraIdCardPresenter$registerEvent$1 = new CameraIdCardPresenter$registerEvent$1(this);
        compositeSubscription.add(compose.subscribe(new Action1() { // from class: Oj
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CameraIdCardPresenter.m17712a(Function1.this, obj);
            }
        }, new Action1() { // from class: Pj
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CameraIdCardPresenter.m17708e((Throwable) obj);
            }
        }));
    }

    /* renamed from: g */
    public static final void m17706g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m17705h(Throwable th2) {
    }

    /* renamed from: i */
    public static final String m17704i(CameraIdCardPresenter this$0, byte[] imageData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageData, "$imageData");
        return this$0.f86138c.saveInternalImage(imageData, BitmapUtil.IMAGE_ID_CARD);
    }

    /* renamed from: j */
    public static final void m17703j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m17702k(CameraIdCardPresenter this$0, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f86140e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        view.onSaveImageError(message);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@NotNull IPresenter.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f86140e = (View) view;
    }

    @NotNull
    public final BitmapUtil getBitmapUtil() {
        return this.f86138c;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStart() {
        m17707f();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f86139d.clear();
    }

    public final void saveImage(@NotNull final byte[] imageData) {
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        View view = this.f86140e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        CompositeSubscription compositeSubscription = this.f86139d;
        Observable compose = Observable.fromCallable(new Callable() { // from class: Qj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CameraIdCardPresenter.m17711b(CameraIdCardPresenter.this, imageData);
            }
        }).compose(this.f86137b.applyAsync());
        final CameraIdCardPresenter$saveImage$2 cameraIdCardPresenter$saveImage$2 = new CameraIdCardPresenter$saveImage$2(this);
        compositeSubscription.add(compose.subscribe(new Action1() { // from class: Rj
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CameraIdCardPresenter.m17709d(Function1.this, obj);
            }
        }, new Action1() { // from class: Sj
            @Override // p046rx.functions.Action1
            public final void call(Object obj) {
                CameraIdCardPresenter.m17710c(CameraIdCardPresenter.this, (Throwable) obj);
            }
        }));
    }
}