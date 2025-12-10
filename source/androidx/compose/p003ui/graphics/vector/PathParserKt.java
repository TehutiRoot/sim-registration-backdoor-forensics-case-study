package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.vector.PathNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\r\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m28850d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "Landroidx/compose/ui/graphics/Path;", TypedValues.AttributesType.S_TARGET, "toPath", "(Ljava/util/List;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "p", "", "x0", "y0", "x1", "y1", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "theta", "", "isMoreThanHalf", "isPositiveArc", "", "(Landroidx/compose/ui/graphics/Path;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "(Landroidx/compose/ui/graphics/Path;DDDDDDDDD)V", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,553:1\n552#1:560\n33#2,6:554\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:560\n174#1:554,6\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.PathParserKt */
/* loaded from: classes2.dex */
public final class PathParserKt {

    /* renamed from: a */
    public static final float[] f29488a = new float[0];

    /* renamed from: a */
    public static final void m59649a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d3;
        double d11 = 4;
        int ceil = (int) Math.ceil(Math.abs((d9 * d11) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d12 = -d10;
        double d13 = d12 * cos;
        double d14 = d4 * sin;
        double d15 = (d13 * sin2) - (d14 * cos2);
        double d16 = d12 * sin;
        double d17 = d4 * cos;
        double d18 = (sin2 * d16) + (cos2 * d17);
        double d19 = d9 / ceil;
        double d20 = d5;
        double d21 = d8;
        double d22 = d18;
        double d23 = d15;
        int i = 0;
        double d24 = d6;
        while (i < ceil) {
            double d25 = d21 + d19;
            double sin3 = Math.sin(d25);
            double cos3 = Math.cos(d25);
            int i2 = ceil;
            double d26 = (d + ((d10 * cos) * cos3)) - (d14 * sin3);
            double d27 = d2 + (d10 * sin * cos3) + (d17 * sin3);
            double d28 = (d13 * sin3) - (d14 * cos3);
            double d29 = (sin3 * d16) + (cos3 * d17);
            double d30 = d25 - d21;
            double tan = Math.tan(d30 / 2);
            double sin4 = (Math.sin(d30) * (Math.sqrt(d11 + ((3.0d * tan) * tan)) - 1)) / 3;
            path.cubicTo((float) (d20 + (d23 * sin4)), (float) (d24 + (d22 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
            i++;
            d19 = d19;
            sin = sin;
            d20 = d26;
            d16 = d16;
            d21 = d25;
            d22 = d29;
            d11 = d11;
            d23 = d28;
            cos = cos;
            ceil = i2;
            d24 = d27;
            d10 = d3;
        }
    }

    /* renamed from: b */
    public static final void m59648b(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10 = (d7 / ((double) BitmapUtil.IMAGE_180_DEGREE)) * 3.141592653589793d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double d11 = ((d * cos) + (d2 * sin)) / d5;
        double d12 = (((-d) * sin) + (d2 * cos)) / d6;
        double d13 = ((d3 * cos) + (d4 * sin)) / d5;
        double d14 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d15 = d11 - d13;
        double d16 = d12 - d14;
        double d17 = 2;
        double d18 = (d11 + d13) / d17;
        double d19 = (d12 + d14) / d17;
        double d20 = (d15 * d15) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m59648b(path, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d15 * sqrt2;
        double d23 = sqrt2 * d16;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d12 - d9, d11 - d8);
        double atan22 = Math.atan2(d14 - d9, d13 - d8) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (i > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d24 = d8 * d5;
        double d25 = d9 * d6;
        m59649a(path, (d24 * cos) - (d25 * sin), (d24 * sin) + (d25 * cos), d5, d6, d, d2, d10, atan2, atan22);
    }

    @NotNull
    public static final float[] getEmptyArray() {
        return f29488a;
    }

    @NotNull
    public static final Path toPath(@NotNull List<? extends PathNode> list, @NotNull Path path) {
        PathNode pathNode;
        PathNode pathNode2;
        int i;
        int i2;
        PathNode pathNode3;
        float f;
        float f2;
        float f3;
        float f4;
        float dy;
        float y1;
        float x2;
        float y2;
        float f5;
        float f6;
        float f7;
        float f8;
        float dy2;
        List<? extends PathNode> list2 = list;
        Path target = path;
        Intrinsics.checkNotNullParameter(list2, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        int mo71635getFillTypeRgk1Os = path.mo71635getFillTypeRgk1Os();
        path.rewind();
        target.mo71637setFillTypeoQ8Xj4U(mo71635getFillTypeRgk1Os);
        if (list.isEmpty()) {
            pathNode = PathNode.Close.INSTANCE;
        } else {
            pathNode = list2.get(0);
        }
        int size = list.size();
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        int i3 = 0;
        while (i3 < size) {
            PathNode pathNode4 = list2.get(i3);
            if (pathNode4 instanceof PathNode.Close) {
                path.close();
                target.moveTo(f14, f15);
                pathNode3 = pathNode4;
                f10 = f14;
                f12 = f10;
                f11 = f15;
                f13 = f11;
            } else if (pathNode4 instanceof PathNode.RelativeMoveTo) {
                PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode4;
                f12 += relativeMoveTo.getDx();
                f13 += relativeMoveTo.getDy();
                target.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                pathNode3 = pathNode4;
                f14 = f12;
                f15 = f13;
            } else {
                if (pathNode4 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode4;
                    float x = moveTo.getX();
                    float y = moveTo.getY();
                    target.moveTo(moveTo.getX(), moveTo.getY());
                    f12 = x;
                    f14 = f12;
                    f13 = y;
                    f15 = f13;
                } else {
                    if (pathNode4 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode4;
                        target.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        f12 += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else if (pathNode4 instanceof PathNode.LineTo) {
                        PathNode.LineTo lineTo = (PathNode.LineTo) pathNode4;
                        target.lineTo(lineTo.getX(), lineTo.getY());
                        float x3 = lineTo.getX();
                        f13 = lineTo.getY();
                        f12 = x3;
                    } else if (pathNode4 instanceof PathNode.RelativeHorizontalTo) {
                        PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode4;
                        target.relativeLineTo(relativeHorizontalTo.getDx(), f9);
                        f12 += relativeHorizontalTo.getDx();
                    } else if (pathNode4 instanceof PathNode.HorizontalTo) {
                        PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode4;
                        target.lineTo(horizontalTo.getX(), f13);
                        f12 = horizontalTo.getX();
                    } else if (pathNode4 instanceof PathNode.RelativeVerticalTo) {
                        PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode4;
                        target.relativeLineTo(f9, relativeVerticalTo.getDy());
                        dy2 = relativeVerticalTo.getDy();
                    } else if (pathNode4 instanceof PathNode.VerticalTo) {
                        PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode4;
                        target.lineTo(f12, verticalTo.getY());
                        f13 = verticalTo.getY();
                    } else {
                        if (pathNode4 instanceof PathNode.RelativeCurveTo) {
                            PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode4;
                            pathNode2 = pathNode4;
                            path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                            f3 = relativeCurveTo.getDx2() + f12;
                            f4 = relativeCurveTo.getDy2() + f13;
                            f12 += relativeCurveTo.getDx3();
                            dy = relativeCurveTo.getDy3();
                        } else {
                            pathNode2 = pathNode4;
                            if (pathNode2 instanceof PathNode.CurveTo) {
                                PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode2;
                                path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                f3 = curveTo.getX2();
                                y1 = curveTo.getY2();
                                x2 = curveTo.getX3();
                                y2 = curveTo.getY3();
                            } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                                if (pathNode.isCurve()) {
                                    f8 = f13 - f11;
                                    f7 = f12 - f10;
                                } else {
                                    f7 = 0.0f;
                                    f8 = 0.0f;
                                }
                                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode2;
                                path.relativeCubicTo(f7, f8, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                f3 = relativeReflectiveCurveTo.getDx1() + f12;
                                f4 = relativeReflectiveCurveTo.getDy1() + f13;
                                f12 += relativeReflectiveCurveTo.getDx2();
                                dy = relativeReflectiveCurveTo.getDy2();
                            } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                                if (pathNode.isCurve()) {
                                    float f16 = 2;
                                    f6 = (f16 * f13) - f11;
                                    f5 = (f12 * f16) - f10;
                                } else {
                                    f5 = f12;
                                    f6 = f13;
                                }
                                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode2;
                                path.cubicTo(f5, f6, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                f3 = reflectiveCurveTo.getX1();
                                y1 = reflectiveCurveTo.getY1();
                                x2 = reflectiveCurveTo.getX2();
                                y2 = reflectiveCurveTo.getY2();
                            } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode2;
                                target.relativeQuadraticBezierTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                f3 = relativeQuadTo.getDx1() + f12;
                                f4 = relativeQuadTo.getDy1() + f13;
                                f12 += relativeQuadTo.getDx2();
                                dy = relativeQuadTo.getDy2();
                            } else if (pathNode2 instanceof PathNode.QuadTo) {
                                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode2;
                                target.quadraticBezierTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                f3 = quadTo.getX1();
                                y1 = quadTo.getY1();
                                x2 = quadTo.getX2();
                                y2 = quadTo.getY2();
                            } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                                if (pathNode.isQuad()) {
                                    f = f12 - f10;
                                    f2 = f13 - f11;
                                } else {
                                    f = 0.0f;
                                    f2 = 0.0f;
                                }
                                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode2;
                                target.relativeQuadraticBezierTo(f, f2, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                f3 = f + f12;
                                f4 = f2 + f13;
                                f12 += relativeReflectiveQuadTo.getDx();
                                dy = relativeReflectiveQuadTo.getDy();
                            } else {
                                if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                                    if (pathNode.isQuad()) {
                                        float f17 = 2;
                                        f12 = (f12 * f17) - f10;
                                        f13 = (f17 * f13) - f11;
                                    }
                                    PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode2;
                                    target.quadraticBezierTo(f12, f13, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                    float x4 = reflectiveQuadTo.getX();
                                    pathNode3 = pathNode2;
                                    f11 = f13;
                                    i = i3;
                                    i2 = size;
                                    f13 = reflectiveQuadTo.getY();
                                    f10 = f12;
                                    f12 = x4;
                                } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                                    PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode2;
                                    float arcStartDx = relativeArcTo.getArcStartDx() + f12;
                                    float arcStartDy = relativeArcTo.getArcStartDy() + f13;
                                    pathNode3 = pathNode2;
                                    i = i3;
                                    i2 = size;
                                    m59648b(path, f12, f13, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                    f10 = arcStartDx;
                                    f12 = f10;
                                    f14 = f14;
                                    f15 = f15;
                                    f11 = arcStartDy;
                                    f13 = f11;
                                } else {
                                    float f18 = f14;
                                    float f19 = f15;
                                    i = i3;
                                    i2 = size;
                                    if (pathNode2 instanceof PathNode.ArcTo) {
                                        PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode2;
                                        pathNode3 = pathNode2;
                                        m59648b(path, f12, f13, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                        f12 = arcTo.getArcStartX();
                                        f11 = arcTo.getArcStartY();
                                        f13 = f11;
                                        f14 = f18;
                                        f15 = f19;
                                        f10 = f12;
                                    } else {
                                        pathNode3 = pathNode2;
                                        f14 = f18;
                                        f15 = f19;
                                    }
                                }
                                i3 = i + 1;
                                target = path;
                                size = i2;
                                pathNode = pathNode3;
                                f9 = 0.0f;
                                list2 = list;
                            }
                            pathNode3 = pathNode2;
                            f12 = x2;
                            f13 = y2;
                            i = i3;
                            i2 = size;
                            f11 = y1;
                            f10 = f3;
                            i3 = i + 1;
                            target = path;
                            size = i2;
                            pathNode = pathNode3;
                            f9 = 0.0f;
                            list2 = list;
                        }
                        f13 += dy;
                        pathNode3 = pathNode2;
                        f11 = f4;
                        i = i3;
                        i2 = size;
                        f10 = f3;
                        i3 = i + 1;
                        target = path;
                        size = i2;
                        pathNode = pathNode3;
                        f9 = 0.0f;
                        list2 = list;
                    }
                    f13 += dy2;
                }
                pathNode3 = pathNode4;
            }
            i = i3;
            i2 = size;
            i3 = i + 1;
            target = path;
            size = i2;
            pathNode = pathNode3;
            f9 = 0.0f;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }
}
