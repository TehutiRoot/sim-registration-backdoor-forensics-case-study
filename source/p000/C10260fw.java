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
public final class C10260fw implements SerializerCache {

    /* renamed from: a */
    public final Function1 f61991a;

    /* renamed from: b */
    public final ConcurrentHashMap f61992b;

    public C10260fw(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f61991a = compute;
        this.f61992b = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(KClass key) {
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f61992b;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap.get(javaClass);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (obj = new C12236lg((KSerializer) this.f61991a.invoke(key))))) != null) {
            obj = putIfAbsent;
        }
        return ((C12236lg) obj).f71678a;
    }
}
