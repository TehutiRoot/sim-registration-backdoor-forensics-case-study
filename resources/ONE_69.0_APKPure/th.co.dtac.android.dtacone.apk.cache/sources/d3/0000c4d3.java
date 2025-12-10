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
    public static final Factory f61287c = InstanceFactory.create(Collections.emptySet());

    /* renamed from: a */
    public final List f61288a;

    /* renamed from: b */
    public final List f61289b;

    /* loaded from: classes5.dex */
    public static final class Builder<T> {

        /* renamed from: a */
        public final List f61290a;

        /* renamed from: b */
        public final List f61291b;

        public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> provider) {
            this.f61291b.add(provider);
            return this;
        }

        public Builder<T> addProvider(Provider<? extends T> provider) {
            this.f61290a.add(provider);
            return this;
        }

        public SetFactory<T> build() {
            return new SetFactory<>(this.f61290a, this.f61291b);
        }

        public Builder(int i, int i2) {
            this.f61290a = DaggerCollections.presizedList(i);
            this.f61291b = DaggerCollections.presizedList(i2);
        }
    }

    public static <T> Builder<T> builder(int i, int i2) {
        return new Builder<>(i, i2);
    }

    public static <T> Factory<Set<T>> empty() {
        return f61287c;
    }

    public SetFactory(List list, List list2) {
        this.f61288a = list;
        this.f61289b = list2;
    }

    @Override // javax.inject.Provider
    public Set<T> get() {
        int size = this.f61288a.size();
        ArrayList arrayList = new ArrayList(this.f61289b.size());
        int size2 = this.f61289b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((Provider) this.f61289b.get(i)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet m31806b = DaggerCollections.m31806b(size);
        int size3 = this.f61288a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            m31806b.add(Preconditions.checkNotNull(((Provider) this.f61288a.get(i2)).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                m31806b.add(Preconditions.checkNotNull(obj));
            }
        }
        return Collections.unmodifiableSet(m31806b);
    }
}