package p000;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializerCache;

/* renamed from: fw */
/* loaded from: classes6.dex */
public final class C10256fw implements SerializerCache {

    /* renamed from: a */
    public final Function1 f62014a;

    /* renamed from: b */
    public final ConcurrentHashMap f62015b;

    public C10256fw(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f62014a = compute;
        this.f62015b = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(KClass key) {
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f62015b;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap.get(javaClass);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (obj = new C12219lg((KSerializer) this.f62014a.invoke(key))))) != null) {
            obj = putIfAbsent;
        }
        return ((C12219lg) obj).f71772a;
    }
}