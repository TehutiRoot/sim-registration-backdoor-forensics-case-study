package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ChannelsKt__ChannelsKt {
    /* renamed from: a */
    public static final /* synthetic */ void m27496a(SendChannel sendChannel, Object obj) {
        if (!ChannelResult.m74868isSuccessimpl(sendChannel.mo74250trySendJP2dKIU(obj))) {
            AbstractC1455Uc.m66133b(null, new ChannelsKt__ChannelsKt$sendBlocking$1(sendChannel, obj, null), 1, null);
        }
    }

    /* renamed from: b */
    public static final Object m27495b(SendChannel sendChannel, Object obj) {
        Object m66133b;
        Object mo74250trySendJP2dKIU = sendChannel.mo74250trySendJP2dKIU(obj);
        if (mo74250trySendJP2dKIU instanceof ChannelResult.Failed) {
            m66133b = AbstractC1455Uc.m66133b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, obj, null), 1, null);
            return ((ChannelResult) m66133b).m74870unboximpl();
        }
        Unit unit = (Unit) mo74250trySendJP2dKIU;
        return ChannelResult.Companion.m74873successJP2dKIU(Unit.INSTANCE);
    }
}