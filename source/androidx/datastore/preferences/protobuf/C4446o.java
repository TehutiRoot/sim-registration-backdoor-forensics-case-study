package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o */
/* loaded from: classes2.dex */
public class C4446o implements InterfaceC4445n {
    /* renamed from: a */
    public static int m55153a(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += mapEntryLite.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    public static MapFieldLite m55144j(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.isMutable()) {
                mapFieldLite = mapFieldLite.mutableCopy();
            }
            mapFieldLite.mergeFrom(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4445n
    /* renamed from: b */
    public Object mo55152b(Object obj, Object obj2) {
        return m55144j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4445n
    /* renamed from: c */
    public MapEntryLite.C4386b mo55151c(Object obj) {
        return ((MapEntryLite) obj).m55675b();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4445n
    /* renamed from: d */
    public Object mo55150d(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4445n
    /* renamed from: e */
    public int mo55149e(int i, Object obj, Object obj2) {
        return m55153a(i, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4445n
    /* renamed from: f */
    public Map mo55148f(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4445n
    /* renamed from: g */
    public Object mo55147g(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4445n
    /* renamed from: h */
    public Map mo55146h(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC4445n
    /* renamed from: i */
    public boolean mo55145i(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
