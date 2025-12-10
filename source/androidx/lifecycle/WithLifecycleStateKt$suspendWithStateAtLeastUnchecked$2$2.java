package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CoroutineDispatcher $lifecycleDispatcher;
    final /* synthetic */ C4686xfdb59cc4 $observer;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    /* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$a */
    /* loaded from: classes2.dex */
    public static final class RunnableC4685a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Lifecycle f35886a;

        /* renamed from: b */
        public final /* synthetic */ C4686xfdb59cc4 f35887b;

        public RunnableC4685a(Lifecycle lifecycle, C4686xfdb59cc4 c4686xfdb59cc4) {
            this.f35886a = lifecycle;
            this.f35887b = c4686xfdb59cc4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35886a.removeObserver(this.f35887b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(CoroutineDispatcher coroutineDispatcher, Lifecycle lifecycle, C4686xfdb59cc4 c4686xfdb59cc4) {
        super(1);
        this.$lifecycleDispatcher = coroutineDispatcher;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$observer = c4686xfdb59cc4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th2) {
        CoroutineDispatcher coroutineDispatcher = this.$lifecycleDispatcher;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext)) {
            this.$lifecycleDispatcher.dispatch(emptyCoroutineContext, new RunnableC4685a(this.$this_suspendWithStateAtLeastUnchecked, this.$observer));
        } else {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this.$observer);
        }
    }
}
