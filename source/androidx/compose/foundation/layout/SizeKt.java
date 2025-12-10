package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a!\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a)\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\n\u001a-\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\n\u001aA\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0004\u001a!\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0004\u001a!\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0004\u001a)\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\n\u001a!\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\r\u001a-\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\n\u001a-\u0010&\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010\n\u001aA\u0010(\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0019\u001a\u001d\u0010+\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010\u0004\u001a\u001d\u0010,\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b,\u0010\u0004\u001a\u001d\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b-\u0010\u0004\u001a'\u00102\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103\u001a'\u00105\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u0002042\b\b\u0002\u00101\u001a\u000200H\u0007¢\u0006\u0004\b5\u00106\u001a'\u00108\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010/\u001a\u0002072\b\b\u0002\u00101\u001a\u000200H\u0007¢\u0006\u0004\b8\u00109\u001a-\u0010;\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010\n\"\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010A\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>\"\u0014\u0010C\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>\"\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010I\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010F\"\u0014\u0010K\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010F\"\u0014\u0010M\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010F\"\u0014\u0010O\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010F\"\u0014\u0010Q\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006R"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "width-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "height", "height-3ABfNKs", "size", "size-3ABfNKs", "size-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/DpSize;", "size-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "min", "max", "widthIn-VpY3zN4", "widthIn", "heightIn-VpY3zN4", "heightIn", "minWidth", "minHeight", "maxWidth", "maxHeight", "sizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "sizeIn", "requiredWidth-3ABfNKs", "requiredWidth", "requiredHeight-3ABfNKs", "requiredHeight", "requiredSize-3ABfNKs", "requiredSize", "requiredSize-VpY3zN4", "requiredSize-6HolHcs", "requiredWidthIn-VpY3zN4", "requiredWidthIn", "requiredHeightIn-VpY3zN4", "requiredHeightIn", "requiredSizeIn-qDBjuR0", "requiredSizeIn", "", "fraction", "fillMaxWidth", "fillMaxHeight", "fillMaxSize", "Landroidx/compose/ui/Alignment$Horizontal;", "align", "", "unbounded", "wrapContentWidth", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment$Vertical;", "wrapContentHeight", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "wrapContentSize", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/Modifier;", "defaultMinSize-VpY3zN4", "defaultMinSize", "Landroidx/compose/foundation/layout/FillElement;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "FillWholeMaxHeight", OperatorName.CURVE_TO, "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", "d", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "e", "WrapContentWidthStart", OperatorName.FILL_NON_ZERO, "WrapContentHeightCenter", OperatorName.NON_STROKING_GRAY, "WrapContentHeightTop", OperatorName.CLOSE_PATH, "WrapContentSizeCenter", "i", "WrapContentSizeTopStart", "foundation-layout_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1110:1\n135#2:1111\n135#2:1112\n135#2:1113\n135#2:1114\n135#2:1115\n135#2:1116\n135#2:1117\n135#2:1118\n135#2:1119\n135#2:1120\n135#2:1121\n135#2:1122\n135#2:1123\n135#2:1124\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n60#1:1111\n84#1:1112\n110#1:1113\n137#1:1114\n175#1:1115\n198#1:1116\n225#1:1117\n256#1:1118\n284#1:1119\n314#1:1120\n341#1:1121\n380#1:1122\n404#1:1123\n433#1:1124\n*E\n"})
/* loaded from: classes.dex */
public final class SizeKt {

    /* renamed from: a */
    public static final FillElement f13255a;

    /* renamed from: b */
    public static final FillElement f13256b;

    /* renamed from: c */
    public static final FillElement f13257c;

    /* renamed from: d */
    public static final WrapContentElement f13258d;

    /* renamed from: e */
    public static final WrapContentElement f13259e;

    /* renamed from: f */
    public static final WrapContentElement f13260f;

    /* renamed from: g */
    public static final WrapContentElement f13261g;

    /* renamed from: h */
    public static final WrapContentElement f13262h;

    /* renamed from: i */
    public static final WrapContentElement f13263i;

    static {
        FillElement.Companion companion = FillElement.f13131e;
        f13255a = companion.width(1.0f);
        f13256b = companion.height(1.0f);
        f13257c = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.f13336g;
        Alignment.Companion companion3 = Alignment.Companion;
        f13258d = companion2.width(companion3.getCenterHorizontally(), false);
        f13259e = companion2.width(companion3.getStart(), false);
        f13260f = companion2.height(companion3.getCenterVertically(), false);
        f13261g = companion2.height(companion3.getTop(), false);
        f13262h = companion2.size(companion3.getCenter(), false);
        f13263i = companion2.size(companion3.getTopStart(), false);
    }

    @Stable
    @NotNull
    /* renamed from: defaultMinSize-VpY3zN4 */
    public static final Modifier m69548defaultMinSizeVpY3zN4(@NotNull Modifier defaultMinSize, float f, float f2) {
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        return defaultMinSize.then(new UnspecifiedConstraintsElement(f, f2, null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default */
    public static /* synthetic */ Modifier m69549defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69548defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxHeight(@NotNull Modifier modifier, float f) {
        FillElement height;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (f == 1.0f) {
            height = f13256b;
        } else {
            height = FillElement.f13131e.height(f);
        }
        return modifier.then(height);
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxSize(@NotNull Modifier modifier, float f) {
        FillElement size;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (f == 1.0f) {
            size = f13257c;
        } else {
            size = FillElement.f13131e.size(f);
        }
        return modifier.then(size);
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    @Stable
    @NotNull
    public static final Modifier fillMaxWidth(@NotNull Modifier modifier, float f) {
        FillElement width;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (f == 1.0f) {
            width = f13255a;
        } else {
            width = FillElement.f13131e.width(f);
        }
        return modifier.then(width);
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    @Stable
    @NotNull
    /* renamed from: height-3ABfNKs */
    public static final Modifier m69550height3ABfNKs(@NotNull Modifier height, float f) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(height, "$this$height");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return height.then(new SizeElement(0.0f, f, 0.0f, f, true, noInspectorInfo, 5, null));
    }

    @Stable
    @NotNull
    /* renamed from: heightIn-VpY3zN4 */
    public static final Modifier m69551heightInVpY3zN4(@NotNull Modifier heightIn, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return heightIn.then(new SizeElement(0.0f, f, 0.0f, f2, true, noInspectorInfo, 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m69552heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69551heightInVpY3zN4(modifier, f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: requiredHeight-3ABfNKs */
    public static final Modifier m69553requiredHeight3ABfNKs(@NotNull Modifier requiredHeight, float f) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredHeight.then(new SizeElement(0.0f, f, 0.0f, f, false, noInspectorInfo, 5, null));
    }

    @Stable
    @NotNull
    /* renamed from: requiredHeightIn-VpY3zN4 */
    public static final Modifier m69554requiredHeightInVpY3zN4(@NotNull Modifier requiredHeightIn, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(requiredHeightIn, "$this$requiredHeightIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredHeightIn.then(new SizeElement(0.0f, f, 0.0f, f2, false, noInspectorInfo, 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m69555requiredHeightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69554requiredHeightInVpY3zN4(modifier, f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: requiredSize-3ABfNKs */
    public static final Modifier m69556requiredSize3ABfNKs(@NotNull Modifier requiredSize, float f) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredSize.then(new SizeElement(f, f, f, f, false, noInspectorInfo, null));
    }

    @Stable
    @NotNull
    /* renamed from: requiredSize-6HolHcs */
    public static final Modifier m69557requiredSize6HolHcs(@NotNull Modifier requiredSize, long j) {
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        return m69558requiredSizeVpY3zN4(requiredSize, DpSize.m73756getWidthD9Ej5fM(j), DpSize.m73754getHeightD9Ej5fM(j));
    }

    @Stable
    @NotNull
    /* renamed from: requiredSize-VpY3zN4 */
    public static final Modifier m69558requiredSizeVpY3zN4(@NotNull Modifier requiredSize, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredSize.then(new SizeElement(f, f2, f, f2, false, noInspectorInfo, null));
    }

    @Stable
    @NotNull
    /* renamed from: requiredSizeIn-qDBjuR0 */
    public static final Modifier m69559requiredSizeInqDBjuR0(@NotNull Modifier requiredSizeIn, float f, float f2, float f3, float f4) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredSizeIn.then(new SizeElement(f, f2, f3, f4, false, noInspectorInfo, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m69560requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69559requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    @NotNull
    /* renamed from: requiredWidth-3ABfNKs */
    public static final Modifier m69561requiredWidth3ABfNKs(@NotNull Modifier requiredWidth, float f) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredWidth.then(new SizeElement(f, 0.0f, f, 0.0f, false, noInspectorInfo, 10, null));
    }

    @Stable
    @NotNull
    /* renamed from: requiredWidthIn-VpY3zN4 */
    public static final Modifier m69562requiredWidthInVpY3zN4(@NotNull Modifier requiredWidthIn, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(requiredWidthIn, "$this$requiredWidthIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return requiredWidthIn.then(new SizeElement(f, 0.0f, f2, 0.0f, false, noInspectorInfo, 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m69563requiredWidthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69562requiredWidthInVpY3zN4(modifier, f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: size-3ABfNKs */
    public static final Modifier m69564size3ABfNKs(@NotNull Modifier size, float f) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(size, "$this$size");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return size.then(new SizeElement(f, f, f, f, true, noInspectorInfo, null));
    }

    @Stable
    @NotNull
    /* renamed from: size-6HolHcs */
    public static final Modifier m69565size6HolHcs(@NotNull Modifier size, long j) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return m69566sizeVpY3zN4(size, DpSize.m73756getWidthD9Ej5fM(j), DpSize.m73754getHeightD9Ej5fM(j));
    }

    @Stable
    @NotNull
    /* renamed from: size-VpY3zN4 */
    public static final Modifier m69566sizeVpY3zN4(@NotNull Modifier size, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(size, "$this$size");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return size.then(new SizeElement(f, f2, f, f2, true, noInspectorInfo, null));
    }

    @Stable
    @NotNull
    /* renamed from: sizeIn-qDBjuR0 */
    public static final Modifier m69567sizeInqDBjuR0(@NotNull Modifier sizeIn, float f, float f2, float f3, float f4) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(sizeIn, "$this$sizeIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return sizeIn.then(new SizeElement(f, f2, f3, f4, true, noInspectorInfo, null));
    }

    /* renamed from: sizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m69568sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69567sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    @NotNull
    /* renamed from: width-3ABfNKs */
    public static final Modifier m69569width3ABfNKs(@NotNull Modifier width, float f) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(width, "$this$width");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return width.then(new SizeElement(f, 0.0f, f, 0.0f, true, noInspectorInfo, 10, null));
    }

    @Stable
    @NotNull
    /* renamed from: widthIn-VpY3zN4 */
    public static final Modifier m69570widthInVpY3zN4(@NotNull Modifier widthIn, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return widthIn.then(new SizeElement(f, 0.0f, f2, 0.0f, true, noInspectorInfo, 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m69571widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69570widthInVpY3zN4(modifier, f, f2);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentHeight(@NotNull Modifier modifier, @NotNull Alignment.Vertical align, boolean z) {
        WrapContentElement height;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (Intrinsics.areEqual(align, companion.getCenterVertically()) && !z) {
            height = f13260f;
        } else if (Intrinsics.areEqual(align, companion.getTop()) && !z) {
            height = f13261g;
        } else {
            height = WrapContentElement.f13336g.height(align, z);
        }
        return modifier.then(height);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentSize(@NotNull Modifier modifier, @NotNull Alignment align, boolean z) {
        WrapContentElement size;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (Intrinsics.areEqual(align, companion.getCenter()) && !z) {
            size = f13262h;
        } else if (Intrinsics.areEqual(align, companion.getTopStart()) && !z) {
            size = f13263i;
        } else {
            size = WrapContentElement.f13336g.size(align, z);
        }
        return modifier.then(size);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    @Stable
    @NotNull
    public static final Modifier wrapContentWidth(@NotNull Modifier modifier, @NotNull Alignment.Horizontal align, boolean z) {
        WrapContentElement width;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (Intrinsics.areEqual(align, companion.getCenterHorizontally()) && !z) {
            width = f13258d;
        } else if (Intrinsics.areEqual(align, companion.getStart()) && !z) {
            width = f13259e;
        } else {
            width = WrapContentElement.f13336g.width(align, z);
        }
        return modifier.then(width);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }
}
