package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.GlideTrace;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class SingleRequest<R> implements Request, SizeReadyCallback, ResourceCallback {

    /* renamed from: E */
    public static final boolean f42600E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f42601A;

    /* renamed from: B */
    public int f42602B;

    /* renamed from: C */
    public boolean f42603C;

    /* renamed from: D */
    public RuntimeException f42604D;

    /* renamed from: a */
    public int f42605a;

    /* renamed from: b */
    public final String f42606b;

    /* renamed from: c */
    public final StateVerifier f42607c;

    /* renamed from: d */
    public final Object f42608d;

    /* renamed from: e */
    public final RequestListener f42609e;

    /* renamed from: f */
    public final RequestCoordinator f42610f;

    /* renamed from: g */
    public final Context f42611g;

    /* renamed from: h */
    public final GlideContext f42612h;

    /* renamed from: i */
    public final Object f42613i;

    /* renamed from: j */
    public final Class f42614j;

    /* renamed from: k */
    public final BaseRequestOptions f42615k;

    /* renamed from: l */
    public final int f42616l;

    /* renamed from: m */
    public final int f42617m;

    /* renamed from: n */
    public final Priority f42618n;

    /* renamed from: o */
    public final Target f42619o;

    /* renamed from: p */
    public final List f42620p;

    /* renamed from: q */
    public final TransitionFactory f42621q;

    /* renamed from: r */
    public final Executor f42622r;

    /* renamed from: s */
    public Resource f42623s;

    /* renamed from: t */
    public Engine.LoadStatus f42624t;

    /* renamed from: u */
    public long f42625u;

    /* renamed from: v */
    public volatile Engine f42626v;

    /* renamed from: w */
    public Status f42627w;

    /* renamed from: x */
    public Drawable f42628x;

    /* renamed from: y */
    public Drawable f42629y;

    /* renamed from: z */
    public Drawable f42630z;

    /* loaded from: classes3.dex */
    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, GlideContext glideContext, Object obj, Object obj2, Class cls, BaseRequestOptions baseRequestOptions, int i, int i2, Priority priority, Target target, RequestListener requestListener, List list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory transitionFactory, Executor executor) {
        String str;
        if (f42600E) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f42606b = str;
        this.f42607c = StateVerifier.newInstance();
        this.f42608d = obj;
        this.f42611g = context;
        this.f42612h = glideContext;
        this.f42613i = obj2;
        this.f42614j = cls;
        this.f42615k = baseRequestOptions;
        this.f42616l = i;
        this.f42617m = i2;
        this.f42618n = priority;
        this.f42619o = target;
        this.f42609e = requestListener;
        this.f42620p = list;
        this.f42610f = requestCoordinator;
        this.f42626v = engine;
        this.f42621q = transitionFactory;
        this.f42622r = executor;
        this.f42627w = Status.PENDING;
        if (this.f42604D == null && glideContext.getExperiments().isEnabled(GlideBuilder.LogRequestOrigins.class)) {
            this.f42604D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: m */
    public static int m50043m(int i, float f) {
        if (i != Integer.MIN_VALUE) {
            return Math.round(f * i);
        }
        return i;
    }

    public static <R> SingleRequest<R> obtain(Context context, GlideContext glideContext, Object obj, Object obj2, Class<R> cls, BaseRequestOptions<?> baseRequestOptions, int i, int i2, Priority priority, Target<R> target, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory<? super R> transitionFactory, Executor executor) {
        return new SingleRequest<>(context, glideContext, obj, obj2, cls, baseRequestOptions, i, i2, priority, target, requestListener, list, requestCoordinator, engine, transitionFactory, executor);
    }

    /* renamed from: a */
    public final void m50055a() {
        if (!this.f42603C) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* renamed from: b */
    public final boolean m50054b() {
        RequestCoordinator requestCoordinator = this.f42610f;
        if (requestCoordinator != null && !requestCoordinator.canNotifyCleared(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        int i;
        synchronized (this.f42608d) {
            try {
                m50055a();
                this.f42607c.throwIfRecycled();
                this.f42625u = LogTime.getLogTime();
                Object obj = this.f42613i;
                if (obj == null) {
                    if (Util.isValidDimensions(this.f42616l, this.f42617m)) {
                        this.f42601A = this.f42616l;
                        this.f42602B = this.f42617m;
                    }
                    if (m50048h() == null) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    m50040p(new GlideException("Received null model"), i);
                    return;
                }
                Status status = this.f42627w;
                Status status2 = Status.RUNNING;
                if (status != status2) {
                    if (status == Status.COMPLETE) {
                        onResourceReady(this.f42623s, DataSource.MEMORY_CACHE, false);
                        return;
                    }
                    m50050f(obj);
                    this.f42605a = GlideTrace.beginSectionAsync("GlideRequest");
                    Status status3 = Status.WAITING_FOR_SIZE;
                    this.f42627w = status3;
                    if (Util.isValidDimensions(this.f42616l, this.f42617m)) {
                        onSizeReady(this.f42616l, this.f42617m);
                    } else {
                        this.f42619o.getSize(this);
                    }
                    Status status4 = this.f42627w;
                    if ((status4 == status2 || status4 == status3) && m50053c()) {
                        this.f42619o.onLoadStarted(m50047i());
                    }
                    if (f42600E) {
                        m50044l("finished run method in " + LogTime.getElapsedMillis(this.f42625u));
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot restart a running request");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final boolean m50053c() {
        RequestCoordinator requestCoordinator = this.f42610f;
        if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f42608d) {
            try {
                m50055a();
                this.f42607c.throwIfRecycled();
                Status status = this.f42627w;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m50051e();
                Resource<?> resource = this.f42623s;
                if (resource != null) {
                    this.f42623s = null;
                } else {
                    resource = null;
                }
                if (m50054b()) {
                    this.f42619o.onLoadCleared(m50047i());
                }
                GlideTrace.endSectionAsync("GlideRequest", this.f42605a);
                this.f42627w = status2;
                if (resource != null) {
                    this.f42626v.release(resource);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m50052d() {
        RequestCoordinator requestCoordinator = this.f42610f;
        if (requestCoordinator != null && !requestCoordinator.canSetImage(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void m50051e() {
        m50055a();
        this.f42607c.throwIfRecycled();
        this.f42619o.removeCallback(this);
        Engine.LoadStatus loadStatus = this.f42624t;
        if (loadStatus != null) {
            loadStatus.cancel();
            this.f42624t = null;
        }
    }

    /* renamed from: f */
    public final void m50050f(Object obj) {
        List<RequestListener> list = this.f42620p;
        if (list == null) {
            return;
        }
        for (RequestListener requestListener : list) {
            if (requestListener instanceof ExperimentalRequestListener) {
                ((ExperimentalRequestListener) requestListener).onRequestStarted(obj);
            }
        }
    }

    /* renamed from: g */
    public final Drawable m50049g() {
        if (this.f42628x == null) {
            Drawable errorPlaceholder = this.f42615k.getErrorPlaceholder();
            this.f42628x = errorPlaceholder;
            if (errorPlaceholder == null && this.f42615k.getErrorId() > 0) {
                this.f42628x = m50045k(this.f42615k.getErrorId());
            }
        }
        return this.f42628x;
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public Object getLock() {
        this.f42607c.throwIfRecycled();
        return this.f42608d;
    }

    /* renamed from: h */
    public final Drawable m50048h() {
        if (this.f42630z == null) {
            Drawable fallbackDrawable = this.f42615k.getFallbackDrawable();
            this.f42630z = fallbackDrawable;
            if (fallbackDrawable == null && this.f42615k.getFallbackId() > 0) {
                this.f42630z = m50045k(this.f42615k.getFallbackId());
            }
        }
        return this.f42630z;
    }

    /* renamed from: i */
    public final Drawable m50047i() {
        if (this.f42629y == null) {
            Drawable placeholderDrawable = this.f42615k.getPlaceholderDrawable();
            this.f42629y = placeholderDrawable;
            if (placeholderDrawable == null && this.f42615k.getPlaceholderId() > 0) {
                this.f42629y = m50045k(this.f42615k.getPlaceholderId());
            }
        }
        return this.f42629y;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.f42608d) {
            if (this.f42627w == Status.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        boolean z;
        synchronized (this.f42608d) {
            if (this.f42627w == Status.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z;
        synchronized (this.f42608d) {
            if (this.f42627w == Status.COMPLETE) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        int i;
        int i2;
        Object obj;
        Class cls;
        BaseRequestOptions baseRequestOptions;
        Priority priority;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        BaseRequestOptions baseRequestOptions2;
        Priority priority2;
        int i6;
        if (!(request instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f42608d) {
            try {
                i = this.f42616l;
                i2 = this.f42617m;
                obj = this.f42613i;
                cls = this.f42614j;
                baseRequestOptions = this.f42615k;
                priority = this.f42618n;
                List list = this.f42620p;
                if (list != null) {
                    i3 = list.size();
                } else {
                    i3 = 0;
                }
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) request;
        synchronized (singleRequest.f42608d) {
            try {
                i4 = singleRequest.f42616l;
                i5 = singleRequest.f42617m;
                obj2 = singleRequest.f42613i;
                cls2 = singleRequest.f42614j;
                baseRequestOptions2 = singleRequest.f42615k;
                priority2 = singleRequest.f42618n;
                List list2 = singleRequest.f42620p;
                if (list2 != null) {
                    i6 = list2.size();
                } else {
                    i6 = 0;
                }
            } finally {
            }
        }
        if (i == i4 && i2 == i5 && Util.bothModelsNullEquivalentOrEquals(obj, obj2) && cls.equals(cls2) && Util.bothBaseRequestOptionsNullEquivalentOrEquals(baseRequestOptions, baseRequestOptions2) && priority == priority2 && i3 == i6) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z;
        synchronized (this.f42608d) {
            try {
                Status status = this.f42627w;
                if (status != Status.RUNNING && status != Status.WAITING_FOR_SIZE) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    /* renamed from: j */
    public final boolean m50046j() {
        RequestCoordinator requestCoordinator = this.f42610f;
        if (requestCoordinator != null && requestCoordinator.getRoot().isAnyResourceSet()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final Drawable m50045k(int i) {
        Resources.Theme theme;
        if (this.f42615k.getTheme() != null) {
            theme = this.f42615k.getTheme();
        } else {
            theme = this.f42611g.getTheme();
        }
        return DrawableDecoderCompat.getDrawable(this.f42611g, i, theme);
    }

    /* renamed from: l */
    public final void m50044l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f42606b);
    }

    /* renamed from: n */
    public final void m50042n() {
        RequestCoordinator requestCoordinator = this.f42610f;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestFailed(this);
        }
    }

    /* renamed from: o */
    public final void m50041o() {
        RequestCoordinator requestCoordinator = this.f42610f;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onLoadFailed(GlideException glideException) {
        m50040p(glideException, 5);
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onResourceReady(Resource<?> resource, DataSource dataSource, boolean z) {
        Object obj;
        String str;
        this.f42607c.throwIfRecycled();
        Resource<?> resource2 = null;
        try {
            synchronized (this.f42608d) {
                try {
                    this.f42624t = null;
                    if (resource == null) {
                        onLoadFailed(new GlideException("Expected to receive a Resource<R> with an object of " + this.f42614j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = resource.get();
                    try {
                        if (obj2 != null && this.f42614j.isAssignableFrom(obj2.getClass())) {
                            if (!m50052d()) {
                                this.f42623s = null;
                                this.f42627w = Status.COMPLETE;
                                GlideTrace.endSectionAsync("GlideRequest", this.f42605a);
                                this.f42626v.release(resource);
                                return;
                            }
                            m50039q(resource, obj2, dataSource, z);
                            return;
                        }
                        this.f42623s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f42614j);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(resource);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        onLoadFailed(new GlideException(sb.toString()));
                        this.f42626v.release(resource);
                    } catch (Throwable th2) {
                        resource2 = resource;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (resource2 != null) {
                this.f42626v.release(resource2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i, int i2) {
        Object obj;
        this.f42607c.throwIfRecycled();
        Object obj2 = this.f42608d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f42600E;
                    if (z) {
                        m50044l("Got onSizeReady in " + LogTime.getElapsedMillis(this.f42625u));
                    }
                    if (this.f42627w == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        this.f42627w = status;
                        float sizeMultiplier = this.f42615k.getSizeMultiplier();
                        this.f42601A = m50043m(i, sizeMultiplier);
                        this.f42602B = m50043m(i2, sizeMultiplier);
                        if (z) {
                            m50044l("finished setup for calling load in " + LogTime.getElapsedMillis(this.f42625u));
                        }
                        obj = obj2;
                        try {
                            this.f42624t = this.f42626v.load(this.f42612h, this.f42613i, this.f42615k.getSignature(), this.f42601A, this.f42602B, this.f42615k.getResourceClass(), this.f42614j, this.f42618n, this.f42615k.getDiskCacheStrategy(), this.f42615k.getTransformations(), this.f42615k.isTransformationRequired(), this.f42615k.m50074a(), this.f42615k.getOptions(), this.f42615k.isMemoryCacheable(), this.f42615k.getUseUnlimitedSourceGeneratorsPool(), this.f42615k.getUseAnimationPool(), this.f42615k.getOnlyRetrieveFromCache(), this, this.f42622r);
                            if (this.f42627w != status) {
                                this.f42624t = null;
                            }
                            if (z) {
                                m50044l("finished onSizeReady in " + LogTime.getElapsedMillis(this.f42625u));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* renamed from: p */
    public final void m50040p(GlideException glideException, int i) {
        boolean z;
        this.f42607c.throwIfRecycled();
        synchronized (this.f42608d) {
            try {
                glideException.setOrigin(this.f42604D);
                int logLevel = this.f42612h.getLogLevel();
                if (logLevel <= i) {
                    Log.w("Glide", "Load failed for [" + this.f42613i + "] with dimensions [" + this.f42601A + "x" + this.f42602B + "]", glideException);
                    if (logLevel <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f42624t = null;
                this.f42627w = Status.FAILED;
                m50042n();
                boolean z2 = true;
                this.f42603C = true;
                List<RequestListener> list = this.f42620p;
                if (list != null) {
                    z = false;
                    for (RequestListener requestListener : list) {
                        z |= requestListener.onLoadFailed(glideException, this.f42613i, this.f42619o, m50046j());
                    }
                } else {
                    z = false;
                }
                RequestListener requestListener2 = this.f42609e;
                if (requestListener2 == null || !requestListener2.onLoadFailed(glideException, this.f42613i, this.f42619o, m50046j())) {
                    z2 = false;
                }
                if (!(z | z2)) {
                    m50038r();
                }
                this.f42603C = false;
                GlideTrace.endSectionAsync("GlideRequest", this.f42605a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.f42608d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    public final void m50039q(Resource resource, Object obj, DataSource dataSource, boolean z) {
        boolean z2;
        boolean m50046j = m50046j();
        this.f42627w = Status.COMPLETE;
        this.f42623s = resource;
        if (this.f42612h.getLogLevel() <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(dataSource);
            sb.append(" for ");
            sb.append(this.f42613i);
            sb.append(" with size [");
            sb.append(this.f42601A);
            sb.append("x");
            sb.append(this.f42602B);
            sb.append("] in ");
            sb.append(LogTime.getElapsedMillis(this.f42625u));
            sb.append(" ms");
        }
        m50041o();
        boolean z3 = true;
        this.f42603C = true;
        try {
            List<RequestListener> list = this.f42620p;
            if (list != null) {
                z2 = false;
                for (RequestListener requestListener : list) {
                    boolean onResourceReady = z2 | requestListener.onResourceReady(obj, this.f42613i, this.f42619o, dataSource, m50046j);
                    if (requestListener instanceof ExperimentalRequestListener) {
                        z2 = ((ExperimentalRequestListener) requestListener).onResourceReady(obj, this.f42613i, this.f42619o, dataSource, m50046j, z) | onResourceReady;
                    } else {
                        z2 = onResourceReady;
                    }
                }
            } else {
                z2 = false;
            }
            RequestListener requestListener2 = this.f42609e;
            if (requestListener2 == null || !requestListener2.onResourceReady(obj, this.f42613i, this.f42619o, dataSource, m50046j)) {
                z3 = false;
            }
            if (!(z2 | z3)) {
                this.f42619o.onResourceReady(obj, this.f42621q.build(dataSource, m50046j));
            }
            this.f42603C = false;
            GlideTrace.endSectionAsync("GlideRequest", this.f42605a);
        } catch (Throwable th2) {
            this.f42603C = false;
            throw th2;
        }
    }

    /* renamed from: r */
    public final void m50038r() {
        Drawable drawable;
        if (!m50053c()) {
            return;
        }
        if (this.f42613i == null) {
            drawable = m50048h();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = m50049g();
        }
        if (drawable == null) {
            drawable = m50047i();
        }
        this.f42619o.onLoadFailed(drawable);
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f42608d) {
            obj = this.f42613i;
            cls = this.f42614j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}