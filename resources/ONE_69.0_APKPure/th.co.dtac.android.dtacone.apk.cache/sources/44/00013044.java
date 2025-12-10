package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ImageDocumentType;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneESignScreen;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/upPass/UpPassFormResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$oneESignNavGraph$1$11 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$oneESignNavGraph$1$11 extends Lambda implements Function1<UpPassFormResult, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignNavGraphKt$oneESignNavGraph$1$11(OneConsentAndESignViewModel oneConsentAndESignViewModel, NavController navController, ValidateDocApproved validateDocApproved, CoroutineScope coroutineScope, Function0<Unit> function0) {
        super(1);
        this.$viewModel = oneConsentAndESignViewModel;
        this.$navController = navController;
        this.$validateDocApproved = validateDocApproved;
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
        Intrinsics.checkNotNullParameter(it, "it");
        this.$viewModel.setUpPassResult(it);
        OneConsentAndESignViewModel oneConsentAndESignViewModel = this.$viewModel;
        oneConsentAndESignViewModel.updatePhotoStoreLists(oneConsentAndESignViewModel.getCustomerConfig().getValue().isAttorney() ? ImageDocumentType.FACE_ATTORNEY : ImageDocumentType.FACE);
        this.$viewModel.updateValidateDocApproved(DocumentType.FACE_RECOGNITION.getDocType(), true);
        if (this.$viewModel.getCustomerConfig().getValue().isAttorney() && this.$viewModel.isRequiredOptionalList()) {
            this.$viewModel.clearOptionalPhotoName();
            NavController.navigate$default(this.$navController, OneESignScreen.ESign.TakePhoto.ROUTE, null, null, 6, null);
        } else if (this.$validateDocApproved.isAllDocumentApproved()) {
            this.$viewModel.updateForms();
        } else {
            OneConsentAndESignNavGraphKt.navigateNextDocumentToApprove(this.$validateDocApproved, this.$navController, this.$scope, this.$onOptionTakeMorePhoto);
        }
    }
}