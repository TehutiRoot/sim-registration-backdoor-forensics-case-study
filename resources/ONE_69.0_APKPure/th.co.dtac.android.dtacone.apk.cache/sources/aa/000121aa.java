package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;
import th.p047co.dtac.android.dtacone.presenter.bitmap.ConcatBitmapPresenter;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/presenter/bitmap/ConcatBitmapPresenter$ComposeBitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.ConcatBitmapPresenter$concatWithBarcode$2 */
/* loaded from: classes8.dex */
public final class ConcatBitmapPresenter$concatWithBarcode$2 extends Lambda implements Function1<ConcatBitmapPresenter.ComposeBitmap, ObservableSource<? extends Bitmap>> {
    final /* synthetic */ ConcatBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcatBitmapPresenter$concatWithBarcode$2(ConcatBitmapPresenter concatBitmapPresenter) {
        super(1);
        this.this$0 = concatBitmapPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Bitmap> invoke(@NotNull ConcatBitmapPresenter.ComposeBitmap it) {
        Observable m18936k;
        Intrinsics.checkNotNullParameter(it, "it");
        m18936k = this.this$0.m18936k(BitmapExtKt.toByteArray(it.getIdCard()), it.getBarcode());
        return m18936k;
    }
}