package th.p047co.dtac.android.dtacone.manager.face;

import com.google.mlkit.vision.face.Face;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m28850d2 = {"<anonymous>", "", "listFaces", "", "Lcom/google/mlkit/vision/face/Face;", "kotlin.jvm.PlatformType", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.manager.face.FaceDetection$onDetectedMlKit$3 */
/* loaded from: classes7.dex */
public final class FaceDetection$onDetectedMlKit$3 extends Lambda implements Function1<List<Face>, Unit> {
    final /* synthetic */ Function0<Unit> $fail;
    final /* synthetic */ String $minFaceCounter;
    final /* synthetic */ long $startTime;
    final /* synthetic */ Function0<Unit> $success;
    final /* synthetic */ FaceDetection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetection$onDetectedMlKit$3(String str, Function0<Unit> function0, Function0<Unit> function02, long j, FaceDetection faceDetection) {
        super(1);
        this.$minFaceCounter = str;
        this.$success = function0;
        this.$fail = function02;
        this.$startTime = j;
        this.this$0 = faceDetection;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<Face> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Face> list) {
        PreferencesRepository preferencesRepository;
        int size = list.size();
        String minFaceCounter = this.$minFaceCounter;
        Intrinsics.checkNotNullExpressionValue(minFaceCounter, "minFaceCounter");
        if (size >= Integer.parseInt(minFaceCounter)) {
            this.$success.invoke();
        } else {
            this.$fail.invoke();
        }
        if (TimeUnit.SECONDS.convert(System.nanoTime() - this.$startTime, TimeUnit.NANOSECONDS) > 15) {
            preferencesRepository = this.this$0.f84930c;
            preferencesRepository.setBoolean(Constant.PREF_SLOW_FACE_DETECT, true);
        }
    }
}
