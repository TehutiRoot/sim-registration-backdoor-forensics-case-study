package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class SetBuilder<T> {

    /* renamed from: a */
    public final List f61206a;

    public SetBuilder(int i) {
        this.f61206a = new ArrayList(i);
    }

    public static <T> SetBuilder<T> newSetBuilder(int i) {
        return new SetBuilder<>(i);
    }

    public SetBuilder<T> add(T t) {
        this.f61206a.add(Preconditions.checkNotNull(t, "Set contributions cannot be null"));
        return this;
    }

    public SetBuilder<T> addAll(Collection<? extends T> collection) {
        for (T t : collection) {
            Preconditions.checkNotNull(t, "Set contributions cannot be null");
        }
        this.f61206a.addAll(collection);
        return this;
    }

    public Set<T> build() {
        if (this.f61206a.isEmpty()) {
            return Collections.emptySet();
        }
        if (this.f61206a.size() == 1) {
            return Collections.singleton(this.f61206a.get(0));
        }
        return Collections.unmodifiableSet(new HashSet(this.f61206a));
    }
}
