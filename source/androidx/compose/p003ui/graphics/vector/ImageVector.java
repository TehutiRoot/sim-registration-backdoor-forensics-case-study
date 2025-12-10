package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\"\b\u0007\u0018\u0000 72\u00020\u0001:\u000287BT\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\r\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "", "", "name", "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "root", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "", "autoMirror", "<init>", "(Ljava/lang/String;FFFFLandroidx/compose/ui/graphics/vector/VectorGroup;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getDefaultWidth-D9Ej5fM", "()F", OperatorName.CURVE_TO, "getDefaultHeight-D9Ej5fM", "d", "getViewportWidth", "e", "getViewportHeight", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/graphics/vector/VectorGroup;", "getRoot", "()Landroidx/compose/ui/graphics/vector/VectorGroup;", OperatorName.NON_STROKING_GRAY, OperatorName.SET_LINE_CAPSTYLE, "getTintColor-0d7_KjU", "()J", OperatorName.CLOSE_PATH, "I", "getTintBlendMode-0nO6VwU", "i", "Z", "getAutoMirror", "()Z", "Companion", "Builder", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.ImageVector */
/* loaded from: classes2.dex */
public final class ImageVector {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f29373a;

    /* renamed from: b */
    public final float f29374b;

    /* renamed from: c */
    public final float f29375c;

    /* renamed from: d */
    public final float f29376d;

    /* renamed from: e */
    public final float f29377e;

    /* renamed from: f */
    public final VectorGroup f29378f;

    /* renamed from: g */
    public final long f29379g;

    /* renamed from: h */
    public final int f29380h;

    /* renamed from: i */
    public final boolean f29381i;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001=BR\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011BJ\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0012Jm\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010 J§\u0001\u00104\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\r\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0013\u0010=\u001a\u00020<*\u00020;H\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010?R\u001d\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b9\u0010@R\u001d\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010@R\u001d\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bD\u0010ER\u001d\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010N\u001a\u0012\u0012\u0004\u0012\u00020;0Jj\b\u0012\u0004\u0012\u00020;`K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010IR\u0014\u0010U\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010T\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "", "name", "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "", "autoMirror", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;FFFFJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "addGroup", "(Ljava/lang/String;FFFFFFFLjava/util/List;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "clearGroup", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "addPath-oIyEayM", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "addPath", "Landroidx/compose/ui/graphics/vector/ImageVector;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/compose/ui/graphics/vector/ImageVector;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$a;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder$a;)Landroidx/compose/ui/graphics/vector/VectorGroup;", "Ljava/lang/String;", "F", OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, OperatorName.NON_STROKING_GRAY, "I", OperatorName.CLOSE_PATH, "Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "nodes", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/graphics/vector/ImageVector$Builder$a;", "root", OperatorName.NON_STROKING_CMYK, "isConsumed", "()Landroidx/compose/ui/graphics/vector/ImageVector$Builder$a;", "currentGroup", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Builder */
    /* loaded from: classes2.dex */
    public static final class Builder {
        public static final int $stable = 8;

        /* renamed from: a */
        public final String f29382a;

        /* renamed from: b */
        public final float f29383b;

        /* renamed from: c */
        public final float f29384c;

        /* renamed from: d */
        public final float f29385d;

        /* renamed from: e */
        public final float f29386e;

        /* renamed from: f */
        public final long f29387f;

        /* renamed from: g */
        public final int f29388g;

        /* renamed from: h */
        public final boolean f29389h;

        /* renamed from: i */
        public final ArrayList f29390i;

        /* renamed from: j */
        public C3483a f29391j;

        /* renamed from: k */
        public boolean f29392k;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @ReplaceWith(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            String str2;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            List<PathNode> list2;
            if ((i & 1) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            float f13 = 0.0f;
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
            if ((i & 128) == 0) {
                f13 = f7;
            }
            if ((i & 256) != 0) {
                list2 = VectorKt.getEmptyPath();
            } else {
                list2 = list;
            }
            return builder.addGroup(str2, f8, f9, f10, f11, f14, f12, f13, list2);
        }

        /* renamed from: addPath-oIyEayM$default */
        public static /* synthetic */ Builder m72248addPathoIyEayM$default(Builder builder, List list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, Object obj) {
            int i5;
            String str2;
            Brush brush3;
            float f8;
            float f9;
            float f10;
            int i6;
            int i7;
            float f11;
            float f12;
            if ((i4 & 2) != 0) {
                i5 = VectorKt.getDefaultFillType();
            } else {
                i5 = i;
            }
            if ((i4 & 4) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            Brush brush4 = null;
            if ((i4 & 8) != 0) {
                brush3 = null;
            } else {
                brush3 = brush;
            }
            float f13 = 1.0f;
            if ((i4 & 16) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f;
            }
            if ((i4 & 32) == 0) {
                brush4 = brush2;
            }
            if ((i4 & 64) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f2;
            }
            float f14 = 0.0f;
            if ((i4 & 128) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f3;
            }
            if ((i4 & 256) != 0) {
                i6 = VectorKt.getDefaultStrokeLineCap();
            } else {
                i6 = i2;
            }
            if ((i4 & 512) != 0) {
                i7 = VectorKt.getDefaultStrokeLineJoin();
            } else {
                i7 = i3;
            }
            if ((i4 & 1024) != 0) {
                f11 = 4.0f;
            } else {
                f11 = f4;
            }
            if ((i4 & 2048) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f5;
            }
            if ((i4 & 4096) == 0) {
                f13 = f6;
            }
            if ((i4 & 8192) == 0) {
                f14 = f7;
            }
            return builder.m72249addPathoIyEayM(list, i5, str2, brush3, f8, brush4, f9, f10, i6, i7, f11, f12, f13, f14);
        }

        /* renamed from: a */
        public final VectorGroup m59669a(C3483a c3483a) {
            return new VectorGroup(c3483a.m59664c(), c3483a.m59661f(), c3483a.m59663d(), c3483a.m59662e(), c3483a.m59660g(), c3483a.m59659h(), c3483a.m59658i(), c3483a.m59657j(), c3483a.m59665b(), c3483a.m59666a());
        }

        @NotNull
        public final Builder addGroup(@NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends PathNode> clipPathData) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
            m59668b();
            ImageVectorKt.m59654c(this.f29390i, new C3483a(name, f, f2, f3, f4, f5, f6, f7, clipPathData, null, 512, null));
            return this;
        }

        @NotNull
        /* renamed from: addPath-oIyEayM */
        public final Builder m72249addPathoIyEayM(@NotNull List<? extends PathNode> pathData, int i, @NotNull String name, @Nullable Brush brush, float f, @Nullable Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            Intrinsics.checkNotNullParameter(pathData, "pathData");
            Intrinsics.checkNotNullParameter(name, "name");
            m59668b();
            m59667c().m59666a().add(new VectorPath(name, pathData, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        /* renamed from: b */
        public final void m59668b() {
            if (!this.f29392k) {
                return;
            }
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }

        @NotNull
        public final ImageVector build() {
            m59668b();
            while (this.f29390i.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.f29382a, this.f29383b, this.f29384c, this.f29385d, this.f29386e, m59669a(this.f29391j), this.f29387f, this.f29388g, this.f29389h, null);
            this.f29392k = true;
            return imageVector;
        }

        /* renamed from: c */
        public final C3483a m59667c() {
            Object m59656a;
            m59656a = ImageVectorKt.m59656a(this.f29390i);
            return (C3483a) m59656a;
        }

        @NotNull
        public final Builder clearGroup() {
            Object m59655b;
            m59668b();
            m59655b = ImageVectorKt.m59655b(this.f29390i);
            m59667c().m59666a().add(m59669a((C3483a) m59655b));
            return this;
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        public Builder(String name, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f29382a = name;
            this.f29383b = f;
            this.f29384c = f2;
            this.f29385d = f3;
            this.f29386e = f4;
            this.f29387f = j;
            this.f29388g = i;
            this.f29389h = z;
            ArrayList arrayList = new ArrayList();
            this.f29390i = arrayList;
            C3483a c3483a = new C3483a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f29391j = c3483a;
            ImageVectorKt.m59654c(arrayList, c3483a);
        }

        /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Builder$a */
        /* loaded from: classes2.dex */
        public static final class C3483a {

            /* renamed from: a */
            public String f29393a;

            /* renamed from: b */
            public float f29394b;

            /* renamed from: c */
            public float f29395c;

            /* renamed from: d */
            public float f29396d;

            /* renamed from: e */
            public float f29397e;

            /* renamed from: f */
            public float f29398f;

            /* renamed from: g */
            public float f29399g;

            /* renamed from: h */
            public float f29400h;

            /* renamed from: i */
            public List f29401i;

            /* renamed from: j */
            public List f29402j;

            public C3483a(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, List clipPathData, List children) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
                Intrinsics.checkNotNullParameter(children, "children");
                this.f29393a = name;
                this.f29394b = f;
                this.f29395c = f2;
                this.f29396d = f3;
                this.f29397e = f4;
                this.f29398f = f5;
                this.f29399g = f6;
                this.f29400h = f7;
                this.f29401i = clipPathData;
                this.f29402j = children;
            }

            /* renamed from: a */
            public final List m59666a() {
                return this.f29402j;
            }

            /* renamed from: b */
            public final List m59665b() {
                return this.f29401i;
            }

            /* renamed from: c */
            public final String m59664c() {
                return this.f29393a;
            }

            /* renamed from: d */
            public final float m59663d() {
                return this.f29395c;
            }

            /* renamed from: e */
            public final float m59662e() {
                return this.f29396d;
            }

            /* renamed from: f */
            public final float m59661f() {
                return this.f29394b;
            }

            /* renamed from: g */
            public final float m59660g() {
                return this.f29397e;
            }

            /* renamed from: h */
            public final float m59659h() {
                return this.f29398f;
            }

            /* renamed from: i */
            public final float m59658i() {
                return this.f29399g;
            }

            /* renamed from: j */
            public final float m59657j() {
                return this.f29400h;
            }

            public /* synthetic */ C3483a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? VectorKt.getEmptyPath() : list, (i & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.Companion.m71771getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? BlendMode.Companion.m71684getSrcIn0nO6VwU() : i, (i2 & 128) != 0 ? false : z, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ Builder(String str, float f, float f2, float f3, float f4, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? Color.Companion.m71771getUnspecified0d7_KjU() : j, (i2 & 64) != 0 ? BlendMode.Companion.m71684getSrcIn0nO6VwU() : i, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(String name, float f, float f2, float f3, float f4, long j, int i) {
            this(name, f, f2, f3, f4, j, i, false, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Companion;", "", "()V", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.graphics.vector.ImageVector$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ ImageVector(String str, float f, float f2, float f3, float f4, VectorGroup vectorGroup, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, vectorGroup, j, i, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        if (Intrinsics.areEqual(this.f29373a, imageVector.f29373a) && C3641Dp.m73663equalsimpl0(this.f29374b, imageVector.f29374b) && C3641Dp.m73663equalsimpl0(this.f29375c, imageVector.f29375c) && this.f29376d == imageVector.f29376d && this.f29377e == imageVector.f29377e && Intrinsics.areEqual(this.f29378f, imageVector.f29378f) && Color.m71736equalsimpl0(this.f29379g, imageVector.f29379g) && BlendMode.m71655equalsimpl0(this.f29380h, imageVector.f29380h) && this.f29381i == imageVector.f29381i) {
            return true;
        }
        return false;
    }

    public final boolean getAutoMirror() {
        return this.f29381i;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM */
    public final float m72244getDefaultHeightD9Ej5fM() {
        return this.f29375c;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM */
    public final float m72245getDefaultWidthD9Ej5fM() {
        return this.f29374b;
    }

    @NotNull
    public final String getName() {
        return this.f29373a;
    }

    @NotNull
    public final VectorGroup getRoot() {
        return this.f29378f;
    }

    /* renamed from: getTintBlendMode-0nO6VwU */
    public final int m72246getTintBlendMode0nO6VwU() {
        return this.f29380h;
    }

    /* renamed from: getTintColor-0d7_KjU */
    public final long m72247getTintColor0d7_KjU() {
        return this.f29379g;
    }

    public final float getViewportHeight() {
        return this.f29377e;
    }

    public final float getViewportWidth() {
        return this.f29376d;
    }

    public int hashCode() {
        return (((((((((((((((this.f29373a.hashCode() * 31) + C3641Dp.m73664hashCodeimpl(this.f29374b)) * 31) + C3641Dp.m73664hashCodeimpl(this.f29375c)) * 31) + Float.floatToIntBits(this.f29376d)) * 31) + Float.floatToIntBits(this.f29377e)) * 31) + this.f29378f.hashCode()) * 31) + Color.m71742hashCodeimpl(this.f29379g)) * 31) + BlendMode.m71656hashCodeimpl(this.f29380h)) * 31) + AbstractC1705Xp.m65430a(this.f29381i);
    }

    public ImageVector(String name, float f, float f2, float f3, float f4, VectorGroup root, long j, int i, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f29373a = name;
        this.f29374b = f;
        this.f29375c = f2;
        this.f29376d = f3;
        this.f29377e = f4;
        this.f29378f = root;
        this.f29379g = j;
        this.f29380h = i;
        this.f29381i = z;
    }
}
