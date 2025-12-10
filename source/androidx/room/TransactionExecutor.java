package androidx.room;

import androidx.room.TransactionExecutor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28850d2 = {"Landroidx/room/TransactionExecutor;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "scheduleNext", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/Executor;", "Ljava/util/ArrayDeque;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/ArrayDeque;", "tasks", OperatorName.CURVE_TO, "Ljava/lang/Runnable;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "d", "Ljava/lang/Object;", "syncLock", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/* loaded from: classes2.dex */
public final class TransactionExecutor implements Executor {

    /* renamed from: a */
    public final Executor f37422a;

    /* renamed from: b */
    public final ArrayDeque f37423b;

    /* renamed from: c */
    public Runnable f37424c;

    /* renamed from: d */
    public final Object f37425d;

    public TransactionExecutor(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f37422a = executor;
        this.f37423b = new ArrayDeque();
        this.f37425d = new Object();
    }

    /* renamed from: a */
    public static /* synthetic */ void m52848a(Runnable runnable, TransactionExecutor transactionExecutor) {
        m52847c(runnable, transactionExecutor);
    }

    /* renamed from: c */
    public static final void m52847c(Runnable command, TransactionExecutor this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull final Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f37425d) {
            try {
                this.f37423b.offer(new Runnable() { // from class: NU1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TransactionExecutor.m52848a(command, this);
                    }
                });
                if (this.f37424c == null) {
                    scheduleNext();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void scheduleNext() {
        synchronized (this.f37425d) {
            try {
                Object poll = this.f37423b.poll();
                Runnable runnable = (Runnable) poll;
                this.f37424c = runnable;
                if (poll != null) {
                    this.f37422a.execute(runnable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
