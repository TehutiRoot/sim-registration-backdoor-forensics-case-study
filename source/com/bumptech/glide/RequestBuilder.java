package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.signature.AndroidResourceSignature;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> implements Cloneable {
    protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS = new RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA).priority(Priority.LOW).skipMemoryCache(true);

    /* renamed from: A */
    public final Context f41720A;

    /* renamed from: B */
    public final RequestManager f41721B;

    /* renamed from: C */
    public final Class f41722C;

    /* renamed from: D */
    public final Glide f41723D;

    /* renamed from: E */
    public final GlideContext f41724E;

    /* renamed from: F */
    public TransitionOptions f41725F;

    /* renamed from: G */
    public Object f41726G;

    /* renamed from: H */
    public List f41727H;

    /* renamed from: I */
    public RequestBuilder f41728I;

    /* renamed from: J */
    public RequestBuilder f41729J;

    /* renamed from: K */
    public Float f41730K;

    /* renamed from: L */
    public boolean f41731L;

    /* renamed from: M */
    public boolean f41732M;

    /* renamed from: N */
    public boolean f41733N;

    /* renamed from: com.bumptech.glide.RequestBuilder$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5743a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41734a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f41735b;

        static {
            int[] iArr = new int[Priority.values().length];
            f41735b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41735b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41735b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41735b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f41734a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41734a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41734a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41734a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41734a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41734a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41734a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41734a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public RequestBuilder(@NonNull Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        this.f41731L = true;
        this.f41723D = glide;
        this.f41721B = requestManager;
        this.f41722C = cls;
        this.f41720A = context;
        this.f41725F = requestManager.m50586d(cls);
        this.f41724E = glide.m50624d();
        m50597s(requestManager.m50588b());
        apply((BaseRequestOptions<?>) requestManager.m50587c());
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> addListener(@Nullable RequestListener<TranscodeType> requestListener) {
        if (isAutoCloneEnabled()) {
            return clone().addListener(requestListener);
        }
        if (requestListener != null) {
            if (this.f41727H == null) {
                this.f41727H = new ArrayList();
            }
            this.f41727H.add(requestListener);
        }
        return selfOrThrowIfLocked();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public /* bridge */ /* synthetic */ BaseRequestOptions apply(@NonNull BaseRequestOptions baseRequestOptions) {
        return apply((BaseRequestOptions<?>) baseRequestOptions);
    }

    @CheckResult
    @Deprecated
    public <Y extends Target<File>> Y downloadOnly(@NonNull Y y) {
        return (Y) getDownloadOnlyRequest().into((RequestBuilder<File>) y);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object obj) {
        if (!(obj instanceof RequestBuilder)) {
            return false;
        }
        RequestBuilder requestBuilder = (RequestBuilder) obj;
        if (!super.equals(requestBuilder) || !Objects.equals(this.f41722C, requestBuilder.f41722C) || !this.f41725F.equals(requestBuilder.f41725F) || !Objects.equals(this.f41726G, requestBuilder.f41726G) || !Objects.equals(this.f41727H, requestBuilder.f41727H) || !Objects.equals(this.f41728I, requestBuilder.f41728I) || !Objects.equals(this.f41729J, requestBuilder.f41729J) || !Objects.equals(this.f41730K, requestBuilder.f41730K) || this.f41731L != requestBuilder.f41731L || this.f41732M != requestBuilder.f41732M) {
            return false;
        }
        return true;
    }

    @NonNull
    public RequestBuilder<TranscodeType> error(@Nullable RequestBuilder<TranscodeType> requestBuilder) {
        if (isAutoCloneEnabled()) {
            return clone().error((RequestBuilder) requestBuilder);
        }
        this.f41729J = requestBuilder;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public RequestBuilder<File> getDownloadOnlyRequest() {
        return new RequestBuilder(File.class, this).apply((BaseRequestOptions<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return Util.hashCode(this.f41732M, Util.hashCode(this.f41731L, Util.hashCode(this.f41730K, Util.hashCode(this.f41729J, Util.hashCode(this.f41728I, Util.hashCode(this.f41727H, Util.hashCode(this.f41726G, Util.hashCode(this.f41725F, Util.hashCode(this.f41722C, super.hashCode())))))))));
    }

    @NonNull
    public <Y extends Target<TranscodeType>> Y into(@NonNull Y y) {
        return (Y) m50595u(y, null, Executors.mainThreadExecutor());
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> listener(@Nullable RequestListener<TranscodeType> requestListener) {
        if (isAutoCloneEnabled()) {
            return clone().listener(requestListener);
        }
        this.f41727H = null;
        return addListener(requestListener);
    }

    /* renamed from: m */
    public final RequestBuilder m50603m(RequestBuilder requestBuilder) {
        return requestBuilder.theme(this.f41720A.getTheme()).signature(AndroidResourceSignature.obtain(this.f41720A));
    }

    /* renamed from: n */
    public final Request m50602n(Target target, RequestListener requestListener, BaseRequestOptions baseRequestOptions, Executor executor) {
        return m50601o(new Object(), target, requestListener, null, this.f41725F, baseRequestOptions.getPriority(), baseRequestOptions.getOverrideWidth(), baseRequestOptions.getOverrideHeight(), baseRequestOptions, executor);
    }

    /* renamed from: o */
    public final Request m50601o(Object obj, Target target, RequestListener requestListener, RequestCoordinator requestCoordinator, TransitionOptions transitionOptions, Priority priority, int i, int i2, BaseRequestOptions baseRequestOptions, Executor executor) {
        ErrorRequestCoordinator errorRequestCoordinator;
        ErrorRequestCoordinator errorRequestCoordinator2;
        if (this.f41729J != null) {
            ErrorRequestCoordinator errorRequestCoordinator3 = new ErrorRequestCoordinator(obj, requestCoordinator);
            errorRequestCoordinator = errorRequestCoordinator3;
            errorRequestCoordinator2 = errorRequestCoordinator3;
        } else {
            errorRequestCoordinator = null;
            errorRequestCoordinator2 = requestCoordinator;
        }
        Request m50600p = m50600p(obj, target, requestListener, errorRequestCoordinator2, transitionOptions, priority, i, i2, baseRequestOptions, executor);
        if (errorRequestCoordinator == null) {
            return m50600p;
        }
        int overrideWidth = this.f41729J.getOverrideWidth();
        int overrideHeight = this.f41729J.getOverrideHeight();
        if (Util.isValidDimensions(i, i2) && !this.f41729J.isValidOverride()) {
            overrideWidth = baseRequestOptions.getOverrideWidth();
            overrideHeight = baseRequestOptions.getOverrideHeight();
        }
        RequestBuilder requestBuilder = this.f41729J;
        ErrorRequestCoordinator errorRequestCoordinator4 = errorRequestCoordinator;
        errorRequestCoordinator4.setRequests(m50600p, requestBuilder.m50601o(obj, target, requestListener, errorRequestCoordinator4, requestBuilder.f41725F, requestBuilder.getPriority(), overrideWidth, overrideHeight, this.f41729J, executor));
        return errorRequestCoordinator4;
    }

    /* renamed from: p */
    public final Request m50600p(Object obj, Target target, RequestListener requestListener, RequestCoordinator requestCoordinator, TransitionOptions transitionOptions, Priority priority, int i, int i2, BaseRequestOptions baseRequestOptions, Executor executor) {
        TransitionOptions transitionOptions2;
        Priority m50598r;
        RequestBuilder requestBuilder = this.f41728I;
        if (requestBuilder != null) {
            if (!this.f41733N) {
                TransitionOptions transitionOptions3 = requestBuilder.f41725F;
                if (requestBuilder.f41731L) {
                    transitionOptions2 = transitionOptions;
                } else {
                    transitionOptions2 = transitionOptions3;
                }
                if (requestBuilder.isPrioritySet()) {
                    m50598r = this.f41728I.getPriority();
                } else {
                    m50598r = m50598r(priority);
                }
                Priority priority2 = m50598r;
                int overrideWidth = this.f41728I.getOverrideWidth();
                int overrideHeight = this.f41728I.getOverrideHeight();
                if (Util.isValidDimensions(i, i2) && !this.f41728I.isValidOverride()) {
                    overrideWidth = baseRequestOptions.getOverrideWidth();
                    overrideHeight = baseRequestOptions.getOverrideHeight();
                }
                ThumbnailRequestCoordinator thumbnailRequestCoordinator = new ThumbnailRequestCoordinator(obj, requestCoordinator);
                Request m50591y = m50591y(obj, target, requestListener, baseRequestOptions, thumbnailRequestCoordinator, transitionOptions, priority, i, i2, executor);
                this.f41733N = true;
                RequestBuilder requestBuilder2 = this.f41728I;
                Request m50601o = requestBuilder2.m50601o(obj, target, requestListener, thumbnailRequestCoordinator, transitionOptions2, priority2, overrideWidth, overrideHeight, requestBuilder2, executor);
                this.f41733N = false;
                thumbnailRequestCoordinator.setRequests(m50591y, m50601o);
                return thumbnailRequestCoordinator;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f41730K != null) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator2 = new ThumbnailRequestCoordinator(obj, requestCoordinator);
            thumbnailRequestCoordinator2.setRequests(m50591y(obj, target, requestListener, baseRequestOptions, thumbnailRequestCoordinator2, transitionOptions, priority, i, i2, executor), m50591y(obj, target, requestListener, baseRequestOptions.m74049clone().sizeMultiplier(this.f41730K.floatValue()), thumbnailRequestCoordinator2, transitionOptions, m50598r(priority), i, i2, executor));
            return thumbnailRequestCoordinator2;
        } else {
            return m50591y(obj, target, requestListener, baseRequestOptions, requestCoordinator, transitionOptions, priority, i, i2, executor);
        }
    }

    @NonNull
    public Target<TranscodeType> preload(int i, int i2) {
        return into((RequestBuilder<TranscodeType>) PreloadTarget.obtain(this.f41721B, i, i2));
    }

    /* renamed from: q */
    public final RequestBuilder m50599q() {
        return clone().error((RequestBuilder) null).thumbnail((RequestBuilder) null);
    }

    /* renamed from: r */
    public final Priority m50598r(Priority priority) {
        int i = C5743a.f41735b[priority.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalArgumentException("unknown priority: " + getPriority());
                }
                return Priority.IMMEDIATE;
            }
            return Priority.HIGH;
        }
        return Priority.NORMAL;
    }

    /* renamed from: s */
    public final void m50597s(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addListener((RequestListener) it.next());
        }
    }

    @NonNull
    public FutureTarget<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: t */
    public final Target m50596t(Target target, RequestListener requestListener, BaseRequestOptions baseRequestOptions, Executor executor) {
        Preconditions.checkNotNull(target);
        if (this.f41732M) {
            Request m50602n = m50602n(target, requestListener, baseRequestOptions, executor);
            Request request = target.getRequest();
            if (m50602n.isEquivalentTo(request) && !m50594v(baseRequestOptions, request)) {
                if (!((Request) Preconditions.checkNotNull(request)).isRunning()) {
                    request.begin();
                }
                return target;
            }
            this.f41721B.clear(target);
            target.setRequest(m50602n);
            this.f41721B.m50585e(target, m50602n);
            return target;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType> requestBuilder) {
        if (isAutoCloneEnabled()) {
            return clone().thumbnail(requestBuilder);
        }
        this.f41728I = requestBuilder;
        return selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> transition(@NonNull TransitionOptions<?, ? super TranscodeType> transitionOptions) {
        if (isAutoCloneEnabled()) {
            return clone().transition(transitionOptions);
        }
        this.f41725F = (TransitionOptions) Preconditions.checkNotNull(transitionOptions);
        this.f41731L = false;
        return selfOrThrowIfLocked();
    }

    /* renamed from: u */
    public Target m50595u(Target target, RequestListener requestListener, Executor executor) {
        return m50596t(target, requestListener, this, executor);
    }

    /* renamed from: v */
    public final boolean m50594v(BaseRequestOptions baseRequestOptions, Request request) {
        if (!baseRequestOptions.isMemoryCacheable() && request.isComplete()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final RequestBuilder m50593w(Object obj) {
        if (isAutoCloneEnabled()) {
            return clone().m50593w(obj);
        }
        this.f41726G = obj;
        this.f41732M = true;
        return selfOrThrowIfLocked();
    }

    /* renamed from: x */
    public final RequestBuilder m50592x(Uri uri, RequestBuilder requestBuilder) {
        if (uri != null && "android.resource".equals(uri.getScheme())) {
            return m50603m(requestBuilder);
        }
        return requestBuilder;
    }

    /* renamed from: y */
    public final Request m50591y(Object obj, Target target, RequestListener requestListener, BaseRequestOptions baseRequestOptions, RequestCoordinator requestCoordinator, TransitionOptions transitionOptions, Priority priority, int i, int i2, Executor executor) {
        Context context = this.f41720A;
        GlideContext glideContext = this.f41724E;
        return SingleRequest.obtain(context, glideContext, obj, this.f41726G, this.f41722C, baseRequestOptions, i, i2, priority, target, requestListener, this.f41727H, requestCoordinator, glideContext.getEngine(), transitionOptions.m50581a(), executor);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> apply(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        Preconditions.checkNotNull(baseRequestOptions);
        return (RequestBuilder) super.apply(baseRequestOptions);
    }

    @CheckResult
    @Deprecated
    public FutureTarget<File> downloadOnly(int i, int i2) {
        return getDownloadOnlyRequest().submit(i, i2);
    }

    @NonNull
    public ViewTarget<ImageView, TranscodeType> into(@NonNull ImageView imageView) {
        RequestBuilder<TranscodeType> requestBuilder;
        Util.assertMainThread();
        Preconditions.checkNotNull(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (C5743a.f41734a[imageView.getScaleType().ordinal()]) {
                case 1:
                    requestBuilder = m74049clone().optionalCenterCrop();
                    break;
                case 2:
                    requestBuilder = m74049clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    requestBuilder = m74049clone().optionalFitCenter();
                    break;
                case 6:
                    requestBuilder = m74049clone().optionalCenterInside();
                    break;
            }
            return (ViewTarget) m50596t(this.f41724E.buildImageViewTarget(imageView, this.f41722C), null, requestBuilder, Executors.mainThreadExecutor());
        }
        requestBuilder = this;
        return (ViewTarget) m50596t(this.f41724E.buildImageViewTarget(imageView, this.f41722C), null, requestBuilder, Executors.mainThreadExecutor());
    }

    @NonNull
    public FutureTarget<TranscodeType> submit(int i, int i2) {
        RequestFutureTarget requestFutureTarget = new RequestFutureTarget(i, i2);
        return (FutureTarget) m50595u(requestFutureTarget, requestFutureTarget, Executors.directExecutor());
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    public RequestBuilder<TranscodeType> clone() {
        RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.m74049clone();
        requestBuilder.f41725F = requestBuilder.f41725F.m74048clone();
        if (requestBuilder.f41727H != null) {
            requestBuilder.f41727H = new ArrayList(requestBuilder.f41727H);
        }
        RequestBuilder requestBuilder2 = requestBuilder.f41728I;
        if (requestBuilder2 != null) {
            requestBuilder.f41728I = requestBuilder2.clone();
        }
        RequestBuilder requestBuilder3 = requestBuilder.f41729J;
        if (requestBuilder3 != null) {
            requestBuilder.f41729J = requestBuilder3.clone();
        }
        return requestBuilder;
    }

    @NonNull
    public Target<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> error(Object obj) {
        if (obj == null) {
            return error((RequestBuilder) null);
        }
        return error((RequestBuilder) m50599q().m74035load(obj));
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(@Nullable RequestBuilder<TranscodeType>... requestBuilderArr) {
        if (requestBuilderArr != null && requestBuilderArr.length != 0) {
            return thumbnail(Arrays.asList(requestBuilderArr));
        }
        return thumbnail((RequestBuilder) null);
    }

    @NonNull
    @CheckResult
    public RequestBuilder<TranscodeType> thumbnail(@Nullable List<RequestBuilder<TranscodeType>> list) {
        RequestBuilder<TranscodeType> requestBuilder = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                RequestBuilder<TranscodeType> requestBuilder2 = list.get(size);
                if (requestBuilder2 != null) {
                    requestBuilder = requestBuilder == null ? requestBuilder2 : requestBuilder2.thumbnail(requestBuilder);
                }
            }
            return thumbnail(requestBuilder);
        }
        return thumbnail((RequestBuilder) null);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74035load(@Nullable Object obj) {
        return m50593w(obj);
    }

    @SuppressLint({"CheckResult"})
    public RequestBuilder(Class<TranscodeType> cls, RequestBuilder<?> requestBuilder) {
        this(requestBuilder.f41723D, requestBuilder.f41721B, cls, requestBuilder.f41720A);
        this.f41726G = requestBuilder.f41726G;
        this.f41732M = requestBuilder.f41732M;
        apply((BaseRequestOptions<?>) requestBuilder);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74030load(@Nullable Bitmap bitmap) {
        return m50593w(bitmap).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74031load(@Nullable Drawable drawable) {
        return m50593w(drawable).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74036load(@Nullable String str) {
        return m50593w(str);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74032load(@Nullable Uri uri) {
        return m50592x(uri, m50593w(uri));
    }

    @NonNull
    @CheckResult
    @Deprecated
    public RequestBuilder<TranscodeType> thumbnail(float f) {
        if (isAutoCloneEnabled()) {
            return clone().thumbnail(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.f41730K = Float.valueOf(f);
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74033load(@Nullable File file) {
        return m50593w(file);
    }

    @Deprecated
    public FutureTarget<TranscodeType> into(int i, int i2) {
        return submit(i, i2);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74034load(@Nullable @DrawableRes @RawRes Integer num) {
        return m50603m(m50593w(num));
    }

    @CheckResult
    @Deprecated
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74037load(@Nullable URL url) {
        return m50593w(url);
    }

    @NonNull
    @CheckResult
    /* renamed from: load */
    public RequestBuilder<TranscodeType> m74038load(@Nullable byte[] bArr) {
        RequestBuilder<TranscodeType> m50593w = m50593w(bArr);
        if (!m50593w.isDiskCacheStrategySet()) {
            m50593w = m50593w.apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
        }
        return !m50593w.isSkipMemoryCacheSet() ? m50593w.apply((BaseRequestOptions<?>) RequestOptions.skipMemoryCacheOf(true)) : m50593w;
    }
}
