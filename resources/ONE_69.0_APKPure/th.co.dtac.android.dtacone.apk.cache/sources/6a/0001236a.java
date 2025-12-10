package th.p047co.dtac.android.dtacone.presenter.face_detection;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.presenter.face_detection.FaceDetectionPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "isDetected", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.face_detection.FaceDetectionPresenter$verifyIdCardImageByFaceDetection$4 */
/* loaded from: classes8.dex */
public final class FaceDetectionPresenter$verifyIdCardImageByFaceDetection$4 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ FaceDetectionPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceDetectionPresenter$verifyIdCardImageByFaceDetection$4(FaceDetectionPresenter faceDetectionPresenter) {
        super(1);
        this.this$0 = faceDetectionPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        FaceDetectionPresenter.View view;
        FaceDetectionPresenter.View view2;
        FaceDetectionPresenter.View view3 = null;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            view2 = this.this$0.f85802d;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view3 = view2;
            }
            view3.onFaceDetected();
            return;
        }
        view = this.this$0.f85802d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view;
        }
        view3.onFaceNotFound();
    }
}