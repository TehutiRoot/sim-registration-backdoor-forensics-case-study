package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* renamed from: io.realm.r */
/* loaded from: classes5.dex */
public abstract class AbstractC11420r extends RealmAnyOperator {

    /* renamed from: c */
    public final Object f66984c;

    public AbstractC11420r(Object obj, RealmAny.Type type) {
        super(type);
        this.f66984c = obj;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.f66984c;
        Object obj3 = ((AbstractC11420r) obj).f66984c;
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
    public Object mo29662g(Class cls) {
        return cls.cast(this.f66984c);
    }

    public final int hashCode() {
        Object obj = this.f66984c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return this.f66984c.toString();
    }

    public AbstractC11420r(Object obj, RealmAny.Type type, NativeRealmAny nativeRealmAny) {
        super(type, nativeRealmAny);
        this.f66984c = obj;
    }
}