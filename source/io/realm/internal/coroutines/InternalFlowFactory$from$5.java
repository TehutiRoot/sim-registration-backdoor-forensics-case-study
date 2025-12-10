package io.realm.internal.coroutines;

import io.realm.Realm;
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

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, m28850d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/RealmList;"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.realm.internal.coroutines.InternalFlowFactory$from$5", m28800f = "InternalFlowFactory.kt", m28799i = {}, m28798l = {314, 342}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$from$5 extends SuspendLambda implements Function2<ProducerScope<? super RealmList<T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ RealmList<T> $realmList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "T", "invoke"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$5$1 */
    /* loaded from: classes5.dex */
    public static final class C113461 extends Lambda implements Function0<Unit> {
        public static final C113461 INSTANCE = new C113461();

        public C113461() {
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
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$5$2 */
    /* loaded from: classes5.dex */
    public static final class C113472 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Realm $flowRealm;
        final /* synthetic */ RealmChangeListener<RealmList<T>> $listener;
        final /* synthetic */ RealmList<T> $realmList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113472(Realm realm, RealmList<T> realmList, RealmChangeListener<RealmList<T>> realmChangeListener) {
            super(0);
            this.$flowRealm = realm;
            this.$realmList = realmList;
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
            this.$realmList.removeChangeListener((RealmChangeListener<RealmList<T>>) this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$5(RealmList<T> realmList, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, Continuation<? super InternalFlowFactory$from$5> continuation) {
        super(2, continuation);
        this.$realmList = realmList;
        this.$config = realmConfiguration;
        this.this$0 = internalFlowFactory;
    }

    /* renamed from: a */
    public static /* synthetic */ void m29494a(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmList realmList) {
        m74077invokeSuspend$lambda0(producerScope, internalFlowFactory, realmList);
    }

    /* renamed from: invokeSuspend$lambda-0 */
    public static final void m74077invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmList realmList) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            if (realmList.isValid()) {
                z = internalFlowFactory.f66814a;
                if (z) {
                    RealmList freeze = realmList.freeze();
                    Intrinsics.checkNotNullExpressionValue(freeze, "listenerResults.freeze()");
                    producerScope.mo74066trySendJP2dKIU(freeze);
                    return;
                }
                producerScope.mo74066trySendJP2dKIU(realmList);
                return;
            }
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$from$5 internalFlowFactory$from$5 = new InternalFlowFactory$from$5(this.$realmList, this.$config, this.this$0, continuation);
        internalFlowFactory$from$5.L$0 = obj;
        return internalFlowFactory$from$5;
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
        if (!this.$realmList.isValid()) {
            C113461 c113461 = C113461.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113461, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        Realm realm = Realm.getInstance(this.$config);
        final InternalFlowFactory internalFlowFactory = this.this$0;
        RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.k
            @Override // io.realm.RealmChangeListener
            public final void onChange(Object obj2) {
                InternalFlowFactory$from$5.m29494a(ProducerScope.this, internalFlowFactory, (RealmList) obj2);
            }
        };
        this.$realmList.addChangeListener(realmChangeListener);
        z = this.this$0.f66814a;
        if (z) {
            RealmList freeze = this.$realmList.freeze();
            Intrinsics.checkNotNullExpressionValue(freeze, "realmList.freeze()");
            producerScope.mo74066trySendJP2dKIU(freeze);
        } else {
            producerScope.mo74066trySendJP2dKIU(this.$realmList);
        }
        C113472 c113472 = new C113472(realm, this.$realmList, realmChangeListener);
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, c113472, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super RealmList<T>> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$from$5) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
