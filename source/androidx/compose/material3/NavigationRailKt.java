package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a}\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0081\u0001\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001am\u0010#\u001a\u00020\u00072\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\b2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013¢\u0006\u0002\b\b2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$\u001a;\u0010-\u001a\u00020,*\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001aS\u00100\u001a\u00020,*\u00020%2\u0006\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\"\u001d\u00107\u001a\u0002028\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0017\u00108\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u00104\"\u001d\u0010:\u001a\u0002028\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b-\u00104\u001a\u0004\b9\u00106\"\u001d\u0010<\u001a\u0002028\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b;\u00106\"\u001d\u0010?\u001a\u0002028\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106\"\u0017\u0010A\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u00104\"\u0017\u0010C\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u00104\"\u0017\u0010E\u001a\u0002028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006F"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "header", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "content", "NavigationRail-qi6gXK8", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationRail", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationRailItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationRailItem", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "indicatorRipple", "indicator", "", "animationProgress", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", OperatorName.CURVE_TO, "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "labelPlaceable", "d", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getNavigationRailVerticalPadding", "()F", "NavigationRailVerticalPadding", "NavigationRailHeaderPadding", "getNavigationRailItemWidth", "NavigationRailItemWidth", "getNavigationRailItemHeight", "NavigationRailItemHeight", "e", "getNavigationRailItemVerticalPadding", "NavigationRailItemVerticalPadding", OperatorName.FILL_NON_ZERO, "IndicatorHorizontalPadding", OperatorName.NON_STROKING_GRAY, "IndicatorVerticalPaddingWithLabel", OperatorName.CLOSE_PATH, "IndicatorVerticalPaddingNoLabel", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,668:1\n25#2:669\n460#2,13:694\n50#2:709\n49#2:710\n473#2,3:717\n456#2,11:738\n460#2,13:768\n473#2,3:782\n460#2,13:806\n473#2,3:820\n467#2,3:825\n1114#3,6:670\n1114#3,6:711\n68#4,5:676\n73#4:707\n77#4:721\n67#4,6:749\n73#4:781\n77#4:786\n67#4,6:787\n73#4:819\n77#4:824\n75#5:681\n76#5,11:683\n89#5:720\n71#5,4:722\n75#5,11:727\n75#5:755\n76#5,11:757\n89#5:785\n75#5:793\n76#5,11:795\n89#5:823\n88#5:828\n76#6:682\n76#6:708\n76#6:726\n76#6:756\n76#6:794\n76#7:829\n154#8:830\n154#8:831\n154#8:832\n58#9:833\n75#9:834\n58#9:835\n75#9:836\n58#9:837\n75#9:838\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n170#1:669\n191#1:694,13\n219#1:709\n219#1:710\n191#1:717,3\n435#1:738,11\n441#1:768,13\n441#1:782,3\n444#1:806,13\n444#1:820,3\n435#1:825,3\n170#1:670,6\n219#1:711,6\n191#1:676,5\n191#1:707\n191#1:721\n441#1:749,6\n441#1:781\n441#1:786\n444#1:787,6\n444#1:819\n444#1:824\n191#1:681\n191#1:683,11\n191#1:720\n435#1:722,4\n435#1:727,11\n441#1:755\n441#1:757,11\n441#1:785\n444#1:793\n444#1:795,11\n444#1:823\n435#1:828\n191#1:682\n214#1:708\n435#1:726\n441#1:756\n444#1:794\n205#1:829\n639#1:830\n645#1:831\n659#1:832\n662#1:833\n662#1:834\n665#1:835\n665#1:836\n668#1:837\n668#1:838\n*E\n"})
/* loaded from: classes2.dex */
public final class NavigationRailKt {

    /* renamed from: a */
    public static final float f25922a;

    /* renamed from: b */
    public static final float f25923b = C3641Dp.m73658constructorimpl(8);

    /* renamed from: c */
    public static final float f25924c;

    /* renamed from: d */
    public static final float f25925d;

    /* renamed from: e */
    public static final float f25926e;

    /* renamed from: f */
    public static final float f25927f;

    /* renamed from: g */
    public static final float f25928g;

    /* renamed from: h */
    public static final float f25929h;

    /* renamed from: androidx.compose.material3.NavigationRailKt$a */
    /* loaded from: classes2.dex */
    public static final class C3342a implements MeasurePolicy {

        /* renamed from: a */
        public final /* synthetic */ float f25930a;

        /* renamed from: b */
        public final /* synthetic */ Function2 f25931b;

        /* renamed from: c */
        public final /* synthetic */ boolean f25932c;

        public C3342a(float f, Function2 function2, boolean z) {
            this.f25930a = f;
            this.f25931b = function2;
            this.f25932c = z;
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return AbstractC22344tr0.m1366a(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return AbstractC22344tr0.m1365b(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo69194measure3p2s80s(MeasureScope Layout, List measurables, long j) {
            Object obj;
            Placeable placeable;
            Placeable placeable2;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            List<Measurable> list = measurables;
            for (Measurable measurable : list) {
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                    Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
                    float f = 2;
                    int width = mo72811measureBRTryo0.getWidth() + Layout.mo69432roundToPx0680j_4(C3641Dp.m73658constructorimpl(NavigationRailKt.f25927f * f));
                    int roundToInt = AbstractC21140mr0.roundToInt(width * this.f25930a);
                    int height = mo72811measureBRTryo0.getHeight() + Layout.mo69432roundToPx0680j_4(C3641Dp.m73658constructorimpl((this.f25931b == null ? NavigationRailKt.f25929h : NavigationRailKt.f25928g) * f));
                    for (Measurable measurable2 : list) {
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "indicatorRipple")) {
                            Placeable mo72811measureBRTryo02 = measurable2.mo72811measureBRTryo0(Constraints.Companion.m73634fixedJhjzzOo(width, height));
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "indicator")) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            Measurable measurable3 = (Measurable) obj;
                            if (measurable3 != null) {
                                placeable = measurable3.mo72811measureBRTryo0(Constraints.Companion.m73634fixedJhjzzOo(roundToInt, height));
                            } else {
                                placeable = null;
                            }
                            if (this.f25931b != null) {
                                for (Measurable measurable4 : list) {
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                        placeable2 = measurable4.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            placeable2 = null;
                            if (this.f25931b == null) {
                                return NavigationRailKt.m60599c(Layout, mo72811measureBRTryo0, mo72811measureBRTryo02, placeable, j);
                            }
                            Intrinsics.checkNotNull(placeable2);
                            return NavigationRailKt.m60598d(Layout, placeable2, mo72811measureBRTryo0, mo72811measureBRTryo02, placeable, j, this.f25932c, this.f25930a);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return AbstractC22344tr0.m1364c(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return AbstractC22344tr0.m1363d(this, intrinsicMeasureScope, list, i);
        }
    }

    static {
        float f = 4;
        f25922a = C3641Dp.m73658constructorimpl(f);
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
        f25924c = navigationRailTokens.m71117getContainerWidthD9Ej5fM();
        f25925d = navigationRailTokens.m71120getNoLabelActiveIndicatorHeightD9Ej5fM();
        f25926e = C3641Dp.m73658constructorimpl(f);
        float f2 = 2;
        f25927f = C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(navigationRailTokens.m71115getActiveIndicatorWidthD9Ej5fM() - navigationRailTokens.m71118getIconSizeD9Ej5fM()) / f2);
        f25928g = C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(navigationRailTokens.m71114getActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m71118getIconSizeD9Ej5fM()) / f2);
        f25929h = C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(navigationRailTokens.m71120getNoLabelActiveIndicatorHeightD9Ej5fM() - navigationRailTokens.m71118getIconSizeD9Ej5fM()) / f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationRail-qi6gXK8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70481NavigationRailqi6gXK8(@org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r25, long r26, long r28, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r31, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.m70481NavigationRailqi6gXK8(androidx.compose.ui.Modifier, long, long, kotlin.jvm.functions.Function3, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavigationRailItem(boolean r36, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r37, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r39, boolean r40, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, boolean r42, @org.jetbrains.annotations.Nullable androidx.compose.material3.NavigationRailItemColors r43, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r44, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationRailKt.NavigationRailItem(boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.NavigationRailItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final float m60601a(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: b */
    public static final void m60600b(Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z, float f, Composer composer, int i) {
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-876426901);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(function22)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function23)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changedInstance(function24)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changed(z)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(f)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-876426901, i2, -1, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:426)");
            }
            C3342a c3342a = new C3342a(f, function24, z);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71393constructorimpl = Updater.m71393constructorimpl(startRestartGroup);
            Updater.m71400setimpl(m71393constructorimpl, c3342a, companion2.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, density, companion2.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.startReplaceableGroup(935757179);
            if (f > 0.0f) {
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71393constructorimpl2 = Updater.m71393constructorimpl(startRestartGroup);
            Updater.m71400setimpl(m71393constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl2, density2, companion2.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function23.invoke(startRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-853550242);
            if (function24 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, "label");
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = f;
                }
                Modifier alpha = AlphaKt.alpha(layoutId2, f2);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(alpha);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71393constructorimpl3 = Updater.m71393constructorimpl(startRestartGroup);
                Updater.m71400setimpl(m71393constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl3, density3, companion2.getSetDensity());
                Updater.m71400setimpl(m71393constructorimpl3, layoutDirection3, companion2.getSetLayoutDirection());
                Updater.m71400setimpl(m71393constructorimpl3, viewConfiguration3, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                function24.invoke(startRestartGroup, Integer.valueOf((i2 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new NavigationRailKt$NavigationRailItemBaselineLayout$3(function2, function22, function23, function24, z, f, i));
        }
    }

    /* renamed from: c */
    public static final MeasureResult m60599c(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int i;
        int width = placeable.getWidth();
        int width2 = placeable2.getWidth();
        if (placeable3 != null) {
            i = placeable3.getWidth();
        } else {
            i = 0;
        }
        int m73640constrainWidthK40F9xA = ConstraintsKt.m73640constrainWidthK40F9xA(j, Math.max(width, Math.max(width2, i)));
        int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        return MeasureScope.CC.m59532q(measureScope, m73640constrainWidthK40F9xA, m73625getMaxHeightimpl, null, new NavigationRailKt$placeIcon$1(placeable3, placeable, (m73640constrainWidthK40F9xA - placeable.getWidth()) / 2, (m73625getMaxHeightimpl - placeable.getHeight()) / 2, placeable2, (m73640constrainWidthK40F9xA - placeable2.getWidth()) / 2, (m73625getMaxHeightimpl - placeable2.getHeight()) / 2, m73640constrainWidthK40F9xA, m73625getMaxHeightimpl), 4, null);
    }

    /* renamed from: d */
    public static final MeasureResult m60598d(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        int height;
        int i;
        int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        float f2 = f25926e;
        int height2 = (m73625getMaxHeightimpl - placeable.getHeight()) - measureScope.mo69432roundToPx0680j_4(f2);
        int mo69432roundToPx0680j_4 = measureScope.mo69432roundToPx0680j_4(f2);
        if (z) {
            height = mo69432roundToPx0680j_4;
        } else {
            height = (m73625getMaxHeightimpl - placeable2.getHeight()) / 2;
        }
        int roundToInt = AbstractC21140mr0.roundToInt((height - mo69432roundToPx0680j_4) * (1 - f));
        int width = placeable2.getWidth();
        int width2 = placeable.getWidth();
        if (placeable4 != null) {
            i = placeable4.getWidth();
        } else {
            i = 0;
        }
        int m73640constrainWidthK40F9xA = ConstraintsKt.m73640constrainWidthK40F9xA(j, Math.max(width, Math.max(width2, i)));
        return MeasureScope.CC.m59532q(measureScope, m73640constrainWidthK40F9xA, m73625getMaxHeightimpl, null, new NavigationRailKt$placeLabelAndIcon$1(placeable4, z, f, placeable, (m73640constrainWidthK40F9xA - placeable.getWidth()) / 2, height2, roundToInt, placeable2, (m73640constrainWidthK40F9xA - placeable2.getWidth()) / 2, mo69432roundToPx0680j_4, placeable3, (m73640constrainWidthK40F9xA - placeable3.getWidth()) / 2, mo69432roundToPx0680j_4 - measureScope.mo69432roundToPx0680j_4(f25928g), m73640constrainWidthK40F9xA, measureScope), 4, null);
    }

    public static final float getNavigationRailItemHeight() {
        return f25925d;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return f25926e;
    }

    public static final float getNavigationRailItemWidth() {
        return f25924c;
    }

    public static final float getNavigationRailVerticalPadding() {
        return f25922a;
    }
}
