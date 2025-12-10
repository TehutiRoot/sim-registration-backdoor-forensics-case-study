package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a[\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0095\u0001\u0010\u001e\u001a\u00020\t*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aU\u0010%\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\f\u001a\"\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a?\u0010(\u001a\u00020\t2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0002\b\n2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012¢\u0006\u0002\b\n2\u0006\u0010'\u001a\u00020!H\u0003¢\u0006\u0004\b(\u0010)\u001a)\u00100\u001a\u00020/*\u00020*2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a9\u00103\u001a\u00020/*\u00020*2\u0006\u00102\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010'\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020!058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00106\"\u0017\u00109\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u00108\"\u0017\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u00108\"\u0017\u0010<\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006=²\u0006\f\u0010$\u001a\u00020!8\nX\u008a\u0084\u0002"}, m29142d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigation", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "BottomNavigationItem", "activeColor", "inactiveColor", "", "Lkotlin/ParameterName;", "name", "animationProgress", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "iconPositionAnimationProgress", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "d", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "labelPlaceable", "e", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/animation/core/TweenSpec;", "BottomNavigationAnimationSpec", "F", "BottomNavigationHeight", OperatorName.CURVE_TO, "BottomNavigationItemHorizontalPadding", "CombinedItemTextBaseline", "material_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,399:1\n25#2:400\n456#2,8:424\n464#2,3:438\n467#2,3:442\n456#2,8:461\n464#2,3:475\n456#2,8:495\n464#2,3:509\n467#2,3:513\n456#2,8:535\n464#2,3:549\n467#2,3:553\n467#2,3:558\n1097#3,6:401\n76#4:407\n67#5,5:408\n72#5:441\n76#5:446\n66#5,6:478\n72#5:512\n76#5:517\n66#5,6:518\n72#5:552\n76#5:557\n78#6,11:413\n91#6:445\n75#6,14:447\n78#6,11:484\n91#6:516\n78#6,11:524\n91#6:556\n91#6:561\n4144#7,6:432\n4144#7,6:469\n4144#7,6:503\n4144#7,6:543\n81#8:562\n154#9:563\n154#9:564\n154#9:565\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n155#1:400\n170#1:424,8\n170#1:438,3\n170#1:442,3\n260#1:461,8\n260#1:475,3\n262#1:495,8\n262#1:509,3\n262#1:513,3\n264#1:535,8\n264#1:549,3\n264#1:553,3\n260#1:558,3\n155#1:401,6\n156#1:407\n170#1:408,5\n170#1:441\n170#1:446\n262#1:478,6\n262#1:512\n262#1:517\n264#1:518,6\n264#1:552\n264#1:557\n170#1:413,11\n170#1:445\n260#1:447,14\n262#1:484,11\n262#1:516\n264#1:524,11\n264#1:556\n260#1:561\n170#1:432,6\n260#1:469,6\n262#1:503,6\n264#1:543,6\n228#1:562\n387#1:563\n392#1:564\n398#1:565\n*E\n"})
/* loaded from: classes.dex */
public final class BottomNavigationKt {

    /* renamed from: a */
    public static final TweenSpec f14461a = new TweenSpec(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* renamed from: b */
    public static final float f14462b = C3623Dp.m73842constructorimpl(56);

    /* renamed from: c */
    public static final float f14463c;

    /* renamed from: d */
    public static final float f14464d;

    /* renamed from: androidx.compose.material.BottomNavigationKt$a */
    /* loaded from: classes.dex */
    public static final class C3058a implements MeasurePolicy {

        /* renamed from: a */
        public final /* synthetic */ Function2 f14465a;

        /* renamed from: b */
        public final /* synthetic */ float f14466b;

        public C3058a(Function2 function2, float f) {
            this.f14465a = function2;
            this.f14466b = f;
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return AbstractC23448zr0.m68a(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return AbstractC23448zr0.m67b(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo69380measure3p2s80s(MeasureScope Layout, List measurables, long j) {
            Placeable placeable;
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            List<Measurable> list = measurables;
            for (Measurable measurable : list) {
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                    Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(j);
                    if (this.f14465a != null) {
                        for (Measurable measurable2 : list) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "label")) {
                                placeable = measurable2.mo72995measureBRTryo0(Constraints.m73802copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable = null;
                    if (this.f14465a == null) {
                        return BottomNavigationKt.m60893d(Layout, mo72995measureBRTryo0, j);
                    }
                    Intrinsics.checkNotNull(placeable);
                    return BottomNavigationKt.m60892e(Layout, placeable, mo72995measureBRTryo0, j, this.f14466b);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return AbstractC23448zr0.m66c(this, intrinsicMeasureScope, list, i);
        }

        @Override // androidx.compose.p003ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return AbstractC23448zr0.m65d(this, intrinsicMeasureScope, list, i);
        }
    }

    static {
        float f = 12;
        f14463c = C3623Dp.m73842constructorimpl(f);
        f14464d = C3623Dp.m73842constructorimpl(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigation-PEIptTM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70108BottomNavigationPEIptTM(@org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r24, long r25, long r27, float r29, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomNavigationKt.m70108BottomNavigationPEIptTM(androidx.compose.ui.Modifier, long, long, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomNavigationItem-jY6E1Zs  reason: not valid java name */
    public static final void m70109BottomNavigationItemjY6E1Zs(@NotNull RowScope BottomNavigationItem, boolean z, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z2, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z3, @Nullable MutableInteractionSource mutableInteractionSource, long j, long j2, @Nullable Composer composer, int i, int i2, int i3) {
        int i4;
        Object obj;
        Object obj2;
        int i5;
        Object obj3;
        boolean z4;
        boolean z5;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        long j4;
        MutableInteractionSource mutableInteractionSource3;
        boolean z6;
        long j5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        boolean z7;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(BottomNavigationItem, "$this$BottomNavigationItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1473735525);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(BottomNavigationItem) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(icon) ? 2048 : 1024;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 24576;
            obj = modifier;
        } else {
            obj = modifier;
            if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(obj) ? 16384 : 8192;
            }
        }
        int i7 = 16 & i3;
        if (i7 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.f36619xf2722a21;
        } else if ((i & 458752) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
        }
        int i8 = 32 & i3;
        if (i8 != 0) {
            i4 |= 1572864;
            obj2 = function2;
        } else {
            obj2 = function2;
            if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changedInstance(obj2) ? 1048576 : 524288;
            }
        }
        int i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
        }
        int i10 = 128 & i3;
        if (i10 != 0) {
            i4 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        if ((i & 1879048192) == 0) {
            i4 |= ((i3 & 256) == 0 && startRestartGroup.changed(j)) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 14) == 0) {
            i5 = i2 | (((i3 & 512) == 0 && startRestartGroup.changed(j2)) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((1533916891 & i4) == 306783378 && (i5 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            z6 = z2;
            z7 = z3;
            mutableInteractionSource3 = mutableInteractionSource;
            j3 = j;
            modifier2 = obj;
            function22 = obj2;
            j5 = j2;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((256 & i3) != 0) {
                    i4 &= -1879048193;
                }
                if ((i3 & 512) != 0) {
                    i5 &= -15;
                }
                z4 = z2;
                z5 = z3;
                mutableInteractionSource2 = mutableInteractionSource;
                j3 = j;
                j4 = j2;
                obj3 = obj;
            } else {
                obj3 = i6 != 0 ? Modifier.Companion : obj;
                z4 = i7 != 0 ? true : z2;
                if (i8 != 0) {
                    obj2 = null;
                }
                z5 = i9 != 0 ? true : z3;
                if (i10 != 0) {
                    startRestartGroup.startReplaceableGroup(-492369756);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((256 & i3) != 0) {
                    j3 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m71929unboximpl();
                    i4 &= -1879048193;
                } else {
                    j3 = j;
                }
                if ((i3 & 512) != 0) {
                    j4 = Color.m71918copywmQWz5c$default(j3, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i5 &= -15;
                } else {
                    j4 = j2;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473735525, i4, i5, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
            }
            ComposableLambda composableLambda = obj2 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, 1343298261, true, new BottomNavigationKt$BottomNavigationItem$styledLabel$1$1(obj2, i4)) : null;
            Modifier m68554a = AbstractC17608Ez1.m68554a(BottomNavigationItem, SelectableKt.m69872selectableO2vRcR0(obj3, z, mutableInteractionSource2, RippleKt.m70364rememberRipple9IZ8Weo(false, 0.0f, j3, startRestartGroup, ((i4 >> 21) & 896) | 6, 2), z4, Role.m73247boximpl(Role.Companion.m73259getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            Alignment center = Alignment.Companion.getCenter();
            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
            startRestartGroup.startReplaceableGroup(733328855);
            boolean z8 = z4;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Modifier modifier3 = obj3;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m68554a);
            Function2<? super Composer, ? super Integer, Unit> function23 = obj2;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            m60895b(j3, j4, z, ComposableLambdaKt.composableLambda(startRestartGroup, -1411872801, true, new BottomNavigationKt$BottomNavigationItem$2$1(z5, icon, composableLambda, i4)), startRestartGroup, ((i5 << 3) & 112) | ((i4 >> 27) & 14) | 3072 | ((i4 << 3) & 896));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource3 = mutableInteractionSource4;
            z6 = z8;
            j5 = j4;
            function22 = function23;
            z7 = z5;
            modifier2 = modifier3;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationItem$3(BottomNavigationItem, z, onClick, icon, modifier2, z6, function22, z7, mutableInteractionSource3, j3, j5, i, i2, i3));
    }

    /* renamed from: a */
    public static final void m60896a(Function2 function2, Function2 function22, float f, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1162995092);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(function22)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(f)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162995092, i2, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:253)");
            }
            C3058a c3058a = new C3058a(function22, f);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, c3058a, companion2.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m71577constructorimpl.getInserting() || !Intrinsics.areEqual(m71577constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m71577constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m71577constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(layoutId);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl2 = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m71577constructorimpl2.getInserting() || !Intrinsics.areEqual(m71577constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m71577constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m71577constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1198312436);
            if (function22 != null) {
                Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f), f14463c, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m69715paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m71577constructorimpl3 = Updater.m71577constructorimpl(startRestartGroup);
                Updater.m71584setimpl(m71577constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (m71577constructorimpl3.getInserting() || !Intrinsics.areEqual(m71577constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m71577constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m71577constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
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
            endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationItemBaselineLayout$3(function2, function22, f, i));
        }
    }

    /* renamed from: b */
    public static final void m60895b(long j, long j2, boolean z, Function3 function3, Composer composer, int i) {
        int i2;
        float f;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-985175058);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(j)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(j2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(z)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changedInstance(function3)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985175058, i7, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:221)");
            }
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            composer2 = startRestartGroup;
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, f14461a, 0.0f, null, null, startRestartGroup, 48, 28);
            long m71969lerpjxsXWHM = ColorKt.m71969lerpjxsXWHM(j2, j, m60894c(animateFloatAsState));
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(Color.m71918copywmQWz5c$default(m71969lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m71921getAlphaimpl(m71969lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -138092754, true, new BottomNavigationKt$BottomNavigationTransition$1(function3, i7, animateFloatAsState)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomNavigationKt$BottomNavigationTransition$2(j, j2, z, function3, i));
        }
    }

    /* renamed from: c */
    public static final float m60894c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* renamed from: d */
    public static final MeasureResult m60893d(MeasureScope measureScope, Placeable placeable, long j) {
        int m73809getMaxHeightimpl = Constraints.m73809getMaxHeightimpl(j);
        return MeasureScope.CC.m59482q(measureScope, placeable.getWidth(), m73809getMaxHeightimpl, null, new BottomNavigationKt$placeIcon$1(placeable, (m73809getMaxHeightimpl - placeable.getHeight()) / 2), 4, null);
    }

    /* renamed from: e */
    public static final MeasureResult m60892e(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j, float f) {
        int m73809getMaxHeightimpl = Constraints.m73809getMaxHeightimpl(j);
        int mo69616roundToPx0680j_4 = measureScope.mo69616roundToPx0680j_4(f14464d) - placeable.get(AlignmentLineKt.getFirstBaseline());
        int coerceAtLeast = AbstractC11695c.coerceAtLeast((m73809getMaxHeightimpl - ((placeable2.getHeight() + placeable.getHeight()) + mo69616roundToPx0680j_4)) / 2, 0);
        int height = placeable2.getHeight() + coerceAtLeast + mo69616roundToPx0680j_4;
        int max = Math.max(placeable.getWidth(), placeable2.getWidth());
        return MeasureScope.CC.m59482q(measureScope, max, m73809getMaxHeightimpl, null, new BottomNavigationKt$placeLabelAndIcon$1(f, placeable, (max - placeable.getWidth()) / 2, height, AbstractC22237sr0.roundToInt((((m73809getMaxHeightimpl - placeable2.getHeight()) / 2) - coerceAtLeast) * (1 - f)), placeable2, (max - placeable2.getWidth()) / 2, coerceAtLeast), 4, null);
    }
}