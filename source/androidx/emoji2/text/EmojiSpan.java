package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Preconditions;

@RequiresApi(19)
/* loaded from: classes2.dex */
public abstract class EmojiSpan extends ReplacementSpan {

    /* renamed from: b */
    public final TypefaceEmojiRasterizer f35155b;

    /* renamed from: a */
    public final Paint.FontMetricsInt f35154a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public short f35156c = -1;

    /* renamed from: d */
    public short f35157d = -1;

    /* renamed from: e */
    public float f35158e = 1.0f;

    public EmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.checkNotNull(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.f35155b = typefaceEmojiRasterizer;
    }

    /* renamed from: a */
    public final int m54767a() {
        return this.f35156c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final int getHeight() {
        return this.f35157d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public final int getId() {
        return getTypefaceRasterizer().getId();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f35154a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f35154a;
        this.f35158e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f35155b.getHeight();
        this.f35157d = (short) (this.f35155b.getHeight() * this.f35158e);
        short width = (short) (this.f35155b.getWidth() * this.f35158e);
        this.f35156c = width;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f35154a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return width;
    }

    @NonNull
    public final TypefaceEmojiRasterizer getTypefaceRasterizer() {
        return this.f35155b;
    }
}
