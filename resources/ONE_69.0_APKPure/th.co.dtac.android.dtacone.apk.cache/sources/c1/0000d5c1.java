package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.p021rx.CollectionChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00040\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/CollectionChange;", "Lio/realm/RealmList;"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4", m29092f = "InternalFlowFactory.kt", m29091i = {}, m29090l = {467, 495}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$changesetFrom$4 extends SuspendLambda implements Function2<ProducerScope<? super CollectionChange<RealmList<T>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ RealmList<T> $list;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "T", "invoke"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4$1 */
    /* loaded from: classes5.dex */
    public static final class C113211 extends Lambda implements Function0<Unit> {
        public static final C113211 INSTANCE = new C113211();

        public C113211() {
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
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$4$2 */
    /* loaded from: classes5.dex */
    public static final class C113222 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DynamicRealm $flowRealm;
        final /* synthetic */ RealmList<T> $list;
        final /* synthetic */ OrderedRealmCollectionChangeListener<RealmList<T>> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113222(DynamicRealm dynamicRealm, RealmList<T> realmList, OrderedRealmCollectionChangeListener<RealmList<T>> orderedRealmCollectionChangeListener) {
            super(0);
            this.$flowRealm = dynamicRealm;
            this.$list = realmList;
            this.$listener = orderedRealmCollectionChangeListener;
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
            this.$list.removeChangeListener((OrderedRealmCollectionChangeListener<RealmList<T>>) this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$changesetFrom$4(RealmList<T> realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, Continuation<? super InternalFlowFactory$changesetFrom$4> continuation) {
        super(2, continuation);
        this.$list = realmList;
        this.$config = realmConfiguration;
        this.this$0 = internalFlowFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m74254invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmList realmList, OrderedCollectionChangeSet orderedCollectionChangeSet) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            if (realmList.isValid()) {
                z = internalFlowFactory.f66877a;
                if (z) {
                    producerScope.mo74250trySendJP2dKIU(new CollectionChange(realmList.freeze(), orderedCollectionChangeSet));
                    return;
                } else {
                    producerScope.mo74250trySendJP2dKIU(new CollectionChange(realmList, orderedCollectionChangeSet));
                    return;
                }
            }
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$changesetFrom$4 internalFlowFactory$changesetFrom$4 = new InternalFlowFactory$changesetFrom$4(this.$list, this.$config, this.this$0, continuation);
        internalFlowFactory$changesetFrom$4.L$0 = obj;
        return internalFlowFactory$changesetFrom$4;
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
        if (!this.$list.isValid()) {
            C113211 c113211 = C113211.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113211, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
        final InternalFlowFactory internalFlowFactory = this.this$0;
        OrderedRealmCollectionChangeListener orderedRealmCollectionChangeListener = new OrderedRealmCollectionChangeListener() { // from class: io.realm.internal.coroutines.d
            @Override // io.realm.OrderedRealmCollectionChangeListener
            public final void onChange(Object obj2, OrderedCollectionChangeSet orderedCollectionChangeSet) {
                InternalFlowFactory$changesetFrom$4.m74254invokeSuspend$lambda0(ProducerScope.this, internalFlowFactory, (RealmList) obj2, orderedCollectionChangeSet);
            }
        };
        this.$list.addChangeListener(orderedRealmCollectionChangeListener);
        z = this.this$0.f66877a;
        if (z) {
            producerScope.mo74250trySendJP2dKIU(new CollectionChange(this.$list.freeze(), null));
        } else {
            producerScope.mo74250trySendJP2dKIU(new CollectionChange(this.$list, null));
        }
        C113222 c113222 = new C113222(dynamicRealm, this.$list, orderedRealmCollectionChangeListener);
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, c113222, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super CollectionChange<RealmList<T>>> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$changesetFrom$4) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}