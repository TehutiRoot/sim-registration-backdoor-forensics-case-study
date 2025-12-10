package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.navigation.NavController;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.discount.DiscountItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneTolScreen;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {1475}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$NavigateDiscountOrDevice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ SharedFlow<List<DiscountItem>> $onGetDiscountSuccess;
    int label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$1$1 */
    /* loaded from: classes10.dex */
    public static final class C152031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ NavController $navController;
        final /* synthetic */ SharedFlow<List<DiscountItem>> $onGetDiscountSuccess;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {1477}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$1$1$1 */
        /* loaded from: classes10.dex */
        public static final class C152041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NavController $navController;
            final /* synthetic */ SharedFlow<List<DiscountItem>> $onGetDiscountSuccess;
            int label;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$1$1$1$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$NavigateDiscountOrDevice$1$1$1$1 */
            /* loaded from: classes10.dex */
            public static final class C152051 extends SuspendLambda implements Function2<List<? extends DiscountItem>, Continuation<? super Unit>, Object> {
                final /* synthetic */ NavController $navController;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C152051(NavController navController, Continuation<? super C152051> continuation) {
                    super(2, continuation);
                    this.$navController = navController;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C152051 c152051 = new C152051(this.$navController, continuation);
                    c152051.L$0 = obj;
                    return c152051;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends DiscountItem> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<DiscountItem>) list, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!((List) this.L$0).isEmpty()) {
                            NavController.navigate$default(this.$navController, OneTolScreen.Tol.Discount.ROUTE, null, null, 6, null);
                        } else {
                            NavController.navigate$default(this.$navController, OneTolScreen.Tol.Device.ROUTE, null, null, 6, null);
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Nullable
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull List<DiscountItem> list, @Nullable Continuation<? super Unit> continuation) {
                    return ((C152051) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C152041(SharedFlow<? extends List<DiscountItem>> sharedFlow, NavController navController, Continuation<? super C152041> continuation) {
                super(2, continuation);
                this.$onGetDiscountSuccess = sharedFlow;
                this.$navController = navController;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C152041(this.$onGetDiscountSuccess, this.$navController, continuation);
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
                    SharedFlow<List<DiscountItem>> sharedFlow = this.$onGetDiscountSuccess;
                    C152051 c152051 = new C152051(this.$navController, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c152051, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C152041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C152031(SharedFlow<? extends List<DiscountItem>> sharedFlow, NavController navController, Continuation<? super C152031> continuation) {
            super(2, continuation);
            this.$onGetDiscountSuccess = sharedFlow;
            this.$navController = navController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C152031 c152031 = new C152031(this.$onGetDiscountSuccess, this.$navController, continuation);
            c152031.L$0 = obj;
            return c152031;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC1539Vc.m65885e((CoroutineScope) this.L$0, null, null, new C152041(this.$onGetDiscountSuccess, this.$navController, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C152031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneTolNavGraphKt$NavigateDiscountOrDevice$1(Lifecycle lifecycle, SharedFlow<? extends List<DiscountItem>> sharedFlow, NavController navController, Continuation<? super OneTolNavGraphKt$NavigateDiscountOrDevice$1> continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$onGetDiscountSuccess = sharedFlow;
        this.$navController = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneTolNavGraphKt$NavigateDiscountOrDevice$1(this.$lifecycle, this.$onGetDiscountSuccess, this.$navController, continuation);
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
            C152031 c152031 = new C152031(this.$onGetDiscountSuccess, this.$navController, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c152031, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneTolNavGraphKt$NavigateDiscountOrDevice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}