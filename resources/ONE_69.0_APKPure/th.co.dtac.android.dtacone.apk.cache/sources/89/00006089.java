package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.vector.PathNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a1\u0010\t\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m29142d2 = {"", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "", "args", "", "count", "", "addPathNodes", "(CLjava/util/List;[FI)V", "ui-graphics_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,399:1\n347#1,15:400\n347#1,15:415\n347#1,15:430\n347#1,15:445\n347#1,15:460\n347#1,15:475\n347#1,15:490\n347#1,15:505\n347#1,15:520\n347#1,15:535\n347#1,15:550\n347#1,15:565\n347#1,15:580\n347#1,15:595\n347#1,15:610\n347#1,15:625\n347#1,15:640\n347#1,15:655\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n154#1:400,15\n163#1:415,15\n167#1:430,15\n176#1:445,15\n180#1:460,15\n189#1:475,15\n198#1:490,15\n207#1:505,15\n216#1:520,15\n232#1:535,15\n243#1:550,15\n257#1:565,15\n271#1:580,15\n285#1:595,15\n294#1:610,15\n303#1:625,15\n312#1:640,15\n324#1:655,15\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.PathNodeKt */
/* loaded from: classes2.dex */
public final class PathNodeKt {
    public static final void addPathNodes(char c, @NotNull List<PathNode> nodes, @NotNull float[] args, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        Intrinsics.checkNotNullParameter(args, "args");
        if (c == 'z' || c == 'Z') {
            nodes.add(PathNode.Close.INSTANCE);
            return;
        }
        int i2 = 0;
        if (c == 'm') {
            int i3 = i - 2;
            while (i2 <= i3) {
                int i4 = i2 + 1;
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(args[i2], args[i4]);
                if (i2 > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(args[i2], args[i4]);
                }
                nodes.add(relativeMoveTo);
                i2 += 2;
            }
        } else if (c == 'M') {
            int i5 = i - 2;
            while (i2 <= i5) {
                int i6 = i2 + 1;
                PathNode moveTo = new PathNode.MoveTo(args[i2], args[i6]);
                if (i2 > 0) {
                    moveTo = new PathNode.LineTo(args[i2], args[i6]);
                }
                nodes.add(moveTo);
                i2 += 2;
            }
        } else if (c == 'l') {
            int i7 = i - 2;
            while (i2 <= i7) {
                nodes.add(new PathNode.RelativeLineTo(args[i2], args[i2 + 1]));
                i2 += 2;
            }
        } else if (c == 'L') {
            int i8 = i - 2;
            while (i2 <= i8) {
                nodes.add(new PathNode.LineTo(args[i2], args[i2 + 1]));
                i2 += 2;
            }
        } else if (c == 'h') {
            int i9 = i - 1;
            while (i2 <= i9) {
                nodes.add(new PathNode.RelativeHorizontalTo(args[i2]));
                i2++;
            }
        } else if (c == 'H') {
            int i10 = i - 1;
            while (i2 <= i10) {
                nodes.add(new PathNode.HorizontalTo(args[i2]));
                i2++;
            }
        } else if (c == 'v') {
            int i11 = i - 1;
            while (i2 <= i11) {
                nodes.add(new PathNode.RelativeVerticalTo(args[i2]));
                i2++;
            }
        } else if (c == 'V') {
            int i12 = i - 1;
            while (i2 <= i12) {
                nodes.add(new PathNode.VerticalTo(args[i2]));
                i2++;
            }
        } else if (c == 'c') {
            int i13 = i - 6;
            while (i2 <= i13) {
                nodes.add(new PathNode.RelativeCurveTo(args[i2], args[i2 + 1], args[i2 + 2], args[i2 + 3], args[i2 + 4], args[i2 + 5]));
                i2 += 6;
            }
        } else if (c == 'C') {
            int i14 = i - 6;
            while (i2 <= i14) {
                nodes.add(new PathNode.CurveTo(args[i2], args[i2 + 1], args[i2 + 2], args[i2 + 3], args[i2 + 4], args[i2 + 5]));
                i2 += 6;
            }
        } else if (c == 's') {
            int i15 = i - 4;
            while (i2 <= i15) {
                nodes.add(new PathNode.RelativeReflectiveCurveTo(args[i2], args[i2 + 1], args[i2 + 2], args[i2 + 3]));
                i2 += 4;
            }
        } else if (c == 'S') {
            int i16 = i - 4;
            while (i2 <= i16) {
                nodes.add(new PathNode.ReflectiveCurveTo(args[i2], args[i2 + 1], args[i2 + 2], args[i2 + 3]));
                i2 += 4;
            }
        } else if (c == 'q') {
            int i17 = i - 4;
            while (i2 <= i17) {
                nodes.add(new PathNode.RelativeQuadTo(args[i2], args[i2 + 1], args[i2 + 2], args[i2 + 3]));
                i2 += 4;
            }
        } else if (c == 'Q') {
            int i18 = i - 4;
            while (i2 <= i18) {
                nodes.add(new PathNode.QuadTo(args[i2], args[i2 + 1], args[i2 + 2], args[i2 + 3]));
                i2 += 4;
            }
        } else if (c == 't') {
            int i19 = i - 2;
            while (i2 <= i19) {
                nodes.add(new PathNode.RelativeReflectiveQuadTo(args[i2], args[i2 + 1]));
                i2 += 2;
            }
        } else if (c == 'T') {
            int i20 = i - 2;
            while (i2 <= i20) {
                nodes.add(new PathNode.ReflectiveQuadTo(args[i2], args[i2 + 1]));
                i2 += 2;
            }
        } else if (c == 'a') {
            int i21 = i - 7;
            for (int i22 = 0; i22 <= i21; i22 += 7) {
                float f = args[i22];
                float f2 = args[i22 + 1];
                float f3 = args[i22 + 2];
                if (Float.compare(args[i22 + 3], 0.0f) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Float.compare(args[i22 + 4], 0.0f) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                nodes.add(new PathNode.RelativeArcTo(f, f2, f3, z3, z4, args[i22 + 5], args[i22 + 6]));
            }
        } else if (c == 'A') {
            int i23 = i - 7;
            for (int i24 = 0; i24 <= i23; i24 += 7) {
                float f4 = args[i24];
                float f5 = args[i24 + 1];
                float f6 = args[i24 + 2];
                if (Float.compare(args[i24 + 3], 0.0f) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (Float.compare(args[i24 + 4], 0.0f) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                nodes.add(new PathNode.ArcTo(f4, f5, f6, z, z2, args[i24 + 5], args[i24 + 6]));
            }
        } else {
            throw new IllegalArgumentException("Unknown command for: " + c);
        }
    }
}