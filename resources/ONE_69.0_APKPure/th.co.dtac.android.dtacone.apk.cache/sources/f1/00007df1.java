package coil.fetch;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m29142d2 = {"Lcoil/fetch/DrawableResult;", "Lcoil/fetch/FetchResult;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "Lcoil/decode/DataSource;", "dataSource", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;)V", "copy", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;)Lcoil/fetch/DrawableResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "()Z", OperatorName.CURVE_TO, "Lcoil/decode/DataSource;", "getDataSource", "()Lcoil/decode/DataSource;", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class DrawableResult extends FetchResult {

    /* renamed from: a */
    public final Drawable f40587a;

    /* renamed from: b */
    public final boolean f40588b;

    /* renamed from: c */
    public final DataSource f40589c;

    public DrawableResult(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource) {
        super(null);
        this.f40587a = drawable;
        this.f40588b = z;
        this.f40589c = dataSource;
    }

    public static /* synthetic */ DrawableResult copy$default(DrawableResult drawableResult, Drawable drawable, boolean z, DataSource dataSource, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = drawableResult.f40587a;
        }
        if ((i & 2) != 0) {
            z = drawableResult.f40588b;
        }
        if ((i & 4) != 0) {
            dataSource = drawableResult.f40589c;
        }
        return drawableResult.copy(drawable, z, dataSource);
    }

    @NotNull
    public final DrawableResult copy(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource) {
        return new DrawableResult(drawable, z, dataSource);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawableResult) {
            DrawableResult drawableResult = (DrawableResult) obj;
            if (Intrinsics.areEqual(this.f40587a, drawableResult.f40587a) && this.f40588b == drawableResult.f40588b && this.f40589c == drawableResult.f40589c) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final DataSource getDataSource() {
        return this.f40589c;
    }

    @NotNull
    public final Drawable getDrawable() {
        return this.f40587a;
    }

    public int hashCode() {
        return (((this.f40587a.hashCode() * 31) + AbstractC1694Xp.m65565a(this.f40588b)) * 31) + this.f40589c.hashCode();
    }

    public final boolean isSampled() {
        return this.f40588b;
    }
}