package androidx.compose.p003ui.platform;

import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathOperation;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, m28850d2 = {"Landroidx/compose/ui/graphics/Outline;", "outline", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "tmpOpPath", "", "isInOutline", "(Landroidx/compose/ui/graphics/Outline;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Landroidx/compose/ui/geometry/Rect;", "rect", OperatorName.CURVE_TO, "(Landroidx/compose/ui/geometry/Rect;FF)Z", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "d", "(Landroidx/compose/ui/graphics/Outline$Rounded;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Landroidx/compose/ui/geometry/RoundRect;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/geometry/RoundRect;)Z", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "centerX", "centerY", "e", "(FFJFF)Z", ClientCookie.PATH_ATTR, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/graphics/Path;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.ShapeContainingUtilKt */
/* loaded from: classes2.dex */
public final class ShapeContainingUtilKt {
    /* renamed from: a */
    public static final boolean m59199a(RoundRect roundRect) {
        if (CornerRadius.m71477getXimpl(roundRect.m71552getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m71477getXimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m71477getXimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m71477getXimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m71478getYimpl(roundRect.m71552getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m71478getYimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && CornerRadius.m71478getYimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m71478getYimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m59198b(Path path, float f, float f2, Path path2, Path path3) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo71636opN5in7k0(path, path2, PathOperation.Companion.m71985getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }

    /* renamed from: c */
    public static final boolean m59197c(Rect rect, float f, float f2) {
        if (rect.getLeft() <= f && f < rect.getRight() && rect.getTop() <= f2 && f2 < rect.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m59196d(Outline.Rounded rounded, float f, float f2, Path path, Path path2) {
        Path path3;
        RoundRect roundRect = rounded.getRoundRect();
        if (f >= roundRect.getLeft() && f < roundRect.getRight() && f2 >= roundRect.getTop() && f2 < roundRect.getBottom()) {
            if (!m59199a(roundRect)) {
                if (path2 == null) {
                    path3 = AndroidPath_androidKt.Path();
                } else {
                    path3 = path2;
                }
                path3.addRoundRect(roundRect);
                return m59198b(path3, f, f2, path, path2);
            }
            float m71477getXimpl = CornerRadius.m71477getXimpl(roundRect.m71552getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
            float m71478getYimpl = CornerRadius.m71478getYimpl(roundRect.m71552getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
            float right = roundRect.getRight() - CornerRadius.m71477getXimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs());
            float m71478getYimpl2 = CornerRadius.m71478getYimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
            float right2 = roundRect.getRight() - CornerRadius.m71477getXimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs());
            float bottom = roundRect.getBottom() - CornerRadius.m71478getYimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs());
            float bottom2 = roundRect.getBottom() - CornerRadius.m71478getYimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs());
            float m71477getXimpl2 = CornerRadius.m71477getXimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
            if (f < m71477getXimpl && f2 < m71478getYimpl) {
                return m59195e(f, f2, roundRect.m71552getTopLeftCornerRadiuskKHJgLs(), m71477getXimpl, m71478getYimpl);
            }
            if (f < m71477getXimpl2 && f2 > bottom2) {
                return m59195e(f, f2, roundRect.m71550getBottomLeftCornerRadiuskKHJgLs(), m71477getXimpl2, bottom2);
            }
            if (f > right && f2 < m71478getYimpl2) {
                return m59195e(f, f2, roundRect.m71553getTopRightCornerRadiuskKHJgLs(), right, m71478getYimpl2);
            }
            if (f > right2 && f2 > bottom) {
                return m59195e(f, f2, roundRect.m71551getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m59195e(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float m71477getXimpl = CornerRadius.m71477getXimpl(j);
        float m71478getYimpl = CornerRadius.m71478getYimpl(j);
        if (((f5 * f5) / (m71477getXimpl * m71477getXimpl)) + ((f6 * f6) / (m71478getYimpl * m71478getYimpl)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final boolean isInOutline(@NotNull Outline outline, float f, float f2, @Nullable Path path, @Nullable Path path2) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            return m59197c(((Outline.Rectangle) outline).getRect(), f, f2);
        }
        if (outline instanceof Outline.Rounded) {
            return m59196d((Outline.Rounded) outline, f, f2, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return m59198b(((Outline.Generic) outline).getPath(), f, f2, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f, float f2, Path path, Path path2, int i, Object obj) {
        if ((i & 8) != 0) {
            path = null;
        }
        if ((i & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f, f2, path, path2);
    }
}
