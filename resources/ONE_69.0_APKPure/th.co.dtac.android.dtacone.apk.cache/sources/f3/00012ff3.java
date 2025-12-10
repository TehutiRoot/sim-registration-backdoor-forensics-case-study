package th.p047co.dtac.android.dtacone.view.appOne.eSign.activity;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$ConsentAndESignScreen$6 */
/* loaded from: classes10.dex */
public final class OneConsentEsignActivity$ConsentAndESignScreen$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
    final /* synthetic */ MutableState<Boolean> $previewPdf;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ OneConsentEsignActivity $tmp0_rcvr;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentEsignActivity$ConsentAndESignScreen$6(OneConsentEsignActivity oneConsentEsignActivity, Modifier modifier, NavHostController navHostController, MutableState<Boolean> mutableState, ValidateDocApproved validateDocApproved, Function0<Unit> function0, CoroutineScope coroutineScope, int i) {
        super(2);
        this.$tmp0_rcvr = oneConsentEsignActivity;
        this.$modifier = modifier;
        this.$navController = navHostController;
        this.$previewPdf = mutableState;
        this.$validateDocApproved = validateDocApproved;
        this.$onOptionTakeMorePhoto = function0;
        this.$scope = coroutineScope;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        this.$tmp0_rcvr.m14337d0(this.$modifier, this.$navController, this.$previewPdf, this.$validateDocApproved, this.$onOptionTakeMorePhoto, this.$scope, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}