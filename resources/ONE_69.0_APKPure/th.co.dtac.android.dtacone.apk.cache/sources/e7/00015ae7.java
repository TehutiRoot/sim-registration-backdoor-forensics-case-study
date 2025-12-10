package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import android.graphics.Bitmap;
import com.google.firebase.p015ml.vision.common.FirebaseVisionImage;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Landroid/graphics/Bitmap;", "Lcom/google/firebase/ml/vision/common/FirebaseVisionImage;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel$start$1$4 */
/* loaded from: classes9.dex */
public final class QRViewModel$start$1$4 extends Lambda implements Function1<Pair<? extends Bitmap, ? extends FirebaseVisionImage>, Unit> {
    final /* synthetic */ QRViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRViewModel$start$1$4(QRViewModel qRViewModel) {
        super(1);
        this.this$0 = qRViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Bitmap, ? extends FirebaseVisionImage> pair) {
        invoke2((Pair<Bitmap, ? extends FirebaseVisionImage>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<Bitmap, ? extends FirebaseVisionImage> pair) {
        Bitmap bitmap = pair.component1();
        FirebaseVisionImage image = pair.component2();
        QRViewModel qRViewModel = this.this$0;
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        Intrinsics.checkNotNullExpressionValue(image, "image");
        qRViewModel.m1893k(bitmap, image);
    }
}