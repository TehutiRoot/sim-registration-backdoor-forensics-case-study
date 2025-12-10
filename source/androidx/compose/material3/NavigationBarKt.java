package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
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
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
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

@Metadata(m28851d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u001ae\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010$\u001a\u00020\u000b2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\b\f2\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014¢\u0006\u0002\b\f2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%\u001a;\u0010.\u001a\u00020-*\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001aS\u00101\u001a\u00020-*\u00020&2\u0006\u00100\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u0017\u00105\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u00104\"\u001d\u00109\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u00108\"\u001d\u0010<\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u00108\"\u0017\u0010=\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u00104\"\u0017\u0010>\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b.\u00104\"\u0017\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "NavigationBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "NavigationBar", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationBarItem", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "indicatorRipple", "indicator", "", "animationProgress", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "e", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "labelPlaceable", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "NavigationBarHeight", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getNavigationBarItemHorizontalPadding", "()F", "NavigationBarItemHorizontalPadding", OperatorName.CURVE_TO, "getNavigationBarItemVerticalPadding", "NavigationBarItemVerticalPadding", "IndicatorHorizontalPadding", "IndicatorVerticalPadding", "IndicatorVerticalOffset", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,637:1\n25#2:638\n25#2:645\n36#2:652\n460#2,13:677\n50#2:692\n49#2:693\n473#2,3:700\n456#2,11:721\n460#2,13:751\n473#2,3:765\n460#2,13:790\n473#2,3:804\n467#2,3:809\n1114#3,6:639\n1114#3,6:646\n1114#3,6:653\n1114#3,6:694\n68#4,5:659\n73#4:690\n77#4:704\n67#4,6:732\n73#4:764\n77#4:769\n67#4,6:771\n73#4:803\n77#4:808\n75#5:664\n76#5,11:666\n89#5:703\n71#5,4:705\n75#5,11:710\n75#5:738\n76#5,11:740\n89#5:768\n75#5:777\n76#5,11:779\n89#5:807\n88#5:812\n76#6:665\n76#6:691\n76#6:709\n76#6:739\n76#6:778\n75#7:770\n58#7:819\n75#7:820\n58#7:821\n75#7:822\n76#8:813\n102#8,2:814\n76#8:816\n154#9:817\n154#9:818\n154#9:823\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n169#1:638\n190#1:645\n203#1:652\n192#1:677,13\n224#1:692\n224#1:693\n192#1:700,3\n435#1:721,11\n441#1:751,13\n441#1:765,3\n444#1:790,13\n444#1:804,3\n435#1:809,3\n169#1:639,6\n190#1:646,6\n203#1:653,6\n224#1:694,6\n192#1:659,5\n192#1:690\n192#1:704\n441#1:732,6\n441#1:764\n441#1:769\n444#1:771,6\n444#1:803\n444#1:808\n192#1:664\n192#1:666,11\n192#1:703\n435#1:705,4\n435#1:710,11\n441#1:738\n441#1:740,11\n441#1:768\n444#1:777\n444#1:779,11\n444#1:807\n435#1:812\n192#1:665\n217#1:691\n435#1:709\n441#1:739\n444#1:778\n448#1:770\n632#1:819\n632#1:820\n635#1:821\n635#1:822\n190#1:813\n190#1:814,2\n208#1:816\n626#1:817\n629#1:818\n637#1:823\n*E\n"})
/* loaded from: classes2.dex */
public final class NavigationBarKt {

    /* renamed from: a */
    public static final float f25901a;

    /* renamed from: b */
    public static final float f25902b;

    /* renamed from: c */
    public static final float f25903c;

    /* renamed from: d */
    public static final float f25904d;

    /* renamed from: e */
    public static final float f25905e;

    /* renamed from: f */
    public static final float f25906f;

    /* renamed from: androidx.compose.material3.NavigationBarKt$a */
    /* loaded from: classes2.dex */
    public static final class C3332a implements MeasurePolicy {

        /* renamed from: a */
        public final /* synthetic */ float f25907a;

        /* renamed from: b */
        public final /* synthetic */ Function2 f25908b;

        /* renamed from: c */
        public final /* synthetic */ boolean f25909c;

        public C3332a(float f, Function2 function2, boolean z) {
            this.f25907a = f;
            this.f25908b = function2;
            this.f25909c = z;
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
                    int width = mo72811measureBRTryo0.getWidth() + Layout.mo69432roundToPx0680j_4(C3641Dp.m73658constructorimpl(NavigationBarKt.f25904d * f));
                    int roundToInt = AbstractC21140mr0.roundToInt(width * this.f25907a);
                    int height = mo72811measureBRTryo0.getHeight() + Layout.mo69432roundToPx0680j_4(C3641Dp.m73658constructorimpl(NavigationBarKt.f25905e * f));
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
                            if (this.f25908b != null) {
                                for (Measurable measurable4 : list) {
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "label")) {
                                        placeable2 = measurable4.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            placeable2 = null;
                            if (this.f25908b == null) {
                                return NavigationBarKt.m60606e(Layout, mo72811measureBRTryo0, mo72811measureBRTryo02, placeable, j);
                            }
                            Intrinsics.checkNotNull(placeable2);
                            return NavigationBarKt.m60605f(Layout, placeable2, mo72811measureBRTryo0, mo72811measureBRTryo02, placeable, j, this.f25909c, this.f25907a);
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
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
        f25901a = navigationBarTokens.m71106getContainerHeightD9Ej5fM();
        f25902b = C3641Dp.m73658constructorimpl(8);
        f25903c = C3641Dp.m73658constructorimpl(16);
        float f = 2;
        f25904d = C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(navigationBarTokens.m71104getActiveIndicatorWidthD9Ej5fM() - navigationBarTokens.m71107getIconSizeD9Ej5fM()) / f);
        f25905e = C3641Dp.m73658constructorimpl(C3641Dp.m73658constructorimpl(navigationBarTokens.m71103getActiveIndicatorHeightD9Ej5fM() - navigationBarTokens.m71107getIconSizeD9Ej5fM()) / f);
        f25906f = C3641Dp.m73658constructorimpl(12);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: NavigationBar-HsRjFd4  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70466NavigationBarHsRjFd4(@org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r25, long r26, long r28, float r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r31, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.m70466NavigationBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0133  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NavigationBarItem(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.RowScope r36, boolean r37, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r38, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r39, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r40, boolean r41, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, boolean r43, @org.jetbrains.annotations.Nullable androidx.compose.material3.NavigationBarItemColors r44, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r45, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationBarKt.NavigationBarItem(androidx.compose.foundation.layout.RowScope, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.NavigationBarItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final int m60610a(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* renamed from: b */
    public static final void m60609b(MutableState mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* renamed from: c */
    public static final float m60608c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: d */
    public static final void m60607d(Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z, float f, Composer composer, int i) {
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(591111291);
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
                ComposerKt.traceEventStart(591111291, i2, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:426)");
            }
            C3332a c3332a = new C3332a(f, function24, z);
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
            Updater.m71400setimpl(m71393constructorimpl, c3332a, companion2.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, density, companion2.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.startReplaceableGroup(-311734399);
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
            startRestartGroup.startReplaceableGroup(1204551908);
            if (function24 != null) {
                Modifier layoutId2 = LayoutIdKt.layoutId(companion, "label");
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = f;
                }
                Modifier m69531paddingVpY3zN4$default = PaddingKt.m69531paddingVpY3zN4$default(AlphaKt.alpha(layoutId2, f2), C3641Dp.m73658constructorimpl(f25902b / 2), 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m69531paddingVpY3zN4$default);
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
            endRestartGroup.updateScope(new NavigationBarKt$NavigationBarItemBaselineLayout$3(function2, function22, function23, function24, z, f, i));
        }
    }

    /* renamed from: e */
    public static final MeasureResult m60606e(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j) {
        int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        return MeasureScope.CC.m59532q(measureScope, m73626getMaxWidthimpl, m73625getMaxHeightimpl, null, new NavigationBarKt$placeIcon$1(placeable3, placeable, (m73626getMaxWidthimpl - placeable.getWidth()) / 2, (m73625getMaxHeightimpl - placeable.getHeight()) / 2, placeable2, (m73626getMaxWidthimpl - placeable2.getWidth()) / 2, (m73625getMaxHeightimpl - placeable2.getHeight()) / 2, m73626getMaxWidthimpl, m73625getMaxHeightimpl), 4, null);
    }

    /* renamed from: f */
    public static final MeasureResult m60605f(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j, boolean z, float f) {
        int height;
        int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        float f2 = f25903c;
        int height2 = (m73625getMaxHeightimpl - placeable.getHeight()) - measureScope.mo69432roundToPx0680j_4(f2);
        int mo69432roundToPx0680j_4 = measureScope.mo69432roundToPx0680j_4(f2);
        if (z) {
            height = mo69432roundToPx0680j_4;
        } else {
            height = (m73625getMaxHeightimpl - placeable2.getHeight()) / 2;
        }
        int roundToInt = AbstractC21140mr0.roundToInt((height - mo69432roundToPx0680j_4) * (1 - f));
        int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        return MeasureScope.CC.m59532q(measureScope, m73626getMaxWidthimpl, m73625getMaxHeightimpl, null, new NavigationBarKt$placeLabelAndIcon$1(placeable4, z, f, placeable, (m73626getMaxWidthimpl - placeable.getWidth()) / 2, height2, roundToInt, placeable2, (m73626getMaxWidthimpl - placeable2.getWidth()) / 2, mo69432roundToPx0680j_4, placeable3, (m73626getMaxWidthimpl - placeable3.getWidth()) / 2, mo69432roundToPx0680j_4 - measureScope.mo69432roundToPx0680j_4(f25905e), m73626getMaxWidthimpl, measureScope), 4, null);
    }

    public static final float getNavigationBarItemHorizontalPadding() {
        return f25902b;
    }

    public static final float getNavigationBarItemVerticalPadding() {
        return f25903c;
    }
}
