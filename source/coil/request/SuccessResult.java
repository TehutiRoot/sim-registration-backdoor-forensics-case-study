package coil.request;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\r\u00100R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b\u000e\u00100¨\u00062"}, m28850d2 = {"Lcoil/request/SuccessResult;", "Lcoil/request/ImageResult;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lcoil/request/ImageRequest;", "request", "Lcoil/decode/DataSource;", "dataSource", "Lcoil/memory/MemoryCache$Key;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Lcoil/decode/DataSource;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;ZZ)V", "copy", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Lcoil/decode/DataSource;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;ZZ)Lcoil/request/SuccessResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", OperatorName.CURVE_TO, "Lcoil/decode/DataSource;", "getDataSource", "()Lcoil/decode/DataSource;", "d", "Lcoil/memory/MemoryCache$Key;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "e", "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", OperatorName.FILL_NON_ZERO, "Z", "()Z", OperatorName.NON_STROKING_GRAY, "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SuccessResult extends ImageResult {

    /* renamed from: a */
    public final Drawable f40807a;

    /* renamed from: b */
    public final ImageRequest f40808b;

    /* renamed from: c */
    public final DataSource f40809c;

    /* renamed from: d */
    public final MemoryCache.Key f40810d;

    /* renamed from: e */
    public final String f40811e;

    /* renamed from: f */
    public final boolean f40812f;

    /* renamed from: g */
    public final boolean f40813g;

    public /* synthetic */ SuccessResult(Drawable drawable, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, imageRequest, dataSource, (i & 8) != 0 ? null : key, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public static /* synthetic */ SuccessResult copy$default(SuccessResult successResult, Drawable drawable, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = successResult.getDrawable();
        }
        if ((i & 2) != 0) {
            imageRequest = successResult.getRequest();
        }
        ImageRequest imageRequest2 = imageRequest;
        if ((i & 4) != 0) {
            dataSource = successResult.f40809c;
        }
        DataSource dataSource2 = dataSource;
        if ((i & 8) != 0) {
            key = successResult.f40810d;
        }
        MemoryCache.Key key2 = key;
        if ((i & 16) != 0) {
            str = successResult.f40811e;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = successResult.f40812f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = successResult.f40813g;
        }
        return successResult.copy(drawable, imageRequest2, dataSource2, key2, str2, z3, z2);
    }

    @NotNull
    public final SuccessResult copy(@NotNull Drawable drawable, @NotNull ImageRequest imageRequest, @NotNull DataSource dataSource, @Nullable MemoryCache.Key key, @Nullable String str, boolean z, boolean z2) {
        return new SuccessResult(drawable, imageRequest, dataSource, key, str, z, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) obj;
            if (Intrinsics.areEqual(getDrawable(), successResult.getDrawable()) && Intrinsics.areEqual(getRequest(), successResult.getRequest()) && this.f40809c == successResult.f40809c && Intrinsics.areEqual(this.f40810d, successResult.f40810d) && Intrinsics.areEqual(this.f40811e, successResult.f40811e) && this.f40812f == successResult.f40812f && this.f40813g == successResult.f40813g) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final DataSource getDataSource() {
        return this.f40809c;
    }

    @Nullable
    public final String getDiskCacheKey() {
        return this.f40811e;
    }

    @Override // coil.request.ImageResult
    @NotNull
    public Drawable getDrawable() {
        return this.f40807a;
    }

    @Nullable
    public final MemoryCache.Key getMemoryCacheKey() {
        return this.f40810d;
    }

    @Override // coil.request.ImageResult
    @NotNull
    public ImageRequest getRequest() {
        return this.f40808b;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((getDrawable().hashCode() * 31) + getRequest().hashCode()) * 31) + this.f40809c.hashCode()) * 31;
        MemoryCache.Key key = this.f40810d;
        int i2 = 0;
        if (key != null) {
            i = key.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.f40811e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((i3 + i2) * 31) + AbstractC1705Xp.m65430a(this.f40812f)) * 31) + AbstractC1705Xp.m65430a(this.f40813g);
    }

    public final boolean isPlaceholderCached() {
        return this.f40813g;
    }

    public final boolean isSampled() {
        return this.f40812f;
    }

    public SuccessResult(@NotNull Drawable drawable, @NotNull ImageRequest imageRequest, @NotNull DataSource dataSource, @Nullable MemoryCache.Key key, @Nullable String str, boolean z, boolean z2) {
        super(null);
        this.f40807a = drawable;
        this.f40808b = imageRequest;
        this.f40809c = dataSource;
        this.f40810d = key;
        this.f40811e = str;
        this.f40812f = z;
        this.f40813g = z2;
    }
}
