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
    public final GifDecoder f42447a;

    /* renamed from: b */
    public final Handler f42448b;

    /* renamed from: c */
    public final List f42449c;

    /* renamed from: d */
    public final RequestManager f42450d;

    /* renamed from: e */
    public final BitmapPool f42451e;

    /* renamed from: f */
    public boolean f42452f;

    /* renamed from: g */
    public boolean f42453g;

    /* renamed from: h */
    public boolean f42454h;

    /* renamed from: i */
    public RequestBuilder f42455i;

    /* renamed from: j */
    public C5883a f42456j;

    /* renamed from: k */
    public boolean f42457k;

    /* renamed from: l */
    public C5883a f42458l;

    /* renamed from: m */
    public Bitmap f42459m;

    /* renamed from: n */
    public Transformation f42460n;

    /* renamed from: o */
    public C5883a f42461o;

    /* renamed from: p */
    public int f42462p;

    /* renamed from: q */
    public int f42463q;

    /* renamed from: r */
    public int f42464r;

    /* loaded from: classes3.dex */
    public interface FrameCallback {
        void onFrameReady();
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$a */
    /* loaded from: classes3.dex */
    public static class C5883a extends CustomTarget {

        /* renamed from: d */
        public final Handler f42465d;

        /* renamed from: e */
        public final int f42466e;

        /* renamed from: f */
        public final long f42467f;

        /* renamed from: g */
        public Bitmap f42468g;

        public C5883a(Handler handler, int i, long j) {
            this.f42465d = handler;
            this.f42466e = i;
            this.f42467f = j;
        }

        /* renamed from: a */
        public Bitmap m50110a() {
            return this.f42468g;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
            this.f42468g = null;
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Bitmap bitmap, Transition transition) {
            this.f42468g = bitmap;
            this.f42465d.sendMessageAtTime(this.f42465d.obtainMessage(1, this), this.f42467f);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.gif.GifFrameLoader$b */
    /* loaded from: classes3.dex */
    public class C5884b implements Handler.Callback {
        public C5884b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                GifFrameLoader.this.m50118o((C5883a) message.obj);
                return true;
            } else if (i == 2) {
                GifFrameLoader.this.f42450d.clear((C5883a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public GifFrameLoader(Glide glide, GifDecoder gifDecoder, int i, int i2, Transformation transformation, Bitmap bitmap) {
        this(glide.getBitmapPool(), Glide.with(glide.getContext()), gifDecoder, null, m50122k(Glide.with(glide.getContext()), i, i2), transformation, bitmap);
    }

    /* renamed from: g */
    public static Key m50126g() {
        return new ObjectKey(Double.valueOf(Math.random()));
    }

    /* renamed from: k */
    public static RequestBuilder m50122k(RequestManager requestManager, int i, int i2) {
        return requestManager.asBitmap().apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).useAnimationPool(true).skipMemoryCache(true).override(i, i2));
    }

    /* renamed from: a */
    public void m50132a() {
        this.f42449c.clear();
        m50117p();
        m50113t();
        C5883a c5883a = this.f42456j;
        if (c5883a != null) {
            this.f42450d.clear(c5883a);
            this.f42456j = null;
        }
        C5883a c5883a2 = this.f42458l;
        if (c5883a2 != null) {
            this.f42450d.clear(c5883a2);
            this.f42458l = null;
        }
        C5883a c5883a3 = this.f42461o;
        if (c5883a3 != null) {
            this.f42450d.clear(c5883a3);
            this.f42461o = null;
        }
        this.f42447a.clear();
        this.f42457k = true;
    }

    /* renamed from: b */
    public ByteBuffer m50131b() {
        return this.f42447a.getData().asReadOnlyBuffer();
    }

    /* renamed from: c */
    public Bitmap m50130c() {
        C5883a c5883a = this.f42456j;
        if (c5883a != null) {
            return c5883a.m50110a();
        }
        return this.f42459m;
    }

    /* renamed from: d */
    public int m50129d() {
        C5883a c5883a = this.f42456j;
        if (c5883a != null) {
            return c5883a.f42466e;
        }
        return -1;
    }

    /* renamed from: e */
    public Bitmap m50128e() {
        return this.f42459m;
    }

    /* renamed from: f */
    public int m50127f() {
        return this.f42447a.getFrameCount();
    }

    /* renamed from: h */
    public Transformation m50125h() {
        return this.f42460n;
    }

    /* renamed from: i */
    public int m50124i() {
        return this.f42464r;
    }

    /* renamed from: j */
    public int m50123j() {
        return this.f42447a.getTotalIterationCount();
    }

    /* renamed from: l */
    public int m50121l() {
        return this.f42447a.getByteSize() + this.f42462p;
    }

    /* renamed from: m */
    public int m50120m() {
        return this.f42463q;
    }

    /* renamed from: n */
    public final void m50119n() {
        boolean z;
        if (this.f42452f && !this.f42453g) {
            if (this.f42454h) {
                if (this.f42461o == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "Pending target must be null when starting from the first frame");
                this.f42447a.resetFrameIndex();
                this.f42454h = false;
            }
            C5883a c5883a = this.f42461o;
            if (c5883a != null) {
                this.f42461o = null;
                m50118o(c5883a);
                return;
            }
            this.f42453g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.f42447a.getNextDelay();
            this.f42447a.advance();
            this.f42458l = new C5883a(this.f42448b, this.f42447a.getCurrentFrameIndex(), uptimeMillis);
            this.f42455i.apply((BaseRequestOptions<?>) RequestOptions.signatureOf(m50126g())).m74219load((Object) this.f42447a).into((RequestBuilder) this.f42458l);
        }
    }

    /* renamed from: o */
    public void m50118o(C5883a c5883a) {
        this.f42453g = false;
        if (this.f42457k) {
            this.f42448b.obtainMessage(2, c5883a).sendToTarget();
        } else if (!this.f42452f) {
            if (this.f42454h) {
                this.f42448b.obtainMessage(2, c5883a).sendToTarget();
            } else {
                this.f42461o = c5883a;
            }
        } else {
            if (c5883a.m50110a() != null) {
                m50117p();
                C5883a c5883a2 = this.f42456j;
                this.f42456j = c5883a;
                for (int size = this.f42449c.size() - 1; size >= 0; size--) {
                    ((FrameCallback) this.f42449c.get(size)).onFrameReady();
                }
                if (c5883a2 != null) {
                    this.f42448b.obtainMessage(2, c5883a2).sendToTarget();
                }
            }
            m50119n();
        }
    }

    /* renamed from: p */
    public final void m50117p() {
        Bitmap bitmap = this.f42459m;
        if (bitmap != null) {
            this.f42451e.put(bitmap);
            this.f42459m = null;
        }
    }

    /* renamed from: q */
    public void m50116q(Transformation transformation, Bitmap bitmap) {
        this.f42460n = (Transformation) Preconditions.checkNotNull(transformation);
        this.f42459m = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f42455i = this.f42455i.apply((BaseRequestOptions<?>) new RequestOptions().transform(transformation));
        this.f42462p = Util.getBitmapByteSize(bitmap);
        this.f42463q = bitmap.getWidth();
        this.f42464r = bitmap.getHeight();
    }

    /* renamed from: r */
    public void m50115r() {
        Preconditions.checkArgument(!this.f42452f, "Can't restart a running animation");
        this.f42454h = true;
        C5883a c5883a = this.f42461o;
        if (c5883a != null) {
            this.f42450d.clear(c5883a);
            this.f42461o = null;
        }
    }

    /* renamed from: s */
    public final void m50114s() {
        if (this.f42452f) {
            return;
        }
        this.f42452f = true;
        this.f42457k = false;
        m50119n();
    }

    /* renamed from: t */
    public final void m50113t() {
        this.f42452f = false;
    }

    /* renamed from: u */
    public void m50112u(FrameCallback frameCallback) {
        if (!this.f42457k) {
            if (!this.f42449c.contains(frameCallback)) {
                boolean isEmpty = this.f42449c.isEmpty();
                this.f42449c.add(frameCallback);
                if (isEmpty) {
                    m50114s();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* renamed from: v */
    public void m50111v(FrameCallback frameCallback) {
        this.f42449c.remove(frameCallback);
        if (this.f42449c.isEmpty()) {
            m50113t();
        }
    }

    public GifFrameLoader(BitmapPool bitmapPool, RequestManager requestManager, GifDecoder gifDecoder, Handler handler, RequestBuilder requestBuilder, Transformation transformation, Bitmap bitmap) {
        this.f42449c = new ArrayList();
        this.f42450d = requestManager;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C5884b()) : handler;
        this.f42451e = bitmapPool;
        this.f42448b = handler;
        this.f42455i = requestBuilder;
        this.f42447a = gifDecoder;
        m50116q(transformation, bitmap);
    }
}