package p000;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

/* renamed from: Pk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18289Pk0 implements Resource, FactoryPools.Poolable {

    /* renamed from: e */
    public static final Pools.Pool f4873e = FactoryPools.threadSafe(20, new C1110a());

    /* renamed from: a */
    public final StateVerifier f4874a = StateVerifier.newInstance();

    /* renamed from: b */
    public Resource f4875b;

    /* renamed from: c */
    public boolean f4876c;

    /* renamed from: d */
    public boolean f4877d;

    /* renamed from: Pk0$a */
    /* loaded from: classes3.dex */
    public class C1110a implements FactoryPools.Factory {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public C18289Pk0 create() {
            return new C18289Pk0();
        }
    }

    /* renamed from: b */
    public static C18289Pk0 m66929b(Resource resource) {
        C18289Pk0 c18289Pk0 = (C18289Pk0) Preconditions.checkNotNull((C18289Pk0) f4873e.acquire());
        c18289Pk0.m66930a(resource);
        return c18289Pk0;
    }

    /* renamed from: c */
    private void m66928c() {
        this.f4875b = null;
        f4873e.release(this);
    }

    /* renamed from: a */
    public final void m66930a(Resource resource) {
        this.f4877d = false;
        this.f4876c = true;
        this.f4875b = resource;
    }

    /* renamed from: d */
    public synchronized void m66927d() {
        this.f4874a.throwIfRecycled();
        if (this.f4876c) {
            this.f4876c = false;
            if (this.f4877d) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Object get() {
        return this.f4875b.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class getResourceClass() {
        return this.f4875b.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.f4875b.getSize();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public StateVerifier getVerifier() {
        return this.f4874a;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
        this.f4874a.throwIfRecycled();
        this.f4877d = true;
        if (!this.f4876c) {
            this.f4875b.recycle();
            m66928c();
        }
    }
}