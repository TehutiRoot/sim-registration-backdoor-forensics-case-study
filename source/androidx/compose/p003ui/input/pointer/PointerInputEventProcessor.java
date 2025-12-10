package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.node.HitTestResult;
import androidx.compose.p003ui.node.LayoutNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/ProcessResult;", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "process", "", "processCancel", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitPathTracker", "LMk1;", OperatorName.CURVE_TO, "LMk1;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/node/HitTestResult;", "d", "Landroidx/compose/ui/node/HitTestResult;", "hitResult", "e", "Z", "isProcessing", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n1747#2,3:236\n1855#2,2:239\n1747#2,3:241\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n*L\n76#1:236,3\n79#1:239,2\n102#1:241,3\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInputEventProcessor */
/* loaded from: classes2.dex */
public final class PointerInputEventProcessor {

    /* renamed from: a */
    public final LayoutNode f29981a;

    /* renamed from: b */
    public final HitPathTracker f29982b;

    /* renamed from: c */
    public final C18060Mk1 f29983c;

    /* renamed from: d */
    public final HitTestResult f29984d;

    /* renamed from: e */
    public boolean f29985e;

    public PointerInputEventProcessor(@NotNull LayoutNode root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f29981a = root;
        this.f29982b = new HitPathTracker(root.getCoordinates());
        this.f29983c = new C18060Mk1();
        this.f29984d = new HitTestResult();
    }

    /* renamed from: process-BIzXfog$default  reason: not valid java name */
    public static /* synthetic */ int m72730processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m72731processBIzXfog(pointerInputEvent, positionCalculator, z);
    }

    @NotNull
    public final LayoutNode getRoot() {
        return this.f29981a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:7:0x001b, B:9:0x0031, B:23:0x005d, B:24:0x006b, B:26:0x0071, B:28:0x0079, B:30:0x007f, B:32:0x00a6, B:33:0x00b7, B:48:0x0100, B:36:0x00cc, B:38:0x00da, B:41:0x00e4, B:42:0x00e8, B:44:0x00ee, B:46:0x00fa, B:14:0x003e, B:15:0x0042, B:17:0x0048, B:19:0x0054), top: B:53:0x001b }] */
    /* renamed from: process-BIzXfog  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m72731processBIzXfog(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.input.pointer.PointerInputEvent r18, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.input.pointer.PositionCalculator r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.input.pointer.PointerInputEventProcessor.m72731processBIzXfog(androidx.compose.ui.input.pointer.PointerInputEvent, androidx.compose.ui.input.pointer.PositionCalculator, boolean):int");
    }

    public final void processCancel() {
        if (!this.f29985e) {
            this.f29983c.m67298a();
            this.f29982b.processCancel();
        }
    }
}
