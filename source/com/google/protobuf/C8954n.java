package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.Map;

/* renamed from: com.google.protobuf.n */
/* loaded from: classes4.dex */
public class C8954n implements InterfaceC8953m {
    /* renamed from: a */
    public static int m35259a(int i, Object obj, Object obj2) {
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
    public static MapFieldLite m35250j(Object obj, Object obj2) {
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

    @Override // com.google.protobuf.InterfaceC8953m
    /* renamed from: b */
    public Object mo35258b(Object obj, Object obj2) {
        return m35250j(obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC8953m
    /* renamed from: c */
    public MapEntryLite.C8897b mo35257c(Object obj) {
        return ((MapEntryLite) obj).m35737b();
    }

    @Override // com.google.protobuf.InterfaceC8953m
    /* renamed from: d */
    public Object mo35256d(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC8953m
    /* renamed from: e */
    public int mo35255e(int i, Object obj, Object obj2) {
        return m35259a(i, obj, obj2);
    }

    @Override // com.google.protobuf.InterfaceC8953m
    /* renamed from: f */
    public Map mo35254f(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.InterfaceC8953m
    /* renamed from: g */
    public Object mo35253g(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.InterfaceC8953m
    /* renamed from: h */
    public Map mo35252h(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.InterfaceC8953m
    /* renamed from: i */
    public boolean mo35251i(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
