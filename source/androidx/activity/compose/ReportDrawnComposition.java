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
    public final FullyDrawnReporter f8723a;

    /* renamed from: b */
    public final Function0 f8724b;

    /* renamed from: c */
    public final SnapshotStateObserver f8725c;

    /* renamed from: d */
    public final Function1 f8726d;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, Function0 function0) {
        this.f8723a = fullyDrawnReporter;
        this.f8724b = function0;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.INSTANCE);
        snapshotStateObserver.start();
        this.f8725c = snapshotStateObserver;
        this.f8726d = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (!fullyDrawnReporter.isFullyDrawnReported()) {
            fullyDrawnReporter.addReporter();
            m64758c(function0);
        }
    }

    /* renamed from: b */
    public void m64759b() {
        this.f8725c.clear();
        this.f8725c.stop();
    }

    /* renamed from: c */
    public final void m64758c(Function0 function0) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        this.f8725c.observeReads(function0, this.f8726d, new ReportDrawnComposition$observeReporter$1(booleanRef, function0));
        if (booleanRef.element) {
            m64757d();
        }
    }

    /* renamed from: d */
    public final void m64757d() {
        this.f8725c.clear(this.f8724b);
        if (!this.f8723a.isFullyDrawnReported()) {
            this.f8723a.removeReporter();
        }
        m64759b();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m64759b();
        return Unit.INSTANCE;
    }
}
