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
public final class C10415hw implements ParametrizedSerializerCache {

    /* renamed from: a */
    public final Function2 f62714a;

    /* renamed from: b */
    public final ConcurrentHashMap f62715b;

    public C10415hw(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f62714a = compute;
        this.f62715b = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s  reason: not valid java name */
    public Object mo74247getgIAlus(KClass key, List types) {
        ConcurrentHashMap concurrentHashMap;
        Object m74271constructorimpl;
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentHashMap concurrentHashMap2 = this.f62715b;
        Class javaClass = JvmClassMappingKt.getJavaClass(key);
        Object obj = concurrentHashMap2.get(javaClass);
        if (obj == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(javaClass, (obj = new C17634Fi1()))) != null) {
            obj = putIfAbsent;
        }
        C17634Fi1 c17634Fi1 = (C17634Fi1) obj;
        List<KType> list = types;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (KType kType : list) {
            arrayList.add(new C17955Kh0(kType));
        }
        concurrentHashMap = c17634Fi1.f1757a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                Result.Companion companion = Result.Companion;
                m74271constructorimpl = Result.m74271constructorimpl((KSerializer) this.f62714a.invoke(key, types));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m74271constructorimpl = Result.m74271constructorimpl(ResultKt.createFailure(th2));
            }
            Result m74270boximpl = Result.m74270boximpl(m74271constructorimpl);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList, m74270boximpl);
            if (putIfAbsent2 == null) {
                obj2 = m74270boximpl;
            } else {
                obj2 = putIfAbsent2;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).m74280unboximpl();
    }
}