package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GifFrameLoader {

    /* renamed from: a */
    public final GifDecoder f42435a;

    /* renamed from: b */
    public final Handler f42436b;

    /* renamed from: c */
    public final List f42437c;

    /* renamed from: d */
    public final RequestManager f42438d;

    /* renamed from: e */
    public final BitmapPool f42439e;

    /* renamed from: f */
    public boolean f42440f;

    /* renamed from: g */
    public boolean f42441g;

    /* renamed from: h */
    public boolean f42442h;

    /* renamed from: i */
    public RequestBuilder f42443i;

    /* renamed from: j */
    public C5894a f42444j;

    /* renamed from: k */
    public boolean f42445k;

    /* renamed from: l */
    public C5894a f42446l;

    /* renamed from: m */
    public Bitmap f42447m;

    /* renamed from: n */
    public Transformation f42448n;

    /* renamed from: o */
    public C5894a f42449o;

    /* renamed from: p */
    public int f42450p;

    /* renamed from: q */
    public int f42451q;

    /* renamed from: r */
    public int f42452r;

    /* loaded from: classes3.dex */
    public interface FrameCallback {
        void onFrameReady();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$a */
    /* loaded from: classes3.dex */
    public static class C5894a extends CustomTarget {

        /* renamed from: d */
        public final Handler f42453d;

        /* renamed from: e */
        public final int f42454e;

        /* renamed from: f */
        public final long f42455f;

        /* renamed from: g */
        public Bitmap f42456g;

        public C5894a(Handler handler, int i, long j) {
            this.f42453d = handler;
            this.f42454e = i;
            this.f42455f = j;
        }

        /* renamed from: a */
        public Bitmap m50113a() {
            return this.f42456g;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
            this.f42456g = null;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Bitmap bitmap, Transition transition) {
            this.f42456g = bitmap;
            this.f42453d.sendMessageAtTime(this.f42453d.obtainMessage(1, this), this.f42455f);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$b */
    /* loaded from: classes3.dex */
    public class C5895b implements Handler.Callback {
        public C5895b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                GifFrameLoader.this.m50121o((C5894a) message.obj);
                return true;
            } else if (i == 2) {
                GifFrameLoader.this.f42438d.clear((C5894a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public GifFrameLoader(Glide glide, GifDecoder gifDecoder, int i, int i2, Transformation transformation, Bitmap bitmap) {
        this(glide.getBitmapPool(), Glide.with(glide.getContext()), gifDecoder, null, m50125k(Glide.with(glide.getContext()), i, i2), transformation, bitmap);
    }

    /* renamed from: g */
    public static Key m50129g() {
        return new ObjectKey(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    public static RequestBuilder m50125k(RequestManager requestManager, int i, int i2) {
        return requestManager.asBitmap().apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).useAnimationPool(true).skipMemoryCache(true).override(i, i2));
    }

    /* renamed from: a */
    public void m50135a() {
        this.f42437c.clear();
        m50120p();
        m50116t();
        C5894a c5894a = this.f42444j;
        if (c5894a != null) {
            this.f42438d.clear(c5894a);
            this.f42444j = null;
        }
        C5894a c5894a2 = this.f42446l;
        if (c5894a2 != null) {
            this.f42438d.clear(c5894a2);
            this.f42446l = null;
        }
        C5894a c5894a3 = this.f42449o;
        if (c5894a3 != null) {
            this.f42438d.clear(c5894a3);
            this.f42449o = null;
        }
        this.f42435a.clear();
        this.f42445k = true;
    }

    /* renamed from: b */
    public ByteBuffer m50134b() {
        return this.f42435a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m50133c() {
        C5894a c5894a = this.f42444j;
        if (c5894a != null) {
            return c5894a.m50113a();
        }
        return this.f42447m;
    }

    /* renamed from: d */
    public int m50132d() {
        C5894a c5894a = this.f42444j;
        if (c5894a != null) {
            return c5894a.f42454e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m50131e() {
        return this.f42447m;
    }

    /* renamed from: f */
    public int m50130f() {
        return this.f42435a.getFrameCount();
    }

    /* renamed from: h */
    public Transformation m50128h() {
        return this.f42448n;
    }

    /* renamed from: i */
    public int m50127i() {
        return this.f42452r;
    }

    /* renamed from: j */
    public int m50126j() {
        return this.f42435a.getTotalIterationCount();
    }

    /* renamed from: l */
    public int m50124l() {
        return this.f42435a.getByteSize() + this.f42450p;
    }

    /* renamed from: m */
    public int m50123m() {
        return this.f42451q;
    }

    /* renamed from: n */
    public final void m50122n() {
        boolean z;
        if (this.f42440f && !this.f42441g) {
            if (this.f42442h) {
                if (this.f42449o == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "Pending target must be null when starting from the first frame");
                this.f42435a.resetFrameIndex();
                this.f42442h = false;
            }
            C5894a c5894a = this.f42449o;
            if (c5894a != null) {
                this.f42449o = null;
                m50121o(c5894a);
                return;
            }
            this.f42441g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.f42435a.getNextDelay();
            this.f42435a.advance();
            this.f42446l = new C5894a(this.f42436b, this.f42435a.getCurrentFrameIndex(), uptimeMillis);
            this.f42443i.apply((BaseRequestOptions<?>) RequestOptions.signatureOf(m50129g())).m74035load((Object) this.f42435a).into((RequestBuilder) this.f42446l);
        }
    }

    /* renamed from: o */
    public void m50121o(C5894a c5894a) {
        this.f42441g = false;
        if (this.f42445k) {
            this.f42436b.obtainMessage(2, c5894a).sendToTarget();
        } else if (!this.f42440f) {
            if (this.f42442h) {
                this.f42436b.obtainMessage(2, c5894a).sendToTarget();
            } else {
                this.f42449o = c5894a;
            }
        } else {
            if (c5894a.m50113a() != null) {
                m50120p();
                C5894a c5894a2 = this.f42444j;
                this.f42444j = c5894a;
                for (int size = this.f42437c.size() - 1; size >= 0; size--) {
                    ((FrameCallback) this.f42437c.get(size)).onFrameReady();
                }
                if (c5894a2 != null) {
                    this.f42436b.obtainMessage(2, c5894a2).sendToTarget();
                }
            }
            m50122n();
        }
    }

    /* renamed from: p */
    public final void m50120p() {
        Bitmap bitmap = this.f42447m;
        if (bitmap != null) {
            this.f42439e.put(bitmap);
            this.f42447m = null;
        }
    }

    /* renamed from: q */
    public void m50119q(Transformation transformation, Bitmap bitmap) {
        this.f42448n = (Transformation) Preconditions.checkNotNull(transformation);
        this.f42447m = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f42443i = this.f42443i.apply((BaseRequestOptions<?>) new RequestOptions().transform(transformation));
        this.f42450p = Util.getBitmapByteSize(bitmap);
        this.f42451q = bitmap.getWidth();
        this.f42452r = bitmap.getHeight();
    }

    /* renamed from: r */
    public void m50118r() {
        Preconditions.checkArgument(!this.f42440f, "Can't restart a running animation");
        this.f42442h = true;
        C5894a c5894a = this.f42449o;
        if (c5894a != null) {
            this.f42438d.clear(c5894a);
            this.f42449o = null;
        }
    }

    /* renamed from: s */
    public final void m50117s() {
        if (this.f42440f) {
            return;
        }
        this.f42440f = true;
        this.f42445k = false;
        m50122n();
    }

    /* renamed from: t */
    public final void m50116t() {
        this.f42440f = false;
    }

    /* renamed from: u */
    public void m50115u(FrameCallback frameCallback) {
        if (!this.f42445k) {
            if (!this.f42437c.contains(frameCallback)) {
                boolean isEmpty = this.f42437c.isEmpty();
                this.f42437c.add(frameCallback);
                if (isEmpty) {
                    m50117s();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* renamed from: v */
    public void m50114v(FrameCallback frameCallback) {
        this.f42437c.remove(frameCallback);
        if (this.f42437c.isEmpty()) {
            m50116t();
        }
    }

    public GifFrameLoader(BitmapPool bitmapPool, RequestManager requestManager, GifDecoder gifDecoder, Handler handler, RequestBuilder requestBuilder, Transformation transformation, Bitmap bitmap) {
        this.f42437c = new ArrayList();
        this.f42438d = requestManager;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C5895b()) : handler;
        this.f42439e = bitmapPool;
        this.f42436b = handler;
        this.f42443i = requestBuilder;
        this.f42435a = gifDecoder;
        m50119q(transformation, bitmap);
    }
}
