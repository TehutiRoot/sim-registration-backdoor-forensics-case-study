package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.Tiny;
import com.zxy.tiny.callback.BitmapCallback;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.ISecondaryLoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.bitmap.CompressSaveBitmapPresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\t\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/bitmap/CompressSaveBitmapPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "<init>", "(Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "Landroid/graphics/Bitmap;", "bitmap", "compressBitmapWithoutRotate", "(Landroid/graphics/Bitmap;)V", "", "imageName", "compressBitmapWithRotate", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "onDestroy", "()V", "Lio/reactivex/Observable;", OperatorName.LINE_TO, "(Landroid/graphics/Bitmap;)Lio/reactivex/Observable;", "Lio/reactivex/ObservableTransformer;", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Ljava/lang/String;)Lio/reactivex/ObservableTransformer;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "Lth/co/dtac/android/dtacone/presenter/bitmap/CompressSaveBitmapPresenter$View;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/presenter/bitmap/CompressSaveBitmapPresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", "d", "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.CompressSaveBitmapPresenter */
/* loaded from: classes8.dex */
public final class CompressSaveBitmapPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final BitmapUtil f85292a;

    /* renamed from: b */
    public final Rx2ThreadService f85293b;

    /* renamed from: c */
    public View f85294c;

    /* renamed from: d */
    public final CompositeDisposable f85295d;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/bitmap/CompressSaveBitmapPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ISecondaryLoadingViewable;", "onCompressError", "", "onCompressSuccess", "bitmap", "Landroid/graphics/Bitmap;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.CompressSaveBitmapPresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView, ISecondaryLoadingViewable {

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.CompressSaveBitmapPresenter$View$DefaultImpls */
        /* loaded from: classes8.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void onCompressSuccess$default(View view, Bitmap bitmap, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        bitmap = null;
                    }
                    view.onCompressSuccess(bitmap);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCompressSuccess");
            }
        }

        void onCompressError();

        void onCompressSuccess(@Nullable Bitmap bitmap);
    }

    @Inject
    public CompressSaveBitmapPresenter(@NotNull BitmapUtil bitmapUtil, @NotNull Rx2ThreadService threadService) {
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        this.f85292a = bitmapUtil;
        this.f85293b = threadService;
        this.f85295d = new CompositeDisposable();
    }

    /* renamed from: a */
    public static /* synthetic */ void m18973a(Bitmap bitmap, ObservableEmitter observableEmitter) {
        m18961m(bitmap, observableEmitter);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18972b(CompressSaveBitmapPresenter compressSaveBitmapPresenter) {
        m18955s(compressSaveBitmapPresenter);
    }

    /* renamed from: c */
    public static /* synthetic */ ObservableSource m18971c(Function1 function1, Object obj) {
        return m18950x(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m18970d(CompressSaveBitmapPresenter compressSaveBitmapPresenter) {
        m18958p(compressSaveBitmapPresenter);
    }

    /* renamed from: e */
    public static /* synthetic */ ObservableSource m18969e(Function1 function1, Object obj) {
        return m18959o(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m18968f(CompressSaveBitmapPresenter compressSaveBitmapPresenter, Object obj) {
        m18957q(compressSaveBitmapPresenter, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ ObservableSource m18967g(List list, CompressSaveBitmapPresenter compressSaveBitmapPresenter, String str, Observable observable) {
        return m18951w(list, compressSaveBitmapPresenter, str, observable);
    }

    /* renamed from: h */
    public static /* synthetic */ void m18966h(Function1 function1, Object obj) {
        m18954t(function1, obj);
    }

    /* renamed from: i */
    public static /* synthetic */ void m18965i(Function1 function1, Object obj) {
        m18953u(function1, obj);
    }

    /* renamed from: j */
    public static /* synthetic */ void m18964j(ObservableEmitter observableEmitter, Bitmap bitmap, boolean z, Bitmap bitmap2, Throwable th2) {
        m18960n(observableEmitter, bitmap, z, bitmap2, th2);
    }

    /* renamed from: k */
    public static /* synthetic */ void m18963k(Function1 function1, Object obj) {
        m18956r(function1, obj);
    }

    /* renamed from: m */
    public static final void m18961m(final Bitmap bitmap, final ObservableEmitter it) {
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(it, "it");
        Tiny.getInstance().source(bitmap).asBitmap().compress(new BitmapCallback() { // from class: Kv
            @Override // com.zxy.tiny.callback.BitmapCallback
            public final void callback(boolean z, Bitmap bitmap2, Throwable th2) {
                CompressSaveBitmapPresenter.m18964j(ObservableEmitter.this, bitmap, z, bitmap2, th2);
            }
        });
    }

    /* renamed from: n */
    public static final void m18960n(ObservableEmitter it, Bitmap bitmap, boolean z, Bitmap bitmap2, Throwable th2) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        if (z) {
            it.onNext(bitmap2);
        } else {
            it.onNext(bitmap);
        }
    }

    /* renamed from: o */
    public static final ObservableSource m18959o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m18958p(CompressSaveBitmapPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85294c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
    }

    /* renamed from: q */
    public static final void m18957q(CompressSaveBitmapPresenter this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85294c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        View.DefaultImpls.onCompressSuccess$default(view, null, 1, null);
    }

    /* renamed from: r */
    public static final void m18956r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m18955s(CompressSaveBitmapPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.f85294c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
    }

    /* renamed from: t */
    public static final void m18954t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m18953u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final ObservableSource m18951w(List cropImage, CompressSaveBitmapPresenter this$0, String imageName, Observable obs) {
        Intrinsics.checkNotNullParameter(cropImage, "$cropImage");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageName, "$imageName");
        Intrinsics.checkNotNullParameter(obs, "obs");
        final CompressSaveBitmapPresenter$saveBitmap$1$1 compressSaveBitmapPresenter$saveBitmap$1$1 = new CompressSaveBitmapPresenter$saveBitmap$1$1(cropImage, this$0, imageName);
        return obs.concatMap(new Function() { // from class: Bv
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CompressSaveBitmapPresenter.m18971c(Function1.this, obj);
            }
        });
    }

    /* renamed from: x */
    public static final ObservableSource m18950x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.presenter.bitmap.CompressSaveBitmapPresenter.View");
        this.f85294c = (View) iView;
    }

    public final void compressBitmapWithRotate(@NotNull Bitmap bitmap, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        View view = this.f85294c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showSecondaryLoading();
        CompositeDisposable compositeDisposable = this.f85295d;
        Observable m18962l = m18962l(bitmap);
        final CompressSaveBitmapPresenter$compressBitmapWithRotate$1 compressSaveBitmapPresenter$compressBitmapWithRotate$1 = new CompressSaveBitmapPresenter$compressBitmapWithRotate$1(this, imageName);
        Observable doOnTerminate = m18962l.concatMap(new Function() { // from class: Ev
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return CompressSaveBitmapPresenter.m18969e(Function1.this, obj);
            }
        }).compose(m18952v(imageName)).compose(this.f85293b.applyAsync()).doOnTerminate(new Action() { // from class: Fv
            @Override // io.reactivex.functions.Action
            public final void run() {
                CompressSaveBitmapPresenter.m18970d(CompressSaveBitmapPresenter.this);
            }
        });
        Consumer consumer = new Consumer() { // from class: Gv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CompressSaveBitmapPresenter.m18968f(CompressSaveBitmapPresenter.this, obj);
            }
        };
        final CompressSaveBitmapPresenter$compressBitmapWithRotate$4 compressSaveBitmapPresenter$compressBitmapWithRotate$4 = new CompressSaveBitmapPresenter$compressBitmapWithRotate$4(this);
        compositeDisposable.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: Hv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CompressSaveBitmapPresenter.m18963k(Function1.this, obj);
            }
        }));
    }

    public final void compressBitmapWithoutRotate(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        View view = this.f85294c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showSecondaryLoading();
        CompositeDisposable compositeDisposable = this.f85295d;
        Observable doOnTerminate = m18962l(bitmap).compose(this.f85293b.applyAsync()).doOnTerminate(new Action() { // from class: Av
            @Override // io.reactivex.functions.Action
            public final void run() {
                CompressSaveBitmapPresenter.m18972b(CompressSaveBitmapPresenter.this);
            }
        });
        final CompressSaveBitmapPresenter$compressBitmapWithoutRotate$2 compressSaveBitmapPresenter$compressBitmapWithoutRotate$2 = new CompressSaveBitmapPresenter$compressBitmapWithoutRotate$2(this);
        Consumer consumer = new Consumer() { // from class: Cv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CompressSaveBitmapPresenter.m18966h(Function1.this, obj);
            }
        };
        final CompressSaveBitmapPresenter$compressBitmapWithoutRotate$3 compressSaveBitmapPresenter$compressBitmapWithoutRotate$3 = new CompressSaveBitmapPresenter$compressBitmapWithoutRotate$3(this);
        compositeDisposable.add(doOnTerminate.subscribe(consumer, new Consumer() { // from class: Dv
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CompressSaveBitmapPresenter.m18965i(Function1.this, obj);
            }
        }));
    }

    /* renamed from: l */
    public final Observable m18962l(final Bitmap bitmap) {
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: Jv
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                CompressSaveBitmapPresenter.m18973a(bitmap, observableEmitter);
            }
        });
        Intrinsics.checkNotNullExpressionValue(create, "create<Bitmap> {\n       …              }\n        }");
        return create;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        this.f85295d.clear();
    }

    /* renamed from: v */
    public final ObservableTransformer m18952v(final String str) {
        final List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{BitmapUtil.IMAGE_ID_CARD_CROP, BitmapUtil.IMAGE_RTR_PROFILE});
        return new ObservableTransformer() { // from class: Iv
            @Override // io.reactivex.ObservableTransformer
            public final ObservableSource apply(Observable observable) {
                return CompressSaveBitmapPresenter.m18967g(listOf, this, str, observable);
            }
        };
    }
}