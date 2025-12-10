package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R3\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m28850d2 = {"Landroidx/datastore/core/SimpleActor;", "T", "", "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/Continuation;", "consumeMessage", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", NotificationCompat.CATEGORY_MESSAGE, "offer", "(Ljava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/CoroutineScope;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function2;", "Lkotlinx/coroutines/channels/Channel;", OperatorName.CURVE_TO, "Lkotlinx/coroutines/channels/Channel;", "messageQueue", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "remainingMessages", "datastore-core"}, m28849k = 1, m28848mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SimpleActor<T> {

    /* renamed from: a */
    public final CoroutineScope f34604a;

    /* renamed from: b */
    public final Function2 f34605b;

    /* renamed from: c */
    public final Channel f34606c;

    /* renamed from: d */
    public final AtomicInteger f34607d;

    @Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, m28850d2 = {"<anonymous>", "", "T", "ex", ""}, m28849k = 3, m28848mv = {1, 5, 1}, m28846xi = 48)
    /* renamed from: androidx.datastore.core.SimpleActor$1 */
    /* loaded from: classes2.dex */
    public static final class C43171 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Function1<Throwable, Unit> $onComplete;
        final /* synthetic */ Function2<T, Throwable, Unit> $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C43171(Function1<? super Throwable, Unit> function1, SimpleActor<T> simpleActor, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.$onComplete = function1;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th2) {
            Unit unit;
            this.$onComplete.invoke(th2);
            this.this$0.f34606c.close(th2);
            do {
                Object m74679getOrNullimpl = ChannelResult.m74679getOrNullimpl(this.this$0.f34606c.mo74669tryReceivePtdJZtk());
                if (m74679getOrNullimpl == null) {
                    unit = null;
                    continue;
                } else {
                    this.$onUndeliveredElement.invoke(m74679getOrNullimpl, th2);
                    unit = Unit.INSTANCE;
                    continue;
                }
            } while (unit != null);
        }
    }

    public SimpleActor(@NotNull CoroutineScope scope, @NotNull Function1<? super Throwable, Unit> onComplete, @NotNull Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f34604a = scope;
        this.f34605b = consumeMessage;
        this.f34606c = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.f34607d = new AtomicInteger(0);
        Job job = (Job) scope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            job.invokeOnCompletion(new C43171(onComplete, this, onUndeliveredElement));
        }
    }

    public final void offer(T t) {
        Object mo74066trySendJP2dKIU = this.f34606c.mo74066trySendJP2dKIU(t);
        if (mo74066trySendJP2dKIU instanceof ChannelResult.Closed) {
            Throwable m74678exceptionOrNullimpl = ChannelResult.m74678exceptionOrNullimpl(mo74066trySendJP2dKIU);
            if (m74678exceptionOrNullimpl == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
        } else if (ChannelResult.m74684isSuccessimpl(mo74066trySendJP2dKIU)) {
            if (this.f34607d.getAndIncrement() == 0) {
                AbstractC1552Vc.m65753e(this.f34604a, null, null, new SimpleActor$offer$2(this, null), 3, null);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
