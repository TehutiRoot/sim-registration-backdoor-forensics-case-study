package io.realm;

import io.realm.RealmAny;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAny;
import java.util.Collections;

/* renamed from: io.realm.u */
/* loaded from: classes5.dex */
public class C11486u extends RealmAnyOperator {

    /* renamed from: c */
    public final Class f67058c;

    /* renamed from: d */
    public final RealmModel f67059d;

    public C11486u(RealmModel realmModel) {
        super(RealmAny.Type.OBJECT);
        this.f67059d = realmModel;
        this.f67058c = realmModel.getClass();
    }

    /* renamed from: h */
    public static RealmModel m29321h(BaseRealm baseRealm, Class cls, NativeRealmAny nativeRealmAny) {
        return baseRealm.m29758j(cls, nativeRealmAny.getRealmModelRowKey(), false, Collections.emptyList());
    }

    @Override // io.realm.RealmAnyOperator
    public void checkValidObject(BaseRealm baseRealm) {
        if (RealmObject.isValid(this.f67059d) && RealmObject.isManaged(this.f67059d)) {
            if (((RealmObjectProxy) this.f67059d).realmGet$proxyState().getRealm$realm() == baseRealm) {
                return;
            }
            throw new IllegalArgumentException("Realm object belongs to a different Realm.");
        }
        throw new IllegalArgumentException("Realm object is not a valid managed object.");
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny createNativeRealmAny() {
        if (this.f67059d instanceof RealmObjectProxy) {
            return new NativeRealmAny((RealmObjectProxy) mo29322g(RealmObjectProxy.class));
        }
        throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        RealmModel realmModel = this.f67059d;
        RealmModel realmModel2 = ((C11486u) obj).f67059d;
        if (realmModel == null) {
            if (realmModel2 != null) {
                return false;
            }
            return true;
        }
        return realmModel.equals(realmModel2);
    }

    @Override // io.realm.RealmAnyOperator
    /* renamed from: f */
    public Class mo29323f() {
        if (RealmObjectProxy.class.isAssignableFrom(this.f67058c)) {
            return this.f67058c.getSuperclass();
        }
        return this.f67058c;
    }

    @Override // io.realm.RealmAnyOperator
    /* renamed from: g */
    public Object mo29322g(Class cls) {
        return cls.cast(this.f67059d);
    }

    public int hashCode() {
        return this.f67059d.hashCode();
    }

    public String toString() {
        return this.f67059d.toString();
    }

    public C11486u(BaseRealm baseRealm, NativeRealmAny nativeRealmAny, Class cls) {
        super(RealmAny.Type.OBJECT, nativeRealmAny);
        this.f67058c = cls;
        this.f67059d = m29321h(baseRealm, cls, nativeRealmAny);
    }
}
