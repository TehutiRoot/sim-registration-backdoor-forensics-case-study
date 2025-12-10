package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.presenter.bitmap.SaveCacheImagePresenter;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/bitmap/SaveCacheImagePresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporary", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/TemporaryCache;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "", Action.KEY_ATTRIBUTE, "Landroid/graphics/Bitmap;", "bitmap", "putCacheImageBitmap", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getBitmapByKey", "(Ljava/lang/String;)V", "onDestroy", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CURVE_TO, "Lkotlin/Lazy;", OperatorName.NON_STROKING_GRAY, "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Lth/co/dtac/android/dtacone/presenter/bitmap/SaveCacheImagePresenter$View;", "d", "Lth/co/dtac/android/dtacone/presenter/bitmap/SaveCacheImagePresenter$View;", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveCacheImagePresenter */
/* loaded from: classes8.dex */
public final class SaveCacheImagePresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Rx2ThreadService f85331a;

    /* renamed from: b */
    public final TemporaryCache f85332b;

    /* renamed from: c */
    public final Lazy f85333c;

    /* renamed from: d */
    public View f85334d;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/presenter/bitmap/SaveCacheImagePresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "onBitmapResult", "", ResponseProcessor.CONTENT_TYPE_IMAGE, "", "onStoredBitmap", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveCacheImagePresenter$View */
    /* loaded from: classes8.dex */
    public interface View extends IPresenter.IView {
        void onBitmapResult(@NotNull byte[] bArr);

        void onStoredBitmap();
    }

    @Inject
    public SaveCacheImagePresenter(@NotNull Rx2ThreadService threadService, @NotNull TemporaryCache temporary) {
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(temporary, "temporary");
        this.f85331a = threadService;
        this.f85332b = temporary;
        this.f85333c = LazyKt__LazyJVMKt.lazy(SaveCacheImagePresenter$disposable$2.INSTANCE);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18798a(Function1 function1, Object obj) {
        m18793f(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ byte[] m18797b(SaveCacheImagePresenter saveCacheImagePresenter, String str) {
        return m18794e(saveCacheImagePresenter, str);
    }

    /* renamed from: c */
    public static /* synthetic */ void m18796c(Function1 function1, Object obj) {
        m18790i(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ Bitmap m18795d(Bitmap bitmap) {
        return m18791h(bitmap);
    }

    /* renamed from: e */
    public static final byte[] m18794e(SaveCacheImagePresenter this$0, String key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Bitmap bitmap = this$0.f85332b.getCacheBitmap().get(key);
        Intrinsics.checkNotNull(bitmap);
        return BitmapExtKt.toByteArray(bitmap);
    }

    /* renamed from: f */
    public static final void m18793f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final Bitmap m18791h(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        return BitmapExtKt.toRotate(bitmap);
    }

    /* renamed from: i */
    public static final void m18790i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@NotNull IPresenter.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f85334d = (View) view;
    }

    /* renamed from: g */
    public final CompositeDisposable m18792g() {
        return (CompositeDisposable) this.f85333c.getValue();
    }

    public final void getBitmapByKey(@NotNull final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CompositeDisposable m18792g = m18792g();
        Observable onErrorResumeNext = Observable.fromCallable(new Callable() { // from class: cF1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SaveCacheImagePresenter.m18797b(SaveCacheImagePresenter.this, key);
            }
        }).retry(1L).compose(this.f85331a.applyAsync()).onErrorResumeNext(Observable.empty());
        final SaveCacheImagePresenter$getBitmapByKey$2 saveCacheImagePresenter$getBitmapByKey$2 = new SaveCacheImagePresenter$getBitmapByKey$2(this);
        m18792g.add(onErrorResumeNext.subscribe(new Consumer() { // from class: dF1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SaveCacheImagePresenter.m18798a(Function1.this, obj);
            }
        }));
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onDestroy() {
        m18792g().clear();
    }

    public final void putCacheImageBitmap(@Nullable String str, @NotNull final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        CompositeDisposable m18792g = m18792g();
        Observable onErrorResumeNext = Observable.fromCallable(new Callable() { // from class: aF1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SaveCacheImagePresenter.m18795d(bitmap);
            }
        }).compose(this.f85331a.applyAsync()).onErrorResumeNext(Observable.empty());
        final SaveCacheImagePresenter$putCacheImageBitmap$2 saveCacheImagePresenter$putCacheImageBitmap$2 = new SaveCacheImagePresenter$putCacheImageBitmap$2(this, str);
        m18792g.add(onErrorResumeNext.subscribe(new Consumer() { // from class: bF1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SaveCacheImagePresenter.m18796c(Function1.this, obj);
            }
        }));
    }
}