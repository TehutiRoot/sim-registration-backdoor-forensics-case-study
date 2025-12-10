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
    public final int f41696a;

    /* renamed from: b */
    public final C5734b f41697b;

    /* renamed from: c */
    public final RequestManager f41698c;

    /* renamed from: d */
    public final PreloadModelProvider f41699d;

    /* renamed from: e */
    public final PreloadSizeProvider f41700e;

    /* renamed from: f */
    public int f41701f;

    /* renamed from: g */
    public int f41702g;

    /* renamed from: i */
    public int f41704i;

    /* renamed from: h */
    public int f41703h = -1;

    /* renamed from: j */
    public boolean f41705j = true;

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
    public static final class C5733a implements Target {

        /* renamed from: a */
        public int f41706a;

        /* renamed from: b */
        public int f41707b;

        /* renamed from: c */
        public Request f41708c;

        @Override // com.bumptech.glide.request.target.Target
        public Request getRequest() {
            return this.f41708c;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void getSize(SizeReadyCallback sizeReadyCallback) {
            sizeReadyCallback.onSizeReady(this.f41707b, this.f41706a);
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
            this.f41708c = request;
        }
    }

    /* renamed from: com.bumptech.glide.ListPreloader$b */
    /* loaded from: classes3.dex */
    public static final class C5734b {

        /* renamed from: a */
        public final Queue f41709a;

        public C5734b(int i) {
            this.f41709a = Util.createQueue(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f41709a.offer(new C5733a());
            }
        }

        /* renamed from: a */
        public C5733a m50605a(int i, int i2) {
            C5733a c5733a = (C5733a) this.f41709a.poll();
            this.f41709a.offer(c5733a);
            c5733a.f41707b = i;
            c5733a.f41706a = i2;
            return c5733a;
        }
    }

    public ListPreloader(@NonNull RequestManager requestManager, @NonNull PreloadModelProvider<T> preloadModelProvider, @NonNull PreloadSizeProvider<T> preloadSizeProvider, int i) {
        this.f41698c = requestManager;
        this.f41699d = preloadModelProvider;
        this.f41700e = preloadSizeProvider;
        this.f41696a = i;
        this.f41697b = new C5734b(i + 1);
    }

    /* renamed from: a */
    public final void m50610a() {
        for (int i = 0; i < this.f41697b.f41709a.size(); i++) {
            this.f41698c.clear(this.f41697b.m50605a(0, 0));
        }
    }

    /* renamed from: b */
    public final void m50609b(int i, int i2) {
        int min;
        int i3;
        if (i < i2) {
            i3 = Math.max(this.f41701f, i);
            min = i2;
        } else {
            min = Math.min(this.f41702g, i);
            i3 = i2;
        }
        int min2 = Math.min(this.f41704i, min);
        int min3 = Math.min(this.f41704i, Math.max(0, i3));
        if (i < i2) {
            for (int i4 = min3; i4 < min2; i4++) {
                m50607d(this.f41699d.getPreloadItems(i4), i4, true);
            }
        } else {
            for (int i5 = min2 - 1; i5 >= min3; i5--) {
                m50607d(this.f41699d.getPreloadItems(i5), i5, false);
            }
        }
        this.f41702g = min3;
        this.f41701f = min2;
    }

    /* renamed from: c */
    public final void m50608c(int i, boolean z) {
        int i2;
        if (this.f41705j != z) {
            this.f41705j = z;
            m50610a();
        }
        if (z) {
            i2 = this.f41696a;
        } else {
            i2 = -this.f41696a;
        }
        m50609b(i, i2 + i);
    }

    /* renamed from: d */
    public final void m50607d(List list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                m50606e(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            m50606e(list.get(i3), i, i3);
        }
    }

    /* renamed from: e */
    public final void m50606e(Object obj, int i, int i2) {
        int[] preloadSize;
        RequestBuilder<?> preloadRequestBuilder;
        if (obj == null || (preloadSize = this.f41700e.getPreloadSize(obj, i, i2)) == null || (preloadRequestBuilder = this.f41699d.getPreloadRequestBuilder(obj)) == null) {
            return;
        }
        preloadRequestBuilder.into((RequestBuilder<?>) this.f41697b.m50605a(preloadSize[0], preloadSize[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.f41704i == 0 && i3 == 0) {
            return;
        }
        this.f41704i = i3;
        int i4 = this.f41703h;
        if (i > i4) {
            m50608c(i2 + i, true);
        } else if (i < i4) {
            m50608c(i, false);
        }
        this.f41703h = i;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
