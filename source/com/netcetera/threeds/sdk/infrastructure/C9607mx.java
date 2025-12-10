package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.mx */
/* loaded from: classes5.dex */
public final class C9607mx {
    private static int ThreeDS2Service = 1;
    private static int valueOf;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.mx$get */
    /* loaded from: classes5.dex */
    public interface get<T> {
        boolean valueOf(T t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T, U extends Collection<T>> U ThreeDS2Service(U u, get<T> getVar) {
        int i = valueOf;
        ThreeDS2Service = ((i ^ 41) + ((i & 41) << 1)) % 128;
        Iterator it = u.iterator();
        int i2 = ThreeDS2Service;
        valueOf = (((i2 | 59) << 1) - (((~i2) & 59) | (i2 & (-60)))) % 128;
        while (!(!it.hasNext())) {
            valueOf = (ThreeDS2Service + 9) % 128;
            if (!getVar.valueOf(it.next())) {
                int i3 = ThreeDS2Service;
                int i4 = (-2) - (~((i3 & 104) + (i3 | 104)));
                valueOf = i4 % 128;
                if (i4 % 2 != 0) {
                    it.remove();
                    int i5 = 33 / 0;
                } else {
                    it.remove();
                }
            }
        }
        int i6 = ThreeDS2Service;
        int i7 = i6 & 19;
        int i8 = -(-((i6 ^ 19) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        valueOf = i9 % 128;
        if (i9 % 2 == 0) {
            return u;
        }
        throw null;
    }

    public static <T> Set<T> get(Collection<T> collection, get<T> getVar) {
        Set<T> set = (Set) ThreeDS2Service(new HashSet(collection), getVar);
        int i = ThreeDS2Service + 9;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 14 / 0;
        }
        return set;
    }

    public static <T> List<T> valueOf(Collection<T> collection, get<T> getVar) {
        List<T> list = (List) ThreeDS2Service(new ArrayList(collection), getVar);
        valueOf = (ThreeDS2Service + 29) % 128;
        return list;
    }
}
