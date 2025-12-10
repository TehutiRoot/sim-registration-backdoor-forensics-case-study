package coil.request;

import android.graphics.drawable.Drawable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m28850d2 = {"Lcoil/request/ErrorResult;", "Lcoil/request/ImageResult;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lcoil/request/ImageRequest;", "request", "", "throwable", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Ljava/lang/Throwable;)V", "copy", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Ljava/lang/Throwable;)Lcoil/request/ErrorResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", OperatorName.CURVE_TO, "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ErrorResult extends ImageResult {

    /* renamed from: a */
    public final Drawable f40693a;

    /* renamed from: b */
    public final ImageRequest f40694b;

    /* renamed from: c */
    public final Throwable f40695c;

    public ErrorResult(@Nullable Drawable drawable, @NotNull ImageRequest imageRequest, @NotNull Throwable th2) {
        super(null);
        this.f40693a = drawable;
        this.f40694b = imageRequest;
        this.f40695c = th2;
    }

    public static /* synthetic */ ErrorResult copy$default(ErrorResult errorResult, Drawable drawable, ImageRequest imageRequest, Throwable th2, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = errorResult.getDrawable();
        }
        if ((i & 2) != 0) {
            imageRequest = errorResult.getRequest();
        }
        if ((i & 4) != 0) {
            th2 = errorResult.f40695c;
        }
        return errorResult.copy(drawable, imageRequest, th2);
    }

    @NotNull
    public final ErrorResult copy(@Nullable Drawable drawable, @NotNull ImageRequest imageRequest, @NotNull Throwable th2) {
        return new ErrorResult(drawable, imageRequest, th2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorResult) {
            ErrorResult errorResult = (ErrorResult) obj;
            if (Intrinsics.areEqual(getDrawable(), errorResult.getDrawable()) && Intrinsics.areEqual(getRequest(), errorResult.getRequest()) && Intrinsics.areEqual(this.f40695c, errorResult.f40695c)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.request.ImageResult
    @Nullable
    public Drawable getDrawable() {
        return this.f40693a;
    }

    @Override // coil.request.ImageResult
    @NotNull
    public ImageRequest getRequest() {
        return this.f40694b;
    }

    @NotNull
    public final Throwable getThrowable() {
        return this.f40695c;
    }

    public int hashCode() {
        int i;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + getRequest().hashCode()) * 31) + this.f40695c.hashCode();
    }
}
