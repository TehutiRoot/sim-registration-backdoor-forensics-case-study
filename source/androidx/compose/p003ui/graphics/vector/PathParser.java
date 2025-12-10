package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "<init>", "()V", "", "clear", "", "pathData", "parsePathString", "(Ljava/lang/String;)Landroidx/compose/ui/graphics/vector/PathParser;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "nodes", "addPathNodes", "(Ljava/util/List;)Landroidx/compose/ui/graphics/vector/PathParser;", "", "toNodes", "()Ljava/util/List;", "Landroidx/compose/ui/graphics/Path;", TypedValues.AttributesType.S_TARGET, "toPath", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "Landroidx/compose/ui/graphics/vector/FloatResult;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/graphics/vector/FloatResult;", "floatResult", "", OperatorName.CURVE_TO, "[F", "nodeData", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n1#1,553:1\n130#1,6:554\n148#1,2:560\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n113#1:554,6\n121#1:560,2\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.PathParser */
/* loaded from: classes2.dex */
public final class PathParser {

    /* renamed from: a */
    public final List f29485a = new ArrayList();

    /* renamed from: b */
    public final FloatResult f29486b = new FloatResult(0.0f, false, 3, null);

    /* renamed from: c */
    public float[] f29487c = new float[64];

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    @NotNull
    public final PathParser addPathNodes(@NotNull List<? extends PathNode> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        this.f29485a.addAll(nodes);
        return this;
    }

    public final void clear() {
        this.f29485a.clear();
    }

    @NotNull
    public final PathParser parsePathString(@NotNull String pathData) {
        int i;
        char charAt;
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        this.f29485a.clear();
        int length = pathData.length();
        int i2 = 0;
        while (i2 < length && Intrinsics.compare((int) pathData.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && Intrinsics.compare((int) pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                charAt = pathData.charAt(i2);
                int i4 = charAt | TokenParser.f74560SP;
                if ((i4 - 97) * (i4 - 122) <= 0 && i4 != 101) {
                    break;
                } else if (i >= length) {
                    charAt = 0;
                    break;
                } else {
                    i2 = i;
                }
            }
            if (charAt != 0) {
                if ((charAt | TokenParser.f74560SP) != 122) {
                    i3 = 0;
                    while (true) {
                        if (i < length && Intrinsics.compare((int) pathData.charAt(i), 32) <= 0) {
                            i++;
                        } else {
                            i = FastFloatParser.Companion.nextFloat(pathData, i, length, this.f29486b);
                            if (this.f29486b.isValid()) {
                                int i5 = i3 + 1;
                                this.f29487c[i3] = this.f29486b.getValue();
                                float[] fArr = this.f29487c;
                                if (i5 >= fArr.length) {
                                    float[] fArr2 = new float[i5 * 2];
                                    this.f29487c = fArr2;
                                    ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i3 = i5;
                            }
                            while (i < length && pathData.charAt(i) == ',') {
                                i++;
                            }
                            if (i >= length || !this.f29486b.isValid()) {
                                break;
                            }
                        }
                    }
                }
                PathNodeKt.addPathNodes(charAt, this.f29485a, this.f29487c, i3);
            }
            i2 = i;
        }
        return this;
    }

    @NotNull
    public final List<PathNode> toNodes() {
        return this.f29485a;
    }

    @NotNull
    public final Path toPath(@NotNull Path target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return PathParserKt.toPath(this.f29485a, target);
    }
}
