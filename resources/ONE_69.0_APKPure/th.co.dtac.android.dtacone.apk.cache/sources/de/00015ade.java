package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import android.graphics.Bitmap;
import com.google.firebase.p015ml.vision.barcode.FirebaseVisionBarcode;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import timber.log.Timber;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", OptionalModuleUtils.BARCODE, "", "Lcom/google/firebase/ml/vision/barcode/FirebaseVisionBarcode;", "kotlin.jvm.PlatformType", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel$detectInImage$1 */
/* loaded from: classes9.dex */
public final class QRViewModel$detectInImage$1 extends Lambda implements Function1<List<FirebaseVisionBarcode>, Unit> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ QRViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRViewModel$detectInImage$1(QRViewModel qRViewModel, Bitmap bitmap) {
        super(1);
        this.this$0 = qRViewModel;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<FirebaseVisionBarcode> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<FirebaseVisionBarcode> list) {
        int valueType;
        AtomicBoolean atomicBoolean;
        PublishSubject m1887q;
        for (FirebaseVisionBarcode firebaseVisionBarcode : list) {
            String rawValue = firebaseVisionBarcode.getRawValue();
            if (rawValue != null && rawValue.length() != 0 && ((valueType = firebaseVisionBarcode.getValueType()) == 7 || valueType == 8)) {
                atomicBoolean = this.this$0.f107069e;
                atomicBoolean.set(true);
                String rawValue2 = firebaseVisionBarcode.getRawValue();
                String displayValue = firebaseVisionBarcode.getDisplayValue();
                Timber.m1420d("QR : raw :" + rawValue2 + "  , display :" + displayValue, new Object[0]);
                m1887q = this.this$0.m1887q();
                Bitmap bitmap = this.$bitmap;
                String rawValue3 = firebaseVisionBarcode.getRawValue();
                Intrinsics.checkNotNull(rawValue3);
                m1887q.onNext(new Pair(bitmap, rawValue3));
            }
        }
    }
}