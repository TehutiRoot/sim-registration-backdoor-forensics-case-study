package p000;

import io.realm.BaseRealm;
import io.realm.CollectionUtils;
import io.realm.DynamicRealmObject;
import io.realm.RealmAny;
import io.realm.RealmChangeListener;
import io.realm.RealmQuery;
import io.realm.RealmSet;
import io.realm.SetChangeListener;
import io.realm.SetChangeSet;
import io.realm.internal.ObservableSet;
import io.realm.internal.ObserverPairList;
import io.realm.internal.OsSet;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* renamed from: BG1 */
/* loaded from: classes5.dex */
public abstract class BG1 implements ObservableSet {

    /* renamed from: a */
    public final BaseRealm f339a;

    /* renamed from: b */
    public final OsSet f340b;

    /* renamed from: c */
    public final Class f341c;

    /* renamed from: d */
    public final String f342d;

    /* renamed from: e */
    public final ObserverPairList f343e;

    /* renamed from: BG1$a */
    /* loaded from: classes5.dex */
    public class C0089a implements SetChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RealmChangeListener f344a;

        public C0089a(RealmChangeListener realmChangeListener) {
            this.f344a = realmChangeListener;
        }

        @Override // io.realm.SetChangeListener
        public void onChange(RealmSet realmSet, SetChangeSet setChangeSet) {
            this.f344a.onChange(realmSet);
        }
    }

    /* renamed from: BG1$b */
    /* loaded from: classes5.dex */
    public class C0090b implements SetChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RealmChangeListener f346a;

        public C0090b(RealmChangeListener realmChangeListener) {
            this.f346a = realmChangeListener;
        }

        @Override // io.realm.SetChangeListener
        public void onChange(RealmSet realmSet, SetChangeSet setChangeSet) {
            this.f346a.onChange(realmSet);
        }
    }

    /* renamed from: BG1$c */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C0091c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f348a;

        static {
            int[] iArr = new int[OsSet.ExternalCollectionOperation.values().length];
            f348a = iArr;
            try {
                iArr[OsSet.ExternalCollectionOperation.CONTAINS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f348a[OsSet.ExternalCollectionOperation.ADD_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f348a[OsSet.ExternalCollectionOperation.REMOVE_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f348a[OsSet.ExternalCollectionOperation.RETAIN_ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public BG1(BaseRealm baseRealm, OsSet osSet, Class cls) {
        this(baseRealm, osSet, cls, cls.getSimpleName());
    }

    /* renamed from: y */
    public static AbstractC23280zG1 m68958y(Class cls, OsSet osSet, BaseRealm baseRealm, String str) {
        if (cls == Boolean.class) {
            return new C10090dc(osSet, baseRealm);
        }
        if (cls == String.class) {
            return new YM1(osSet, baseRealm);
        }
        if (cls == Integer.class) {
            return new C21276nf0(osSet, baseRealm);
        }
        if (cls == Long.class) {
            return new C17873Jm0(osSet, baseRealm);
        }
        if (cls == Short.class) {
            return new C23111yH1(osSet, baseRealm);
        }
        if (cls == Byte.class) {
            return new C1555Vf(osSet, baseRealm);
        }
        if (cls == Float.class) {
            return new X20(osSet, baseRealm);
        }
        if (cls == Double.class) {
            return new C1527VJ(osSet, baseRealm);
        }
        if (cls == byte[].class) {
            return new C11545jb(osSet, baseRealm);
        }
        if (cls == Date.class) {
            return new C1372TD(osSet, baseRealm);
        }
        if (cls == Decimal128.class) {
            return new C10135eE(osSet, baseRealm);
        }
        if (cls == ObjectId.class) {
            return new RJ0(osSet, baseRealm);
        }
        if (cls == UUID.class) {
            return new VW1(osSet, baseRealm);
        }
        if (cls == RealmAny.class) {
            return new C21660ps1(osSet, baseRealm);
        }
        if (cls == DynamicRealmObject.class) {
            return new C0519HL(osSet, baseRealm, str);
        }
        if (CollectionUtils.m29749c(cls)) {
            return new C22004rs1(osSet, baseRealm, cls);
        }
        throw new IllegalArgumentException("Unknown class for iterator: " + cls.getSimpleName());
    }

    /* renamed from: A */
    public boolean m68984A(Collection collection) {
        if (m68962u(collection)) {
            return m68970m(((RealmSet) collection).m29573a(), OsSet.ExternalCollectionOperation.REMOVE_ALL);
        }
        if (m68966q(collection)) {
            return mo589C(collection);
        }
        throw new ClassCastException("Set contents and collection must be the same type when calling 'removeAll'.");
    }

    /* renamed from: B */
    public void m68983B() {
        CollectionUtils.checkForAddRemoveListener(this.f339a, null, false);
        this.f343e.clear();
        this.f340b.stopListening();
    }

    /* renamed from: C */
    public abstract boolean mo589C(Collection collection);

    /* renamed from: D */
    public void m68982D(RealmSet realmSet, RealmChangeListener realmChangeListener) {
        m68981E(realmSet, new C0090b(realmChangeListener));
    }

    /* renamed from: E */
    public void m68981E(RealmSet realmSet, SetChangeListener setChangeListener) {
        this.f343e.remove(realmSet, setChangeListener);
        if (this.f343e.isEmpty()) {
            this.f340b.stopListening();
        }
    }

    /* renamed from: F */
    public abstract boolean mo588F(Object obj);

    /* renamed from: G */
    public boolean m68980G(Collection collection) {
        if (m68962u(collection)) {
            return m68970m(((RealmSet) collection).m29573a(), OsSet.ExternalCollectionOperation.RETAIN_ALL);
        }
        if (m68966q(collection)) {
            return mo587H(collection);
        }
        throw new ClassCastException("Set contents and collection must be the same type when calling 'retainAll'.");
    }

    /* renamed from: H */
    public abstract boolean mo587H(Collection collection);

    /* renamed from: I */
    public int m68979I() {
        return Long.valueOf(this.f340b.size()).intValue();
    }

    /* renamed from: J */
    public RealmQuery mo22545J() {
        throw new UnsupportedOperationException("This feature is available only when the element type is implementing RealmModel.");
    }

    /* renamed from: a */
    public abstract boolean mo585a(Object obj);

    /* renamed from: b */
    public boolean m68978b(Collection collection) {
        if (m68962u(collection)) {
            return m68970m(((RealmSet) collection).m29573a(), OsSet.ExternalCollectionOperation.ADD_ALL);
        }
        if (m68961v(collection)) {
            return mo584c(collection);
        }
        throw new ClassCastException("Set contents and collection must be the same type when calling 'addAll'.");
    }

    /* renamed from: c */
    public abstract boolean mo584c(Collection collection);

    /* renamed from: d */
    public void m68977d(RealmSet realmSet, RealmChangeListener realmChangeListener) {
        m68976e(realmSet, new C0089a(realmChangeListener));
    }

    /* renamed from: e */
    public void m68976e(RealmSet realmSet, SetChangeListener setChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.f339a, setChangeListener, true);
        if (this.f343e.isEmpty()) {
            this.f340b.startListening(this);
        }
        this.f343e.add(new ObservableSet.SetObserverPair(realmSet, setChangeListener));
    }

    /* renamed from: f */
    public void m68975f() {
        this.f340b.clear();
    }

    /* renamed from: g */
    public boolean m68974g(Object obj) {
        if (m68963t(obj)) {
            return mo582j(obj);
        }
        throw new ClassCastException("Set contents and object must be the same type when calling 'contains'.");
    }

    /* renamed from: h */
    public boolean m68973h(Collection collection) {
        if (m68962u(collection)) {
            return m68970m(((RealmSet) collection).m29573a(), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
        }
        if (m68966q(collection)) {
            return mo583i(collection);
        }
        throw new ClassCastException("Set contents and collection must be the same type when calling 'containsAll'.");
    }

    /* renamed from: i */
    public abstract boolean mo583i(Collection collection);

    /* renamed from: j */
    public abstract boolean mo582j(Object obj);

    /* renamed from: k */
    public void m68972k() {
        this.f340b.deleteAll();
    }

    /* renamed from: l */
    public RealmSet m68971l() {
        BaseRealm freeze = this.f339a.freeze();
        return new RealmSet(freeze, this.f340b.freeze(freeze.sharedRealm), this.f341c);
    }

    /* renamed from: m */
    public boolean m68970m(OsSet osSet, OsSet.ExternalCollectionOperation externalCollectionOperation) {
        if (this.f340b.getNativePtr() == osSet.getNativePtr()) {
            int i = C0091c.f348a[externalCollectionOperation.ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                if (i == 4) {
                    return false;
                }
                throw new IllegalStateException("Unexpected value: " + externalCollectionOperation);
            }
            this.f340b.clear();
            return true;
        }
        int i2 = C0091c.f348a[externalCollectionOperation.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return this.f340b.intersect(osSet);
                    }
                    throw new IllegalStateException("Unexpected value: " + externalCollectionOperation);
                }
                return this.f340b.asymmetricDifference(osSet);
            }
            return this.f340b.union(osSet);
        }
        return this.f340b.containsAll(osSet);
    }

    /* renamed from: n */
    public OsSet m68969n() {
        return this.f340b;
    }

    @Override // io.realm.internal.ObservableSet
    public void notifyChangeListeners(long j) {
        this.f340b.notifyChangeListeners(j, this.f343e);
    }

    /* renamed from: o */
    public Class m68968o() {
        return this.f341c;
    }

    /* renamed from: p */
    public String m68967p() {
        return this.f342d;
    }

    /* renamed from: q */
    public final boolean m68966q(Collection collection) {
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj != null && !this.f341c.isAssignableFrom(obj.getClass())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: r */
    public boolean m68965r() {
        if (m68979I() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean m68964s() {
        return this.f339a.isFrozen();
    }

    /* renamed from: t */
    public final boolean m68963t(Object obj) {
        if (obj != null) {
            return this.f341c.isAssignableFrom(obj.getClass());
        }
        return true;
    }

    /* renamed from: u */
    public boolean m68962u(Collection collection) {
        if ((collection instanceof RealmSet) && ((RealmSet) collection).isManaged()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m68961v(Collection collection) {
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj != null && !this.f341c.isAssignableFrom(obj.getClass())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: w */
    public boolean m68960w() {
        if (this.f339a.isClosed()) {
            return false;
        }
        return this.f340b.isValid();
    }

    /* renamed from: x */
    public Iterator m68959x() {
        return m68958y(this.f341c, this.f340b, this.f339a, this.f342d);
    }

    /* renamed from: z */
    public boolean m68957z(Object obj) {
        if (m68963t(obj)) {
            return mo588F(obj);
        }
        throw new ClassCastException("Set contents and object must be the same type when calling 'remove'.");
    }

    public BG1(BaseRealm baseRealm, OsSet osSet, Class cls, String str) {
        this.f343e = new ObserverPairList();
        this.f339a = baseRealm;
        this.f340b = osSet;
        this.f341c = cls;
        this.f342d = str;
    }
}
