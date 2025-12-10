package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.InternalMutatorMutex;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material.InternalMutatorMutex$mutate$2", m28800f = "InternalMutatorMutex.kt", m28799i = {0, 0, 1, 1}, m28798l = {177, 99}, m28797m = "invokeSuspend", m28796n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, m28795s = {"L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n107#2,10:172\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutate$2\n*L\n97#1:172,10\n*E\n"})
/* loaded from: classes.dex */
public final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InternalMutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super InternalMutatorMutex$mutate$2> continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = internalMutatorMutex;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, continuation);
        internalMutatorMutex$mutate$2.L$0 = obj;
        return internalMutatorMutex$mutate$2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Mutex mutex;
        Function1 function1;
        InternalMutatorMutex.C3127a c3127a;
        InternalMutatorMutex internalMutatorMutex;
        InternalMutatorMutex.C3127a c3127a2;
        Throwable th2;
        InternalMutatorMutex internalMutatorMutex2;
        Mutex mutex2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            try {
                if (r1 != 0) {
                    if (r1 != 1) {
                        if (r1 == 2) {
                            internalMutatorMutex2 = (InternalMutatorMutex) this.L$2;
                            mutex2 = (Mutex) this.L$1;
                            c3127a2 = (InternalMutatorMutex.C3127a) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                atomicReference2 = internalMutatorMutex2.f14500a;
                                AbstractC17300An1.m69050a(atomicReference2, c3127a2, null);
                                mutex2.unlock(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = internalMutatorMutex2.f14500a;
                                AbstractC17300An1.m69050a(atomicReference, c3127a2, null);
                                throw th2;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex = (InternalMutatorMutex) this.L$3;
                    function1 = (Function1) this.L$2;
                    c3127a = (InternalMutatorMutex.C3127a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutex = (Mutex) this.L$1;
                } else {
                    ResultKt.throwOnFailure(obj);
                    MutatePriority mutatePriority = this.$priority;
                    CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(Job.Key);
                    Intrinsics.checkNotNull(element);
                    InternalMutatorMutex.C3127a c3127a3 = new InternalMutatorMutex.C3127a(mutatePriority, (Job) element);
                    this.this$0.m60889a(c3127a3);
                    mutex = this.this$0.f14501b;
                    Function1 function12 = this.$block;
                    InternalMutatorMutex internalMutatorMutex3 = this.this$0;
                    this.L$0 = c3127a3;
                    this.L$1 = mutex;
                    this.L$2 = function12;
                    this.L$3 = internalMutatorMutex3;
                    this.label = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = function12;
                    c3127a = c3127a3;
                    internalMutatorMutex = internalMutatorMutex3;
                }
                this.L$0 = c3127a;
                this.L$1 = mutex;
                this.L$2 = internalMutatorMutex;
                this.L$3 = null;
                this.label = 2;
                Object invoke = function1.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                internalMutatorMutex2 = internalMutatorMutex;
                mutex2 = mutex;
                obj = invoke;
                c3127a2 = c3127a;
                atomicReference2 = internalMutatorMutex2.f14500a;
                AbstractC17300An1.m69050a(atomicReference2, c3127a2, null);
                mutex2.unlock(null);
                return obj;
            } catch (Throwable th4) {
                c3127a2 = c3127a;
                th2 = th4;
                internalMutatorMutex2 = internalMutatorMutex;
                atomicReference = internalMutatorMutex2.f14500a;
                AbstractC17300An1.m69050a(atomicReference, c3127a2, null);
                throw th2;
            }
        } catch (Throwable th5) {
            r1.unlock(null);
            throw th5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super R> continuation) {
        return ((InternalMutatorMutex$mutate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
