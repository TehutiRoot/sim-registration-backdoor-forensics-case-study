package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JS\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J=\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 J=\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010 Jç\u0001\u0010>\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020&2\b\b\u0002\u0010,\u001a\u00020&2\b\b\u0002\u0010-\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020&2\b\b\u0002\u0010/\u001a\u00020&2\b\b\u0002\u00100\u001a\u00020&2\b\b\u0002\u00101\u001a\u00020&2\b\b\u0002\u00102\u001a\u00020&2\b\b\u0002\u00103\u001a\u00020&2\b\b\u0002\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020&2\b\b\u0002\u00106\u001a\u00020&2\b\b\u0002\u00107\u001a\u00020&2\b\b\u0002\u00108\u001a\u00020&2\b\b\u0002\u00109\u001a\u00020&2\b\b\u0002\u0010:\u001a\u00020&2\b\b\u0002\u0010;\u001a\u00020&H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=Jç\u0001\u0010D\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020&2\b\b\u0002\u0010?\u001a\u00020&2\b\b\u0002\u0010@\u001a\u00020&2\b\b\u0002\u0010A\u001a\u00020&2\b\b\u0002\u0010B\u001a\u00020&2\b\b\u0002\u00100\u001a\u00020&2\b\b\u0002\u00101\u001a\u00020&2\b\b\u0002\u00102\u001a\u00020&2\b\b\u0002\u00103\u001a\u00020&2\b\b\u0002\u00104\u001a\u00020&2\b\b\u0002\u00105\u001a\u00020&2\b\b\u0002\u00106\u001a\u00020&2\b\b\u0002\u00107\u001a\u00020&2\b\b\u0002\u00108\u001a\u00020&2\b\b\u0002\u00109\u001a\u00020&2\b\b\u0002\u0010:\u001a\u00020&2\b\b\u0002\u0010;\u001a\u00020&H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010=JÄ\u0001\u0010R\u001a\u00020\u00162\u0006\u0010F\u001a\u00020E2\u0011\u0010I\u001a\r\u0012\u0004\u0012\u00020\u00160G¢\u0006\u0002\bH2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010O\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010P\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010Q\u001a\u00020\u001eH\u0007¢\u0006\u0004\bR\u0010SJÙ\u0001\u0010U\u001a\u00020\u00162\u0006\u0010F\u001a\u00020E2\u0011\u0010I\u001a\r\u0012\u0004\u0012\u00020\u00160G¢\u0006\u0002\bH2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00052\u0006\u0010L\u001a\u00020K2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010O\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\u0015\b\u0002\u0010P\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010G¢\u0006\u0002\bH2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010Q\u001a\u00020\u001e2\u0013\b\u0002\u0010T\u001a\r\u0012\u0004\u0012\u00020\u00160G¢\u0006\u0002\bHH\u0007¢\u0006\u0004\bU\u0010VR \u0010[\u001a\u00020\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR \u0010^\u001a\u00020\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010ZR\u0014\u0010`\u001a\u00020_8\u0006X\u0086T¢\u0006\u0006\n\u0004\b`\u0010XR \u0010c\u001a\u00020\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010X\u001a\u0004\bb\u0010ZR \u0010f\u001a\u00020\f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010X\u001a\u0004\be\u0010ZR\u0014\u0010g\u001a\u00020_8\u0006X\u0086T¢\u0006\u0006\n\u0004\bg\u0010XR\u0014\u0010h\u001a\u00020_8\u0006X\u0086T¢\u0006\u0006\n\u0004\bh\u0010XR\u0011\u0010k\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0011\u0010m\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bl\u0010j\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006n"}, m28850d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "BorderBox", "start", "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "outlinedTextFieldColors", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", OutlinedTextFieldKt.BorderId, "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMinWidth-D9Ej5fM", "MinWidth", "", "IconOpacity", OperatorName.CURVE_TO, "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "d", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "BackgroundOpacity", "UnfocusedIndicatorLineOpacity", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getOutlinedTextFieldShape", "OutlinedTextFieldShape", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,855:1\n135#2:856\n76#3:857\n76#3:858\n154#4:859\n154#4:860\n154#4:861\n154#4:862\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n273#1:856\n378#1:857\n436#1:858\n196#1:859\n202#1:860\n231#1:861\n237#1:862\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();

    /* renamed from: a */
    public static final float f14691a = C3641Dp.m73658constructorimpl(56);

    /* renamed from: b */
    public static final float f14692b = C3641Dp.m73658constructorimpl(280);

    /* renamed from: c */
    public static final float f14693c = C3641Dp.m73658constructorimpl(1);

    /* renamed from: d */
    public static final float f14694d = C3641Dp.m73658constructorimpl(2);

    /* renamed from: indicatorLine-gv0btCI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m70133indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        float f3;
        float f4;
        if ((i & 16) != 0) {
            f3 = f14694d;
        } else {
            f3 = f;
        }
        if ((i & 32) != 0) {
            f4 = f14693c;
        } else {
            f4 = f2;
        }
        return textFieldDefaults.m70142indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70134outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m70144outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70135textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m70146textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ PaddingValues m70136textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m70147textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BorderBox-nbWgWpA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m70137BorderBoxnbWgWpA(boolean r20, boolean r21, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r22, @org.jetbrains.annotations.NotNull androidx.compose.material.TextFieldColors r23, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r24, float r25, float r26, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.m70137BorderBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x019e, code lost:
        if (r8.changed(r80) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OutlinedTextFieldDecorationBox(@org.jetbrains.annotations.NotNull java.lang.String r68, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r69, boolean r70, boolean r71, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.VisualTransformation r72, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r73, boolean r74, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r75, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r76, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r77, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r78, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r79, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r80, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r81, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r82, int r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x019a, code lost:
        if (r7.changed(r82) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void TextFieldDecorationBox(@org.jetbrains.annotations.NotNull java.lang.String r70, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r71, boolean r72, boolean r73, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.VisualTransformation r74, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r75, boolean r76, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r77, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r78, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r79, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r80, @org.jetbrains.annotations.Nullable androidx.compose.material.TextFieldColors r81, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r82, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m70138getFocusedBorderThicknessD9Ej5fM() {
        return f14694d;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m70139getMinHeightD9Ej5fM() {
        return f14691a;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m70140getMinWidthD9Ej5fM() {
        return f14692b;
    }

    @JvmName(name = "getOutlinedTextFieldShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shape getOutlinedTextFieldShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:224)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return small;
    }

    @JvmName(name = "getTextFieldShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shape getTextFieldShape(@Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:215)");
        }
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return copy$default;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM  reason: not valid java name */
    public final float m70141getUnfocusedBorderThicknessD9Ej5fM() {
        return f14693c;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: indicatorLine-gv0btCI  reason: not valid java name */
    public final Modifier m70142indicatorLinegv0btCI(@NotNull Modifier indicatorLine, boolean z, boolean z2, @NotNull InteractionSource interactionSource, @NotNull TextFieldColors colors, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C3201x343b27c2(z, z2, interactionSource, colors, f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(indicatorLine, noInspectorInfo, new TextFieldDefaults$indicatorLine$2(z, z2, interactionSource, colors, f, f2));
    }

    @Composable
    @NotNull
    /* renamed from: outlinedTextFieldColors-dx8h9Zs  reason: not valid java name */
    public final TextFieldColors m70143outlinedTextFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable Composer composer, int i, int i2, int i3, int i4) {
        composer.startReplaceableGroup(1762667317);
        long m71734copywmQWz5c$default = (i4 & 1) != 0 ? Color.m71734copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m71745unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long m71734copywmQWz5c$default2 = (i4 & 2) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m71770getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.Companion.m71770getTransparent0d7_KjU() : j3;
        long m69970getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69970getPrimary0d7_KjU() : j4;
        long m69964getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69964getError0d7_KjU() : j5;
        long m71734copywmQWz5c$default3 = (i4 & 32) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69970getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m71734copywmQWz5c$default4 = (i4 & 64) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m71734copywmQWz5c$default5 = (i4 & 128) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m69964getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69964getError0d7_KjU() : j9;
        long m71734copywmQWz5c$default6 = (i4 & 512) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m71734copywmQWz5c$default7 = (i4 & 1024) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? m71734copywmQWz5c$default6 : j12;
        long m71734copywmQWz5c$default8 = (i4 & 4096) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m71734copywmQWz5c$default9 = (i4 & 8192) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m69964getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69964getError0d7_KjU() : j15;
        long m71734copywmQWz5c$default10 = (32768 & i4) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69970getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m71734copywmQWz5c$default11 = (65536 & i4) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m71734copywmQWz5c$default12 = (131072 & i4) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m69964getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69964getError0d7_KjU() : j19;
        long m71734copywmQWz5c$default13 = (524288 & i4) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m71734copywmQWz5c$default14 = (i4 & 1048576) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:434)");
        }
        C13071pF c13071pF = new C13071pF(m71734copywmQWz5c$default, m71734copywmQWz5c$default2, m69970getPrimary0d7_KjU, m69964getError0d7_KjU, m71734copywmQWz5c$default3, m71734copywmQWz5c$default4, m69964getError0d7_KjU2, m71734copywmQWz5c$default5, m71734copywmQWz5c$default6, m71734copywmQWz5c$default7, j22, m71734copywmQWz5c$default8, m71734copywmQWz5c$default9, m69964getError0d7_KjU3, m71770getTransparent0d7_KjU, m71734copywmQWz5c$default10, m71734copywmQWz5c$default11, m71734copywmQWz5c$default12, m69964getError0d7_KjU4, m71734copywmQWz5c$default13, m71734copywmQWz5c$default14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c13071pF;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: outlinedTextFieldPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m70144outlinedTextFieldPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m69525PaddingValuesa9UjIt4(f, f2, f3, f4);
    }

    @Composable
    @NotNull
    /* renamed from: textFieldColors-dx8h9Zs  reason: not valid java name */
    public final TextFieldColors m70145textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable Composer composer, int i, int i2, int i3, int i4) {
        composer.startReplaceableGroup(231892599);
        long m71734copywmQWz5c$default = (i4 & 1) != 0 ? Color.m71734copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m71745unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long m71734copywmQWz5c$default2 = (i4 & 2) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m71734copywmQWz5c$default3 = (i4 & 4) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m69970getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69970getPrimary0d7_KjU() : j4;
        long m69964getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69964getError0d7_KjU() : j5;
        long m71734copywmQWz5c$default4 = (i4 & 32) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69970getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m71734copywmQWz5c$default5 = (i4 & 64) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m71734copywmQWz5c$default6 = (i4 & 128) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m69964getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69964getError0d7_KjU() : j9;
        long m71734copywmQWz5c$default7 = (i4 & 512) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m71734copywmQWz5c$default8 = (i4 & 1024) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j22 = (i4 & 2048) != 0 ? m71734copywmQWz5c$default7 : j12;
        long m71734copywmQWz5c$default9 = (i4 & 4096) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m71734copywmQWz5c$default10 = (i4 & 8192) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m69964getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69964getError0d7_KjU() : j15;
        long m71734copywmQWz5c$default11 = (32768 & i4) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69970getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m71734copywmQWz5c$default12 = (65536 & i4) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m71734copywmQWz5c$default13 = (131072 & i4) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m69964getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m69964getError0d7_KjU() : j19;
        long m71734copywmQWz5c$default14 = (524288 & i4) != 0 ? Color.m71734copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m69969getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m71734copywmQWz5c$default15 = (i4 & 1048576) != 0 ? Color.m71734copywmQWz5c$default(m71734copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:376)");
        }
        C13071pF c13071pF = new C13071pF(m71734copywmQWz5c$default, m71734copywmQWz5c$default2, m69970getPrimary0d7_KjU, m69964getError0d7_KjU, m71734copywmQWz5c$default4, m71734copywmQWz5c$default5, m69964getError0d7_KjU2, m71734copywmQWz5c$default6, m71734copywmQWz5c$default7, m71734copywmQWz5c$default8, j22, m71734copywmQWz5c$default9, m71734copywmQWz5c$default10, m69964getError0d7_KjU3, m71734copywmQWz5c$default3, m71734copywmQWz5c$default11, m71734copywmQWz5c$default12, m71734copywmQWz5c$default13, m69964getError0d7_KjU4, m71734copywmQWz5c$default14, m71734copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c13071pF;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: textFieldWithLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m70146textFieldWithLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m69525PaddingValuesa9UjIt4(f, f3, f2, f4);
    }

    @ExperimentalMaterialApi
    @NotNull
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4  reason: not valid java name */
    public final PaddingValues m70147textFieldWithoutLabelPaddinga9UjIt4(float f, float f2, float f3, float f4) {
        return PaddingKt.m69525PaddingValuesa9UjIt4(f, f2, f3, f4);
    }
}
