package com.bumptech.glide.util;

/* loaded from: classes3.dex */
public final class GlideSuppliers {

    /* loaded from: classes3.dex */
    public interface GlideSupplier<T> {
        T get();
    }

    /* renamed from: com.bumptech.glide.util.GlideSuppliers$a */
    /* loaded from: classes3.dex */
    public class C5936a implements GlideSupplier {

        /* renamed from: a */
        public volatile Object f42726a;

        /* renamed from: b */
        public final /* synthetic */ GlideSupplier f42727b;

        public C5936a(GlideSupplier glideSupplier) {
            this.f42727b = glideSupplier;
        }

        @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
        public Object get() {
            if (this.f42726a == null) {
                synchronized (this) {
                    try {
                        if (this.f42726a == null) {
                            this.f42726a = Preconditions.checkNotNull(this.f42727b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f42726a;
        }
    }

    public static <T> GlideSupplier<T> memorize(GlideSupplier<T> glideSupplier) {
        return new C5936a(glideSupplier);
    }
}
