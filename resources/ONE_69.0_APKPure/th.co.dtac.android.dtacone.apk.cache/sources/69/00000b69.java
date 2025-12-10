package p000;

import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: M20 */
/* loaded from: classes2.dex */
public final class M20 extends Placeable {
    public M20(int i, int i2) {
        m73032setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
    }

    @Override // androidx.compose.p003ui.layout.Measured
    public int get(AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p003ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public void mo69367placeAtf8xVGno(long j, float f, Function1 function1) {
    }
}