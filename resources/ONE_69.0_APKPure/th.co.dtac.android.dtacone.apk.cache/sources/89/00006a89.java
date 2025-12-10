package androidx.core.p005os;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "run"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handler.kt\nandroidx/core/os/HandlerKt$postAtTime$runnable$1\n*L\n1#1,69:1\n*E\n"})
/* renamed from: androidx.core.os.HandlerKt$postAtTime$runnable$1 */
/* loaded from: classes2.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Function0 f34037a;

    public HandlerKt$postAtTime$runnable$1(Function0<Unit> function0) {
        this.f34037a = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34037a.invoke();
    }
}