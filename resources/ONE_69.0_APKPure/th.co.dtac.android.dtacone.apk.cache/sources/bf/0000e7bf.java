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
    public final Function2 f71214a;

    /* renamed from: b */
    public final C0477Gp f71215b;

    public ClassValueParametrizedCache(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f71214a = compute;
        this.f71215b = new C0477Gp();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s */
    public Object mo74247getgIAlus(KClass key, List types) {
        Object obj;
        ConcurrentHashMap concurrentHashMap;
        Object m74271constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        obj = this.f71215b.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        HG0 hg0 = (HG0) obj;
        Object obj2 = hg0.f2334a.get();
        if (obj2 == null) {
            obj2 = hg0.m68155a(new ClassValueParametrizedCache$getgIAlus$$inlined$getOrSet$1());
        }
        C17634Fi1 c17634Fi1 = (C17634Fi1) obj2;
        List<KType> list = types;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (KType kType : list) {
            arrayList.add(new C17955Kh0(kType));
        }
        concurrentHashMap = c17634Fi1.f1757a;
        Object obj3 = concurrentHashMap.get(arrayList);
        if (obj3 == null) {
            try {
                Result.Companion companion = Result.Companion;
                m74271constructorimpl = Result.m74271constructorimpl((KSerializer) this.f71214a.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m74271constructorimpl = Result.m74271constructorimpl(ResultKt.createFailure(th2));
            }
            Result m74270boximpl = Result.m74270boximpl(m74271constructorimpl);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, m74270boximpl);
            if (putIfAbsent == null) {
                obj3 = m74270boximpl;
            } else {
                obj3 = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "getOrPut(...)");
        return ((Result) obj3).m74280unboximpl();
    }
}