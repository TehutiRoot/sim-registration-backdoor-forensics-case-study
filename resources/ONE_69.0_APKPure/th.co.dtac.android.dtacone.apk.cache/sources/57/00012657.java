package th.p047co.dtac.android.dtacone.p051rx;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.face.FaceDetection;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Landroid/graphics/Bitmap;", "invoke", "(Landroid/graphics/Bitmap;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.rx.RxFaceDetection$applyDetect$1$1 */
/* loaded from: classes8.dex */
public final class RxFaceDetection$applyDetect$1$1 extends Lambda implements Function1<Bitmap, Boolean> {
    final /* synthetic */ RxFaceDetection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxFaceDetection$applyDetect$1$1(RxFaceDetection rxFaceDetection) {
        super(1);
        this.this$0 = rxFaceDetection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(@NotNull Bitmap it) {
        FaceDetection faceDetection;
        Intrinsics.checkNotNullParameter(it, "it");
        faceDetection = this.this$0.f86991a;
        return Boolean.valueOf(faceDetection.onDetected(it));
    }
}