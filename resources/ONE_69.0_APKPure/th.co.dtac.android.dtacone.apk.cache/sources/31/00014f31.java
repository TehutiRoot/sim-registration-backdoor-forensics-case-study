package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_postpaid_registration.MrtrPostpaidRegistrationActivity;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidCommonFragment$initObservers$1$1 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidCommonFragment$initObservers$1$1 extends Lambda implements Function1<FragmentNavEvent, Unit> {
    final /* synthetic */ MrtrPostpaidCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidCommonFragment$initObservers$1$1(MrtrPostpaidCommonFragment mrtrPostpaidCommonFragment) {
        super(1);
        this.this$0 = mrtrPostpaidCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FragmentNavEvent fragmentNavEvent) {
        invoke2(fragmentNavEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FragmentNavEvent it) {
        MrtrPostpaidRegistrationActivity m6012o;
        MrtrPostpaidRegistrationViewModel m6011p;
        MrtrPostpaidRegistrationViewModel m6011p2;
        MrtrPostpaidRegistrationViewModel m6011p3;
        MrtrPostpaidRegistrationViewModel m6011p4;
        UpPassFormType faceCompare;
        MrtrPostpaidRegistrationViewModel m6011p5;
        MrtrPostpaidRegistrationViewModel m6011p6;
        MrtrPostpaidRegistrationViewModel m6011p7;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getClazz(), UpPassFormFragment.class)) {
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
            return;
        }
        m6012o = this.this$0.m6012o();
        m6012o.replaceFragment(it.buildFragment(), it.getTag());
    }
}