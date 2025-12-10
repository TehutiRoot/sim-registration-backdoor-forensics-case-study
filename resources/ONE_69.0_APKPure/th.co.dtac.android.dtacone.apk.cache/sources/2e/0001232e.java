package th.p047co.dtac.android.dtacone.presenter.face;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.presenter.face.FacePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/presenter/face/FacePresenter$STATE_DETECT;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmap$14 */
/* loaded from: classes8.dex */
public final class FacePresenter$faceDetectionByBitmap$14 extends Lambda implements Function1<FacePresenter.STATE_DETECT, Unit> {
    final /* synthetic */ FacePresenter this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.face.FacePresenter$faceDetectionByBitmap$14$WhenMappings */
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FacePresenter.STATE_DETECT.values().length];
            try {
                iArr[FacePresenter.STATE_DETECT.DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FacePresenter.STATE_DETECT.NOT_FOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacePresenter$faceDetectionByBitmap$14(FacePresenter facePresenter) {
        super(1);
        this.this$0 = facePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FacePresenter.STATE_DETECT state_detect) {
        invoke2(state_detect);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FacePresenter.STATE_DETECT state_detect) {
        FacePresenter.View view;
        FacePresenter.View view2;
        FacePresenter.View view3;
        int i = state_detect == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state_detect.ordinal()];
        FacePresenter.View view4 = null;
        if (i == 1) {
            view = this.this$0.f85774f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view;
            }
            view4.onFaceDetected();
        } else if (i != 2) {
            view3 = this.this$0.f85774f;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view3;
            }
            view4.onByPassConfirmFaceByRTR();
        } else {
            view2 = this.this$0.f85774f;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            } else {
                view4 = view2;
            }
            view4.onFaceNotFound();
        }
    }
}