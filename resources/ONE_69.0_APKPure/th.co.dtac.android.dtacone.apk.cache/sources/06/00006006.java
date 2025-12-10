package androidx.compose.p003ui.graphics;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m29142d2 = {"Landroidx/compose/ui/graphics/PixelMap;", "", "", "buffer", "", "width", "height", "bufferOffset", "stride", "<init>", "([IIIII)V", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Landroidx/compose/ui/graphics/Color;", "get-WaAFU9c", "(II)J", "get", PDPageLabelRange.STYLE_LETTERS_LOWER, "[I", "getBuffer", "()[I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getWidth", "()I", OperatorName.CURVE_TO, "getHeight", "d", "getBufferOffset", "e", "getStride", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.PixelMap */
/* loaded from: classes2.dex */
public final class PixelMap {

    /* renamed from: a */
    public final int[] f29211a;

    /* renamed from: b */
    public final int f29212b;

    /* renamed from: c */
    public final int f29213c;

    /* renamed from: d */
    public final int f29214d;

    /* renamed from: e */
    public final int f29215e;

    public PixelMap(@NotNull int[] buffer, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f29211a = buffer;
        this.f29212b = i;
        this.f29213c = i2;
        this.f29214d = i3;
        this.f29215e = i4;
    }

    /* renamed from: get-WaAFU9c  reason: not valid java name */
    public final long m72173getWaAFU9c(int i, int i2) {
        return ColorKt.Color(this.f29211a[this.f29214d + (i2 * this.f29215e) + i]);
    }

    @NotNull
    public final int[] getBuffer() {
        return this.f29211a;
    }

    public final int getBufferOffset() {
        return this.f29214d;
    }

    public final int getHeight() {
        return this.f29213c;
    }

    public final int getStride() {
        return this.f29215e;
    }

    public final int getWidth() {
        return this.f29212b;
    }
}