package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class StateVerifier {

    /* renamed from: com.bumptech.glide.util.pool.StateVerifier$b */
    /* loaded from: classes3.dex */
    public static class C5934b extends StateVerifier {

        /* renamed from: a */
        public volatile boolean f42761a;

        public C5934b() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        /* renamed from: a */
        public void mo49972a(boolean z) {
            this.f42761a = z;
        }

        @Override // com.bumptech.glide.util.pool.StateVerifier
        public void throwIfRecycled() {
            if (!this.f42761a) {
                return;
            }
            throw new IllegalStateException("Already released");
        }
    }

    @NonNull
    public static StateVerifier newInstance() {
        return new C5934b();
    }

    /* renamed from: a */
    public abstract void mo49972a(boolean z);

    public abstract void throwIfRecycled();

    public StateVerifier() {
    }
}