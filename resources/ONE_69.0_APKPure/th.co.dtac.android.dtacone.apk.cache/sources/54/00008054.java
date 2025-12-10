package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class DataRewinderRegistry {

    /* renamed from: b */
    public static final DataRewinder.Factory f41865b = new C5752a();

    /* renamed from: a */
    public final Map f41866a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.DataRewinderRegistry$a */
    /* loaded from: classes3.dex */
    public class C5752a implements DataRewinder.Factory {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public DataRewinder build(Object obj) {
            return new C5753b(obj);
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        public Class getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: com.bumptech.glide.load.data.DataRewinderRegistry$b */
    /* loaded from: classes3.dex */
    public static final class C5753b implements DataRewinder {

        /* renamed from: a */
        public final Object f41867a;

        public C5753b(Object obj) {
            this.f41867a = obj;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataRewinder
        public Object rewindAndGet() {
            return this.f41867a;
        }
    }

    @NonNull
    public synchronized <T> DataRewinder<T> build(@NonNull T t) {
        DataRewinder.Factory factory;
        try {
            Preconditions.checkNotNull(t);
            factory = (DataRewinder.Factory) this.f41866a.get(t.getClass());
            if (factory == null) {
                Iterator it = this.f41866a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DataRewinder.Factory factory2 = (DataRewinder.Factory) it.next();
                    if (factory2.getDataClass().isAssignableFrom(t.getClass())) {
                        factory = factory2;
                        break;
                    }
                }
            }
            if (factory == null) {
                factory = f41865b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return factory.build(t);
    }

    public synchronized void register(@NonNull DataRewinder.Factory<?> factory) {
        this.f41866a.put(factory.getDataClass(), factory);
    }
}