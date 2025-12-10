package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.LayoutIdParentData;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a¢\u0002\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a<\u0010%\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b+\u0010*\"\u0014\u0010,\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010-\"\u0014\u0010/\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010-\"\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010-\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010-\"\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010-\"\u0014\u00103\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010-\"\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010-\"\u0014\u00105\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010-\"\u001d\u0010;\u001a\u0002068\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0014\u0010<\u001a\u00020(8\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010=\"\u001d\u0010C\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u001d\u0010F\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010B\"\u001d\u0010I\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010B\"\u001d\u0010L\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010B\"\u001d\u0010O\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010B\"\u001d\u0010R\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010@\u001a\u0004\bQ\u0010B\"\u001d\u0010U\u001a\u00020>8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010B\"\u001a\u0010[\u001a\u00020V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u001a\u0010`\u001a\u0004\u0018\u00010]*\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006a"}, m28850d2 = {"Landroidx/compose/material3/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material3/TextFieldColors;", "colors", "container", "CommonDecorationBox", "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "content", "Decoration-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "(Landroidx/compose/ui/layout/Placeable;)I", "heightOrZero", "TextFieldId", "Ljava/lang/String;", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "PrefixId", "SuffixId", "SupportingId", "ContainerId", "Landroidx/compose/ui/unit/Constraints;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getZeroConstraints", "()J", "ZeroConstraints", "AnimationDuration", "I", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getTextFieldPadding", "()F", "TextFieldPadding", OperatorName.CURVE_TO, "getHorizontalIconPadding", "HorizontalIconPadding", "d", "getSupportingTopPadding", "SupportingTopPadding", "e", "getPrefixSuffixTextPadding", "PrefixSuffixTextPadding", OperatorName.FILL_NON_ZERO, "getMinTextLineHeight", "MinTextLineHeight", OperatorName.NON_STROKING_GRAY, "getMinFocusedLabelLineHeight", "MinFocusedLabelLineHeight", OperatorName.CLOSE_PATH, "getMinSupportingTextLineHeight", "MinSupportingTextLineHeight", "Landroidx/compose/ui/Modifier;", "i", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "IconDefaultSizeModifier", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n50#2:430\n49#2:431\n1114#3,6:432\n658#4:438\n646#4:439\n658#4:440\n646#4:441\n154#5:442\n154#5:443\n154#5:444\n154#5:445\n154#5:446\n154#5:447\n154#5:448\n154#5:449\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n*L\n82#1:430\n82#1:431\n82#1:432,6\n107#1:438\n107#1:439\n110#1:440\n110#1:441\n421#1:442\n422#1:443\n423#1:444\n424#1:445\n425#1:446\n426#1:447\n427#1:448\n429#1:449\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    @NotNull
    public static final String ContainerId = "Container";
    @NotNull
    public static final String LabelId = "Label";
    @NotNull
    public static final String LeadingId = "Leading";
    @NotNull
    public static final String PlaceholderId = "Hint";
    @NotNull
    public static final String PrefixId = "Prefix";
    @NotNull
    public static final String SuffixId = "Suffix";
    @NotNull
    public static final String SupportingId = "Supporting";
    @NotNull
    public static final String TextFieldId = "TextField";
    @NotNull
    public static final String TrailingId = "Trailing";

    /* renamed from: b */
    public static final float f26354b;

    /* renamed from: g */
    public static final float f26359g;

    /* renamed from: h */
    public static final float f26360h;

    /* renamed from: i */
    public static final Modifier f26361i;

    /* renamed from: a */
    public static final long f26353a = ConstraintsKt.Constraints(0, 0, 0, 0);

    /* renamed from: c */
    public static final float f26355c = C3641Dp.m73658constructorimpl(12);

    /* renamed from: d */
    public static final float f26356d = C3641Dp.m73658constructorimpl(4);

    /* renamed from: e */
    public static final float f26357e = C3641Dp.m73658constructorimpl(2);

    /* renamed from: f */
    public static final float f26358f = C3641Dp.m73658constructorimpl(24);

    static {
        float f = 16;
        f26354b = C3641Dp.m73658constructorimpl(f);
        f26359g = C3641Dp.m73658constructorimpl(f);
        f26360h = C3641Dp.m73658constructorimpl(f);
        float f2 = 48;
        f26361i = SizeKt.m69548defaultMinSizeVpY3zN4(Modifier.Companion, C3641Dp.m73658constructorimpl(f2), C3641Dp.m73658constructorimpl(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CommonDecorationBox(@org.jetbrains.annotations.NotNull androidx.compose.material3.TextFieldType r44, @org.jetbrains.annotations.NotNull java.lang.String r45, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, @org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.VisualTransformation r47, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, boolean r55, boolean r56, boolean r57, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.InteractionSource r58, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.PaddingValues r59, @org.jetbrains.annotations.NotNull androidx.compose.material3.TextFieldColors r60, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.TextFieldType, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    /* renamed from: Decoration-KTwxG1Y  reason: not valid java name */
    public static final void m70691DecorationKTwxG1Y(long j, @Nullable TextStyle textStyle, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1520066345);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changed(j)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changed(textStyle)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(content)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i7 != 0) {
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i3, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:274)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1449369305, true, new TextFieldImplKt$Decoration$contentWithColor$1(j, content, i3));
            if (textStyle != null) {
                startRestartGroup.startReplaceableGroup(1830468032);
                TextKt.ProvideTextStyle(textStyle, composableLambda, startRestartGroup, ((i3 >> 3) & 14) | 48);
            } else {
                startRestartGroup.startReplaceableGroup(1830468084);
                composableLambda.invoke(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        TextStyle textStyle2 = textStyle;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldImplKt$Decoration$1(j, textStyle2, content, i, i2));
        }
    }

    public static final float getHorizontalIconPadding() {
        return f26355c;
    }

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return f26361i;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        LayoutIdParentData layoutIdParentData;
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) parentData;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData == null) {
            return null;
        }
        return layoutIdParentData.getLayoutId();
    }

    public static final float getMinFocusedLabelLineHeight() {
        return f26359g;
    }

    public static final float getMinSupportingTextLineHeight() {
        return f26360h;
    }

    public static final float getMinTextLineHeight() {
        return f26358f;
    }

    public static final float getPrefixSuffixTextPadding() {
        return f26357e;
    }

    public static final float getSupportingTopPadding() {
        return f26356d;
    }

    public static final float getTextFieldPadding() {
        return f26354b;
    }

    public static final long getZeroConstraints() {
        return f26353a;
    }

    public static final int heightOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
