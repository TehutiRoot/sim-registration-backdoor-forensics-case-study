package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ChannelsKt__ChannelsKt {
    /* renamed from: a */
    public static final /* synthetic */ void m27204a(SendChannel sendChannel, Object obj) {
        if (!ChannelResult.m74684isSuccessimpl(sendChannel.mo74066trySendJP2dKIU(obj))) {
            AbstractC1475Uc.m66000b(null, new ChannelsKt__ChannelsKt$sendBlocking$1(sendChannel, obj, null), 1, null);
        }
    }

    /* renamed from: b */
    public static final Object m27203b(SendChannel sendChannel, Object obj) {
        Object m66000b;
        Object mo74066trySendJP2dKIU = sendChannel.mo74066trySendJP2dKIU(obj);
        if (mo74066trySendJP2dKIU instanceof ChannelResult.Failed) {
            m66000b = AbstractC1475Uc.m66000b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, obj, null), 1, null);
            return ((ChannelResult) m66000b).m74686unboximpl();
        }
        Unit unit = (Unit) mo74066trySendJP2dKIU;
        return ChannelResult.Companion.m74689successJP2dKIU(Unit.INSTANCE);
    }
}
