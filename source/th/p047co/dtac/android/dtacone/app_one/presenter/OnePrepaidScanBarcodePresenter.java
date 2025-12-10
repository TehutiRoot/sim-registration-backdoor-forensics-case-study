package th.p047co.dtac.android.dtacone.app_one.presenter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.presenter.OnePrepaidScanBarcodePresenter;
import th.p047co.dtac.android.dtacone.data.remote.RTRApiRx2;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.presenter.IPresenter;
import th.p047co.dtac.android.dtacone.presenter.ISecondaryLoadingViewable;
import th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001-B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b!\u0010+¨\u0006."}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/presenter/OnePrepaidScanBarcodePresenter;", "Lth/co/dtac/android/dtacone/presenter/LifecyclePresenter;", "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", "api", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "errorService", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "cardReaderService", "<init>", "(Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;)V", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", Promotion.ACTION_VIEW, "", "attachView", "(Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;)V", "", "data", "", OptionalModuleUtils.BARCODE, "saveBarcode", "([BLjava/lang/String;)V", "onStop", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/data/remote/RTRApiRx2;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/ServerErrorService;", "d", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "e", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "Lth/co/dtac/android/dtacone/app_one/presenter/OnePrepaidScanBarcodePresenter$View;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/presenter/OnePrepaidScanBarcodePresenter$View;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", "()Lio/reactivex/disposables/CompositeDisposable;", "subscriptions", "View", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OnePrepaidScanBarcodePresenter */
/* loaded from: classes7.dex */
public final class OnePrepaidScanBarcodePresenter extends LifecyclePresenter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final RTRApiRx2 f82322a;

    /* renamed from: b */
    public final Rx2ThreadService f82323b;

    /* renamed from: c */
    public final ServerErrorService f82324c;

    /* renamed from: d */
    public final BitmapUtil f82325d;

    /* renamed from: e */
    public final CardReaderService f82326e;

    /* renamed from: f */
    public View f82327f;

    /* renamed from: g */
    public final Lazy f82328g;

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&¨\u0006\n"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/presenter/OnePrepaidScanBarcodePresenter$View;", "Lth/co/dtac/android/dtacone/presenter/IPresenter$IView;", "Lth/co/dtac/android/dtacone/presenter/ISecondaryLoadingViewable;", "onError", "", "message", "", "onSaveBarcodeSuccess", ClientCookie.PATH_ATTR, OptionalModuleUtils.BARCODE, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OnePrepaidScanBarcodePresenter$View */
    /* loaded from: classes7.dex */
    public interface View extends IPresenter.IView, ISecondaryLoadingViewable {
        void onError(@NotNull String str);

        void onSaveBarcodeSuccess(@NotNull String str, @NotNull String str2);
    }

    @Inject
    public OnePrepaidScanBarcodePresenter(@NotNull RTRApiRx2 api, @NotNull Rx2ThreadService threadService, @NotNull ServerErrorService errorService, @NotNull BitmapUtil bitmapUtil, @NotNull CardReaderService cardReaderService) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(cardReaderService, "cardReaderService");
        this.f82322a = api;
        this.f82323b = threadService;
        this.f82324c = errorService;
        this.f82325d = bitmapUtil;
        this.f82326e = cardReaderService;
        this.f82328g = LazyKt__LazyJVMKt.lazy(OnePrepaidScanBarcodePresenter$subscriptions$2.INSTANCE);
    }

    /* renamed from: a */
    public static /* synthetic */ void m20165a(Function1 function1, Object obj) {
        m20159g(function1, obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20164b(Function1 function1, Object obj) {
        m20160f(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20163c(OnePrepaidScanBarcodePresenter onePrepaidScanBarcodePresenter, byte[] bArr, ObservableEmitter observableEmitter) {
        m20161e(onePrepaidScanBarcodePresenter, bArr, observableEmitter);
    }

    /* renamed from: e */
    public static final void m20161e(OnePrepaidScanBarcodePresenter this$0, byte[] data, ObservableEmitter it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            it.onNext(this$0.f82325d.saveInternalImage(data, BitmapUtil.IMAGE_BARCODE));
            it.onComplete();
        } catch (Exception e) {
            if (!it.isDisposed()) {
                it.onError(e);
            }
        }
    }

    /* renamed from: f */
    public static final void m20160f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m20159g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void attachView(@Nullable IPresenter.IView iView) {
        Intrinsics.checkNotNull(iView, "null cannot be cast to non-null type th.co.dtac.android.dtacone.app_one.presenter.OnePrepaidScanBarcodePresenter.View");
        this.f82327f = (View) iView;
    }

    /* renamed from: d */
    public final CompositeDisposable m20162d() {
        return (CompositeDisposable) this.f82328g.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.presenter.LifecyclePresenter, th.p047co.dtac.android.dtacone.presenter.IPresenter
    public void onStop() {
        m20162d().clear();
    }

    public final void saveBarcode(@NotNull final byte[] data, @NotNull String barcode) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        View view = this.f82327f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.showSecondaryLoading();
        CompositeDisposable m20162d = m20162d();
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: y81
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                OnePrepaidScanBarcodePresenter.m20163c(OnePrepaidScanBarcodePresenter.this, data, observableEmitter);
            }
        }).compose(this.f82323b.applyAsync());
        final OnePrepaidScanBarcodePresenter$saveBarcode$2 onePrepaidScanBarcodePresenter$saveBarcode$2 = new OnePrepaidScanBarcodePresenter$saveBarcode$2(this, barcode);
        Consumer consumer = new Consumer() { // from class: z81
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePrepaidScanBarcodePresenter.m20164b(onePrepaidScanBarcodePresenter$saveBarcode$2, obj);
            }
        };
        final OnePrepaidScanBarcodePresenter$saveBarcode$3 onePrepaidScanBarcodePresenter$saveBarcode$3 = new OnePrepaidScanBarcodePresenter$saveBarcode$3(this);
        m20162d.add(compose.subscribe(consumer, new Consumer() { // from class: A81
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePrepaidScanBarcodePresenter.m20165a(onePrepaidScanBarcodePresenter$saveBarcode$3, obj);
            }
        }));
    }
}
