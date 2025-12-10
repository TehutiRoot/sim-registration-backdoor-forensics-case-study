package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface Writer {

    /* loaded from: classes2.dex */
    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    /* renamed from: A */
    FieldOrder mo55254A();

    /* renamed from: B */
    void mo55253B(int i, long j);

    /* renamed from: C */
    void mo55252C(int i, List list, boolean z);

    /* renamed from: D */
    void mo55251D(int i, List list, boolean z);

    /* renamed from: E */
    void mo55250E(int i, float f);

    /* renamed from: F */
    void mo55249F(int i, int i2);

    /* renamed from: G */
    void mo55248G(int i, List list, boolean z);

    /* renamed from: H */
    void mo55247H(int i, int i2);

    /* renamed from: I */
    void mo55246I(int i, ByteString byteString);

    /* renamed from: J */
    void mo55245J(int i, Object obj, InterfaceC4454v interfaceC4454v);

    /* renamed from: K */
    void mo55244K(int i, MapEntryLite.C4386b c4386b, Map map);

    /* renamed from: L */
    void mo55243L(int i, List list, InterfaceC4454v interfaceC4454v);

    /* renamed from: M */
    void mo55242M(int i, Object obj, InterfaceC4454v interfaceC4454v);

    /* renamed from: N */
    void mo55241N(int i, List list, InterfaceC4454v interfaceC4454v);

    /* renamed from: a */
    void mo55233a(int i, List list, boolean z);

    /* renamed from: b */
    void mo55232b(int i, Object obj);

    /* renamed from: c */
    void mo55231c(int i, int i2);

    /* renamed from: d */
    void mo55230d(int i, String str);

    /* renamed from: e */
    void mo55229e(int i, long j);

    /* renamed from: f */
    void mo55228f(int i, List list, boolean z);

    /* renamed from: g */
    void mo55227g(int i, List list, boolean z);

    /* renamed from: h */
    void mo55226h(int i, List list, boolean z);

    /* renamed from: i */
    void mo55225i(int i, long j);

    /* renamed from: j */
    void mo55224j(int i, int i2);

    /* renamed from: k */
    void mo55223k(int i, List list, boolean z);

    /* renamed from: l */
    void mo55222l(int i, long j);

    /* renamed from: m */
    void mo55221m(int i, boolean z);

    /* renamed from: n */
    void mo55220n(int i, int i2);

    /* renamed from: o */
    void mo55219o(int i);

    /* renamed from: p */
    void mo55218p(int i, List list, boolean z);

    /* renamed from: q */
    void mo55217q(int i);

    /* renamed from: r */
    void mo55216r(int i, List list, boolean z);

    /* renamed from: s */
    void mo55215s(int i, List list, boolean z);

    /* renamed from: t */
    void mo55214t(int i, List list);

    /* renamed from: u */
    void mo55213u(int i, List list);

    /* renamed from: v */
    void mo55212v(int i, long j);

    /* renamed from: w */
    void mo55211w(int i, List list, boolean z);

    void writeInt32(int i, int i2);

    /* renamed from: x */
    void mo55210x(int i, List list, boolean z);

    /* renamed from: y */
    void mo55209y(int i, double d);

    /* renamed from: z */
    void mo55208z(int i, List list, boolean z);
}
