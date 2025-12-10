package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class SerializersKt__SerializersKt {
    /* renamed from: a */
    public static final KSerializer m27029a(KClass kClass, List list, Function0 function0) {
        boolean areEqual;
        boolean areEqual2;
        boolean areEqual3;
        boolean areEqual4;
        boolean areEqual5;
        boolean areEqual6;
        boolean areEqual7;
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class))) {
            areEqual = true;
        } else {
            areEqual = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class));
        }
        if (areEqual) {
            areEqual2 = true;
        } else {
            areEqual2 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class));
        }
        if (areEqual2) {
            areEqual3 = true;
        } else {
            areEqual3 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class));
        }
        if (areEqual3) {
            return new ArrayListSerializer((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new HashSetSerializer((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class))) {
            areEqual4 = true;
        } else {
            areEqual4 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class));
        }
        if (areEqual4) {
            areEqual5 = true;
        } else {
            areEqual5 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class));
        }
        if (areEqual5) {
            return new LinkedHashSetSerializer((KSerializer) list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new HashMapSerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class))) {
            areEqual6 = true;
        } else {
            areEqual6 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class));
        }
        if (areEqual6) {
            areEqual7 = true;
        } else {
            areEqual7 = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class));
        }
        if (areEqual7) {
            return new LinkedHashMapSerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return BuiltinSerializersKt.PairSerializer((KSerializer) list.get(0), (KSerializer) list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return BuiltinSerializersKt.TripleSerializer((KSerializer) list.get(0), (KSerializer) list.get(1), (KSerializer) list.get(2));
        }
        if (PlatformKt.isReferenceArray(kClass)) {
            Object invoke = function0.invoke();
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return BuiltinSerializersKt.ArraySerializer((KClass) invoke, (KSerializer) list.get(0));
        }
        return null;
    }

    /* renamed from: b */
    public static final KSerializer m27028b(KClass kClass, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    /* renamed from: c */
    public static final KSerializer m27027c(String forClass) {
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
    }

    /* renamed from: d */
    public static final KSerializer m27026d(SerializersModule module, KClass kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        KSerializer contextual$default = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    /* renamed from: e */
    public static final KSerializer m27025e(SerializersModule module, KClass kClass, KSerializer[] argSerializers) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer contextual = module.getContextual(kClass, ArraysKt___ArraysJvmKt.asList(argSerializers));
        if (contextual != null) {
            return contextual;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    /* renamed from: f */
    public static final KSerializer m27024f(KSerializer kSerializer, boolean z) {
        if (z) {
            return BuiltinSerializersKt.getNullable(kSerializer);
        }
        Intrinsics.checkNotNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return kSerializer;
    }

    /* renamed from: g */
    public static final KSerializer m27023g(KClass kClass, List serializers, Function0 elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer m27029a = m27029a(kClass, serializers, elementClassifierIfArray);
        if (m27029a == null) {
            return m27028b(kClass, serializers);
        }
        return m27029a;
    }

    /* renamed from: h */
    public static final KSerializer m27022h(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer serializerOrNull = SerializersKt.serializerOrNull(kClass);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public static final KSerializer m27021i(KClass kClass, List typeArgumentsSerializers, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, z);
    }

    /* renamed from: j */
    public static final KSerializer m27020j(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    /* renamed from: k */
    public static final KSerializer m27019k(SerializersModule serializersModule, KClass kClass, List typeArgumentsSerializers, boolean z) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        KSerializer m27017m = m27017m(serializersModule, kClass, typeArgumentsSerializers, z);
        if (m27017m != null) {
            return m27017m;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    /* renamed from: l */
    public static final KSerializer m27018l(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer m27016n = m27016n(serializersModule, type, true);
        if (m27016n != null) {
            return m27016n;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new KotlinNothingValueException();
    }

    /* renamed from: m */
    public static final KSerializer m27017m(SerializersModule serializersModule, KClass kClass, List list, boolean z) {
        KSerializer<? extends Object> kSerializer;
        if (list.isEmpty()) {
            kSerializer = SerializersKt.serializerOrNull(kClass);
            if (kSerializer == null) {
                kSerializer = SerializersModule.getContextual$default(serializersModule, kClass, null, 2, null);
            }
        } else {
            try {
                KSerializer<? extends Object> parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kClass, list, SerializersKt__SerializersKt$serializerByKClassImpl$serializer$1.INSTANCE);
                if (parametrizedSerializerOrNull == null) {
                    kSerializer = serializersModule.getContextual(kClass, list);
                } else {
                    kSerializer = parametrizedSerializerOrNull;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
            }
        }
        if (kSerializer == null) {
            return null;
        }
        return m27024f(kSerializer, z);
    }

    /* renamed from: n */
    public static final KSerializer m27016n(SerializersModule serializersModule, KType kType, boolean z) {
        KSerializer<Object> kSerializer;
        KSerializer<? extends Object> kSerializer2;
        KClass<Object> kclass = Platform_commonKt.kclass(kType);
        boolean isMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(arguments, 10));
        for (KTypeProjection kTypeProjection : arguments) {
            arrayList.add(Platform_commonKt.typeOrThrow(kTypeProjection));
        }
        if (arrayList.isEmpty()) {
            kSerializer = SerializersCacheKt.findCachedSerializer(kclass, isMarkedNullable);
        } else {
            Object findParametrizedCachedSerializer = SerializersCacheKt.findParametrizedCachedSerializer(kclass, arrayList, isMarkedNullable);
            if (Result.m74277isFailureimpl(findParametrizedCachedSerializer)) {
                findParametrizedCachedSerializer = null;
            }
            kSerializer = (KSerializer) findParametrizedCachedSerializer;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        if (arrayList.isEmpty()) {
            kSerializer2 = SerializersModule.getContextual$default(serializersModule, kclass, null, 2, null);
        } else {
            List<KSerializer<Object>> serializersForParameters = SerializersKt.serializersForParameters(serializersModule, arrayList, z);
            if (serializersForParameters == null) {
                return null;
            }
            KSerializer<? extends Object> parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kclass, serializersForParameters, new C12136x3bbdb5fc(arrayList));
            if (parametrizedSerializerOrNull == null) {
                kSerializer2 = serializersModule.getContextual(kclass, serializersForParameters);
            } else {
                kSerializer2 = parametrizedSerializerOrNull;
            }
        }
        if (kSerializer2 == null) {
            return null;
        }
        return m27024f(kSerializer2, isMarkedNullable);
    }

    /* renamed from: o */
    public static final KSerializer m27015o(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KSerializer compiledSerializerImpl = PlatformKt.compiledSerializerImpl(kClass);
        if (compiledSerializerImpl == null) {
            return PrimitivesKt.builtinSerializerOrNull(kClass);
        }
        return compiledSerializerImpl;
    }

    /* renamed from: p */
    public static final KSerializer m27014p(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    /* renamed from: q */
    public static final KSerializer m27013q(SerializersModule serializersModule, KType type) {
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return m27016n(serializersModule, type, false);
    }

    /* renamed from: r */
    public static final List m27012r(SerializersModule serializersModule, List typeArguments, boolean z) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (z) {
            List<KType> list = typeArguments;
            arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
            for (KType kType : list) {
                arrayList.add(SerializersKt.serializer(serializersModule, kType));
            }
        } else {
            List<KType> list2 = typeArguments;
            arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list2, 10));
            for (KType kType2 : list2) {
                KSerializer<Object> serializerOrNull = SerializersKt.serializerOrNull(serializersModule, kType2);
                if (serializerOrNull == null) {
                    return null;
                }
                arrayList.add(serializerOrNull);
            }
        }
        return arrayList;
    }
}