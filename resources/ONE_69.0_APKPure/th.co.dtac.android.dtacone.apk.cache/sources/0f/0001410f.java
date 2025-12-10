package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpPackageScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineFixedLinePlusPackageState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "navBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$10\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n81#2:1519\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$10\n*L\n776#1:1519\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$10 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$10 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$10$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$10$1 */
    /* loaded from: classes10.dex */
    public static final class C152171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152171(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152171> continuation) {
            super(2, continuation);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152171(this.$viewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.getFlpPackageList();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$10$2 */
    /* loaded from: classes10.dex */
    public static final class C152182 extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ String $index;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152182(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, String str, NavController navController) {
            super(1);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$index = str;
            this.$navController = navController;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$viewModel.getFlpDataItem().setFlpCampaignCode(it);
            this.$viewModel.setFlpDataItem(Integer.parseInt(this.$index));
            NavController.navigate$default(this.$navController, OneTolScreen.Tol.FixedLinePlus.NumberSelect.INSTANCE.createRoute(Integer.valueOf(Integer.parseInt(this.$index))), null, null, 6, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$10(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    private static final OneRegisterTrueOnlineFixedLinePlusPackageState invoke$lambda$0(State<? extends OneRegisterTrueOnlineFixedLinePlusPackageState> state) {
        return state.getValue();
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
            ComposerKt.traceEventStart(-1471597705, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous> (OneTolNavGraph.kt:773)");
        }
        Bundle arguments = navBackStackEntry.getArguments();
        String str = (arguments == null || (str = arguments.getString(FirebaseAnalytics.Param.INDEX)) == null) ? "-1" : "-1";
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getFlpPackageListState(), null, composer, 8, 1);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new C152171(this.$viewModel, null), composer, 70);
        OneRegisterTrueOnlineFlpPackageScreenKt.OneRegisterTrueOnlineFlpPackageScreen(Integer.parseInt(str), invoke$lambda$0(collectAsState), this.$viewModel.getFlpMarketingInfo(Integer.parseInt(str)), this.$viewModel.getMaxHomePhoneNumber() > 1, new C152182(this.$viewModel, str, this.$navController), composer, 512, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}