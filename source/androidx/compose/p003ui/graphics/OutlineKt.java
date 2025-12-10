package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aQ\u0010\u0013\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aQ\u0010\u0013\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0016\u0010\u001d\u001a\u00020\u001c*\u00020\u0018H\u0002ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u0016\u0010\u001f\u001a\u00020\u0019*\u00020\u001eH\u0002ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0016\u0010!\u001a\u00020\u001c*\u00020\u001eH\u0002ø\u0001\u0001¢\u0006\u0004\b!\u0010 \u001a!\u0010\u0013\u001a\u00020\u0003*\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b\u0013\u0010%\u001a\u0013\u0010'\u001a\u00020&*\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, m28850d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Outline;", "outline", "", "addOutline", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Outline;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutline", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Offset;", "d", "(Landroidx/compose/ui/geometry/Rect;)J", "Landroidx/compose/ui/geometry/Size;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/geometry/RoundRect;", "e", "(Landroidx/compose/ui/geometry/RoundRect;)J", OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Paint;", "paint", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Paint;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/geometry/RoundRect;)Z", "ui-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,307:1\n245#1,16:308\n245#1,16:324\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:308,16\n195#1:324,16\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.OutlineKt */
/* loaded from: classes2.dex */
public final class OutlineKt {
    /* renamed from: a */
    public static final boolean m59744a(RoundRect roundRect) {
        boolean z;
        boolean z2;
        if (CornerRadius.m71477getXimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m71477getXimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m71477getXimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m71477getXimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m71477getXimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m71477getXimpl(roundRect.m71552getTopLeftCornerRadiuskKHJgLs())) {
            z = true;
        } else {
            z = false;
        }
        if (CornerRadius.m71478getYimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs()) == CornerRadius.m71478getYimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m71478getYimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m71478getYimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m71478getYimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m71478getYimpl(roundRect.m71552getTopLeftCornerRadiuskKHJgLs())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static final void addOutline(@NotNull Path path, @NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            path.addRect(((Outline.Rectangle) outline).getRect());
        } else if (outline instanceof Outline.Rounded) {
            path.addRoundRect(((Outline.Rounded) outline).getRoundRect());
        } else if (outline instanceof Outline.Generic) {
            AbstractC18371Rh1.m66425g(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public static final long m59743b(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    /* renamed from: c */
    public static final long m59742c(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    /* renamed from: d */
    public static final long m59741d(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    public static final void drawOutline(@NotNull Canvas canvas, @NotNull Outline outline, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
        } else if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                canvas.drawPath(roundRectPath$ui_graphics_release, paint);
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), CornerRadius.m71477getXimpl(rounded.getRoundRect().m71550getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m71478getYimpl(rounded.getRoundRect().m71550getBottomLeftCornerRadiuskKHJgLs()), paint);
            }
        } else if (outline instanceof Outline.Generic) {
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: drawOutline-hn5TExg */
    public static final void m71951drawOutlinehn5TExg(@NotNull DrawScope drawOutline, @NotNull Outline outline, @NotNull Brush brush, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Path path;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawOutline.mo72139drawRectAsUm42w(brush, m59741d(rect), m59743b(rect), f, style, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawOutline.mo72141drawRoundRectZuiqVtQ(brush, m59740e(roundRect), m59742c(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m71477getXimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), f, style, colorFilter, i);
                return;
            }
        } else if (outline instanceof Outline.Generic) {
            path = ((Outline.Generic) outline).getPath();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        drawOutline.mo72135drawPathGBMwjPU(path, brush, f, style, colorFilter, i);
    }

    /* renamed from: drawOutline-hn5TExg$default */
    public static /* synthetic */ void m71952drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f2;
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
        }
        m71951drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i);
    }

    /* renamed from: drawOutline-wDX37Ww */
    public static final void m71953drawOutlinewDX37Ww(@NotNull DrawScope drawOutline, @NotNull Outline outline, long j, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i) {
        Path path;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawOutline.mo72140drawRectnJ9OG0(j, m59741d(rect), m59743b(rect), f, style, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawOutline.mo72142drawRoundRectuAw5IA(j, m59740e(roundRect), m59742c(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m71477getXimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, null), style, f, colorFilter, i);
                return;
            }
        } else if (outline instanceof Outline.Generic) {
            path = ((Outline.Generic) outline).getPath();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        drawOutline.mo72136drawPathLG529CI(path, j, f, style, colorFilter, i);
    }

    /* renamed from: drawOutline-wDX37Ww$default */
    public static /* synthetic */ void m71954drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            fill = Fill.INSTANCE;
        } else {
            fill = drawStyle;
        }
        if ((i2 & 16) != 0) {
            colorFilter2 = null;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((i2 & 32) != 0) {
            i3 = DrawScope.Companion.m72174getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        m71953drawOutlinewDX37Ww(drawScope, outline, j, f2, fill, colorFilter2, i3);
    }

    /* renamed from: e */
    public static final long m59740e(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }
}
