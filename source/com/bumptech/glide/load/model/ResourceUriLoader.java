package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public final class ResourceUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* renamed from: a */
    public final Context f42239a;

    /* renamed from: b */
    public final ModelLoader f42240b;

    /* renamed from: com.bumptech.glide.load.model.ResourceUriLoader$a */
    /* loaded from: classes3.dex */
    public static final class C5853a implements ModelLoaderFactory {

        /* renamed from: a */
        public final Context f42241a;

        public C5853a(Context context) {
            this.f42241a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.f42241a, multiModelLoaderFactory.build(Integer.class, AssetFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.ResourceUriLoader$b */
    /* loaded from: classes3.dex */
    public static final class C5854b implements ModelLoaderFactory {

        /* renamed from: a */
        public final Context f42242a;

        public C5854b(Context context) {
            this.f42242a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.f42242a, multiModelLoaderFactory.build(Integer.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public ResourceUriLoader(Context context, ModelLoader modelLoader) {
        this.f42239a = context.getApplicationContext();
        this.f42240b = modelLoader;
    }

    public static ModelLoaderFactory<Uri, AssetFileDescriptor> newAssetFileDescriptorFactory(Context context) {
        return new C5853a(context);
    }

    public static ModelLoaderFactory<Uri, InputStream> newStreamFactory(Context context) {
        return new C5854b(context);
    }

    /* renamed from: a */
    public final ModelLoader.LoadData m50262a(Uri uri, int i, int i2, Options options) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt == 0) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                }
                return null;
            }
            return this.f42240b.buildLoadData(Integer.valueOf(parseInt), i, i2, options);
        } catch (NumberFormatException e) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e);
            }
            return null;
        }
    }

    /* renamed from: b */
    public final ModelLoader.LoadData m50261b(Uri uri, int i, int i2, Options options) {
        List<String> pathSegments = uri.getPathSegments();
        String str = pathSegments.get(1);
        int identifier = this.f42239a.getResources().getIdentifier(str, pathSegments.get(0), this.f42239a.getPackageName());
        if (identifier == 0) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                return null;
            }
            return null;
        }
        return this.f42240b.buildLoadData(Integer.valueOf(identifier), i, i2, options);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public ModelLoader.LoadData<DataT> buildLoadData(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m50262a(uri, i, i2, options);
        }
        if (pathSegments.size() == 2) {
            return m50261b(uri, i, i2, options);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
            return null;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f42239a.getPackageName().equals(uri.getAuthority());
    }
}
