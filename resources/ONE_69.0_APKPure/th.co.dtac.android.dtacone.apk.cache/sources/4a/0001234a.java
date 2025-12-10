package th.p047co.dtac.android.dtacone.presenter.face;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.presenter.face.FacePresenter;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/presenter/face/FacePresenter$STATE_DETECT;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/presenter/face/FacePresenter$STATE_DETECT;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionWithCounterByImageName$1 */
/* loaded from: classes8.dex */
public final class FacePresenter$faceDetectionWithCounterByImageName$1 extends Lambda implements Function1<Boolean, FacePresenter.STATE_DETECT> {
    final /* synthetic */ int $configCounter;
    final /* synthetic */ FacePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacePresenter$faceDetectionWithCounterByImageName$1(FacePresenter facePresenter, int i) {
        super(1);
        this.this$0 = facePresenter;
        this.$configCounter = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FacePresenter.STATE_DETECT invoke(@NotNull Boolean it) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(it, "it");
        FacePresenter facePresenter = this.this$0;
        i = facePresenter.f85776h;
        facePresenter.f85776h = i + 1;
        if (it.booleanValue()) {
            return FacePresenter.STATE_DETECT.DETECTED;
        }
        i2 = this.this$0.f85776h;
        return i2 > this.$configCounter ? FacePresenter.STATE_DETECT.CONFIRM_BY_RTR : FacePresenter.STATE_DETECT.NOT_FOND;
    }
}