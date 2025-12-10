package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class DirectResourceLoader<DataT> implements ModelLoader<Integer, DataT> {

    /* renamed from: a */
    public final Context f42179a;

    /* renamed from: b */
    public final InterfaceC5839e f42180b;

    /* renamed from: com.bumptech.glide.load.model.DirectResourceLoader$a */
    /* loaded from: classes3.dex */
    public static final class C5835a implements ModelLoaderFactory, InterfaceC5839e {

        /* renamed from: a */
        public final Context f42181a;

        public C5835a(Context context) {
            this.f42181a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        /* renamed from: b */
        public void close(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f42181a, this);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        /* renamed from: c */
        public AssetFileDescriptor mo50300a(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        public Class getDataClass() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.DirectResourceLoader$b */
    /* loaded from: classes3.dex */
    public static final class C5836b implements ModelLoaderFactory, InterfaceC5839e {

        /* renamed from: a */
        public final Context f42182a;

        public C5836b(Context context) {
            this.f42182a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        /* renamed from: b */
        public void close(Drawable drawable) {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f42182a, this);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        /* renamed from: c */
        public Drawable mo50300a(Resources.Theme theme, Resources resources, int i) {
            return DrawableDecoderCompat.getDrawable(this.f42182a, i, theme);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        public Class getDataClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.DirectResourceLoader$c */
    /* loaded from: classes3.dex */
    public static final class C5837c implements ModelLoaderFactory, InterfaceC5839e {

        /* renamed from: a */
        public final Context f42183a;

        public C5837c(Context context) {
            this.f42183a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        /* renamed from: b */
        public void close(InputStream inputStream) {
            inputStream.close();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f42183a, this);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        /* renamed from: c */
        public InputStream mo50300a(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.InterfaceC5839e
        public Class getDataClass() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    /* renamed from: com.bumptech.glide.load.model.DirectResourceLoader$d */
    /* loaded from: classes3.dex */
    public static final class C5838d implements DataFetcher {

        /* renamed from: a */
        public final Resources.Theme f42184a;

        /* renamed from: b */
        public final Resources f42185b;

        /* renamed from: c */
        public final InterfaceC5839e f42186c;

        /* renamed from: d */
        public final int f42187d;

        /* renamed from: e */
        public Object f42188e;

        public C5838d(Resources.Theme theme, Resources resources, InterfaceC5839e interfaceC5839e, int i) {
            this.f42184a = theme;
            this.f42185b = resources;
            this.f42186c = interfaceC5839e;
            this.f42187d = i;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            Object obj = this.f42188e;
            if (obj != null) {
                try {
                    this.f42186c.close(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public Class getDataClass() {
            return this.f42186c.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            try {
                Object mo50300a = this.f42186c.mo50300a(this.f42184a, this.f42185b, this.f42187d);
                this.f42188e = mo50300a;
                dataCallback.onDataReady(mo50300a);
            } catch (Resources.NotFoundException e) {
                dataCallback.onLoadFailed(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.model.DirectResourceLoader$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC5839e {
        /* renamed from: a */
        Object mo50300a(Resources.Theme theme, Resources resources, int i);

        void close(Object obj);

        Class getDataClass();
    }

    public DirectResourceLoader(Context context, InterfaceC5839e interfaceC5839e) {
        this.f42179a = context.getApplicationContext();
        this.f42180b = interfaceC5839e;
    }

    public static ModelLoaderFactory<Integer, AssetFileDescriptor> assetFileDescriptorFactory(Context context) {
        return new C5835a(context);
    }

    public static ModelLoaderFactory<Integer, Drawable> drawableFactory(Context context) {
        return new C5836b(context);
    }

    public static ModelLoaderFactory<Integer, InputStream> inputStreamFactory(Context context) {
        return new C5837c(context);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Integer num) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<DataT> buildLoadData(@NonNull Integer num, int i, int i2, @NonNull Options options) {
        Resources resources;
        Resources.Theme theme = (Resources.Theme) options.get(ResourceDrawableDecoder.THEME);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.f42179a.getResources();
        }
        return new ModelLoader.LoadData<>(new ObjectKey(num), new C5838d(theme, resources, this.f42180b, num.intValue()));
    }
}
