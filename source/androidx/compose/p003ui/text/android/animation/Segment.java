package androidx.compose.p003ui.text.android.animation;

import androidx.compose.p003ui.text.android.InternalPlatformTextApi;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalPlatformTextApi
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\f¨\u0006)"}, m28850d2 = {"Landroidx/compose/ui/text/android/animation/Segment;", "", "", "startOffset", "endOffset", "left", "top", "right", "bottom", "<init>", "(IIIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "copy", "(IIIIII)Landroidx/compose/ui/text/android/animation/Segment;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getStartOffset", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEndOffset", OperatorName.CURVE_TO, "getLeft", "d", "getTop", "e", "getRight", OperatorName.FILL_NON_ZERO, "getBottom", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.animation.Segment */
/* loaded from: classes2.dex */
public final class Segment {

    /* renamed from: a */
    public final int f31165a;

    /* renamed from: b */
    public final int f31166b;

    /* renamed from: c */
    public final int f31167c;

    /* renamed from: d */
    public final int f31168d;

    /* renamed from: e */
    public final int f31169e;

    /* renamed from: f */
    public final int f31170f;

    public Segment(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f31165a = i;
        this.f31166b = i2;
        this.f31167c = i3;
        this.f31168d = i4;
        this.f31169e = i5;
        this.f31170f = i6;
    }

    public static /* synthetic */ Segment copy$default(Segment segment, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = segment.f31165a;
        }
        if ((i7 & 2) != 0) {
            i2 = segment.f31166b;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = segment.f31167c;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = segment.f31168d;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = segment.f31169e;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = segment.f31170f;
        }
        return segment.copy(i, i8, i9, i10, i11, i6);
    }

    public final int component1() {
        return this.f31165a;
    }

    public final int component2() {
        return this.f31166b;
    }

    public final int component3() {
        return this.f31167c;
    }

    public final int component4() {
        return this.f31168d;
    }

    public final int component5() {
        return this.f31169e;
    }

    public final int component6() {
        return this.f31170f;
    }

    @NotNull
    public final Segment copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new Segment(i, i2, i3, i4, i5, i6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Segment) {
            Segment segment = (Segment) obj;
            return this.f31165a == segment.f31165a && this.f31166b == segment.f31166b && this.f31167c == segment.f31167c && this.f31168d == segment.f31168d && this.f31169e == segment.f31169e && this.f31170f == segment.f31170f;
        }
        return false;
    }

    public final int getBottom() {
        return this.f31170f;
    }

    public final int getEndOffset() {
        return this.f31166b;
    }

    public final int getLeft() {
        return this.f31167c;
    }

    public final int getRight() {
        return this.f31169e;
    }

    public final int getStartOffset() {
        return this.f31165a;
    }

    public final int getTop() {
        return this.f31168d;
    }

    public int hashCode() {
        return (((((((((this.f31165a * 31) + this.f31166b) * 31) + this.f31167c) * 31) + this.f31168d) * 31) + this.f31169e) * 31) + this.f31170f;
    }

    @NotNull
    public String toString() {
        return "Segment(startOffset=" + this.f31165a + ", endOffset=" + this.f31166b + ", left=" + this.f31167c + ", top=" + this.f31168d + ", right=" + this.f31169e + ", bottom=" + this.f31170f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
