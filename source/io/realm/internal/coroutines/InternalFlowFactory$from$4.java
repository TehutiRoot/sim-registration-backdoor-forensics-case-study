package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.RealmChangeListener;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;
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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, m28850d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/RealmResults;"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.realm.internal.coroutines.InternalFlowFactory$from$4", m28800f = "InternalFlowFactory.kt", m28799i = {}, m28798l = {216, 242}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$from$4 extends SuspendLambda implements Function2<ProducerScope<? super RealmResults<T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ RealmResults<T> $results;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "T", "invoke"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$4$1 */
    /* loaded from: classes5.dex */
    public static final class C113441 extends Lambda implements Function0<Unit> {
        public static final C113441 INSTANCE = new C113441();

        public C113441() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "T", "invoke"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$4$2 */
    /* loaded from: classes5.dex */
    public static final class C113452 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DynamicRealm $flowRealm;
        final /* synthetic */ RealmChangeListener<RealmResults<T>> $listener;
        final /* synthetic */ RealmResults<T> $results;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113452(DynamicRealm dynamicRealm, RealmResults<T> realmResults, RealmChangeListener<RealmResults<T>> realmChangeListener) {
            super(0);
            this.$flowRealm = dynamicRealm;
            this.$results = realmResults;
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
            if (this.$flowRealm.isClosed()) {
                return;
            }
            this.$results.removeChangeListener((RealmChangeListener<RealmResults<T>>) this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$4(RealmResults<T> realmResults, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, Continuation<? super InternalFlowFactory$from$4> continuation) {
        super(2, continuation);
        this.$results = realmResults;
        this.$config = realmConfiguration;
        this.this$0 = internalFlowFactory;
    }

    /* renamed from: a */
    public static /* synthetic */ void m29495a(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmResults realmResults) {
        m74076invokeSuspend$lambda0(producerScope, internalFlowFactory, realmResults);
    }

    /* renamed from: invokeSuspend$lambda-0 */
    public static final void m74076invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmResults realmResults) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            z = internalFlowFactory.f66814a;
            if (z) {
                RealmResults freeze = realmResults.freeze();
                Intrinsics.checkNotNullExpressionValue(freeze, "listenerResults.freeze()");
                producerScope.mo74066trySendJP2dKIU(freeze);
                return;
            }
            producerScope.mo74066trySendJP2dKIU(realmResults);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$from$4 internalFlowFactory$from$4 = new InternalFlowFactory$from$4(this.$results, this.$config, this.this$0, continuation);
        internalFlowFactory$from$4.L$0 = obj;
        return internalFlowFactory$from$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
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
        if (!this.$results.isValid()) {
            C113441 c113441 = C113441.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113441, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
        final InternalFlowFactory internalFlowFactory = this.this$0;
        RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.j
            @Override // io.realm.RealmChangeListener
            public final void onChange(Object obj2) {
                InternalFlowFactory$from$4.m29495a(ProducerScope.this, internalFlowFactory, (RealmResults) obj2);
            }
        };
        this.$results.addChangeListener(realmChangeListener);
        z = this.this$0.f66814a;
        if (z) {
            RealmResults freeze = this.$results.freeze();
            Intrinsics.checkNotNullExpressionValue(freeze, "results.freeze()");
            producerScope.mo74066trySendJP2dKIU(freeze);
        } else {
            producerScope.mo74066trySendJP2dKIU(this.$results);
        }
        C113452 c113452 = new C113452(dynamicRealm, this.$results, realmChangeListener);
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, c113452, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super RealmResults<T>> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$from$4) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
