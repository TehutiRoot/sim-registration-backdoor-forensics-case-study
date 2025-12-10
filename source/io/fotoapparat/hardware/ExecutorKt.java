package io.fotoapparat.hardware;

import android.os.Handler;
import android.os.Looper;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.ExecutorKt;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\"\u0010\u0014\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013\"\"\u0010\u0017\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, m28850d2 = {"Lkotlin/Function0;", "", "function", "executeLoggingThread", "(Lkotlin/jvm/functions/Function0;)V", "", "executeMainThread", "(Lkotlin/jvm/functions/Function0;)Z", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/ExecutorService;", "loggingExecutor", "Landroid/os/Handler;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/os/Handler;", "mainThreadHandler", OperatorName.CURVE_TO, "getPendingResultExecutor", "()Ljava/util/concurrent/ExecutorService;", "pendingResultExecutor", "d", "getFrameProcessingExecutor", "frameProcessingExecutor", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ExecutorKt {

    /* renamed from: a */
    public static final ExecutorService f62978a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public static final Handler f62979b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public static final ExecutorService f62980c = Executors.newSingleThreadExecutor();

    /* renamed from: d */
    public static final ExecutorService f62981d = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public static /* synthetic */ void m30535a(Function0 function0) {
        m30532d(function0);
    }

    /* renamed from: b */
    public static /* synthetic */ void m30534b(Function0 function0) {
        m30533c(function0);
    }

    /* renamed from: c */
    public static final void m30533c(Function0 function) {
        Intrinsics.checkNotNullParameter(function, "$function");
        function.invoke();
    }

    /* renamed from: d */
    public static final void m30532d(Function0 function) {
        Intrinsics.checkNotNullParameter(function, "$function");
        function.invoke();
    }

    public static final void executeLoggingThread(@NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        f62978a.execute(new Runnable() { // from class: kT
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorKt.m30534b(Function0.this);
            }
        });
    }

    public static final boolean executeMainThread(@NotNull final Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return f62979b.post(new Runnable() { // from class: jT
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorKt.m30535a(Function0.this);
            }
        });
    }

    public static final ExecutorService getFrameProcessingExecutor() {
        return f62981d;
    }

    public static final ExecutorService getPendingResultExecutor() {
        return f62980c;
    }
}
