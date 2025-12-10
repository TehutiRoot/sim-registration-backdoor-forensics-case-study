package androidx.compose.animation.graphics.vector;

import androidx.compose.p003ui.graphics.vector.PathNode;
import androidx.compose.p003ui.util.MathHelpersKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m29142d2 = {"", "Landroidx/compose/ui/graphics/vector/PathNode;", "start", "stop", "", "fraction", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/List;Ljava/util/List;F)Ljava/util/List;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/graphics/vector/PathNode;Landroidx/compose/ui/graphics/vector/PathNode;F)Landroidx/compose/ui/graphics/vector/PathNode;", "", "RepeatCountInfinite", "I", "animation-graphics_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/AnimatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,650:1\n3433#2,7:651\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/compose/animation/graphics/vector/AnimatorKt\n*L\n491#1:651,7\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatorKt {
    public static final int RepeatCountInfinite = -1;

    /* renamed from: a */
    public static final PathNode m61606a(PathNode pathNode, PathNode pathNode2, float f) {
        if (pathNode instanceof PathNode.RelativeMoveTo) {
            if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode;
                PathNode.RelativeMoveTo relativeMoveTo2 = (PathNode.RelativeMoveTo) pathNode2;
                return new PathNode.RelativeMoveTo(MathHelpersKt.lerp(relativeMoveTo.getDx(), relativeMoveTo2.getDx(), f), MathHelpersKt.lerp(relativeMoveTo.getDy(), relativeMoveTo2.getDy(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.MoveTo) {
            if (pathNode2 instanceof PathNode.MoveTo) {
                PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode;
                PathNode.MoveTo moveTo2 = (PathNode.MoveTo) pathNode2;
                return new PathNode.MoveTo(MathHelpersKt.lerp(moveTo.getX(), moveTo2.getX(), f), MathHelpersKt.lerp(moveTo.getY(), moveTo2.getY(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.RelativeLineTo) {
            if (pathNode2 instanceof PathNode.RelativeLineTo) {
                PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode;
                PathNode.RelativeLineTo relativeLineTo2 = (PathNode.RelativeLineTo) pathNode2;
                return new PathNode.RelativeLineTo(MathHelpersKt.lerp(relativeLineTo.getDx(), relativeLineTo2.getDx(), f), MathHelpersKt.lerp(relativeLineTo.getDy(), relativeLineTo2.getDy(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.LineTo) {
            if (pathNode2 instanceof PathNode.LineTo) {
                PathNode.LineTo lineTo = (PathNode.LineTo) pathNode;
                PathNode.LineTo lineTo2 = (PathNode.LineTo) pathNode2;
                return new PathNode.LineTo(MathHelpersKt.lerp(lineTo.getX(), lineTo2.getX(), f), MathHelpersKt.lerp(lineTo.getY(), lineTo2.getY(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.RelativeHorizontalTo) {
            if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                return new PathNode.RelativeHorizontalTo(MathHelpersKt.lerp(((PathNode.RelativeHorizontalTo) pathNode).getDx(), ((PathNode.RelativeHorizontalTo) pathNode2).getDx(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.HorizontalTo) {
            if (pathNode2 instanceof PathNode.HorizontalTo) {
                return new PathNode.HorizontalTo(MathHelpersKt.lerp(((PathNode.HorizontalTo) pathNode).getX(), ((PathNode.HorizontalTo) pathNode2).getX(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.RelativeVerticalTo) {
            if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                return new PathNode.RelativeVerticalTo(MathHelpersKt.lerp(((PathNode.RelativeVerticalTo) pathNode).getDy(), ((PathNode.RelativeVerticalTo) pathNode2).getDy(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.VerticalTo) {
            if (pathNode2 instanceof PathNode.VerticalTo) {
                return new PathNode.VerticalTo(MathHelpersKt.lerp(((PathNode.VerticalTo) pathNode).getY(), ((PathNode.VerticalTo) pathNode2).getY(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.RelativeCurveTo) {
            if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode;
                PathNode.RelativeCurveTo relativeCurveTo2 = (PathNode.RelativeCurveTo) pathNode2;
                return new PathNode.RelativeCurveTo(MathHelpersKt.lerp(relativeCurveTo.getDx1(), relativeCurveTo2.getDx1(), f), MathHelpersKt.lerp(relativeCurveTo.getDy1(), relativeCurveTo2.getDy1(), f), MathHelpersKt.lerp(relativeCurveTo.getDx2(), relativeCurveTo2.getDx2(), f), MathHelpersKt.lerp(relativeCurveTo.getDy2(), relativeCurveTo2.getDy2(), f), MathHelpersKt.lerp(relativeCurveTo.getDx3(), relativeCurveTo2.getDx3(), f), MathHelpersKt.lerp(relativeCurveTo.getDy3(), relativeCurveTo2.getDy3(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.CurveTo) {
            if (pathNode2 instanceof PathNode.CurveTo) {
                PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode;
                PathNode.CurveTo curveTo2 = (PathNode.CurveTo) pathNode2;
                return new PathNode.CurveTo(MathHelpersKt.lerp(curveTo.getX1(), curveTo2.getX1(), f), MathHelpersKt.lerp(curveTo.getY1(), curveTo2.getY1(), f), MathHelpersKt.lerp(curveTo.getX2(), curveTo2.getX2(), f), MathHelpersKt.lerp(curveTo.getY2(), curveTo2.getY2(), f), MathHelpersKt.lerp(curveTo.getX3(), curveTo2.getX3(), f), MathHelpersKt.lerp(curveTo.getY3(), curveTo2.getY3(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.RelativeReflectiveCurveTo) {
            if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode;
                PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo2 = (PathNode.RelativeReflectiveCurveTo) pathNode2;
                return new PathNode.RelativeReflectiveCurveTo(MathHelpersKt.lerp(relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo2.getDx1(), f), MathHelpersKt.lerp(relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo2.getDy1(), f), MathHelpersKt.lerp(relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo2.getDx2(), f), MathHelpersKt.lerp(relativeReflectiveCurveTo.getDy2(), relativeReflectiveCurveTo2.getDy2(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.ReflectiveCurveTo) {
            if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode;
                PathNode.ReflectiveCurveTo reflectiveCurveTo2 = (PathNode.ReflectiveCurveTo) pathNode2;
                return new PathNode.ReflectiveCurveTo(MathHelpersKt.lerp(reflectiveCurveTo.getX1(), reflectiveCurveTo2.getX1(), f), MathHelpersKt.lerp(reflectiveCurveTo.getY1(), reflectiveCurveTo2.getY1(), f), MathHelpersKt.lerp(reflectiveCurveTo.getX2(), reflectiveCurveTo2.getX2(), f), MathHelpersKt.lerp(reflectiveCurveTo.getY2(), reflectiveCurveTo2.getY2(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.RelativeQuadTo) {
            if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode;
                PathNode.RelativeQuadTo relativeQuadTo2 = (PathNode.RelativeQuadTo) pathNode2;
                return new PathNode.RelativeQuadTo(MathHelpersKt.lerp(relativeQuadTo.getDx1(), relativeQuadTo2.getDx1(), f), MathHelpersKt.lerp(relativeQuadTo.getDy1(), relativeQuadTo2.getDy1(), f), MathHelpersKt.lerp(relativeQuadTo.getDx2(), relativeQuadTo2.getDx2(), f), MathHelpersKt.lerp(relativeQuadTo.getDy2(), relativeQuadTo2.getDy2(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.QuadTo) {
            if (pathNode2 instanceof PathNode.QuadTo) {
                PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode;
                PathNode.QuadTo quadTo2 = (PathNode.QuadTo) pathNode2;
                return new PathNode.QuadTo(MathHelpersKt.lerp(quadTo.getX1(), quadTo2.getX1(), f), MathHelpersKt.lerp(quadTo.getY1(), quadTo2.getY1(), f), MathHelpersKt.lerp(quadTo.getX2(), quadTo2.getX2(), f), MathHelpersKt.lerp(quadTo.getY2(), quadTo2.getY2(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.RelativeReflectiveQuadTo) {
            if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode;
                PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo2 = (PathNode.RelativeReflectiveQuadTo) pathNode2;
                return new PathNode.RelativeReflectiveQuadTo(MathHelpersKt.lerp(relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo2.getDx(), f), MathHelpersKt.lerp(relativeReflectiveQuadTo.getDy(), relativeReflectiveQuadTo2.getDy(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.ReflectiveQuadTo) {
            if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode;
                PathNode.ReflectiveQuadTo reflectiveQuadTo2 = (PathNode.ReflectiveQuadTo) pathNode2;
                return new PathNode.ReflectiveQuadTo(MathHelpersKt.lerp(reflectiveQuadTo.getX(), reflectiveQuadTo2.getX(), f), MathHelpersKt.lerp(reflectiveQuadTo.getY(), reflectiveQuadTo2.getY(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.RelativeArcTo) {
            if (pathNode2 instanceof PathNode.RelativeArcTo) {
                PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode;
                PathNode.RelativeArcTo relativeArcTo2 = (PathNode.RelativeArcTo) pathNode2;
                return new PathNode.RelativeArcTo(MathHelpersKt.lerp(relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo2.getHorizontalEllipseRadius(), f), MathHelpersKt.lerp(relativeArcTo.getVerticalEllipseRadius(), relativeArcTo2.getVerticalEllipseRadius(), f), MathHelpersKt.lerp(relativeArcTo.getTheta(), relativeArcTo2.getTheta(), f), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc(), MathHelpersKt.lerp(relativeArcTo.getArcStartDx(), relativeArcTo2.getArcStartDx(), f), MathHelpersKt.lerp(relativeArcTo.getArcStartDy(), relativeArcTo2.getArcStartDy(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (pathNode instanceof PathNode.ArcTo) {
            if (pathNode2 instanceof PathNode.ArcTo) {
                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                PathNode.ArcTo arcTo2 = (PathNode.ArcTo) pathNode2;
                return new PathNode.ArcTo(MathHelpersKt.lerp(arcTo.getHorizontalEllipseRadius(), arcTo2.getHorizontalEllipseRadius(), f), MathHelpersKt.lerp(arcTo.getVerticalEllipseRadius(), arcTo2.getVerticalEllipseRadius(), f), MathHelpersKt.lerp(arcTo.getTheta(), arcTo2.getTheta(), f), arcTo.isMoreThanHalf(), arcTo.isPositiveArc(), MathHelpersKt.lerp(arcTo.getArcStartX(), arcTo2.getArcStartX(), f), MathHelpersKt.lerp(arcTo.getArcStartY(), arcTo2.getArcStartY(), f));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else {
            PathNode.Close close = PathNode.Close.INSTANCE;
            if (Intrinsics.areEqual(pathNode, close)) {
                return close;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public static final List m61605b(List list, List list2, float f) {
        List list3 = list;
        Iterator it = list3.iterator();
        List list4 = list2;
        Iterator it2 = list4.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC10172es.collectionSizeOrDefault(list3, 10), AbstractC10172es.collectionSizeOrDefault(list4, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(m61606a((PathNode) it.next(), (PathNode) it2.next(), f));
        }
        return arrayList;
    }
}