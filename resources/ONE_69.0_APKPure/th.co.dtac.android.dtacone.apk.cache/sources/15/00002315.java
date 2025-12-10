package androidx.compose.animation.core;

import androidx.compose.p003ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/geometry/Size;", "invoke-uvyYCjk", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt$SizeToVector$1 extends Lambda implements Function1<Size, AnimationVector2D> {
    public static final VectorConvertersKt$SizeToVector$1 INSTANCE = new VectorConvertersKt$SizeToVector$1();

    public VectorConvertersKt$SizeToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(Size size) {
        return m69493invokeuvyYCjk(size.m71760unboximpl());
    }

    @NotNull
    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final AnimationVector2D m69493invokeuvyYCjk(long j) {
        return new AnimationVector2D(Size.m71755getWidthimpl(j), Size.m71752getHeightimpl(j));
    }
}