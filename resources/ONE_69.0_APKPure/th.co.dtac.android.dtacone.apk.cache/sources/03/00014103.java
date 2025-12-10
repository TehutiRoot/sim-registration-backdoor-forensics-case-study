package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.screen.gisLocation.SelectGisLocationScreenKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.GisAuthenticationState;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.GisOrderStatusState;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n76#2:1519\n76#2:1520\n81#3:1521\n81#3:1522\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$1\n*L\n128#1:1519\n131#1:1520\n129#1:1521\n130#1:1522\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {133}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C152061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C152071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NavController $navController;
            final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {135}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$1$1$1 */
            /* loaded from: classes10.dex */
            public static final class C152081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NavController $navController;
                final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
                int label;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$1$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$1$1$1$1 */
                /* loaded from: classes10.dex */
                public static final class C152091 extends SuspendLambda implements Function2<GisStatusOrderResponse, Continuation<? super Unit>, Object> {
                    final /* synthetic */ NavController $navController;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C152091(NavController navController, Continuation<? super C152091> continuation) {
                        super(2, continuation);
                        this.$navController = navController;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C152091(this.$navController, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            NavController.navigate$default(this.$navController, OneTolScreen.Tol.SelectProductType.ROUTE, null, null, 6, null);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull GisStatusOrderResponse gisStatusOrderResponse, @Nullable Continuation<? super Unit> continuation) {
                        return ((C152091) create(gisStatusOrderResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C152081(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, Continuation<? super C152081> continuation) {
                    super(2, continuation);
                    this.$viewModel = oneRegisterTrueOnlineViewModel;
                    this.$navController = navController;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C152081(this.$viewModel, this.$navController, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        SharedFlow<GisStatusOrderResponse> onGisOrderStatusDone = this.$viewModel.getOnGisOrderStatusDone();
                        C152091 c152091 = new C152091(this.$navController, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(onGisOrderStatusDone, c152091, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C152081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C152071(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, Continuation<? super C152071> continuation) {
                super(2, continuation);
                this.$viewModel = oneRegisterTrueOnlineViewModel;
                this.$navController = navController;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C152071 c152071 = new C152071(this.$viewModel, this.$navController, continuation);
                c152071.L$0 = obj;
                return c152071;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC1539Vc.m65885e((CoroutineScope) this.L$0, null, null, new C152081(this.$viewModel, this.$navController, null), 3, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C152071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152061(Lifecycle lifecycle, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, Continuation<? super C152061> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$navController = navController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152061(this.$lifecycle, this.$viewModel, this.$navController, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C152071 c152071 = new C152071(this.$viewModel, this.$navController, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c152071, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$2", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$2 */
    /* loaded from: classes10.dex */
    public static final class C152102 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152102(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152102> continuation) {
            super(2, continuation);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152102(this.$viewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.getGisAuthentication();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152102) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$3 */
    /* loaded from: classes10.dex */
    public static final class C152113 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152113(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel) {
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
            this.$viewModel.getGisOrderStatus();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$4 */
    /* loaded from: classes10.dex */
    public static final class C152124 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152124(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel) {
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
            this.$viewModel.getGisOrderStatus();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$5 */
    /* loaded from: classes10.dex */
    public static final class C152135 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneRegisterTrueOnlineActivity $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152135(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
            super(0);
            this.$context = oneRegisterTrueOnlineActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$context.finish();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$6 */
    /* loaded from: classes10.dex */
    public static final class C152146 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneRegisterTrueOnlineActivity $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152146(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
            super(0);
            this.$context = oneRegisterTrueOnlineActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$context.finish();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$7 */
    /* loaded from: classes10.dex */
    public static final class C152157 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OneRegisterTrueOnlineActivity $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152157(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity) {
            super(0);
            this.$context = oneRegisterTrueOnlineActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$context.finish();
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$8", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$1$8 */
    /* loaded from: classes10.dex */
    public static final class C152168 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineActivity $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152168(OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity, Continuation<? super C152168> continuation) {
            super(2, continuation);
            this.$context = oneRegisterTrueOnlineActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152168(this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$context.finish();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152168) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    private static final GisAuthenticationState invoke$lambda$0(State<? extends GisAuthenticationState> state) {
        return state.getValue();
    }

    private static final GisOrderStatusState invoke$lambda$1(State<? extends GisOrderStatusState> state) {
        return state.getValue();
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
            ComposerKt.traceEventStart(-532949038, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous> (OneTolNavGraph.kt:126)");
        }
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Intrinsics.checkNotNull(consume, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity");
        OneRegisterTrueOnlineActivity oneRegisterTrueOnlineActivity = (OneRegisterTrueOnlineActivity) consume;
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getGisAuthState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.getGisOrderStatusState(), null, composer, 8, 1);
        Lifecycle lifecycle = ((LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        Unit unit = Unit.INSTANCE;
        EffectsKt.LaunchedEffect(unit, new C152061(lifecycle, this.$viewModel, this.$navController, null), composer, 70);
        EffectsKt.LaunchedEffect(unit, new C152102(this.$viewModel, null), composer, 70);
        if ((invoke$lambda$0(collectAsState) instanceof GisAuthenticationState.Success) && (invoke$lambda$1(collectAsState2) instanceof GisOrderStatusState.Initial)) {
            composer.startReplaceableGroup(1552521867);
            GisAuthenticationState invoke$lambda$0 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$0, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.GisAuthenticationState.Success");
            SelectGisLocationScreenKt.SelectGisLocationScreen((GisAuthenticationState.Success) invoke$lambda$0, new C152113(this.$viewModel), composer, 0);
            BackHandlerKt.BackHandler(true, new C152124(this.$viewModel), composer, 6, 0);
            composer.endReplaceableGroup();
        } else if (invoke$lambda$0(collectAsState) instanceof GisAuthenticationState.Error) {
            composer.startReplaceableGroup(1552522256);
            GisAuthenticationState invoke$lambda$02 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$02, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.GisAuthenticationState.Error");
            CommonErrorResponse error = ((GisAuthenticationState.Error) invoke$lambda$02).getError();
            OneDialogKt.OneDialogError(error.getDesc(), error.getUserId(), error.getCode(), error.getSystemMessage(), new C152135(oneRegisterTrueOnlineActivity), error.getResponseDateTime(), composer, 0, 0);
            composer.endReplaceableGroup();
        } else if (invoke$lambda$0(collectAsState) instanceof GisAuthenticationState.ErrorMessage) {
            composer.startReplaceableGroup(1552522857);
            GisAuthenticationState invoke$lambda$03 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$03, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.GisAuthenticationState.ErrorMessage");
            OneDialogKt.OneDialogMessage(((GisAuthenticationState.ErrorMessage) invoke$lambda$03).getMessage(), new C152146(oneRegisterTrueOnlineActivity), null, composer, 0, 4);
            composer.endReplaceableGroup();
        } else if (invoke$lambda$0(collectAsState) instanceof GisAuthenticationState.ErrorResId) {
            composer.startReplaceableGroup(1552523199);
            GisAuthenticationState invoke$lambda$04 = invoke$lambda$0(collectAsState);
            Intrinsics.checkNotNull(invoke$lambda$04, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.GisAuthenticationState.ErrorResId");
            OneDialogKt.OneDialogMessage(StringResources_androidKt.stringResource(((GisAuthenticationState.ErrorResId) invoke$lambda$04).getResId(), composer, 0), new C152157(oneRegisterTrueOnlineActivity), null, composer, 0, 4);
            composer.endReplaceableGroup();
        } else if (!(invoke$lambda$1(collectAsState2) instanceof GisOrderStatusState.Error) && !(invoke$lambda$1(collectAsState2) instanceof GisOrderStatusState.ErrorMessage) && !(invoke$lambda$1(collectAsState2) instanceof GisOrderStatusState.ErrorResId)) {
            if (!(invoke$lambda$0(collectAsState) instanceof GisAuthenticationState.Loading) && !(invoke$lambda$1(collectAsState2) instanceof GisOrderStatusState.Loading)) {
                composer.startReplaceableGroup(1552525272);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1552525229);
                OneDialogKt.OneDialogLoading(null, null, composer, 0, 3);
                composer.endReplaceableGroup();
            }
        } else {
            composer.startReplaceableGroup(1552525006);
            EffectsKt.LaunchedEffect(unit, new C152168(oneRegisterTrueOnlineActivity, null), composer, 70);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}