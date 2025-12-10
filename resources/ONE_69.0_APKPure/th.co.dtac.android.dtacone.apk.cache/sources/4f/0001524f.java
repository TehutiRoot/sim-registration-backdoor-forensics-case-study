package th.p047co.dtac.android.dtacone.view.fragment.multi_sim.one_common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.presenter.bitmap.SaveBitmapWithWaterMarkPresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.one_common.MrtrMultiSimNavigateToCommonFragment$navigateToIdCardFlow$2 */
/* loaded from: classes9.dex */
public final class MrtrMultiSimNavigateToCommonFragment$navigateToIdCardFlow$2 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ MrtrMultiSimNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMultiSimNavigateToCommonFragment$navigateToIdCardFlow$2(MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment) {
        super(1);
        this.this$0 = mrtrMultiSimNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult it) {
        MrtrPrepaidMultiSimViewModel viewModel;
        MrtrPrepaidMultiSimViewModel viewModel2;
        MrtrPrepaidMultiSimViewModel viewModel3;
        String birthday;
        MrtrPrepaidMultiSimViewModel viewModel4;
        MrtrPrepaidMultiSimViewModel viewModel5;
        MrtrPrepaidMultiSimViewModel viewModel6;
        MrtrPrepaidMultiSimViewModel viewModel7;
        MrtrPrepaidMultiSimViewModel viewModel8;
        MrtrPrepaidMultiSimViewModel viewModel9;
        MrtrPrepaidMultiSimViewModel viewModel10;
        MrtrPrepaidMultiSimViewModel viewModel11;
        MrtrPrepaidMultiSimViewModel viewModel12;
        Intrinsics.checkNotNullParameter(it, "it");
        viewModel = this.this$0.getViewModel();
        viewModel.setIdDocumentResultForOcr(it.getIdDocument());
        IdDocumentResult idDocument = it.getIdDocument();
        if (Intrinsics.areEqual(idDocument != null ? idDocument.getDocType() : null, "I")) {
            if (it.isCardReader()) {
                IdCardInformationCollection idCardInformation = it.getIdDocument().getIdCardInformation();
                viewModel11 = this.this$0.getViewModel();
                viewModel11.storeIdCardInformation(idCardInformation);
                this.this$0.setSmartCard(true);
                viewModel12 = this.this$0.getViewModel();
                viewModel12.setSmartCard(true);
            } else {
                this.this$0.setCardId(it.getIdDocument().getDocNumber());
                viewModel8 = this.this$0.getViewModel();
                viewModel8.setCameraBirthDate(StringExtKt.convertDateTH(it.getIdDocument().getBirthday(), "yyyy-MM-dd", false, "yyyyMMdd", true));
                viewModel9 = this.this$0.getViewModel();
                viewModel9.storeCardType("THAI_ID_CARD");
                this.this$0.setSmartCard(false);
                viewModel10 = this.this$0.getViewModel();
                viewModel10.setSmartCard(false);
            }
        } else {
            IdDocumentResult idDocument2 = it.getIdDocument();
            if (Intrinsics.areEqual(idDocument2 != null ? idDocument2.getDocType() : null, "P")) {
                this.this$0.setCardId(it.getIdDocument().getDocNumber());
                viewModel5 = this.this$0.getViewModel();
                viewModel5.setCameraBirthDate(StringExtKt.convertDateTH(it.getIdDocument().getBirthday(), "yyyy-MM-dd", false, "yyyyMMdd", true));
                viewModel6 = this.this$0.getViewModel();
                viewModel6.storeCardType("PASSPORT");
                this.this$0.setSmartCard(false);
                viewModel7 = this.this$0.getViewModel();
                viewModel7.setSmartCard(false);
            } else {
                MrtrMultiSimNavigateToCommonFragment mrtrMultiSimNavigateToCommonFragment = this.this$0;
                IdDocumentResult idDocument3 = it.getIdDocument();
                mrtrMultiSimNavigateToCommonFragment.setCardId((idDocument3 == null || (r1 = idDocument3.getDocNumber()) == null) ? "" : "");
                IdDocumentResult idDocument4 = it.getIdDocument();
                if (idDocument4 != null && (birthday = idDocument4.getBirthday()) != null) {
                    viewModel4 = this.this$0.getViewModel();
                    viewModel4.setCameraBirthDate(StringExtKt.convertDateTH(birthday, "yyyy-MM-dd", false, "yyyyMMdd", true));
                }
                viewModel2 = this.this$0.getViewModel();
                viewModel2.storeCardType("OTHER");
                this.this$0.setSmartCard(false);
                viewModel3 = this.this$0.getViewModel();
                viewModel3.setSmartCard(false);
            }
        }
        SaveBitmapWithWaterMarkPresenter saveBitmapWithWaterMarkPresenter = this.this$0.getSaveBitmapWithWaterMarkPresenter();
        String string = (!this.this$0.isAdded() || this.this$0.getContext() == null) ? "ใช้เพื่อการลงทะเบียนหมายเลขโทรศัพท์เคลื่อนที่เท่านั้น" : this.this$0.requireContext().getString(R.string.prepaid_registration_summary_watermark);
        Intrinsics.checkNotNullExpressionValue(string, "if (isAdded && context !…รศัพท์เคลื่อนที่เท่านั้น\"");
        saveBitmapWithWaterMarkPresenter.saveImageWatermark(BitmapUtil.IMAGE_ID_CARD, BitmapUtil.IMAGE_ID_CARD_WITH_WATERMARK, string);
    }
}