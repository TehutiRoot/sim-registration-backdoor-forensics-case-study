package androidx.compose.foundation;

import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.unit.C3641Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode$drawWithCacheModifierNode$1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {
    final /* synthetic */ BorderModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawWithCacheModifierNode$1(BorderModifierNode borderModifierNode) {
        super(1);
        this.this$0 = borderModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DrawResult invoke(@NotNull CacheDrawScope CacheDrawModifierNode) {
        DrawResult m61614c;
        DrawResult m61613d;
        DrawResult m61610d;
        DrawResult m61611c;
        Intrinsics.checkNotNullParameter(CacheDrawModifierNode, "$this$CacheDrawModifierNode");
        if (CacheDrawModifierNode.mo69438toPx0680j_4(this.this$0.m69330getWidthD9Ej5fM()) < 0.0f || Size.m71570getMinDimensionimpl(CacheDrawModifierNode.m71423getSizeNHjbRc()) <= 0.0f) {
            m61614c = BorderKt.m61614c(CacheDrawModifierNode);
            return m61614c;
        }
        float f = 2;
        float min = Math.min(C3641Dp.m73663equalsimpl0(this.this$0.m69330getWidthD9Ej5fM(), C3641Dp.Companion.m73676getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(CacheDrawModifierNode.mo69438toPx0680j_4(this.this$0.m69330getWidthD9Ej5fM())), (float) Math.ceil(Size.m71570getMinDimensionimpl(CacheDrawModifierNode.m71423getSizeNHjbRc()) / f));
        float f2 = min / f;
        long Offset = OffsetKt.Offset(f2, f2);
        long Size = SizeKt.Size(Size.m71571getWidthimpl(CacheDrawModifierNode.m71423getSizeNHjbRc()) - min, Size.m71568getHeightimpl(CacheDrawModifierNode.m71423getSizeNHjbRc()) - min);
        boolean z = f * min > Size.m71570getMinDimensionimpl(CacheDrawModifierNode.m71423getSizeNHjbRc());
        Outline mo69357createOutlinePq9zytI = this.this$0.getShape().mo69357createOutlinePq9zytI(CacheDrawModifierNode.m71423getSizeNHjbRc(), CacheDrawModifierNode.getLayoutDirection(), CacheDrawModifierNode);
        if (mo69357createOutlinePq9zytI instanceof Outline.Generic) {
            BorderModifierNode borderModifierNode = this.this$0;
            m61611c = borderModifierNode.m61611c(CacheDrawModifierNode, borderModifierNode.getBrush(), (Outline.Generic) mo69357createOutlinePq9zytI, z, min);
            return m61611c;
        } else if (mo69357createOutlinePq9zytI instanceof Outline.Rounded) {
            BorderModifierNode borderModifierNode2 = this.this$0;
            m61610d = borderModifierNode2.m61610d(CacheDrawModifierNode, borderModifierNode2.getBrush(), (Outline.Rounded) mo69357createOutlinePq9zytI, Offset, Size, z, min);
            return m61610d;
        } else if (mo69357createOutlinePq9zytI instanceof Outline.Rectangle) {
            m61613d = BorderKt.m61613d(CacheDrawModifierNode, this.this$0.getBrush(), Offset, Size, z, min);
            return m61613d;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
