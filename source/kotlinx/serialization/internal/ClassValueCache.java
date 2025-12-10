package kotlinx.serialization.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class ClassValueCache implements SerializerCache {

    /* renamed from: a */
    public final Function1 f71178a;

    /* renamed from: b */
    public final C0482Gp f71179b;

    public ClassValueCache(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f71178a = compute;
        this.f71179b = new C0482Gp();
    }

    /* renamed from: a */
    public final Function1 m26716a() {
        return this.f71178a;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(KClass key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        obj = this.f71179b.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        BG0 bg0 = (BG0) obj;
        Object obj2 = bg0.f338a.get();
        if (obj2 == null) {
            obj2 = bg0.m68985a(new ClassValueCache$get$$inlined$getOrSet$1(this, key));
        }
        return ((C12236lg) obj2).f71678a;
    }
}
