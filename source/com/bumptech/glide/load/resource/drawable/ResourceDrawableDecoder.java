package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.util.List;

/* loaded from: classes3.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {
    public static final Option<Resources.Theme> THEME = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a */
    public final Context f42411a;

    public ResourceDrawableDecoder(Context context) {
        this.f42411a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final Context m50151a(Uri uri, String str) {
        if (str.equals(this.f42411a.getPackageName())) {
            return this.f42411a;
        }
        try {
            return this.f42411a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f42411a.getPackageName())) {
                return this.f42411a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: b */
    public final int m50150b(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: c */
    public final int m50149c(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: d */
    public final int m50148d(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m50149c(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m50150b(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource<Drawable> decode(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        Drawable drawable;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context m50151a = m50151a(uri, authority);
            int m50148d = m50148d(m50151a, uri);
            Resources.Theme theme = ((String) Preconditions.checkNotNull(authority)).equals(this.f42411a.getPackageName()) ? (Resources.Theme) options.get(THEME) : null;
            if (theme == null) {
                drawable = DrawableDecoderCompat.getDrawable(this.f42411a, m50151a, m50148d);
            } else {
                drawable = DrawableDecoderCompat.getDrawable(this.f42411a, m50148d, theme);
            }
            return KI0.m67627a(drawable);
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Uri uri, @NonNull Options options) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
