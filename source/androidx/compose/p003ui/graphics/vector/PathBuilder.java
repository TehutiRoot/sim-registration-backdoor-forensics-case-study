package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.vector.PathNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0015J=\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J=\u0010'\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n¢\u0006\u0004\b'\u0010 J-\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b(\u0010)J-\u0010*\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b*\u0010)J-\u0010+\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b+\u0010)J-\u0010,\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b,\u0010)J\u001d\u0010-\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b-\u0010\u000eJ\u001d\u0010.\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b.\u0010\u000eJE\u00105\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b5\u00106JE\u00109\u001a\u00020\u00002\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u0002022\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b9\u00106J\u0017\u00107\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0005H\u0002¢\u0006\u0004\b7\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010=¨\u0006?"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "<init>", "()V", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "getNodes", "()Ljava/util/List;", "close", "()Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "moveTo", "(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "dx", "dy", "moveToRelative", "lineTo", "lineToRelative", "horizontalLineTo", "(F)Landroidx/compose/ui/graphics/vector/PathBuilder;", "horizontalLineToRelative", "verticalLineTo", "verticalLineToRelative", "x1", "y1", "x2", "y2", "x3", "y3", "curveTo", "(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "curveToRelative", "reflectiveCurveTo", "(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", "reflectiveCurveToRelative", "quadTo", "quadToRelative", "reflectiveQuadTo", "reflectiveQuadToRelative", "horizontalEllipseRadius", "verticalEllipseRadius", "theta", "", "isMoreThanHalf", "isPositiveArc", "arcTo", "(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "arcToRelative", "node", "(Landroidx/compose/ui/graphics/vector/PathNode;)Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Ljava/util/List;", "nodes", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.PathBuilder */
/* loaded from: classes2.dex */
public final class PathBuilder {

    /* renamed from: a */
    public final List f29403a = new ArrayList();

    /* renamed from: a */
    public final PathBuilder m59653a(PathNode pathNode) {
        this.f29403a.add(pathNode);
        return this;
    }

    @NotNull
    public final PathBuilder arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        return m59653a(new PathNode.ArcTo(f, f2, f3, z, z2, f4, f5));
    }

    @NotNull
    public final PathBuilder arcToRelative(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        return m59653a(new PathNode.RelativeArcTo(f, f2, f3, z, z2, f4, f5));
    }

    @NotNull
    public final PathBuilder close() {
        return m59653a(PathNode.Close.INSTANCE);
    }

    @NotNull
    public final PathBuilder curveTo(float f, float f2, float f3, float f4, float f5, float f6) {
        return m59653a(new PathNode.CurveTo(f, f2, f3, f4, f5, f6));
    }

    @NotNull
    public final PathBuilder curveToRelative(float f, float f2, float f3, float f4, float f5, float f6) {
        return m59653a(new PathNode.RelativeCurveTo(f, f2, f3, f4, f5, f6));
    }

    @NotNull
    public final List<PathNode> getNodes() {
        return this.f29403a;
    }

    @NotNull
    public final PathBuilder horizontalLineTo(float f) {
        return m59653a(new PathNode.HorizontalTo(f));
    }

    @NotNull
    public final PathBuilder horizontalLineToRelative(float f) {
        return m59653a(new PathNode.RelativeHorizontalTo(f));
    }

    @NotNull
    public final PathBuilder lineTo(float f, float f2) {
        return m59653a(new PathNode.LineTo(f, f2));
    }

    @NotNull
    public final PathBuilder lineToRelative(float f, float f2) {
        return m59653a(new PathNode.RelativeLineTo(f, f2));
    }

    @NotNull
    public final PathBuilder moveTo(float f, float f2) {
        return m59653a(new PathNode.MoveTo(f, f2));
    }

    @NotNull
    public final PathBuilder moveToRelative(float f, float f2) {
        return m59653a(new PathNode.RelativeMoveTo(f, f2));
    }

    @NotNull
    public final PathBuilder quadTo(float f, float f2, float f3, float f4) {
        return m59653a(new PathNode.QuadTo(f, f2, f3, f4));
    }

    @NotNull
    public final PathBuilder quadToRelative(float f, float f2, float f3, float f4) {
        return m59653a(new PathNode.RelativeQuadTo(f, f2, f3, f4));
    }

    @NotNull
    public final PathBuilder reflectiveCurveTo(float f, float f2, float f3, float f4) {
        return m59653a(new PathNode.ReflectiveCurveTo(f, f2, f3, f4));
    }

    @NotNull
    public final PathBuilder reflectiveCurveToRelative(float f, float f2, float f3, float f4) {
        return m59653a(new PathNode.RelativeReflectiveCurveTo(f, f2, f3, f4));
    }

    @NotNull
    public final PathBuilder reflectiveQuadTo(float f, float f2) {
        return m59653a(new PathNode.ReflectiveQuadTo(f, f2));
    }

    @NotNull
    public final PathBuilder reflectiveQuadToRelative(float f, float f2) {
        return m59653a(new PathNode.RelativeReflectiveQuadTo(f, f2));
    }

    @NotNull
    public final PathBuilder verticalLineTo(float f) {
        return m59653a(new PathNode.VerticalTo(f));
    }

    @NotNull
    public final PathBuilder verticalLineToRelative(float f) {
        return m59653a(new PathNode.RelativeVerticalTo(f));
    }
}
