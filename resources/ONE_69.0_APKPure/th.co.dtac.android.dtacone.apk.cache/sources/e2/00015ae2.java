package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import com.google.firebase.p015ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Lcom/google/firebase/ml/vision/barcode/FirebaseVisionBarcodeDetectorOptions;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.QRViewModel$options$2 */
/* loaded from: classes9.dex */
public final class QRViewModel$options$2 extends Lambda implements Function0<FirebaseVisionBarcodeDetectorOptions> {
    public static final QRViewModel$options$2 INSTANCE = new QRViewModel$options$2();

    public QRViewModel$options$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FirebaseVisionBarcodeDetectorOptions invoke() {
        FirebaseVisionBarcodeDetectorOptions build = new FirebaseVisionBarcodeDetectorOptions.Builder().setBarcodeFormats(256, new int[0]).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        return build;
    }
}