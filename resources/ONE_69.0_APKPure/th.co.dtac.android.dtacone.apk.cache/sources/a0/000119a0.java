package th.p047co.dtac.android.dtacone.manager.face;

import com.google.mlkit.vision.face.Face;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "listFaces", "", "Lcom/google/mlkit/vision/face/Face;", "kotlin.jvm.PlatformType", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.face.FaceDetection$onDetectedMlKit$1 */
/* loaded from: classes7.dex */
public final class FaceDetection$onDetectedMlKit$1 extends Lambda implements Function1<List<Face>, Unit> {
    final /* synthetic */ Function0<Unit> $fail;
    final /* synthetic */ String $minFaceCounter;
    final /* synthetic */ Function0<Unit> $success;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetection$onDetectedMlKit$1(String str, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$minFaceCounter = str;
        this.$success = function0;
        this.$fail = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<Face> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Face> list) {
        int size = list.size();
        String minFaceCounter = this.$minFaceCounter;
        Intrinsics.checkNotNullExpressionValue(minFaceCounter, "minFaceCounter");
        if (size >= Integer.parseInt(minFaceCounter)) {
            this.$success.invoke();
        } else {
            this.$fail.invoke();
        }
    }
}