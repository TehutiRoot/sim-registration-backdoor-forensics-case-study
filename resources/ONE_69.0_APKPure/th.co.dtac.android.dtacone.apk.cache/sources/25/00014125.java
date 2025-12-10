package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallAppointmentTimeRange;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$14$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n25#2:1519\n25#2:1526\n25#2:1533\n36#2:1540\n1097#3,6:1520\n1097#3,6:1527\n1097#3,6:1534\n1097#3,6:1541\n81#4:1547\n81#4:1548\n81#4:1549\n107#4,2:1550\n81#4:1552\n107#4,2:1553\n81#4:1555\n107#4,2:1556\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$14$2\n*L\n1010#1:1519\n1011#1:1526\n1012#1:1533\n1034#1:1540\n1010#1:1520,6\n1011#1:1527,6\n1012#1:1534,6\n1034#1:1541,6\n1008#1:1547\n1009#1:1548\n1010#1:1549\n1010#1:1550,2\n1011#1:1552\n1011#1:1553,2\n1012#1:1555\n1012#1:1556,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$14$2 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$14$2 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$14$2$1 */
    /* loaded from: classes10.dex */
    public static final class C152311 extends Lambda implements Function3<String, InstallAppointmentTimeRange, Boolean, Unit> {
        final /* synthetic */ MutableState<String> $confirmDate$delegate;
        final /* synthetic */ MutableState<InstallAppointmentTimeRange> $confirmTime$delegate;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Boolean> $showConfirmDialog$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152311(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, MutableState<String> mutableState, MutableState<InstallAppointmentTimeRange> mutableState2, MutableState<Boolean> mutableState3) {
            super(3);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$navController = navController;
            this.$confirmDate$delegate = mutableState;
            this.$confirmTime$delegate = mutableState2;
            this.$showConfirmDialog$delegate = mutableState3;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, InstallAppointmentTimeRange installAppointmentTimeRange, Boolean bool) {
            invoke(str, installAppointmentTimeRange, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String date, @NotNull InstallAppointmentTimeRange time, boolean z) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            if (!z) {
                OneTolNavGraphKt$oneTolNavGraph$1$14$2.invoke$lambda$7(this.$confirmDate$delegate, date);
                OneTolNavGraphKt$oneTolNavGraph$1$14$2.invoke$lambda$10(this.$confirmTime$delegate, time);
                OneTolNavGraphKt$oneTolNavGraph$1$14$2.invoke$lambda$4(this.$showConfirmDialog$delegate, true);
                return;
            }
            this.$viewModel.onInstallAppointmentSelected(date, time);
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.Review.ROUTE, null, null, 6, null);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$14$2$2 */
    /* loaded from: classes10.dex */
    public static final class C152322 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MutableState<String> $confirmDate$delegate;
        final /* synthetic */ MutableState<InstallAppointmentTimeRange> $confirmTime$delegate;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152322(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, MutableState<String> mutableState, MutableState<InstallAppointmentTimeRange> mutableState2) {
            super(0);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$navController = navController;
            this.$confirmDate$delegate = mutableState;
            this.$confirmTime$delegate = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.onInstallAppointmentSelected(OneTolNavGraphKt$oneTolNavGraph$1$14$2.invoke$lambda$6(this.$confirmDate$delegate), OneTolNavGraphKt$oneTolNavGraph$1$14$2.invoke$lambda$9(this.$confirmTime$delegate));
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.Installation.AppointmentSecondary.ROUTE, null, null, 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$14$2(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    private static final InstallDateState invoke$lambda$0(State<? extends InstallDateState> state) {
        return state.getValue();
    }

    private static final InstallInformation invoke$lambda$1(State<InstallInformation> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$10(MutableState<InstallAppointmentTimeRange> mutableState, InstallAppointmentTimeRange installAppointmentTimeRange) {
        mutableState.setValue(installAppointmentTimeRange);
    }

    private static final boolean invoke$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$7(MutableState<String> mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstallAppointmentTimeRange invoke$lambda$9(MutableState<InstallAppointmentTimeRange> mutableState) {
        return mutableState.getValue();
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope composable, @NotNull NavBackStackEntry it, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1533126012, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous>.<anonymous> (OneTolNavGraph.kt:1006)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getInstallDateState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getInstallInfoState(), null, composer, 8, 1);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g("", null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = AbstractC19036aL1.m65148g(InstallAppointmentTimeRange.MORNING, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue3;
        InstallAppointmentScreenKt.InstallAppointmentScreen(false, invoke$lambda$1(collectAsState2).getPrimaryAppointment(), invoke$lambda$0(collectAsState), new C152311(this.$viewModel, this.$navController, mutableState2, mutableState3, mutableState), composer, 6);
        if (invoke$lambda$3(mutableState)) {
            String stringResource = StringResources_androidKt.stringResource(R.string.one_tol_install_appointment_confirm_text, composer, 0);
            C152322 c152322 = new C152322(this.$viewModel, this.$navController, mutableState2, mutableState3);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new OneTolNavGraphKt$oneTolNavGraph$1$14$2$3$1(mutableState);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            OneDialogKt.OneDialogConfirm(stringResource, null, null, null, c152322, (Function0) rememberedValue4, composer, 0, 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}