package p000;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;

/* renamed from: Jk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17867Jk0 implements Resource, FactoryPools.Poolable {

    /* renamed from: e */
    public static final Pools.Pool f2914e = FactoryPools.threadSafe(20, new C0694a());

    /* renamed from: a */
    public final StateVerifier f2915a = StateVerifier.newInstance();

    /* renamed from: b */
    public Resource f2916b;

    /* renamed from: c */
    public boolean f2917c;

    /* renamed from: d */
    public boolean f2918d;

    /* renamed from: Jk0$a */
    /* loaded from: classes3.dex */
    public class C0694a implements FactoryPools.Factory {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        /* renamed from: a */
        public C17867Jk0 create() {
            return new C17867Jk0();
        }
    }

    /* renamed from: b */
    public static C17867Jk0 m67689b(Resource resource) {
        C17867Jk0 c17867Jk0 = (C17867Jk0) Preconditions.checkNotNull((C17867Jk0) f2914e.acquire());
        c17867Jk0.m67690a(resource);
        return c17867Jk0;
    }

    /* renamed from: c */
    private void m67688c() {
        this.f2916b = null;
        f2914e.release(this);
    }

    /* renamed from: a */
    public final void m67690a(Resource resource) {
        this.f2918d = false;
        this.f2917c = true;
        this.f2916b = resource;
    }

    /* renamed from: d */
    public synchronized void m67687d() {
        this.f2915a.throwIfRecycled();
        if (this.f2917c) {
            this.f2917c = false;
            if (this.f2918d) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Object get() {
        return this.f2916b.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class getResourceClass() {
        return this.f2916b.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.f2916b.getSize();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    public StateVerifier getVerifier() {
        return this.f2915a;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public synchronized void recycle() {
        this.f2915a.throwIfRecycled();
        this.f2918d = true;
        if (!this.f2917c) {
            this.f2916b.recycle();
            m67688c();
        }
    }
}
