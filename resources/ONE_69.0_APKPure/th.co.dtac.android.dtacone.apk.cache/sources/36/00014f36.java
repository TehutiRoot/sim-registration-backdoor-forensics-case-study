package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_postpaid_registration.MrtrPostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.model.MrtrPostpaidStatusFlow;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_STATUS, "Lth/co/dtac/android/dtacone/view/fragment/mrtr_postpaid_registration/model/MrtrPostpaidStatusFlow;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidCommonFragment$navigateToSharingConsent$1 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidCommonFragment$navigateToSharingConsent$1 extends Lambda implements Function1<MrtrPostpaidStatusFlow, Unit> {
    final /* synthetic */ MrtrPostpaidCommonFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidCommonFragment$navigateToSharingConsent$1$1 */
    /* loaded from: classes9.dex */
    public static final class C162331 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ MrtrPostpaidCommonFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C162331(MrtrPostpaidCommonFragment mrtrPostpaidCommonFragment) {
            super(1);
            this.this$0 = mrtrPostpaidCommonFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            MrtrPostpaidRegistrationViewModel m6011p;
            MrtrPostpaidRegistrationViewModel m6011p2;
            MrtrPostpaidRegistrationViewModel m6011p3;
            MrtrPostpaidRegistrationViewModel m6011p4;
            UpPassFormType faceCompare;
            MrtrPostpaidRegistrationViewModel m6011p5;
            MrtrPostpaidRegistrationViewModel m6011p6;
            MrtrPostpaidRegistrationViewModel m6011p7;
            m6011p = this.this$0.m6011p();
            if (m6011p.isRequireLiveness()) {
                m6011p5 = this.this$0.m6011p();
                int getMaxAttempFaceRecognitionReRegist = m6011p5.getGetMaxAttempFaceRecognitionReRegist();
                m6011p6 = this.this$0.m6011p();
                boolean isAllowManualKYC = m6011p6.isAllowManualKYC();
                m6011p7 = this.this$0.m6011p();
                faceCompare = new UpPassFormType.FaceCompareLiveness(null, isAllowManualKYC, getMaxAttempFaceRecognitionReRegist, null, m6011p7.getOrderType(), false, null, null, 233, null);
            } else {
                m6011p2 = this.this$0.m6011p();
                int getMaxAttempFaceRecognitionReRegist2 = m6011p2.getGetMaxAttempFaceRecognitionReRegist();
                m6011p3 = this.this$0.m6011p();
                boolean isAllowManualKYC2 = m6011p3.isAllowManualKYC();
                m6011p4 = this.this$0.m6011p();
                faceCompare = new UpPassFormType.FaceCompare(null, isAllowManualKYC2, getMaxAttempFaceRecognitionReRegist2, null, m6011p4.getOrderType(), false, null, null, 233, null);
            }
            this.this$0.navigateNextToCommon(faceCompare);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidCommonFragment$navigateToSharingConsent$1$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MrtrPostpaidStatusFlow.values().length];
            try {
                iArr[MrtrPostpaidStatusFlow.OnSuccess.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MrtrPostpaidStatusFlow.OnTakeMorePhoto.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidCommonFragment$navigateToSharingConsent$1(MrtrPostpaidCommonFragment mrtrPostpaidCommonFragment) {
        super(1);
        this.this$0 = mrtrPostpaidCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPostpaidStatusFlow mrtrPostpaidStatusFlow) {
        invoke2(mrtrPostpaidStatusFlow);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull MrtrPostpaidStatusFlow status) {
        MrtrPostpaidRegistrationActivity m6012o;
        Intrinsics.checkNotNullParameter(status, "status");
        int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            m6012o = this.this$0.m6012o();
            m6012o.deleteImageCallback(BitmapUtil.IMAGE_COMPARE, new C162331(this.this$0));
        } else if (i != 2) {
        } else {
            this.this$0.m6003x();
        }
    }
}