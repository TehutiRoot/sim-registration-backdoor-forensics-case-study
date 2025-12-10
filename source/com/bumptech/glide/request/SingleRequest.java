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
    public static final boolean f42588E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    public int f42589A;

    /* renamed from: B */
    public int f42590B;

    /* renamed from: C */
    public boolean f42591C;

    /* renamed from: D */
    public RuntimeException f42592D;

    /* renamed from: a */
    public int f42593a;

    /* renamed from: b */
    public final String f42594b;

    /* renamed from: c */
    public final StateVerifier f42595c;

    /* renamed from: d */
    public final Object f42596d;

    /* renamed from: e */
    public final RequestListener f42597e;

    /* renamed from: f */
    public final RequestCoordinator f42598f;

    /* renamed from: g */
    public final Context f42599g;

    /* renamed from: h */
    public final GlideContext f42600h;

    /* renamed from: i */
    public final Object f42601i;

    /* renamed from: j */
    public final Class f42602j;

    /* renamed from: k */
    public final BaseRequestOptions f42603k;

    /* renamed from: l */
    public final int f42604l;

    /* renamed from: m */
    public final int f42605m;

    /* renamed from: n */
    public final Priority f42606n;

    /* renamed from: o */
    public final Target f42607o;

    /* renamed from: p */
    public final List f42608p;

    /* renamed from: q */
    public final TransitionFactory f42609q;

    /* renamed from: r */
    public final Executor f42610r;

    /* renamed from: s */
    public Resource f42611s;

    /* renamed from: t */
    public Engine.LoadStatus f42612t;

    /* renamed from: u */
    public long f42613u;

    /* renamed from: v */
    public volatile Engine f42614v;

    /* renamed from: w */
    public Status f42615w;

    /* renamed from: x */
    public Drawable f42616x;

    /* renamed from: y */
    public Drawable f42617y;

    /* renamed from: z */
    public Drawable f42618z;

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
        if (f42588E) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f42594b = str;
        this.f42595c = StateVerifier.newInstance();
        this.f42596d = obj;
        this.f42599g = context;
        this.f42600h = glideContext;
        this.f42601i = obj2;
        this.f42602j = cls;
        this.f42603k = baseRequestOptions;
        this.f42604l = i;
        this.f42605m = i2;
        this.f42606n = priority;
        this.f42607o = target;
        this.f42597e = requestListener;
        this.f42608p = list;
        this.f42598f = requestCoordinator;
        this.f42614v = engine;
        this.f42609q = transitionFactory;
        this.f42610r = executor;
        this.f42615w = Status.PENDING;
        if (this.f42592D == null && glideContext.getExperiments().isEnabled(GlideBuilder.LogRequestOrigins.class)) {
            this.f42592D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: m */
    public static int m50046m(int i, float f) {
        if (i != Integer.MIN_VALUE) {
            return Math.round(f * i);
        }
        return i;
    }

    public static <R> SingleRequest<R> obtain(Context context, GlideContext glideContext, Object obj, Object obj2, Class<R> cls, BaseRequestOptions<?> baseRequestOptions, int i, int i2, Priority priority, Target<R> target, RequestListener<R> requestListener, @Nullable List<RequestListener<R>> list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory<? super R> transitionFactory, Executor executor) {
        return new SingleRequest<>(context, glideContext, obj, obj2, cls, baseRequestOptions, i, i2, priority, target, requestListener, list, requestCoordinator, engine, transitionFactory, executor);
    }

    /* renamed from: a */
    public final void m50058a() {
        if (!this.f42591C) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* renamed from: b */
    public final boolean m50057b() {
        RequestCoordinator requestCoordinator = this.f42598f;
        if (requestCoordinator != null && !requestCoordinator.canNotifyCleared(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        int i;
        synchronized (this.f42596d) {
            try {
                m50058a();
                this.f42595c.throwIfRecycled();
                this.f42613u = LogTime.getLogTime();
                Object obj = this.f42601i;
                if (obj == null) {
                    if (Util.isValidDimensions(this.f42604l, this.f42605m)) {
                        this.f42589A = this.f42604l;
                        this.f42590B = this.f42605m;
                    }
                    if (m50051h() == null) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    m50043p(new GlideException("Received null model"), i);
                    return;
                }
                Status status = this.f42615w;
                Status status2 = Status.RUNNING;
                if (status != status2) {
                    if (status == Status.COMPLETE) {
                        onResourceReady(this.f42611s, DataSource.MEMORY_CACHE, false);
                        return;
                    }
                    m50053f(obj);
                    this.f42593a = GlideTrace.beginSectionAsync("GlideRequest");
                    Status status3 = Status.WAITING_FOR_SIZE;
                    this.f42615w = status3;
                    if (Util.isValidDimensions(this.f42604l, this.f42605m)) {
                        onSizeReady(this.f42604l, this.f42605m);
                    } else {
                        this.f42607o.getSize(this);
                    }
                    Status status4 = this.f42615w;
                    if ((status4 == status2 || status4 == status3) && m50056c()) {
                        this.f42607o.onLoadStarted(m50050i());
                    }
                    if (f42588E) {
                        m50047l("finished run method in " + LogTime.getElapsedMillis(this.f42613u));
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
    public final boolean m50056c() {
        RequestCoordinator requestCoordinator = this.f42598f;
        if (requestCoordinator != null && !requestCoordinator.canNotifyStatusChanged(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f42596d) {
            try {
                m50058a();
                this.f42595c.throwIfRecycled();
                Status status = this.f42615w;
                Status status2 = Status.CLEARED;
                if (status == status2) {
                    return;
                }
                m50054e();
                Resource<?> resource = this.f42611s;
                if (resource != null) {
                    this.f42611s = null;
                } else {
                    resource = null;
                }
                if (m50057b()) {
                    this.f42607o.onLoadCleared(m50050i());
                }
                GlideTrace.endSectionAsync("GlideRequest", this.f42593a);
                this.f42615w = status2;
                if (resource != null) {
                    this.f42614v.release(resource);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final boolean m50055d() {
        RequestCoordinator requestCoordinator = this.f42598f;
        if (requestCoordinator != null && !requestCoordinator.canSetImage(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void m50054e() {
        m50058a();
        this.f42595c.throwIfRecycled();
        this.f42607o.removeCallback(this);
        Engine.LoadStatus loadStatus = this.f42612t;
        if (loadStatus != null) {
            loadStatus.cancel();
            this.f42612t = null;
        }
    }

    /* renamed from: f */
    public final void m50053f(Object obj) {
        List<RequestListener> list = this.f42608p;
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
    public final Drawable m50052g() {
        if (this.f42616x == null) {
            Drawable errorPlaceholder = this.f42603k.getErrorPlaceholder();
            this.f42616x = errorPlaceholder;
            if (errorPlaceholder == null && this.f42603k.getErrorId() > 0) {
                this.f42616x = m50048k(this.f42603k.getErrorId());
            }
        }
        return this.f42616x;
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public Object getLock() {
        this.f42595c.throwIfRecycled();
        return this.f42596d;
    }

    /* renamed from: h */
    public final Drawable m50051h() {
        if (this.f42618z == null) {
            Drawable fallbackDrawable = this.f42603k.getFallbackDrawable();
            this.f42618z = fallbackDrawable;
            if (fallbackDrawable == null && this.f42603k.getFallbackId() > 0) {
                this.f42618z = m50048k(this.f42603k.getFallbackId());
            }
        }
        return this.f42618z;
    }

    /* renamed from: i */
    public final Drawable m50050i() {
        if (this.f42617y == null) {
            Drawable placeholderDrawable = this.f42603k.getPlaceholderDrawable();
            this.f42617y = placeholderDrawable;
            if (placeholderDrawable == null && this.f42603k.getPlaceholderId() > 0) {
                this.f42617y = m50048k(this.f42603k.getPlaceholderId());
            }
        }
        return this.f42617y;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.f42596d) {
            if (this.f42615w == Status.COMPLETE) {
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
        synchronized (this.f42596d) {
            if (this.f42615w == Status.CLEARED) {
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
        synchronized (this.f42596d) {
            if (this.f42615w == Status.COMPLETE) {
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
        synchronized (this.f42596d) {
            try {
                i = this.f42604l;
                i2 = this.f42605m;
                obj = this.f42601i;
                cls = this.f42602j;
                baseRequestOptions = this.f42603k;
                priority = this.f42606n;
                List list = this.f42608p;
                if (list != null) {
                    i3 = list.size();
                } else {
                    i3 = 0;
                }
            } finally {
            }
        }
        SingleRequest singleRequest = (SingleRequest) request;
        synchronized (singleRequest.f42596d) {
            try {
                i4 = singleRequest.f42604l;
                i5 = singleRequest.f42605m;
                obj2 = singleRequest.f42601i;
                cls2 = singleRequest.f42602j;
                baseRequestOptions2 = singleRequest.f42603k;
                priority2 = singleRequest.f42606n;
                List list2 = singleRequest.f42608p;
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
        synchronized (this.f42596d) {
            try {
                Status status = this.f42615w;
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
    public final boolean m50049j() {
        RequestCoordinator requestCoordinator = this.f42598f;
        if (requestCoordinator != null && requestCoordinator.getRoot().isAnyResourceSet()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final Drawable m50048k(int i) {
        Resources.Theme theme;
        if (this.f42603k.getTheme() != null) {
            theme = this.f42603k.getTheme();
        } else {
            theme = this.f42599g.getTheme();
        }
        return DrawableDecoderCompat.getDrawable(this.f42599g, i, theme);
    }

    /* renamed from: l */
    public final void m50047l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f42594b);
    }

    /* renamed from: n */
    public final void m50045n() {
        RequestCoordinator requestCoordinator = this.f42598f;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestFailed(this);
        }
    }

    /* renamed from: o */
    public final void m50044o() {
        RequestCoordinator requestCoordinator = this.f42598f;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onLoadFailed(GlideException glideException) {
        m50043p(glideException, 5);
    }

    @Override // com.bumptech.glide.request.ResourceCallback
    public void onResourceReady(Resource<?> resource, DataSource dataSource, boolean z) {
        Object obj;
        String str;
        this.f42595c.throwIfRecycled();
        Resource<?> resource2 = null;
        try {
            synchronized (this.f42596d) {
                try {
                    this.f42612t = null;
                    if (resource == null) {
                        onLoadFailed(new GlideException("Expected to receive a Resource<R> with an object of " + this.f42602j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = resource.get();
                    try {
                        if (obj2 != null && this.f42602j.isAssignableFrom(obj2.getClass())) {
                            if (!m50055d()) {
                                this.f42611s = null;
                                this.f42615w = Status.COMPLETE;
                                GlideTrace.endSectionAsync("GlideRequest", this.f42593a);
                                this.f42614v.release(resource);
                                return;
                            }
                            m50042q(resource, obj2, dataSource, z);
                            return;
                        }
                        this.f42611s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f42602j);
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
                        this.f42614v.release(resource);
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
                this.f42614v.release(resource2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i, int i2) {
        Object obj;
        this.f42595c.throwIfRecycled();
        Object obj2 = this.f42596d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = f42588E;
                    if (z) {
                        m50047l("Got onSizeReady in " + LogTime.getElapsedMillis(this.f42613u));
                    }
                    if (this.f42615w == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        this.f42615w = status;
                        float sizeMultiplier = this.f42603k.getSizeMultiplier();
                        this.f42589A = m50046m(i, sizeMultiplier);
                        this.f42590B = m50046m(i2, sizeMultiplier);
                        if (z) {
                            m50047l("finished setup for calling load in " + LogTime.getElapsedMillis(this.f42613u));
                        }
                        obj = obj2;
                        try {
                            this.f42612t = this.f42614v.load(this.f42600h, this.f42601i, this.f42603k.getSignature(), this.f42589A, this.f42590B, this.f42603k.getResourceClass(), this.f42602j, this.f42606n, this.f42603k.getDiskCacheStrategy(), this.f42603k.getTransformations(), this.f42603k.isTransformationRequired(), this.f42603k.m50077a(), this.f42603k.getOptions(), this.f42603k.isMemoryCacheable(), this.f42603k.getUseUnlimitedSourceGeneratorsPool(), this.f42603k.getUseAnimationPool(), this.f42603k.getOnlyRetrieveFromCache(), this, this.f42610r);
                            if (this.f42615w != status) {
                                this.f42612t = null;
                            }
                            if (z) {
                                m50047l("finished onSizeReady in " + LogTime.getElapsedMillis(this.f42613u));
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
    public final void m50043p(GlideException glideException, int i) {
        boolean z;
        this.f42595c.throwIfRecycled();
        synchronized (this.f42596d) {
            try {
                glideException.setOrigin(this.f42592D);
                int logLevel = this.f42600h.getLogLevel();
                if (logLevel <= i) {
                    Log.w("Glide", "Load failed for [" + this.f42601i + "] with dimensions [" + this.f42589A + "x" + this.f42590B + "]", glideException);
                    if (logLevel <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.f42612t = null;
                this.f42615w = Status.FAILED;
                m50045n();
                boolean z2 = true;
                this.f42591C = true;
                List<RequestListener> list = this.f42608p;
                if (list != null) {
                    z = false;
                    for (RequestListener requestListener : list) {
                        z |= requestListener.onLoadFailed(glideException, this.f42601i, this.f42607o, m50049j());
                    }
                } else {
                    z = false;
                }
                RequestListener requestListener2 = this.f42597e;
                if (requestListener2 == null || !requestListener2.onLoadFailed(glideException, this.f42601i, this.f42607o, m50049j())) {
                    z2 = false;
                }
                if (!(z | z2)) {
                    m50041r();
                }
                this.f42591C = false;
                GlideTrace.endSectionAsync("GlideRequest", this.f42593a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.f42596d) {
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
    public final void m50042q(Resource resource, Object obj, DataSource dataSource, boolean z) {
        boolean z2;
        boolean m50049j = m50049j();
        this.f42615w = Status.COMPLETE;
        this.f42611s = resource;
        if (this.f42600h.getLogLevel() <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(obj.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(dataSource);
            sb.append(" for ");
            sb.append(this.f42601i);
            sb.append(" with size [");
            sb.append(this.f42589A);
            sb.append("x");
            sb.append(this.f42590B);
            sb.append("] in ");
            sb.append(LogTime.getElapsedMillis(this.f42613u));
            sb.append(" ms");
        }
        m50044o();
        boolean z3 = true;
        this.f42591C = true;
        try {
            List<RequestListener> list = this.f42608p;
            if (list != null) {
                z2 = false;
                for (RequestListener requestListener : list) {
                    boolean onResourceReady = z2 | requestListener.onResourceReady(obj, this.f42601i, this.f42607o, dataSource, m50049j);
                    if (requestListener instanceof ExperimentalRequestListener) {
                        z2 = ((ExperimentalRequestListener) requestListener).onResourceReady(obj, this.f42601i, this.f42607o, dataSource, m50049j, z) | onResourceReady;
                    } else {
                        z2 = onResourceReady;
                    }
                }
            } else {
                z2 = false;
            }
            RequestListener requestListener2 = this.f42597e;
            if (requestListener2 == null || !requestListener2.onResourceReady(obj, this.f42601i, this.f42607o, dataSource, m50049j)) {
                z3 = false;
            }
            if (!(z2 | z3)) {
                this.f42607o.onResourceReady(obj, this.f42609q.build(dataSource, m50049j));
            }
            this.f42591C = false;
            GlideTrace.endSectionAsync("GlideRequest", this.f42593a);
        } catch (Throwable th2) {
            this.f42591C = false;
            throw th2;
        }
    }

    /* renamed from: r */
    public final void m50041r() {
        Drawable drawable;
        if (!m50056c()) {
            return;
        }
        if (this.f42601i == null) {
            drawable = m50051h();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = m50052g();
        }
        if (drawable == null) {
            drawable = m50050i();
        }
        this.f42607o.onLoadFailed(drawable);
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f42596d) {
            obj = this.f42601i;
            cls = this.f42602j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
