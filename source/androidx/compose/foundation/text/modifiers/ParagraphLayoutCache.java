package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.MultiParagraph;
import androidx.compose.p003ui.text.MultiParagraphIntrinsics;
import androidx.compose.p003ui.text.Paragraph;
import androidx.compose.p003ui.text.ParagraphIntrinsics;
import androidx.compose.p003ui.text.ParagraphIntrinsicsKt;
import androidx.compose.p003ui.text.ParagraphKt;
import androidx.compose.p003ui.text.TextLayoutInput;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.TextStyleKt;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b&\u0010'J%\u0010)\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J%\u0010+\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0016J\u000f\u0010,\u001a\u00020\u001bH\u0002¢\u0006\u0004\b,\u0010-R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010.R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010/R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00100R\u001f\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u00101R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R.\u0010>\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010E\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010K\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u00103\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010S\u001a\u00020L8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001f\u0010_\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b^\u0010NR\u0016\u0010a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u00101R\u0016\u0010c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u00101R\u0014\u0010f\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, m28850d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "layoutWithConstraints", "width", "intrinsicHeight", "(ILandroidx/compose/ui/unit/LayoutDirection;)I", "", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "update", "Landroidx/compose/ui/text/TextLayoutResult;", "slowCreateTextLayoutResultOrNull", "()Landroidx/compose/ui/text/TextLayoutResult;", "minIntrinsicWidth", "(Landroidx/compose/ui/unit/LayoutDirection;)I", "maxIntrinsicWidth", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "d", "(Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "Landroidx/compose/ui/text/Paragraph;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", OperatorName.CURVE_TO, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "Ljava/lang/String;", "Landroidx/compose/ui/text/TextStyle;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "I", "e", "Z", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/unit/Density;", "value", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "i", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "paragraph", OperatorName.SET_LINE_JOINSTYLE, "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "didOverflow", "Landroidx/compose/ui/unit/IntSize;", OperatorName.NON_STROKING_CMYK, OperatorName.SET_LINE_CAPSTYLE, "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "layoutSize", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", OperatorName.LINE_TO, "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "mMinLinesConstrainer", OperatorName.MOVE_TO, "Landroidx/compose/ui/text/ParagraphIntrinsics;", "paragraphIntrinsics", OperatorName.ENDPATH, "Landroidx/compose/ui/unit/LayoutDirection;", "intrinsicsLayoutDirection", "o", "prevConstraints", "p", "cachedIntrinsicHeightInputWidth", OperatorName.SAVE, "cachedIntrinsicHeight", "getObserveFontChanges$foundation_release", "()Lkotlin/Unit;", "observeFontChanges", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {

    /* renamed from: a */
    public String f14115a;

    /* renamed from: b */
    public TextStyle f14116b;

    /* renamed from: c */
    public FontFamily.Resolver f14117c;

    /* renamed from: d */
    public int f14118d;

    /* renamed from: e */
    public boolean f14119e;

    /* renamed from: f */
    public int f14120f;

    /* renamed from: g */
    public int f14121g;

    /* renamed from: h */
    public Density f14122h;

    /* renamed from: i */
    public Paragraph f14123i;

    /* renamed from: j */
    public boolean f14124j;

    /* renamed from: k */
    public long f14125k;

    /* renamed from: l */
    public MinLinesConstrainer f14126l;

    /* renamed from: m */
    public ParagraphIntrinsics f14127m;

    /* renamed from: n */
    public LayoutDirection f14128n;

    /* renamed from: o */
    public long f14129o;

    /* renamed from: p */
    public int f14130p;

    /* renamed from: q */
    public int f14131q;

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i, z, i2, i3);
    }

    /* renamed from: a */
    public final Paragraph m61036a(long j, LayoutDirection layoutDirection) {
        ParagraphIntrinsics m61033d = m61033d(layoutDirection);
        return ParagraphKt.m73117Paragraph_EkL_Y(m61033d, LayoutUtilsKt.m69807finalConstraintstfFHcEY(j, this.f14119e, this.f14118d, m61033d.getMaxIntrinsicWidth()), LayoutUtilsKt.m69808finalMaxLinesxdlQI24(this.f14119e, this.f14118d, this.f14120f), TextOverflow.m73587equalsimpl0(this.f14118d, TextOverflow.Companion.m73595getEllipsisgIe3tQ8()));
    }

    /* renamed from: b */
    public final void m61035b() {
        this.f14123i = null;
        this.f14127m = null;
        this.f14128n = null;
        this.f14130p = -1;
        this.f14131q = -1;
        this.f14129o = Constraints.Companion.m73634fixedJhjzzOo(0, 0);
        this.f14125k = IntSizeKt.IntSize(0, 0);
        this.f14124j = false;
    }

    /* renamed from: c */
    public final boolean m61034c(long j, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        Paragraph paragraph = this.f14123i;
        if (paragraph == null || (paragraphIntrinsics = this.f14127m) == null || paragraphIntrinsics.getHasStaleResolvedFonts() || layoutDirection != this.f14128n) {
            return true;
        }
        if (Constraints.m73620equalsimpl0(j, this.f14129o)) {
            return false;
        }
        if (Constraints.m73626getMaxWidthimpl(j) != Constraints.m73626getMaxWidthimpl(this.f14129o) || Constraints.m73625getMaxHeightimpl(j) < paragraph.getHeight() || paragraph.getDidExceedMaxLines()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final ParagraphIntrinsics m61033d(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics = this.f14127m;
        if (paragraphIntrinsics == null || layoutDirection != this.f14128n || paragraphIntrinsics.getHasStaleResolvedFonts()) {
            this.f14128n = layoutDirection;
            String str = this.f14115a;
            TextStyle resolveDefaults = TextStyleKt.resolveDefaults(this.f14116b, layoutDirection);
            Density density = this.f14122h;
            Intrinsics.checkNotNull(density);
            paragraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, resolveDefaults, (List) null, (List) null, density, this.f14117c, 12, (Object) null);
        }
        this.f14127m = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    @Nullable
    public final Density getDensity$foundation_release() {
        return this.f14122h;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.f14124j;
    }

    /* renamed from: getLayoutSize-YbymL2g$foundation_release  reason: not valid java name */
    public final long m69814getLayoutSizeYbymL2g$foundation_release() {
        return this.f14125k;
    }

    @NotNull
    public final Unit getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics paragraphIntrinsics = this.f14127m;
        if (paragraphIntrinsics != null) {
            paragraphIntrinsics.getHasStaleResolvedFonts();
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Paragraph getParagraph$foundation_release() {
        return this.f14123i;
    }

    public final int intrinsicHeight(int i, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i2 = this.f14130p;
        int i3 = this.f14131q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int ceilToIntPx = TextDelegateKt.ceilToIntPx(m61036a(ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.f14130p = i;
        this.f14131q = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutWithConstraints-K40F9xA  reason: not valid java name */
    public final boolean m69815layoutWithConstraintsK40F9xA(long j, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        boolean z = true;
        if (this.f14121g > 1) {
            MinLinesConstrainer.Companion companion = MinLinesConstrainer.Companion;
            MinLinesConstrainer minLinesConstrainer = this.f14126l;
            TextStyle textStyle = this.f14116b;
            Density density = this.f14122h;
            Intrinsics.checkNotNull(density);
            MinLinesConstrainer from = companion.from(minLinesConstrainer, layoutDirection, textStyle, density, this.f14117c);
            this.f14126l = from;
            j = from.m69810coerceMinLinesOh53vG4$foundation_release(j, this.f14121g);
        }
        boolean z2 = false;
        if (!m61034c(j, layoutDirection)) {
            if (!Constraints.m73620equalsimpl0(j, this.f14129o)) {
                Paragraph paragraph = this.f14123i;
                Intrinsics.checkNotNull(paragraph);
                long m73637constrain4WqzIAM = ConstraintsKt.m73637constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(paragraph.getWidth()), TextDelegateKt.ceilToIntPx(paragraph.getHeight())));
                this.f14125k = m73637constrain4WqzIAM;
                if (TextOverflow.m73587equalsimpl0(this.f14118d, TextOverflow.Companion.m73596getVisiblegIe3tQ8()) || (IntSize.m73818getWidthimpl(m73637constrain4WqzIAM) >= paragraph.getWidth() && IntSize.m73817getHeightimpl(m73637constrain4WqzIAM) >= paragraph.getHeight())) {
                    z = false;
                }
                this.f14124j = z;
            }
            return false;
        }
        Paragraph m61036a = m61036a(j, layoutDirection);
        this.f14129o = j;
        long m73637constrain4WqzIAM2 = ConstraintsKt.m73637constrain4WqzIAM(j, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m61036a.getWidth()), TextDelegateKt.ceilToIntPx(m61036a.getHeight())));
        this.f14125k = m73637constrain4WqzIAM2;
        if (!TextOverflow.m73587equalsimpl0(this.f14118d, TextOverflow.Companion.m73596getVisiblegIe3tQ8()) && (IntSize.m73818getWidthimpl(m73637constrain4WqzIAM2) < m61036a.getWidth() || IntSize.m73817getHeightimpl(m73637constrain4WqzIAM2) < m61036a.getHeight())) {
            z2 = true;
        }
        this.f14124j = z2;
        this.f14123i = m61036a;
        return true;
    }

    public final int maxIntrinsicWidth(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return TextDelegateKt.ceilToIntPx(m61033d(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return TextDelegateKt.ceilToIntPx(m61033d(layoutDirection).getMinIntrinsicWidth());
    }

    public final void setDensity$foundation_release(@Nullable Density density) {
        Density density2 = this.f14122h;
        if (density2 == null) {
            this.f14122h = density;
        } else if (density == null) {
            this.f14122h = density;
            m61035b();
        } else if (density2.getDensity() != density.getDensity() || density2.getFontScale() != density.getFontScale()) {
            this.f14122h = density;
            m61035b();
        }
    }

    public final void setDidOverflow$foundation_release(boolean z) {
        this.f14124j = z;
    }

    /* renamed from: setLayoutSize-ozmzZPI$foundation_release  reason: not valid java name */
    public final void m69816setLayoutSizeozmzZPI$foundation_release(long j) {
        this.f14125k = j;
    }

    public final void setParagraph$foundation_release(@Nullable Paragraph paragraph) {
        this.f14123i = paragraph;
    }

    @Nullable
    public final TextLayoutResult slowCreateTextLayoutResultOrNull() {
        Density density;
        LayoutDirection layoutDirection = this.f14128n;
        if (layoutDirection == null || (density = this.f14122h) == null) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.f14115a, null, null, 6, null);
        if (this.f14123i == null || this.f14127m == null) {
            return null;
        }
        long m73618copyZbe2FdA$default = Constraints.m73618copyZbe2FdA$default(this.f14129o, 0, 0, 0, 0, 10, null);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, this.f14116b, CollectionsKt__CollectionsKt.emptyList(), this.f14120f, this.f14119e, this.f14118d, density, layoutDirection, this.f14117c, m73618copyZbe2FdA$default, (DefaultConstructorMarker) null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, this.f14116b, CollectionsKt__CollectionsKt.emptyList(), density, this.f14117c), m73618copyZbe2FdA$default, this.f14120f, TextOverflow.m73587equalsimpl0(this.f14118d, TextOverflow.Companion.m73595getEllipsisgIe3tQ8()), null), this.f14125k, null);
    }

    /* renamed from: update-L6sJoHM  reason: not valid java name */
    public final void m69817updateL6sJoHM(@NotNull String text, @NotNull TextStyle style, @NotNull FontFamily.Resolver fontFamilyResolver, int i, boolean z, int i2, int i3) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f14115a = text;
        this.f14116b = style;
        this.f14117c = fontFamilyResolver;
        this.f14118d = i;
        this.f14119e = z;
        this.f14120f = i2;
        this.f14121g = i3;
        m61035b();
    }

    public ParagraphLayoutCache(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i, boolean z, int i2, int i3) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f14115a = text;
        this.f14116b = style;
        this.f14117c = fontFamilyResolver;
        this.f14118d = i;
        this.f14119e = z;
        this.f14120f = i2;
        this.f14121g = i3;
        this.f14125k = IntSizeKt.IntSize(0, 0);
        this.f14129o = Constraints.Companion.m73634fixedJhjzzOo(0, 0);
        this.f14130p = -1;
        this.f14131q = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i4 & 8) != 0 ? TextOverflow.Companion.m73594getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, null);
    }
}
