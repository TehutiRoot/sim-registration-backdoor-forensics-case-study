package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\b<\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR \u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010 \u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R \u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010&\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u0017\u0010)\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u0017\u0010,\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u0017\u0010/\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010\u001aR \u00102\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u0017\u00105\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b3\u0010\u0018\u001a\u0004\b4\u0010\u001aR\u0017\u00108\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b6\u0010\u0018\u001a\u0004\b7\u0010\u001aR \u0010;\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010>\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b<\u0010\u0018\u001a\u0004\b=\u0010\u001aR\u0017\u0010A\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b?\u0010\u0018\u001a\u0004\b@\u0010\u001aR\u0017\u0010D\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010\u0018\u001a\u0004\bC\u0010\u001aR \u0010G\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010J\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bH\u0010\u0018\u001a\u0004\bI\u0010\u001aR\u0017\u0010M\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bK\u0010\u0018\u001a\u0004\bL\u0010\u001aR \u0010P\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\bR\u0017\u0010S\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bQ\u0010\u0018\u001a\u0004\bR\u0010\u001aR\u0017\u0010V\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bT\u0010\u0018\u001a\u0004\bU\u0010\u001aR \u0010Y\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010\\\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bZ\u0010\u0018\u001a\u0004\b[\u0010\u001aR \u0010_\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b`\u0010\u0018\u001a\u0004\ba\u0010\u001aR\u0017\u0010e\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bc\u0010\u0018\u001a\u0004\bd\u0010\u001aR \u0010h\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bf\u0010\u0006\u001a\u0004\bg\u0010\bR\u0017\u0010n\u001a\u00020i8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR \u0010p\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0006\u001a\u0004\bo\u0010\bR\u0014\u0010q\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\bq\u0010\u0006R\u0017\u0010t\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\br\u0010\u0018\u001a\u0004\bs\u0010\u001aR \u0010w\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u0017\u0010z\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bx\u0010\u0018\u001a\u0004\by\u0010\u001aR \u0010}\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u0018\u0010\u0080\u0001\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b~\u0010\u0018\u001a\u0004\b\u007f\u0010\u001aR#\u0010\u0083\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR\u001a\u0010\u0086\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0018\u001a\u0005\b\u0085\u0001\u0010\u001aR\u001a\u0010\u0089\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0018\u001a\u0005\b\u0088\u0001\u0010\u001aR#\u0010\u008c\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR\u001a\u0010\u008f\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0018\u001a\u0005\b\u008e\u0001\u0010\u001aR#\u0010\u0092\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\bR\u001a\u0010\u0095\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0018\u001a\u0005\b\u0094\u0001\u0010\u001aR#\u0010\u0098\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\bR\u001a\u0010\u009b\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0018\u001a\u0005\b\u009a\u0001\u0010\u001aR#\u0010\u009e\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0006\u001a\u0005\b\u009d\u0001\u0010\bR\u001a\u0010¡\u0001\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0018\u001a\u0005\b \u0001\u0010\u001aR#\u0010¤\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0006\u001a\u0005\b£\u0001\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¥\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/CheckboxTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getContainerHeight-D9Ej5fM", "()F", "ContainerHeight", "Landroidx/compose/foundation/shape/RoundedCornerShape;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getContainerShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContainerShape", OperatorName.CURVE_TO, "getContainerWidth-D9Ej5fM", "ContainerWidth", "d", "getIconSize-D9Ej5fM", "IconSize", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "e", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getSelectedContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "SelectedContainerColor", OperatorName.FILL_NON_ZERO, "getSelectedDisabledContainerColor", "SelectedDisabledContainerColor", "", "SelectedDisabledContainerOpacity", OperatorName.NON_STROKING_GRAY, "getSelectedDisabledContainerOutlineWidth-D9Ej5fM", "SelectedDisabledContainerOutlineWidth", OperatorName.CLOSE_PATH, "getSelectedDisabledIconColor", "SelectedDisabledIconColor", "i", "getSelectedErrorContainerColor", "SelectedErrorContainerColor", OperatorName.SET_LINE_JOINSTYLE, "getSelectedErrorFocusContainerColor", "SelectedErrorFocusContainerColor", OperatorName.NON_STROKING_CMYK, "getSelectedErrorFocusIconColor", "SelectedErrorFocusIconColor", OperatorName.LINE_TO, "getSelectedErrorFocusOutlineWidth-D9Ej5fM", "SelectedErrorFocusOutlineWidth", OperatorName.MOVE_TO, "getSelectedErrorHoverContainerColor", "SelectedErrorHoverContainerColor", OperatorName.ENDPATH, "getSelectedErrorHoverIconColor", "SelectedErrorHoverIconColor", "o", "getSelectedErrorHoverOutlineWidth-D9Ej5fM", "SelectedErrorHoverOutlineWidth", "p", "getSelectedErrorIconColor", "SelectedErrorIconColor", OperatorName.SAVE, "getSelectedErrorPressedContainerColor", "SelectedErrorPressedContainerColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getSelectedErrorPressedIconColor", "SelectedErrorPressedIconColor", OperatorName.CLOSE_AND_STROKE, "getSelectedErrorPressedOutlineWidth-D9Ej5fM", "SelectedErrorPressedOutlineWidth", "t", "getSelectedFocusContainerColor", "SelectedFocusContainerColor", "u", "getSelectedFocusIconColor", "SelectedFocusIconColor", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getSelectedFocusOutlineWidth-D9Ej5fM", "SelectedFocusOutlineWidth", OperatorName.SET_LINE_WIDTH, "getSelectedHoverContainerColor", "SelectedHoverContainerColor", "x", "getSelectedHoverIconColor", "SelectedHoverIconColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSelectedHoverOutlineWidth-D9Ej5fM", "SelectedHoverOutlineWidth", "z", "getSelectedIconColor", "SelectedIconColor", "A", "getSelectedOutlineWidth-D9Ej5fM", "SelectedOutlineWidth", "B", "getSelectedPressedContainerColor", "SelectedPressedContainerColor", "C", "getSelectedPressedIconColor", "SelectedPressedIconColor", "D", "getSelectedPressedOutlineWidth-D9Ej5fM", "SelectedPressedOutlineWidth", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getStateLayerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "StateLayerShape", "getStateLayerSize-D9Ej5fM", "StateLayerSize", "UnselectedDisabledContainerOpacity", OperatorName.STROKING_COLOR_GRAY, "getUnselectedDisabledOutlineColor", "UnselectedDisabledOutlineColor", "H", "getUnselectedDisabledOutlineWidth-D9Ej5fM", "UnselectedDisabledOutlineWidth", "I", "getUnselectedErrorFocusOutlineColor", "UnselectedErrorFocusOutlineColor", OperatorName.SET_LINE_CAPSTYLE, "getUnselectedErrorFocusOutlineWidth-D9Ej5fM", "UnselectedErrorFocusOutlineWidth", "K", "getUnselectedErrorHoverOutlineColor", "UnselectedErrorHoverOutlineColor", "L", "getUnselectedErrorHoverOutlineWidth-D9Ej5fM", "UnselectedErrorHoverOutlineWidth", "M", "getUnselectedErrorOutlineColor", "UnselectedErrorOutlineColor", "N", "getUnselectedErrorPressedOutlineColor", "UnselectedErrorPressedOutlineColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getUnselectedErrorPressedOutlineWidth-D9Ej5fM", "UnselectedErrorPressedOutlineWidth", "P", "getUnselectedFocusOutlineColor", "UnselectedFocusOutlineColor", OperatorName.RESTORE, "getUnselectedFocusOutlineWidth-D9Ej5fM", "UnselectedFocusOutlineWidth", "R", "getUnselectedHoverOutlineColor", "UnselectedHoverOutlineColor", "S", "getUnselectedHoverOutlineWidth-D9Ej5fM", "UnselectedHoverOutlineWidth", "T", "getUnselectedOutlineColor", "UnselectedOutlineColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getUnselectedOutlineWidth-D9Ej5fM", "UnselectedOutlineWidth", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedPressedOutlineColor", "UnselectedPressedOutlineColor", "W", "getUnselectedPressedOutlineWidth-D9Ej5fM", "UnselectedPressedOutlineWidth", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckboxTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckboxTokens.kt\nandroidx/compose/material3/tokens/CheckboxTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,77:1\n164#2:78\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n164#2:87\n164#2:88\n164#2:89\n164#2:90\n164#2:91\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n164#2:96\n164#2:97\n164#2:98\n*S KotlinDebug\n*F\n+ 1 CheckboxTokens.kt\nandroidx/compose/material3/tokens/CheckboxTokens\n*L\n25#1:78\n26#1:79\n27#1:80\n28#1:81\n32#1:82\n37#1:83\n40#1:84\n44#1:85\n47#1:86\n50#1:87\n52#1:88\n55#1:89\n57#1:90\n60#1:91\n62#1:92\n64#1:93\n67#1:94\n69#1:95\n71#1:96\n73#1:97\n75#1:98\n*E\n"})
/* loaded from: classes2.dex */
public final class CheckboxTokens {

    /* renamed from: A */
    public static final float f26592A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f26593B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f26594C;

    /* renamed from: D */
    public static final float f26595D;

    /* renamed from: E */
    public static final ShapeKeyTokens f26596E;

    /* renamed from: F */
    public static final float f26597F;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f26598G;

    /* renamed from: H */
    public static final float f26599H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f26600I;
    @NotNull
    public static final CheckboxTokens INSTANCE = new CheckboxTokens();

    /* renamed from: J */
    public static final float f26601J;

    /* renamed from: K */
    public static final ColorSchemeKeyTokens f26602K;

    /* renamed from: L */
    public static final float f26603L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f26604M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f26605N;

    /* renamed from: O */
    public static final float f26606O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f26607P;

    /* renamed from: Q */
    public static final float f26608Q;

    /* renamed from: R */
    public static final ColorSchemeKeyTokens f26609R;

    /* renamed from: S */
    public static final float f26610S;
    public static final float SelectedDisabledContainerOpacity = 0.38f;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f26611T;

    /* renamed from: U */
    public static final float f26612U;
    public static final float UnselectedDisabledContainerOpacity = 0.38f;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f26613V;

    /* renamed from: W */
    public static final float f26614W;

    /* renamed from: a */
    public static final float f26615a;

    /* renamed from: b */
    public static final RoundedCornerShape f26616b;

    /* renamed from: c */
    public static final float f26617c;

    /* renamed from: d */
    public static final float f26618d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f26619e;

    /* renamed from: f */
    public static final ColorSchemeKeyTokens f26620f;

    /* renamed from: g */
    public static final float f26621g;

    /* renamed from: h */
    public static final ColorSchemeKeyTokens f26622h;

    /* renamed from: i */
    public static final ColorSchemeKeyTokens f26623i;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f26624j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f26625k;

    /* renamed from: l */
    public static final float f26626l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f26627m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f26628n;

    /* renamed from: o */
    public static final float f26629o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f26630p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f26631q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f26632r;

    /* renamed from: s */
    public static final float f26633s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f26634t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f26635u;

    /* renamed from: v */
    public static final float f26636v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f26637w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f26638x;

    /* renamed from: y */
    public static final float f26639y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f26640z;

    static {
        float f = (float) 18.0d;
        f26615a = C3641Dp.m73658constructorimpl(f);
        float f2 = (float) 2.0d;
        f26616b = RoundedCornerShapeKt.m69711RoundedCornerShape0680j_4(C3641Dp.m73658constructorimpl(f2));
        f26617c = C3641Dp.m73658constructorimpl(f);
        f26618d = C3641Dp.m73658constructorimpl(f);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        f26619e = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurface;
        f26620f = colorSchemeKeyTokens2;
        float f3 = (float) 0.0d;
        f26621g = C3641Dp.m73658constructorimpl(f3);
        f26622h = ColorSchemeKeyTokens.Surface;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.Error;
        f26623i = colorSchemeKeyTokens3;
        f26624j = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnError;
        f26625k = colorSchemeKeyTokens4;
        f26626l = C3641Dp.m73658constructorimpl(f3);
        f26627m = colorSchemeKeyTokens3;
        f26628n = colorSchemeKeyTokens4;
        f26629o = C3641Dp.m73658constructorimpl(f3);
        f26630p = colorSchemeKeyTokens4;
        f26631q = colorSchemeKeyTokens3;
        f26632r = colorSchemeKeyTokens4;
        f26633s = C3641Dp.m73658constructorimpl(f3);
        f26634t = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.OnPrimary;
        f26635u = colorSchemeKeyTokens5;
        f26636v = C3641Dp.m73658constructorimpl(f3);
        f26637w = colorSchemeKeyTokens;
        f26638x = colorSchemeKeyTokens5;
        f26639y = C3641Dp.m73658constructorimpl(f3);
        f26640z = colorSchemeKeyTokens5;
        f26592A = C3641Dp.m73658constructorimpl(f3);
        f26593B = colorSchemeKeyTokens;
        f26594C = colorSchemeKeyTokens5;
        f26595D = C3641Dp.m73658constructorimpl(f3);
        f26596E = ShapeKeyTokens.CornerFull;
        f26597F = C3641Dp.m73658constructorimpl((float) 40.0d);
        f26598G = colorSchemeKeyTokens2;
        f26599H = C3641Dp.m73658constructorimpl(f2);
        f26600I = colorSchemeKeyTokens3;
        f26601J = C3641Dp.m73658constructorimpl(f2);
        f26602K = colorSchemeKeyTokens3;
        f26603L = C3641Dp.m73658constructorimpl(f2);
        f26604M = colorSchemeKeyTokens3;
        f26605N = colorSchemeKeyTokens3;
        f26606O = C3641Dp.m73658constructorimpl(f2);
        f26607P = colorSchemeKeyTokens2;
        f26608Q = C3641Dp.m73658constructorimpl(f2);
        f26609R = colorSchemeKeyTokens2;
        f26610S = C3641Dp.m73658constructorimpl(f2);
        f26611T = ColorSchemeKeyTokens.OnSurfaceVariant;
        f26612U = C3641Dp.m73658constructorimpl(f2);
        f26613V = colorSchemeKeyTokens2;
        f26614W = C3641Dp.m73658constructorimpl(f2);
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m70836getContainerHeightD9Ej5fM() {
        return f26615a;
    }

    @NotNull
    public final RoundedCornerShape getContainerShape() {
        return f26616b;
    }

    /* renamed from: getContainerWidth-D9Ej5fM  reason: not valid java name */
    public final float m70837getContainerWidthD9Ej5fM() {
        return f26617c;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m70838getIconSizeD9Ej5fM() {
        return f26618d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return f26619e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDisabledContainerColor() {
        return f26620f;
    }

    /* renamed from: getSelectedDisabledContainerOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70839getSelectedDisabledContainerOutlineWidthD9Ej5fM() {
        return f26621g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDisabledIconColor() {
        return f26622h;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorContainerColor() {
        return f26623i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorFocusContainerColor() {
        return f26624j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorFocusIconColor() {
        return f26625k;
    }

    /* renamed from: getSelectedErrorFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70840getSelectedErrorFocusOutlineWidthD9Ej5fM() {
        return f26626l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorHoverContainerColor() {
        return f26627m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorHoverIconColor() {
        return f26628n;
    }

    /* renamed from: getSelectedErrorHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70841getSelectedErrorHoverOutlineWidthD9Ej5fM() {
        return f26629o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorIconColor() {
        return f26630p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorPressedContainerColor() {
        return f26631q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedErrorPressedIconColor() {
        return f26632r;
    }

    /* renamed from: getSelectedErrorPressedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70842getSelectedErrorPressedOutlineWidthD9Ej5fM() {
        return f26633s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusContainerColor() {
        return f26634t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return f26635u;
    }

    /* renamed from: getSelectedFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70843getSelectedFocusOutlineWidthD9Ej5fM() {
        return f26636v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverContainerColor() {
        return f26637w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return f26638x;
    }

    /* renamed from: getSelectedHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70844getSelectedHoverOutlineWidthD9Ej5fM() {
        return f26639y;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return f26640z;
    }

    /* renamed from: getSelectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70845getSelectedOutlineWidthD9Ej5fM() {
        return f26592A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedContainerColor() {
        return f26593B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return f26594C;
    }

    /* renamed from: getSelectedPressedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70846getSelectedPressedOutlineWidthD9Ej5fM() {
        return f26595D;
    }

    @NotNull
    public final ShapeKeyTokens getStateLayerShape() {
        return f26596E;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM  reason: not valid java name */
    public final float m70847getStateLayerSizeD9Ej5fM() {
        return f26597F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDisabledOutlineColor() {
        return f26598G;
    }

    /* renamed from: getUnselectedDisabledOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70848getUnselectedDisabledOutlineWidthD9Ej5fM() {
        return f26599H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorFocusOutlineColor() {
        return f26600I;
    }

    /* renamed from: getUnselectedErrorFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70849getUnselectedErrorFocusOutlineWidthD9Ej5fM() {
        return f26601J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorHoverOutlineColor() {
        return f26602K;
    }

    /* renamed from: getUnselectedErrorHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70850getUnselectedErrorHoverOutlineWidthD9Ej5fM() {
        return f26603L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorOutlineColor() {
        return f26604M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedErrorPressedOutlineColor() {
        return f26605N;
    }

    /* renamed from: getUnselectedErrorPressedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70851getUnselectedErrorPressedOutlineWidthD9Ej5fM() {
        return f26606O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return f26607P;
    }

    /* renamed from: getUnselectedFocusOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70852getUnselectedFocusOutlineWidthD9Ej5fM() {
        return f26608Q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverOutlineColor() {
        return f26609R;
    }

    /* renamed from: getUnselectedHoverOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70853getUnselectedHoverOutlineWidthD9Ej5fM() {
        return f26610S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return f26611T;
    }

    /* renamed from: getUnselectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70854getUnselectedOutlineWidthD9Ej5fM() {
        return f26612U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedOutlineColor() {
        return f26613V;
    }

    /* renamed from: getUnselectedPressedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m70855getUnselectedPressedOutlineWidthD9Ej5fM() {
        return f26614W;
    }
}
