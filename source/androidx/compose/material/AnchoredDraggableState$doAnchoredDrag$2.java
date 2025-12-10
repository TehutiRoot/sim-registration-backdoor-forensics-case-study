package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import com.mixpanel.android.java_websocket.WebSocket;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m28850d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2", m28800f = "AnchoredDraggable.kt", m28799i = {}, m28798l = {441}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$doAnchoredDrag$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$doAnchoredDrag$2\n*L\n450#1:711,2\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$doAnchoredDrag$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<AnchoredDragScope, Map<T, Float>, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "T"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1", m28800f = "AnchoredDraggable.kt", m28799i = {}, m28798l = {WebSocket.DEFAULT_WSS_PORT}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1 */
    /* loaded from: classes.dex */
    public static final class C30601 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<AnchoredDragScope, Map<T, Float>, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30601(T t, AnchoredDraggableState<T> anchoredDraggableState, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C30601> continuation) {
            super(1, continuation);
            this.$targetValue = t;
            this.this$0 = anchoredDraggableState;
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C30601(this.$targetValue, this.this$0, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Unit> continuation) {
            return invoke2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AnchoredDragScope anchoredDragScope;
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
                Object obj2 = this.$targetValue;
                if (obj2 != null) {
                    this.this$0.m60958e(obj2);
                }
                Function3<AnchoredDragScope, Map<T, Float>, Continuation<? super Unit>, Object> function3 = this.$block;
                anchoredDragScope = this.this$0.f14342q;
                Map anchors$material_release = this.this$0.getAnchors$material_release();
                this.label = 1;
                if (function3.invoke(anchoredDragScope, anchors$material_release, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super Unit> continuation) {
            return ((C30601) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$doAnchoredDrag$2(T t, AnchoredDraggableState<T> anchoredDraggableState, MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super Map<T, Float>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnchoredDraggableState$doAnchoredDrag$2> continuation) {
        super(2, continuation);
        this.$targetValue = t;
        this.this$0 = anchoredDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AnchoredDraggableState$doAnchoredDrag$2(this.$targetValue, this.this$0, this.$dragPriority, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, continuation);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        InternalMutatorMutex internalMutatorMutex;
        Object obj3;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        Object obj4 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.$targetValue == null || this.this$0.getAnchors$material_release().containsKey(this.$targetValue)) {
                    internalMutatorMutex = this.this$0.f14330e;
                    MutatePriority mutatePriority = this.$dragPriority;
                    C30601 c30601 = new C30601(this.$targetValue, this.this$0, this.$block, null);
                    this.label = 1;
                    if (internalMutatorMutex.mutate(mutatePriority, c30601, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(this.$targetValue)).booleanValue()) {
                        this.this$0.m60957f(this.$targetValue);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (this.$targetValue != null) {
                this.this$0.m60958e(null);
            }
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            Iterator it = this.this$0.getAnchors$material_release().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    if (Math.abs(((Number) ((Map.Entry) obj3).getValue()).floatValue() - anchoredDraggableState.getOffset()) < 0.5f) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj3;
            if (entry != null) {
                obj4 = entry.getKey();
            }
            if (obj4 != null && ((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(obj4)).booleanValue()) {
                this.this$0.m60957f(obj4);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (this.$targetValue != null) {
                this.this$0.m60958e(null);
            }
            AnchoredDraggableState<T> anchoredDraggableState2 = this.this$0;
            Iterator it2 = this.this$0.getAnchors$material_release().entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (Math.abs(((Number) ((Map.Entry) obj2).getValue()).floatValue() - anchoredDraggableState2.getOffset()) < 0.5f) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) obj2;
            if (entry2 != null) {
                obj4 = entry2.getKey();
            }
            if (obj4 != null && ((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(obj4)).booleanValue()) {
                this.this$0.m60957f(obj4);
            }
            throw th2;
        }
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AnchoredDraggableState$doAnchoredDrag$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
