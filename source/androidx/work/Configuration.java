package androidx.work;

import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.work.impl.DefaultRunnableScheduler;
import ch.qos.logback.core.recovery.RecoveryCoordinator;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 N2\u00020\u0001:\u0003ONPB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010-\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001f\u00100\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0019\u00106\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010<\u001a\u0002078G¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010?\u001a\u0002078\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R\u0017\u0010B\u001a\u0002078\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;R\u0017\u0010E\u001a\u0002078\u0006¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010;R\u0017\u0010H\u001a\u0002078G¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bG\u0010;R\u0017\u0010L\u001a\u00020I8G¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006Q"}, m28850d2 = {"Landroidx/work/Configuration;", "", "Landroidx/work/Configuration$Builder;", "builder", "<init>", "(Landroidx/work/Configuration$Builder;)V", "Ljava/util/concurrent/Executor;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTaskExecutor", "taskExecutor", "Landroidx/work/Clock;", OperatorName.CURVE_TO, "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "clock", "Landroidx/work/WorkerFactory;", "d", "Landroidx/work/WorkerFactory;", "getWorkerFactory", "()Landroidx/work/WorkerFactory;", "workerFactory", "Landroidx/work/InputMergerFactory;", "e", "Landroidx/work/InputMergerFactory;", "getInputMergerFactory", "()Landroidx/work/InputMergerFactory;", "inputMergerFactory", "Landroidx/work/RunnableScheduler;", OperatorName.FILL_NON_ZERO, "Landroidx/work/RunnableScheduler;", "getRunnableScheduler", "()Landroidx/work/RunnableScheduler;", "runnableScheduler", "Landroidx/core/util/Consumer;", "", OperatorName.NON_STROKING_GRAY, "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler", "()Landroidx/core/util/Consumer;", "initializationExceptionHandler", OperatorName.CLOSE_PATH, "getSchedulingExceptionHandler", "schedulingExceptionHandler", "", "i", "Ljava/lang/String;", "getDefaultProcessName", "()Ljava/lang/String;", "defaultProcessName", "", OperatorName.SET_LINE_JOINSTYLE, "I", "getMinimumLoggingLevel", "()I", "minimumLoggingLevel", OperatorName.NON_STROKING_CMYK, "getMinJobSchedulerId", "minJobSchedulerId", OperatorName.LINE_TO, "getMaxJobSchedulerId", "maxJobSchedulerId", OperatorName.MOVE_TO, "getContentUriTriggerWorkersLimit", "contentUriTriggerWorkersLimit", OperatorName.ENDPATH, "getMaxSchedulerLimit", "maxSchedulerLimit", "", "o", "Z", "isUsingDefaultTaskExecutor", "()Z", "Companion", "Builder", "Provider", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Configuration {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int MIN_SCHEDULER_LIMIT = 20;

    /* renamed from: a */
    public final Executor f38173a;

    /* renamed from: b */
    public final Executor f38174b;

    /* renamed from: c */
    public final Clock f38175c;

    /* renamed from: d */
    public final WorkerFactory f38176d;

    /* renamed from: e */
    public final InputMergerFactory f38177e;

    /* renamed from: f */
    public final RunnableScheduler f38178f;

    /* renamed from: g */
    public final Consumer f38179g;

    /* renamed from: h */
    public final Consumer f38180h;

    /* renamed from: i */
    public final String f38181i;

    /* renamed from: j */
    public final int f38182j;

    /* renamed from: k */
    public final int f38183k;

    /* renamed from: l */
    public final int f38184l;

    /* renamed from: m */
    public final int f38185m;

    /* renamed from: n */
    public final int f38186n;

    /* renamed from: o */
    public final boolean f38187o;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Landroidx/work/Configuration$Companion;", "", "()V", "MIN_SCHEDULER_LIMIT", "", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m28850d2 = {"Landroidx/work/Configuration$Provider;", "", "workManagerConfiguration", "Landroidx/work/Configuration;", "getWorkManagerConfiguration", "()Landroidx/work/Configuration;", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public interface Provider {
        @NotNull
        Configuration getWorkManagerConfiguration();
    }

    public Configuration(@NotNull Builder builder) {
        int maxSchedulerLimit$work_runtime_release;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Executor executor$work_runtime_release = builder.getExecutor$work_runtime_release();
        this.f38173a = executor$work_runtime_release == null ? ConfigurationKt.m52358a(false) : executor$work_runtime_release;
        this.f38187o = builder.getTaskExecutor$work_runtime_release() == null;
        Executor taskExecutor$work_runtime_release = builder.getTaskExecutor$work_runtime_release();
        this.f38174b = taskExecutor$work_runtime_release == null ? ConfigurationKt.m52358a(true) : taskExecutor$work_runtime_release;
        Clock clock$work_runtime_release = builder.getClock$work_runtime_release();
        this.f38175c = clock$work_runtime_release == null ? new SystemClock() : clock$work_runtime_release;
        WorkerFactory workerFactory$work_runtime_release = builder.getWorkerFactory$work_runtime_release();
        if (workerFactory$work_runtime_release == null) {
            workerFactory$work_runtime_release = WorkerFactory.getDefaultWorkerFactory();
            Intrinsics.checkNotNullExpressionValue(workerFactory$work_runtime_release, "getDefaultWorkerFactory()");
        }
        this.f38176d = workerFactory$work_runtime_release;
        InputMergerFactory inputMergerFactory$work_runtime_release = builder.getInputMergerFactory$work_runtime_release();
        this.f38177e = inputMergerFactory$work_runtime_release == null ? NoOpInputMergerFactory.INSTANCE : inputMergerFactory$work_runtime_release;
        RunnableScheduler runnableScheduler$work_runtime_release = builder.getRunnableScheduler$work_runtime_release();
        this.f38178f = runnableScheduler$work_runtime_release == null ? new DefaultRunnableScheduler() : runnableScheduler$work_runtime_release;
        this.f38182j = builder.getLoggingLevel$work_runtime_release();
        this.f38183k = builder.getMinJobSchedulerId$work_runtime_release();
        this.f38184l = builder.getMaxJobSchedulerId$work_runtime_release();
        if (Build.VERSION.SDK_INT == 23) {
            maxSchedulerLimit$work_runtime_release = builder.getMaxSchedulerLimit$work_runtime_release() / 2;
        } else {
            maxSchedulerLimit$work_runtime_release = builder.getMaxSchedulerLimit$work_runtime_release();
        }
        this.f38186n = maxSchedulerLimit$work_runtime_release;
        this.f38179g = builder.getInitializationExceptionHandler$work_runtime_release();
        this.f38180h = builder.getSchedulingExceptionHandler$work_runtime_release();
        this.f38181i = builder.getDefaultProcessName$work_runtime_release();
        this.f38185m = builder.getContentUriTriggerWorkersLimit$work_runtime_release();
    }

    @NotNull
    public final Clock getClock() {
        return this.f38175c;
    }

    public final int getContentUriTriggerWorkersLimit() {
        return this.f38185m;
    }

    @Nullable
    public final String getDefaultProcessName() {
        return this.f38181i;
    }

    @NotNull
    public final Executor getExecutor() {
        return this.f38173a;
    }

    @Nullable
    public final Consumer<Throwable> getInitializationExceptionHandler() {
        return this.f38179g;
    }

    @NotNull
    public final InputMergerFactory getInputMergerFactory() {
        return this.f38177e;
    }

    public final int getMaxJobSchedulerId() {
        return this.f38184l;
    }

    @IntRange(from = RecoveryCoordinator.BACKOFF_COEFFICIENT_MIN, m64742to = 50)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMaxSchedulerLimit() {
        return this.f38186n;
    }

    public final int getMinJobSchedulerId() {
        return this.f38183k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMinimumLoggingLevel() {
        return this.f38182j;
    }

    @NotNull
    public final RunnableScheduler getRunnableScheduler() {
        return this.f38178f;
    }

    @Nullable
    public final Consumer<Throwable> getSchedulingExceptionHandler() {
        return this.f38180h;
    }

    @NotNull
    public final Executor getTaskExecutor() {
        return this.f38174b;
    }

    @NotNull
    public final WorkerFactory getWorkerFactory() {
        return this.f38176d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isUsingDefaultTaskExecutor() {
        return this.f38187o;
    }

    @Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\bJ\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010 J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0019¢\u0006\u0004\b$\u0010 J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010,\u001a\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020*0)¢\u0006\u0004\b/\u0010-J\u0015\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0004¢\u0006\u0004\b4\u00105R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010&\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010]\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R*\u0010.\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R$\u0010g\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010#\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010i\u001a\u0004\bo\u0010k\"\u0004\bp\u0010mR\"\u0010\u001b\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010i\u001a\u0004\br\u0010k\"\u0004\bs\u0010mR\"\u0010\u001e\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010i\u001a\u0004\bu\u0010k\"\u0004\bv\u0010mR\"\u0010!\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010i\u001a\u0004\bx\u0010k\"\u0004\by\u0010m¨\u0006z"}, m28850d2 = {"Landroidx/work/Configuration$Builder;", "", "<init>", "()V", "Landroidx/work/Configuration;", "configuration", "(Landroidx/work/Configuration;)V", "Landroidx/work/WorkerFactory;", "workerFactory", "setWorkerFactory", "(Landroidx/work/WorkerFactory;)Landroidx/work/Configuration$Builder;", "Landroidx/work/InputMergerFactory;", "inputMergerFactory", "setInputMergerFactory", "(Landroidx/work/InputMergerFactory;)Landroidx/work/Configuration$Builder;", "Ljava/util/concurrent/Executor;", "executor", "setExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/work/Configuration$Builder;", "taskExecutor", "setTaskExecutor", "Landroidx/work/Clock;", "clock", "setClock", "(Landroidx/work/Clock;)Landroidx/work/Configuration$Builder;", "", "minJobSchedulerId", "maxJobSchedulerId", "setJobSchedulerJobIdRange", "(II)Landroidx/work/Configuration$Builder;", "maxSchedulerLimit", "setMaxSchedulerLimit", "(I)Landroidx/work/Configuration$Builder;", "contentUriTriggerWorkersLimit", "setContentUriTriggerWorkersLimit", "loggingLevel", "setMinimumLoggingLevel", "Landroidx/work/RunnableScheduler;", "runnableScheduler", "setRunnableScheduler", "(Landroidx/work/RunnableScheduler;)Landroidx/work/Configuration$Builder;", "Landroidx/core/util/Consumer;", "", "exceptionHandler", "setInitializationExceptionHandler", "(Landroidx/core/util/Consumer;)Landroidx/work/Configuration$Builder;", "schedulingExceptionHandler", "setSchedulingExceptionHandler", "", "processName", "setDefaultProcessName", "(Ljava/lang/String;)Landroidx/work/Configuration$Builder;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/work/Configuration;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/Executor;", "getExecutor$work_runtime_release", "()Ljava/util/concurrent/Executor;", "setExecutor$work_runtime_release", "(Ljava/util/concurrent/Executor;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/work/WorkerFactory;", "getWorkerFactory$work_runtime_release", "()Landroidx/work/WorkerFactory;", "setWorkerFactory$work_runtime_release", "(Landroidx/work/WorkerFactory;)V", OperatorName.CURVE_TO, "Landroidx/work/InputMergerFactory;", "getInputMergerFactory$work_runtime_release", "()Landroidx/work/InputMergerFactory;", "setInputMergerFactory$work_runtime_release", "(Landroidx/work/InputMergerFactory;)V", "d", "getTaskExecutor$work_runtime_release", "setTaskExecutor$work_runtime_release", "e", "Landroidx/work/Clock;", "getClock$work_runtime_release", "()Landroidx/work/Clock;", "setClock$work_runtime_release", "(Landroidx/work/Clock;)V", OperatorName.FILL_NON_ZERO, "Landroidx/work/RunnableScheduler;", "getRunnableScheduler$work_runtime_release", "()Landroidx/work/RunnableScheduler;", "setRunnableScheduler$work_runtime_release", "(Landroidx/work/RunnableScheduler;)V", OperatorName.NON_STROKING_GRAY, "Landroidx/core/util/Consumer;", "getInitializationExceptionHandler$work_runtime_release", "()Landroidx/core/util/Consumer;", "setInitializationExceptionHandler$work_runtime_release", "(Landroidx/core/util/Consumer;)V", "initializationExceptionHandler", OperatorName.CLOSE_PATH, "getSchedulingExceptionHandler$work_runtime_release", "setSchedulingExceptionHandler$work_runtime_release", "i", "Ljava/lang/String;", "getDefaultProcessName$work_runtime_release", "()Ljava/lang/String;", "setDefaultProcessName$work_runtime_release", "(Ljava/lang/String;)V", "defaultProcessName", OperatorName.SET_LINE_JOINSTYLE, "I", "getLoggingLevel$work_runtime_release", "()I", "setLoggingLevel$work_runtime_release", "(I)V", OperatorName.NON_STROKING_CMYK, "getMinJobSchedulerId$work_runtime_release", "setMinJobSchedulerId$work_runtime_release", OperatorName.LINE_TO, "getMaxJobSchedulerId$work_runtime_release", "setMaxJobSchedulerId$work_runtime_release", OperatorName.MOVE_TO, "getMaxSchedulerLimit$work_runtime_release", "setMaxSchedulerLimit$work_runtime_release", OperatorName.ENDPATH, "getContentUriTriggerWorkersLimit$work_runtime_release", "setContentUriTriggerWorkersLimit$work_runtime_release", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public Executor f38188a;

        /* renamed from: b */
        public WorkerFactory f38189b;

        /* renamed from: c */
        public InputMergerFactory f38190c;

        /* renamed from: d */
        public Executor f38191d;

        /* renamed from: e */
        public Clock f38192e;

        /* renamed from: f */
        public RunnableScheduler f38193f;

        /* renamed from: g */
        public Consumer f38194g;

        /* renamed from: h */
        public Consumer f38195h;

        /* renamed from: i */
        public String f38196i;

        /* renamed from: j */
        public int f38197j;

        /* renamed from: k */
        public int f38198k;

        /* renamed from: l */
        public int f38199l;

        /* renamed from: m */
        public int f38200m;

        /* renamed from: n */
        public int f38201n;

        public Builder() {
            this.f38197j = 4;
            this.f38199l = Integer.MAX_VALUE;
            this.f38200m = 20;
            this.f38201n = ConfigurationKt.getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT();
        }

        @NotNull
        public final Configuration build() {
            return new Configuration(this);
        }

        @Nullable
        public final Clock getClock$work_runtime_release() {
            return this.f38192e;
        }

        public final int getContentUriTriggerWorkersLimit$work_runtime_release() {
            return this.f38201n;
        }

        @Nullable
        public final String getDefaultProcessName$work_runtime_release() {
            return this.f38196i;
        }

        @Nullable
        public final Executor getExecutor$work_runtime_release() {
            return this.f38188a;
        }

        @Nullable
        public final Consumer<Throwable> getInitializationExceptionHandler$work_runtime_release() {
            return this.f38194g;
        }

        @Nullable
        public final InputMergerFactory getInputMergerFactory$work_runtime_release() {
            return this.f38190c;
        }

        public final int getLoggingLevel$work_runtime_release() {
            return this.f38197j;
        }

        public final int getMaxJobSchedulerId$work_runtime_release() {
            return this.f38199l;
        }

        public final int getMaxSchedulerLimit$work_runtime_release() {
            return this.f38200m;
        }

        public final int getMinJobSchedulerId$work_runtime_release() {
            return this.f38198k;
        }

        @Nullable
        public final RunnableScheduler getRunnableScheduler$work_runtime_release() {
            return this.f38193f;
        }

        @Nullable
        public final Consumer<Throwable> getSchedulingExceptionHandler$work_runtime_release() {
            return this.f38195h;
        }

        @Nullable
        public final Executor getTaskExecutor$work_runtime_release() {
            return this.f38191d;
        }

        @Nullable
        public final WorkerFactory getWorkerFactory$work_runtime_release() {
            return this.f38189b;
        }

        @NotNull
        public final Builder setClock(@NotNull Clock clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            this.f38192e = clock;
            return this;
        }

        public final void setClock$work_runtime_release(@Nullable Clock clock) {
            this.f38192e = clock;
        }

        @NotNull
        public final Builder setContentUriTriggerWorkersLimit(int i) {
            this.f38201n = Math.max(i, 0);
            return this;
        }

        public final void setContentUriTriggerWorkersLimit$work_runtime_release(int i) {
            this.f38201n = i;
        }

        @NotNull
        public final Builder setDefaultProcessName(@NotNull String processName) {
            Intrinsics.checkNotNullParameter(processName, "processName");
            this.f38196i = processName;
            return this;
        }

        public final void setDefaultProcessName$work_runtime_release(@Nullable String str) {
            this.f38196i = str;
        }

        @NotNull
        public final Builder setExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f38188a = executor;
            return this;
        }

        public final void setExecutor$work_runtime_release(@Nullable Executor executor) {
            this.f38188a = executor;
        }

        @NotNull
        public final Builder setInitializationExceptionHandler(@NotNull Consumer<Throwable> exceptionHandler) {
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            this.f38194g = exceptionHandler;
            return this;
        }

        public final void setInitializationExceptionHandler$work_runtime_release(@Nullable Consumer<Throwable> consumer) {
            this.f38194g = consumer;
        }

        @NotNull
        public final Builder setInputMergerFactory(@NotNull InputMergerFactory inputMergerFactory) {
            Intrinsics.checkNotNullParameter(inputMergerFactory, "inputMergerFactory");
            this.f38190c = inputMergerFactory;
            return this;
        }

        public final void setInputMergerFactory$work_runtime_release(@Nullable InputMergerFactory inputMergerFactory) {
            this.f38190c = inputMergerFactory;
        }

        @NotNull
        public final Builder setJobSchedulerJobIdRange(int i, int i2) {
            if (i2 - i >= 1000) {
                this.f38198k = i;
                this.f38199l = i2;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.".toString());
        }

        public final void setLoggingLevel$work_runtime_release(int i) {
            this.f38197j = i;
        }

        public final void setMaxJobSchedulerId$work_runtime_release(int i) {
            this.f38199l = i;
        }

        @NotNull
        public final Builder setMaxSchedulerLimit(int i) {
            if (i >= 20) {
                this.f38200m = Math.min(i, 50);
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.".toString());
        }

        public final void setMaxSchedulerLimit$work_runtime_release(int i) {
            this.f38200m = i;
        }

        public final void setMinJobSchedulerId$work_runtime_release(int i) {
            this.f38198k = i;
        }

        @NotNull
        public final Builder setMinimumLoggingLevel(int i) {
            this.f38197j = i;
            return this;
        }

        @NotNull
        public final Builder setRunnableScheduler(@NotNull RunnableScheduler runnableScheduler) {
            Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
            this.f38193f = runnableScheduler;
            return this;
        }

        public final void setRunnableScheduler$work_runtime_release(@Nullable RunnableScheduler runnableScheduler) {
            this.f38193f = runnableScheduler;
        }

        @NotNull
        public final Builder setSchedulingExceptionHandler(@NotNull Consumer<Throwable> schedulingExceptionHandler) {
            Intrinsics.checkNotNullParameter(schedulingExceptionHandler, "schedulingExceptionHandler");
            this.f38195h = schedulingExceptionHandler;
            return this;
        }

        public final void setSchedulingExceptionHandler$work_runtime_release(@Nullable Consumer<Throwable> consumer) {
            this.f38195h = consumer;
        }

        @NotNull
        public final Builder setTaskExecutor(@NotNull Executor taskExecutor) {
            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
            this.f38191d = taskExecutor;
            return this;
        }

        public final void setTaskExecutor$work_runtime_release(@Nullable Executor executor) {
            this.f38191d = executor;
        }

        @NotNull
        public final Builder setWorkerFactory(@NotNull WorkerFactory workerFactory) {
            Intrinsics.checkNotNullParameter(workerFactory, "workerFactory");
            this.f38189b = workerFactory;
            return this;
        }

        public final void setWorkerFactory$work_runtime_release(@Nullable WorkerFactory workerFactory) {
            this.f38189b = workerFactory;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(@NotNull Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f38197j = 4;
            this.f38199l = Integer.MAX_VALUE;
            this.f38200m = 20;
            this.f38201n = ConfigurationKt.getDEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT();
            this.f38188a = configuration.getExecutor();
            this.f38189b = configuration.getWorkerFactory();
            this.f38190c = configuration.getInputMergerFactory();
            this.f38191d = configuration.getTaskExecutor();
            this.f38192e = configuration.getClock();
            this.f38197j = configuration.getMinimumLoggingLevel();
            this.f38198k = configuration.getMinJobSchedulerId();
            this.f38199l = configuration.getMaxJobSchedulerId();
            this.f38200m = configuration.getMaxSchedulerLimit();
            this.f38193f = configuration.getRunnableScheduler();
            this.f38194g = configuration.getInitializationExceptionHandler();
            this.f38195h = configuration.getSchedulingExceptionHandler();
            this.f38196i = configuration.getDefaultProcessName();
        }
    }
}
