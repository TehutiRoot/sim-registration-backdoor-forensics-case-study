package coil.decode;

import android.graphics.drawable.Drawable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, m29142d2 = {"Lcoil/decode/DecodeResult;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "copy", "(Landroid/graphics/drawable/Drawable;Z)Lcoil/decode/DecodeResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "()Z", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DecodeResult {

    /* renamed from: a */
    public final Drawable f40494a;

    /* renamed from: b */
    public final boolean f40495b;

    public DecodeResult(@NotNull Drawable drawable, boolean z) {
        this.f40494a = drawable;
        this.f40495b = z;
    }

    public static /* synthetic */ DecodeResult copy$default(DecodeResult decodeResult, Drawable drawable, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = decodeResult.f40494a;
        }
        if ((i & 2) != 0) {
            z = decodeResult.f40495b;
        }
        return decodeResult.copy(drawable, z);
    }

    @NotNull
    public final DecodeResult copy(@NotNull Drawable drawable, boolean z) {
        return new DecodeResult(drawable, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DecodeResult) {
            DecodeResult decodeResult = (DecodeResult) obj;
            if (Intrinsics.areEqual(this.f40494a, decodeResult.f40494a) && this.f40495b == decodeResult.f40495b) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Drawable getDrawable() {
        return this.f40494a;
    }

    public int hashCode() {
        return (this.f40494a.hashCode() * 31) + AbstractC1694Xp.m65565a(this.f40495b);
    }

    public final boolean isSampled() {
        return this.f40495b;
    }
}