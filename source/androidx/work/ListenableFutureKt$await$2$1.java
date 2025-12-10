package androidx.work;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "R", "run"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nandroidx/work/ListenableFutureKt$await$2$1\n*L\n1#1,91:1\n*E\n"})
/* loaded from: classes2.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CancellableContinuation f38237a;

    /* renamed from: b */
    public final /* synthetic */ ListenableFuture f38238b;

    public ListenableFutureKt$await$2$1(CancellableContinuation<? super R> cancellableContinuation, ListenableFuture<R> listenableFuture) {
        this.f38237a = cancellableContinuation;
        this.f38238b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CancellableContinuation cancellableContinuation = this.f38237a;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m74087constructorimpl(this.f38238b.get()));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                cause = th2;
            }
            if (th2 instanceof CancellationException) {
                this.f38237a.cancel(cause);
                return;
            }
            CancellableContinuation cancellableContinuation2 = this.f38237a;
            Result.Companion companion2 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(cause)));
        }
    }
}
