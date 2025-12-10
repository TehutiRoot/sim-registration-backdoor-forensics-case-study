package io.realm;

import io.realm.RealmAny;
import io.realm.exceptions.RealmException;
import io.realm.internal.core.NativeRealmAny;

/* loaded from: classes5.dex */
public abstract class RealmAnyOperator {

    /* renamed from: a */
    public NativeRealmAny f66539a;

    /* renamed from: b */
    public RealmAny.Type f66540b;

    /* renamed from: io.realm.RealmAnyOperator$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11246a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66541a;

        static {
            int[] iArr = new int[RealmAny.Type.values().length];
            f66541a = iArr;
            try {
                iArr[RealmAny.Type.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66541a[RealmAny.Type.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66541a[RealmAny.Type.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66541a[RealmAny.Type.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66541a[RealmAny.Type.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66541a[RealmAny.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66541a[RealmAny.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f66541a[RealmAny.Type.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66541a[RealmAny.Type.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66541a[RealmAny.Type.UUID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66541a[RealmAny.Type.OBJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66541a[RealmAny.Type.NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public RealmAnyOperator(RealmAny.Type type) {
        this.f66540b = type;
    }

    /* renamed from: b */
    public static RealmAnyOperator m29704b(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        RealmAny.Type type = nativeRealmAny.getType();
        switch (C11246a.f66541a[type.ordinal()]) {
            case 1:
                return new C11413j(nativeRealmAny);
            case 2:
                return new C11289b(nativeRealmAny);
            case 3:
                return new C11489x(nativeRealmAny);
            case 4:
                return new C11288a(nativeRealmAny);
            case 5:
                return new C11291d(nativeRealmAny);
            case 6:
                return new C11294g(nativeRealmAny);
            case 7:
                return new C11293f(nativeRealmAny);
            case 8:
                return new C11292e(nativeRealmAny);
            case 9:
                return new C11422p(nativeRealmAny);
            case 10:
                return new C11490y(nativeRealmAny);
            case 11:
                if (baseRealm instanceof Realm) {
                    try {
                        return new C11486u(baseRealm, nativeRealmAny, nativeRealmAny.getModelClass(baseRealm.sharedRealm, baseRealm.configuration.getSchemaMediator()));
                    } catch (RealmException unused) {
                    }
                }
                return new C0381FL(baseRealm, nativeRealmAny);
            case 12:
                return new C11421o(nativeRealmAny);
            default:
                throw new ClassCastException("Couldn't cast to " + type);
        }
    }

    /* renamed from: a */
    public boolean m29705a(RealmAnyOperator realmAnyOperator) {
        return m29702d().coercedEquals(realmAnyOperator.m29702d());
    }

    /* renamed from: c */
    public long m29703c() {
        return m29702d().getNativePtr();
    }

    public void checkValidObject(BaseRealm baseRealm) {
    }

    public abstract NativeRealmAny createNativeRealmAny();

    /* renamed from: d */
    public final synchronized NativeRealmAny m29702d() {
        try {
            if (this.f66539a == null) {
                this.f66539a = createNativeRealmAny();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f66539a;
    }

    /* renamed from: e */
    public RealmAny.Type m29701e() {
        return this.f66540b;
    }

    /* renamed from: f */
    public Class mo29323f() {
        return this.f66540b.getTypedClass();
    }

    /* renamed from: g */
    public abstract Object mo29322g(Class cls);

    public RealmAnyOperator(RealmAny.Type type, NativeRealmAny nativeRealmAny) {
        this.f66540b = type;
        this.f66539a = nativeRealmAny;
    }
}
