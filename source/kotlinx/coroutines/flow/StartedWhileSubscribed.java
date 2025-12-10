package kotlinx.coroutines.flow;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* loaded from: classes6.dex */
public final class StartedWhileSubscribed implements SharingStarted {

    /* renamed from: a */
    public final long f70932a;

    /* renamed from: b */
    public final long f70933b;

    public StartedWhileSubscribed(long j, long j2) {
        this.f70932a = j;
        this.f70933b = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow command(StateFlow stateFlow) {
        return FlowKt.distinctUntilChanged(FlowKt.dropWhile(FlowKt.transformLatest(stateFlow, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f70932a == startedWhileSubscribed.f70932a && this.f70933b == startedWhileSubscribed.f70933b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (AbstractC17792Ig1.m67882a(this.f70932a) * 31) + AbstractC17792Ig1.m67882a(this.f70933b);
    }

    public String toString() {
        List createListBuilder = AbstractC10108ds.createListBuilder(2);
        if (this.f70932a > 0) {
            createListBuilder.add("stopTimeout=" + this.f70932a + "ms");
        }
        if (this.f70933b < Long.MAX_VALUE) {
            createListBuilder.add("replayExpiration=" + this.f70933b + "ms");
        }
        List build = AbstractC10108ds.build(createListBuilder);
        return "SharingStarted.WhileSubscribed(" + CollectionsKt___CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
