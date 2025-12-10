package p000;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.HorizontalAlignmentLine;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonRowScope;

/* renamed from: sF1  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C22073sF1 implements SegmentedButtonRowScope, RowScope {

    /* renamed from: a */
    public final /* synthetic */ RowScope f79738a;

    public C22073sF1(RowScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f79738a = scope;
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier align(Modifier modifier, Alignment.Vertical alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.f79738a.align(modifier, alignment);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return this.f79738a.alignBy(modifier, alignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignByBaseline(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.f79738a.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.f79738a.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, Function1 alignmentLineBlock) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
        return this.f79738a.alignBy(modifier, alignmentLineBlock);
    }
}
