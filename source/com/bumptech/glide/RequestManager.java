package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class RequestManager implements ComponentCallbacks2, LifecycleListener {

    /* renamed from: k */
    public static final RequestOptions f41736k = RequestOptions.decodeTypeOf(Bitmap.class).lock();

    /* renamed from: l */
    public static final RequestOptions f41737l = RequestOptions.decodeTypeOf(GifDrawable.class).lock();

    /* renamed from: m */
    public static final RequestOptions f41738m = RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);

    /* renamed from: a */
    public final Lifecycle f41739a;

    /* renamed from: b */
    public final RequestTracker f41740b;

    /* renamed from: c */
    public final RequestManagerTreeNode f41741c;
    protected final Context context;

    /* renamed from: d */
    public final TargetTracker f41742d;

    /* renamed from: e */
    public final Runnable f41743e;

    /* renamed from: f */
    public final ConnectivityMonitor f41744f;

    /* renamed from: g */
    public final CopyOnWriteArrayList f41745g;
    protected final Glide glide;

    /* renamed from: h */
    public RequestOptions f41746h;

    /* renamed from: i */
    public boolean f41747i;

    /* renamed from: j */
    public boolean f41748j;

    /* renamed from: com.bumptech.glide.RequestManager$a */
    /* loaded from: classes3.dex */
    public class RunnableC5744a implements Runnable {
        public RunnableC5744a() {
            RequestManager.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestManager requestManager = RequestManager.this;
            requestManager.f41739a.addListener(requestManager);
        }
    }

    /* renamed from: com.bumptech.glide.RequestManager$b */
    /* loaded from: classes3.dex */
    public static class C5745b extends CustomViewTarget {
        public C5745b(View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public void onResourceCleared(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Object obj, Transition transition) {
        }
    }

    /* renamed from: com.bumptech.glide.RequestManager$c */
    /* loaded from: classes3.dex */
    public class C5746c implements ConnectivityMonitor.ConnectivityListener {

        /* renamed from: a */
        public final RequestTracker f41750a;

        public C5746c(RequestTracker requestTracker) {
            RequestManager.this = r1;
            this.f41750a = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public void onConnectivityChanged(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    this.f41750a.restartRequests();
                }
            }
        }
    }

    public RequestManager(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
        this(glide, lifecycle, requestManagerTreeNode, new RequestTracker(), glide.m50625c(), context);
    }

    /* renamed from: a */
    public final synchronized void m50590a() {
        try {
            for (Target<?> target : this.f41742d.getAll()) {
                clear(target);
            }
            this.f41742d.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public RequestManager addDefaultRequestListener(RequestListener<Object> requestListener) {
        this.f41745g.add(requestListener);
        return this;
    }

    @NonNull
    public synchronized RequestManager applyDefaultRequestOptions(@NonNull RequestOptions requestOptions) {
        m50582h(requestOptions);
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: as */
    public <ResourceType> RequestBuilder<ResourceType> m50589as(@NonNull Class<ResourceType> cls) {
        return new RequestBuilder<>(this.glide, this, cls, this.context);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<Bitmap> asBitmap() {
        return m50589as(Bitmap.class).apply((BaseRequestOptions<?>) f41736k);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<Drawable> asDrawable() {
        return m50589as(Drawable.class);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> asFile() {
        return m50589as(File.class).apply((BaseRequestOptions<?>) RequestOptions.skipMemoryCacheOf(true));
    }

    @NonNull
    @CheckResult
    public RequestBuilder<GifDrawable> asGif() {
        return m50589as(GifDrawable.class).apply((BaseRequestOptions<?>) f41737l);
    }

    /* renamed from: b */
    public List m50588b() {
        return this.f41745g;
    }

    /* renamed from: c */
    public synchronized RequestOptions m50587c() {
        return this.f41746h;
    }

    public void clear(@NonNull View view) {
        clear(new C5745b(view));
    }

    @NonNull
    public synchronized RequestManager clearOnStop() {
        this.f41748j = true;
        return this;
    }

    /* renamed from: d */
    public TransitionOptions m50586d(Class cls) {
        return this.glide.m50624d().getDefaultTransitionOptions(cls);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> download(@Nullable Object obj) {
        return downloadOnly().m74035load(obj);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> downloadOnly() {
        return m50589as(File.class).apply((BaseRequestOptions<?>) f41738m);
    }

    /* renamed from: e */
    public synchronized void m50585e(Target target, Request request) {
        this.f41742d.track(target);
        this.f41740b.runRequest(request);
    }

    /* renamed from: f */
    public synchronized boolean m50584f(Target target) {
        Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (this.f41740b.clearAndRemove(request)) {
            this.f41742d.untrack(target);
            target.setRequest(null);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m50583g(Target target) {
        boolean m50584f = m50584f(target);
        Request request = target.getRequest();
        if (!m50584f && !this.glide.m50619i(target) && request != null) {
            target.setRequest(null);
            request.clear();
        }
    }

    /* renamed from: h */
    public final synchronized void m50582h(RequestOptions requestOptions) {
        this.f41746h = this.f41746h.apply(requestOptions);
    }

    public synchronized boolean isPaused() {
        return this.f41740b.isPaused();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onDestroy() {
        this.f41742d.onDestroy();
        m50590a();
        this.f41740b.clearRequests();
        this.f41739a.removeListener(this);
        this.f41739a.removeListener(this.f41744f);
        Util.removeCallbacksOnUiThread(this.f41743e);
        this.glide.m50617k(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStart() {
        resumeRequests();
        this.f41742d.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onStop() {
        try {
            this.f41742d.onStop();
            if (this.f41748j) {
                m50590a();
            } else {
                pauseRequests();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f41747i) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.f41740b.pauseAllRequests();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        for (RequestManager requestManager : this.f41741c.getDescendants()) {
            requestManager.pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.f41740b.pauseRequests();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        for (RequestManager requestManager : this.f41741c.getDescendants()) {
            requestManager.pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.f41740b.resumeRequests();
    }

    public synchronized void resumeRequestsRecursive() {
        Util.assertMainThread();
        resumeRequests();
        for (RequestManager requestManager : this.f41741c.getDescendants()) {
            requestManager.resumeRequests();
        }
    }

    @NonNull
    public synchronized RequestManager setDefaultRequestOptions(@NonNull RequestOptions requestOptions) {
        setRequestOptions(requestOptions);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z) {
        this.f41747i = z;
    }

    public synchronized void setRequestOptions(@NonNull RequestOptions requestOptions) {
        this.f41746h = requestOptions.m74049clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f41740b + ", treeNode=" + this.f41741c + "}";
    }

    public void clear(@Nullable Target<?> target) {
        if (target == null) {
            return;
        }
        m50583g(target);
    }

    public RequestManager(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, RequestTracker requestTracker, ConnectivityMonitorFactory connectivityMonitorFactory, Context context) {
        this.f41742d = new TargetTracker();
        RunnableC5744a runnableC5744a = new RunnableC5744a();
        this.f41743e = runnableC5744a;
        this.glide = glide;
        this.f41739a = lifecycle;
        this.f41741c = requestManagerTreeNode;
        this.f41740b = requestTracker;
        this.context = context;
        ConnectivityMonitor build = connectivityMonitorFactory.build(context.getApplicationContext(), new C5746c(requestTracker));
        this.f41744f = build;
        glide.m50620h(this);
        if (Util.isOnBackgroundThread()) {
            Util.postOnUiThread(runnableC5744a);
        } else {
            lifecycle.addListener(this);
        }
        lifecycle.addListener(build);
        this.f41745g = new CopyOnWriteArrayList(glide.m50624d().getDefaultRequestListeners());
        setRequestOptions(glide.m50624d().getDefaultRequestOptions());
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<Drawable> m74039load(@Nullable Bitmap bitmap) {
        return asDrawable().m74030load(bitmap);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<Drawable> m74040load(@Nullable Drawable drawable) {
        return asDrawable().m74031load(drawable);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<Drawable> m74045load(@Nullable String str) {
        return asDrawable().m74036load(str);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<Drawable> m74041load(@Nullable Uri uri) {
        return asDrawable().m74032load(uri);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<Drawable> m74042load(@Nullable File file) {
        return asDrawable().m74033load(file);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<Drawable> m74043load(@Nullable @DrawableRes @RawRes Integer num) {
        return asDrawable().m74034load(num);
    }

    @CheckResult
    @Deprecated
    /* renamed from: load */
    public RequestBuilder<Drawable> m74046load(@Nullable URL url) {
        return asDrawable().m74037load(url);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<Drawable> m74047load(@Nullable byte[] bArr) {
        return asDrawable().m74038load(bArr);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<Drawable> m74044load(@Nullable Object obj) {
        return asDrawable().m74035load(obj);
    }
}
