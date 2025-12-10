package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface Writer {

    /* loaded from: classes4.dex */
    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    /* renamed from: A */
    FieldOrder mo35360A();

    /* renamed from: B */
    void mo35359B(int i, long j);

    /* renamed from: C */
    void mo35358C(int i, List list, boolean z);

    /* renamed from: D */
    void mo35357D(int i, List list, boolean z);

    /* renamed from: E */
    void mo35356E(int i, float f);

    /* renamed from: F */
    void mo35355F(int i, int i2);

    /* renamed from: G */
    void mo35354G(int i, List list, boolean z);

    /* renamed from: H */
    void mo35353H(int i, int i2);

    /* renamed from: I */
    void mo35352I(int i, ByteString byteString);

    /* renamed from: J */
    void mo35351J(int i, MapEntryLite.C8897b c8897b, Map map);

    /* renamed from: K */
    void mo35350K(int i, List list, InterfaceC8961t interfaceC8961t);

    /* renamed from: L */
    void mo35349L(int i, Object obj, InterfaceC8961t interfaceC8961t);

    /* renamed from: M */
    void mo35348M(int i, List list, InterfaceC8961t interfaceC8961t);

    /* renamed from: N */
    void mo35347N(int i, Object obj, InterfaceC8961t interfaceC8961t);

    /* renamed from: a */
    void mo35339a(int i, List list, boolean z);

    /* renamed from: b */
    void mo35338b(int i, Object obj);

    /* renamed from: c */
    void mo35337c(int i, int i2);

    /* renamed from: d */
    void mo35336d(int i, String str);

    /* renamed from: e */
    void mo35335e(int i, long j);

    /* renamed from: f */
    void mo35334f(int i, List list, boolean z);

    /* renamed from: g */
    void mo35333g(int i, List list, boolean z);

    /* renamed from: h */
    void mo35332h(int i, List list, boolean z);

    /* renamed from: i */
    void mo35331i(int i, long j);

    /* renamed from: j */
    void mo35330j(int i, int i2);

    /* renamed from: k */
    void mo35329k(int i, List list, boolean z);

    /* renamed from: l */
    void mo35328l(int i, long j);

    /* renamed from: m */
    void mo35327m(int i, boolean z);

    /* renamed from: n */
    void mo35326n(int i, int i2);

    /* renamed from: o */
    void mo35325o(int i);

    /* renamed from: p */
    void mo35324p(int i, List list, boolean z);

    /* renamed from: q */
    void mo35323q(int i);

    /* renamed from: r */
    void mo35322r(int i, List list, boolean z);

    /* renamed from: s */
    void mo35321s(int i, List list, boolean z);

    /* renamed from: t */
    void mo35320t(int i, List list);

    /* renamed from: u */
    void mo35319u(int i, List list);

    /* renamed from: v */
    void mo35318v(int i, long j);

    /* renamed from: w */
    void mo35317w(int i, List list, boolean z);

    void writeInt32(int i, int i2);

    /* renamed from: x */
    void mo35316x(int i, List list, boolean z);

    /* renamed from: y */
    void mo35315y(int i, double d);

    /* renamed from: z */
    void mo35314z(int i, List list, boolean z);
}
