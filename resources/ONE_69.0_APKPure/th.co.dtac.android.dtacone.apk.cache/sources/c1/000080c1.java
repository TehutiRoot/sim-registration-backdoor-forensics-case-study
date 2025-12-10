package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes3.dex */
public class C5805e implements Resource {

    /* renamed from: a */
    public final boolean f42117a;

    /* renamed from: b */
    public final boolean f42118b;

    /* renamed from: c */
    public final Resource f42119c;

    /* renamed from: d */
    public final InterfaceC5806a f42120d;

    /* renamed from: e */
    public final Key f42121e;

    /* renamed from: f */
    public int f42122f;

    /* renamed from: g */
    public boolean f42123g;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC5806a {
        void onResourceReleased(Key key, C5805e c5805e);
    }

    public C5805e(Resource resource, boolean z, boolean z2, Key key, InterfaceC5806a interfaceC5806a) {
        this.f42119c = (Resource) Preconditions.checkNotNull(resource);
        this.f42117a = z;
        this.f42118b = z2;
        this.f42121e = key;
        this.f42120d = (InterfaceC5806a) Preconditions.checkNotNull(interfaceC5806a);
    }

    /* renamed from: a */
    public synchronized void m50328a() {
        if (!this.f42123g) {
            this.f42122f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: b */
    public Resource m50327b() {
        return this.f42119c;
    }

    /* renamed from: c */
    public boolean m50326c() {
        return this.f42117a;
    }

    /* renamed from: d */
    public void m50325d() {
        boolean z;
        synchronized (this) {
            int i = this.f42122f;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f42122f = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f42120d.onResourceReleased(this.f42121e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Object get() {
        return this.f42119c.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class getResourceClass() {
        return this.f42119c.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.f42119c.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
        if (this.f42122f <= 0) {
            if (!this.f42123g) {
                this.f42123g = true;
                if (this.f42118b) {
                    this.f42119c.recycle();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f42117a + ", listener=" + this.f42120d + ", key=" + this.f42121e + ", acquired=" + this.f42122f + ", isRecycled=" + this.f42123g + ", resource=" + this.f42119c + '}';
    }
}