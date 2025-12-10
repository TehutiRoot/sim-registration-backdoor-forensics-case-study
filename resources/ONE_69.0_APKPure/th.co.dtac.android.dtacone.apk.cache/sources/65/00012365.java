package th.p047co.dtac.android.dtacone.presenter.face_detection;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.face_detection.FaceDetectionPresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001)B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/face_detection/FaceDetectionPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/manager/face/FaceDetection;", "detector", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "<init>", "(Lth/co/dtac/android/dtacone/manager/face/FaceDetection;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "verifyIdCardImageByFaceDetection", "()V", "onStop", "Landroid/graphics/Bitmap;", "bitmap", "Lio/reactivex/Observable;", "", OperatorName.SET_LINE_JOINSTYLE, "(Landroid/graphics/Bitmap;)Lio/reactivex/Observable;", "", OperatorName.CLOSE_PATH, PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/face/FaceDetection;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "Lth/co/dtac/android/dtacone/presenter/face_detection/FaceDetectionPresenter$View;", "d", "Lth/co/dtac/android/dtacone/presenter/face_detection/FaceDetectionPresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lkotlin/Lazy;", OperatorName.LINE_TO, "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.face_detection.FaceDetectionPresenter */
/* loaded from: classes8.dex */
public final class FaceDetectionPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final FaceDetection f85799a;

    /* renamed from: b */
    public final Rx2ThreadService f85800b;

    /* renamed from: c */
    public final BitmapUtil f85801c;

    /* renamed from: d */
    public View f85802d;

    /* renamed from: e */
    public final Lazy f85803e;

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/face_detection/FaceDetectionPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "onFaceDetected", "", "onFaceNotFound", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.face_detection.FaceDetectionPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {
        void onFaceDetected();

        void onFaceNotFound();
    }

    @Inject
    public FaceDetectionPresenter(@NotNull FaceDetection detector, @NotNull Rx2ThreadService threadService, @NotNull BitmapUtil bitmapUtil) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        this.f85799a = detector;
        this.f85800b = threadService;
        this.f85801c = bitmapUtil;
        this.f85803e = LazyKt__LazyJVMKt.lazy(FaceDetectionPresenter$disposable$2.INSTANCE);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18238a(Function1 function1, Object obj) {
        m18223p(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18237b(Function1 function1, Object obj) {
        m18222q(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ Boolean m18236c(FaceDetectionPresenter faceDetectionPresenter, Bitmap bitmap) {
        return m18228k(faceDetectionPresenter, bitmap);
    }

    /* renamed from: d */
    public static /* synthetic */ byte[] m18235d(FaceDetectionPresenter faceDetectionPresenter, Bitmap bitmap) {
        return m18230i(faceDetectionPresenter, bitmap);
    }

    /* renamed from: f */
    public static /* synthetic */ Bitmap m18233f(Function1 function1, Object obj) {
        return m18226m(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m18232g(FaceDetectionPresenter faceDetectionPresenter) {
        m18224o(faceDetectionPresenter);
    }

    /* renamed from: i */
    public static final byte[] m18230i(FaceDetectionPresenter this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        return this$0.f85801c.cropImage(bitmap);
    }

    /* renamed from: k */
    public static final Boolean m18228k(FaceDetectionPresenter this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        return Boolean.valueOf(this$0.f85799a.onDetected(bitmap));
    }

    /* renamed from: l */
    private final CompositeDisposable m18227l() {
        return (CompositeDisposable) this.f85803e.getValue();
    }

    /* renamed from: m */
    public static final Bitmap m18226m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Bitmap) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final ObservableSource m18225n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m18224o(FaceDetectionPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85802d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissLoading();
    }

    /* renamed from: p */
    public static final void m18223p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m18222q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@NotNull IPresenter.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f85802d = (View) view;
    }

    /* renamed from: h */
    public final Observable m18231h(final Bitmap bitmap) {
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: zU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FaceDetectionPresenter.m18235d(FaceDetectionPresenter.this, bitmap);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fromCallable, "fromCallable { bitmapUtil.cropImage(bitmap) }");
        return fromCallable;
    }

    /* renamed from: j */
    public final Observable m18229j(final Bitmap bitmap) {
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: yU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FaceDetectionPresenter.m18236c(FaceDetectionPresenter.this, bitmap);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fromCallable, "fromCallable { detector.onDetected(bitmap) }");
        return fromCallable;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        m18227l().clear();
    }

    public final void verifyIdCardImageByFaceDetection() {
        View view = this.f85802d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showLoading();
        CompositeDisposable m18227l = m18227l();
        Bitmap rotateExistImage = this.f85801c.rotateExistImage(BitmapUtil.IMAGE_ID_CARD);
        Intrinsics.checkNotNullExpressionValue(rotateExistImage, "bitmapUtil.rotateExistIm…BitmapUtil.IMAGE_ID_CARD)");
        Observable m18231h = m18231h(rotateExistImage);
        final FaceDetectionPresenter$verifyIdCardImageByFaceDetection$1 faceDetectionPresenter$verifyIdCardImageByFaceDetection$1 = FaceDetectionPresenter$verifyIdCardImageByFaceDetection$1.INSTANCE;
        Observable map = m18231h.map(new Function() { // from class: tU
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return FaceDetectionPresenter.m18233f(Function1.this, obj);
            }
        });
        final FaceDetectionPresenter$verifyIdCardImageByFaceDetection$2 faceDetectionPresenter$verifyIdCardImageByFaceDetection$2 = new FaceDetectionPresenter$verifyIdCardImageByFaceDetection$2(this);
        Observable doOnTerminate = map.flatMap(new Function() { // from class: uU
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m18225n;
                m18225n = FaceDetectionPresenter.m18225n(Function1.this, obj);
                return m18225n;
            }
        }).compose(this.f85800b.applyAsync()).doOnTerminate(new Action() { // from class: vU
            @Override // io.reactivex.functions.Action
            public final void run() {
                FaceDetectionPresenter.m18232g(FaceDetectionPresenter.this);
            }
        });
        final FaceDetectionPresenter$verifyIdCardImageByFaceDetection$4 faceDetectionPresenter$verifyIdCardImageByFaceDetection$4 = new FaceDetectionPresenter$verifyIdCardImageByFaceDetection$4(this);
        Consumer consumer = new Consumer() { // from class: wU
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceDetectionPresenter.m18238a(Function1.this, obj);
            }
        };
        final FaceDetectionPresenter$verifyIdCardImageByFaceDetection$5 faceDetectionPresenter$verifyIdCardImageByFaceDetection$5 = new FaceDetectionPresenter$verifyIdCardImageByFaceDetection$5(this);
        m18227l.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: xU
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FaceDetectionPresenter.m18237b(Function1.this, obj);
            }
        }));
    }
}