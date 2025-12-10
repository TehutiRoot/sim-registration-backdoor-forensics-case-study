package th.p047co.dtac.android.dtacone.p051rx;

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
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "kotlin.jvm.PlatformType", "bitmap", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.rx.RxBitmap$applyCropBitmap$1$1 */
/* loaded from: classes8.dex */
public final class RxBitmap$applyCropBitmap$1$1 extends Lambda implements Function1<BitmapCollection, ObservableSource<? extends BitmapCollection>> {
    final /* synthetic */ RxBitmap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxBitmap$applyCropBitmap$1$1(RxBitmap rxBitmap) {
        super(1);
        this.this$0 = rxBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapCollection invoke$lambda$0(RxBitmap this$0, BitmapCollection bitmap) {
        BitmapUtil bitmapUtil;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        bitmapUtil = this$0.f86989a;
        Bitmap bitmap2 = bitmap.getBitmap();
        Intrinsics.checkNotNull(bitmap2);
        byte[] cropImage = bitmapUtil.cropImage(bitmap2);
        Intrinsics.checkNotNullExpressionValue(cropImage, "bitmapUtil.cropImage(bitmap.bitmap!!)");
        return new BitmapCollection(bitmap.getName(), BitmapExtKt.toBitmap(cropImage));
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends BitmapCollection> invoke(@NotNull final BitmapCollection bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final RxBitmap rxBitmap = this.this$0;
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.rx.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BitmapCollection invoke$lambda$0;
                invoke$lambda$0 = RxBitmap$applyCropBitmap$1$1.invoke$lambda$0(RxBitmap.this, bitmap);
                return invoke$lambda$0;
            }
        });
    }
}