package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0003\b\u0083\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u0014\u0010\"\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R \u0010%\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u0017\u00101\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b0\u0010\u0017R\u0017\u00104\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b3\u0010\u0017R\u0017\u00107\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b6\u0010\u0017R\u0017\u0010:\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b8\u0010\u0015\u001a\u0004\b9\u0010\u0017R \u0010=\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010@\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b>\u0010\u0015\u001a\u0004\b?\u0010\u0017R\u0017\u0010C\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bA\u0010\u0015\u001a\u0004\bB\u0010\u0017R\u0017\u0010F\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bD\u0010\u0015\u001a\u0004\bE\u0010\u0017R\u0017\u0010I\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010\u0015\u001a\u0004\bH\u0010\u0017R\u0017\u0010L\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bJ\u0010\u0015\u001a\u0004\bK\u0010\u0017R\u0017\u0010O\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bM\u0010\u0015\u001a\u0004\bN\u0010\u0017R\u0017\u0010R\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bP\u0010\u0015\u001a\u0004\bQ\u0010\u0017R \u0010U\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010X\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bV\u0010\u0015\u001a\u0004\bW\u0010\u0017R\u0017\u0010[\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bY\u0010\u000f\u001a\u0004\bZ\u0010\u0011R \u0010^\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\bR\u0014\u0010_\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010\u0006R\u0017\u0010b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b`\u0010\u0015\u001a\u0004\ba\u0010\u0017R\u0014\u0010c\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010\u0006R \u0010f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\be\u0010\bR\u0017\u0010i\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bg\u0010\u0015\u001a\u0004\bh\u0010\u0017R\u0017\u0010l\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bj\u0010\u0015\u001a\u0004\bk\u0010\u0017R\u0017\u0010o\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bm\u0010\u0015\u001a\u0004\bn\u0010\u0017R\u0017\u0010r\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bp\u0010\u0015\u001a\u0004\bq\u0010\u0017R\u0017\u0010t\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\bs\u0010\u0017R\u0017\u0010w\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bu\u0010\u0015\u001a\u0004\bv\u0010\u0017R\u0017\u0010z\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bx\u0010\u0015\u001a\u0004\by\u0010\u0017R\u0017\u0010}\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b{\u0010\u0015\u001a\u0004\b|\u0010\u0017R\u0018\u0010\u0080\u0001\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b~\u0010\u0015\u001a\u0004\b\u007f\u0010\u0017R\u001a\u0010\u0083\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0015\u001a\u0005\b\u0082\u0001\u0010\u0017R\u001a\u0010\u0086\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0015\u001a\u0005\b\u0085\u0001\u0010\u0017R\u0016\u0010\u0087\u0001\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0006R\u001a\u0010\u008a\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0015\u001a\u0005\b\u0089\u0001\u0010\u0017R\u001a\u0010\u008d\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0015\u001a\u0005\b\u008c\u0001\u0010\u0017R\u001a\u0010\u0090\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0015\u001a\u0005\b\u008f\u0001\u0010\u0017R\u001a\u0010\u0093\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0015\u001a\u0005\b\u0092\u0001\u0010\u0017R\u001a\u0010\u0096\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\u0015\u001a\u0005\b\u0095\u0001\u0010\u0017R#\u0010\u0099\u0001\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR\u001a\u0010\u009c\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\u0015\u001a\u0005\b\u009b\u0001\u0010\u0017R\u001a\u0010\u009f\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0015\u001a\u0005\b\u009e\u0001\u0010\u0017R\u001a\u0010¢\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010\u0015\u001a\u0005\b¡\u0001\u0010\u0017R\u001a\u0010¥\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0015\u001a\u0005\b¤\u0001\u0010\u0017R\u001a\u0010¨\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0015\u001a\u0005\b§\u0001\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006©\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/InputChipTokens;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getContainerElevation-D9Ej5fM", "()F", "ContainerElevation", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getContainerHeight-D9Ej5fM", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "d", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDisabledLabelTextColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledLabelTextColor", "", "DisabledLabelTextOpacity", "e", "getDisabledSelectedContainerColor", "DisabledSelectedContainerColor", "DisabledSelectedContainerOpacity", OperatorName.FILL_NON_ZERO, "getDisabledUnselectedOutlineColor", "DisabledUnselectedOutlineColor", "DisabledUnselectedOutlineOpacity", OperatorName.NON_STROKING_GRAY, "getDraggedContainerElevation-D9Ej5fM", "DraggedContainerElevation", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", OperatorName.CLOSE_PATH, "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LabelTextFont", "i", "getSelectedContainerColor", "SelectedContainerColor", OperatorName.SET_LINE_JOINSTYLE, "getSelectedDraggedLabelTextColor", "SelectedDraggedLabelTextColor", OperatorName.NON_STROKING_CMYK, "getSelectedFocusLabelTextColor", "SelectedFocusLabelTextColor", OperatorName.LINE_TO, "getSelectedHoverLabelTextColor", "SelectedHoverLabelTextColor", OperatorName.MOVE_TO, "getSelectedLabelTextColor", "SelectedLabelTextColor", OperatorName.ENDPATH, "getSelectedOutlineWidth-D9Ej5fM", "SelectedOutlineWidth", "o", "getSelectedPressedLabelTextColor", "SelectedPressedLabelTextColor", "p", "getUnselectedDraggedLabelTextColor", "UnselectedDraggedLabelTextColor", OperatorName.SAVE, "getUnselectedFocusLabelTextColor", "UnselectedFocusLabelTextColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getUnselectedFocusOutlineColor", "UnselectedFocusOutlineColor", OperatorName.CLOSE_AND_STROKE, "getUnselectedHoverLabelTextColor", "UnselectedHoverLabelTextColor", "t", "getUnselectedLabelTextColor", "UnselectedLabelTextColor", "u", "getUnselectedOutlineColor", "UnselectedOutlineColor", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getUnselectedOutlineWidth-D9Ej5fM", "UnselectedOutlineWidth", OperatorName.SET_LINE_WIDTH, "getUnselectedPressedLabelTextColor", "UnselectedPressedLabelTextColor", "x", "getAvatarShape", "AvatarShape", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getAvatarSize-D9Ej5fM", "AvatarSize", "DisabledAvatarOpacity", "z", "getDisabledLeadingIconColor", "DisabledLeadingIconColor", "DisabledLeadingIconOpacity", "A", "getLeadingIconSize-D9Ej5fM", "LeadingIconSize", "B", "getSelectedDraggedLeadingIconColor", "SelectedDraggedLeadingIconColor", "C", "getSelectedFocusLeadingIconColor", "SelectedFocusLeadingIconColor", "D", "getSelectedHoverLeadingIconColor", "SelectedHoverLeadingIconColor", ExifInterface.LONGITUDE_EAST, "getSelectedLeadingIconColor", "SelectedLeadingIconColor", "getSelectedPressedLeadingIconColor", "SelectedPressedLeadingIconColor", OperatorName.STROKING_COLOR_GRAY, "getUnselectedDraggedLeadingIconColor", "UnselectedDraggedLeadingIconColor", "H", "getUnselectedFocusLeadingIconColor", "UnselectedFocusLeadingIconColor", "I", "getUnselectedHoverLeadingIconColor", "UnselectedHoverLeadingIconColor", OperatorName.SET_LINE_CAPSTYLE, "getUnselectedLeadingIconColor", "UnselectedLeadingIconColor", "K", "getUnselectedPressedLeadingIconColor", "UnselectedPressedLeadingIconColor", "L", "getDisabledTrailingIconColor", "DisabledTrailingIconColor", "DisabledTrailingIconOpacity", "M", "getSelectedDraggedTrailingIconColor", "SelectedDraggedTrailingIconColor", "N", "getSelectedFocusTrailingIconColor", "SelectedFocusTrailingIconColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getSelectedHoverTrailingIconColor", "SelectedHoverTrailingIconColor", "P", "getSelectedPressedTrailingIconColor", "SelectedPressedTrailingIconColor", OperatorName.RESTORE, "getSelectedTrailingIconColor", "SelectedTrailingIconColor", "R", "getTrailingIconSize-D9Ej5fM", "TrailingIconSize", "S", "getUnselectedDraggedTrailingIconColor", "UnselectedDraggedTrailingIconColor", "T", "getUnselectedFocusTrailingIconColor", "UnselectedFocusTrailingIconColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getUnselectedHoverTrailingIconColor", "UnselectedHoverTrailingIconColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedPressedTrailingIconColor", "UnselectedPressedTrailingIconColor", "W", "getUnselectedTrailingIconColor", "UnselectedTrailingIconColor", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInputChipTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputChipTokens.kt\nandroidx/compose/material3/tokens/InputChipTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,79:1\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n*S KotlinDebug\n*F\n+ 1 InputChipTokens.kt\nandroidx/compose/material3/tokens/InputChipTokens\n*L\n25#1:80\n40#1:81\n48#1:82\n51#1:83\n55#1:84\n73#1:85\n*E\n"})
/* loaded from: classes2.dex */
public final class InputChipTokens {

    /* renamed from: A */
    public static final float f27204A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27205B;

    /* renamed from: C */
    public static final ColorSchemeKeyTokens f27206C;

    /* renamed from: D */
    public static final ColorSchemeKeyTokens f27207D;
    public static final float DisabledAvatarOpacity = 0.38f;
    public static final float DisabledLabelTextOpacity = 0.38f;
    public static final float DisabledLeadingIconOpacity = 0.38f;
    public static final float DisabledSelectedContainerOpacity = 0.12f;
    public static final float DisabledTrailingIconOpacity = 0.38f;
    public static final float DisabledUnselectedOutlineOpacity = 0.12f;

    /* renamed from: E */
    public static final ColorSchemeKeyTokens f27208E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27209F;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27210G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f27211H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f27212I;
    @NotNull
    public static final InputChipTokens INSTANCE = new InputChipTokens();

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f27213J;

    /* renamed from: K */
    public static final ColorSchemeKeyTokens f27214K;

    /* renamed from: L */
    public static final ColorSchemeKeyTokens f27215L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f27216M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f27217N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f27218O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f27219P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f27220Q;

    /* renamed from: R */
    public static final float f27221R;

    /* renamed from: S */
    public static final ColorSchemeKeyTokens f27222S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f27223T;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f27224U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f27225V;

    /* renamed from: W */
    public static final ColorSchemeKeyTokens f27226W;

    /* renamed from: a */
    public static final float f27227a;

    /* renamed from: b */
    public static final float f27228b;

    /* renamed from: c */
    public static final ShapeKeyTokens f27229c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27230d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f27231e;

    /* renamed from: f */
    public static final ColorSchemeKeyTokens f27232f;

    /* renamed from: g */
    public static final float f27233g;

    /* renamed from: h */
    public static final TypographyKeyTokens f27234h;

    /* renamed from: i */
    public static final ColorSchemeKeyTokens f27235i;

    /* renamed from: j */
    public static final ColorSchemeKeyTokens f27236j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27237k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27238l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27239m;

    /* renamed from: n */
    public static final float f27240n;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f27241o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27242p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27243q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27244r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f27245s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27246t;

    /* renamed from: u */
    public static final ColorSchemeKeyTokens f27247u;

    /* renamed from: v */
    public static final float f27248v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27249w;

    /* renamed from: x */
    public static final ShapeKeyTokens f27250x;

    /* renamed from: y */
    public static final float f27251y;

    /* renamed from: z */
    public static final ColorSchemeKeyTokens f27252z;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        f27227a = elevationTokens.m70955getLevel0D9Ej5fM();
        f27228b = C3641Dp.m73658constructorimpl((float) 32.0d);
        f27229c = ShapeKeyTokens.CornerSmall;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f27230d = colorSchemeKeyTokens;
        f27231e = colorSchemeKeyTokens;
        f27232f = colorSchemeKeyTokens;
        f27233g = elevationTokens.m70959getLevel4D9Ej5fM();
        f27234h = TypographyKeyTokens.LabelLarge;
        f27235i = ColorSchemeKeyTokens.SecondaryContainer;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSecondaryContainer;
        f27236j = colorSchemeKeyTokens2;
        f27237k = colorSchemeKeyTokens2;
        f27238l = colorSchemeKeyTokens2;
        f27239m = colorSchemeKeyTokens2;
        f27240n = C3641Dp.m73658constructorimpl((float) 0.0d);
        f27241o = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27242p = colorSchemeKeyTokens3;
        f27243q = colorSchemeKeyTokens3;
        f27244r = colorSchemeKeyTokens3;
        f27245s = colorSchemeKeyTokens3;
        f27246t = colorSchemeKeyTokens3;
        f27247u = ColorSchemeKeyTokens.Outline;
        f27248v = C3641Dp.m73658constructorimpl((float) 1.0d);
        f27249w = colorSchemeKeyTokens3;
        f27250x = ShapeKeyTokens.CornerFull;
        f27251y = C3641Dp.m73658constructorimpl((float) 24.0d);
        f27252z = colorSchemeKeyTokens;
        float f = (float) 18.0d;
        f27204A = C3641Dp.m73658constructorimpl(f);
        f27205B = colorSchemeKeyTokens2;
        f27206C = colorSchemeKeyTokens2;
        f27207D = colorSchemeKeyTokens2;
        f27208E = colorSchemeKeyTokens2;
        f27209F = colorSchemeKeyTokens2;
        f27210G = colorSchemeKeyTokens3;
        f27211H = colorSchemeKeyTokens3;
        f27212I = colorSchemeKeyTokens3;
        f27213J = colorSchemeKeyTokens3;
        f27214K = colorSchemeKeyTokens3;
        f27215L = colorSchemeKeyTokens;
        f27216M = colorSchemeKeyTokens2;
        f27217N = colorSchemeKeyTokens2;
        f27218O = colorSchemeKeyTokens2;
        f27219P = colorSchemeKeyTokens2;
        f27220Q = colorSchemeKeyTokens2;
        f27221R = C3641Dp.m73658constructorimpl(f);
        f27222S = colorSchemeKeyTokens3;
        f27223T = colorSchemeKeyTokens3;
        f27224U = colorSchemeKeyTokens3;
        f27225V = colorSchemeKeyTokens3;
        f27226W = colorSchemeKeyTokens3;
    }

    @NotNull
    public final ShapeKeyTokens getAvatarShape() {
        return f27250x;
    }

    /* renamed from: getAvatarSize-D9Ej5fM  reason: not valid java name */
    public final float m71076getAvatarSizeD9Ej5fM() {
        return f27251y;
    }

    /* renamed from: getContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71077getContainerElevationD9Ej5fM() {
        return f27227a;
    }

    /* renamed from: getContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71078getContainerHeightD9Ej5fM() {
        return f27228b;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return f27229c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLabelTextColor() {
        return f27230d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledLeadingIconColor() {
        return f27252z;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedContainerColor() {
        return f27231e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledTrailingIconColor() {
        return f27215L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedOutlineColor() {
        return f27232f;
    }

    /* renamed from: getDraggedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71079getDraggedContainerElevationD9Ej5fM() {
        return f27233g;
    }

    @NotNull
    public final TypographyKeyTokens getLabelTextFont() {
        return f27234h;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71080getLeadingIconSizeD9Ej5fM() {
        return f27204A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return f27235i;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedLabelTextColor() {
        return f27236j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedLeadingIconColor() {
        return f27205B;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedDraggedTrailingIconColor() {
        return f27216M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusLabelTextColor() {
        return f27237k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusLeadingIconColor() {
        return f27206C;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusTrailingIconColor() {
        return f27217N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverLabelTextColor() {
        return f27238l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverLeadingIconColor() {
        return f27207D;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverTrailingIconColor() {
        return f27218O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedLabelTextColor() {
        return f27239m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedLeadingIconColor() {
        return f27208E;
    }

    /* renamed from: getSelectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71081getSelectedOutlineWidthD9Ej5fM() {
        return f27240n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedLabelTextColor() {
        return f27241o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedLeadingIconColor() {
        return f27209F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedTrailingIconColor() {
        return f27219P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedTrailingIconColor() {
        return f27220Q;
    }

    /* renamed from: getTrailingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71082getTrailingIconSizeD9Ej5fM() {
        return f27221R;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedLabelTextColor() {
        return f27242p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedLeadingIconColor() {
        return f27210G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedDraggedTrailingIconColor() {
        return f27222S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusLabelTextColor() {
        return f27243q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusLeadingIconColor() {
        return f27211H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return f27244r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrailingIconColor() {
        return f27223T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverLabelTextColor() {
        return f27245s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverLeadingIconColor() {
        return f27212I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrailingIconColor() {
        return f27224U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedLabelTextColor() {
        return f27246t;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedLeadingIconColor() {
        return f27213J;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return f27247u;
    }

    /* renamed from: getUnselectedOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71083getUnselectedOutlineWidthD9Ej5fM() {
        return f27248v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedLabelTextColor() {
        return f27249w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedLeadingIconColor() {
        return f27214K;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrailingIconColor() {
        return f27225V;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedTrailingIconColor() {
        return f27226W;
    }
}
