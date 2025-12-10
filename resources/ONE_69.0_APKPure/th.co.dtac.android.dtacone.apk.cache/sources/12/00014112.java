package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import android.os.Bundle;
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
import com.google.firebase.analytics.FirebaseAnalytics;
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
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpSelectNumberScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineFixedLinePlusNumberState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "navBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$11\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n25#2:1519\n25#2:1526\n1097#3,6:1520\n1097#3,6:1527\n81#4:1533\n107#4,2:1534\n81#4:1536\n81#4:1537\n81#4:1538\n107#4,2:1539\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$11\n*L\n797#1:1519\n800#1:1526\n797#1:1520,6\n800#1:1527,6\n797#1:1533\n797#1:1534,2\n798#1:1536\n799#1:1537\n800#1:1538\n800#1:1539,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$11 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$11 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$11$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$11$1 */
    /* loaded from: classes10.dex */
    public static final class C152191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152191(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152191> continuation) {
            super(2, continuation);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152191(this.$viewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.getFlpNumberList();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$11$2 */
    /* loaded from: classes10.dex */
    public static final class C152202 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152202(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel) {
            super(0);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.setCheckPhoneNumber(false);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$11$3 */
    /* loaded from: classes10.dex */
    public static final class C152213 extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ String $index;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Integer> $newIndex$delegate;
        final /* synthetic */ State<Boolean> $phoneNumber$delegate;
        final /* synthetic */ MutableState<Boolean> $showConfirmDialog$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152213(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, String str, NavController navController, State<Boolean> state, MutableState<Integer> mutableState, MutableState<Boolean> mutableState2) {
            super(1);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$index = str;
            this.$navController = navController;
            this.$phoneNumber$delegate = state;
            this.$newIndex$delegate = mutableState;
            this.$showConfirmDialog$delegate = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$viewModel.mockCheckValidatePhoneNumber(it);
            if (OneTolNavGraphKt$oneTolNavGraph$1$11.invoke$lambda$4(this.$phoneNumber$delegate)) {
                return;
            }
            this.$viewModel.getFlpDataItem().setFlpHomeNumber(it);
            this.$viewModel.setFlpDataItem(Integer.parseInt(this.$index));
            OneTolNavGraphKt$oneTolNavGraph$1$11.invoke$lambda$2(this.$newIndex$delegate, Integer.parseInt(this.$index) + 1);
            if (OneTolNavGraphKt$oneTolNavGraph$1$11.invoke$lambda$1(this.$newIndex$delegate) < this.$viewModel.getMaxHomePhoneNumber()) {
                OneTolNavGraphKt$oneTolNavGraph$1$11.invoke$lambda$7(this.$showConfirmDialog$delegate, true);
            } else {
                NavController.navigate$default(this.$navController, OneTolScreen.Tol.PaymentSummary.ROUTE, null, null, 6, null);
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$11$4 */
    /* loaded from: classes10.dex */
    public static final class C152224 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Integer> $newIndex$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152224(NavController navController, MutableState<Integer> mutableState) {
            super(0);
            this.$navController = navController;
            this.$newIndex$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.FixedLinePlus.MarketingCodeSelect.INSTANCE.createRoute(Integer.valueOf(OneTolNavGraphKt$oneTolNavGraph$1$11.invoke$lambda$1(this.$newIndex$delegate))), null, null, 6, null);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$11$5 */
    /* loaded from: classes10.dex */
    public static final class C152235 extends Lambda implements Function0<Unit> {
        final /* synthetic */ NavController $navController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152235(NavController navController) {
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
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.PaymentSummary.ROUTE, null, null, 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$11(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final OneRegisterTrueOnlineFixedLinePlusNumberState invoke$lambda$3(State<? extends OneRegisterTrueOnlineFixedLinePlusNumberState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull AnimatedContentScope composable, @NotNull NavBackStackEntry navBackStackEntry, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1081145750, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous> (OneTolNavGraph.kt:794)");
        }
        Bundle arguments = navBackStackEntry.getArguments();
        String str = (arguments == null || (r1 = arguments.getString(FirebaseAnalytics.Param.INDEX)) == null) ? "-1" : "-1";
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(0, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getFlpNumberListState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getCheckPhoneNumber(), null, composer, 8, 1);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C152191(this.$viewModel, null), composer, 70);
        OneRegisterTrueOnlineFlpSelectNumberScreenKt.OneRegisterTrueOnlineFlpSelectNumberScreen(Integer.parseInt(str), invoke$lambda$3(collectAsState), this.$viewModel.getMaxHomePhoneNumber() > 1, invoke$lambda$4(collectAsState2), new C152202(this.$viewModel), new C152213(this.$viewModel, str, this.$navController, collectAsState2, mutableState, mutableState2), composer, 0, 0);
        if (invoke$lambda$6(mutableState2)) {
            OneDialogKt.OneDialogChooser("ต้องการเปิดเบอร์โทรศัพท์บ้าน\n เบอร์ที่ " + (invoke$lambda$1(mutableState) + 1) + " เพิ่ม หรือไม่?", "ต้องการ", "ไม่ต้องการ", new C152224(this.$navController, mutableState), new C152235(this.$navController), composer, 432, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}