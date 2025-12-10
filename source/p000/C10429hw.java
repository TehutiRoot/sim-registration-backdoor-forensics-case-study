package p000;

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
import kotlinx.serialization.internal.ParametrizedSerializerCache;

/* renamed from: hw */
/* loaded from: classes6.dex */
public final class C10429hw implements ParametrizedSerializerCache {

    /* renamed from: a */
    public final Function2 f62659a;

    /* renamed from: b */
    public final ConcurrentHashMap f62660b;

    public C10429hw(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f62659a = compute;
        this.f62660b = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s  reason: not valid java name */
    public Object mo74063getgIAlus(KClass key, List types) {
        ConcurrentHashMap concurrentHashMap;
        Object m74087constructorimpl;
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap2 = this.f62660b;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap2.get(javaClass);
        if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(javaClass, (obj = new C17795Ih1()))) != null) {
            obj = putIfAbsent;
        }
        C17795Ih1 c17795Ih1 = (C17795Ih1) obj;
        List<KType> list = types;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (KType kType : list) {
            arrayList.add(new C17538Eh0(kType));
        }
        concurrentHashMap = c17795Ih1.f2579a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl((KSerializer) this.f62659a.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
            }
            Result m74086boximpl = Result.m74086boximpl(m74087constructorimpl);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, m74086boximpl);
            if (putIfAbsent2 == null) {
                obj2 = m74086boximpl;
            } else {
                obj2 = putIfAbsent2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).m74096unboximpl();
    }
}
