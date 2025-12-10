package th.p047co.dtac.android.dtacone.view.appOne.eSign.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneUpdateAppFormsState;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneUpdateUnifyFormState;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt$NavigateUpload$7 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignNavGraphKt$NavigateUpload$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ OneUpdateAppFormsState $updateAppFormState;
    final /* synthetic */ OneUpdateUnifyFormState $updateUnifyFormState;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;
    final /* synthetic */ ValidateDocApproved $validateDocUpload;
    final /* synthetic */ OneConsentAndESignViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignNavGraphKt$NavigateUpload$7(OneUpdateAppFormsState oneUpdateAppFormsState, ValidateDocApproved validateDocApproved, ValidateDocApproved validateDocApproved2, NavController navController, OneConsentAndESignViewModel oneConsentAndESignViewModel, OneUpdateUnifyFormState oneUpdateUnifyFormState, CoroutineScope coroutineScope, int i) {
        super(2);
        this.$updateAppFormState = oneUpdateAppFormsState;
        this.$validateDocUpload = validateDocApproved;
        this.$validateDocApproved = validateDocApproved2;
        this.$navController = navController;
        this.$viewModel = oneConsentAndESignViewModel;
        this.$updateUnifyFormState = oneUpdateUnifyFormState;
        this.$scope = coroutineScope;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneConsentAndESignNavGraphKt.NavigateUpload(this.$updateAppFormState, this.$validateDocUpload, this.$validateDocApproved, this.$navController, this.$viewModel, this.$updateUnifyFormState, this.$scope, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}