package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common;

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
import th.p047co.dtac.android.dtacone.util.constant.postpaid.IdDocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "result", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.common.OnePostpaidNavigateToCommonFragment$navigateNextToCommon$upPassFormOnSuccessCallback$1 */
/* loaded from: classes10.dex */
public final class C14930x5ba00f17 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ OnePostpaidNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14930x5ba00f17(OnePostpaidNavigateToCommonFragment onePostpaidNavigateToCommonFragment) {
        super(1);
        this.this$0 = onePostpaidNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult result) {
        OnePostpaidRegistrationViewModel viewModel;
        OnePostpaidRegistrationViewModel viewModel2;
        OnePostpaidRegistrationViewModel viewModel3;
        OnePostpaidRegistrationViewModel viewModel4;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getFormType() instanceof UpPassFormType.Ocr) {
            viewModel2 = this.this$0.getViewModel();
            viewModel2.mapIDDocument(result);
            viewModel3 = this.this$0.getViewModel();
            IdDocumentResult idDocument = result.getIdDocument();
            viewModel3.setIdDocType(Intrinsics.areEqual(idDocument != null ? idDocument.getDocType() : null, "I") ? IdDocumentType.ID_CARD : IdDocumentType.OTHER_CARD);
            viewModel4 = this.this$0.getViewModel();
            viewModel4.validateIDFromCommon(result);
            return;
        }
        FaceCompareResult faceCompare = result.getFaceCompare();
        if (faceCompare == null || !faceCompare.isSuccess()) {
            return;
        }
        viewModel = this.this$0.getViewModel();
        viewModel.mapCompareDocument(result);
        this.this$0.m12330v();
    }
}