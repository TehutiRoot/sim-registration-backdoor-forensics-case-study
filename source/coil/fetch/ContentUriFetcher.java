package coil.fetch;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import coil.ImageLoader;
import coil.decode.ContentMetadata;
import coil.decode.DataSource;
import coil.decode.ImageSources;
import coil.fetch.Fetcher;
import coil.request.Options;
import coil.size.Dimension;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\rJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28850d2 = {"Lcoil/fetch/ContentUriFetcher;", "Lcoil/fetch/Fetcher;", "Landroid/net/Uri;", "data", "Lcoil/request/Options;", "options", "<init>", "(Landroid/net/Uri;Lcoil/request/Options;)V", "Lcoil/fetch/FetchResult;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isContactPhotoUri$coil_base_release", "(Landroid/net/Uri;)Z", "isContactPhotoUri", "isMusicThumbnailUri$coil_base_release", "isMusicThumbnailUri", "Landroid/os/Bundle;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Landroid/os/Bundle;", "Landroid/net/Uri;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/Options;", "Factory", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContentUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentUriFetcher.kt\ncoil/fetch/ContentUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes3.dex */
public final class ContentUriFetcher implements Fetcher {

    /* renamed from: a */
    public final Uri f40571a;

    /* renamed from: b */
    public final Options f40572b;

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Lcoil/fetch/ContentUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "<init>", "()V", "data", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/fetch/Fetcher;", "create", "(Landroid/net/Uri;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/fetch/Fetcher;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/net/Uri;)Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        /* renamed from: a */
        public final boolean m51079a(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "content");
        }

        @Override // coil.fetch.Fetcher.Factory
        @Nullable
        public Fetcher create(@NotNull Uri uri, @NotNull Options options, @NotNull ImageLoader imageLoader) {
            if (m51079a(uri)) {
                return new ContentUriFetcher(uri, options);
            }
            return null;
        }
    }

    public ContentUriFetcher(@NotNull Uri uri, @NotNull Options options) {
        this.f40571a = uri;
        this.f40572b = options;
    }

    /* renamed from: a */
    public final Bundle m51080a() {
        Dimension.Pixels pixels;
        Dimension.Pixels pixels2;
        Dimension width = this.f40572b.getSize().getWidth();
        if (width instanceof Dimension.Pixels) {
            pixels = (Dimension.Pixels) width;
        } else {
            pixels = null;
        }
        if (pixels == null) {
            return null;
        }
        int i = pixels.f40827px;
        Dimension height = this.f40572b.getSize().getHeight();
        if (height instanceof Dimension.Pixels) {
            pixels2 = (Dimension.Pixels) height;
        } else {
            pixels2 = null;
        }
        if (pixels2 == null) {
            return null;
        }
        int i2 = pixels2.f40827px;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
        return bundle;
    }

    @Override // coil.fetch.Fetcher
    @Nullable
    public Object fetch(@NotNull Continuation<? super FetchResult> continuation) {
        AssetFileDescriptor openTypedAssetFile;
        ContentResolver contentResolver = this.f40572b.getContext().getContentResolver();
        InputStream inputStream = null;
        if (isContactPhotoUri$coil_base_release(this.f40571a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f40571a, PDPageLabelRange.STYLE_ROMAN_LOWER);
            if (openAssetFileDescriptor != null) {
                inputStream = openAssetFileDescriptor.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f40571a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && isMusicThumbnailUri$coil_base_release(this.f40571a)) {
            openTypedAssetFile = contentResolver.openTypedAssetFile(this.f40571a, "image/*", m51080a(), null);
            if (openTypedAssetFile != null) {
                inputStream = openTypedAssetFile.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f40571a + "'.").toString());
            }
        } else {
            inputStream = contentResolver.openInputStream(this.f40571a);
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f40571a + "'.").toString());
            }
        }
        return new SourceResult(ImageSources.create(Okio.buffer(Okio.source(inputStream)), this.f40572b.getContext(), new ContentMetadata(this.f40571a)), contentResolver.getType(this.f40571a), DataSource.DISK);
    }

    @VisibleForTesting
    public final boolean isContactPhotoUri$coil_base_release(@NotNull Uri uri) {
        if (Intrinsics.areEqual(uri.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri.getLastPathSegment(), "display_photo")) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public final boolean isMusicThumbnailUri$coil_base_release(@NotNull Uri uri) {
        List<String> pathSegments;
        int size;
        if (!Intrinsics.areEqual(uri.getAuthority(), "media") || (size = (pathSegments = uri.getPathSegments()).size()) < 3 || !Intrinsics.areEqual(pathSegments.get(size - 3), "audio") || !Intrinsics.areEqual(pathSegments.get(size - 2), "albums")) {
            return false;
        }
        return true;
    }
}
