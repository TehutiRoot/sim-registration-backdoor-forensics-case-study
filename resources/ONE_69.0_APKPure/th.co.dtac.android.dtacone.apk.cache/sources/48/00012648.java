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
/* renamed from: th.co.dtac.android.dtacone.rx.RxBitmap$applySaveBitmap$2$1 */
/* loaded from: classes8.dex */
public final class RxBitmap$applySaveBitmap$2$1 extends Lambda implements Function1<BitmapCollection, ObservableSource<? extends BitmapCollection>> {
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    final /* synthetic */ RxBitmap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxBitmap$applySaveBitmap$2$1(RxBitmap rxBitmap, int i, int i2) {
        super(1);
        this.this$0 = rxBitmap;
        this.$width = i;
        this.$height = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BitmapCollection invoke$lambda$0(BitmapCollection bitmap, RxBitmap this$0, int i, int i2) {
        BitmapUtil bitmapUtil;
        Bitmap bitmap2;
        BitmapUtil bitmapUtil2;
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(bitmap.getName(), BitmapUtil.IMAGE_ID_CARD) || Intrinsics.areEqual(bitmap.getName(), BitmapUtil.IMAGE_ID_CARD_WITH_WATERMARK) || Intrinsics.areEqual(bitmap.getName(), BitmapUtil.IMAGE_ATTORNEY_ID_CARD) || Intrinsics.areEqual(bitmap.getName(), BitmapUtil.IMAGE_ATTORNEY_ID_CARD_WITH_WATERMARK) || Intrinsics.areEqual(bitmap.getName(), BitmapUtil.IMAGE_COMPARE) || Intrinsics.areEqual(bitmap.getName(), BitmapUtil.IMAGE_COMPARE_WATERMARK)) {
            bitmapUtil = this$0.f86989a;
            Bitmap bitmap3 = bitmap.getBitmap();
            Intrinsics.checkNotNull(bitmap3);
            byte[] cropImage = bitmapUtil.cropImage(bitmap3, i, i2);
            Intrinsics.checkNotNullExpressionValue(cropImage, "bitmapUtil.cropImage(bit….bitmap!!, width, height)");
            bitmap2 = BitmapExtKt.toBitmap(cropImage);
        } else {
            bitmap2 = bitmap.getBitmap();
            Intrinsics.checkNotNull(bitmap2);
        }
        bitmapUtil2 = this$0.f86989a;
        bitmapUtil2.saveInternalImage(bitmap2, bitmap.getName());
        return new BitmapCollection(bitmap.getName(), bitmap2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ObservableSource<? extends BitmapCollection> invoke(@NotNull final BitmapCollection bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final RxBitmap rxBitmap = this.this$0;
        final int i = this.$width;
        final int i2 = this.$height;
        return Observable.fromCallable(new Callable() { // from class: th.co.dtac.android.dtacone.rx.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BitmapCollection invoke$lambda$0;
                invoke$lambda$0 = RxBitmap$applySaveBitmap$2$1.invoke$lambda$0(BitmapCollection.this, rxBitmap, i, i2);
                return invoke$lambda$0;
            }
        });
    }
}