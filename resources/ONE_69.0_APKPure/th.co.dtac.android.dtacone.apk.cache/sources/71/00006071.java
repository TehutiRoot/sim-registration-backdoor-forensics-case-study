package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u009e\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a1\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u00028\u00000'j\b\u0012\u0004\u0012\u00028\u0000`(2\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0004\b+\u0010,\u001a)\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u00028\u00000'j\b\u0012\u0004\u0012\u00028\u0000`(H\u0002¢\u0006\u0004\b-\u0010.\u001a)\u0010/\u001a\u00028\u0000\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u00028\u00000'j\b\u0012\u0004\u0012\u00028\u0000`(H\u0002¢\u0006\u0004\b/\u0010.\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "name", "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "pathBuilder", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", ClientCookie.PATH_ATTR, "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "block", "group", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "", OperatorName.CURVE_TO, "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/ArrayList;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "ui_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,768:1\n64#2,4:769\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n707#1:769,4\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.ImageVectorKt */
/* loaded from: classes2.dex */
public final class ImageVectorKt {
    /* renamed from: a */
    public static final Object m59606a(ArrayList arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    public static final /* synthetic */ Object access$peek(ArrayList arrayList) {
        return m59606a(arrayList);
    }

    public static final /* synthetic */ Object access$pop(ArrayList arrayList) {
        return m59605b(arrayList);
    }

    public static final /* synthetic */ boolean access$push(ArrayList arrayList, Object obj) {
        return m59604c(arrayList, obj);
    }

    /* renamed from: b */
    public static final Object m59605b(ArrayList arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: c */
    public static final boolean m59604c(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    @NotNull
    public static final ImageVector.Builder group(@NotNull ImageVector.Builder builder, @NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends PathNode> clipPathData, @NotNull Function1<? super ImageVector.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f, f2, f3, f4, f5, f6, f7, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, Function1 block, int i, Object obj) {
        String name;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        List<PathNode> clipPathData;
        if ((i & 1) != 0) {
            name = "";
        } else {
            name = str;
        }
        if ((i & 2) != 0) {
            f8 = 0.0f;
        } else {
            f8 = f;
        }
        if ((i & 4) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f2;
        }
        if ((i & 8) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f3;
        }
        float f14 = 1.0f;
        if ((i & 16) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f4;
        }
        if ((i & 32) == 0) {
            f14 = f5;
        }
        if ((i & 64) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f6;
        }
        if ((i & 128) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f7;
        }
        if ((i & 256) != 0) {
            clipPathData = VectorKt.getEmptyPath();
        } else {
            clipPathData = list;
        }
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f8, f9, f10, f11, f14, f12, f13, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    /* renamed from: path-R_LF-3I */
    public static final ImageVector.Builder m72434pathR_LF3I(@NotNull ImageVector.Builder path, @NotNull String name, @Nullable Brush brush, float f, @Nullable Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, @NotNull Function1<? super PathBuilder, Unit> pathBuilder) {
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m72432addPathoIyEayM$default(path, pathBuilder2.getNodes(), i3, name, brush, f, brush2, f2, f3, i, i2, f4, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: path-R_LF-3I$default */
    public static /* synthetic */ ImageVector.Builder m72435pathR_LF3I$default(ImageVector.Builder path, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, Function1 pathBuilder, int i4, Object obj) {
        String name;
        Brush brush3;
        float f5;
        Brush brush4;
        float f6;
        float f7;
        int i5;
        int i6;
        float f8;
        int i7;
        if ((i4 & 1) != 0) {
            name = "";
        } else {
            name = str;
        }
        if ((i4 & 2) != 0) {
            brush3 = null;
        } else {
            brush3 = brush;
        }
        if ((i4 & 4) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f;
        }
        if ((i4 & 8) != 0) {
            brush4 = null;
        } else {
            brush4 = brush2;
        }
        if ((i4 & 16) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        if ((i4 & 32) != 0) {
            f7 = 0.0f;
        } else {
            f7 = f3;
        }
        if ((i4 & 64) != 0) {
            i5 = VectorKt.getDefaultStrokeLineCap();
        } else {
            i5 = i;
        }
        if ((i4 & 128) != 0) {
            i6 = VectorKt.getDefaultStrokeLineJoin();
        } else {
            i6 = i2;
        }
        if ((i4 & 256) != 0) {
            f8 = 4.0f;
        } else {
            f8 = f4;
        }
        if ((i4 & 512) != 0) {
            i7 = VectorKt.getDefaultFillType();
        } else {
            i7 = i3;
        }
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m72432addPathoIyEayM$default(path, pathBuilder2.getNodes(), i7, name, brush3, f5, brush4, f6, f7, i5, i6, f8, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}