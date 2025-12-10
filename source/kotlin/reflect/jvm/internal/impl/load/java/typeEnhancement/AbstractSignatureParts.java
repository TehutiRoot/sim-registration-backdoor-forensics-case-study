package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1#2:252\n1#2:275\n766#3:230\n857#3,2:231\n1726#3,3:233\n1747#3,3:236\n1747#3,3:239\n1603#3,9:242\n1855#3:251\n1856#3:253\n1612#3:254\n1726#3,3:255\n1549#3:258\n1620#3,3:259\n1747#3,3:262\n1603#3,9:265\n1855#3:274\n1856#3:276\n1612#3:277\n1855#3,2:278\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n156#1:252\n182#1:275\n89#1:230\n89#1:231,2\n153#1:233,3\n155#1:236,3\n156#1:239,3\n156#1:242,9\n156#1:251\n156#1:253\n156#1:254\n159#1:255,3\n169#1:258\n169#1:259,3\n177#1:262,3\n182#1:265,9\n182#1:274\n182#1:276\n182#1:277\n195#1:278,2\n*E\n"})
/* loaded from: classes6.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$a */
    /* loaded from: classes6.dex */
    public static final class C11802a {

        /* renamed from: a */
        public final KotlinTypeMarker f69207a;

        /* renamed from: b */
        public final JavaTypeQualifiersByElementType f69208b;

        /* renamed from: c */
        public final TypeParameterMarker f69209c;

        public C11802a(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.f69207a = kotlinTypeMarker;
            this.f69208b = javaTypeQualifiersByElementType;
            this.f69209c = typeParameterMarker;
        }

        /* renamed from: a */
        public final JavaTypeQualifiersByElementType m28297a() {
            return this.f69208b;
        }

        /* renamed from: b */
        public final KotlinTypeMarker m28296b() {
            return this.f69207a;
        }

        /* renamed from: c */
        public final TypeParameterMarker m28295c() {
            return this.f69209c;
        }
    }

    /* renamed from: a */
    public final JavaTypeQualifiersByElementType m28306a(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, getAnnotations(kotlinTypeMarker));
    }

    /* renamed from: b */
    public final JavaTypeQualifiers m28305b(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifier;
        boolean z;
        NullabilityQualifier m28300g = m28300g(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (m28300g == null) {
            KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker);
            if (enhancedForWarnings != null) {
                nullabilityQualifier = m28300g(enhancedForWarnings);
            } else {
                nullabilityQualifier = null;
            }
        } else {
            nullabilityQualifier = m28300g;
        }
        TypeSystemContext typeSystem = getTypeSystem();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        boolean z2 = true;
        if (!getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker) && !isNotNullTypeParameterCompat(kotlinTypeMarker)) {
            z = false;
        } else {
            z = true;
        }
        if (nullabilityQualifier == m28300g) {
            z2 = false;
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    /* renamed from: c */
    public final JavaTypeQualifiers m28304c(C11802a c11802a) {
        boolean z;
        List emptyList;
        TypeParameterMarker typeParameterMarker;
        boolean z2;
        AnnotationQualifierApplicabilityType containerApplicabilityType;
        JavaDefaultQualifiers javaDefaultQualifiers;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2;
        NullabilityQualifier nullabilityQualifier;
        boolean z3;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus3;
        KotlinTypeMarker m28296b;
        TypeConstructorMarker typeConstructor;
        TypeVariance typeVariance;
        NullabilityQualifier nullabilityQualifier2 = null;
        if (c11802a.m28296b() == null) {
            TypeSystemContext typeSystem = getTypeSystem();
            TypeParameterMarker m28295c = c11802a.m28295c();
            if (m28295c != null) {
                typeVariance = typeSystem.getVariance(m28295c);
            } else {
                typeVariance = null;
            }
            if (typeVariance == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.getNONE();
            }
        }
        boolean z4 = false;
        if (c11802a.m28295c() == null) {
            z = true;
        } else {
            z = false;
        }
        KotlinTypeMarker m28296b2 = c11802a.m28296b();
        if (m28296b2 == null || (emptyList = getAnnotations(m28296b2)) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        TypeSystemContext typeSystem2 = getTypeSystem();
        KotlinTypeMarker m28296b3 = c11802a.m28296b();
        if (m28296b3 != null && (typeConstructor = typeSystem2.typeConstructor(m28296b3)) != null) {
            typeParameterMarker = typeSystem2.getTypeParameterClassifier(typeConstructor);
        } else {
            typeParameterMarker = null;
        }
        if (getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 && getEnableImprovementsInStrictMode() && (m28296b = c11802a.m28296b()) != null && isArrayOrPrimitiveArray(m28296b)) {
                Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                emptyList = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) emptyList);
            } else {
                emptyList = CollectionsKt___CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) emptyList);
            }
        }
        MutabilityQualifier extractMutability = getAnnotationTypeQualifierResolver().extractMutability(emptyList);
        NullabilityQualifierWithMigrationStatus extractNullability = getAnnotationTypeQualifierResolver().extractNullability(emptyList, new C11803xf9ff8566(this, c11802a));
        if (extractNullability != null) {
            NullabilityQualifier qualifier = extractNullability.getQualifier();
            if (extractNullability.getQualifier() == NullabilityQualifier.NOT_NULL && typeParameterMarker != null) {
                z4 = true;
            }
            return new JavaTypeQualifiers(qualifier, extractMutability, z4, extractNullability.isForWarningOnly());
        }
        if (!z && !z2) {
            containerApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
        } else {
            containerApplicabilityType = getContainerApplicabilityType();
        }
        JavaTypeQualifiersByElementType m28297a = c11802a.m28297a();
        if (m28297a != null) {
            javaDefaultQualifiers = m28297a.get(containerApplicabilityType);
        } else {
            javaDefaultQualifiers = null;
        }
        if (typeParameterMarker != null) {
            nullabilityQualifierWithMigrationStatus = m28301f(typeParameterMarker);
        } else {
            nullabilityQualifierWithMigrationStatus = null;
        }
        if (nullabilityQualifierWithMigrationStatus == null || (nullabilityQualifierWithMigrationStatus2 = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.NOT_NULL, false, 2, null)) == null) {
            if (javaDefaultQualifiers != null) {
                nullabilityQualifierWithMigrationStatus2 = javaDefaultQualifiers.getNullabilityQualifier();
            } else {
                nullabilityQualifierWithMigrationStatus2 = null;
            }
        }
        if (nullabilityQualifierWithMigrationStatus != null) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.getQualifier();
        } else {
            nullabilityQualifier = null;
        }
        if (nullabilityQualifier != NullabilityQualifier.NOT_NULL && (typeParameterMarker == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.getDefinitelyNotNull())) {
            z3 = false;
        } else {
            z3 = true;
        }
        TypeParameterMarker m28295c2 = c11802a.m28295c();
        if (m28295c2 != null && (nullabilityQualifierWithMigrationStatus3 = m28301f(m28295c2)) != null) {
            if (nullabilityQualifierWithMigrationStatus3.getQualifier() == NullabilityQualifier.NULLABLE) {
                nullabilityQualifierWithMigrationStatus3 = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus3, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
            }
        } else {
            nullabilityQualifierWithMigrationStatus3 = null;
        }
        NullabilityQualifierWithMigrationStatus m28299h = m28299h(nullabilityQualifierWithMigrationStatus3, nullabilityQualifierWithMigrationStatus2);
        if (m28299h != null) {
            nullabilityQualifier2 = m28299h.getQualifier();
        }
        if (m28299h != null && m28299h.isForWarningOnly()) {
            z4 = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifier2, extractMutability, z3, z4);
    }

    @NotNull
    public final Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiers(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull Iterable<? extends KotlinTypeMarker> overrides, @Nullable TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        JavaTypeQualifiers javaTypeQualifiers;
        KotlinTypeMarker m28296b;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        List m28298i = m28298i(kotlinTypeMarker);
        ArrayList<List> arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(overrides, 10));
        for (KotlinTypeMarker kotlinTypeMarker2 : overrides) {
            arrayList.add(m28298i(kotlinTypeMarker2));
        }
        if (!getForceOnlyHeadTypeConstructor()) {
            if (isCovariant() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
                for (KotlinTypeMarker kotlinTypeMarker3 : overrides) {
                    if (!isEqual(kotlinTypeMarker, kotlinTypeMarker3)) {
                        i = 1;
                        break;
                    }
                }
            }
            i = m28298i.size();
        } else {
            i = 1;
            break;
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[i];
        for (int i2 = 0; i2 < i; i2++) {
            JavaTypeQualifiers m28304c = m28304c((C11802a) m28298i.get(i2));
            ArrayList arrayList2 = new ArrayList();
            for (List list : arrayList) {
                C11802a c11802a = (C11802a) CollectionsKt___CollectionsKt.getOrNull(list, i2);
                if (c11802a != null && (m28296b = c11802a.m28296b()) != null) {
                    javaTypeQualifiers = m28305b(m28296b);
                } else {
                    javaTypeQualifiers = null;
                }
                if (javaTypeQualifiers != null) {
                    arrayList2.add(javaTypeQualifiers);
                }
            }
            if (i2 == 0 && isCovariant()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 == 0 && getContainerIsVarargParameter()) {
                z3 = true;
            } else {
                z3 = false;
            }
            javaTypeQualifiersArr[i2] = TypeEnhancementUtilsKt.computeQualifiersForOverride(m28304c, arrayList2, z2, z3, z);
        }
        return new AbstractSignatureParts$computeIndexedQualifiers$1(typeEnhancementInfo, javaTypeQualifiersArr);
    }

    /* renamed from: d */
    public final List m28303d(Object obj, Function1 function1) {
        ArrayList arrayList = new ArrayList(1);
        m28302e(obj, arrayList, function1);
        return arrayList;
    }

    /* renamed from: e */
    public final void m28302e(Object obj, List list, Function1 function1) {
        list.add(obj);
        Iterable<Object> iterable = (Iterable) function1.invoke(obj);
        if (iterable != null) {
            for (Object obj2 : iterable) {
                m28302e(obj2, list, function1);
            }
        }
    }

    /* renamed from: f */
    public final NullabilityQualifierWithMigrationStatus m28301f(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> list;
        NullabilityQualifier nullabilityQualifier;
        boolean z;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list2 = upperBounds;
        boolean z2 = list2 instanceof Collection;
        if (!z2 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!typeSystem.isError((KotlinTypeMarker) it.next())) {
                    if (!z2 || !list2.isEmpty()) {
                        for (KotlinTypeMarker kotlinTypeMarker : list2) {
                            if (m28300g(kotlinTypeMarker) != null) {
                                list = upperBounds;
                                break;
                            }
                        }
                    }
                    if (!z2 || !list2.isEmpty()) {
                        for (KotlinTypeMarker kotlinTypeMarker2 : list2) {
                            if (getEnhancedForWarnings(kotlinTypeMarker2) != null) {
                                list = new ArrayList<>();
                                for (KotlinTypeMarker kotlinTypeMarker3 : list2) {
                                    KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker3);
                                    if (enhancedForWarnings != null) {
                                        list.add(enhancedForWarnings);
                                    }
                                }
                                List<KotlinTypeMarker> list3 = list;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    for (KotlinTypeMarker kotlinTypeMarker4 : list3) {
                                        if (!typeSystem.isNullableType(kotlinTypeMarker4)) {
                                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                                            break;
                                        }
                                    }
                                }
                                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                                if (list != upperBounds) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public abstract boolean forceWarning(@NotNull TAnnotation tannotation, @Nullable KotlinTypeMarker kotlinTypeMarker);

    /* renamed from: g */
    public final NullabilityQualifier m28300g(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (!typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NOT_NULL;
        }
        return null;
    }

    @NotNull
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    @NotNull
    public abstract Iterable<TAnnotation> getAnnotations(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract Iterable<TAnnotation> getContainerAnnotations();

    @NotNull
    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    @Nullable
    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    @Nullable
    public abstract KotlinTypeMarker getEnhancedForWarnings(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    @Nullable
    public abstract FqNameUnsafe getFqNameUnsafe(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    @NotNull
    public abstract TypeSystemContext getTypeSystem();

    /* renamed from: h */
    public final NullabilityQualifierWithMigrationStatus m28299h(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        if (nullabilityQualifierWithMigrationStatus == null) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (nullabilityQualifierWithMigrationStatus2 == null) {
            return nullabilityQualifierWithMigrationStatus;
        }
        if (nullabilityQualifierWithMigrationStatus.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (!nullabilityQualifierWithMigrationStatus.isForWarningOnly() && nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) {
            return nullabilityQualifierWithMigrationStatus;
        }
        if (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) < 0) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) > 0) {
            return nullabilityQualifierWithMigrationStatus;
        }
        return nullabilityQualifierWithMigrationStatus2;
    }

    /* renamed from: i */
    public final List m28298i(KotlinTypeMarker kotlinTypeMarker) {
        return m28303d(new C11802a(kotlinTypeMarker, m28306a(kotlinTypeMarker, getContainerDefaultTypeQualifiers()), null), new AbstractSignatureParts$toIndexed$1$1(this, getTypeSystem()));
    }

    public abstract boolean isArrayOrPrimitiveArray(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(@NotNull TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return false;
    }
}
