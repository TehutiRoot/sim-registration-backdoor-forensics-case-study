package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.RealmChangeListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/DynamicRealm;"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.realm.internal.coroutines.InternalFlowFactory$from$2", m28800f = "InternalFlowFactory.kt", m28799i = {}, m28798l = {97}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$from$2 extends SuspendLambda implements Function2<ProducerScope<? super DynamicRealm>, Continuation<? super Unit>, Object> {
    final /* synthetic */ DynamicRealm $dynamicRealm;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$2$1 */
    /* loaded from: classes5.dex */
    public static final class C113411 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DynamicRealm $flowRealm;
        final /* synthetic */ RealmChangeListener<DynamicRealm> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113411(DynamicRealm dynamicRealm, RealmChangeListener<DynamicRealm> realmChangeListener) {
            super(0);
            this.$flowRealm = dynamicRealm;
            this.$listener = realmChangeListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final void invoke2() {
            this.$flowRealm.removeChangeListener(this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$2(DynamicRealm dynamicRealm, InternalFlowFactory internalFlowFactory, Continuation<? super InternalFlowFactory$from$2> continuation) {
        super(2, continuation);
        this.$dynamicRealm = dynamicRealm;
        this.this$0 = internalFlowFactory;
    }

    /* renamed from: a */
    public static /* synthetic */ void m29497a(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, DynamicRealm dynamicRealm, DynamicRealm dynamicRealm2) {
        m74074invokeSuspend$lambda0(producerScope, internalFlowFactory, dynamicRealm, dynamicRealm2);
    }

    /* renamed from: invokeSuspend$lambda-0 */
    public static final void m74074invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, DynamicRealm dynamicRealm, DynamicRealm dynamicRealm2) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            z = internalFlowFactory.f66814a;
            if (z) {
                DynamicRealm freeze = dynamicRealm.freeze();
                Intrinsics.checkNotNullExpressionValue(freeze, "dynamicRealm.freeze()");
                producerScope.mo74066trySendJP2dKIU(freeze);
                return;
            }
            producerScope.mo74066trySendJP2dKIU(dynamicRealm2);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$from$2 internalFlowFactory$from$2 = new InternalFlowFactory$from$2(this.$dynamicRealm, this.this$0, continuation);
        internalFlowFactory$from$2.L$0 = obj;
        return internalFlowFactory$from$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            DynamicRealm flowRealm = DynamicRealm.getInstance(this.$dynamicRealm.getConfiguration());
            final InternalFlowFactory internalFlowFactory = this.this$0;
            final DynamicRealm dynamicRealm = this.$dynamicRealm;
            RealmChangeListener<DynamicRealm> realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.h
                @Override // io.realm.RealmChangeListener
                public final void onChange(Object obj2) {
                    InternalFlowFactory$from$2.m29497a(ProducerScope.this, internalFlowFactory, dynamicRealm, (DynamicRealm) obj2);
                }
            };
            flowRealm.addChangeListener(realmChangeListener);
            z = this.this$0.f66814a;
            if (z) {
                DynamicRealm freeze = flowRealm.freeze();
                Intrinsics.checkNotNullExpressionValue(freeze, "flowRealm.freeze()");
                producerScope.mo74066trySendJP2dKIU(freeze);
            } else {
                Intrinsics.checkNotNullExpressionValue(flowRealm, "flowRealm");
                producerScope.mo74066trySendJP2dKIU(flowRealm);
            }
            C113411 c113411 = new C113411(flowRealm, realmChangeListener);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113411, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super DynamicRealm> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$from$2) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
