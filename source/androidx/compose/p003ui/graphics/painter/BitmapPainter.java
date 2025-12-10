package androidx.compose.p003ui.graphics.painter;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.FilterQuality;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010&R+\u0010.\u001a\u00020(8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010-R\u001d\u00100\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b/\u0010&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001d\u00108\u001a\u0002058VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m28850d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/ImageBitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "<init>", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "(JJ)J", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/graphics/ImageBitmap;", OperatorName.CLOSE_PATH, OperatorName.SET_LINE_CAPSTYLE, "i", "Landroidx/compose/ui/graphics/FilterQuality;", OperatorName.SET_LINE_JOINSTYLE, "I", "getFilterQuality-f-v9h1I$ui_graphics_release", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "filterQuality", OperatorName.NON_STROKING_CMYK, "size", OperatorName.LINE_TO, "F", OperatorName.MOVE_TO, "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.painter.BitmapPainter */
/* loaded from: classes2.dex */
public final class BitmapPainter extends Painter {

    /* renamed from: g */
    public final ImageBitmap f29328g;

    /* renamed from: h */
    public final long f29329h;

    /* renamed from: i */
    public final long f29330i;

    /* renamed from: j */
    public int f29331j;

    /* renamed from: k */
    public final long f29332k;

    /* renamed from: l */
    public float f29333l;

    /* renamed from: m */
    public ColorFilter f29334m;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j, j2);
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.f29333l = f;
        return true;
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f29334m = colorFilter;
        return true;
    }

    /* renamed from: e */
    public final long m59678e(long j, long j2) {
        if (IntOffset.m73776getXimpl(j) >= 0 && IntOffset.m73777getYimpl(j) >= 0 && IntSize.m73818getWidthimpl(j2) >= 0 && IntSize.m73817getHeightimpl(j2) >= 0 && IntSize.m73818getWidthimpl(j2) <= this.f29328g.getWidth() && IntSize.m73817getHeightimpl(j2) <= this.f29328g.getHeight()) {
            return j2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        if (Intrinsics.areEqual(this.f29328g, bitmapPainter.f29328g) && IntOffset.m73775equalsimpl0(this.f29329h, bitmapPainter.f29329h) && IntSize.m73816equalsimpl0(this.f29330i, bitmapPainter.f29330i) && FilterQuality.m71822equalsimpl0(this.f29331j, bitmapPainter.f29331j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release  reason: not valid java name */
    public final int m72235getFilterQualityfv9h1I$ui_graphics_release() {
        return this.f29331j;
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long mo72236getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m73828toSizeozmzZPI(this.f29332k);
    }

    public int hashCode() {
        return (((((this.f29328g.hashCode() * 31) + IntOffset.m73778hashCodeimpl(this.f29329h)) * 31) + IntSize.m73819hashCodeimpl(this.f29330i)) * 31) + FilterQuality.m71823hashCodeimpl(this.f29331j);
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        AbstractC12212lK.m26488z(drawScope, this.f29328g, this.f29329h, this.f29330i, 0L, IntSizeKt.IntSize(AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(drawScope.mo72144getSizeNHjbRc())), AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(drawScope.mo72144getSizeNHjbRc()))), this.f29333l, null, this.f29334m, 0, this.f29331j, 328, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release  reason: not valid java name */
    public final void m72237setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.f29331j = i;
    }

    @NotNull
    public String toString() {
        return "BitmapPainter(image=" + this.f29328g + ", srcOffset=" + ((Object) IntOffset.m73783toStringimpl(this.f29329h)) + ", srcSize=" + ((Object) IntSize.m73821toStringimpl(this.f29330i)) + ", filterQuality=" + ((Object) FilterQuality.m71824toStringimpl(this.f29331j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.Companion.m73786getZeronOccac() : j, (i & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2, null);
    }

    public BitmapPainter(ImageBitmap image, long j, long j2) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f29328g = image;
        this.f29329h = j;
        this.f29330i = j2;
        this.f29331j = FilterQuality.Companion.m71827getLowfv9h1I();
        this.f29332k = m59678e(j, j2);
        this.f29333l = 1.0f;
    }
}
