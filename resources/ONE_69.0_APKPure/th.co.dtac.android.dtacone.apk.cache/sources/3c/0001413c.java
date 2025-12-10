package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
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
import kotlin.coroutines.jvm.internal.Boxing;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.DataValidateConsent;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateConsentResponse;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.state.ConsentState;
import th.p047co.dtac.android.dtacone.widget.compose.consent.ConsentScreenKt;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneTolNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$16$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1518:1\n76#2:1519\n25#3:1520\n25#3:1527\n25#3:1534\n36#3:1541\n1097#4,6:1521\n1097#4,6:1528\n1097#4,6:1535\n1097#4,6:1542\n81#5:1548\n107#5,2:1549\n81#5:1551\n107#5,2:1552\n81#5:1554\n107#5,2:1555\n81#5:1557\n81#5:1558\n*S KotlinDebug\n*F\n+ 1 OneTolNavGraph.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/OneTolNavGraphKt$oneTolNavGraph$1$16$1\n*L\n1162#1:1519\n1163#1:1520\n1164#1:1527\n1165#1:1534\n1226#1:1541\n1163#1:1521,6\n1164#1:1528,6\n1165#1:1535,6\n1226#1:1542,6\n1163#1:1548\n1163#1:1549,2\n1164#1:1551\n1164#1:1552,2\n1165#1:1554\n1165#1:1555,2\n1166#1:1557\n1167#1:1558\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$16$1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {1169}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$1 */
    /* loaded from: classes10.dex */
    public static final class C152471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Boolean> $showErrorDialog$delegate;
        final /* synthetic */ MutableState<OnePostpaidValidateConsentResponse> $validateError$delegate;
        final /* synthetic */ MutableState<Boolean> $validating$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C152481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NavController $navController;
            final /* synthetic */ MutableState<Boolean> $showErrorDialog$delegate;
            final /* synthetic */ MutableState<OnePostpaidValidateConsentResponse> $validateError$delegate;
            final /* synthetic */ MutableState<Boolean> $validating$delegate;
            final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {1171}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$1$1$1 */
            /* loaded from: classes10.dex */
            public static final class C152491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ NavController $navController;
                final /* synthetic */ MutableState<Boolean> $showErrorDialog$delegate;
                final /* synthetic */ MutableState<OnePostpaidValidateConsentResponse> $validateError$delegate;
                final /* synthetic */ MutableState<Boolean> $validating$delegate;
                final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
                int label;

                @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
                @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$1$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
                /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$1$1$1$1 */
                /* loaded from: classes10.dex */
                public static final class C152501 extends SuspendLambda implements Function2<OnePostpaidValidateConsentResponse, Continuation<? super Unit>, Object> {
                    final /* synthetic */ NavController $navController;
                    final /* synthetic */ MutableState<Boolean> $showErrorDialog$delegate;
                    final /* synthetic */ MutableState<OnePostpaidValidateConsentResponse> $validateError$delegate;
                    final /* synthetic */ MutableState<Boolean> $validating$delegate;
                    /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C152501(NavController navController, MutableState<Boolean> mutableState, MutableState<OnePostpaidValidateConsentResponse> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super C152501> continuation) {
                        super(2, continuation);
                        this.$navController = navController;
                        this.$validating$delegate = mutableState;
                        this.$validateError$delegate = mutableState2;
                        this.$showErrorDialog$delegate = mutableState3;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C152501 c152501 = new C152501(this.$navController, this.$validating$delegate, this.$validateError$delegate, this.$showErrorDialog$delegate, continuation);
                        c152501.L$0 = obj;
                        return c152501;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            OnePostpaidValidateConsentResponse onePostpaidValidateConsentResponse = (OnePostpaidValidateConsentResponse) this.L$0;
                            if (!Intrinsics.areEqual(onePostpaidValidateConsentResponse.getCode(), "200") || onePostpaidValidateConsentResponse.getData() == null) {
                                OneTolNavGraphKt$oneTolNavGraph$1$16$1.invoke$lambda$5(this.$validateError$delegate, onePostpaidValidateConsentResponse);
                                OneTolNavGraphKt$oneTolNavGraph$1$16$1.invoke$lambda$2(this.$showErrorDialog$delegate, true);
                                OneTolNavGraphKt$oneTolNavGraph$1$16$1.invoke$lambda$8(this.$validating$delegate, false);
                            } else {
                                DataValidateConsent data = onePostpaidValidateConsentResponse.getData();
                                if (Intrinsics.areEqual(data.getResult(), "0") && Intrinsics.areEqual(data.getConsentTMN(), Boxing.boxBoolean(true))) {
                                    NavController.navigate$default(this.$navController, OneTolScreen.Tol.Consent.TMN.ROUTE, null, null, 6, null);
                                } else {
                                    NavController.navigate$default(this.$navController, OneTolScreen.Tol.Signature.DocumentSign.ROUTE, null, null, 6, null);
                                }
                                OneTolNavGraphKt$oneTolNavGraph$1$16$1.invoke$lambda$8(this.$validating$delegate, false);
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull OnePostpaidValidateConsentResponse onePostpaidValidateConsentResponse, @Nullable Continuation<? super Unit> continuation) {
                        return ((C152501) create(onePostpaidValidateConsentResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C152491(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, MutableState<Boolean> mutableState, MutableState<OnePostpaidValidateConsentResponse> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super C152491> continuation) {
                    super(2, continuation);
                    this.$viewModel = oneRegisterTrueOnlineViewModel;
                    this.$navController = navController;
                    this.$validating$delegate = mutableState;
                    this.$validateError$delegate = mutableState2;
                    this.$showErrorDialog$delegate = mutableState3;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C152491(this.$viewModel, this.$navController, this.$validating$delegate, this.$validateError$delegate, this.$showErrorDialog$delegate, continuation);
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
                        SharedFlow<OnePostpaidValidateConsentResponse> onValidateConsentDone = this.$viewModel.getOnValidateConsentDone();
                        C152501 c152501 = new C152501(this.$navController, this.$validating$delegate, this.$validateError$delegate, this.$showErrorDialog$delegate, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(onValidateConsentDone, c152501, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C152491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C152481(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, MutableState<Boolean> mutableState, MutableState<OnePostpaidValidateConsentResponse> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super C152481> continuation) {
                super(2, continuation);
                this.$viewModel = oneRegisterTrueOnlineViewModel;
                this.$navController = navController;
                this.$validating$delegate = mutableState;
                this.$validateError$delegate = mutableState2;
                this.$showErrorDialog$delegate = mutableState3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C152481 c152481 = new C152481(this.$viewModel, this.$navController, this.$validating$delegate, this.$validateError$delegate, this.$showErrorDialog$delegate, continuation);
                c152481.L$0 = obj;
                return c152481;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC1539Vc.m65885e((CoroutineScope) this.L$0, null, null, new C152491(this.$viewModel, this.$navController, this.$validating$delegate, this.$validateError$delegate, this.$showErrorDialog$delegate, null), 3, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C152481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152471(Lifecycle lifecycle, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, MutableState<Boolean> mutableState, MutableState<OnePostpaidValidateConsentResponse> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super C152471> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$navController = navController;
            this.$validating$delegate = mutableState;
            this.$validateError$delegate = mutableState2;
            this.$showErrorDialog$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152471(this.$lifecycle, this.$viewModel, this.$navController, this.$validating$delegate, this.$validateError$delegate, this.$showErrorDialog$delegate, continuation);
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
                C152481 c152481 = new C152481(this.$viewModel, this.$navController, this.$validating$delegate, this.$validateError$delegate, this.$showErrorDialog$delegate, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c152481, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$2", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$2 */
    /* loaded from: classes10.dex */
    public static final class C152512 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152512(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super C152512> continuation) {
            super(2, continuation);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C152512(this.$viewModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.getConsentNonTelco();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$3 */
    /* loaded from: classes10.dex */
    public static final class C152523 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ State<Boolean> $isSmartCard$delegate;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Boolean> $validating$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152523(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, MutableState<Boolean> mutableState, State<Boolean> state) {
            super(1);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$navController = navController;
            this.$validating$delegate = mutableState;
            this.$isSmartCard$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
            invoke2(consentNonTelco);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ConsentNonTelco it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OneTolNavGraphKt$oneTolNavGraph$1$16$1.invoke$lambda$8(this.$validating$delegate, true);
            this.$viewModel.setConsentNonTelcoAgree(true);
            if (OneTolNavGraphKt$oneTolNavGraph$1$16$1.invoke$lambda$10(this.$isSmartCard$delegate)) {
                this.$viewModel.validateConsent();
            } else {
                NavController.navigate$default(this.$navController, OneTolScreen.Tol.Signature.DocumentSign.ROUTE, null, null, 6, null);
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$4 */
    /* loaded from: classes10.dex */
    public static final class C152534 extends Lambda implements Function1<ConsentNonTelco, Unit> {
        final /* synthetic */ State<Boolean> $isSmartCard$delegate;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ MutableState<Boolean> $validating$delegate;
        final /* synthetic */ OneRegisterTrueOnlineViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C152534(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController, MutableState<Boolean> mutableState, State<Boolean> state) {
            super(1);
            this.$viewModel = oneRegisterTrueOnlineViewModel;
            this.$navController = navController;
            this.$validating$delegate = mutableState;
            this.$isSmartCard$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ConsentNonTelco consentNonTelco) {
            invoke2(consentNonTelco);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ConsentNonTelco it) {
            Intrinsics.checkNotNullParameter(it, "it");
            OneTolNavGraphKt$oneTolNavGraph$1$16$1.invoke$lambda$8(this.$validating$delegate, true);
            this.$viewModel.setConsentNonTelcoAgree(false);
            if (OneTolNavGraphKt$oneTolNavGraph$1$16$1.invoke$lambda$10(this.$isSmartCard$delegate)) {
                this.$viewModel.validateConsent();
            } else {
                NavController.navigate$default(this.$navController, OneTolScreen.Tol.Signature.DocumentSign.ROUTE, null, null, 6, null);
            }
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$16$1$6 */
    /* loaded from: classes10.dex */
    public static final class C152546 extends Lambda implements Function0<Unit> {
        public static final C152546 INSTANCE = new C152546();

        public C152546() {
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
    public OneTolNavGraphKt$oneTolNavGraph$1$16$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, NavController navController) {
        super(4);
        this.$viewModel = oneRegisterTrueOnlineViewModel;
        this.$navController = navController;
    }

    private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final OnePostpaidValidateConsentResponse invoke$lambda$4(MutableState<OnePostpaidValidateConsentResponse> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(MutableState<OnePostpaidValidateConsentResponse> mutableState, OnePostpaidValidateConsentResponse onePostpaidValidateConsentResponse) {
        mutableState.setValue(onePostpaidValidateConsentResponse);
    }

    private static final boolean invoke$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final ConsentState invoke$lambda$9(State<? extends ConsentState> state) {
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
        OnePostpaidValidateConsentResponse invoke$lambda$4;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-14024623, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.oneTolNavGraph.<anonymous>.<anonymous>.<anonymous> (OneTolNavGraph.kt:1160)");
        }
        Lifecycle lifecycle = ((LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
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
            rememberedValue2 = AbstractC19036aL1.m65148g(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = AbstractC19036aL1.m65148g(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        MutableState mutableState3 = (MutableState) rememberedValue3;
        State collectAsState = SnapshotStateKt.collectAsState(this.$viewModel.getConsentNonTelcoState(), null, composer, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.$viewModel.isSmartCard(), null, composer, 8, 1);
        Unit unit = Unit.INSTANCE;
        EffectsKt.LaunchedEffect(unit, new C152471(lifecycle, this.$viewModel, this.$navController, mutableState3, mutableState2, mutableState, null), composer, 70);
        EffectsKt.LaunchedEffect(unit, new C152512(this.$viewModel, null), composer, 70);
        ConsentScreenKt.ConsentScreen(null, null, invoke$lambda$9(collectAsState), new C152523(this.$viewModel, this.$navController, mutableState3, collectAsState2), new C152534(this.$viewModel, this.$navController, mutableState3, collectAsState2), null, composer, 0, 35);
        composer.startReplaceableGroup(1738391738);
        if (invoke$lambda$7(mutableState3)) {
            OneDialogKt.OneDialogLoading(null, null, composer, 0, 3);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(1738391789);
        if (invoke$lambda$1(mutableState) && (invoke$lambda$4 = invoke$lambda$4(mutableState2)) != null) {
            String desc = invoke$lambda$4.getDesc();
            if (desc == null) {
                desc = "";
            }
            String responseDateTime = invoke$lambda$4.getResponseDateTime();
            String str = responseDateTime == null ? "" : responseDateTime;
            String code = invoke$lambda$4.getCode();
            if (code == null) {
                code = "";
            }
            String systemMessage = invoke$lambda$4.getSystemMessage();
            String str2 = systemMessage == null ? "" : systemMessage;
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new OneTolNavGraphKt$oneTolNavGraph$1$16$1$5$1$1(mutableState);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            OneDialogKt.OneDialogError(desc, "", code, str2, (Function0) rememberedValue4, str, composer, 48, 0);
        }
        composer.endReplaceableGroup();
        BackHandlerKt.BackHandler(true, C152546.INSTANCE, composer, 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}