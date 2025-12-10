package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\r\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\b2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0010H\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0010H\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010!J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010\r\u001a\u00028\u0000H\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m28850d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/BufferedChannel;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "element", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendBroadcast$kotlinx_coroutines_core", "sendBroadcast", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "shouldSendSuspend$kotlinx_coroutines_core", "()Z", "shouldSendSuspend", "isSendOp", "m0", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "k0", "l0", OperatorName.LINE_TO, "I", OperatorName.MOVE_TO, "Lkotlinx/coroutines/channels/BufferOverflow;", "isConflatedDropOldest", "kotlinx-coroutines-core"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 5 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,119:1\n548#2,5:120\n514#2,6:125\n514#2,6:212\n548#2,5:218\n244#3:131\n269#3,10:132\n280#3,68:143\n3038#4:142\n269#5:211\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n41#1:120,5\n53#1:125,6\n106#1:212,6\n109#1:218,5\n80#1:131\n80#1:132,10\n80#1:143,68\n80#1:142\n80#1:211\n*E\n"})
/* loaded from: classes6.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {

    /* renamed from: l */
    public final int f70700l;

    /* renamed from: m */
    public final BufferOverflow f70701m;

    public /* synthetic */ ConflatedBufferedChannel(int i, BufferOverflow bufferOverflow, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : function1);
    }

    /* renamed from: i0 */
    public static /* synthetic */ Object m27134i0(ConflatedBufferedChannel conflatedBufferedChannel, Object obj, Continuation continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object m27130m0 = conflatedBufferedChannel.m27130m0(obj, true);
        if (m27130m0 instanceof ChannelResult.Closed) {
            ChannelResult.m74678exceptionOrNullimpl(m27130m0);
            Function1<E, Unit> function1 = conflatedBufferedChannel.onUndeliveredElement;
            if (function1 != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, obj, null, 2, null)) != null) {
                AbstractC5370bT.addSuppressed(callUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
                throw callUndeliveredElementCatchingException$default;
            }
            throw conflatedBufferedChannel.getSendException();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j0 */
    public static /* synthetic */ Object m27133j0(ConflatedBufferedChannel conflatedBufferedChannel, Object obj, Continuation continuation) {
        Object m27130m0 = conflatedBufferedChannel.m27130m0(obj, true);
        if (!(m27130m0 instanceof ChannelResult.Failed)) {
            Unit unit = (Unit) m27130m0;
            return Boxing.boxBoolean(true);
        }
        return Boxing.boxBoolean(false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        if (this.f70701m == BufferOverflow.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k0 */
    public final Object m27132k0(Object obj, boolean z) {
        Function1<E, Unit> function1;
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        Object mo74066trySendJP2dKIU = super.mo74066trySendJP2dKIU(obj);
        if (!ChannelResult.m74684isSuccessimpl(mo74066trySendJP2dKIU) && !ChannelResult.m74682isClosedimpl(mo74066trySendJP2dKIU)) {
            if (z && (function1 = this.onUndeliveredElement) != null && (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, obj, null, 2, null)) != null) {
                throw callUndeliveredElementCatchingException$default;
            }
            return ChannelResult.Companion.m74689successJP2dKIU(Unit.INSTANCE);
        }
        return mo74066trySendJP2dKIU;
    }

    /* renamed from: l0 */
    public final Object m27131l0(Object obj) {
        ChannelSegment channelSegment;
        Waiter waiter;
        Symbol symbol = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.f70661g.get(this);
        while (true) {
            long andIncrement = BufferedChannel.f70657c.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean m27228s = m27228s(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (channelSegment2.f71019id != j2) {
                ChannelSegment m27237j = m27237j(j2, channelSegment2);
                if (m27237j == null) {
                    if (m27228s) {
                        return ChannelResult.Companion.m74687closedJP2dKIU(getSendException());
                    }
                } else {
                    channelSegment = m27237j;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int m27245e0 = m27245e0(channelSegment, i2, obj, j, symbol, m27228s);
            if (m27245e0 != 0) {
                if (m27245e0 != 1) {
                    if (m27245e0 != 2) {
                        if (m27245e0 != 3) {
                            if (m27245e0 != 4) {
                                if (m27245e0 == 5) {
                                    channelSegment.cleanPrev();
                                }
                                channelSegment2 = channelSegment;
                            } else {
                                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                    channelSegment.cleanPrev();
                                }
                                return ChannelResult.Companion.m74687closedJP2dKIU(getSendException());
                            }
                        } else {
                            throw new IllegalStateException("unexpected".toString());
                        }
                    } else if (m27228s) {
                        channelSegment.onSlotCleaned();
                        return ChannelResult.Companion.m74687closedJP2dKIU(getSendException());
                    } else {
                        if (symbol instanceof Waiter) {
                            waiter = (Waiter) symbol;
                        } else {
                            waiter = null;
                        }
                        if (waiter != null) {
                            m27274G(waiter, channelSegment, i2);
                        }
                        dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.f71019id * i) + i2);
                        return ChannelResult.Companion.m74689successJP2dKIU(Unit.INSTANCE);
                    }
                } else {
                    return ChannelResult.Companion.m74689successJP2dKIU(Unit.INSTANCE);
                }
            } else {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m74689successJP2dKIU(Unit.INSTANCE);
            }
        }
    }

    /* renamed from: m0 */
    public final Object m27130m0(Object obj, boolean z) {
        if (this.f70701m == BufferOverflow.DROP_LATEST) {
            return m27132k0(obj, z);
        }
        return m27131l0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(@NotNull SelectInstance<?> selectInstance, @Nullable Object obj) {
        Object mo74066trySendJP2dKIU = mo74066trySendJP2dKIU(obj);
        if (!(mo74066trySendJP2dKIU instanceof ChannelResult.Failed)) {
            Unit unit = (Unit) mo74066trySendJP2dKIU;
            selectInstance.selectInRegistrationPhase(Unit.INSTANCE);
        } else if (mo74066trySendJP2dKIU instanceof ChannelResult.Closed) {
            ChannelResult.m74678exceptionOrNullimpl(mo74066trySendJP2dKIU);
            selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            throw new IllegalStateException("unreachable".toString());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(E e, @NotNull Continuation<? super Unit> continuation) {
        return m27134i0(this, e, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    @Nullable
    public Object sendBroadcast$kotlinx_coroutines_core(E e, @NotNull Continuation<? super Boolean> continuation) {
        return m27133j0(this, e, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    @NotNull
    /* renamed from: trySend-JP2dKIU */
    public Object mo74066trySendJP2dKIU(E e) {
        return m27130m0(e, false);
    }

    public ConflatedBufferedChannel(int i, @NotNull BufferOverflow bufferOverflow, @Nullable Function1<? super E, Unit> function1) {
        super(i, function1);
        this.f70700l = i;
        this.f70701m = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        } else if (i >= 1) {
        } else {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
        }
    }
}
