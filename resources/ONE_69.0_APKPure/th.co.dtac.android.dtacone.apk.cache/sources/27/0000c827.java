package p000;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.CacheByClass;

/* renamed from: gw */
/* loaded from: classes6.dex */
public final class C10324gw extends CacheByClass {

    /* renamed from: a */
    public final Function1 f62320a;

    /* renamed from: b */
    public final ConcurrentHashMap f62321b;

    public C10324gw(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f62320a = compute;
        this.f62321b = new ConcurrentHashMap();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public void clear() {
        this.f62321b.clear();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public Object get(Class key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f62321b;
        Object obj = concurrentHashMap.get(key);
        if (obj == null) {
            Object invoke = this.f62320a.invoke(key);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return invoke;
        }
        return obj;
    }
}