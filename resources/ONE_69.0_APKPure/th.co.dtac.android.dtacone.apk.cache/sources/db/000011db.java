package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

/* renamed from: So */
/* loaded from: classes6.dex */
public final class C1320So extends ChannelFlow {

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f5946c = AtomicIntegerFieldUpdater.newUpdater(C1320So.class, "consumed");

    /* renamed from: a */
    public final ReceiveChannel f5947a;

    /* renamed from: b */
    public final boolean f5948b;
    @Volatile
    private volatile int consumed;

    public /* synthetic */ C1320So(ReceiveChannel receiveChannel, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(receiveChannel, z, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String additionalToStringProps() {
        return "channel=" + this.f5947a;
    }

    /* renamed from: b */
    public final void m66442b() {
        if (this.f5948b && f5946c.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        if (this.capacity == -3) {
            m66442b();
            Object m27349a = FlowKt__ChannelsKt.m27349a(flowCollector, this.f5947a, this.f5948b, continuation);
            if (m27349a == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
                return m27349a;
            }
            return Unit.INSTANCE;
        }
        Object collect = super.collect(flowCollector, continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope producerScope, Continuation continuation) {
        Object m27349a = FlowKt__ChannelsKt.m27349a(new SendingCollector(producerScope), this.f5947a, this.f5948b, continuation);
        if (m27349a == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return m27349a;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new C1320So(this.f5947a, this.f5948b, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow dropChannelOperators() {
        return new C1320So(this.f5947a, this.f5948b, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel produceImpl(CoroutineScope coroutineScope) {
        m66442b();
        if (this.capacity == -3) {
            return this.f5947a;
        }
        return super.produceImpl(coroutineScope);
    }

    public C1320So(ReceiveChannel receiveChannel, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f5947a = receiveChannel;
        this.f5948b = z;
        this.consumed = 0;
    }
}