package io.realm;

import io.realm.internal.ManageableObject;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class MutableRealmInteger implements Comparable<MutableRealmInteger>, ManageableObject {

    /* renamed from: io.realm.MutableRealmInteger$a */
    /* loaded from: classes5.dex */
    public static final class C11223a extends MutableRealmInteger {

        /* renamed from: a */
        public Long f66573a;

        public C11223a(Long l) {
            this.f66573a = l;
        }

        @Override // io.realm.MutableRealmInteger, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(MutableRealmInteger mutableRealmInteger) {
            return super.compareTo(mutableRealmInteger);
        }

        @Override // io.realm.MutableRealmInteger
        public void decrement(long j) {
            increment(-j);
        }

        @Override // io.realm.MutableRealmInteger
        public Long get() {
            return this.f66573a;
        }

        @Override // io.realm.MutableRealmInteger
        public void increment(long j) {
            Long l = this.f66573a;
            if (l != null) {
                this.f66573a = Long.valueOf(l.longValue() + j);
                return;
            }
            throw new IllegalStateException("Cannot increment a MutableRealmInteger whose value is null. Set its value first.");
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
            return false;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
            return false;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
            return true;
        }

        @Override // io.realm.MutableRealmInteger
        public void set(Long l) {
            this.f66573a = l;
        }
    }

    public static MutableRealmInteger ofNull() {
        return new C11223a(null);
    }

    public static MutableRealmInteger valueOf(Long l) {
        return new C11223a(l);
    }

    public abstract void decrement(long j);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutableRealmInteger)) {
            return false;
        }
        Long l = get();
        Long l2 = ((MutableRealmInteger) obj).get();
        if (l == null) {
            if (l2 == null) {
                return true;
            }
            return false;
        }
        return l.equals(l2);
    }

    @Nullable
    public abstract Long get();

    public final int hashCode() {
        Long l = get();
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public abstract void increment(long j);

    public final boolean isNull() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    public final void set(long j) {
        set(Long.valueOf(j));
    }

    public abstract void set(@Nullable Long l);

    public static MutableRealmInteger valueOf(long j) {
        return valueOf(Long.valueOf(j));
    }

    @Override // java.lang.Comparable
    public final int compareTo(MutableRealmInteger mutableRealmInteger) {
        Long l = get();
        Long l2 = mutableRealmInteger.get();
        if (l == null) {
            return l2 == null ? 0 : -1;
        } else if (l2 == null) {
            return 1;
        } else {
            return l.compareTo(l2);
        }
    }

    public static MutableRealmInteger valueOf(String str) {
        return valueOf(Long.parseLong(str));
    }
}