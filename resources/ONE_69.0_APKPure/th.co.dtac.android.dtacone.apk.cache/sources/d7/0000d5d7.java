package io.realm.internal.coroutines;

import com.mixpanel.android.java_websocket.WebSocket;
import io.realm.DynamicRealm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
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
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/RealmList;"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.realm.internal.coroutines.InternalFlowFactory$from$6", m29092f = "InternalFlowFactory.kt", m29091i = {}, m29090l = {415, WebSocket.DEFAULT_WSS_PORT}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$from$6 extends SuspendLambda implements Function2<ProducerScope<? super RealmList<T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ RealmList<T> $realmList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "T", "invoke"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$6$1 */
    /* loaded from: classes5.dex */
    public static final class C113351 extends Lambda implements Function0<Unit> {
        public static final C113351 INSTANCE = new C113351();

        public C113351() {
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

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "T", "invoke"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$6$2 */
    /* loaded from: classes5.dex */
    public static final class C113362 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DynamicRealm $flowRealm;
        final /* synthetic */ RealmChangeListener<RealmList<T>> $listener;
        final /* synthetic */ RealmList<T> $realmList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113362(DynamicRealm dynamicRealm, RealmList<T> realmList, RealmChangeListener<RealmList<T>> realmChangeListener) {
            super(0);
            this.$flowRealm = dynamicRealm;
            this.$realmList = realmList;
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
            if (this.$flowRealm.isClosed()) {
                return;
            }
            this.$realmList.removeChangeListener((RealmChangeListener<RealmList<T>>) this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$6(RealmList<T> realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, Continuation<? super InternalFlowFactory$from$6> continuation) {
        super(2, continuation);
        this.$realmList = realmList;
        this.$config = realmConfiguration;
        this.this$0 = internalFlowFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m74262invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmList realmList) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            if (realmList.isValid()) {
                z = internalFlowFactory.f66877a;
                if (z) {
                    RealmList freeze = realmList.freeze();
                    Intrinsics.checkNotNullExpressionValue(freeze, "listenerResults.freeze()");
                    producerScope.mo74250trySendJP2dKIU(freeze);
                    return;
                }
                producerScope.mo74250trySendJP2dKIU(realmList);
                return;
            }
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$from$6 internalFlowFactory$from$6 = new InternalFlowFactory$from$6(this.$realmList, this.$config, this.this$0, continuation);
        internalFlowFactory$from$6.L$0 = obj;
        return internalFlowFactory$from$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        final ProducerScope producerScope = (ProducerScope) this.L$0;
        if (!this.$realmList.isValid()) {
            C113351 c113351 = C113351.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113351, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
        final InternalFlowFactory internalFlowFactory = this.this$0;
        RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.l
            @Override // io.realm.RealmChangeListener
            public final void onChange(Object obj2) {
                InternalFlowFactory$from$6.m74262invokeSuspend$lambda0(ProducerScope.this, internalFlowFactory, (RealmList) obj2);
            }
        };
        this.$realmList.addChangeListener(realmChangeListener);
        z = this.this$0.f66877a;
        if (z) {
            RealmList freeze = this.$realmList.freeze();
            Intrinsics.checkNotNullExpressionValue(freeze, "realmList.freeze()");
            producerScope.mo74250trySendJP2dKIU(freeze);
        } else {
            producerScope.mo74250trySendJP2dKIU(this.$realmList);
        }
        C113362 c113362 = new C113362(dynamicRealm, this.$realmList, realmChangeListener);
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, c113362, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super RealmList<T>> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$from$6) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}