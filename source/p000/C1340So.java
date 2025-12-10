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
public final class C1340So extends ChannelFlow {

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f5703c = AtomicIntegerFieldUpdater.newUpdater(C1340So.class, "consumed");

    /* renamed from: a */
    public final ReceiveChannel f5704a;

    /* renamed from: b */
    public final boolean f5705b;
    @Volatile
    private volatile int consumed;

    public /* synthetic */ C1340So(ReceiveChannel receiveChannel, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(receiveChannel, z, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String additionalToStringProps() {
        return "channel=" + this.f5704a;
    }

    /* renamed from: b */
    public final void m66282b() {
        if (this.f5705b && f5703c.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object m27053e;
        if (this.capacity == -3) {
            m66282b();
            m27053e = FlowKt__ChannelsKt.m27053e(flowCollector, this.f5704a, this.f5705b, continuation);
            if (m27053e == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return m27053e;
            }
            return Unit.INSTANCE;
        }
        Object collect = super.collect(flowCollector, continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope producerScope, Continuation continuation) {
        Object m27053e;
        m27053e = FlowKt__ChannelsKt.m27053e(new SendingCollector(producerScope), this.f5704a, this.f5705b, continuation);
        if (m27053e == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m27053e;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new C1340So(this.f5704a, this.f5705b, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow dropChannelOperators() {
        return new C1340So(this.f5704a, this.f5705b, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel produceImpl(CoroutineScope coroutineScope) {
        m66282b();
        if (this.capacity == -3) {
            return this.f5704a;
        }
        return super.produceImpl(coroutineScope);
    }

    public C1340So(ReceiveChannel receiveChannel, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f5704a = receiveChannel;
        this.f5705b = z;
        this.consumed = 0;
    }
}
