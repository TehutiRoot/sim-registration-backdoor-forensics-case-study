package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import coil.size.Scale;
import coil.size.Size;
import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b7\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ§\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bV\u0010S\u001a\u0004\bW\u0010UR\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\bY\u0010U¨\u0006Z"}, m28850d2 = {"Lcoil/request/Options;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/Size;", "size", "Lcoil/size/Scale;", "scale", "", "allowInexactSize", "allowRgb565", "premultipliedAlpha", "", "diskCacheKey", "Lokhttp3/Headers;", "headers", "Lcoil/request/Tags;", "tags", "Lcoil/request/Parameters;", "parameters", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Size;Lcoil/size/Scale;ZZZLjava/lang/String;Lokhttp3/Headers;Lcoil/request/Tags;Lcoil/request/Parameters;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "copy", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Size;Lcoil/size/Scale;ZZZLjava/lang/String;Lokhttp3/Headers;Lcoil/request/Tags;Lcoil/request/Parameters;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)Lcoil/request/Options;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/Bitmap$Config;", "getConfig", "()Landroid/graphics/Bitmap$Config;", OperatorName.CURVE_TO, "Landroid/graphics/ColorSpace;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "d", "Lcoil/size/Size;", "getSize", "()Lcoil/size/Size;", "e", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", OperatorName.FILL_NON_ZERO, "Z", "getAllowInexactSize", "()Z", OperatorName.NON_STROKING_GRAY, "getAllowRgb565", OperatorName.CLOSE_PATH, "getPremultipliedAlpha", "i", "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", OperatorName.SET_LINE_JOINSTYLE, "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", OperatorName.NON_STROKING_CMYK, "Lcoil/request/Tags;", "getTags", "()Lcoil/request/Tags;", OperatorName.LINE_TO, "Lcoil/request/Parameters;", "getParameters", "()Lcoil/request/Parameters;", OperatorName.MOVE_TO, "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", OperatorName.ENDPATH, "getDiskCachePolicy", "o", "getNetworkCachePolicy", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Options {

    /* renamed from: a */
    public final Context f40785a;

    /* renamed from: b */
    public final Bitmap.Config f40786b;

    /* renamed from: c */
    public final ColorSpace f40787c;

    /* renamed from: d */
    public final Size f40788d;

    /* renamed from: e */
    public final Scale f40789e;

    /* renamed from: f */
    public final boolean f40790f;

    /* renamed from: g */
    public final boolean f40791g;

    /* renamed from: h */
    public final boolean f40792h;

    /* renamed from: i */
    public final String f40793i;

    /* renamed from: j */
    public final Headers f40794j;

    /* renamed from: k */
    public final Tags f40795k;

    /* renamed from: l */
    public final Parameters f40796l;

    /* renamed from: m */
    public final CachePolicy f40797m;

    /* renamed from: n */
    public final CachePolicy f40798n;

    /* renamed from: o */
    public final CachePolicy f40799o;

    public Options(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull Size size, @NotNull Scale scale, boolean z, boolean z2, boolean z3, @Nullable String str, @NotNull Headers headers, @NotNull Tags tags, @NotNull Parameters parameters, @NotNull CachePolicy cachePolicy, @NotNull CachePolicy cachePolicy2, @NotNull CachePolicy cachePolicy3) {
        this.f40785a = context;
        this.f40786b = config;
        this.f40787c = colorSpace;
        this.f40788d = size;
        this.f40789e = scale;
        this.f40790f = z;
        this.f40791g = z2;
        this.f40792h = z3;
        this.f40793i = str;
        this.f40794j = headers;
        this.f40795k = tags;
        this.f40796l = parameters;
        this.f40797m = cachePolicy;
        this.f40798n = cachePolicy2;
        this.f40799o = cachePolicy3;
    }

    @NotNull
    public final Options copy(@NotNull Context context, @NotNull Bitmap.Config config, @Nullable ColorSpace colorSpace, @NotNull Size size, @NotNull Scale scale, boolean z, boolean z2, boolean z3, @Nullable String str, @NotNull Headers headers, @NotNull Tags tags, @NotNull Parameters parameters, @NotNull CachePolicy cachePolicy, @NotNull CachePolicy cachePolicy2, @NotNull CachePolicy cachePolicy3) {
        return new Options(context, config, colorSpace, size, scale, z, z2, z3, str, headers, tags, parameters, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Options) {
            Options options = (Options) obj;
            if (Intrinsics.areEqual(this.f40785a, options.f40785a) && this.f40786b == options.f40786b && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f40787c, options.f40787c)) && Intrinsics.areEqual(this.f40788d, options.f40788d) && this.f40789e == options.f40789e && this.f40790f == options.f40790f && this.f40791g == options.f40791g && this.f40792h == options.f40792h && Intrinsics.areEqual(this.f40793i, options.f40793i) && Intrinsics.areEqual(this.f40794j, options.f40794j) && Intrinsics.areEqual(this.f40795k, options.f40795k) && Intrinsics.areEqual(this.f40796l, options.f40796l) && this.f40797m == options.f40797m && this.f40798n == options.f40798n && this.f40799o == options.f40799o)) {
                return true;
            }
        }
        return false;
    }

    public final boolean getAllowInexactSize() {
        return this.f40790f;
    }

    public final boolean getAllowRgb565() {
        return this.f40791g;
    }

    @Nullable
    public final ColorSpace getColorSpace() {
        return this.f40787c;
    }

    @NotNull
    public final Bitmap.Config getConfig() {
        return this.f40786b;
    }

    @NotNull
    public final Context getContext() {
        return this.f40785a;
    }

    @Nullable
    public final String getDiskCacheKey() {
        return this.f40793i;
    }

    @NotNull
    public final CachePolicy getDiskCachePolicy() {
        return this.f40798n;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.f40794j;
    }

    @NotNull
    public final CachePolicy getMemoryCachePolicy() {
        return this.f40797m;
    }

    @NotNull
    public final CachePolicy getNetworkCachePolicy() {
        return this.f40799o;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.f40796l;
    }

    public final boolean getPremultipliedAlpha() {
        return this.f40792h;
    }

    @NotNull
    public final Scale getScale() {
        return this.f40789e;
    }

    @NotNull
    public final Size getSize() {
        return this.f40788d;
    }

    @NotNull
    public final Tags getTags() {
        return this.f40795k;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f40785a.hashCode() * 31) + this.f40786b.hashCode()) * 31;
        ColorSpace colorSpace = this.f40787c;
        int i2 = 0;
        if (colorSpace != null) {
            i = colorSpace.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((((((((((hashCode + i) * 31) + this.f40788d.hashCode()) * 31) + this.f40789e.hashCode()) * 31) + AbstractC1705Xp.m65430a(this.f40790f)) * 31) + AbstractC1705Xp.m65430a(this.f40791g)) * 31) + AbstractC1705Xp.m65430a(this.f40792h)) * 31;
        String str = this.f40793i;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((((((((((hashCode2 + i2) * 31) + this.f40794j.hashCode()) * 31) + this.f40795k.hashCode()) * 31) + this.f40796l.hashCode()) * 31) + this.f40797m.hashCode()) * 31) + this.f40798n.hashCode()) * 31) + this.f40799o.hashCode();
    }

    public /* synthetic */ Options(Context context, Bitmap.Config config, ColorSpace colorSpace, Size size, Scale scale, boolean z, boolean z2, boolean z3, String str, Headers headers, Tags tags, Parameters parameters, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Bitmap.Config.ARGB_8888 : config, (i & 4) != 0 ? Utils.getNULL_COLOR_SPACE() : colorSpace, (i & 8) != 0 ? Size.ORIGINAL : size, (i & 16) != 0 ? Scale.FIT : scale, (i & 32) != 0 ? false : z, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? true : z3, (i & 256) != 0 ? null : str, (i & 512) != 0 ? Utils.getEMPTY_HEADERS() : headers, (i & 1024) != 0 ? Tags.EMPTY : tags, (i & 2048) != 0 ? Parameters.EMPTY : parameters, (i & 4096) != 0 ? CachePolicy.ENABLED : cachePolicy, (i & 8192) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i & 16384) != 0 ? CachePolicy.ENABLED : cachePolicy3);
    }
}
