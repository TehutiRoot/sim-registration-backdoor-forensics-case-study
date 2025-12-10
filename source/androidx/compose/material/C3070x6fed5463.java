package androidx.compose.material;

import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Constraints;", "it", "invoke-ZezNO4M", "(J)J"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 */
/* loaded from: classes.dex */
public final class C3070x6fed5463 extends Lambda implements Function1<Constraints, Constraints> {
    final /* synthetic */ float $headerHeightPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3070x6fed5463(float f) {
        super(1);
        this.$headerHeightPx = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
        return Constraints.m73615boximpl(m69919invokeZezNO4M(constraints.m73632unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M  reason: not valid java name */
    public final long m69919invokeZezNO4M(long j) {
        return ConstraintsKt.m73643offsetNN6EwU$default(Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null), 0, -AbstractC21140mr0.roundToInt(this.$headerHeightPx), 1, null);
    }
}
