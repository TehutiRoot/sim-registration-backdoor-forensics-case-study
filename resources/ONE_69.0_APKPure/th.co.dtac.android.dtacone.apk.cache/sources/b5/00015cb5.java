package th.p047co.dtac.android.dtacone.widget.compose.smartCard;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.bouncycastle.asn1.eac.EACTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$1", m29092f = "IdCardReaderInfo.kt", m29091i = {}, m29090l = {57}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$1 */
/* loaded from: classes9.dex */
public final class IdCardReaderInfoKt$IdCardReaderInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Function0<Unit> $onFinished;
    final /* synthetic */ Function1<IdCardInformationCollection, Unit> $onSaveIdCard;
    final /* synthetic */ SharedFlow<IdCardInformationCollection> $onSuccessReadFinish;
    int label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$1$1", m29092f = "IdCardReaderInfo.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$1$1 */
    /* loaded from: classes9.dex */
    public static final class C167701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onFinished;
        final /* synthetic */ Function1<IdCardInformationCollection, Unit> $onSaveIdCard;
        final /* synthetic */ SharedFlow<IdCardInformationCollection> $onSuccessReadFinish;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$1$1$1", m29092f = "IdCardReaderInfo.kt", m29091i = {}, m29090l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$1$1$1 */
        /* loaded from: classes9.dex */
        public static final class C167711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $onFinished;
            final /* synthetic */ Function1<IdCardInformationCollection, Unit> $onSaveIdCard;
            final /* synthetic */ SharedFlow<IdCardInformationCollection> $onSuccessReadFinish;
            int label;

            @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
            @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$1$1$1$1", m29092f = "IdCardReaderInfo.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
            /* renamed from: th.co.dtac.android.dtacone.widget.compose.smartCard.IdCardReaderInfoKt$IdCardReaderInfo$1$1$1$1 */
            /* loaded from: classes9.dex */
            public static final class C167721 extends SuspendLambda implements Function2<IdCardInformationCollection, Continuation<? super Unit>, Object> {
                final /* synthetic */ Function0<Unit> $onFinished;
                final /* synthetic */ Function1<IdCardInformationCollection, Unit> $onSaveIdCard;
                /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C167721(Function1<? super IdCardInformationCollection, Unit> function1, Function0<Unit> function0, Continuation<? super C167721> continuation) {
                    super(2, continuation);
                    this.$onSaveIdCard = function1;
                    this.$onFinished = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C167721 c167721 = new C167721(this.$onSaveIdCard, this.$onFinished, continuation);
                    c167721.L$0 = obj;
                    return c167721;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        IdCardInformationCollection idCardInformationCollection = (IdCardInformationCollection) this.L$0;
                        if (idCardInformationCollection != null) {
                            Function1<IdCardInformationCollection, Unit> function1 = this.$onSaveIdCard;
                            Function0<Unit> function0 = this.$onFinished;
                            function1.invoke(idCardInformationCollection);
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@Nullable IdCardInformationCollection idCardInformationCollection, @Nullable Continuation<? super Unit> continuation) {
                    return ((C167721) create(idCardInformationCollection, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C167711(SharedFlow<? extends IdCardInformationCollection> sharedFlow, Function1<? super IdCardInformationCollection, Unit> function1, Function0<Unit> function0, Continuation<? super C167711> continuation) {
                super(2, continuation);
                this.$onSuccessReadFinish = sharedFlow;
                this.$onSaveIdCard = function1;
                this.$onFinished = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C167711(this.$onSuccessReadFinish, this.$onSaveIdCard, this.$onFinished, continuation);
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
                    SharedFlow<IdCardInformationCollection> sharedFlow = this.$onSuccessReadFinish;
                    C167721 c167721 = new C167721(this.$onSaveIdCard, this.$onFinished, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c167721, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C167711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C167701(SharedFlow<? extends IdCardInformationCollection> sharedFlow, Function1<? super IdCardInformationCollection, Unit> function1, Function0<Unit> function0, Continuation<? super C167701> continuation) {
            super(2, continuation);
            this.$onSuccessReadFinish = sharedFlow;
            this.$onSaveIdCard = function1;
            this.$onFinished = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C167701 c167701 = new C167701(this.$onSuccessReadFinish, this.$onSaveIdCard, this.$onFinished, continuation);
            c167701.L$0 = obj;
            return c167701;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC1539Vc.m65885e((CoroutineScope) this.L$0, null, null, new C167711(this.$onSuccessReadFinish, this.$onSaveIdCard, this.$onFinished, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C167701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdCardReaderInfoKt$IdCardReaderInfo$1(Lifecycle lifecycle, SharedFlow<? extends IdCardInformationCollection> sharedFlow, Function1<? super IdCardInformationCollection, Unit> function1, Function0<Unit> function0, Continuation<? super IdCardReaderInfoKt$IdCardReaderInfo$1> continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$onSuccessReadFinish = sharedFlow;
        this.$onSaveIdCard = function1;
        this.$onFinished = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new IdCardReaderInfoKt$IdCardReaderInfo$1(this.$lifecycle, this.$onSuccessReadFinish, this.$onSaveIdCard, this.$onFinished, continuation);
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
            C167701 c167701 = new C167701(this.$onSuccessReadFinish, this.$onSaveIdCard, this.$onFinished, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c167701, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((IdCardReaderInfoKt$IdCardReaderInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}