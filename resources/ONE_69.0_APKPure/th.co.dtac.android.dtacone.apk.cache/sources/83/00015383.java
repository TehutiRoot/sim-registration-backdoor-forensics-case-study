package th.p047co.dtac.android.dtacone.view.fragment.upPass;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.ThemeKt;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.compose.upPass.UpPassFormsNavGraphKt;
import th.p047co.dtac.android.dtacone.view.compose.upPass.model.UpPassScreen;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ExitCallbackState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$loadComposeContent$1 */
/* loaded from: classes9.dex */
public final class UpPassFormFragment$loadComposeContent$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UpPassFormFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$loadComposeContent$1$1 */
    /* loaded from: classes9.dex */
    public static final class C164661 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UpPassFormFragment this$0;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$loadComposeContent$1$1$1 */
        /* loaded from: classes9.dex */
        public static final class C164671 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ UpPassFormFragment this$0;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$loadComposeContent$1$1$1$1 */
            /* loaded from: classes9.dex */
            public static final class C164681 extends Lambda implements Function1<NavGraphBuilder, Unit> {
                final /* synthetic */ UpPassFormFragment this$0;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$loadComposeContent$1$1$1$1$1", m29092f = "UpPassFormFragment.kt", m29091i = {}, m29090l = {328}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
                /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$loadComposeContent$1$1$1$1$1 */
                /* loaded from: classes9.dex */
                public static final class C164691 extends SuspendLambda implements Function2<UpPassFormResult, Continuation<? super Boolean>, Object> {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ UpPassFormFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C164691(UpPassFormFragment upPassFormFragment, Continuation<? super C164691> continuation) {
                        super(2, continuation);
                        this.this$0 = upPassFormFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C164691 c164691 = new C164691(this.this$0, continuation);
                        c164691.L$0 = obj;
                        return c164691;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        boolean z = true;
                        if (i != 0) {
                            if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            UpPassFormResult upPassFormResult = (UpPassFormResult) this.L$0;
                            Function2<UpPassFormResult, Continuation<? super Boolean>, Object> onValidationCallback = this.this$0.getOnValidationCallback();
                            if (onValidationCallback != null) {
                                this.label = 1;
                                obj = onValidationCallback.invoke(upPassFormResult, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Boxing.boxBoolean(z);
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            z = false;
                        }
                        return Boxing.boxBoolean(z);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull UpPassFormResult upPassFormResult, @Nullable Continuation<? super Boolean> continuation) {
                        return ((C164691) create(upPassFormResult, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$loadComposeContent$1$1$1$1$2 */
                /* loaded from: classes9.dex */
                public static final class C164702 extends Lambda implements Function1<UpPassFormResult, Unit> {
                    final /* synthetic */ UpPassFormFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C164702(UpPassFormFragment upPassFormFragment) {
                        super(1);
                        this.this$0 = upPassFormFragment;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UpPassFormResult upPassFormResult) {
                        invoke2(upPassFormResult);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull UpPassFormResult result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        Function1<UpPassFormResult, Unit> onSuccessCallback = this.this$0.getOnSuccessCallback();
                        if (onSuccessCallback != null) {
                            onSuccessCallback.invoke(result);
                        }
                    }
                }

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                /* renamed from: th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment$loadComposeContent$1$1$1$1$3 */
                /* loaded from: classes9.dex */
                public static final class C164713 extends Lambda implements Function1<ExitCallbackState, Unit> {
                    final /* synthetic */ UpPassFormFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C164713(UpPassFormFragment upPassFormFragment) {
                        super(1);
                        this.this$0 = upPassFormFragment;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ExitCallbackState exitCallbackState) {
                        invoke2(exitCallbackState);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ExitCallbackState exitState) {
                        Intrinsics.checkNotNullParameter(exitState, "exitState");
                        Function1<ExitCallbackState, Unit> onExitCallback = this.this$0.getOnExitCallback();
                        if (onExitCallback != null) {
                            onExitCallback.invoke(exitState);
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C164681(UpPassFormFragment upPassFormFragment) {
                    super(1);
                    this.this$0 = upPassFormFragment;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
                    invoke2(navGraphBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NavGraphBuilder NavHost) {
                    UpPassFormType upPassFormType;
                    Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                    NavHostController navController = this.this$0.getNavController();
                    upPassFormType = this.this$0.f105053a;
                    UpPassFormsNavGraphKt.upPassFormsNavGraph(NavHost, navController, upPassFormType, new C164691(this.this$0, null), new C164702(this.this$0), new C164713(this.this$0));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C164671(UpPassFormFragment upPassFormFragment) {
                super(2);
                this.this$0 = upPassFormFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1962702914, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment.loadComposeContent.<anonymous>.<anonymous>.<anonymous> (UpPassFormFragment.kt:318)");
                }
                NavHostKt.NavHost(this.this$0.getNavController(), UpPassScreen.UpPassForms.ROUTE, null, null, null, null, null, null, null, new C164681(this.this$0), composer, 56, TypedValues.PositionType.TYPE_CURVE_FIT);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C164661(UpPassFormFragment upPassFormFragment) {
            super(2);
            this.this$0 = upPassFormFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1514434045, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment.loadComposeContent.<anonymous>.<anonymous> (UpPassFormFragment.kt:316)");
            }
            this.this$0.setNavController(NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8));
            SurfaceKt.m70812SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer, 1962702914, true, new C164671(this.this$0)), composer, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassFormFragment$loadComposeContent$1(UpPassFormFragment upPassFormFragment) {
        super(2);
        this.this$0 = upPassFormFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        UpPassViewModel upPassViewModel;
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(86603471, i, -1, "th.co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment.loadComposeContent.<anonymous> (UpPassFormFragment.kt:315)");
        }
        upPassViewModel = this.this$0.f105064l;
        if (upPassViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            upPassViewModel = null;
        }
        ThemeKt.OneTheme(upPassViewModel.getTheme(), false, ComposableLambdaKt.composableLambda(composer, 1514434045, true, new C164661(this.this$0)), composer, 384, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}