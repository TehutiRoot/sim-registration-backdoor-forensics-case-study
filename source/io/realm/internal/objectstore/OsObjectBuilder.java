package io.realm.internal.objectstore;

import io.realm.ImportFlag;
import io.realm.MutableRealmInteger;
import io.realm.RealmAny;
import io.realm.RealmAnyNativeFunctionsImpl;
import io.realm.RealmDictionary;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmSet;
import io.realm.internal.NativeContext;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.RealmAnyNativeFunctions;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class OsObjectBuilder implements Closeable {

    /* renamed from: a */
    public final Table f66894a;

    /* renamed from: b */
    public final long f66895b;

    /* renamed from: c */
    public final long f66896c;

    /* renamed from: d */
    public final long f66897d;

    /* renamed from: e */
    public final NativeContext f66898e;

    /* renamed from: f */
    public final boolean f66899f;

    /* renamed from: g */
    public static InterfaceC11386S f66874g = new C11397k();

    /* renamed from: h */
    public static InterfaceC11386S f66875h = new C11408v();

    /* renamed from: i */
    public static InterfaceC11386S f66876i = new C11374G();

    /* renamed from: j */
    public static InterfaceC11386S f66877j = new C11380M();

    /* renamed from: k */
    public static InterfaceC11386S f66878k = new C11381N();

    /* renamed from: l */
    public static InterfaceC11386S f66879l = new C11382O();

    /* renamed from: m */
    public static InterfaceC11386S f66880m = new C11383P();

    /* renamed from: n */
    public static InterfaceC11386S f66881n = new C11384Q();

    /* renamed from: o */
    public static InterfaceC11386S f66882o = new C11385R();

    /* renamed from: p */
    public static InterfaceC11386S f66883p = new C11387a();

    /* renamed from: q */
    public static InterfaceC11386S f66884q = new C11388b();

    /* renamed from: r */
    public static InterfaceC11386S f66885r = new C11389c();

    /* renamed from: s */
    public static InterfaceC11386S f66886s = new C11390d();

    /* renamed from: t */
    public static InterfaceC11386S f66887t = new C11391e();

    /* renamed from: u */
    public static InterfaceC11386S f66888u = new C11392f();

    /* renamed from: v */
    public static InterfaceC11386S f66889v = new C11393g();

    /* renamed from: w */
    public static InterfaceC11386S f66890w = new C11394h();

    /* renamed from: x */
    public static InterfaceC11386S f66891x = new C11395i();

    /* renamed from: y */
    public static InterfaceC11386S f66892y = new C11396j();

    /* renamed from: z */
    public static InterfaceC11386S f66893z = new C11398l();

    /* renamed from: A */
    public static InterfaceC11386S f66850A = new C11399m();

    /* renamed from: B */
    public static InterfaceC11386S f66851B = new C11400n();

    /* renamed from: C */
    public static InterfaceC11386S f66852C = new C11401o();

    /* renamed from: D */
    public static InterfaceC11386S f66853D = new C11402p();

    /* renamed from: E */
    public static InterfaceC11386S f66854E = new C11403q();

    /* renamed from: F */
    public static InterfaceC11386S f66855F = new C11404r();

    /* renamed from: G */
    public static InterfaceC11386S f66856G = new C11405s();

    /* renamed from: H */
    public static InterfaceC11386S f66857H = new C11406t();

    /* renamed from: I */
    public static InterfaceC11386S f66858I = new C11407u();

    /* renamed from: J */
    public static InterfaceC11386S f66859J = new C11409w();

    /* renamed from: K */
    public static InterfaceC11386S f66860K = new C11410x();

    /* renamed from: L */
    public static InterfaceC11386S f66861L = new C11411y();

    /* renamed from: M */
    public static InterfaceC11386S f66862M = new C11412z();

    /* renamed from: N */
    public static InterfaceC11386S f66863N = new C11368A();

    /* renamed from: O */
    public static InterfaceC11386S f66864O = new C11369B();

    /* renamed from: P */
    public static InterfaceC11386S f66865P = new C11370C();

    /* renamed from: Q */
    public static InterfaceC11386S f66866Q = new C11371D();

    /* renamed from: R */
    public static InterfaceC11386S f66867R = new C11372E();

    /* renamed from: S */
    public static InterfaceC11386S f66868S = new C11373F();

    /* renamed from: T */
    public static InterfaceC11386S f66869T = new C11375H();

    /* renamed from: U */
    public static InterfaceC11386S f66870U = new C11376I();

    /* renamed from: V */
    public static InterfaceC11386S f66871V = new C11377J();

    /* renamed from: W */
    public static InterfaceC11386S f66872W = new C11378K();

    /* renamed from: X */
    public static InterfaceC11386S f66873X = new C11379L();

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$A */
    /* loaded from: classes5.dex */
    public class C11368A implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Long l) {
            OsObjectBuilder.nativeAddIntegerSetItem(j, l.longValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$B */
    /* loaded from: classes5.dex */
    public class C11369B implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Short sh) {
            OsObjectBuilder.nativeAddIntegerSetItem(j, sh.shortValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$C */
    /* loaded from: classes5.dex */
    public class C11370C implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Byte b) {
            OsObjectBuilder.nativeAddIntegerSetItem(j, b.byteValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$D */
    /* loaded from: classes5.dex */
    public class C11371D implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Float f) {
            OsObjectBuilder.nativeAddFloatSetItem(j, f.floatValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$E */
    /* loaded from: classes5.dex */
    public class C11372E implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Double d) {
            OsObjectBuilder.nativeAddDoubleSetItem(j, d.doubleValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$F */
    /* loaded from: classes5.dex */
    public class C11373F implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, byte[] bArr) {
            OsObjectBuilder.nativeAddByteArraySetItem(j, bArr);
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$G */
    /* loaded from: classes5.dex */
    public class C11374G implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Byte b) {
            OsObjectBuilder.nativeAddIntegerListItem(j, b.longValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$H */
    /* loaded from: classes5.dex */
    public class C11375H implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Date date) {
            OsObjectBuilder.nativeAddDateSetItem(j, date.getTime());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$I */
    /* loaded from: classes5.dex */
    public class C11376I implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Decimal128 decimal128) {
            OsObjectBuilder.nativeAddDecimal128SetItem(j, decimal128.getLow(), decimal128.getHigh());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$J */
    /* loaded from: classes5.dex */
    public class C11377J implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, ObjectId objectId) {
            OsObjectBuilder.nativeAddObjectIdSetItem(j, objectId.toString());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$K */
    /* loaded from: classes5.dex */
    public class C11378K implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, UUID uuid) {
            OsObjectBuilder.nativeAddUUIDSetItem(j, uuid.toString());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$L */
    /* loaded from: classes5.dex */
    public class C11379L implements InterfaceC11386S {

        /* renamed from: a */
        public final RealmAnyNativeFunctions f66900a = new RealmAnyNativeFunctionsImpl();

        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, RealmAny realmAny) {
            this.f66900a.handleItem(j, realmAny);
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$M */
    /* loaded from: classes5.dex */
    public class C11380M implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Short sh) {
            OsObjectBuilder.nativeAddIntegerListItem(j, sh.shortValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$N */
    /* loaded from: classes5.dex */
    public class C11381N implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Integer num) {
            OsObjectBuilder.nativeAddIntegerListItem(j, num.intValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$O */
    /* loaded from: classes5.dex */
    public class C11382O implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Long l) {
            OsObjectBuilder.nativeAddIntegerListItem(j, l.longValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$P */
    /* loaded from: classes5.dex */
    public class C11383P implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Boolean bool) {
            OsObjectBuilder.nativeAddBooleanListItem(j, bool.booleanValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$Q */
    /* loaded from: classes5.dex */
    public class C11384Q implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Float f) {
            OsObjectBuilder.nativeAddFloatListItem(j, f.floatValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$R */
    /* loaded from: classes5.dex */
    public class C11385R implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Double d) {
            OsObjectBuilder.nativeAddDoubleListItem(j, d.doubleValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$S */
    /* loaded from: classes5.dex */
    public interface InterfaceC11386S {
        /* renamed from: a */
        void mo29407a(long j, Object obj);
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$a */
    /* loaded from: classes5.dex */
    public class C11387a implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Date date) {
            OsObjectBuilder.nativeAddDateListItem(j, date.getTime());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$b */
    /* loaded from: classes5.dex */
    public class C11388b implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, byte[] bArr) {
            OsObjectBuilder.nativeAddByteArrayListItem(j, bArr);
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$c */
    /* loaded from: classes5.dex */
    public class C11389c implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, MutableRealmInteger mutableRealmInteger) {
            Long l = mutableRealmInteger.get();
            if (l == null) {
                OsObjectBuilder.nativeAddNullListItem(j);
            } else {
                OsObjectBuilder.nativeAddIntegerListItem(j, l.longValue());
            }
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$d */
    /* loaded from: classes5.dex */
    public class C11390d implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Decimal128 decimal128) {
            OsObjectBuilder.nativeAddDecimal128ListItem(j, decimal128.getLow(), decimal128.getHigh());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$e */
    /* loaded from: classes5.dex */
    public class C11391e implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, ObjectId objectId) {
            OsObjectBuilder.nativeAddObjectIdListItem(j, objectId.toString());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$f */
    /* loaded from: classes5.dex */
    public class C11392f implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, UUID uuid) {
            OsObjectBuilder.nativeAddUUIDListItem(j, uuid.toString());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$g */
    /* loaded from: classes5.dex */
    public class C11393g implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddBooleanDictionaryEntry(j, (String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$h */
    /* loaded from: classes5.dex */
    public class C11394h implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddStringDictionaryEntry(j, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$i */
    /* loaded from: classes5.dex */
    public class C11395i implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$j */
    /* loaded from: classes5.dex */
    public class C11396j implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddFloatDictionaryEntry(j, (String) entry.getKey(), ((Float) entry.getValue()).floatValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$k */
    /* loaded from: classes5.dex */
    public class C11397k implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, RealmModel realmModel) {
            OsObjectBuilder.nativeAddIntegerListItem(j, ((UncheckedRow) ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm()).getNativePtr());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$l */
    /* loaded from: classes5.dex */
    public class C11398l implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j, (String) entry.getKey(), ((Long) entry.getValue()).longValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$m */
    /* loaded from: classes5.dex */
    public class C11399m implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j, (String) entry.getKey(), ((Short) entry.getValue()).shortValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$n */
    /* loaded from: classes5.dex */
    public class C11400n implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j, (String) entry.getKey(), ((Byte) entry.getValue()).byteValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$o */
    /* loaded from: classes5.dex */
    public class C11401o implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddDoubleDictionaryEntry(j, (String) entry.getKey(), ((Double) entry.getValue()).doubleValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$p */
    /* loaded from: classes5.dex */
    public class C11402p implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddBinaryDictionaryEntry(j, (String) entry.getKey(), (byte[]) entry.getValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$q */
    /* loaded from: classes5.dex */
    public class C11403q implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddDateDictionaryEntry(j, (String) entry.getKey(), ((Date) entry.getValue()).getTime());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$r */
    /* loaded from: classes5.dex */
    public class C11404r implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddDecimal128DictionaryEntry(j, (String) entry.getKey(), ((Decimal128) entry.getValue()).getHigh(), ((Decimal128) entry.getValue()).getLow());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$s */
    /* loaded from: classes5.dex */
    public class C11405s implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddObjectIdDictionaryEntry(j, (String) entry.getKey(), ((ObjectId) entry.getValue()).toString());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$t */
    /* loaded from: classes5.dex */
    public class C11406t implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            OsObjectBuilder.nativeAddUUIDDictionaryEntry(j, (String) entry.getKey(), ((UUID) entry.getValue()).toString());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$u */
    /* loaded from: classes5.dex */
    public class C11407u implements InterfaceC11386S {

        /* renamed from: a */
        public final RealmAnyNativeFunctions f66901a = new RealmAnyNativeFunctionsImpl();

        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Map.Entry entry) {
            this.f66901a.handleItem(j, entry);
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$v */
    /* loaded from: classes5.dex */
    public class C11408v implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, String str) {
            OsObjectBuilder.nativeAddStringListItem(j, str);
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$w */
    /* loaded from: classes5.dex */
    public class C11409w implements InterfaceC11386S {

        /* renamed from: a */
        public final RealmAnyNativeFunctions f66902a = new RealmAnyNativeFunctionsImpl();

        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, RealmAny realmAny) {
            this.f66902a.handleItem(j, realmAny);
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$x */
    /* loaded from: classes5.dex */
    public class C11410x implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, String str) {
            OsObjectBuilder.nativeAddStringSetItem(j, str);
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$y */
    /* loaded from: classes5.dex */
    public class C11411y implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Boolean bool) {
            OsObjectBuilder.nativeAddBooleanSetItem(j, bool.booleanValue());
        }
    }

    /* renamed from: io.realm.internal.objectstore.OsObjectBuilder$z */
    /* loaded from: classes5.dex */
    public class C11412z implements InterfaceC11386S {
        @Override // io.realm.internal.objectstore.OsObjectBuilder.InterfaceC11386S
        /* renamed from: b */
        public void mo29407a(long j, Integer num) {
            OsObjectBuilder.nativeAddIntegerSetItem(j, num.intValue());
        }
    }

    public OsObjectBuilder(Table table, Set<ImportFlag> set) {
        OsSharedRealm sharedRealm = table.getSharedRealm();
        this.f66895b = sharedRealm.getNativePtr();
        this.f66894a = table;
        table.getColumnNames();
        this.f66897d = table.getNativePtr();
        this.f66896c = nativeCreateBuilder();
        this.f66898e = sharedRealm.context;
        this.f66899f = set.contains(ImportFlag.CHECK_SAME_VALUES_BEFORE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBinaryDictionaryEntry(long j, String str, byte[] bArr);

    private static native void nativeAddBoolean(long j, long j2, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanDictionaryEntry(long j, String str, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanListItem(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanSetItem(long j, boolean z);

    private static native void nativeAddByteArray(long j, long j2, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddByteArrayListItem(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddByteArraySetItem(long j, byte[] bArr);

    private static native void nativeAddDate(long j, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateDictionaryEntry(long j, String str, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateListItem(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateSetItem(long j, long j2);

    private static native void nativeAddDecimal128(long j, long j2, long j3, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128DictionaryEntry(long j, String str, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128ListItem(long j, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128SetItem(long j, long j2, long j3);

    private static native void nativeAddDouble(long j, long j2, double d);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleDictionaryEntry(long j, String str, double d);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleListItem(long j, double d);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleSetItem(long j, double d);

    private static native void nativeAddFloat(long j, long j2, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatDictionaryEntry(long j, String str, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatListItem(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatSetItem(long j, float f);

    private static native void nativeAddInteger(long j, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerDictionaryEntry(long j, String str, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerListItem(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerSetItem(long j, long j2);

    private static native void nativeAddNull(long j, long j2);

    private static native void nativeAddNullDictionaryEntry(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddNullListItem(long j);

    private static native void nativeAddNullSetItem(long j);

    private static native void nativeAddObject(long j, long j2, long j3);

    private static native void nativeAddObjectDictionaryEntry(long j, String str, long j2);

    private static native void nativeAddObjectId(long j, long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdDictionaryEntry(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdListItem(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdSetItem(long j, String str);

    private static native void nativeAddObjectList(long j, long j2, long[] jArr);

    private static native void nativeAddObjectListItem(long j, long j2);

    private static native void nativeAddRealmAny(long j, long j2, long j3);

    public static native void nativeAddRealmAnyDictionaryEntry(long j, String str, long j2);

    public static native void nativeAddRealmAnyListItem(long j, long j2);

    private static native void nativeAddString(long j, long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringDictionaryEntry(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringListItem(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringSetItem(long j, String str);

    private static native void nativeAddUUID(long j, long j2, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDDictionaryEntry(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDListItem(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDSetItem(long j, String str);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long j, long j2, long j3, boolean z, boolean z2);

    private static native void nativeDestroyBuilder(long j);

    private static native long nativeStartDictionary();

    private static native long nativeStartList(long j);

    private static native long nativeStartSet(long j);

    private static native void nativeStopDictionary(long j, long j2, long j3);

    private static native void nativeStopList(long j, long j2, long j3);

    private static native void nativeStopSet(long j, long j2, long j3);

    private static native long nativeUpdateEmbeddedObject(long j, long j2, long j3, long j4, boolean z);

    /* renamed from: K */
    public final void m29477K(long j, long j2, RealmDictionary realmDictionary, InterfaceC11386S interfaceC11386S) {
        if (realmDictionary != null) {
            long nativeStartDictionary = nativeStartDictionary();
            Iterator it = realmDictionary.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() == null) {
                    nativeAddNullDictionaryEntry(nativeStartDictionary, (String) entry.getKey());
                } else {
                    interfaceC11386S.mo29407a(nativeStartDictionary, entry);
                }
            }
            nativeStopDictionary(j, j2, nativeStartDictionary);
            return;
        }
        m29476L(j2);
    }

    /* renamed from: L */
    public final void m29476L(long j) {
        nativeStopDictionary(this.f66896c, j, nativeStartDictionary());
    }

    /* renamed from: M */
    public final void m29475M(long j) {
        nativeStopList(this.f66896c, j, nativeStartList(0L));
    }

    /* renamed from: N */
    public final void m29474N(long j) {
        nativeStopSet(this.f66896c, j, nativeStartSet(0L));
    }

    /* renamed from: O */
    public final void m29473O(long j, long j2, List list, InterfaceC11386S interfaceC11386S) {
        boolean z;
        if (list != null) {
            long nativeStartList = nativeStartList(list.size());
            if (j2 != 0 && !this.f66894a.isColumnNullable(j2)) {
                z = false;
            } else {
                z = true;
            }
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj == null) {
                    if (z) {
                        nativeAddNullListItem(nativeStartList);
                    } else {
                        throw new IllegalArgumentException("This 'RealmList' is not nullable. A non-null value is expected.");
                    }
                } else {
                    interfaceC11386S.mo29407a(nativeStartList, obj);
                }
            }
            nativeStopList(j, j2, nativeStartList);
            return;
        }
        m29475M(j2);
    }

    /* renamed from: P */
    public final void m29472P(long j, long j2, Set set, InterfaceC11386S interfaceC11386S) {
        boolean z;
        if (set != null) {
            long nativeStartSet = nativeStartSet(set.size());
            if (j2 != 0 && !this.f66894a.isColumnNullable(j2)) {
                z = false;
            } else {
                z = true;
            }
            for (Object obj : set) {
                if (obj == null) {
                    if (z) {
                        nativeAddNullSetItem(nativeStartSet);
                    } else {
                        throw new IllegalArgumentException("This 'RealmSet' is not nullable. A non-null value is expected.");
                    }
                } else {
                    interfaceC11386S.mo29407a(nativeStartSet, obj);
                }
            }
            nativeStopSet(j, j2, nativeStartSet);
            return;
        }
        m29474N(j2);
    }

    public void addBinarySet(long j, RealmSet<byte[]> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66868S);
    }

    public void addBinaryValueDictionary(long j, RealmDictionary<byte[]> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66853D);
    }

    public void addBoolean(long j, @Nullable Boolean bool) {
        if (bool == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddBoolean(this.f66896c, j, bool.booleanValue());
        }
    }

    public void addBooleanList(long j, RealmList<Boolean> realmList) {
        m29473O(this.f66896c, j, realmList, f66880m);
    }

    public void addBooleanSet(long j, RealmSet<Boolean> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66861L);
    }

    public void addBooleanValueDictionary(long j, RealmDictionary<Boolean> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66889v);
    }

    public void addByteArray(long j, @Nullable byte[] bArr) {
        if (bArr == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddByteArray(this.f66896c, j, bArr);
        }
    }

    public void addByteArrayList(long j, RealmList<byte[]> realmList) {
        m29473O(this.f66896c, j, realmList, f66884q);
    }

    public void addByteList(long j, RealmList<Byte> realmList) {
        m29473O(this.f66896c, j, realmList, f66876i);
    }

    public void addByteSet(long j, RealmSet<Byte> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66865P);
    }

    public void addByteValueDictionary(long j, RealmDictionary<Byte> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66851B);
    }

    public void addDate(long j, @Nullable Date date) {
        if (date == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddDate(this.f66896c, j, date.getTime());
        }
    }

    public void addDateList(long j, RealmList<Date> realmList) {
        m29473O(this.f66896c, j, realmList, f66883p);
    }

    public void addDateSet(long j, RealmSet<Date> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66869T);
    }

    public void addDateValueDictionary(long j, RealmDictionary<Date> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66854E);
    }

    public void addDecimal128(long j, @Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddDecimal128(this.f66896c, j, decimal128.getLow(), decimal128.getHigh());
        }
    }

    public void addDecimal128List(long j, RealmList<Decimal128> realmList) {
        m29473O(this.f66896c, j, realmList, f66886s);
    }

    public void addDecimal128Set(long j, RealmSet<Decimal128> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66870U);
    }

    public void addDecimal128ValueDictionary(long j, RealmDictionary<Decimal128> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66855F);
    }

    public void addDouble(long j, @Nullable Double d) {
        if (d == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddDouble(this.f66896c, j, d.doubleValue());
        }
    }

    public void addDoubleList(long j, RealmList<Double> realmList) {
        m29473O(this.f66896c, j, realmList, f66882o);
    }

    public void addDoubleSet(long j, RealmSet<Double> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66867R);
    }

    public void addDoubleValueDictionary(long j, RealmDictionary<Double> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66852C);
    }

    public void addFloat(long j, @Nullable Float f) {
        if (f == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddFloat(this.f66896c, j, f.floatValue());
        }
    }

    public void addFloatList(long j, RealmList<Float> realmList) {
        m29473O(this.f66896c, j, realmList, f66881n);
    }

    public void addFloatSet(long j, RealmSet<Float> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66866Q);
    }

    public void addFloatValueDictionary(long j, RealmDictionary<Float> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66892y);
    }

    public void addInteger(long j, @Nullable Byte b) {
        if (b == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddInteger(this.f66896c, j, b.byteValue());
        }
    }

    public void addIntegerList(long j, RealmList<Integer> realmList) {
        m29473O(this.f66896c, j, realmList, f66878k);
    }

    public void addIntegerSet(long j, RealmSet<Integer> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66862M);
    }

    public void addIntegerValueDictionary(long j, RealmDictionary<Integer> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66891x);
    }

    public void addLongList(long j, RealmList<Long> realmList) {
        m29473O(this.f66896c, j, realmList, f66879l);
    }

    public void addLongSet(long j, RealmSet<Long> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66863N);
    }

    public void addLongValueDictionary(long j, RealmDictionary<Long> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66893z);
    }

    public void addMutableRealmInteger(long j, @Nullable MutableRealmInteger mutableRealmInteger) {
        if (mutableRealmInteger != null && mutableRealmInteger.get() != null) {
            nativeAddInteger(this.f66896c, j, mutableRealmInteger.get().longValue());
        } else {
            nativeAddNull(this.f66896c, j);
        }
    }

    public void addMutableRealmIntegerList(long j, RealmList<MutableRealmInteger> realmList) {
        m29473O(this.f66896c, j, realmList, f66885r);
    }

    public void addNull(long j) {
        nativeAddNull(this.f66896c, j);
    }

    public void addObject(long j, @Nullable RealmModel realmModel) {
        if (realmModel == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddObject(this.f66896c, j, ((UncheckedRow) ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm()).getNativePtr());
        }
    }

    public <T extends RealmModel> void addObjectDictionary(long j, @Nullable RealmDictionary<T> realmDictionary) {
        if (realmDictionary != null) {
            long nativeStartDictionary = nativeStartDictionary();
            for (Map.Entry<String, T> entry : realmDictionary.entrySet()) {
                if (entry.getValue() == null) {
                    nativeAddNullDictionaryEntry(nativeStartDictionary, entry.getKey());
                } else {
                    nativeAddObjectDictionaryEntry(nativeStartDictionary, entry.getKey(), ((UncheckedRow) ((RealmObjectProxy) entry.getValue()).realmGet$proxyState().getRow$realm()).getNativePtr());
                }
            }
            nativeStopDictionary(this.f66896c, j, nativeStartDictionary);
            return;
        }
        m29476L(j);
    }

    public void addObjectId(long j, @Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddObjectId(this.f66896c, j, objectId.toString());
        }
    }

    public void addObjectIdList(long j, RealmList<ObjectId> realmList) {
        m29473O(this.f66896c, j, realmList, f66887t);
    }

    public void addObjectIdSet(long j, RealmSet<ObjectId> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66871V);
    }

    public void addObjectIdValueDictionary(long j, RealmDictionary<ObjectId> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66856G);
    }

    public <T extends RealmModel> void addObjectList(long j, @Nullable RealmList<T> realmList) {
        if (realmList != null) {
            long[] jArr = new long[realmList.size()];
            for (int i = 0; i < realmList.size(); i++) {
                RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmList.get(i);
                if (realmObjectProxy != null) {
                    jArr[i] = ((UncheckedRow) realmObjectProxy.realmGet$proxyState().getRow$realm()).getNativePtr();
                } else {
                    throw new IllegalArgumentException("Null values are not allowed in RealmLists containing Realm models");
                }
            }
            nativeAddObjectList(this.f66896c, j, jArr);
            return;
        }
        nativeAddObjectList(this.f66896c, j, new long[0]);
    }

    public <T extends RealmModel> void addObjectSet(long j, @Nullable RealmSet<T> realmSet) {
        if (realmSet != null) {
            long nativeStartSet = nativeStartSet(realmSet.size());
            Iterator<T> it = realmSet.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (next != null) {
                    nativeAddObjectListItem(nativeStartSet, ((UncheckedRow) ((RealmObjectProxy) next).realmGet$proxyState().getRow$realm()).getNativePtr());
                } else {
                    throw new IllegalArgumentException("This 'RealmSet' is not nullable. A non-null value is expected.");
                }
            }
            nativeStopSet(this.f66896c, j, nativeStartSet);
            return;
        }
        m29474N(j);
    }

    public void addRealmAny(long j, long j2) {
        nativeAddRealmAny(this.f66896c, j, j2);
    }

    public void addRealmAnyList(long j, RealmList<RealmAny> realmList) {
        m29473O(this.f66896c, j, realmList, f66859J);
    }

    public void addRealmAnySet(long j, RealmSet<RealmAny> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66873X);
    }

    public void addRealmAnyValueDictionary(long j, RealmDictionary<RealmAny> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66858I);
    }

    public void addShortList(long j, RealmList<Short> realmList) {
        m29473O(this.f66896c, j, realmList, f66877j);
    }

    public void addShortSet(long j, RealmSet<Short> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66864O);
    }

    public void addShortValueDictionary(long j, RealmDictionary<Short> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66850A);
    }

    public void addString(long j, @Nullable String str) {
        if (str == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddString(this.f66896c, j, str);
        }
    }

    public void addStringList(long j, RealmList<String> realmList) {
        m29473O(this.f66896c, j, realmList, f66875h);
    }

    public void addStringSet(long j, RealmSet<String> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66860K);
    }

    public void addStringValueDictionary(long j, RealmDictionary<String> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66890w);
    }

    public void addUUID(long j, @Nullable UUID uuid) {
        if (uuid == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddUUID(this.f66896c, j, uuid.toString());
        }
    }

    public void addUUIDList(long j, RealmList<UUID> realmList) {
        m29473O(this.f66896c, j, realmList, f66888u);
    }

    public void addUUIDSet(long j, RealmSet<UUID> realmSet) {
        m29472P(this.f66896c, j, realmSet, f66872W);
    }

    public void addUUIDValueDictionary(long j, RealmDictionary<UUID> realmDictionary) {
        m29477K(this.f66896c, j, realmDictionary, f66857H);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroyBuilder(this.f66896c);
    }

    public UncheckedRow createNewObject() {
        try {
            return new UncheckedRow(this.f66898e, this.f66894a, nativeCreateOrUpdateTopLevelObject(this.f66895b, this.f66897d, this.f66896c, false, false));
        } finally {
            close();
        }
    }

    public long getNativePtr() {
        return this.f66896c;
    }

    public void updateExistingEmbeddedObject(RealmObjectProxy realmObjectProxy) {
        try {
            nativeUpdateEmbeddedObject(this.f66895b, this.f66897d, this.f66896c, realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey(), this.f66899f);
        } finally {
            close();
        }
    }

    public void updateExistingTopLevelObject() {
        try {
            nativeCreateOrUpdateTopLevelObject(this.f66895b, this.f66897d, this.f66896c, true, this.f66899f);
        } finally {
            close();
        }
    }

    public void addInteger(long j, @Nullable Short sh) {
        if (sh == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddInteger(this.f66896c, j, sh.shortValue());
        }
    }

    public void addInteger(long j, @Nullable Integer num) {
        if (num == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddInteger(this.f66896c, j, num.intValue());
        }
    }

    public void addInteger(long j, @Nullable Long l) {
        if (l == null) {
            nativeAddNull(this.f66896c, j);
        } else {
            nativeAddInteger(this.f66896c, j, l.longValue());
        }
    }
}
