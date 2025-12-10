package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes3.dex */
public class C5816e implements Resource {

    /* renamed from: a */
    public final boolean f42105a;

    /* renamed from: b */
    public final boolean f42106b;

    /* renamed from: c */
    public final Resource f42107c;

    /* renamed from: d */
    public final InterfaceC5817a f42108d;

    /* renamed from: e */
    public final Key f42109e;

    /* renamed from: f */
    public int f42110f;

    /* renamed from: g */
    public boolean f42111g;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC5817a {
        void onResourceReleased(Key key, C5816e c5816e);
    }

    public C5816e(Resource resource, boolean z, boolean z2, Key key, InterfaceC5817a interfaceC5817a) {
        this.f42107c = (Resource) Preconditions.checkNotNull(resource);
        this.f42105a = z;
        this.f42106b = z2;
        this.f42109e = key;
        this.f42108d = (InterfaceC5817a) Preconditions.checkNotNull(interfaceC5817a);
    }

    /* renamed from: a */
    public synchronized void m50331a() {
        if (!this.f42111g) {
            this.f42110f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: b */
    public Resource m50330b() {
        return this.f42107c;
    }

    /* renamed from: c */
    public boolean m50329c() {
        return this.f42105a;
    }

    /* renamed from: d */
    public void m50328d() {
        boolean z;
        synchronized (this) {
            int i = this.f42110f;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f42110f = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f42108d.onResourceReleased(this.f42109e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Object get() {
        return this.f42107c.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class getResourceClass() {
        return this.f42107c.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.f42107c.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
        if (this.f42110f <= 0) {
            if (!this.f42111g) {
                this.f42111g = true;
                if (this.f42106b) {
                    this.f42107c.recycle();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f42105a + ", listener=" + this.f42108d + ", key=" + this.f42109e + ", acquired=" + this.f42110f + ", isRecycled=" + this.f42111g + ", resource=" + this.f42107c + '}';
    }
}
