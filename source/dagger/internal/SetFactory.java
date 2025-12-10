package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class SetFactory<T> implements Factory<Set<T>> {

    /* renamed from: c */
    public static final Factory f61207c = InstanceFactory.create(Collections.emptySet());

    /* renamed from: a */
    public final List f61208a;

    /* renamed from: b */
    public final List f61209b;

    /* loaded from: classes5.dex */
    public static final class Builder<T> {

        /* renamed from: a */
        public final List f61210a;

        /* renamed from: b */
        public final List f61211b;

        public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> provider) {
            this.f61211b.add(provider);
            return this;
        }

        public Builder<T> addProvider(Provider<? extends T> provider) {
            this.f61210a.add(provider);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.f61210a, this.f61211b);
        }

        public Builder(int i, int i2) {
            this.f61210a = DaggerCollections.presizedList(i);
            this.f61211b = DaggerCollections.presizedList(i2);
        }
    }

    public static <T> Builder<T> builder(int i, int i2) {
        return new Builder<>(i, i2);
    }

    public static <T> Factory<Set<T>> empty() {
        return f61207c;
    }

    public SetFactory(List list, List list2) {
        this.f61208a = list;
        this.f61209b = list2;
    }

    @Override // javax.inject.Provider
    public Set<T> get() {
        int size = this.f61208a.size();
        ArrayList arrayList = new ArrayList(this.f61209b.size());
        int size2 = this.f61209b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((Provider) this.f61209b.get(i)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet m31855b = DaggerCollections.m31855b(size);
        int size3 = this.f61208a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            m31855b.add(Preconditions.checkNotNull(((Provider) this.f61208a.get(i2)).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                m31855b.add(Preconditions.checkNotNull(obj));
            }
        }
        return Collections.unmodifiableSet(m31855b);
    }
}
