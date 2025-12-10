package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: io.realm.r */
/* loaded from: classes5.dex */
public abstract class AbstractC11433r extends RealmAnyOperator {

    /* renamed from: c */
    public final Object f66921c;

    public AbstractC11433r(Object obj, RealmAny.Type type) {
        super(type);
        this.f66921c = obj;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.f66921c;
        Object obj3 = ((AbstractC11433r) obj).f66921c;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
            return true;
        }
        return obj2.equals(obj3);
    }

    @Override // io.realm.RealmAnyOperator
    /* renamed from: g */
    public Object mo29322g(Class cls) {
        return cls.cast(this.f66921c);
    }

    public final int hashCode() {
        Object obj = this.f66921c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return this.f66921c.toString();
    }

    public AbstractC11433r(Object obj, RealmAny.Type type, NativeRealmAny nativeRealmAny) {
        super(type, nativeRealmAny);
        this.f66921c = obj;
    }
}
