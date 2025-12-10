package th.p047co.dtac.android.dtacone.viewmodel.face_recognition.detection;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.model.bitmap.FaceDetectedBitmap;
import th.p047co.dtac.android.dtacone.viewmodel.face_recognition.detection.FaceDetectionViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.face_recognition.detection.FaceDetectionViewModel$faceDetectionByBitmapCollection$5 */
/* loaded from: classes9.dex */
public final class FaceDetectionViewModel$faceDetectionByBitmapCollection$5 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ FaceDetectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetectionViewModel$faceDetectionByBitmapCollection$5(BitmapCollection bitmapCollection, FaceDetectionViewModel faceDetectionViewModel) {
        super(1);
        this.$bitmap = bitmapCollection;
        this.this$0 = faceDetectionViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        FaceDetectionViewModel.STATE_DETECT state_detect = FaceDetectionViewModel.STATE_DETECT.NOT_FOND;
        Bitmap bitmap = this.$bitmap.getBitmap();
        Intrinsics.checkNotNull(bitmap);
        FaceDetectedBitmap faceDetectedBitmap = new FaceDetectedBitmap(state_detect, bitmap);
        FaceDetectionViewModel faceDetectionViewModel = this.this$0;
        String name = this.$bitmap.getName();
        if (name == null) {
            name = "";
        }
        faceDetectionViewModel.m2663o(faceDetectedBitmap, name);
    }
}