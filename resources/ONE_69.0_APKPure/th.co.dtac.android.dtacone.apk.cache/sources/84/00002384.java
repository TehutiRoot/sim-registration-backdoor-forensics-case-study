package androidx.compose.foundation;

import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.unit.C3623Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
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
        DrawResult m61564c;
        DrawResult m61563d;
        DrawResult m61560d;
        DrawResult m61561c;
        Intrinsics.checkNotNullParameter(CacheDrawModifierNode, "$this$CacheDrawModifierNode");
        if (CacheDrawModifierNode.mo69622toPx0680j_4(this.this$0.m69516getWidthD9Ej5fM()) < 0.0f || Size.m71754getMinDimensionimpl(CacheDrawModifierNode.m71607getSizeNHjbRc()) <= 0.0f) {
            m61564c = BorderKt.m61564c(CacheDrawModifierNode);
            return m61564c;
        }
        float f = 2;
        float min = Math.min(C3623Dp.m73847equalsimpl0(this.this$0.m69516getWidthD9Ej5fM(), C3623Dp.Companion.m73860getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(CacheDrawModifierNode.mo69622toPx0680j_4(this.this$0.m69516getWidthD9Ej5fM())), (float) Math.ceil(Size.m71754getMinDimensionimpl(CacheDrawModifierNode.m71607getSizeNHjbRc()) / f));
        float f2 = min / f;
        long Offset = OffsetKt.Offset(f2, f2);
        long Size = SizeKt.Size(Size.m71755getWidthimpl(CacheDrawModifierNode.m71607getSizeNHjbRc()) - min, Size.m71752getHeightimpl(CacheDrawModifierNode.m71607getSizeNHjbRc()) - min);
        boolean z = f * min > Size.m71754getMinDimensionimpl(CacheDrawModifierNode.m71607getSizeNHjbRc());
        Outline mo69543createOutlinePq9zytI = this.this$0.getShape().mo69543createOutlinePq9zytI(CacheDrawModifierNode.m71607getSizeNHjbRc(), CacheDrawModifierNode.getLayoutDirection(), CacheDrawModifierNode);
        if (mo69543createOutlinePq9zytI instanceof Outline.Generic) {
            BorderModifierNode borderModifierNode = this.this$0;
            m61561c = borderModifierNode.m61561c(CacheDrawModifierNode, borderModifierNode.getBrush(), (Outline.Generic) mo69543createOutlinePq9zytI, z, min);
            return m61561c;
        } else if (mo69543createOutlinePq9zytI instanceof Outline.Rounded) {
            BorderModifierNode borderModifierNode2 = this.this$0;
            m61560d = borderModifierNode2.m61560d(CacheDrawModifierNode, borderModifierNode2.getBrush(), (Outline.Rounded) mo69543createOutlinePq9zytI, Offset, Size, z, min);
            return m61560d;
        } else if (mo69543createOutlinePq9zytI instanceof Outline.Rectangle) {
            m61563d = BorderKt.m61563d(CacheDrawModifierNode, this.this$0.getBrush(), Offset, Size, z, min);
            return m61563d;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}