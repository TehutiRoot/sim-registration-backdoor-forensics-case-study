package p000;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: MP1 */
/* loaded from: classes6.dex */
public final class MP1 extends SharedFlowImpl implements StateFlow {
    public MP1(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        tryEmit(Integer.valueOf(i));
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    /* renamed from: w */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) getLastReplayedLocked()).intValue());
        }
        return valueOf;
    }

    /* renamed from: x */
    public final boolean m67370x(int i) {
        boolean tryEmit;
        synchronized (this) {
            tryEmit = tryEmit(Integer.valueOf(((Number) getLastReplayedLocked()).intValue() + i));
        }
        return tryEmit;
    }
}