package th.p047co.dtac.android.dtacone.presenter.bitmap;

import android.graphics.Bitmap;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.BitmapExtKt;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.SaveBitmapPresenter$saveBitmapIdCard$2 */
/* loaded from: classes8.dex */
public final class SaveBitmapPresenter$saveBitmapIdCard$2 extends Lambda implements Function1<Bitmap, ObservableSource<? extends Bitmap>> {
    final /* synthetic */ SaveBitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveBitmapPresenter$saveBitmapIdCard$2(SaveBitmapPresenter saveBitmapPresenter) {
        super(1);
        this.this$0 = saveBitmapPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap invoke$lambda$0(SaveBitmapPresenter this$0, Bitmap it) {
        BitmapUtil bitmapUtil;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        bitmapUtil = this$0.f85316b;
        byte[] cropImage = bitmapUtil.cropImage(it);
        Intrinsics.checkNotNullExpressionValue(cropImage, "bitmapUtil.cropImage(it)");
        return BitmapExtKt.toBitmap(cropImage);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends Bitmap> invoke(@NotNull final Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final SaveBitmapPresenter saveBitmapPresenter = this.this$0;
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.presenter.bitmap.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap invoke$lambda$0;
                invoke$lambda$0 = SaveBitmapPresenter$saveBitmapIdCard$2.invoke$lambda$0(SaveBitmapPresenter.this, it);
                return invoke$lambda$0;
            }
        });
    }
}