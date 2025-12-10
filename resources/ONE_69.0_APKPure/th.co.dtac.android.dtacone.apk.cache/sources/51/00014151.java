package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.checkPort.CheckPortScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.SubmitOrderState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$18$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n25#2:1519\n25#2:1526\n25#2:1533\n25#2:1540\n25#2:1547\n67#2,3:1554\n66#2:1557\n67#2,3:1564\n66#2:1567\n36#2:1574\n36#2:1581\n1097#3,6:1520\n1097#3,6:1527\n1097#3,6:1534\n1097#3,6:1541\n1097#3,6:1548\n1097#3,6:1558\n1097#3,6:1568\n1097#3,6:1575\n1097#3,6:1582\n81#4:1588\n81#4:1589\n81#4:1590\n107#4,2:1591\n81#4:1593\n107#4,2:1594\n81#4:1596\n107#4,2:1597\n81#4:1599\n107#4,2:1600\n81#4:1602\n107#4,2:1603\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$18$1\n*L\n1286#1:1519\n1287#1:1526\n1288#1:1533\n1289#1:1540\n1290#1:1547\n1296#1:1554,3\n1296#1:1557\n1302#1:1564,3\n1302#1:1567\n1343#1:1574\n1352#1:1581\n1286#1:1520,6\n1287#1:1527,6\n1288#1:1534,6\n1289#1:1541,6\n1290#1:1548,6\n1296#1:1558,6\n1302#1:1568,6\n1343#1:1575,6\n1352#1:1582,6\n1284#1:1588\n1285#1:1589\n1286#1:1590\n1286#1:1591,2\n1287#1:1593\n1287#1:1594,2\n1288#1:1596\n1288#1:1597,2\n1289#1:1599\n1289#1:1600,2\n1290#1:1602\n1290#1:1603,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$18$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$18$1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$18$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$18$1$1 */
    /* loaded from: classes10.dex */
    public static final class C152621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152621(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152621> continuation) {
            super(2, continuation);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152621(this.$viewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.submitOrder();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$18$1$4 */
    /* loaded from: classes10.dex */
    public static final class C152634 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152634(NavController navController) {
            super(0);
            this.$navController = navController;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.Success.ROUTE, null, null, 6, null);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$18$1$5 */
    /* loaded from: classes10.dex */
    public static final class C152645 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MutableState<Boolean> $dismissDialogAppointment$delegate;
        final /* synthetic */ MutableState<Boolean> $reloadAppointment$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152645(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
            super(0);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$dismissDialogAppointment$delegate = mutableState;
            this.$reloadAppointment$delegate = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OneTolNavGraphKt$oneTolNavGraph$1$18$1.invoke$lambda$7(this.$dismissDialogAppointment$delegate, true);
            this.$viewModel.getInstallDate();
            OneTolNavGraphKt$oneTolNavGraph$1$18$1.invoke$lambda$4(this.$reloadAppointment$delegate, true);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$18$1$8 */
    /* loaded from: classes10.dex */
    public static final class C152658 extends Lambda implements Function0<Unit> {
        public static final C152658 INSTANCE = new C152658();

        public C152658() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$18$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    private static final InstallDateState invoke$lambda$0(State<? extends InstallDateState> state) {
        return state.getValue();
    }

    private static final SubmitOrderState invoke$lambda$1(State<? extends SubmitOrderState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final SaveOrderResponse invoke$lambda$12(MutableState<SaveOrderResponse> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean invoke$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean invoke$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope composable, @NotNull NavBackStackEntry it, @Nullable Composer composer, int i) {
        MutableState mutableState;
        int i2;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(796494991, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous>.<anonymous> (OneTolNavGraph.kt:1282)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getInstallDateState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getSubmitOrderState(), null, composer, 8, 1);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState4 = (MutableState) rememberedValue3;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = AbstractC19036aL1.m65148g(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        MutableState mutableState5 = (MutableState) rememberedValue4;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        MutableState mutableState6 = (MutableState) rememberedValue5;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C152621(this.$viewModel, null), composer, 70);
        SubmitOrderState invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(mutableState6) | composer.changed(mutableState3) | composer.changed(mutableState5);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new OneTolNavGraphKt$oneTolNavGraph$1$18$1$2$1(mutableState6, mutableState3, mutableState5);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        Function1 function1 = (Function1) rememberedValue6;
        composer.startReplaceableGroup(1618982084);
        boolean changed2 = composer.changed(mutableState6) | composer.changed(mutableState3) | composer.changed(mutableState5);
        Object rememberedValue7 = composer.rememberedValue();
        if (changed2 || rememberedValue7 == companion.getEmpty()) {
            rememberedValue7 = new OneTolNavGraphKt$oneTolNavGraph$1$18$1$3$1(mutableState6, mutableState3, mutableState5);
            composer.updateRememberedValue(rememberedValue7);
        }
        composer.endReplaceableGroup();
        CheckPortScreenKt.CheckPortScreen(invoke$lambda$1, function1, (Function1) rememberedValue7, new C152634(this.$navController), composer, 0);
        composer.startReplaceableGroup(1738396149);
        if (invoke$lambda$6(mutableState3)) {
            mutableState = mutableState4;
        } else {
            SaveOrderResponse invoke$lambda$12 = invoke$lambda$12(mutableState5);
            String str = (invoke$lambda$12 == null || (str = invoke$lambda$12.getDesc()) == null) ? "" : "";
            SaveOrderResponse invoke$lambda$122 = invoke$lambda$12(mutableState5);
            String str2 = (invoke$lambda$122 == null || (str2 = invoke$lambda$122.getCode()) == null) ? "" : "";
            SaveOrderResponse invoke$lambda$123 = invoke$lambda$12(mutableState5);
            String str3 = (invoke$lambda$123 == null || (str3 = invoke$lambda$123.getSystemMessage()) == null) ? "" : "";
            SaveOrderResponse invoke$lambda$124 = invoke$lambda$12(mutableState5);
            String str4 = (invoke$lambda$124 == null || (str4 = invoke$lambda$124.getResponseDateTime()) == null) ? "" : "";
            C152645 c152645 = new C152645(this.$viewModel, mutableState3, mutableState2);
            SaveOrderResponse invoke$lambda$125 = invoke$lambda$12(mutableState5);
            mutableState = mutableState4;
            OneDialogKt.OneDialogError(str, str2, str3, str4, c152645, invoke$lambda$125 != null ? invoke$lambda$125.getResponseDateTime() : null, composer, 0, 0);
        }
        composer.endReplaceableGroup();
        InstallDateState invoke$lambda$0 = invoke$lambda$0(collectAsState);
        if (invoke$lambda$0 instanceof InstallDateState.Success) {
            composer.startReplaceableGroup(1738396940);
            composer.endReplaceableGroup();
            if (invoke$lambda$3(mutableState2)) {
                if (invoke$lambda$15(mutableState6)) {
                    NavController.navigate$default(this.$navController, OneTolScreen.Tol.CheckPort.AppointmentPrimary.ROUTE, null, null, 6, null);
                } else {
                    NavController.navigate$default(this.$navController, OneTolScreen.Tol.CheckPort.AppointmentSecondary.ROUTE, null, null, 6, null);
                }
            }
            i2 = 0;
        } else if (invoke$lambda$0 instanceof InstallDateState.Error) {
            composer.startReplaceableGroup(1738397403);
            InstallDateState invoke$lambda$02 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$02, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState.Error");
            CommonErrorResponse error = ((InstallDateState.Error) invoke$lambda$02).getError();
            if (invoke$lambda$9(mutableState)) {
                i2 = 0;
            } else {
                String desc = error.getDesc();
                String userId = error.getUserId();
                String code = error.getCode();
                String systemMessage = error.getSystemMessage();
                String responseDateTime = error.getResponseDateTime();
                composer.startReplaceableGroup(1157296644);
                MutableState mutableState7 = mutableState;
                boolean changed3 = composer.changed(mutableState7);
                Object rememberedValue8 = composer.rememberedValue();
                if (changed3 || rememberedValue8 == companion.getEmpty()) {
                    rememberedValue8 = new OneTolNavGraphKt$oneTolNavGraph$1$18$1$6$1(mutableState7);
                    composer.updateRememberedValue(rememberedValue8);
                }
                composer.endReplaceableGroup();
                i2 = 0;
                OneDialogKt.OneDialogError(desc, userId, code, systemMessage, (Function0) rememberedValue8, responseDateTime, composer, 0, 0);
            }
            composer.endReplaceableGroup();
        } else {
            MutableState mutableState8 = mutableState;
            i2 = 0;
            if (invoke$lambda$0 instanceof InstallDateState.ErrorMessage) {
                composer.startReplaceableGroup(1738398093);
                InstallDateState invoke$lambda$03 = invoke$lambda$0(collectAsState);
                Intrinsics.checkNotNull(invoke$lambda$03, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.InstallDateState.ErrorMessage");
                String message = ((InstallDateState.ErrorMessage) invoke$lambda$03).getMessage();
                if (!invoke$lambda$9(mutableState8)) {
                    composer.startReplaceableGroup(1157296644);
                    boolean changed4 = composer.changed(mutableState8);
                    Object rememberedValue9 = composer.rememberedValue();
                    if (changed4 || rememberedValue9 == companion.getEmpty()) {
                        rememberedValue9 = new OneTolNavGraphKt$oneTolNavGraph$1$18$1$7$1(mutableState8);
                        composer.updateRememberedValue(rememberedValue9);
                    }
                    composer.endReplaceableGroup();
                    OneDialogKt.OneDialogMessage(message, (Function0) rememberedValue9, null, composer, 0, 4);
                }
                composer.endReplaceableGroup();
            } else if (invoke$lambda$0 instanceof InstallDateState.Loading) {
                composer.startReplaceableGroup(1738398541);
                OneDialogKt.OneDialogLoading(null, null, composer, 0, 3);
                invoke$lambda$10(mutableState8, false);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1738398687);
                composer.endReplaceableGroup();
            }
        }
        BackHandlerKt.BackHandler(true, C152658.INSTANCE, composer, 54, i2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}