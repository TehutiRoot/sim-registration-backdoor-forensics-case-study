package th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.FaceCompareResult;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.camera.MrtrPostpaidCommonFragment$navigateNextToCommon$upPassFormOnSuccessCallback$1 */
/* loaded from: classes9.dex */
public final class C16232x6a449ee6 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ MrtrPostpaidCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16232x6a449ee6(MrtrPostpaidCommonFragment mrtrPostpaidCommonFragment) {
        super(1);
        this.this$0 = mrtrPostpaidCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult result) {
        MrtrPostpaidRegistrationViewModel m6011p;
        MrtrPostpaidRegistrationViewModel m6011p2;
        MrtrPostpaidRegistrationViewModel m6011p3;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getFormType() instanceof UpPassFormType.Ocr) {
            IdDocumentResult idDocument = result.getIdDocument();
            String docNumber = idDocument != null ? idDocument.getDocNumber() : null;
            m6011p = this.this$0.m6011p();
            boolean areEqual = Intrinsics.areEqual(docNumber, m6011p.getEligibleIdCard());
            m6011p2 = this.this$0.m6011p();
            if (!m6011p2.isEligible() || areEqual) {
                m6011p3 = this.this$0.m6011p();
                m6011p3.setUpPassFormResult(result);
                m6011p3.setSmartCard(result.isCardReader());
                m6011p3.validateIdNumberForCommon(m6011p3.getUpPassFormResult());
                return;
            }
            this.this$0.m6013n("ขออภัยค่ะ รูปบัตรที่ถ่ายไม่ตรงกับเลขที่บัตรที่ระบุในการรับสิทธิ\nกรุณาตรวจสอบและลองใหม่อีกครั้งค่ะ");
            return;
        }
        FaceCompareResult faceCompare = result.getFaceCompare();
        if (faceCompare == null || !faceCompare.isSuccess()) {
            return;
        }
        this.this$0.m6002y(result);
        this.this$0.m6003x();
    }
}