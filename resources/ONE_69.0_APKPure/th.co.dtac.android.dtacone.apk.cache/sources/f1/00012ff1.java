package th.p047co.dtac.android.dtacone.view.appOne.eSign.activity;

import androidx.compose.runtime.MutableState;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.screen.OneConsentAndESignNavGraphKt;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$ConsentAndESignScreen$5 */
/* loaded from: classes10.dex */
public final class OneConsentEsignActivity$ConsentAndESignScreen$5 extends Lambda implements Function1<NavGraphBuilder, Unit> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Function0<Unit> $onOptionTakeMorePhoto;
    final /* synthetic */ MutableState<Boolean> $previewPdf;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ValidateDocApproved $validateDocApproved;
    final /* synthetic */ OneConsentEsignActivity this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.activity.OneConsentEsignActivity$ConsentAndESignScreen$5$1 */
    /* loaded from: classes10.dex */
    public static final class C146561 extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ OneConsentEsignActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146561(OneConsentEsignActivity oneConsentEsignActivity) {
            super(1);
            this.this$0 = oneConsentEsignActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.onSecureFragmentVisible(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentEsignActivity$ConsentAndESignScreen$5(NavHostController navHostController, OneConsentEsignActivity oneConsentEsignActivity, MutableState<Boolean> mutableState, ValidateDocApproved validateDocApproved, Function0<Unit> function0, CoroutineScope coroutineScope) {
        super(1);
        this.$navController = navHostController;
        this.this$0 = oneConsentEsignActivity;
        this.$previewPdf = mutableState;
        this.$validateDocApproved = validateDocApproved;
        this.$onOptionTakeMorePhoto = function0;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
        invoke2(navGraphBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull NavGraphBuilder NavHost) {
        UpPassViewModel upPassViewModel;
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavHostController navHostController = this.$navController;
        OneConsentAndESignViewModel viewModel = this.this$0.getViewModel();
        MutableState<Boolean> mutableState = this.$previewPdf;
        ValidateDocApproved validateDocApproved = this.$validateDocApproved;
        Function0<Unit> function0 = this.$onOptionTakeMorePhoto;
        upPassViewModel = this.this$0.f90753n;
        if (upPassViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upPassViewModel");
            upPassViewModel = null;
        }
        OneConsentAndESignNavGraphKt.oneESignNavGraph(NavHost, navHostController, viewModel, mutableState, validateDocApproved, function0, upPassViewModel, new C146561(this.this$0), this.$scope);
    }
}