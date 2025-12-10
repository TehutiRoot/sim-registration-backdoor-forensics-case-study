package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class ReportDrawnComposition implements Function0 {

    /* renamed from: a */
    public final FullyDrawnReporter f8811a;

    /* renamed from: b */
    public final Function0 f8812b;

    /* renamed from: c */
    public final SnapshotStateObserver f8813c;

    /* renamed from: d */
    public final Function1 f8814d;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, Function0 function0) {
        this.f8811a = fullyDrawnReporter;
        this.f8812b = function0;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.INSTANCE);
        snapshotStateObserver.start();
        this.f8813c = snapshotStateObserver;
        this.f8814d = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (!fullyDrawnReporter.isFullyDrawnReported()) {
            fullyDrawnReporter.addReporter();
            m64709c(function0);
        }
    }

    /* renamed from: b */
    public void m64710b() {
        this.f8813c.clear();
        this.f8813c.stop();
    }

    /* renamed from: c */
    public final void m64709c(Function0 function0) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.f8813c.observeReads(function0, this.f8814d, new ReportDrawnComposition$observeReporter$1(booleanRef, function0));
        if (booleanRef.element) {
            m64708d();
        }
    }

    /* renamed from: d */
    public final void m64708d() {
        this.f8813c.clear(this.f8812b);
        if (!this.f8811a.isFullyDrawnReported()) {
            this.f8811a.removeReporter();
        }
        m64710b();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m64710b();
        return Unit.INSTANCE;
    }
}