package th.p047co.dtac.android.dtacone.viewmodel.image;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.bitmap.ComposeBitmap;
import th.p047co.dtac.android.dtacone.presenter.ILoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.IViewModel;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;
import th.p047co.dtac.android.dtacone.viewmodel.image.LoadPreviewImageViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001=B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\f\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R/\u0010<\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e07068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/image/LoadPreviewImageViewModel;", "Landroidx/lifecycle/ViewModel;", "Lth/co/dtac/android/dtacone/presenter/IViewModel;", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "drawBitmap", "<init>", "(Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;)V", "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;)V", "", "imageNameIdCard", "imageNameCompareImage", "getImagePreview", "(Ljava/lang/String;Ljava/lang/String;)V", "imageName", "getImagePreviewByName", "(Ljava/lang/String;)V", "waterMarkText", "getImagePreviewByNameWithWatermark", "getImagePreviewByNameWithCrop", "onCleared", "()V", "Lio/reactivex/Observable;", "", "p", "(Ljava/lang/String;)Lio/reactivex/Observable;", OperatorName.CLOSE_AND_STROKE, "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "getThreadService", "()Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "getBitmapUtil", "()Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "getDrawBitmap", "()Lth/co/dtac/android/dtacone/util/bitmap/draw/DrawBitmap;", "Lio/reactivex/disposables/CompositeDisposable;", "d", "Lio/reactivex/disposables/CompositeDisposable;", "subscription", "Lth/co/dtac/android/dtacone/viewmodel/image/LoadPreviewImageViewModel$View;", "e", "Lth/co/dtac/android/dtacone/viewmodel/image/LoadPreviewImageViewModel$View;", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", OperatorName.FILL_NON_ZERO, "Lkotlin/Lazy;", "getViewModelBitmap", "()Landroidx/lifecycle/MutableLiveData;", "viewModelBitmap", "View", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLoadPreviewImageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadPreviewImageViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/image/LoadPreviewImageViewModel\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,95:1\n124#2,2:96\n*S KotlinDebug\n*F\n+ 1 LoadPreviewImageViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/image/LoadPreviewImageViewModel\n*L\n37#1:96,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.image.LoadPreviewImageViewModel */
/* loaded from: classes9.dex */
public class LoadPreviewImageViewModel extends ViewModel implements IViewModel {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Rx2ThreadService f106049a;

    /* renamed from: b */
    public final BitmapUtil f106050b;

    /* renamed from: c */
    public final DrawBitmap f106051c;

    /* renamed from: d */
    public final CompositeDisposable f106052d;

    /* renamed from: e */
    public View f106053e;

    /* renamed from: f */
    public final Lazy f106054f;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/image/LoadPreviewImageViewModel$View;", "Lth/co/dtac/android/dtacone/presenter/IViewModel$IView;", "Lth/co/dtac/android/dtacone/presenter/ILoadingViewable;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.image.LoadPreviewImageViewModel$View */
    /* loaded from: classes9.dex */
    public interface View extends IViewModel.IView, ILoadingViewable {
    }

    @Inject
    public LoadPreviewImageViewModel(@NotNull Rx2ThreadService threadService, @NotNull BitmapUtil bitmapUtil, @NotNull DrawBitmap drawBitmap) {
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(drawBitmap, "drawBitmap");
        this.f106049a = threadService;
        this.f106050b = bitmapUtil;
        this.f106051c = drawBitmap;
        this.f106052d = new CompositeDisposable();
        this.f106054f = LazyKt__LazyJVMKt.lazy(LoadPreviewImageViewModel$viewModelBitmap$2.INSTANCE);
    }

    /* renamed from: A */
    public static final Bitmap m2573A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Bitmap) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final ObservableSource m2572B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ObservableSource) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m2571C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m2570D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m2569E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final Bitmap m2553q(LoadPreviewImageViewModel this$0, String imageName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageName, "$imageName");
        return this$0.f106050b.loadInternalOriginal(imageName);
    }

    /* renamed from: r */
    public static final byte[] m2552r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (byte[]) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final Bitmap m2550t(LoadPreviewImageViewModel this$0, String imageName, String waterMarkText) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageName, "$imageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "$waterMarkText");
        return this$0.f106051c.drawWatermarkWithSave(imageName, waterMarkText);
    }

    /* renamed from: u */
    public static final byte[] m2549u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (byte[]) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m2548v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m2547w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m2546x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m2545y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m2544z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IViewModel
    public void attachView(@NotNull IViewModel.IView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f106053e = (View) view;
    }

    @NotNull
    public final BitmapUtil getBitmapUtil() {
        return this.f106050b;
    }

    @NotNull
    public final DrawBitmap getDrawBitmap() {
        return this.f106051c;
    }

    public final void getImagePreview(@NotNull String imageNameIdCard, @NotNull String imageNameCompareImage) {
        Intrinsics.checkNotNullParameter(imageNameIdCard, "imageNameIdCard");
        Intrinsics.checkNotNullParameter(imageNameCompareImage, "imageNameCompareImage");
        Observable m2554p = m2554p(imageNameIdCard);
        Observable m2554p2 = m2554p(imageNameCompareImage);
        CompositeDisposable compositeDisposable = this.f106052d;
        Observables observables = Observables.INSTANCE;
        Observable zip = Observable.zip(m2554p, m2554p2, new BiFunction<T1, T2, R>() { // from class: th.co.dtac.android.dtacone.viewmodel.image.LoadPreviewImageViewModel$getImagePreview$$inlined$zip$1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) new ComposeBitmap((byte[]) t1, (byte[]) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        Observable compose = zip.retry(1L).compose(this.f106049a.applyAsync());
        final LoadPreviewImageViewModel$getImagePreview$2 loadPreviewImageViewModel$getImagePreview$2 = new LoadPreviewImageViewModel$getImagePreview$2(this);
        Consumer consumer = new Consumer() { // from class: Kj0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadPreviewImageViewModel.m2548v(loadPreviewImageViewModel$getImagePreview$2, obj);
            }
        };
        final LoadPreviewImageViewModel$getImagePreview$3 loadPreviewImageViewModel$getImagePreview$3 = LoadPreviewImageViewModel$getImagePreview$3.INSTANCE;
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: Lj0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadPreviewImageViewModel.m2547w(loadPreviewImageViewModel$getImagePreview$3, obj);
            }
        }));
    }

    public final void getImagePreviewByName(@NotNull String imageName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Observable m2554p = m2554p(imageName);
        CompositeDisposable compositeDisposable = this.f106052d;
        Observable compose = m2554p.retry(1L).compose(this.f106049a.applyAsync());
        final LoadPreviewImageViewModel$getImagePreviewByName$1 loadPreviewImageViewModel$getImagePreviewByName$1 = new LoadPreviewImageViewModel$getImagePreviewByName$1(this);
        Consumer consumer = new Consumer() { // from class: Ij0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadPreviewImageViewModel.m2546x(loadPreviewImageViewModel$getImagePreviewByName$1, obj);
            }
        };
        final LoadPreviewImageViewModel$getImagePreviewByName$2 loadPreviewImageViewModel$getImagePreviewByName$2 = LoadPreviewImageViewModel$getImagePreviewByName$2.INSTANCE;
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: Jj0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadPreviewImageViewModel.m2545y(loadPreviewImageViewModel$getImagePreviewByName$2, obj);
            }
        }));
    }

    public final void getImagePreviewByNameWithCrop(@NotNull String imageName) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Observable m2554p = m2554p(imageName);
        CompositeDisposable compositeDisposable = this.f106052d;
        final LoadPreviewImageViewModel$getImagePreviewByNameWithCrop$1 loadPreviewImageViewModel$getImagePreviewByNameWithCrop$1 = LoadPreviewImageViewModel$getImagePreviewByNameWithCrop$1.INSTANCE;
        Observable map = m2554p.map(new Function() { // from class: Ej0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m2573A;
                m2573A = LoadPreviewImageViewModel.m2573A(loadPreviewImageViewModel$getImagePreviewByNameWithCrop$1, obj);
                return m2573A;
            }
        });
        final LoadPreviewImageViewModel$getImagePreviewByNameWithCrop$2 loadPreviewImageViewModel$getImagePreviewByNameWithCrop$2 = new LoadPreviewImageViewModel$getImagePreviewByNameWithCrop$2(this);
        Observable compose = map.concatMap(new Function() { // from class: Fj0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m2572B;
                m2572B = LoadPreviewImageViewModel.m2572B(loadPreviewImageViewModel$getImagePreviewByNameWithCrop$2, obj);
                return m2572B;
            }
        }).compose(this.f106049a.applyAsync());
        final LoadPreviewImageViewModel$getImagePreviewByNameWithCrop$3 loadPreviewImageViewModel$getImagePreviewByNameWithCrop$3 = new LoadPreviewImageViewModel$getImagePreviewByNameWithCrop$3(this);
        Consumer consumer = new Consumer() { // from class: Gj0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadPreviewImageViewModel.m2571C(loadPreviewImageViewModel$getImagePreviewByNameWithCrop$3, obj);
            }
        };
        final LoadPreviewImageViewModel$getImagePreviewByNameWithCrop$4 loadPreviewImageViewModel$getImagePreviewByNameWithCrop$4 = LoadPreviewImageViewModel$getImagePreviewByNameWithCrop$4.INSTANCE;
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: Hj0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadPreviewImageViewModel.m2544z(loadPreviewImageViewModel$getImagePreviewByNameWithCrop$4, obj);
            }
        }));
    }

    public final void getImagePreviewByNameWithWatermark(@NotNull String imageName, @NotNull String waterMarkText) {
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(waterMarkText, "waterMarkText");
        Observable m2551s = m2551s(imageName, waterMarkText);
        CompositeDisposable compositeDisposable = this.f106052d;
        Observable compose = m2551s.compose(this.f106049a.applyAsync());
        final LoadPreviewImageViewModel$getImagePreviewByNameWithWatermark$1 loadPreviewImageViewModel$getImagePreviewByNameWithWatermark$1 = LoadPreviewImageViewModel$getImagePreviewByNameWithWatermark$1.INSTANCE;
        Consumer consumer = new Consumer() { // from class: yj0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadPreviewImageViewModel.m2570D(loadPreviewImageViewModel$getImagePreviewByNameWithWatermark$1, obj);
            }
        };
        final LoadPreviewImageViewModel$getImagePreviewByNameWithWatermark$2 loadPreviewImageViewModel$getImagePreviewByNameWithWatermark$2 = LoadPreviewImageViewModel$getImagePreviewByNameWithWatermark$2.INSTANCE;
        compositeDisposable.add(compose.subscribe(consumer, new Consumer() { // from class: Dj0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LoadPreviewImageViewModel.m2569E(loadPreviewImageViewModel$getImagePreviewByNameWithWatermark$2, obj);
            }
        }));
    }

    @NotNull
    public final Rx2ThreadService getThreadService() {
        return this.f106049a;
    }

    @NotNull
    public final MutableLiveData<Pair<byte[], byte[]>> getViewModelBitmap() {
        return (MutableLiveData) this.f106054f.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f106052d.clear();
    }

    /* renamed from: p */
    public final Observable m2554p(final String str) {
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: zj0
            {
                LoadPreviewImageViewModel.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap m2553q;
                m2553q = LoadPreviewImageViewModel.m2553q(LoadPreviewImageViewModel.this, str);
                return m2553q;
            }
        });
        final LoadPreviewImageViewModel$getBitmapObservable$2 loadPreviewImageViewModel$getBitmapObservable$2 = LoadPreviewImageViewModel$getBitmapObservable$2.INSTANCE;
        Observable compose = fromCallable.map(new Function() { // from class: Aj0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                byte[] m2552r;
                m2552r = LoadPreviewImageViewModel.m2552r(loadPreviewImageViewModel$getBitmapObservable$2, obj);
                return m2552r;
            }
        }).retry(2L).compose(this.f106049a.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "fromCallable { bitmapUti…ervice.applyBackground())");
        return compose;
    }

    /* renamed from: s */
    public final Observable m2551s(final String str, final String str2) {
        Observable fromCallable = Observable.fromCallable(new Callable() { // from class: Bj0
            {
                LoadPreviewImageViewModel.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap m2550t;
                m2550t = LoadPreviewImageViewModel.m2550t(LoadPreviewImageViewModel.this, str, str2);
                return m2550t;
            }
        });
        final LoadPreviewImageViewModel$getBitmapObservableWithWatermark$2 loadPreviewImageViewModel$getBitmapObservableWithWatermark$2 = LoadPreviewImageViewModel$getBitmapObservableWithWatermark$2.INSTANCE;
        Observable compose = fromCallable.map(new Function() { // from class: Cj0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                byte[] m2549u;
                m2549u = LoadPreviewImageViewModel.m2549u(loadPreviewImageViewModel$getBitmapObservableWithWatermark$2, obj);
                return m2549u;
            }
        }).compose(this.f106049a.applyBackground());
        Intrinsics.checkNotNullExpressionValue(compose, "fromCallable { drawBitma…ervice.applyBackground())");
        return compose;
    }
}