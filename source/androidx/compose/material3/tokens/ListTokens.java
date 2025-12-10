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

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b_\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\"\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b!\u0010\u000eR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010(\u001a\u00020\u00198\u0006X\u0086D¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000eR \u0010+\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010\u000eR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u0010:\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010F\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010O\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010R\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bQ\u0010\u000eR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010X\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\bW\u0010\bR\u0017\u0010[\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bZ\u0010NR\u0017\u0010^\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\\\u0010\u0012\u001a\u0004\b]\u0010\u0014R \u0010a\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010\f\u001a\u0004\b`\u0010\u000eR\u0017\u0010d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bb\u0010\u0006\u001a\u0004\bc\u0010\bR \u0010g\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\be\u0010\f\u001a\u0004\bf\u0010\u000eR \u0010j\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bh\u0010\f\u001a\u0004\bi\u0010\u000eR\u0017\u0010m\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bk\u0010\u0012\u001a\u0004\bl\u0010\u0014R \u0010o\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\f\u001a\u0004\bn\u0010\u000eR\u0017\u0010r\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bp\u0010\u0012\u001a\u0004\bq\u0010\u0014R \u0010u\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bs\u0010\f\u001a\u0004\bt\u0010\u000eR \u0010x\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bv\u0010\f\u001a\u0004\bw\u0010\u000eR\u0017\u0010{\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\bR\u0017\u0010~\u001a\u00020J8\u0006¢\u0006\f\n\u0004\b|\u0010L\u001a\u0004\b}\u0010NR\u0019\u0010\u0081\u0001\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u001a\u0010\u0084\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\u0006\u001a\u0005\b\u0083\u0001\u0010\bR\u001a\u0010\u0087\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR\u001a\u0010\u008a\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u0006\u001a\u0005\b\u0089\u0001\u0010\bR#\u0010\u008d\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\f\u001a\u0005\b\u008c\u0001\u0010\u000eR\u001a\u0010\u0090\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0006\u001a\u0005\b\u008f\u0001\u0010\bR\u001a\u0010\u0093\u0001\u001a\u00020J8\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010L\u001a\u0005\b\u0092\u0001\u0010NR#\u0010\u0096\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\f\u001a\u0005\b\u0095\u0001\u0010\u000eR\u001a\u0010\u0099\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR#\u0010\u009c\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010\f\u001a\u0005\b\u009b\u0001\u0010\u000eR\u001a\u0010\u009f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\bR\u001a\u0010¢\u0001\u001a\u00020J8\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010L\u001a\u0005\b¡\u0001\u0010NR#\u0010¥\u0001\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b£\u0001\u0010\f\u001a\u0005\b¤\u0001\u0010\u000eR\u001a\u0010¨\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010\u0006\u001a\u0005\b§\u0001\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006©\u0001"}, m28850d2 = {"Landroidx/compose/material3/tokens/ListTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getListItemContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ListItemContainerColor", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getListItemContainerElevation-D9Ej5fM", "()F", "ListItemContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CURVE_TO, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getListItemContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ListItemContainerShape", "d", "getListItemDisabledLabelTextColor", "ListItemDisabledLabelTextColor", "", "e", "getListItemDisabledLabelTextOpacity", "ListItemDisabledLabelTextOpacity", OperatorName.FILL_NON_ZERO, "getListItemDisabledLeadingIconColor", "ListItemDisabledLeadingIconColor", OperatorName.NON_STROKING_GRAY, "getListItemDisabledLeadingIconOpacity", "ListItemDisabledLeadingIconOpacity", OperatorName.CLOSE_PATH, "getListItemDisabledTrailingIconColor", "ListItemDisabledTrailingIconColor", "i", "getListItemDisabledTrailingIconOpacity", "ListItemDisabledTrailingIconOpacity", OperatorName.SET_LINE_JOINSTYLE, "getListItemDraggedContainerElevation-D9Ej5fM", "ListItemDraggedContainerElevation", OperatorName.NON_STROKING_CMYK, "getListItemDraggedLabelTextColor", "ListItemDraggedLabelTextColor", OperatorName.LINE_TO, "getListItemDraggedLeadingIconColor", "ListItemDraggedLeadingIconColor", OperatorName.MOVE_TO, "getListItemDraggedTrailingIconColor", "ListItemDraggedTrailingIconColor", OperatorName.ENDPATH, "getListItemFocusLabelTextColor", "ListItemFocusLabelTextColor", "o", "getListItemFocusLeadingIconColor", "ListItemFocusLeadingIconColor", "p", "getListItemFocusTrailingIconColor", "ListItemFocusTrailingIconColor", OperatorName.SAVE, "getListItemHoverLabelTextColor", "ListItemHoverLabelTextColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getListItemHoverLeadingIconColor", "ListItemHoverLeadingIconColor", OperatorName.CLOSE_AND_STROKE, "getListItemHoverTrailingIconColor", "ListItemHoverTrailingIconColor", "t", "getListItemLabelTextColor", "ListItemLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "u", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getListItemLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ListItemLabelTextFont", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getListItemLargeLeadingVideoHeight-D9Ej5fM", "ListItemLargeLeadingVideoHeight", OperatorName.SET_LINE_WIDTH, "getListItemLeadingAvatarColor", "ListItemLeadingAvatarColor", "x", "getListItemLeadingAvatarLabelColor", "ListItemLeadingAvatarLabelColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getListItemLeadingAvatarLabelFont", "ListItemLeadingAvatarLabelFont", "z", "getListItemLeadingAvatarShape", "ListItemLeadingAvatarShape", "A", "getListItemLeadingAvatarSize-D9Ej5fM", "ListItemLeadingAvatarSize", "B", "getListItemLeadingIconColor", "ListItemLeadingIconColor", "C", "getListItemLeadingIconSize-D9Ej5fM", "ListItemLeadingIconSize", "D", "getListItemLeadingImageHeight-D9Ej5fM", "ListItemLeadingImageHeight", ExifInterface.LONGITUDE_EAST, "getListItemLeadingImageShape", "ListItemLeadingImageShape", "getListItemLeadingImageWidth-D9Ej5fM", "ListItemLeadingImageWidth", OperatorName.STROKING_COLOR_GRAY, "getListItemLeadingVideoShape", "ListItemLeadingVideoShape", "H", "getListItemLeadingVideoWidth-D9Ej5fM", "ListItemLeadingVideoWidth", "I", "getListItemOneLineContainerHeight-D9Ej5fM", "ListItemOneLineContainerHeight", OperatorName.SET_LINE_CAPSTYLE, "getListItemOverlineColor", "ListItemOverlineColor", "K", "getListItemOverlineFont", "ListItemOverlineFont", "L", "getListItemPressedLabelTextColor", "ListItemPressedLabelTextColor", "M", "getListItemPressedLeadingIconColor", "ListItemPressedLeadingIconColor", "N", "getListItemPressedTrailingIconColor", "ListItemPressedTrailingIconColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getListItemSelectedTrailingIconColor", "ListItemSelectedTrailingIconColor", "P", "getListItemSmallLeadingVideoHeight-D9Ej5fM", "ListItemSmallLeadingVideoHeight", OperatorName.RESTORE, "getListItemSupportingTextColor", "ListItemSupportingTextColor", "R", "getListItemSupportingTextFont", "ListItemSupportingTextFont", "S", "getListItemThreeLineContainerHeight-D9Ej5fM", "ListItemThreeLineContainerHeight", "T", "getListItemTrailingIconColor", "ListItemTrailingIconColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getListItemTrailingIconSize-D9Ej5fM", "ListItemTrailingIconSize", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getListItemTrailingSupportingTextColor", "ListItemTrailingSupportingTextColor", "W", "getListItemTrailingSupportingTextFont", "ListItemTrailingSupportingTextFont", "X", "getListItemTwoLineContainerHeight-D9Ej5fM", "ListItemTwoLineContainerHeight", "Y", "getListItemUnselectedTrailingIconColor", "ListItemUnselectedTrailingIconColor", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTokens.kt\nandroidx/compose/material3/tokens/ListTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,74:1\n164#2:75\n164#2:76\n164#2:77\n164#2:78\n164#2:79\n164#2:80\n164#2:81\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n*S KotlinDebug\n*F\n+ 1 ListTokens.kt\nandroidx/compose/material3/tokens/ListTokens\n*L\n44#1:75\n49#1:76\n51#1:77\n52#1:78\n54#1:79\n56#1:80\n57#1:81\n64#1:82\n67#1:83\n69#1:84\n72#1:85\n*E\n"})
/* loaded from: classes2.dex */
public final class ListTokens {

    /* renamed from: A */
    public static final float f27263A;

    /* renamed from: B */
    public static final ColorSchemeKeyTokens f27264B;

    /* renamed from: C */
    public static final float f27265C;

    /* renamed from: D */
    public static final float f27266D;

    /* renamed from: E */
    public static final ShapeKeyTokens f27267E;

    /* renamed from: F */
    public static final float f27268F;

    /* renamed from: G */
    public static final ShapeKeyTokens f27269G;

    /* renamed from: H */
    public static final float f27270H;

    /* renamed from: I */
    public static final float f27271I;

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f27272J;

    /* renamed from: K */
    public static final TypographyKeyTokens f27273K;

    /* renamed from: L */
    public static final ColorSchemeKeyTokens f27274L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f27275M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f27276N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f27277O;

    /* renamed from: P */
    public static final float f27278P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f27279Q;

    /* renamed from: R */
    public static final TypographyKeyTokens f27280R;

    /* renamed from: S */
    public static final float f27281S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f27282T;

    /* renamed from: U */
    public static final float f27283U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f27284V;

    /* renamed from: W */
    public static final TypographyKeyTokens f27285W;

    /* renamed from: X */
    public static final float f27286X;

    /* renamed from: Y */
    public static final ColorSchemeKeyTokens f27287Y;

    /* renamed from: b */
    public static final float f27289b;

    /* renamed from: c */
    public static final ShapeKeyTokens f27290c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f27291d;

    /* renamed from: e */
    public static final float f27292e;

    /* renamed from: f */
    public static final ColorSchemeKeyTokens f27293f;

    /* renamed from: g */
    public static final float f27294g;

    /* renamed from: h */
    public static final ColorSchemeKeyTokens f27295h;

    /* renamed from: i */
    public static final float f27296i;

    /* renamed from: j */
    public static final float f27297j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f27298k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f27299l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f27300m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f27301n;

    /* renamed from: o */
    public static final ColorSchemeKeyTokens f27302o;

    /* renamed from: p */
    public static final ColorSchemeKeyTokens f27303p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f27304q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f27305r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f27306s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f27307t;

    /* renamed from: u */
    public static final TypographyKeyTokens f27308u;

    /* renamed from: v */
    public static final float f27309v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f27310w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f27311x;

    /* renamed from: y */
    public static final TypographyKeyTokens f27312y;

    /* renamed from: z */
    public static final ShapeKeyTokens f27313z;
    @NotNull
    public static final ListTokens INSTANCE = new ListTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f27288a = ColorSchemeKeyTokens.Surface;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        f27289b = elevationTokens.m70955getLevel0D9Ej5fM();
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerNone;
        f27290c = shapeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f27291d = colorSchemeKeyTokens;
        f27292e = 0.3f;
        f27293f = colorSchemeKeyTokens;
        f27294g = 0.38f;
        f27295h = colorSchemeKeyTokens;
        f27296i = 0.38f;
        f27297j = elevationTokens.m70959getLevel4D9Ej5fM();
        f27298k = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27299l = colorSchemeKeyTokens2;
        f27300m = colorSchemeKeyTokens2;
        f27301n = colorSchemeKeyTokens;
        f27302o = colorSchemeKeyTokens2;
        f27303p = colorSchemeKeyTokens2;
        f27304q = colorSchemeKeyTokens;
        f27305r = colorSchemeKeyTokens2;
        f27306s = colorSchemeKeyTokens2;
        f27307t = colorSchemeKeyTokens;
        f27308u = TypographyKeyTokens.BodyLarge;
        f27309v = C3641Dp.m73658constructorimpl((float) 69.0d);
        f27310w = ColorSchemeKeyTokens.PrimaryContainer;
        f27311x = ColorSchemeKeyTokens.OnPrimaryContainer;
        f27312y = TypographyKeyTokens.TitleMedium;
        f27313z = ShapeKeyTokens.CornerFull;
        f27263A = C3641Dp.m73658constructorimpl((float) 40.0d);
        f27264B = colorSchemeKeyTokens2;
        f27265C = C3641Dp.m73658constructorimpl((float) 18.0d);
        float f = (float) 56.0d;
        f27266D = C3641Dp.m73658constructorimpl(f);
        f27267E = shapeKeyTokens;
        f27268F = C3641Dp.m73658constructorimpl(f);
        f27269G = shapeKeyTokens;
        f27270H = C3641Dp.m73658constructorimpl((float) 100.0d);
        f27271I = C3641Dp.m73658constructorimpl(f);
        f27272J = colorSchemeKeyTokens2;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.LabelSmall;
        f27273K = typographyKeyTokens;
        f27274L = colorSchemeKeyTokens;
        f27275M = colorSchemeKeyTokens2;
        f27276N = colorSchemeKeyTokens2;
        f27277O = ColorSchemeKeyTokens.Primary;
        f27278P = C3641Dp.m73658constructorimpl(f);
        f27279Q = colorSchemeKeyTokens2;
        f27280R = TypographyKeyTokens.BodyMedium;
        f27281S = C3641Dp.m73658constructorimpl((float) 88.0d);
        f27282T = colorSchemeKeyTokens2;
        f27283U = C3641Dp.m73658constructorimpl((float) 24.0d);
        f27284V = colorSchemeKeyTokens2;
        f27285W = typographyKeyTokens;
        f27286X = C3641Dp.m73658constructorimpl((float) 72.0d);
        f27287Y = colorSchemeKeyTokens;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemContainerColor() {
        return f27288a;
    }

    /* renamed from: getListItemContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71086getListItemContainerElevationD9Ej5fM() {
        return f27289b;
    }

    @NotNull
    public final ShapeKeyTokens getListItemContainerShape() {
        return f27290c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledLabelTextColor() {
        return f27291d;
    }

    public final float getListItemDisabledLabelTextOpacity() {
        return f27292e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledLeadingIconColor() {
        return f27293f;
    }

    public final float getListItemDisabledLeadingIconOpacity() {
        return f27294g;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDisabledTrailingIconColor() {
        return f27295h;
    }

    public final float getListItemDisabledTrailingIconOpacity() {
        return f27296i;
    }

    /* renamed from: getListItemDraggedContainerElevation-D9Ej5fM  reason: not valid java name */
    public final float m71087getListItemDraggedContainerElevationD9Ej5fM() {
        return f27297j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDraggedLabelTextColor() {
        return f27298k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDraggedLeadingIconColor() {
        return f27299l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemDraggedTrailingIconColor() {
        return f27300m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemFocusLabelTextColor() {
        return f27301n;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemFocusLeadingIconColor() {
        return f27302o;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemFocusTrailingIconColor() {
        return f27303p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemHoverLabelTextColor() {
        return f27304q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemHoverLeadingIconColor() {
        return f27305r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemHoverTrailingIconColor() {
        return f27306s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLabelTextColor() {
        return f27307t;
    }

    @NotNull
    public final TypographyKeyTokens getListItemLabelTextFont() {
        return f27308u;
    }

    /* renamed from: getListItemLargeLeadingVideoHeight-D9Ej5fM  reason: not valid java name */
    public final float m71088getListItemLargeLeadingVideoHeightD9Ej5fM() {
        return f27309v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingAvatarColor() {
        return f27310w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingAvatarLabelColor() {
        return f27311x;
    }

    @NotNull
    public final TypographyKeyTokens getListItemLeadingAvatarLabelFont() {
        return f27312y;
    }

    @NotNull
    public final ShapeKeyTokens getListItemLeadingAvatarShape() {
        return f27313z;
    }

    /* renamed from: getListItemLeadingAvatarSize-D9Ej5fM  reason: not valid java name */
    public final float m71089getListItemLeadingAvatarSizeD9Ej5fM() {
        return f27263A;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemLeadingIconColor() {
        return f27264B;
    }

    /* renamed from: getListItemLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71090getListItemLeadingIconSizeD9Ej5fM() {
        return f27265C;
    }

    /* renamed from: getListItemLeadingImageHeight-D9Ej5fM  reason: not valid java name */
    public final float m71091getListItemLeadingImageHeightD9Ej5fM() {
        return f27266D;
    }

    @NotNull
    public final ShapeKeyTokens getListItemLeadingImageShape() {
        return f27267E;
    }

    /* renamed from: getListItemLeadingImageWidth-D9Ej5fM  reason: not valid java name */
    public final float m71092getListItemLeadingImageWidthD9Ej5fM() {
        return f27268F;
    }

    @NotNull
    public final ShapeKeyTokens getListItemLeadingVideoShape() {
        return f27269G;
    }

    /* renamed from: getListItemLeadingVideoWidth-D9Ej5fM  reason: not valid java name */
    public final float m71093getListItemLeadingVideoWidthD9Ej5fM() {
        return f27270H;
    }

    /* renamed from: getListItemOneLineContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71094getListItemOneLineContainerHeightD9Ej5fM() {
        return f27271I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemOverlineColor() {
        return f27272J;
    }

    @NotNull
    public final TypographyKeyTokens getListItemOverlineFont() {
        return f27273K;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemPressedLabelTextColor() {
        return f27274L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemPressedLeadingIconColor() {
        return f27275M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemPressedTrailingIconColor() {
        return f27276N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemSelectedTrailingIconColor() {
        return f27277O;
    }

    /* renamed from: getListItemSmallLeadingVideoHeight-D9Ej5fM  reason: not valid java name */
    public final float m71095getListItemSmallLeadingVideoHeightD9Ej5fM() {
        return f27278P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemSupportingTextColor() {
        return f27279Q;
    }

    @NotNull
    public final TypographyKeyTokens getListItemSupportingTextFont() {
        return f27280R;
    }

    /* renamed from: getListItemThreeLineContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71096getListItemThreeLineContainerHeightD9Ej5fM() {
        return f27281S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemTrailingIconColor() {
        return f27282T;
    }

    /* renamed from: getListItemTrailingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71097getListItemTrailingIconSizeD9Ej5fM() {
        return f27283U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemTrailingSupportingTextColor() {
        return f27284V;
    }

    @NotNull
    public final TypographyKeyTokens getListItemTrailingSupportingTextFont() {
        return f27285W;
    }

    /* renamed from: getListItemTwoLineContainerHeight-D9Ej5fM  reason: not valid java name */
    public final float m71098getListItemTwoLineContainerHeightD9Ej5fM() {
        return f27286X;
    }

    @NotNull
    public final ColorSchemeKeyTokens getListItemUnselectedTrailingIconColor() {
        return f27287Y;
    }
}
