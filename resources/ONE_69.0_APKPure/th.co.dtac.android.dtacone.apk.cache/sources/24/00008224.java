package com.bumptech.glide.util;

/* loaded from: classes3.dex */
public final class GlideSuppliers {

    /* loaded from: classes3.dex */
    public interface GlideSupplier<T> {
        T get();
    }

    /* renamed from: com.bumptech.glide.util.GlideSuppliers$a */
    /* loaded from: classes3.dex */
    public class C5925a implements GlideSupplier {

        /* renamed from: a */
        public volatile Object f42738a;

        /* renamed from: b */
        public final /* synthetic */ GlideSupplier f42739b;

        public C5925a(GlideSupplier glideSupplier) {
            this.f42739b = glideSupplier;
        }

        @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
        public Object get() {
            if (this.f42738a == null) {
                synchronized (this) {
                    try {
                        if (this.f42738a == null) {
                            this.f42738a = Preconditions.checkNotNull(this.f42739b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f42738a;
        }
    }

    public static <T> GlideSupplier<T> memorize(GlideSupplier<T> glideSupplier) {
        return new C5925a(glideSupplier);
    }
}