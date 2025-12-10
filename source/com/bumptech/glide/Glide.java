package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.BitmapPreFiller;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class Glide implements ComponentCallbacks2 {

    /* renamed from: l */
    public static volatile Glide f41650l;

    /* renamed from: m */
    public static volatile boolean f41651m;

    /* renamed from: a */
    public final Engine f41652a;

    /* renamed from: b */
    public final BitmapPool f41653b;

    /* renamed from: c */
    public final MemoryCache f41654c;

    /* renamed from: d */
    public final GlideContext f41655d;

    /* renamed from: e */
    public final ArrayPool f41656e;

    /* renamed from: f */
    public final RequestManagerRetriever f41657f;

    /* renamed from: g */
    public final ConnectivityMonitorFactory f41658g;

    /* renamed from: i */
    public final RequestOptionsFactory f41660i;

    /* renamed from: k */
    public BitmapPreFiller f41662k;

    /* renamed from: h */
    public final List f41659h = new ArrayList();

    /* renamed from: j */
    public MemoryCategory f41661j = MemoryCategory.NORMAL;

    /* loaded from: classes3.dex */
    public interface RequestOptionsFactory {
        @NonNull
        RequestOptions build();
    }

    public Glide(Context context, Engine engine, MemoryCache memoryCache, BitmapPool bitmapPool, ArrayPool arrayPool, RequestManagerRetriever requestManagerRetriever, ConnectivityMonitorFactory connectivityMonitorFactory, int i, RequestOptionsFactory requestOptionsFactory, Map map, List list, List list2, AppGlideModule appGlideModule, GlideExperiments glideExperiments) {
        this.f41652a = engine;
        this.f41653b = bitmapPool;
        this.f41656e = arrayPool;
        this.f41654c = memoryCache;
        this.f41657f = requestManagerRetriever;
        this.f41658g = connectivityMonitorFactory;
        this.f41660i = requestOptionsFactory;
        this.f41655d = new GlideContext(context, arrayPool, AbstractC5747a.m50576d(this, list2, appGlideModule), new ImageViewTargetFactory(), requestOptionsFactory, map, list, engine, glideExperiments, i);
    }

    /* renamed from: a */
    public static void m50627a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f41651m) {
            f41651m = true;
            try {
                m50622f(context, generatedAppGlideModule);
                return;
            } finally {
                f41651m = false;
            }
        }
        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
    }

    /* renamed from: b */
    public static GeneratedAppGlideModule m50626b(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e) {
            m50618j(e);
            return null;
        } catch (InstantiationException e2) {
            m50618j(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            m50618j(e3);
            return null;
        } catch (InvocationTargetException e4) {
            m50618j(e4);
            return null;
        }
    }

    /* renamed from: e */
    public static RequestManagerRetriever m50623e(Context context) {
        Preconditions.checkNotNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return get(context).getRequestManagerRetriever();
    }

    @VisibleForTesting
    public static void enableHardwareBitmaps() {
        HardwareConfigState.getInstance().unblockHardwareBitmaps();
    }

    /* renamed from: f */
    public static void m50622f(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m50621g(context, new GlideBuilder(), generatedAppGlideModule);
    }

    /* renamed from: g */
    public static void m50621g(Context context, GlideBuilder glideBuilder, GeneratedAppGlideModule generatedAppGlideModule) {
        RequestManagerRetriever.RequestManagerFactory requestManagerFactory;
        Context applicationContext = context.getApplicationContext();
        List<GlideModule> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            emptyList = new ManifestParser(applicationContext).parse();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m50629a().isEmpty()) {
            Set m50629a = generatedAppGlideModule.m50629a();
            Iterator<GlideModule> it = emptyList.iterator();
            while (it.hasNext()) {
                GlideModule next = it.next();
                if (m50629a.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (GlideModule glideModule : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(glideModule.getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            requestManagerFactory = generatedAppGlideModule.m50628b();
        } else {
            requestManagerFactory = null;
        }
        glideBuilder.m50615b(requestManagerFactory);
        for (GlideModule glideModule2 : emptyList) {
            glideModule2.applyOptions(applicationContext, glideBuilder);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, glideBuilder);
        }
        Glide m50616a = glideBuilder.m50616a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(m50616a);
        f41650l = m50616a;
    }

    @NonNull
    public static Glide get(@NonNull Context context) {
        if (f41650l == null) {
            GeneratedAppGlideModule m50626b = m50626b(context.getApplicationContext());
            synchronized (Glide.class) {
                try {
                    if (f41650l == null) {
                        m50627a(context, m50626b);
                    }
                } finally {
                }
            }
        }
        return f41650l;
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context) {
        return getPhotoCacheDir(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR);
    }

    @VisibleForTesting
    @Deprecated
    public static synchronized void init(Glide glide) {
        synchronized (Glide.class) {
            try {
                if (f41650l != null) {
                    tearDown();
                }
                f41650l = glide;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public static synchronized boolean isInitialized() {
        boolean z;
        synchronized (Glide.class) {
            if (f41650l != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public static void m50618j(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @VisibleForTesting
    public static void tearDown() {
        synchronized (Glide.class) {
            try {
                if (f41650l != null) {
                    f41650l.getContext().getApplicationContext().unregisterComponentCallbacks(f41650l);
                    f41650l.f41652a.shutdown();
                }
                f41650l = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static RequestManager with(@NonNull Context context) {
        return m50623e(context).get(context);
    }

    /* renamed from: c */
    public ConnectivityMonitorFactory m50625c() {
        return this.f41658g;
    }

    public void clearDiskCache() {
        Util.assertBackgroundThread();
        this.f41652a.clearDiskCache();
    }

    public void clearMemory() {
        Util.assertMainThread();
        this.f41654c.clearMemory();
        this.f41653b.clearMemory();
        this.f41656e.clearMemory();
    }

    /* renamed from: d */
    public GlideContext m50624d() {
        return this.f41655d;
    }

    @NonNull
    public ArrayPool getArrayPool() {
        return this.f41656e;
    }

    @NonNull
    public BitmapPool getBitmapPool() {
        return this.f41653b;
    }

    @NonNull
    public Context getContext() {
        return this.f41655d.getBaseContext();
    }

    @NonNull
    public Registry getRegistry() {
        return this.f41655d.getRegistry();
    }

    @NonNull
    public RequestManagerRetriever getRequestManagerRetriever() {
        return this.f41657f;
    }

    /* renamed from: h */
    public void m50620h(RequestManager requestManager) {
        synchronized (this.f41659h) {
            try {
                if (!this.f41659h.contains(requestManager)) {
                    this.f41659h.add(requestManager);
                } else {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public boolean m50619i(Target target) {
        synchronized (this.f41659h) {
            try {
                for (RequestManager requestManager : this.f41659h) {
                    if (requestManager.m50584f(target)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public void m50617k(RequestManager requestManager) {
        synchronized (this.f41659h) {
            try {
                if (this.f41659h.contains(requestManager)) {
                    this.f41659h.remove(requestManager);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        clearMemory();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        trimMemory(i);
    }

    public synchronized void preFillBitmapPool(@NonNull PreFillType.Builder... builderArr) {
        try {
            if (this.f41662k == null) {
                this.f41662k = new BitmapPreFiller(this.f41654c, this.f41653b, (DecodeFormat) this.f41660i.build().getOptions().get(Downsampler.DECODE_FORMAT));
            }
            this.f41662k.preFill(builderArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    public MemoryCategory setMemoryCategory(@NonNull MemoryCategory memoryCategory) {
        Util.assertMainThread();
        this.f41654c.setSizeMultiplier(memoryCategory.getMultiplier());
        this.f41653b.setSizeMultiplier(memoryCategory.getMultiplier());
        MemoryCategory memoryCategory2 = this.f41661j;
        this.f41661j = memoryCategory;
        return memoryCategory2;
    }

    public void trimMemory(int i) {
        Util.assertMainThread();
        synchronized (this.f41659h) {
            try {
                for (RequestManager requestManager : this.f41659h) {
                    requestManager.onTrimMemory(i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f41654c.trimMemory(i);
        this.f41653b.trimMemory(i);
        this.f41656e.trimMemory(i);
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context, @NonNull String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.isDirectory() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        Log.isLoggable("Glide", 6);
        return null;
    }

    @NonNull
    @Deprecated
    public static RequestManager with(@NonNull Activity activity) {
        return with(activity.getApplicationContext());
    }

    @NonNull
    public static RequestManager with(@NonNull FragmentActivity fragmentActivity) {
        return m50623e(fragmentActivity).get(fragmentActivity);
    }

    @NonNull
    public static RequestManager with(@NonNull Fragment fragment) {
        return m50623e(fragment.getContext()).get(fragment);
    }

    @VisibleForTesting
    public static void init(@NonNull Context context, @NonNull GlideBuilder glideBuilder) {
        GeneratedAppGlideModule m50626b = m50626b(context);
        synchronized (Glide.class) {
            try {
                if (f41650l != null) {
                    tearDown();
                }
                m50621g(context, glideBuilder, m50626b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @Deprecated
    public static RequestManager with(@NonNull android.app.Fragment fragment) {
        Activity activity = fragment.getActivity();
        Preconditions.checkNotNull(activity, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return with(activity.getApplicationContext());
    }

    @NonNull
    public static RequestManager with(@NonNull View view) {
        return m50623e(view.getContext()).get(view);
    }
}
