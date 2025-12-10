package androidx.compose.material;

import androidx.compose.p003ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/material/BottomSheetValue;", "", "sheetSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)Ljava/util/Map;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1 extends Lambda implements Function1<IntSize, Map<BottomSheetValue, ? extends Float>> {
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ float $peekHeightPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$1$1(int i, float f) {
        super(1);
        this.$layoutHeight = i;
        this.$peekHeightPx = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Map<BottomSheetValue, ? extends Float> invoke(IntSize intSize) {
        return m69935invokeozmzZPI(intSize.m73822unboximpl());
    }

    @NotNull
    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final Map<BottomSheetValue, Float> m69935invokeozmzZPI(long j) {
        float m73817getHeightimpl = IntSize.m73817getHeightimpl(j);
        float f = this.$peekHeightPx;
        float f2 = this.$layoutHeight - f;
        if (m73817getHeightimpl == 0.0f || m73817getHeightimpl == f) {
            return AbstractC18515Tn0.mapOf(TuplesKt.m28844to(BottomSheetValue.Collapsed, Float.valueOf(f2)));
        }
        return AbstractC11687a.mapOf(TuplesKt.m28844to(BottomSheetValue.Collapsed, Float.valueOf(f2)), TuplesKt.m28844to(BottomSheetValue.Expanded, Float.valueOf(this.$layoutHeight - m73817getHeightimpl)));
    }
}
