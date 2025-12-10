package androidx.activity;

import androidx.activity.FullyDrawnReporter;
import androidx.annotation.RestrictTo;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,"}, m29142d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "addReporter", "()V", "removeReporter", "callback", "addOnReportDrawnListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnReportDrawnListener", "fullyDrawnReported", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/Executor;", "Lkotlin/jvm/functions/Function0;", OperatorName.CURVE_TO, "Ljava/lang/Object;", "lock", "", "d", "I", "reporterCount", "", "e", "Z", "reportPosted", OperatorName.FILL_NON_ZERO, "reportedFullyDrawn", "", OperatorName.NON_STROKING_GRAY, "Ljava/util/List;", "onReportCallbacks", "Ljava/lang/Runnable;", OperatorName.CLOSE_PATH, "Ljava/lang/Runnable;", "reportRunnable", "isFullyDrawnReported", "()Z", "activity_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
/* loaded from: classes.dex */
public final class FullyDrawnReporter {

    /* renamed from: a */
    public final Executor f8755a;

    /* renamed from: b */
    public final Function0 f8756b;

    /* renamed from: c */
    public final Object f8757c;

    /* renamed from: d */
    public int f8758d;

    /* renamed from: e */
    public boolean f8759e;

    /* renamed from: f */
    public boolean f8760f;

    /* renamed from: g */
    public final List f8761g;

    /* renamed from: h */
    public final Runnable f8762h;

    public FullyDrawnReporter(@NotNull Executor executor, @NotNull Function0<Unit> reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f8755a = executor;
        this.f8756b = reportFullyDrawn;
        this.f8757c = new Object();
        this.f8761g = new ArrayList();
        this.f8762h = new Runnable() { // from class: i50
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.m64734a(FullyDrawnReporter.this);
            }
        };
    }

    /* renamed from: a */
    public static /* synthetic */ void m64734a(FullyDrawnReporter fullyDrawnReporter) {
        m64732c(fullyDrawnReporter);
    }

    /* renamed from: c */
    public static final void m64732c(FullyDrawnReporter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f8757c) {
            try {
                this$0.f8759e = false;
                if (this$0.f8758d == 0 && !this$0.f8760f) {
                    this$0.f8756b.invoke();
                    this$0.fullyDrawnReported();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void addOnReportDrawnListener(@NotNull Function0<Unit> callback) {
        boolean z;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f8757c) {
            if (this.f8760f) {
                z = true;
            } else {
                this.f8761g.add(callback);
                z = false;
            }
        }
        if (z) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.f8757c) {
            try {
                if (!this.f8760f) {
                    this.f8758d++;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m64733b() {
        if (!this.f8759e && this.f8758d == 0) {
            this.f8759e = true;
            this.f8755a.execute(this.f8762h);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.f8757c) {
            try {
                this.f8760f = true;
                for (Function0 function0 : this.f8761g) {
                    function0.invoke();
                }
                this.f8761g.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.f8757c) {
            z = this.f8760f;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f8757c) {
            this.f8761g.remove(callback);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeReporter() {
        int i;
        synchronized (this.f8757c) {
            try {
                if (!this.f8760f && (i = this.f8758d) > 0) {
                    this.f8758d = i - 1;
                    m64733b();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}