package io.realm.internal.coroutines;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
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

/* JADX WARN: Incorrect field signature: TT; */
@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m29142d2 = {"<anonymous>", "", "T", "Lio/realm/RealmModel;", "Lkotlinx/coroutines/channels/ProducerScope;"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.realm.internal.coroutines.InternalFlowFactory$from$7", m29092f = "InternalFlowFactory.kt", m29091i = {}, m29090l = {517, 545}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$from$7 extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ Realm $realm;
    final /* synthetic */ RealmModel $realmObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "T", "Lio/realm/RealmModel;", "invoke"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$7$1 */
    /* loaded from: classes5.dex */
    public static final class C113371 extends Lambda implements Function0<Unit> {
        public static final C113371 INSTANCE = new C113371();

        public C113371() {
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

    /* JADX WARN: Incorrect field signature: TT; */
    @Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "T", "Lio/realm/RealmModel;", "invoke"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$7$2 */
    /* loaded from: classes5.dex */
    public static final class C113382 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Realm $flowRealm;
        final /* synthetic */ RealmChangeListener<T> $listener;
        final /* synthetic */ RealmModel $realmObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;TT;Lio/realm/RealmChangeListener<TT;>;)V */
        public C113382(Realm realm, RealmModel realmModel, RealmChangeListener realmChangeListener) {
            super(0);
            this.$flowRealm = realm;
            this.$realmObject = realmModel;
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
            RealmObject.removeChangeListener(this.$realmObject, (RealmChangeListener<RealmModel>) this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lio/realm/Realm;Lio/realm/RealmConfiguration;TT;Lio/realm/internal/coroutines/InternalFlowFactory;Lkotlin/coroutines/Continuation<-Lio/realm/internal/coroutines/InternalFlowFactory$from$7;>;)V */
    public InternalFlowFactory$from$7(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.$realm = realm;
        this.$config = realmConfiguration;
        this.$realmObject = realmModel;
        this.this$0 = internalFlowFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m74263invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmModel realmModel) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            z = internalFlowFactory.f66877a;
            if (z) {
                RealmModel freeze = RealmObject.freeze(realmModel);
                if (freeze != null) {
                    producerScope.mo74250trySendJP2dKIU(freeze);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type T of io.realm.internal.coroutines.InternalFlowFactory.from.<no name provided>.invokeSuspend$lambda-0");
            }
            producerScope.mo74250trySendJP2dKIU(realmModel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$from$7 internalFlowFactory$from$7 = new InternalFlowFactory$from$7(this.$realm, this.$config, this.$realmObject, this.this$0, continuation);
        internalFlowFactory$from$7.L$0 = obj;
        return internalFlowFactory$from$7;
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
        if (this.$realm.isClosed()) {
            C113371 c113371 = C113371.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113371, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        Realm realm = Realm.getInstance(this.$config);
        final InternalFlowFactory internalFlowFactory = this.this$0;
        RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.m
            @Override // io.realm.RealmChangeListener
            public final void onChange(Object obj2) {
                InternalFlowFactory$from$7.m74263invokeSuspend$lambda0(ProducerScope.this, internalFlowFactory, (RealmModel) obj2);
            }
        };
        RealmObject.addChangeListener(this.$realmObject, realmChangeListener);
        if (RealmObject.isLoaded(this.$realmObject)) {
            z = this.this$0.f66877a;
            if (z) {
                RealmModel freeze = RealmObject.freeze(this.$realmObject);
                Intrinsics.checkNotNullExpressionValue(freeze, "freeze(realmObject)");
                producerScope.mo74250trySendJP2dKIU(freeze);
            } else {
                producerScope.mo74250trySendJP2dKIU(this.$realmObject);
            }
        }
        C113382 c113382 = new C113382(realm, this.$realmObject, realmChangeListener);
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, c113382, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super T> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$from$7) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}