package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.navigation.NavController;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ImageDocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.Individual;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.IndividualIdentification;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$9 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$oneESignNavGraph$1$9 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ UpPassViewModel $upPassViewModel;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignNavGraphKt$oneESignNavGraph$1$9(OneConsentAndESignViewModel oneConsentAndESignViewModel, UpPassViewModel upPassViewModel, ValidateDocApproved validateDocApproved, NavController navController, CoroutineScope coroutineScope, Function0<Unit> function0) {
        super(1);
        this.$viewModel = oneConsentAndESignViewModel;
        this.$upPassViewModel = upPassViewModel;
        this.$validateDocApproved = validateDocApproved;
        this.$navController = navController;
        this.$scope = coroutineScope;
        this.$onOptionTakeMorePhoto = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
        invoke2(upPassFormResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UpPassFormResult it) {
        List<IndividualIdentification> individualIdentification;
        IndividualIdentification individualIdentification2;
        String identificationId;
        IdCardInformationCollection idCardInformation;
        List<IndividualIdentification> individualIdentification3;
        IndividualIdentification individualIdentification4;
        Intrinsics.checkNotNullParameter(it, "it");
        this.$viewModel.setUpPassResult(it);
        OneConsentAndESignViewModel oneConsentAndESignViewModel = this.$viewModel;
        oneConsentAndESignViewModel.updatePhotoStoreLists(oneConsentAndESignViewModel.getCustomerConfig().getValue().isAttorney() ? ImageDocumentType.ID_CARD_ATTORNEY : ImageDocumentType.ID_CARD);
        Individual individual = this.$viewModel.getCustomerConfig().getValue().getIndividual();
        String str = "";
        if (((individual == null || (individualIdentification3 = individual.getIndividualIdentification()) == null || (individualIdentification4 = individualIdentification3.get(0)) == null || (r0 = individualIdentification4.getIdentificationId()) == null) ? "" : "").length() == 0) {
            this.$viewModel.updateValidateDocApproved(DocumentType.OCR.getDocType(), true);
            this.$upPassViewModel.resetFormState();
            if (this.$validateDocApproved.isAllDocumentApproved()) {
                this.$viewModel.updateForms();
            } else {
                OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto);
            }
        } else if (this.$viewModel.getCustomerConfig().getValue().isAttorney()) {
            this.$viewModel.updateValidateDocApproved(DocumentType.OCR.getDocType(), true);
            this.$upPassViewModel.resetFormState();
            if (this.$validateDocApproved.isAllDocumentApproved()) {
                this.$viewModel.updateForms();
            } else {
                OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto);
            }
        } else {
            IdDocumentResult idDocument = it.getIdDocument();
            String idCard = (idDocument == null || (idCardInformation = idDocument.getIdCardInformation()) == null) ? null : idCardInformation.getIdCard();
            if (idCard == null) {
                idCard = "";
            }
            Individual individual2 = this.$viewModel.getCustomerConfig().getValue().getIndividual();
            if (individual2 != null && (individualIdentification = individual2.getIndividualIdentification()) != null && (individualIdentification2 = individualIdentification.get(0)) != null && (identificationId = individualIdentification2.getIdentificationId()) != null) {
                str = identificationId;
            }
            if (Intrinsics.areEqual(idCard, str)) {
                this.$viewModel.updateValidateDocApproved(DocumentType.OCR.getDocType(), true);
                this.$upPassViewModel.resetFormState();
                if (this.$validateDocApproved.isAllDocumentApproved()) {
                    this.$viewModel.updateForms();
                    return;
                } else {
                    OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto);
                    return;
                }
            }
            this.$viewModel.setValidateIdCard(true);
        }
    }
}