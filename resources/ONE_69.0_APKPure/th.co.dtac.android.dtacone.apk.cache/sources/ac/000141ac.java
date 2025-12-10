package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.res.StringResources_androidKt;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.DeviceListState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$8\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n25#2:1519\n25#2:1526\n36#2:1533\n1097#3,6:1520\n1097#3,6:1527\n1097#3,6:1534\n81#4:1540\n81#4:1541\n81#4:1542\n81#4:1543\n107#4,2:1544\n81#4:1546\n107#4,2:1547\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$8\n*L\n713#1:1519\n714#1:1526\n748#1:1533\n713#1:1520,6\n714#1:1527,6\n748#1:1534,6\n708#1:1540\n709#1:1541\n712#1:1542\n713#1:1543\n713#1:1544,2\n714#1:1546\n714#1:1547,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$8 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$8 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$8$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$8$1 */
    /* loaded from: classes10.dex */
    public static final class C153221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C153221(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C153221> continuation) {
            super(2, continuation);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C153221(this.$viewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.getDeviceList();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C153221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$8$2 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C153232 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C153232(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "onDeviceRouterSelected", "onDeviceRouterSelected(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OneRegisterTrueOnlineViewModel) this.receiver).onDeviceRouterSelected(p0);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$8$3 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C153243 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C153243(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "onDeviceMeshSelected", "onDeviceMeshSelected(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OneRegisterTrueOnlineViewModel) this.receiver).onDeviceMeshSelected(p0);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$8$4 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C153254 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C153254(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "onDeviceMeshInc", "onDeviceMeshInc(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OneRegisterTrueOnlineViewModel) this.receiver).onDeviceMeshInc(p0);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$8$5 */
    /* loaded from: classes10.dex */
    public /* synthetic */ class C153265 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C153265(Object obj) {
            super(1, obj, OneRegisterTrueOnlineViewModel.class, "onDeviceMeshDec", "onDeviceMeshDec(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OneRegisterTrueOnlineViewModel) this.receiver).onDeviceMeshDec(p0);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$8$6 */
    /* loaded from: classes10.dex */
    public static final class C153276 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MutableState<Integer> $dialogResId$delegate;
        final /* synthetic */ State<Boolean> $fixedLinePlus$delegate;
        final /* synthetic */ MutableState<Boolean> $isShowDialog$delegate;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ State<DeviceRouterItem> $router$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C153276(NavController navController, State<DeviceRouterItem> state, MutableState<Integer> mutableState, MutableState<Boolean> mutableState2, State<Boolean> state2) {
            super(0);
            this.$navController = navController;
            this.$router$delegate = state;
            this.$dialogResId$delegate = mutableState;
            this.$isShowDialog$delegate = mutableState2;
            this.$fixedLinePlus$delegate = state2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                if (OneTolNavGraphKt$oneTolNavGraph$1$8.invoke$lambda$1(this.$router$delegate) != null) {
                    if (OneTolNavGraphKt$oneTolNavGraph$1$8.invoke$lambda$2(this.$fixedLinePlus$delegate)) {
                        NavController.navigate$default(this.$navController, OneTolScreen.Tol.FixedLinePlus.MarketingCodeSelect.INSTANCE.createRoute(0), null, null, 6, null);
                        return;
                    } else {
                        NavController.navigate$default(this.$navController, OneTolScreen.Tol.PaymentSummary.ROUTE, null, null, 6, null);
                        return;
                    }
                }
                throw new ValidatedRuleException(R.string.one_tol_device_router_error);
            } catch (ValidatedRuleException e) {
                OneTolNavGraphKt$oneTolNavGraph$1$8.invoke$lambda$8(this.$dialogResId$delegate, e.getResId());
                OneTolNavGraphKt$oneTolNavGraph$1$8.invoke$lambda$5(this.$isShowDialog$delegate, true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$8(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    private static final DeviceListState invoke$lambda$0(State<? extends DeviceListState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceRouterItem invoke$lambda$1(State<DeviceRouterItem> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int invoke$lambda$7(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$8(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
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
            ComposerKt.traceEventStart(2012849977, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous> (OneTolNavGraph.kt:706)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getDeviceListState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getDeviceRouter(), null, composer, 8, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.$viewModel.getFixedLinePlus(), null, composer, 8, 1);
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
            rememberedValue2 = AbstractC19036aL1.m65148g(0, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C153221(this.$viewModel, null), composer, 70);
        DeviceSelectScreenKt.DeviceSelectScreen(invoke$lambda$0(collectAsState), invoke$lambda$1(collectAsState2), new C153232(this.$viewModel), new C153243(this.$viewModel), new C153254(this.$viewModel), new C153265(this.$viewModel), new C153276(this.$navController, collectAsState2, mutableState2, mutableState, collectAsState3), composer, 64);
        if (invoke$lambda$4(mutableState)) {
            String stringResource = StringResources_androidKt.stringResource(invoke$lambda$7(mutableState2), composer, 0);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new OneTolNavGraphKt$oneTolNavGraph$1$8$7$1(mutableState);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            OneDialogKt.OneDialogMessage(stringResource, (Function0) rememberedValue3, null, composer, 0, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}