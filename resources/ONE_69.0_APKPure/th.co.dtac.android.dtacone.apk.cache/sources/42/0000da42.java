package kotlin.concurrent;

import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m29142d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "", "run", "()V", "kotlin-stdlib"}, m29141k = 1, m29140mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
/* loaded from: classes5.dex */
public final class TimersKt$timerTask$1 extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ Function1 f68214a;

    public TimersKt$timerTask$1(Function1<? super TimerTask, Unit> function1) {
        this.f68214a = function1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f68214a.invoke(this);
    }
}