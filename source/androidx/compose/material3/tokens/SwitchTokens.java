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

@Metadata(m28851d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\b\u0085\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010-\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b+\u0010,R \u00100\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010,R\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010,R \u0010B\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\bA\u0010,R\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR \u0010Q\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bP\u0010,R\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010`\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b^\u0010%\u001a\u0004\b_\u0010'R \u0010c\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\f\u001a\u0004\bb\u0010,R \u0010f\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\f\u001a\u0004\be\u0010,R \u0010i\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bg\u0010\f\u001a\u0004\bh\u0010,R\u0017\u0010l\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bj\u0010%\u001a\u0004\bk\u0010'R \u0010o\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bm\u0010\f\u001a\u0004\bn\u0010,R\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bp\u0010\bR\u0017\u0010t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bs\u0010\bR\u0017\u0010w\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u0017\u0010z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\by\u0010\bR\u0017\u0010}\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR!\u0010\u0080\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\f\u001a\u0004\b\u007f\u0010,R#\u0010\u0083\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\f\u001a\u0005\b\u0082\u0001\u0010,R\u001a\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR\u001a\u0010\u0089\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001a\u0010\u008c\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR\u001a\u0010\u008f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001a\u0010\u0092\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\bR#\u0010\u0095\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\f\u001a\u0005\b\u0094\u0001\u0010,R\u001a\u0010\u0098\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\bR\u001a\u0010\u009b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR\u001a\u0010\u009e\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0006\u001a\u0005\b\u009d\u0001\u0010\bR\u001a\u0010¡\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\bR\u001a\u0010¤\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0006\u001a\u0005\b£\u0001\u0010\bR\u001a\u0010§\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR#\u0010ª\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¨\u0001\u0010\f\u001a\u0005\b©\u0001\u0010,R#\u0010\u00ad\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b«\u0001\u0010\f\u001a\u0005\b¬\u0001\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006®\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/SwitchTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDisabledSelectedHandleColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledSelectedHandleColor", "", "DisabledSelectedHandleOpacity", "F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDisabledSelectedIconColor", "DisabledSelectedIconColor", "DisabledSelectedIconOpacity", OperatorName.CURVE_TO, "getDisabledSelectedTrackColor", "DisabledSelectedTrackColor", "DisabledTrackOpacity", "d", "getDisabledUnselectedHandleColor", "DisabledUnselectedHandleColor", "DisabledUnselectedHandleOpacity", "e", "getDisabledUnselectedIconColor", "DisabledUnselectedIconColor", "DisabledUnselectedIconOpacity", OperatorName.FILL_NON_ZERO, "getDisabledUnselectedTrackColor", "DisabledUnselectedTrackColor", OperatorName.NON_STROKING_GRAY, "getDisabledUnselectedTrackOutlineColor", "DisabledUnselectedTrackOutlineColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CLOSE_PATH, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getHandleShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "HandleShape", "Landroidx/compose/ui/unit/Dp;", "i", "getPressedHandleHeight-D9Ej5fM", "()F", "PressedHandleHeight", OperatorName.SET_LINE_JOINSTYLE, "getPressedHandleWidth-D9Ej5fM", "PressedHandleWidth", OperatorName.NON_STROKING_CMYK, "getSelectedFocusHandleColor", "SelectedFocusHandleColor", OperatorName.LINE_TO, "getSelectedFocusIconColor", "SelectedFocusIconColor", OperatorName.MOVE_TO, "getSelectedFocusTrackColor", "SelectedFocusTrackColor", OperatorName.ENDPATH, "getSelectedHandleColor", "SelectedHandleColor", "o", "getSelectedHandleHeight-D9Ej5fM", "SelectedHandleHeight", "p", "getSelectedHandleWidth-D9Ej5fM", "SelectedHandleWidth", OperatorName.SAVE, "getSelectedHoverHandleColor", "SelectedHoverHandleColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getSelectedHoverIconColor", "SelectedHoverIconColor", OperatorName.CLOSE_AND_STROKE, "getSelectedHoverTrackColor", "SelectedHoverTrackColor", "t", "getSelectedIconColor", "SelectedIconColor", "u", "getSelectedIconSize-D9Ej5fM", "SelectedIconSize", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getSelectedPressedHandleColor", "SelectedPressedHandleColor", OperatorName.SET_LINE_WIDTH, "getSelectedPressedIconColor", "SelectedPressedIconColor", "x", "getSelectedPressedTrackColor", "SelectedPressedTrackColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSelectedTrackColor", "SelectedTrackColor", "z", "getStateLayerShape", "StateLayerShape", "A", "getStateLayerSize-D9Ej5fM", "StateLayerSize", "B", "getTrackHeight-D9Ej5fM", "TrackHeight", "C", "getTrackOutlineWidth-D9Ej5fM", "TrackOutlineWidth", "D", "getTrackShape", "TrackShape", ExifInterface.LONGITUDE_EAST, "getTrackWidth-D9Ej5fM", "TrackWidth", "getUnselectedFocusHandleColor", "UnselectedFocusHandleColor", OperatorName.STROKING_COLOR_GRAY, "getUnselectedFocusIconColor", "UnselectedFocusIconColor", "H", "getUnselectedFocusTrackColor", "UnselectedFocusTrackColor", "I", "getUnselectedFocusTrackOutlineColor", "UnselectedFocusTrackOutlineColor", OperatorName.SET_LINE_CAPSTYLE, "getUnselectedHandleColor", "UnselectedHandleColor", "K", "getUnselectedHandleHeight-D9Ej5fM", "UnselectedHandleHeight", "L", "getUnselectedHandleWidth-D9Ej5fM", "UnselectedHandleWidth", "M", "getUnselectedHoverHandleColor", "UnselectedHoverHandleColor", "N", "getUnselectedHoverIconColor", "UnselectedHoverIconColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getUnselectedHoverTrackColor", "UnselectedHoverTrackColor", "P", "getUnselectedHoverTrackOutlineColor", "UnselectedHoverTrackOutlineColor", OperatorName.RESTORE, "getUnselectedIconColor", "UnselectedIconColor", "R", "getUnselectedIconSize-D9Ej5fM", "UnselectedIconSize", "S", "getUnselectedPressedHandleColor", "UnselectedPressedHandleColor", "T", "getUnselectedPressedIconColor", "UnselectedPressedIconColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getUnselectedPressedTrackColor", "UnselectedPressedTrackColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedPressedTrackOutlineColor", "UnselectedPressedTrackOutlineColor", "W", "getUnselectedTrackColor", "UnselectedTrackColor", "X", "getUnselectedTrackOutlineColor", "UnselectedTrackOutlineColor", "Y", "getIconHandleHeight-D9Ej5fM", "IconHandleHeight", "Z", "getIconHandleWidth-D9Ej5fM", "IconHandleWidth", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitchTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchTokens.kt\nandroidx/compose/material3/tokens/SwitchTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,81:1\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n164#2:87\n164#2:88\n164#2:89\n164#2:90\n164#2:91\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n*S KotlinDebug\n*F\n+ 1 SwitchTokens.kt\nandroidx/compose/material3/tokens/SwitchTokens\n*L\n37#1:82\n38#1:83\n43#1:84\n44#1:85\n49#1:86\n55#1:87\n56#1:88\n57#1:89\n59#1:90\n65#1:91\n66#1:92\n72#1:93\n79#1:94\n80#1:95\n*E\n"})
/* loaded from: classes2.dex */
public final class SwitchTokens {

    /* renamed from: A */
    public static final float f27886A;

    /* renamed from: B */
    public static final float f27887B;

    /* renamed from: C */
    public static final float f27888C;

    /* renamed from: D */
    public static final ShapeKeyTokens f27889D;
    public static final float DisabledSelectedHandleOpacity = 1.0f;
    public static final float DisabledSelectedIconOpacity = 0.38f;
    public static final float DisabledTrackOpacity = 0.12f;
    public static final float DisabledUnselectedHandleOpacity = 0.38f;
    public static final float DisabledUnselectedIconOpacity = 0.38f;

    /* renamed from: E */
    public static final float f27890E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27891F;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27892G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f27893H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f27894I;

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f27895J;

    /* renamed from: K */
    public static final float f27896K;

    /* renamed from: L */
    public static final float f27897L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f27898M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f27899N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f27900O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f27901P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f27902Q;

    /* renamed from: R */
    public static final float f27903R;

    /* renamed from: S */
    public static final ColorSchemeKeyTokens f27904S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f27905T;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f27906U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f27907V;

    /* renamed from: W */
    public static final ColorSchemeKeyTokens f27908W;

    /* renamed from: X */
    public static final ColorSchemeKeyTokens f27909X;

    /* renamed from: Y */
    public static final float f27910Y;

    /* renamed from: Z */
    public static final float f27911Z;

    /* renamed from: b */
    public static final ColorSchemeKeyTokens f27913b;

    /* renamed from: c */
    public static final ColorSchemeKeyTokens f27914c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27915d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f27916e;

    /* renamed from: f */
    public static final ColorSchemeKeyTokens f27917f;

    /* renamed from: g */
    public static final ColorSchemeKeyTokens f27918g;

    /* renamed from: h */
    public static final ShapeKeyTokens f27919h;

    /* renamed from: i */
    public static final float f27920i;

    /* renamed from: j */
    public static final float f27921j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27922k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27923l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27924m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f27925n;

    /* renamed from: o */
    public static final float f27926o;

    /* renamed from: p */
    public static final float f27927p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27928q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27929r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f27930s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27931t;

    /* renamed from: u */
    public static final float f27932u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f27933v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27934w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f27935x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f27936y;

    /* renamed from: z */
    public static final ShapeKeyTokens f27937z;
    @NotNull
    public static final SwitchTokens INSTANCE = new SwitchTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27912a = ColorSchemeKeyTokens.Surface;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f27913b = colorSchemeKeyTokens;
        f27914c = colorSchemeKeyTokens;
        f27915d = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SurfaceVariant;
        f27916e = colorSchemeKeyTokens2;
        f27917f = colorSchemeKeyTokens2;
        f27918g = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f27919h = shapeKeyTokens;
        float f = (float) 28.0d;
        f27920i = C3641Dp.m73658constructorimpl(f);
        f27921j = C3641Dp.m73658constructorimpl(f);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.PrimaryContainer;
        f27922k = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnPrimaryContainer;
        f27923l = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Primary;
        f27924m = colorSchemeKeyTokens5;
        f27925n = ColorSchemeKeyTokens.OnPrimary;
        float f2 = (float) 24.0d;
        f27926o = C3641Dp.m73658constructorimpl(f2);
        f27927p = C3641Dp.m73658constructorimpl(f2);
        f27928q = colorSchemeKeyTokens3;
        f27929r = colorSchemeKeyTokens4;
        f27930s = colorSchemeKeyTokens5;
        f27931t = colorSchemeKeyTokens4;
        float f3 = (float) 16.0d;
        f27932u = C3641Dp.m73658constructorimpl(f3);
        f27933v = colorSchemeKeyTokens3;
        f27934w = colorSchemeKeyTokens4;
        f27935x = colorSchemeKeyTokens5;
        f27936y = colorSchemeKeyTokens5;
        f27937z = shapeKeyTokens;
        f27886A = C3641Dp.m73658constructorimpl((float) 40.0d);
        f27887B = C3641Dp.m73658constructorimpl((float) 32.0d);
        f27888C = C3641Dp.m73658constructorimpl((float) 2.0d);
        f27889D = shapeKeyTokens;
        f27890E = C3641Dp.m73658constructorimpl((float) 52.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27891F = colorSchemeKeyTokens6;
        f27892G = colorSchemeKeyTokens2;
        f27893H = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens7 = ColorSchemeKeyTokens.Outline;
        f27894I = colorSchemeKeyTokens7;
        f27895J = colorSchemeKeyTokens7;
        f27896K = C3641Dp.m73658constructorimpl(f3);
        f27897L = C3641Dp.m73658constructorimpl(f3);
        f27898M = colorSchemeKeyTokens6;
        f27899N = colorSchemeKeyTokens2;
        f27900O = colorSchemeKeyTokens2;
        f27901P = colorSchemeKeyTokens7;
        f27902Q = colorSchemeKeyTokens2;
        f27903R = C3641Dp.m73658constructorimpl(f3);
        f27904S = colorSchemeKeyTokens6;
        f27905T = colorSchemeKeyTokens2;
        f27906U = colorSchemeKeyTokens2;
        f27907V = colorSchemeKeyTokens7;
        f27908W = colorSchemeKeyTokens2;
        f27909X = colorSchemeKeyTokens7;
        f27910Y = C3641Dp.m73658constructorimpl(f2);
        f27911Z = C3641Dp.m73658constructorimpl(f2);
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedHandleColor() {
        return f27912a;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedIconColor() {
        return f27913b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedTrackColor() {
        return f27914c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedHandleColor() {
        return f27915d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedIconColor() {
        return f27916e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedTrackColor() {
        return f27917f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedTrackOutlineColor() {
        return f27918g;
    }

    @NotNull
    public final ShapeKeyTokens getHandleShape() {
        return f27919h;
    }

    /* renamed from: getIconHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71277getIconHandleHeightD9Ej5fM() {
        return f27910Y;
    }

    /* renamed from: getIconHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71278getIconHandleWidthD9Ej5fM() {
        return f27911Z;
    }

    /* renamed from: getPressedHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71279getPressedHandleHeightD9Ej5fM() {
        return f27920i;
    }

    /* renamed from: getPressedHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71280getPressedHandleWidthD9Ej5fM() {
        return f27921j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusHandleColor() {
        return f27922k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return f27923l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusTrackColor() {
        return f27924m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHandleColor() {
        return f27925n;
    }

    /* renamed from: getSelectedHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71281getSelectedHandleHeightD9Ej5fM() {
        return f27926o;
    }

    /* renamed from: getSelectedHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71282getSelectedHandleWidthD9Ej5fM() {
        return f27927p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverHandleColor() {
        return f27928q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return f27929r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverTrackColor() {
        return f27930s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return f27931t;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71283getSelectedIconSizeD9Ej5fM() {
        return f27932u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedHandleColor() {
        return f27933v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return f27934w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedTrackColor() {
        return f27935x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedTrackColor() {
        return f27936y;
    }

    @NotNull
    public final ShapeKeyTokens getStateLayerShape() {
        return f27937z;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM  reason: not valid java name */
    public final float m71284getStateLayerSizeD9Ej5fM() {
        return f27886A;
    }

    /* renamed from: getTrackHeight-D9Ej5fM  reason: not valid java name */
    public final float m71285getTrackHeightD9Ej5fM() {
        return f27887B;
    }

    /* renamed from: getTrackOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71286getTrackOutlineWidthD9Ej5fM() {
        return f27888C;
    }

    @NotNull
    public final ShapeKeyTokens getTrackShape() {
        return f27889D;
    }

    /* renamed from: getTrackWidth-D9Ej5fM  reason: not valid java name */
    public final float m71287getTrackWidthD9Ej5fM() {
        return f27890E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusHandleColor() {
        return f27891F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusIconColor() {
        return f27892G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrackColor() {
        return f27893H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrackOutlineColor() {
        return f27894I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHandleColor() {
        return f27895J;
    }

    /* renamed from: getUnselectedHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71288getUnselectedHandleHeightD9Ej5fM() {
        return f27896K;
    }

    /* renamed from: getUnselectedHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71289getUnselectedHandleWidthD9Ej5fM() {
        return f27897L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverHandleColor() {
        return f27898M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverIconColor() {
        return f27899N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrackColor() {
        return f27900O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrackOutlineColor() {
        return f27901P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return f27902Q;
    }

    /* renamed from: getUnselectedIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71290getUnselectedIconSizeD9Ej5fM() {
        return f27903R;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedHandleColor() {
        return f27904S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedIconColor() {
        return f27905T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrackColor() {
        return f27906U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrackOutlineColor() {
        return f27907V;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedTrackColor() {
        return f27908W;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedTrackOutlineColor() {
        return f27909X;
    }
}
