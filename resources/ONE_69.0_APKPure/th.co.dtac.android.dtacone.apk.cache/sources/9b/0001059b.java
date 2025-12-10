package p000;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.HorizontalAlignmentLine;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import th.p047co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonRowScope;

/* renamed from: pG1  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C21621pG1 implements SegmentedButtonRowScope, RowScope {

    /* renamed from: a */
    public final /* synthetic */ RowScope f76758a;

    public C21621pG1(RowScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f76758a = scope;
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier align(Modifier modifier, Alignment.Vertical alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.f76758a.align(modifier, alignment);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return this.f76758a.alignBy(modifier, alignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignByBaseline(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.f76758a.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.f76758a.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, Function1 alignmentLineBlock) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
        return this.f76758a.alignBy(modifier, alignmentLineBlock);
    }
}