package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.List;
import java.util.Queue;

/* loaded from: classes3.dex */
public class ListPreloader<T> implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final int f41708a;

    /* renamed from: b */
    public final C5723b f41709b;

    /* renamed from: c */
    public final RequestManager f41710c;

    /* renamed from: d */
    public final PreloadModelProvider f41711d;

    /* renamed from: e */
    public final PreloadSizeProvider f41712e;

    /* renamed from: f */
    public int f41713f;

    /* renamed from: g */
    public int f41714g;

    /* renamed from: i */
    public int f41716i;

    /* renamed from: h */
    public int f41715h = -1;

    /* renamed from: j */
    public boolean f41717j = true;

    /* loaded from: classes3.dex */
    public interface PreloadModelProvider<U> {
        @NonNull
        List<U> getPreloadItems(int i);

        @Nullable
        RequestBuilder<?> getPreloadRequestBuilder(@NonNull U u);
    }

    /* loaded from: classes3.dex */
    public interface PreloadSizeProvider<T> {
        @Nullable
        int[] getPreloadSize(@NonNull T t, int i, int i2);
    }

    /* renamed from: com.bumptech.glide.ListPreloader$a */
    /* loaded from: classes3.dex */
    public static final class C5722a implements Target {

        /* renamed from: a */
        public int f41718a;

        /* renamed from: b */
        public int f41719b;

        /* renamed from: c */
        public Request f41720c;

        @Override // com.bumptech.glide.request.target.Target
        public Request getRequest() {
            return this.f41720c;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void getSize(SizeReadyCallback sizeReadyCallback) {
            sizeReadyCallback.onSizeReady(this.f41719b, this.f41718a);
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onDestroy() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadStarted(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Object obj, Transition transition) {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStart() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public void onStop() {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void removeCallback(SizeReadyCallback sizeReadyCallback) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void setRequest(Request request) {
            this.f41720c = request;
        }
    }

    /* renamed from: com.bumptech.glide.ListPreloader$b */
    /* loaded from: classes3.dex */
    public static final class C5723b {

        /* renamed from: a */
        public final Queue f41721a;

        public C5723b(int i) {
            this.f41721a = Util.createQueue(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f41721a.offer(new C5722a());
            }
        }

        /* renamed from: a */
        public C5722a m50602a(int i, int i2) {
            C5722a c5722a = (C5722a) this.f41721a.poll();
            this.f41721a.offer(c5722a);
            c5722a.f41719b = i;
            c5722a.f41718a = i2;
            return c5722a;
        }
    }

    public ListPreloader(@NonNull RequestManager requestManager, @NonNull PreloadModelProvider<T> preloadModelProvider, @NonNull PreloadSizeProvider<T> preloadSizeProvider, int i) {
        this.f41710c = requestManager;
        this.f41711d = preloadModelProvider;
        this.f41712e = preloadSizeProvider;
        this.f41708a = i;
        this.f41709b = new C5723b(i + 1);
    }

    /* renamed from: a */
    public final void m50607a() {
        for (int i = 0; i < this.f41709b.f41721a.size(); i++) {
            this.f41710c.clear(this.f41709b.m50602a(0, 0));
        }
    }

    /* renamed from: b */
    public final void m50606b(int i, int i2) {
        int min;
        int i3;
        if (i < i2) {
            i3 = Math.max(this.f41713f, i);
            min = i2;
        } else {
            min = Math.min(this.f41714g, i);
            i3 = i2;
        }
        int min2 = Math.min(this.f41716i, min);
        int min3 = Math.min(this.f41716i, Math.max(0, i3));
        if (i < i2) {
            for (int i4 = min3; i4 < min2; i4++) {
                m50604d(this.f41711d.getPreloadItems(i4), i4, true);
            }
        } else {
            for (int i5 = min2 - 1; i5 >= min3; i5--) {
                m50604d(this.f41711d.getPreloadItems(i5), i5, false);
            }
        }
        this.f41714g = min3;
        this.f41713f = min2;
    }

    /* renamed from: c */
    public final void m50605c(int i, boolean z) {
        int i2;
        if (this.f41717j != z) {
            this.f41717j = z;
            m50607a();
        }
        if (z) {
            i2 = this.f41708a;
        } else {
            i2 = -this.f41708a;
        }
        m50606b(i, i2 + i);
    }

    /* renamed from: d */
    public final void m50604d(List list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                m50603e(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            m50603e(list.get(i3), i, i3);
        }
    }

    /* renamed from: e */
    public final void m50603e(Object obj, int i, int i2) {
        int[] preloadSize;
        RequestBuilder<?> preloadRequestBuilder;
        if (obj == null || (preloadSize = this.f41712e.getPreloadSize(obj, i, i2)) == null || (preloadRequestBuilder = this.f41711d.getPreloadRequestBuilder(obj)) == null) {
            return;
        }
        preloadRequestBuilder.into((RequestBuilder<?>) this.f41709b.m50602a(preloadSize[0], preloadSize[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.f41716i == 0 && i3 == 0) {
            return;
        }
        this.f41716i = i3;
        int i4 = this.f41715h;
        if (i > i4) {
            m50605c(i2 + i, true);
        } else if (i < i4) {
            m50605c(i, false);
        }
        this.f41715h = i;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}