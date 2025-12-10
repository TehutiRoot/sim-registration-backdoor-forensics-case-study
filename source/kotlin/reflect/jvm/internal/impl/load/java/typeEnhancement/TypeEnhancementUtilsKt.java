package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\ntypeEnhancementUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1#2:62\n1#2:73\n1#2:86\n1#2:99\n1603#3,9:63\n1855#3:72\n1856#3:74\n1612#3:75\n1603#3,9:76\n1855#3:85\n1856#3:87\n1612#3:88\n1603#3,9:89\n1855#3:98\n1856#3:100\n1612#3:101\n1747#3,3:102\n*S KotlinDebug\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n*L\n41#1:73\n43#1:86\n45#1:99\n41#1:63,9\n41#1:72\n41#1:74\n41#1:75\n43#1:76,9\n43#1:85\n43#1:87\n43#1:88\n45#1:89,9\n45#1:98\n45#1:100\n45#1:101\n54#1:102,3\n*E\n"})
/* loaded from: classes6.dex */
public final class TypeEnhancementUtilsKt {
    /* renamed from: a */
    public static final NullabilityQualifier m28271a(JavaTypeQualifiers javaTypeQualifiers) {
        if (javaTypeQualifiers.isNullabilityQualifierForWarning()) {
            return null;
        }
        return javaTypeQualifiers.getNullability();
    }

    /* renamed from: b */
    public static final Object m28270b(Set set, Object obj, Object obj2, Object obj3, boolean z) {
        Set set2;
        Object obj4;
        if (z) {
            if (set.contains(obj)) {
                obj4 = obj;
            } else if (set.contains(obj2)) {
                obj4 = obj2;
            } else {
                obj4 = null;
            }
            if (Intrinsics.areEqual(obj4, obj) && Intrinsics.areEqual(obj3, obj2)) {
                return null;
            }
            if (obj3 == null) {
                return obj4;
            }
            return obj3;
        }
        if (obj3 != null && (set2 = CollectionsKt___CollectionsKt.toSet(EG1.plus(set, obj3))) != null) {
            set = set2;
        }
        return CollectionsKt___CollectionsKt.singleOrNull(set);
    }

    /* renamed from: c */
    public static final NullabilityQualifier m28269c(Set set, NullabilityQualifier nullabilityQualifier, boolean z) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        if (nullabilityQualifier != nullabilityQualifier2) {
            return (NullabilityQualifier) m28270b(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
        }
        return nullabilityQualifier2;
    }

    @NotNull
    public static final JavaTypeQualifiers computeQualifiersForOverride(@NotNull JavaTypeQualifiers javaTypeQualifiers, @NotNull Collection<JavaTypeQualifiers> superQualifiers, boolean z, boolean z2, boolean z3) {
        NullabilityQualifier nullabilityQualifier;
        boolean z4;
        Intrinsics.checkNotNullParameter(javaTypeQualifiers, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        Collection<JavaTypeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        for (JavaTypeQualifiers javaTypeQualifiers2 : collection) {
            NullabilityQualifier m28271a = m28271a(javaTypeQualifiers2);
            if (m28271a != null) {
                arrayList.add(m28271a);
            }
        }
        NullabilityQualifier m28269c = m28269c(CollectionsKt___CollectionsKt.toSet(arrayList), m28271a(javaTypeQualifiers), z);
        if (m28269c == null) {
            ArrayList arrayList2 = new ArrayList();
            for (JavaTypeQualifiers javaTypeQualifiers3 : collection) {
                NullabilityQualifier nullability = javaTypeQualifiers3.getNullability();
                if (nullability != null) {
                    arrayList2.add(nullability);
                }
            }
            nullabilityQualifier = m28269c(CollectionsKt___CollectionsKt.toSet(arrayList2), javaTypeQualifiers.getNullability(), z);
        } else {
            nullabilityQualifier = m28269c;
        }
        ArrayList arrayList3 = new ArrayList();
        for (JavaTypeQualifiers javaTypeQualifiers4 : collection) {
            MutabilityQualifier mutability = javaTypeQualifiers4.getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) m28270b(CollectionsKt___CollectionsKt.toSet(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z);
        NullabilityQualifier nullabilityQualifier2 = null;
        if (nullabilityQualifier != null && !z3 && (!z2 || nullabilityQualifier != NullabilityQualifier.NULLABLE)) {
            nullabilityQualifier2 = nullabilityQualifier;
        }
        boolean z5 = false;
        if (nullabilityQualifier2 == NullabilityQualifier.NOT_NULL) {
            if (!javaTypeQualifiers.getDefinitelyNotNull()) {
                if (!collection.isEmpty()) {
                    for (JavaTypeQualifiers javaTypeQualifiers5 : collection) {
                        if (javaTypeQualifiers5.getDefinitelyNotNull()) {
                            z4 = true;
                            break;
                        }
                    }
                }
            } else {
                z4 = true;
                if (nullabilityQualifier2 != null && m28269c != nullabilityQualifier) {
                    z5 = true;
                }
                return new JavaTypeQualifiers(nullabilityQualifier2, mutabilityQualifier, z4, z5);
            }
        }
        z4 = false;
        if (nullabilityQualifier2 != null) {
            z5 = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifier2, mutabilityQualifier, z4, z5);
    }

    public static final boolean hasEnhancedNullability(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }
}
