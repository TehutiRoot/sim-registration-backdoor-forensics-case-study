package io.realm.internal.coroutines;

import io.realm.Realm;
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

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/Realm;"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.realm.internal.coroutines.InternalFlowFactory$from$1", m29092f = "InternalFlowFactory.kt", m29091i = {}, m29090l = {64}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$from$1 extends SuspendLambda implements Function2<ProducerScope<? super Realm>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Realm $realm;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$1$1 */
    /* loaded from: classes5.dex */
    public static final class C113271 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Realm $flowRealm;
        final /* synthetic */ RealmChangeListener<Realm> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113271(Realm realm, RealmChangeListener<Realm> realmChangeListener) {
            super(0);
            this.$flowRealm = realm;
            this.$listener = realmChangeListener;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$flowRealm.removeChangeListener(this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$1(Realm realm, InternalFlowFactory internalFlowFactory, Continuation<? super InternalFlowFactory$from$1> continuation) {
        super(2, continuation);
        this.$realm = realm;
        this.this$0 = internalFlowFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m74257invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, Realm realm, Realm realm2) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            z = internalFlowFactory.f66877a;
            if (z) {
                Realm freeze = realm.freeze();
                Intrinsics.checkNotNullExpressionValue(freeze, "realm.freeze()");
                producerScope.mo74250trySendJP2dKIU(freeze);
                return;
            }
            producerScope.mo74250trySendJP2dKIU(realm2);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$from$1 internalFlowFactory$from$1 = new InternalFlowFactory$from$1(this.$realm, this.this$0, continuation);
        internalFlowFactory$from$1.L$0 = obj;
        return internalFlowFactory$from$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
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
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            Realm flowRealm = Realm.getInstance(this.$realm.getConfiguration());
            final InternalFlowFactory internalFlowFactory = this.this$0;
            final Realm realm = this.$realm;
            RealmChangeListener<Realm> realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.g
                @Override // io.realm.RealmChangeListener
                public final void onChange(Object obj2) {
                    InternalFlowFactory$from$1.m74257invokeSuspend$lambda0(ProducerScope.this, internalFlowFactory, realm, (Realm) obj2);
                }
            };
            flowRealm.addChangeListener(realmChangeListener);
            z = this.this$0.f66877a;
            if (z) {
                Realm freeze = flowRealm.freeze();
                Intrinsics.checkNotNullExpressionValue(freeze, "flowRealm.freeze()");
                producerScope.mo74250trySendJP2dKIU(freeze);
            } else {
                Intrinsics.checkNotNullExpressionValue(flowRealm, "flowRealm");
                producerScope.mo74250trySendJP2dKIU(flowRealm);
            }
            C113271 c113271 = new C113271(flowRealm, realmChangeListener);
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113271, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super Realm> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$from$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}