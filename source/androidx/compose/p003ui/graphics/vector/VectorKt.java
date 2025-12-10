package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.BlendMode;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.PathFillType;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011\"\u0014\u0010\u0017\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011\"\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000e\"\u0014\u0010\u001e\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011\"\u0014\u0010\u001f\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011\"\u0014\u0010 \u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0011\"\u0014\u0010!\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0011\"\u0014\u0010\"\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0011\"\u001a\u0010(\u001a\u00020#8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u001a\u0010,\u001a\u00020)8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u001a\u00100\u001a\u00020-8\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'\"\u001a\u00106\u001a\u0002018\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u001a\u0010:\u001a\u0002078\u0006ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006;"}, m28850d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "PathData", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "pathStr", "addPathNodes", "(Ljava/lang/String;)Ljava/util/List;", "DefaultGroupName", "Ljava/lang/String;", "", "DefaultRotation", "F", "DefaultPivotX", "DefaultPivotY", "DefaultScaleX", "DefaultScaleY", "DefaultTranslationX", "DefaultTranslationY", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getEmptyPath", "()Ljava/util/List;", "EmptyPath", "DefaultPathName", "DefaultStrokeLineWidth", "DefaultStrokeLineMiter", "DefaultTrimPathStart", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/StrokeCap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getDefaultStrokeLineCap", "()I", "DefaultStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", OperatorName.CURVE_TO, "getDefaultStrokeLineJoin", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "d", "getDefaultTintBlendMode", "DefaultTintBlendMode", "Landroidx/compose/ui/graphics/Color;", "e", OperatorName.SET_LINE_CAPSTYLE, "getDefaultTintColor", "()J", "DefaultTintColor", "Landroidx/compose/ui/graphics/PathFillType;", OperatorName.FILL_NON_ZERO, "getDefaultFillType", "DefaultFillType", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.VectorKt */
/* loaded from: classes2.dex */
public final class VectorKt {
    @NotNull
    public static final String DefaultGroupName = "";
    @NotNull
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;

    /* renamed from: a */
    public static final List f29510a = CollectionsKt__CollectionsKt.emptyList();

    /* renamed from: b */
    public static final int f29511b = StrokeCap.Companion.m72043getButtKaPHkGw();

    /* renamed from: c */
    public static final int f29512c = StrokeJoin.Companion.m72054getMiterLxFBmk8();

    /* renamed from: d */
    public static final int f29513d = BlendMode.Companion.m71684getSrcIn0nO6VwU();

    /* renamed from: e */
    public static final long f29514e = Color.Companion.m71770getTransparent0d7_KjU();

    /* renamed from: f */
    public static final int f29515f = PathFillType.Companion.m71976getNonZeroRgk1Os();

    @NotNull
    public static final List<PathNode> PathData(@NotNull Function1<? super PathBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PathBuilder pathBuilder = new PathBuilder();
        block.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    @NotNull
    public static final List<PathNode> addPathNodes(@Nullable String str) {
        if (str == null) {
            return f29510a;
        }
        return new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return f29515f;
    }

    public static final int getDefaultStrokeLineCap() {
        return f29511b;
    }

    public static final int getDefaultStrokeLineJoin() {
        return f29512c;
    }

    public static final int getDefaultTintBlendMode() {
        return f29513d;
    }

    public static final long getDefaultTintColor() {
        return f29514e;
    }

    @NotNull
    public static final List<PathNode> getEmptyPath() {
        return f29510a;
    }
}
