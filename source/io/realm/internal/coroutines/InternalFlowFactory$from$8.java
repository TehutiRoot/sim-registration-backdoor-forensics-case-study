package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.DynamicRealmObject;
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

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/DynamicRealmObject;"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.realm.internal.coroutines.InternalFlowFactory$from$8", m28800f = "InternalFlowFactory.kt", m28799i = {}, m28798l = {622, 650}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$from$8 extends SuspendLambda implements Function2<ProducerScope<? super DynamicRealmObject>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ DynamicRealm $dynamicRealm;
    final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$8$1 */
    /* loaded from: classes5.dex */
    public static final class C113521 extends Lambda implements Function0<Unit> {
        public static final C113521 INSTANCE = new C113521();

        public C113521() {
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

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$from$8$2 */
    /* loaded from: classes5.dex */
    public static final class C113532 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
        final /* synthetic */ DynamicRealm $flowRealm;
        final /* synthetic */ RealmChangeListener<DynamicRealmObject> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113532(DynamicRealm dynamicRealm, DynamicRealmObject dynamicRealmObject, RealmChangeListener<DynamicRealmObject> realmChangeListener) {
            super(0);
            this.$flowRealm = dynamicRealm;
            this.$dynamicRealmObject = dynamicRealmObject;
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
            this.$dynamicRealmObject.removeChangeListener(this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$from$8(DynamicRealm dynamicRealm, RealmConfiguration realmConfiguration, DynamicRealmObject dynamicRealmObject, InternalFlowFactory internalFlowFactory, Continuation<? super InternalFlowFactory$from$8> continuation) {
        super(2, continuation);
        this.$dynamicRealm = dynamicRealm;
        this.$config = realmConfiguration;
        this.$dynamicRealmObject = dynamicRealmObject;
        this.this$0 = internalFlowFactory;
    }

    /* renamed from: a */
    public static /* synthetic */ void m29491a(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, DynamicRealmObject dynamicRealmObject) {
        m74080invokeSuspend$lambda0(producerScope, internalFlowFactory, dynamicRealmObject);
    }

    /* renamed from: invokeSuspend$lambda-0 */
    public static final void m74080invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, DynamicRealmObject dynamicRealmObject) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            z = internalFlowFactory.f66814a;
            if (z) {
                RealmModel freeze = dynamicRealmObject.freeze();
                Intrinsics.checkNotNullExpressionValue(freeze, "listenerObj.freeze()");
                producerScope.mo74066trySendJP2dKIU(freeze);
                return;
            }
            producerScope.mo74066trySendJP2dKIU(dynamicRealmObject);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$from$8 internalFlowFactory$from$8 = new InternalFlowFactory$from$8(this.$dynamicRealm, this.$config, this.$dynamicRealmObject, this.this$0, continuation);
        internalFlowFactory$from$8.L$0 = obj;
        return internalFlowFactory$from$8;
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
        if (this.$dynamicRealm.isClosed()) {
            C113521 c113521 = C113521.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113521, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        DynamicRealm dynamicRealm = DynamicRealm.getInstance(this.$config);
        final InternalFlowFactory internalFlowFactory = this.this$0;
        RealmChangeListener realmChangeListener = new RealmChangeListener() { // from class: io.realm.internal.coroutines.n
            @Override // io.realm.RealmChangeListener
            public final void onChange(Object obj2) {
                InternalFlowFactory$from$8.m29491a(ProducerScope.this, internalFlowFactory, (DynamicRealmObject) obj2);
            }
        };
        this.$dynamicRealmObject.addChangeListener(realmChangeListener);
        if (RealmObject.isLoaded(this.$dynamicRealmObject)) {
            z = this.this$0.f66814a;
            if (z) {
                RealmModel freeze = RealmObject.freeze(this.$dynamicRealmObject);
                Intrinsics.checkNotNullExpressionValue(freeze, "freeze(dynamicRealmObject)");
                producerScope.mo74066trySendJP2dKIU(freeze);
            } else {
                producerScope.mo74066trySendJP2dKIU(this.$dynamicRealmObject);
            }
        }
        C113532 c113532 = new C113532(dynamicRealm, this.$dynamicRealmObject, realmChangeListener);
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, c113532, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super DynamicRealmObject> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$from$8) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
