package th.p047co.dtac.android.dtacone.app_one.presenter;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.presenter.OneSaveBitmapWithWaterMarkPresenter;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00018B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001dJ%\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001dJ%\u0010 \u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b \u0010\u001dJ%\u0010!\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b!\u0010\u001dJ%\u0010\"\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010#\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u0010\u0018\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/presenter/OneSaveBitmapWithWaterMarkPresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "drawBitmap", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;)V", "", "originalImageName", "waterMarkImageName", "waterMarkText", "Lio/reactivex/Observable;", "Landroid/graphics/Bitmap;", OperatorName.CLOSE_AND_STROKE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;", "u", "A", "C", OperatorName.SET_LINE_WIDTH, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "saveImageWatermark", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "saveImageWatermarkFront", "saveOneImageWatermarkPrepaid", "saveOneImageWatermarkVertical", "saveOneImageWatermarkFrontPrepaid", "saveOneImageWatermarkFrontReadCardPrepaid", "onStop", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "getBitmapUtil", "()Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "getDrawBitmap", "()Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "Lth/co/dtac/android/dtacone/app_one/presenter/OneSaveBitmapWithWaterMarkPresenter$View;", "d", "Lth/co/dtac/android/dtacone/app_one/presenter/OneSaveBitmapWithWaterMarkPresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "View", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneSaveBitmapWithWaterMarkPresenter */
/* loaded from: classes7.dex */
public final class OneSaveBitmapWithWaterMarkPresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Rx2ThreadService f82334a;

    /* renamed from: b */
    public final BitmapUtil f82335b;

    /* renamed from: c */
    public final DrawBitmap f82336c;

    /* renamed from: d */
    public View f82337d;

    /* renamed from: e */
    public final CompositeDisposable f82338e;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/presenter/OneSaveBitmapWithWaterMarkPresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "onSaveBitmapError", "", "message", "", "onSaveBitmapSuccess", "bitmap", "Landroid/graphics/Bitmap;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneSaveBitmapWithWaterMarkPresenter$View */
    /* loaded from: classes7.dex */
    public interface View extends IPresenter.IView, ILoadingViewable {

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneSaveBitmapWithWaterMarkPresenter$View$DefaultImpls */
        /* loaded from: classes7.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void onSaveBitmapError$default(View view, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        str = "ประมวลผลรูปภาพไม่สำเร็จ กรุณาลองใหม่อีกครั้ง";
                    }
                    view.onSaveBitmapError(str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSaveBitmapError");
            }
        }

        void onSaveBitmapError(@NotNull String str);

        void onSaveBitmapSuccess(@NotNull Bitmap bitmap);
    }

    @Inject
    public OneSaveBitmapWithWaterMarkPresenter(@NotNull Rx2ThreadService threadService, @NotNull BitmapUtil bitmapUtil, @NotNull DrawBitmap drawBitmap) {
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(drawBitmap, "drawBitmap");
        this.f82334a = threadService;
        this.f82335b = bitmapUtil;
        this.f82336c = drawBitmap;
        this.f82338e = new CompositeDisposable();
    }

    /* renamed from: B */
    public static final Bitmap m20157B(OneSaveBitmapWithWaterMarkPresenter this$0, String originalImageName, String waterMarkImageName, String waterMarkText) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalImageName, "$originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "$waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "$waterMarkText");
        return this$0.f82336c.oneSaveImageWithWatermarkFromOriginalImagePrepaid(originalImageName, waterMarkImageName, waterMarkText);
    }

    /* renamed from: D */
    public static final Bitmap m20155D(OneSaveBitmapWithWaterMarkPresenter this$0, String originalImageName, String waterMarkImageName, String waterMarkText) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalImageName, "$originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "$waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "$waterMarkText");
        return this$0.f82336c.oneSaveImageWithWatermarkFromOriginalImageVertical(originalImageName, waterMarkImageName, waterMarkText);
    }

    /* renamed from: E */
    public static final void m20154E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m20153F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m20152G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m20151H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m20150I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m20149J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m20148K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m20147L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m20146M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m20145N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m20144O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m20143P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a */
    public static /* synthetic */ Bitmap m20142a(OneSaveBitmapWithWaterMarkPresenter oneSaveBitmapWithWaterMarkPresenter, String str, String str2, String str3) {
        return m20157B(oneSaveBitmapWithWaterMarkPresenter, str, str2, str3);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20141b(Function1 function1, Object obj) {
        m20151H(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20140c(Function1 function1, Object obj) {
        m20153F(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m20139d(Function1 function1, Object obj) {
        m20154E(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m20138e(Function1 function1, Object obj) {
        m20146M(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m20137f(Function1 function1, Object obj) {
        m20152G(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ Bitmap m20136g(OneSaveBitmapWithWaterMarkPresenter oneSaveBitmapWithWaterMarkPresenter, String str, String str2, String str3) {
        return m20119x(oneSaveBitmapWithWaterMarkPresenter, str, str2, str3);
    }

    /* renamed from: h */
    public static /* synthetic */ Bitmap m20135h(OneSaveBitmapWithWaterMarkPresenter oneSaveBitmapWithWaterMarkPresenter, String str, String str2, String str3) {
        return m20117z(oneSaveBitmapWithWaterMarkPresenter, str, str2, str3);
    }

    /* renamed from: i */
    public static /* synthetic */ void m20134i(Function1 function1, Object obj) {
        m20145N(function1, obj);
    }

    /* renamed from: j */
    public static /* synthetic */ void m20133j(Function1 function1, Object obj) {
        m20149J(function1, obj);
    }

    /* renamed from: k */
    public static /* synthetic */ void m20132k(Function1 function1, Object obj) {
        m20148K(function1, obj);
    }

    /* renamed from: l */
    public static /* synthetic */ void m20131l(Function1 function1, Object obj) {
        m20144O(function1, obj);
    }

    /* renamed from: m */
    public static /* synthetic */ Bitmap m20130m(OneSaveBitmapWithWaterMarkPresenter oneSaveBitmapWithWaterMarkPresenter, String str, String str2, String str3) {
        return m20123t(oneSaveBitmapWithWaterMarkPresenter, str, str2, str3);
    }

    /* renamed from: n */
    public static /* synthetic */ void m20129n(Function1 function1, Object obj) {
        m20147L(function1, obj);
    }

    /* renamed from: o */
    public static /* synthetic */ Bitmap m20128o(OneSaveBitmapWithWaterMarkPresenter oneSaveBitmapWithWaterMarkPresenter, String str, String str2, String str3) {
        return m20155D(oneSaveBitmapWithWaterMarkPresenter, str, str2, str3);
    }

    /* renamed from: p */
    public static /* synthetic */ void m20127p(Function1 function1, Object obj) {
        m20143P(function1, obj);
    }

    /* renamed from: q */
    public static /* synthetic */ Bitmap m20126q(OneSaveBitmapWithWaterMarkPresenter oneSaveBitmapWithWaterMarkPresenter, String str, String str2, String str3) {
        return m20121v(oneSaveBitmapWithWaterMarkPresenter, str, str2, str3);
    }

    /* renamed from: r */
    public static /* synthetic */ void m20125r(Function1 function1, Object obj) {
        m20150I(function1, obj);
    }

    /* renamed from: t */
    public static final Bitmap m20123t(OneSaveBitmapWithWaterMarkPresenter this$0, String originalImageName, String waterMarkImageName, String waterMarkText) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalImageName, "$originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "$waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "$waterMarkText");
        return this$0.f82336c.oneSaveImageWithWatermarkFromOriginalImage(originalImageName, waterMarkImageName, waterMarkText);
    }

    /* renamed from: v */
    public static final Bitmap m20121v(OneSaveBitmapWithWaterMarkPresenter this$0, String originalImageName, String waterMarkImageName, String waterMarkText) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalImageName, "$originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "$waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "$waterMarkText");
        return this$0.f82336c.oneSaveImageWithWatermarkFrontFromOriginalImage(originalImageName, waterMarkImageName, waterMarkText);
    }

    /* renamed from: x */
    public static final Bitmap m20119x(OneSaveBitmapWithWaterMarkPresenter this$0, String originalImageName, String waterMarkImageName, String waterMarkText) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalImageName, "$originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "$waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "$waterMarkText");
        return this$0.f82336c.oneSaveImageWithWatermarkFrontFromOriginalImagePrepaid(originalImageName, waterMarkImageName, waterMarkText);
    }

    /* renamed from: z */
    public static final Bitmap m20117z(OneSaveBitmapWithWaterMarkPresenter this$0, String originalImageName, String waterMarkImageName, String waterMarkText) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(originalImageName, "$originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "$waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "$waterMarkText");
        return this$0.f82336c.oneSaveImageWithWatermarkFrontFromOriginalImageReadCardPrepaid(originalImageName, waterMarkImageName, waterMarkText);
    }

    /* renamed from: A */
    public final Observable m20158A(final String str, final String str2, final String str3) {
        Observable compose = Observable.fromCallable(new Callable() { // from class: Zb1
            {
                OneSaveBitmapWithWaterMarkPresenter.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OneSaveBitmapWithWaterMarkPresenter.m20142a(OneSaveBitmapWithWaterMarkPresenter.this, str, str2, str3);
            }
        }).compose(this.f82334a.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "fromCallable { drawBitma…ervice.applyBackground())");
        return compose;
    }

    /* renamed from: C */
    public final Observable m20156C(final String str, final String str2, final String str3) {
        Observable compose = Observable.fromCallable(new Callable() { // from class: Yb1
            {
                OneSaveBitmapWithWaterMarkPresenter.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OneSaveBitmapWithWaterMarkPresenter.m20128o(OneSaveBitmapWithWaterMarkPresenter.this, str, str2, str3);
            }
        }).compose(this.f82334a.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "fromCallable { drawBitma…ervice.applyBackground())");
        return compose;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@NotNull IPresenter.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f82337d = (View) view;
    }

    @NotNull
    public final BitmapUtil getBitmapUtil() {
        return this.f82335b;
    }

    @NotNull
    public final DrawBitmap getDrawBitmap() {
        return this.f82336c;
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f82334a;
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        this.f82338e.clear();
    }

    /* renamed from: s */
    public final Observable m20124s(final String str, final String str2, final String str3) {
        Observable compose = Observable.fromCallable(new Callable() { // from class: ac1
            {
                OneSaveBitmapWithWaterMarkPresenter.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OneSaveBitmapWithWaterMarkPresenter.m20130m(OneSaveBitmapWithWaterMarkPresenter.this, str, str2, str3);
            }
        }).compose(this.f82334a.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "fromCallable { drawBitma…ervice.applyBackground())");
        return compose;
    }

    public final void saveImageWatermark(@NotNull String originalImageName, @NotNull String waterMarkImageName, @NotNull String waterMarkText) {
        Intrinsics.checkNotNullParameter(originalImageName, "originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "waterMarkText");
        Observable m20124s = m20124s(originalImageName, waterMarkImageName, waterMarkText);
        CompositeDisposable compositeDisposable = this.f82338e;
        Observable compose = m20124s.compose(this.f82334a.applyAsync());
        final OneSaveBitmapWithWaterMarkPresenter$saveImageWatermark$1 oneSaveBitmapWithWaterMarkPresenter$saveImageWatermark$1 = new OneSaveBitmapWithWaterMarkPresenter$saveImageWatermark$1(this);
        Consumer consumer = new Consumer() { // from class: lc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20139d(oneSaveBitmapWithWaterMarkPresenter$saveImageWatermark$1, obj);
            }
        };
        final OneSaveBitmapWithWaterMarkPresenter$saveImageWatermark$2 oneSaveBitmapWithWaterMarkPresenter$saveImageWatermark$2 = new OneSaveBitmapWithWaterMarkPresenter$saveImageWatermark$2(this);
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: mc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20140c(oneSaveBitmapWithWaterMarkPresenter$saveImageWatermark$2, obj);
            }
        }));
    }

    public final void saveImageWatermarkFront(@NotNull String originalImageName, @NotNull String waterMarkImageName, @NotNull String waterMarkText) {
        Intrinsics.checkNotNullParameter(originalImageName, "originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "waterMarkText");
        Observable m20122u = m20122u(originalImageName, waterMarkImageName, waterMarkText);
        CompositeDisposable compositeDisposable = this.f82338e;
        Observable compose = m20122u.compose(this.f82334a.applyAsync());
        final OneSaveBitmapWithWaterMarkPresenter$saveImageWatermarkFront$1 oneSaveBitmapWithWaterMarkPresenter$saveImageWatermarkFront$1 = new OneSaveBitmapWithWaterMarkPresenter$saveImageWatermarkFront$1(this);
        Consumer consumer = new Consumer() { // from class: fc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20137f(oneSaveBitmapWithWaterMarkPresenter$saveImageWatermarkFront$1, obj);
            }
        };
        final OneSaveBitmapWithWaterMarkPresenter$saveImageWatermarkFront$2 oneSaveBitmapWithWaterMarkPresenter$saveImageWatermarkFront$2 = new OneSaveBitmapWithWaterMarkPresenter$saveImageWatermarkFront$2(this);
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: gc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20141b(oneSaveBitmapWithWaterMarkPresenter$saveImageWatermarkFront$2, obj);
            }
        }));
    }

    public final void saveOneImageWatermarkFrontPrepaid(@NotNull String originalImageName, @NotNull String waterMarkImageName, @NotNull String waterMarkText) {
        Intrinsics.checkNotNullParameter(originalImageName, "originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "waterMarkText");
        Observable m20120w = m20120w(originalImageName, waterMarkImageName, waterMarkText);
        CompositeDisposable compositeDisposable = this.f82338e;
        Observable compose = m20120w.compose(this.f82334a.applyAsync());
        final C14144xe572de5d c14144xe572de5d = new C14144xe572de5d(this);
        Consumer consumer = new Consumer() { // from class: jc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20125r(c14144xe572de5d, obj);
            }
        };
        final C14145xe572de5e c14145xe572de5e = new C14145xe572de5e(this);
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: kc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20133j(c14145xe572de5e, obj);
            }
        }));
    }

    public final void saveOneImageWatermarkFrontReadCardPrepaid(@NotNull String originalImageName, @NotNull String waterMarkImageName, @NotNull String waterMarkText) {
        Intrinsics.checkNotNullParameter(originalImageName, "originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "waterMarkText");
        Observable m20118y = m20118y(originalImageName, waterMarkImageName, waterMarkText);
        CompositeDisposable compositeDisposable = this.f82338e;
        Observable compose = m20118y.compose(this.f82334a.applyAsync());
        final C14146x97ab5e37 c14146x97ab5e37 = new C14146x97ab5e37(this);
        Consumer consumer = new Consumer() { // from class: hc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20132k(c14146x97ab5e37, obj);
            }
        };
        final C14147x97ab5e38 c14147x97ab5e38 = new C14147x97ab5e38(this);
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: ic1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20129n(c14147x97ab5e38, obj);
            }
        }));
    }

    public final void saveOneImageWatermarkPrepaid(@NotNull String originalImageName, @NotNull String waterMarkImageName, @NotNull String waterMarkText) {
        Intrinsics.checkNotNullParameter(originalImageName, "originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "waterMarkText");
        Observable m20158A = m20158A(originalImageName, waterMarkImageName, waterMarkText);
        CompositeDisposable compositeDisposable = this.f82338e;
        Observable compose = m20158A.compose(this.f82334a.applyAsync());
        final C14148xf46fecb2 c14148xf46fecb2 = new C14148xf46fecb2(this);
        Consumer consumer = new Consumer() { // from class: Vb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20138e(c14148xf46fecb2, obj);
            }
        };
        final C14149xf46fecb3 c14149xf46fecb3 = new C14149xf46fecb3(this);
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: ec1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20134i(c14149xf46fecb3, obj);
            }
        }));
    }

    public final void saveOneImageWatermarkVertical(@NotNull String originalImageName, @NotNull String waterMarkImageName, @NotNull String waterMarkText) {
        Intrinsics.checkNotNullParameter(originalImageName, "originalImageName");
        Intrinsics.checkNotNullParameter(waterMarkImageName, "waterMarkImageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "waterMarkText");
        Observable m20156C = m20156C(originalImageName, waterMarkImageName, waterMarkText);
        CompositeDisposable compositeDisposable = this.f82338e;
        Observable compose = m20156C.compose(this.f82334a.applyAsync());
        final C14150xf326c94d c14150xf326c94d = new C14150xf326c94d(this);
        Consumer consumer = new Consumer() { // from class: Wb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20131l(c14150xf326c94d, obj);
            }
        };
        final C14151xf326c94e c14151xf326c94e = new C14151xf326c94e(this);
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: Xb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneSaveBitmapWithWaterMarkPresenter.m20127p(c14151xf326c94e, obj);
            }
        }));
    }

    /* renamed from: u */
    public final Observable m20122u(final String str, final String str2, final String str3) {
        Observable compose = Observable.fromCallable(new Callable() { // from class: cc1
            {
                OneSaveBitmapWithWaterMarkPresenter.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OneSaveBitmapWithWaterMarkPresenter.m20126q(OneSaveBitmapWithWaterMarkPresenter.this, str, str2, str3);
            }
        }).compose(this.f82334a.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "fromCallable { drawBitma…ervice.applyBackground())");
        return compose;
    }

    /* renamed from: w */
    public final Observable m20120w(final String str, final String str2, final String str3) {
        Observable compose = Observable.fromCallable(new Callable() { // from class: bc1
            {
                OneSaveBitmapWithWaterMarkPresenter.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OneSaveBitmapWithWaterMarkPresenter.m20136g(OneSaveBitmapWithWaterMarkPresenter.this, str, str2, str3);
            }
        }).compose(this.f82334a.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "fromCallable { drawBitma…ervice.applyBackground())");
        return compose;
    }

    /* renamed from: y */
    public final Observable m20118y(final String str, final String str2, final String str3) {
        Observable compose = Observable.fromCallable(new Callable() { // from class: dc1
            {
                OneSaveBitmapWithWaterMarkPresenter.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OneSaveBitmapWithWaterMarkPresenter.m20135h(OneSaveBitmapWithWaterMarkPresenter.this, str, str2, str3);
            }
        }).compose(this.f82334a.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "fromCallable { drawBitma…ervice.applyBackground())");
        return compose;
    }
}
