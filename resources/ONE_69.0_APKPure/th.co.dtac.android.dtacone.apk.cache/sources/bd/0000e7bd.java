package kotlinx.serialization.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class ClassValueCache implements SerializerCache {

    /* renamed from: a */
    public final Function1 f71212a;

    /* renamed from: b */
    public final C0477Gp f71213b;

    public ClassValueCache(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f71212a = compute;
        this.f71213b = new C0477Gp();
    }

    /* renamed from: a */
    public final Function1 m27008a() {
        return this.f71212a;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(KClass key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        obj = this.f71213b.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        HG0 hg0 = (HG0) obj;
        Object obj2 = hg0.f2334a.get();
        if (obj2 == null) {
            obj2 = hg0.m68155a(new ClassValueCache$get$$inlined$getOrSet$1(this, key));
        }
        return ((C12219lg) obj2).f71772a;
    }
}