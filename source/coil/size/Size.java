package coil.size;

import ch.qos.logback.core.CoreConstants;
import coil.size.Dimension;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, m28850d2 = {"Lcoil/size/Size;", "", "Lcoil/size/Dimension;", "width", "height", "<init>", "(Lcoil/size/Dimension;Lcoil/size/Dimension;)V", "component1", "()Lcoil/size/Dimension;", "component2", "copy", "(Lcoil/size/Dimension;Lcoil/size/Dimension;)Lcoil/size/Size;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcoil/size/Dimension;", "getWidth", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getHeight", "Companion", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Size {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final Size ORIGINAL;

    /* renamed from: a */
    public final Dimension f40832a;

    /* renamed from: b */
    public final Dimension f40833b;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lcoil/size/Size$Companion;", "", "()V", "ORIGINAL", "Lcoil/size/Size;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        Dimension.Undefined undefined = Dimension.Undefined.INSTANCE;
        ORIGINAL = new Size(undefined, undefined);
    }

    public Size(@NotNull Dimension dimension, @NotNull Dimension dimension2) {
        this.f40832a = dimension;
        this.f40833b = dimension2;
    }

    public static /* synthetic */ Size copy$default(Size size, Dimension dimension, Dimension dimension2, int i, Object obj) {
        if ((i & 1) != 0) {
            dimension = size.f40832a;
        }
        if ((i & 2) != 0) {
            dimension2 = size.f40833b;
        }
        return size.copy(dimension, dimension2);
    }

    @NotNull
    public final Dimension component1() {
        return this.f40832a;
    }

    @NotNull
    public final Dimension component2() {
        return this.f40833b;
    }

    @NotNull
    public final Size copy(@NotNull Dimension dimension, @NotNull Dimension dimension2) {
        return new Size(dimension, dimension2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return Intrinsics.areEqual(this.f40832a, size.f40832a) && Intrinsics.areEqual(this.f40833b, size.f40833b);
        }
        return false;
    }

    @NotNull
    public final Dimension getHeight() {
        return this.f40833b;
    }

    @NotNull
    public final Dimension getWidth() {
        return this.f40832a;
    }

    public int hashCode() {
        return (this.f40832a.hashCode() * 31) + this.f40833b.hashCode();
    }

    @NotNull
    public String toString() {
        return "Size(width=" + this.f40832a + ", height=" + this.f40833b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
