package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\" \u0010\u0007\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/graphics/Shape;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V", "RectangleShape", "ui-graphics_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.RectangleShapeKt */
/* loaded from: classes2.dex */
public final class RectangleShapeKt {

    /* renamed from: a */
    public static final Shape f29225a = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @NotNull
        public String toString() {
            return "RectangleShape";
        }

        @Override // androidx.compose.p003ui.graphics.Shape
        @NotNull
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo69543createOutlinePq9zytI(long j, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(density, "density");
            return new Outline.Rectangle(SizeKt.m71776toRectuvyYCjk(j));
        }
    };

    @NotNull
    public static final Shape getRectangleShape() {
        return f29225a;
    }

    @Stable
    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}