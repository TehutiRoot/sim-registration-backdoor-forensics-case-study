package th.p047co.dtac.android.dtacone.viewmodel.take_photo;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Err;
import th.p047co.dtac.android.dtacone.model.Resource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_ERROR, "Lth/co/dtac/android/dtacone/model/Err;", "imageFail", "Landroid/graphics/Bitmap;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.take_photo.FaceRecognitionViewModel$faceDetection$2 */
/* loaded from: classes9.dex */
public final class FaceRecognitionViewModel$faceDetection$2 extends Lambda implements Function2<Err, Bitmap, Unit> {
    final /* synthetic */ FaceRecognitionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceRecognitionViewModel$faceDetection$2(FaceRecognitionViewModel faceRecognitionViewModel) {
        super(2);
        this.this$0 = faceRecognitionViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Err err, Bitmap bitmap) {
        invoke2(err, bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Err err, @NotNull Bitmap imageFail) {
        MutableLiveData mutableLiveData;
        Intrinsics.checkNotNullParameter(err, "err");
        Intrinsics.checkNotNullParameter(imageFail, "imageFail");
        mutableLiveData = this.this$0.f107063d;
        mutableLiveData.setValue(Resource.Companion.error(err.getSystemMessage(), imageFail, Integer.valueOf(err.getMessageId())));
    }
}