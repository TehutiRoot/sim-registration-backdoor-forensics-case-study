package coil.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.decode.ResourceMetadata;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.util.Contexts;
import coil.util.DrawableUtils;
import coil.util.Utils;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28850d2 = {"Lcoil/fetch/ResourceUriFetcher;", "Lcoil/fetch/Fetcher;", "Landroid/net/Uri;", "data", "Lcoil/request/Options;", "options", "<init>", "(Landroid/net/Uri;Lcoil/request/Options;)V", "Lcoil/fetch/FetchResult;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/net/Uri;)Ljava/lang/Void;", "Landroid/net/Uri;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/Options;", "Companion", "Factory", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResourceUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 4 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,100:1\n1#2:101\n45#3:102\n28#4:103\n*S KotlinDebug\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n*L\n58#1:102\n58#1:103\n*E\n"})
/* loaded from: classes3.dex */
public final class ResourceUriFetcher implements Fetcher {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Uri f40589a;

    /* renamed from: b */
    public final Options f40590b;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28850d2 = {"Lcoil/fetch/ResourceUriFetcher$Companion;", "", "()V", "MIME_TYPE_XML", "", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Lcoil/fetch/ResourceUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "<init>", "()V", "data", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/net/Uri;)Z", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/fetch/Fetcher;", "create", "(Landroid/net/Uri;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/fetch/Fetcher;", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        /* renamed from: a */
        private final boolean m51065a(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "android.resource");
        }

        @Override // coil.fetch.Fetcher.Factory
        @Nullable
        public Fetcher create(@NotNull Uri uri, @NotNull Options options, @NotNull ImageLoader imageLoader) {
            if (m51065a(uri)) {
                return new ResourceUriFetcher(uri, options);
            }
            return null;
        }
    }

    public ResourceUriFetcher(@NotNull Uri uri, @NotNull Options options) {
        this.f40589a = uri;
        this.f40590b = options;
    }

    /* renamed from: a */
    public final Void m51066a(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // coil.fetch.Fetcher
    @Nullable
    public Object fetch(@NotNull Continuation<? super FetchResult> continuation) {
        Integer intOrNull;
        Resources resourcesForApplication;
        Drawable xmlDrawableCompat;
        String authority = this.f40589a.getAuthority();
        if (authority != null) {
            if (!(!AbstractC20204hN1.isBlank(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f40589a.getPathSegments());
                if (str != null && (intOrNull = AbstractC20032gN1.toIntOrNull(str)) != null) {
                    int intValue = intOrNull.intValue();
                    Context context = this.f40590b.getContext();
                    if (Intrinsics.areEqual(authority, context.getPackageName())) {
                        resourcesForApplication = context.getResources();
                    } else {
                        resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
                    }
                    TypedValue typedValue = new TypedValue();
                    resourcesForApplication.getValue(intValue, typedValue, true);
                    CharSequence charSequence = typedValue.string;
                    String mimeTypeFromUrl = Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt__StringsKt.lastIndexOf$default(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                    if (Intrinsics.areEqual(mimeTypeFromUrl, "text/xml")) {
                        if (Intrinsics.areEqual(authority, context.getPackageName())) {
                            xmlDrawableCompat = Contexts.getDrawableCompat(context, intValue);
                        } else {
                            xmlDrawableCompat = Contexts.getXmlDrawableCompat(context, resourcesForApplication, intValue);
                        }
                        Drawable drawable = xmlDrawableCompat;
                        boolean isVector = Utils.isVector(drawable);
                        if (isVector) {
                            drawable = new BitmapDrawable(context.getResources(), DrawableUtils.INSTANCE.convertToBitmap(drawable, this.f40590b.getConfig(), this.f40590b.getSize(), this.f40590b.getScale(), this.f40590b.getAllowInexactSize()));
                        }
                        return new DrawableResult(drawable, isVector, DataSource.DISK);
                    }
                    TypedValue typedValue2 = new TypedValue();
                    return new SourceResult(ImageSources.create(Okio.buffer(Okio.source(resourcesForApplication.openRawResource(intValue, typedValue2))), context, new ResourceMetadata(authority, intValue, typedValue2.density)), mimeTypeFromUrl, DataSource.DISK);
                }
                m51066a(this.f40589a);
                throw new KotlinNothingValueException();
            }
        }
        m51066a(this.f40589a);
        throw new KotlinNothingValueException();
    }
}
