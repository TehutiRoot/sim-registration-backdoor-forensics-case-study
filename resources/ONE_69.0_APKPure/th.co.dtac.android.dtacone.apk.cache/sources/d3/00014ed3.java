package th.p047co.dtac.android.dtacone.view.fragment.mrtr_mnp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.presenter.bitmap.SaveBitmapWithWaterMarkPresenter;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_mnp.MrtrMnpNavigateToCommonFragment$navigateToCommonOCR$2 */
/* loaded from: classes9.dex */
public final class MrtrMnpNavigateToCommonFragment$navigateToCommonOCR$2 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ MrtrMnpNavigateToCommonFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpNavigateToCommonFragment$navigateToCommonOCR$2(MrtrMnpNavigateToCommonFragment mrtrMnpNavigateToCommonFragment) {
        super(1);
        this.this$0 = mrtrMnpNavigateToCommonFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult it) {
        MrtrMnpViewModel viewModel;
        MrtrMnpViewModel viewModel2;
        MrtrMnpViewModel viewModel3;
        MrtrMnpViewModel viewModel4;
        MrtrMnpViewModel viewModel5;
        MrtrMnpViewModel viewModel6;
        MrtrMnpViewModel viewModel7;
        MrtrMnpViewModel viewModel8;
        MrtrMnpViewModel viewModel9;
        MrtrMnpViewModel viewModel10;
        MrtrMnpViewModel viewModel11;
        MrtrMnpViewModel viewModel12;
        MrtrMnpViewModel viewModel13;
        MrtrMnpViewModel viewModel14;
        MrtrMnpViewModel viewModel15;
        MrtrMnpViewModel viewModel16;
        MrtrMnpViewModel viewModel17;
        MrtrMnpViewModel viewModel18;
        Intrinsics.checkNotNullParameter(it, "it");
        viewModel = this.this$0.getViewModel();
        viewModel.setIdDocumentResultForOcr(it.getIdDocument());
        IdDocumentResult idDocument = it.getIdDocument();
        if (Intrinsics.areEqual(idDocument != null ? idDocument.getDocType() : null, "I")) {
            if (it.isCardReader()) {
                viewModel14 = this.this$0.getViewModel();
                viewModel14.setCardInformation(it.getIdDocument().getIdCardInformation());
                viewModel15 = this.this$0.getViewModel();
                IdCardInformationCollection idCardInformation = it.getIdDocument().getIdCardInformation();
                viewModel15.setIdNumber(idCardInformation != null ? idCardInformation.getIdCard() : null);
                viewModel16 = this.this$0.getViewModel();
                viewModel16.setIdType("01");
                viewModel17 = this.this$0.getViewModel();
                viewModel17.setCardType("THAI_ID_CARD");
                this.this$0.setSmartCard(true);
                viewModel18 = this.this$0.getViewModel();
                viewModel18.setSmartCard(true);
            } else {
                viewModel10 = this.this$0.getViewModel();
                viewModel10.setIdNumber(it.getIdDocument().getDocNumber());
                viewModel11 = this.this$0.getViewModel();
                viewModel11.setIdType("01");
                viewModel12 = this.this$0.getViewModel();
                viewModel12.setCardType("THAI_ID_CARD");
                this.this$0.setCardId(it.getIdDocument().getDocNumber());
                this.this$0.setSmartCard(false);
                viewModel13 = this.this$0.getViewModel();
                viewModel13.setSmartCard(false);
            }
        } else {
            IdDocumentResult idDocument2 = it.getIdDocument();
            if (Intrinsics.areEqual(idDocument2 != null ? idDocument2.getDocType() : null, "P")) {
                viewModel6 = this.this$0.getViewModel();
                viewModel6.setIdNumber(it.getIdDocument().getDocNumber());
                viewModel7 = this.this$0.getViewModel();
                viewModel7.setIdType("15");
                viewModel8 = this.this$0.getViewModel();
                viewModel8.setCardType("PASSPORT");
                this.this$0.setSmartCard(false);
                viewModel9 = this.this$0.getViewModel();
                viewModel9.setSmartCard(false);
            } else {
                viewModel2 = this.this$0.getViewModel();
                IdDocumentResult idDocument3 = it.getIdDocument();
                viewModel2.setIdNumber((idDocument3 == null || (r6 = idDocument3.getDocNumber()) == null) ? "" : "");
                viewModel3 = this.this$0.getViewModel();
                viewModel3.setIdType("15");
                viewModel4 = this.this$0.getViewModel();
                viewModel4.setCardType("OTHER");
                this.this$0.setSmartCard(false);
                viewModel5 = this.this$0.getViewModel();
                viewModel5.setSmartCard(false);
            }
        }
        SaveBitmapWithWaterMarkPresenter saveBitmapWithWaterMarkPresenter = this.this$0.getSaveBitmapWithWaterMarkPresenter();
        String string = this.this$0.getString(R.string.prepaid_registration_summary_watermark);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.prepa…ration_summary_watermark)");
        saveBitmapWithWaterMarkPresenter.saveImageWatermark(BitmapUtil.IMAGE_ID_CARD, BitmapUtil.IMAGE_ID_CARD_WITH_WATERMARK, string);
    }
}