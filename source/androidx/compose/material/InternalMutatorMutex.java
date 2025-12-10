package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJZ\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u00042\u0006\u0010\r\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0002\b\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u001e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0017`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m28850d2 = {"Landroidx/compose/material/InternalMutatorMutex;", "", "<init>", "()V", "R", "Landroidx/compose/foundation/MutatePriority;", LogFactory.PRIORITY_KEY, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "", "tryMutate", "(Lkotlin/jvm/functions/Function0;)Z", "Landroidx/compose/material/InternalMutatorMutex$a;", "mutator", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/material/InternalMutatorMutex$a;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material/InternalAtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lkotlinx/coroutines/sync/Mutex;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/sync/Mutex;", "mutex", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InternalMutatorMutex {

    /* renamed from: a */
    public final AtomicReference f14500a = new AtomicReference(null);

    /* renamed from: b */
    public final Mutex f14501b = MutexKt.Mutex$default(false, 1, null);

    /* renamed from: androidx.compose.material.InternalMutatorMutex$a */
    /* loaded from: classes.dex */
    public static final class C3127a {

        /* renamed from: a */
        public final MutatePriority f14502a;

        /* renamed from: b */
        public final Job f14503b;

        public C3127a(MutatePriority priority, Job job) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f14502a = priority;
            this.f14503b = job;
        }

        /* renamed from: a */
        public final boolean m60888a(C3127a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (this.f14502a.compareTo(other.f14502a) >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void m60887b() {
            Job.DefaultImpls.cancel$default(this.f14503b, (CancellationException) null, 1, (Object) null);
        }
    }

    public static /* synthetic */ Object mutate$default(InternalMutatorMutex internalMutatorMutex, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    public static /* synthetic */ Object mutateWith$default(InternalMutatorMutex internalMutatorMutex, Object obj, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mutateWith(obj, mutatePriority, function2, continuation);
    }

    /* renamed from: a */
    public final void m60889a(C3127a c3127a) {
        C3127a c3127a2;
        do {
            c3127a2 = (C3127a) this.f14500a.get();
            if (c3127a2 != null && !c3127a.m60888a(c3127a2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!AbstractC17300An1.m69050a(this.f14500a, c3127a2, c3127a));
        if (c3127a2 != null) {
            c3127a2.m60887b();
        }
    }

    @Nullable
    public final <R> Object mutate(@NotNull MutatePriority mutatePriority, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new InternalMutatorMutex$mutate$2(mutatePriority, this, function1, null), continuation);
    }

    @Nullable
    public final <T, R> Object mutateWith(T t, @NotNull MutatePriority mutatePriority, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new InternalMutatorMutex$mutateWith$2(mutatePriority, this, function2, t, null), continuation);
    }

    public final boolean tryMutate(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean tryLock$default = Mutex.DefaultImpls.tryLock$default(this.f14501b, null, 1, null);
        if (tryLock$default) {
            try {
                block.invoke();
            } finally {
                Mutex.DefaultImpls.unlock$default(this.f14501b, null, 1, null);
            }
        }
        return tryLock$default;
    }
}
