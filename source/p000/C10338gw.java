package p000;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.CacheByClass;

/* renamed from: gw */
/* loaded from: classes6.dex */
public final class C10338gw extends CacheByClass {

    /* renamed from: a */
    public final Function1 f62344a;

    /* renamed from: b */
    public final ConcurrentHashMap f62345b;

    public C10338gw(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f62344a = compute;
        this.f62345b = new ConcurrentHashMap();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public void clear() {
        this.f62345b.clear();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public Object get(Class key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f62345b;
        Object obj = concurrentHashMap.get(key);
        if (obj == null) {
            Object invoke = this.f62344a.invoke(key);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return invoke;
        }
        return obj;
    }
}
