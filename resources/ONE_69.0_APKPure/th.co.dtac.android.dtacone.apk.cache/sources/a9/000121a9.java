package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.presenter.bitmap.ConcatBitmapPresenter;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/presenter/bitmap/ConcatBitmapPresenter$ComposeBitmap;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nConcatBitmapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcatBitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/ConcatBitmapPresenter$concatWithBarcode$1\n+ 2 Observables.kt\nio/reactivex/rxkotlin/Observables\n*L\n1#1,74:1\n124#2,2:75\n*S KotlinDebug\n*F\n+ 1 ConcatBitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/ConcatBitmapPresenter$concatWithBarcode$1\n*L\n43#1:75,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.ConcatBitmapPresenter$concatWithBarcode$1 */
/* loaded from: classes8.dex */
public final class ConcatBitmapPresenter$concatWithBarcode$1 extends Lambda implements Function1<Boolean, ObservableSource<? extends ConcatBitmapPresenter.ComposeBitmap>> {
    final /* synthetic */ Observable<Bitmap> $barcodeObs;
    final /* synthetic */ Observable<Bitmap> $idCardObs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcatBitmapPresenter$concatWithBarcode$1(Observable<Bitmap> observable, Observable<Bitmap> observable2) {
        super(1);
        this.$barcodeObs = observable;
        this.$idCardObs = observable2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends ConcatBitmapPresenter.ComposeBitmap> invoke(@NotNull Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Observables observables = Observables.INSTANCE;
        Observable<Bitmap> barcodeObs = this.$barcodeObs;
        Intrinsics.checkNotNullExpressionValue(barcodeObs, "barcodeObs");
        Observable<Bitmap> idCardObs = this.$idCardObs;
        Intrinsics.checkNotNullExpressionValue(idCardObs, "idCardObs");
        Observable zip = Observable.zip(barcodeObs, idCardObs, new BiFunction<T1, T2, R>() { // from class: th.co.dtac.android.dtacone.presenter.bitmap.ConcatBitmapPresenter$concatWithBarcode$1$invoke$$inlined$zip$1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T1 t1, @NotNull T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) new ConcatBitmapPresenter.ComposeBitmap((Bitmap) t1, (Bitmap) t2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        return zip;
    }
}