package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.util.GlideSuppliers;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class GlideContext extends ContextWrapper {

    /* renamed from: k */
    public static final TransitionOptions f41695k = new GenericTransitionOptions();

    /* renamed from: a */
    public final ArrayPool f41696a;

    /* renamed from: b */
    public final GlideSuppliers.GlideSupplier f41697b;

    /* renamed from: c */
    public final ImageViewTargetFactory f41698c;

    /* renamed from: d */
    public final Glide.RequestOptionsFactory f41699d;

    /* renamed from: e */
    public final List f41700e;

    /* renamed from: f */
    public final Map f41701f;

    /* renamed from: g */
    public final Engine f41702g;

    /* renamed from: h */
    public final GlideExperiments f41703h;

    /* renamed from: i */
    public final int f41704i;

    /* renamed from: j */
    public RequestOptions f41705j;

    public GlideContext(@NonNull Context context, @NonNull ArrayPool arrayPool, @NonNull GlideSuppliers.GlideSupplier<Registry> glideSupplier, @NonNull ImageViewTargetFactory imageViewTargetFactory, @NonNull Glide.RequestOptionsFactory requestOptionsFactory, @NonNull Map<Class<?>, TransitionOptions<?, ?>> map, @NonNull List<RequestListener<Object>> list, @NonNull Engine engine, @NonNull GlideExperiments glideExperiments, int i) {
        super(context.getApplicationContext());
        this.f41696a = arrayPool;
        this.f41698c = imageViewTargetFactory;
        this.f41699d = requestOptionsFactory;
        this.f41700e = list;
        this.f41701f = map;
        this.f41702g = engine;
        this.f41703h = glideExperiments;
        this.f41704i = i;
        this.f41697b = GlideSuppliers.memorize(glideSupplier);
    }

    @NonNull
    public <X> ViewTarget<ImageView, X> buildImageViewTarget(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f41698c.buildTarget(imageView, cls);
    }

    @NonNull
    public ArrayPool getArrayPool() {
        return this.f41696a;
    }

    public List<RequestListener<Object>> getDefaultRequestListeners() {
        return this.f41700e;
    }

    public synchronized RequestOptions getDefaultRequestOptions() {
        try {
            if (this.f41705j == null) {
                this.f41705j = this.f41699d.build().lock();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f41705j;
    }

    @NonNull
    public <T> TransitionOptions<?, T> getDefaultTransitionOptions(@NonNull Class<T> cls) {
        TransitionOptions<?, T> transitionOptions = (TransitionOptions) this.f41701f.get(cls);
        if (transitionOptions == null) {
            for (Map.Entry entry : this.f41701f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transitionOptions = (TransitionOptions) entry.getValue();
                }
            }
        }
        if (transitionOptions == null) {
            return f41695k;
        }
        return transitionOptions;
    }

    @NonNull
    public Engine getEngine() {
        return this.f41702g;
    }

    public GlideExperiments getExperiments() {
        return this.f41703h;
    }

    public int getLogLevel() {
        return this.f41704i;
    }

    @NonNull
    public Registry getRegistry() {
        return (Registry) this.f41697b.get();
    }
}