package io.realm.internal.coroutines;

import io.realm.ObjectChangeSet;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.RealmObjectChangeListener;
import io.realm.p021rx.ObjectChange;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u008a@"}, m28850d2 = {"<anonymous>", "", "T", "Lio/realm/RealmModel;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/ObjectChange;"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5", m28800f = "InternalFlowFactory.kt", m28799i = {}, m28798l = {569, 597}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$changesetFrom$5 extends SuspendLambda implements Function2<ProducerScope<? super ObjectChange<T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ Realm $realm;
    final /* synthetic */ RealmModel $realmObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "T", "Lio/realm/RealmModel;", "invoke"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$1 */
    /* loaded from: classes5.dex */
    public static final class C113361 extends Lambda implements Function0<Unit> {
        public static final C113361 INSTANCE = new C113361();

        public C113361() {
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

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "T", "Lio/realm/RealmModel;", "invoke"}, m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$5$2 */
    /* loaded from: classes5.dex */
    public static final class C113372 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Realm $flowRealm;
        final /* synthetic */ RealmObjectChangeListener<T> $listener;
        final /* synthetic */ RealmModel $realmObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113372(Realm realm, RealmModel realmModel, RealmObjectChangeListener realmObjectChangeListener) {
            super(0);
            this.$flowRealm = realm;
            this.$realmObject = realmModel;
            this.$listener = realmObjectChangeListener;
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
            RealmObject.removeChangeListener(this.$realmObject, this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$changesetFrom$5(Realm realm, RealmConfiguration realmConfiguration, RealmModel realmModel, InternalFlowFactory internalFlowFactory, Continuation continuation) {
        super(2, continuation);
        this.$realm = realm;
        this.$config = realmConfiguration;
        this.$realmObject = realmModel;
        this.this$0 = internalFlowFactory;
    }

    /* renamed from: a */
    public static /* synthetic */ void m29500a(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmModel realmModel, ObjectChangeSet objectChangeSet) {
        m74071invokeSuspend$lambda0(producerScope, internalFlowFactory, realmModel, objectChangeSet);
    }

    /* renamed from: invokeSuspend$lambda-0 */
    public static final void m74071invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, RealmModel realmModel, ObjectChangeSet objectChangeSet) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            z = internalFlowFactory.f66814a;
            if (z) {
                producerScope.mo74066trySendJP2dKIU(new ObjectChange(RealmObject.freeze(realmModel), objectChangeSet));
            } else {
                producerScope.mo74066trySendJP2dKIU(new ObjectChange(realmModel, objectChangeSet));
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$changesetFrom$5 internalFlowFactory$changesetFrom$5 = new InternalFlowFactory$changesetFrom$5(this.$realm, this.$config, this.$realmObject, this.this$0, continuation);
        internalFlowFactory$changesetFrom$5.L$0 = obj;
        return internalFlowFactory$changesetFrom$5;
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
        if (this.$realm.isClosed()) {
            C113361 c113361 = C113361.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113361, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        Realm realm = Realm.getInstance(this.$config);
        final InternalFlowFactory internalFlowFactory = this.this$0;
        RealmObjectChangeListener realmObjectChangeListener = new RealmObjectChangeListener() { // from class: io.realm.internal.coroutines.e
            @Override // io.realm.RealmObjectChangeListener
            public final void onChange(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
                InternalFlowFactory$changesetFrom$5.m29500a(ProducerScope.this, internalFlowFactory, realmModel, objectChangeSet);
            }
        };
        RealmObject.addChangeListener(this.$realmObject, realmObjectChangeListener);
        if (RealmObject.isLoaded(this.$realmObject)) {
            z = this.this$0.f66814a;
            if (z) {
                producerScope.mo74066trySendJP2dKIU(new ObjectChange(RealmObject.freeze(this.$realmObject), null));
            } else {
                producerScope.mo74066trySendJP2dKIU(new ObjectChange(this.$realmObject, null));
            }
        }
        C113372 c113372 = new C113372(realm, this.$realmObject, realmObjectChangeListener);
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, c113372, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super ObjectChange<T>> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$changesetFrom$5) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
