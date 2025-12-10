package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class ClassValueParametrizedCache implements ParametrizedSerializerCache {

    /* renamed from: a */
    public final Function2 f71180a;

    /* renamed from: b */
    public final C0482Gp f71181b;

    public ClassValueParametrizedCache(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f71180a = compute;
        this.f71181b = new C0482Gp();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s */
    public Object mo74063getgIAlus(KClass key, List types) {
        Object obj;
        ConcurrentHashMap concurrentHashMap;
        Object m74087constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        obj = this.f71181b.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        BG0 bg0 = (BG0) obj;
        Object obj2 = bg0.f338a.get();
        if (obj2 == null) {
            obj2 = bg0.m68985a(new ClassValueParametrizedCache$getgIAlus$$inlined$getOrSet$1());
        }
        C17795Ih1 c17795Ih1 = (C17795Ih1) obj2;
        List<KType> list = types;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (KType kType : list) {
            arrayList.add(new C17538Eh0(kType));
        }
        concurrentHashMap = c17795Ih1.f2579a;
        Object obj3 = concurrentHashMap.get(arrayList);
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl((KSerializer) this.f71180a.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
            }
            Result m74086boximpl = Result.m74086boximpl(m74087constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, m74086boximpl);
            if (putIfAbsent == null) {
                obj3 = m74086boximpl;
            } else {
                obj3 = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "getOrPut(...)");
        return ((Result) obj3).m74096unboximpl();
    }
}
