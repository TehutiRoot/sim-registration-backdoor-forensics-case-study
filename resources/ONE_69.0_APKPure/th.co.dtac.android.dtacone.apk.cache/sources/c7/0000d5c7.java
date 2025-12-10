package io.realm.internal.coroutines;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.realm.DynamicRealmObject;
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

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/realm/rx/ObjectChange;", "Lio/realm/DynamicRealmObject;"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6", m29092f = "InternalFlowFactory.kt", m29091i = {}, m29090l = {674, TypedValues.TransitionType.TYPE_TO}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes5.dex */
public final class InternalFlowFactory$changesetFrom$6 extends SuspendLambda implements Function2<ProducerScope<? super ObjectChange<DynamicRealmObject>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ RealmConfiguration $config;
    final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InternalFlowFactory this$0;

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6$1 */
    /* loaded from: classes5.dex */
    public static final class C113251 extends Lambda implements Function0<Unit> {
        public static final C113251 INSTANCE = new C113251();

        public C113251() {
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

    @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 6, 0}, m29138xi = 48)
    /* renamed from: io.realm.internal.coroutines.InternalFlowFactory$changesetFrom$6$2 */
    /* loaded from: classes5.dex */
    public static final class C113262 extends Lambda implements Function0<Unit> {
        final /* synthetic */ DynamicRealmObject $dynamicRealmObject;
        final /* synthetic */ Realm $flowRealm;
        final /* synthetic */ RealmObjectChangeListener<DynamicRealmObject> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113262(Realm realm, DynamicRealmObject dynamicRealmObject, RealmObjectChangeListener<DynamicRealmObject> realmObjectChangeListener) {
            super(0);
            this.$flowRealm = realm;
            this.$dynamicRealmObject = dynamicRealmObject;
            this.$listener = realmObjectChangeListener;
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
            RealmObject.removeChangeListener(this.$dynamicRealmObject, this.$listener);
            this.$flowRealm.close();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalFlowFactory$changesetFrom$6(DynamicRealmObject dynamicRealmObject, RealmConfiguration realmConfiguration, InternalFlowFactory internalFlowFactory, Continuation<? super InternalFlowFactory$changesetFrom$6> continuation) {
        super(2, continuation);
        this.$dynamicRealmObject = dynamicRealmObject;
        this.$config = realmConfiguration;
        this.this$0 = internalFlowFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m74256invokeSuspend$lambda0(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, DynamicRealmObject dynamicRealmObject, ObjectChangeSet objectChangeSet) {
        boolean z;
        if (CoroutineScopeKt.isActive(producerScope)) {
            z = internalFlowFactory.f66877a;
            if (z) {
                producerScope.mo74250trySendJP2dKIU(new ObjectChange(RealmObject.freeze(dynamicRealmObject), objectChangeSet));
            } else {
                producerScope.mo74250trySendJP2dKIU(new ObjectChange(dynamicRealmObject, objectChangeSet));
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalFlowFactory$changesetFrom$6 internalFlowFactory$changesetFrom$6 = new InternalFlowFactory$changesetFrom$6(this.$dynamicRealmObject, this.$config, this.this$0, continuation);
        internalFlowFactory$changesetFrom$6.L$0 = obj;
        return internalFlowFactory$changesetFrom$6;
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
        if (!RealmObject.isValid(this.$dynamicRealmObject)) {
            C113251 c113251 = C113251.INSTANCE;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, c113251, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        Realm realm = Realm.getInstance(this.$config);
        final InternalFlowFactory internalFlowFactory = this.this$0;
        RealmObjectChangeListener realmObjectChangeListener = new RealmObjectChangeListener() { // from class: io.realm.internal.coroutines.f
            @Override // io.realm.RealmObjectChangeListener
            public final void onChange(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
                InternalFlowFactory$changesetFrom$6.m74256invokeSuspend$lambda0(ProducerScope.this, internalFlowFactory, (DynamicRealmObject) realmModel, objectChangeSet);
            }
        };
        RealmObject.addChangeListener(this.$dynamicRealmObject, realmObjectChangeListener);
        if (RealmObject.isLoaded(this.$dynamicRealmObject)) {
            z = this.this$0.f66877a;
            if (z) {
                producerScope.mo74250trySendJP2dKIU(new ObjectChange(RealmObject.freeze(this.$dynamicRealmObject), null));
            } else {
                producerScope.mo74250trySendJP2dKIU(new ObjectChange(this.$dynamicRealmObject, null));
            }
        }
        C113262 c113262 = new C113262(realm, this.$dynamicRealmObject, realmObjectChangeListener);
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, c113262, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ProducerScope<? super ObjectChange<DynamicRealmObject>> producerScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InternalFlowFactory$changesetFrom$6) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}