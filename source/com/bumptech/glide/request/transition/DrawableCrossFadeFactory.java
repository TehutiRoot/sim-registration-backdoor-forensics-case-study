package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* loaded from: classes3.dex */
public class DrawableCrossFadeFactory implements TransitionFactory<Drawable> {

    /* renamed from: a */
    public final int f42683a;

    /* renamed from: b */
    public final boolean f42684b;

    /* renamed from: c */
    public DrawableCrossFadeTransition f42685c;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public final int f42686a;

        /* renamed from: b */
        public boolean f42687b;

        public Builder() {
            this(300);
        }

        public DrawableCrossFadeFactory build() {
            return new DrawableCrossFadeFactory(this.f42686a, this.f42687b);
        }

        public Builder setCrossFadeEnabled(boolean z) {
            this.f42687b = z;
            return this;
        }

        public Builder(int i) {
            this.f42686a = i;
        }
    }

    public DrawableCrossFadeFactory(int i, boolean z) {
        this.f42683a = i;
        this.f42684b = z;
    }

    /* renamed from: a */
    public final Transition m49995a() {
        if (this.f42685c == null) {
            this.f42685c = new DrawableCrossFadeTransition(this.f42683a, this.f42684b);
        }
        return this.f42685c;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition<Drawable> build(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return NoTransition.get();
        }
        return m49995a();
    }
}
