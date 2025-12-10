package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u008d\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J)\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J,\u0010)\u001a\u00020!2\u0006\u0010%\u001a\u00020$2\u0013\b\u0002\u0010(\u001a\r\u0012\u0004\u0012\u00020!0&¢\u0006\u0002\b'H\u0007¢\u0006\u0004\b)\u0010*J%\u00101\u001a\u00020.2\u0006\u0010+\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100R \u00106\u001a\u00020,8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00109\u001a\u00020,8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0018\u0010C\u001a\u00020\u0004*\u00020@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010\u001e\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006F"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonDefaults;", "", "<init>", "()V", "Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "colors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "start", "(Landroidx/compose/foundation/shape/CornerBasedShape;)Landroidx/compose/ui/graphics/Shape;", "end", "", FirebaseAnalytics.Param.INDEX, "count", "baseShape", "itemShape", "(IILandroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/Shape;", "", "ActiveIcon", "(Landroidx/compose/runtime/Composer;I)V", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "activeContent", "Icon", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/foundation/BorderStroke;", "borderStroke-l07J4OM", "(JF)Landroidx/compose/foundation/BorderStroke;", "borderStroke", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getBorderWidth-D9Ej5fM", "()F", "BorderWidth", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/foundation/layout/PaddingValues;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/material3/ColorScheme;", "getDefaultSegmentedButtonColors$app_prodRelease", "(Landroidx/compose/material3/ColorScheme;)Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "defaultSegmentedButtonColors", "getBaseShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/CornerBasedShape;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneSegmentedButtonRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,643:1\n1#2:644\n154#3:645\n154#3:646\n154#3:647\n154#3:648\n*S KotlinDebug\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonDefaults\n*L\n371#1:645\n374#1:646\n377#1:647\n381#1:648\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults */
/* loaded from: classes7.dex */
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final SegmentedButtonDefaults INSTANCE = new SegmentedButtonDefaults();

    /* renamed from: a */
    public static final float f82903a = C3641Dp.m73658constructorimpl(1);

    /* renamed from: b */
    public static final float f82904b;

    /* renamed from: c */
    public static final PaddingValues f82905c;

    static {
        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
        f82904b = buttonDefaults.m70216getIconSizeD9Ej5fM();
        f82905c = buttonDefaults.getTextButtonContentPadding();
    }

    /* renamed from: borderStroke-l07J4OM$default */
    public static /* synthetic */ BorderStroke m74967borderStrokel07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults, long j, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = f82903a;
        }
        return segmentedButtonDefaults.m74968borderStrokel07J4OM(j, f);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ActiveIcon(@Nullable Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2146799789);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2146799789, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults.ActiveIcon (OneSegmentedButtonRow.kt:413)");
            }
            IconKt.m70427Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, SizeKt.m69564size3ABfNKs(Modifier.Companion, f82904b), 0L, startRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SegmentedButtonDefaults$ActiveIcon$1(this, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Icon(boolean r20, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = -1376927099(0xffffffffadedc285, float:-2.7030165E-11)
            r1 = r22
            androidx.compose.runtime.Composer r10 = r1.startRestartGroup(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L12
            r1 = r23 | 6
            r11 = r20
            goto L26
        L12:
            r1 = r23 & 14
            r11 = r20
            if (r1 != 0) goto L24
            boolean r1 = r10.changed(r11)
            if (r1 == 0) goto L20
            r1 = 4
            goto L21
        L20:
            r1 = 2
        L21:
            r1 = r23 | r1
            goto L26
        L24:
            r1 = r23
        L26:
            r2 = r24 & 2
            if (r2 == 0) goto L2f
            r1 = r1 | 48
        L2c:
            r3 = r21
            goto L41
        L2f:
            r3 = r23 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2c
            r3 = r21
            boolean r4 = r10.changedInstance(r3)
            if (r4 == 0) goto L3e
            r4 = 32
            goto L40
        L3e:
            r4 = 16
        L40:
            r1 = r1 | r4
        L41:
            r4 = r1 & 91
            r5 = 18
            if (r4 != r5) goto L52
            boolean r4 = r10.getSkipping()
            if (r4 != 0) goto L4e
            goto L52
        L4e:
            r10.skipToGroupEnd()
            goto Lb1
        L52:
            if (r2 == 0) goto L5c
            th.co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneSegmentedButtonRowKt r2 = th.p047co.dtac.android.dtacone.app_one.widget.composable.ComposableSingletons$OneSegmentedButtonRowKt.INSTANCE
            kotlin.jvm.functions.Function2 r2 = r2.m74943getLambda1$app_prodRelease()
            r12 = r2
            goto L5d
        L5c:
            r12 = r3
        L5d:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L69
            r2 = -1
            java.lang.String r3 = "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults.Icon (OneSegmentedButtonRow.kt:430)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L69:
            androidx.compose.animation.ExitTransition$Companion r0 = androidx.compose.animation.ExitTransition.Companion
            androidx.compose.animation.ExitTransition r4 = r0.getNone()
            r0 = 3
            r2 = 0
            r3 = 0
            androidx.compose.animation.EnterTransition r0 = androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(r2, r3, r0, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            long r15 = androidx.compose.p003ui.graphics.TransformOriginKt.TransformOrigin(r3, r2)
            r17 = 1
            r18 = 0
            r13 = 0
            r14 = 0
            androidx.compose.animation.EnterTransition r2 = androidx.compose.animation.EnterExitTransitionKt.m69219scaleInL8ZKhE$default(r13, r14, r15, r17, r18)
            androidx.compose.animation.EnterTransition r3 = r0.plus(r2)
            th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults$Icon$1 r0 = new th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults$Icon$1
            r0.<init>(r12, r1)
            r2 = 1090715309(0x4102fead, float:8.187177)
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r2, r5, r0)
            r0 = 196608(0x30000, float:2.75506E-40)
            r1 = r1 & 14
            r8 = r1 | r0
            r9 = 18
            r2 = 0
            r5 = 0
            r1 = r20
            r7 = r10
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lb0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lb0:
            r3 = r12
        Lb1:
            androidx.compose.runtime.ScopeUpdateScope r6 = r10.endRestartGroup()
            if (r6 != 0) goto Lb8
            goto Lc9
        Lb8:
            th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults$Icon$2 r7 = new th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults$Icon$2
            r0 = r7
            r1 = r19
            r2 = r20
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateScope(r7)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults.Icon(boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    @NotNull
    /* renamed from: borderStroke-l07J4OM */
    public final BorderStroke m74968borderStrokel07J4OM(long j, float f) {
        return BorderStrokeKt.m69339BorderStrokecXLIe8U(f, j);
    }

    @Composable
    @NotNull
    public final SegmentedButtonColors colors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1470472458);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470472458, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults.colors (OneSegmentedButtonRow.kt:292)");
        }
        SegmentedButtonColors defaultSegmentedButtonColors$app_prodRelease = getDefaultSegmentedButtonColors$app_prodRelease(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSegmentedButtonColors$app_prodRelease;
    }

    @Composable
    @NotNull
    /* renamed from: colors-XqyqHi0 */
    public final SegmentedButtonColors m74969colorsXqyqHi0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, @Nullable Composer composer, int i, int i2, int i3) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        composer.startReplaceableGroup(-1738682530);
        if ((i3 & 1) != 0) {
            j13 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j13 = j;
        }
        if ((i3 & 2) != 0) {
            j14 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j14 = j2;
        }
        if ((i3 & 4) != 0) {
            j15 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j15 = j3;
        }
        if ((i3 & 8) != 0) {
            j16 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j16 = j4;
        }
        if ((i3 & 16) != 0) {
            j17 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i3 & 32) != 0) {
            j18 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i3 & 64) != 0) {
            j19 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j19 = j7;
        }
        if ((i3 & 128) != 0) {
            j20 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j20 = j8;
        }
        if ((i3 & 256) != 0) {
            j21 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i3 & 512) != 0) {
            j22 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i3 & 1024) != 0) {
            j23 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i3 & 2048) != 0) {
            j24 = Color.Companion.m71771getUnspecified0d7_KjU();
        } else {
            j24 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1738682530, i, i2, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults.colors (OneSegmentedButtonRow.kt:314)");
        }
        SegmentedButtonColors m74954copy2qZNXz8 = getDefaultSegmentedButtonColors$app_prodRelease(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable)).m74954copy2qZNXz8(j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m74954copy2qZNXz8;
    }

    @NotNull
    public final Shape end(@NotNull CornerBasedShape cornerBasedShape) {
        Intrinsics.checkNotNullParameter(cornerBasedShape, "<this>");
        float f = 0;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m69707CornerSize0680j_4(C3641Dp.m73658constructorimpl(f)), null, null, CornerSizeKt.m69707CornerSize0680j_4(C3641Dp.m73658constructorimpl(f)), 6, null);
    }

    @JvmName(name = "getBaseShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final CornerBasedShape getBaseShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1608017374, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults.<get-baseShape> (OneSegmentedButtonRow.kt:370)");
        }
        RoundedCornerShape m69711RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(4));
        Intrinsics.checkNotNull(m69711RoundedCornerShape0680j_4, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m69711RoundedCornerShape0680j_4;
    }

    /* renamed from: getBorderWidth-D9Ej5fM */
    public final float m74970getBorderWidthD9Ej5fM() {
        return f82903a;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return f82905c;
    }

    @NotNull
    public final SegmentedButtonColors getDefaultSegmentedButtonColors$app_prodRelease(@NotNull ColorScheme colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        SegmentedButtonColors defaultSegmentedButtonColorsCached = OneSegmentedButtonRowKt.getDefaultSegmentedButtonColorsCached();
        if (defaultSegmentedButtonColorsCached == null) {
            long Color = ColorKt.Color(4285726728L);
            Color.Companion companion = Color.Companion;
            SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(Color, companion.m71770getTransparent0d7_KjU(), ColorKt.Color(4285726728L), companion.m71770getTransparent0d7_KjU(), ColorKt.Color(4285726728L), ColorKt.Color(4285726728L), companion.m71770getTransparent0d7_KjU(), Color.m71734copywmQWz5c$default(ColorKt.Color(4285726728L), 0.48f, 0.0f, 0.0f, 0.0f, 14, null), Color.m71734copywmQWz5c$default(ColorKt.Color(4285726728L), 0.48f, 0.0f, 0.0f, 0.0f, 14, null), companion.m71770getTransparent0d7_KjU(), companion.m71767getLightGray0d7_KjU(), companion.m71767getLightGray0d7_KjU(), null);
            OneSegmentedButtonRowKt.setDefaultSegmentedButtonColorsCached(segmentedButtonColors);
            return segmentedButtonColors;
        }
        return defaultSegmentedButtonColorsCached;
    }

    /* renamed from: getIconSize-D9Ej5fM */
    public final float m74971getIconSizeD9Ej5fM() {
        return f82904b;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public final Shape itemShape(int i, int i2, @Nullable CornerBasedShape cornerBasedShape, @Nullable Composer composer, int i3, int i4) {
        Shape rectangleShape;
        if ((i4 & 4) != 0) {
            cornerBasedShape = getBaseShape(composer, (i3 >> 9) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2074759710, i3, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults.itemShape (OneSegmentedButtonRow.kt:393)");
        }
        if (i2 == 1) {
            return cornerBasedShape;
        }
        if (i == 0) {
            rectangleShape = start(cornerBasedShape);
        } else if (i == i2 - 1) {
            rectangleShape = end(cornerBasedShape);
        } else {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rectangleShape;
    }

    @NotNull
    public final Shape start(@NotNull CornerBasedShape cornerBasedShape) {
        Intrinsics.checkNotNullParameter(cornerBasedShape, "<this>");
        float f = 0;
        return CornerBasedShape.copy$default(cornerBasedShape, null, CornerSizeKt.m69707CornerSize0680j_4(C3641Dp.m73658constructorimpl(f)), CornerSizeKt.m69707CornerSize0680j_4(C3641Dp.m73658constructorimpl(f)), null, 9, null);
    }
}
