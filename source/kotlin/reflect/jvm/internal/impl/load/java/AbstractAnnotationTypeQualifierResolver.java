package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbstractAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,213:1\n1#2:214\n1#2:220\n1#2:225\n1#2:247\n1747#3,3:215\n288#3,2:221\n1611#3:223\n1855#3:224\n1856#3:226\n1612#3:227\n1747#3,3:228\n1789#3,3:231\n1789#3,3:234\n1603#3,9:237\n1855#3:246\n1856#3:248\n1612#3:249\n73#4,2:218\n361#5,7:250\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n*L\n40#1:220\n81#1:225\n162#1:247\n30#1:215,3\n79#1:221,2\n81#1:223\n81#1:224\n81#1:226\n81#1:227\n88#1:228,3\n124#1:231,3\n136#1:234,3\n162#1:237,9\n162#1:246\n162#1:248\n162#1:249\n40#1:218,2\n208#1:250,7\n*E\n"})
/* loaded from: classes6.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {

    /* renamed from: c */
    public static final C11783a f68930c = new C11783a(null);

    /* renamed from: d */
    public static final Map f68931d;

    /* renamed from: a */
    public final JavaTypeEnhancementState f68932a;

    /* renamed from: b */
    public final ConcurrentHashMap f68933b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver$a */
    /* loaded from: classes6.dex */
    public static final class C11783a {
        public /* synthetic */ C11783a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11783a() {
        }
    }

    static {
        AnnotationQualifierApplicabilityType[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f68931d = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(@NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f68932a = javaTypeEnhancementState;
        this.f68933b = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public final Set m28440a(Set set) {
        if (set.contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
            return EG1.plus(EG1.minus(ArraysKt___ArraysKt.toSet(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), (Iterable) set);
        }
        return set;
    }

    /* renamed from: b */
    public final JavaDefaultQualifiers m28439b(Object obj) {
        NullabilityQualifierWithMigrationStatus m28438c;
        JavaDefaultQualifiers m28431j = m28431j(obj);
        if (m28431j != null) {
            return m28431j;
        }
        Pair m28430k = m28430k(obj);
        if (m28430k == null) {
            return null;
        }
        Object component1 = m28430k.component1();
        Set set = (Set) m28430k.component2();
        ReportLevel m28432i = m28432i(obj);
        if (m28432i == null) {
            m28432i = m28433h(component1);
        }
        if (m28432i.isIgnore() || (m28438c = m28438c(component1, C11784xba7ba3d0.INSTANCE)) == null) {
            return null;
        }
        return new JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus.copy$default(m28438c, null, m28432i.isWarning(), 1, null), set, false, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final NullabilityQualifierWithMigrationStatus m28438c(Object obj, Function1 function1) {
        NullabilityQualifierWithMigrationStatus m28435f;
        NullabilityQualifierWithMigrationStatus m28435f2 = m28435f(obj, ((Boolean) function1.invoke(obj)).booleanValue());
        if (m28435f2 != null) {
            return m28435f2;
        }
        TAnnotation resolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(obj);
        if (resolveTypeQualifierAnnotation == null) {
            return null;
        }
        ReportLevel m28433h = m28433h(obj);
        if (m28433h.isIgnore() || (m28435f = m28435f(resolveTypeQualifierAnnotation, ((Boolean) function1.invoke(resolveTypeQualifierAnnotation)).booleanValue())) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.copy$default(m28435f, null, m28433h.isWarning(), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final Object m28437d(Object obj, FqName fqName) {
        for (TAnnotation tannotation : getMetaAnnotations(obj)) {
            if (Intrinsics.areEqual(getFqName(tannotation), fqName)) {
                return tannotation;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final boolean m28436e(Object obj, FqName fqName) {
        Iterable<TAnnotation> metaAnnotations = getMetaAnnotations(obj);
        if ((metaAnnotations instanceof Collection) && ((Collection) metaAnnotations).isEmpty()) {
            return false;
        }
        for (TAnnotation tannotation : metaAnnotations) {
            if (Intrinsics.areEqual(getFqName(tannotation), fqName)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public abstract Iterable<String> enumArguments(@NotNull TAnnotation tannotation, boolean z);

    @Nullable
    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(@Nullable JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, @NotNull Iterable<? extends TAnnotation> annotations) {
        EnumMap enumMap;
        EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f68932a.getDisabledDefaultAnnotations()) {
            return javaTypeQualifiersByElementType;
        }
        ArrayList<JavaDefaultQualifiers> arrayList = new ArrayList();
        for (TAnnotation tannotation : annotations) {
            JavaDefaultQualifiers m28439b = m28439b(tannotation);
            if (m28439b != null) {
                arrayList.add(m28439b);
            }
        }
        if (arrayList.isEmpty()) {
            return javaTypeQualifiersByElementType;
        }
        if (javaTypeQualifiersByElementType != null && (defaultQualifiers = javaTypeQualifiersByElementType.getDefaultQualifiers()) != null) {
            enumMap = new EnumMap((EnumMap) defaultQualifiers);
        } else {
            enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
        }
        boolean z = false;
        for (JavaDefaultQualifiers javaDefaultQualifiers : arrayList) {
            for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : javaDefaultQualifiers.getQualifierApplicabilityTypes()) {
                enumMap.put((EnumMap) annotationQualifierApplicabilityType, (AnnotationQualifierApplicabilityType) javaDefaultQualifiers);
                z = true;
            }
        }
        if (z) {
            return new JavaTypeQualifiersByElementType(enumMap);
        }
        return javaTypeQualifiersByElementType;
    }

    @Nullable
    public final MutabilityQualifier extractMutability(@NotNull Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        MutabilityQualifier mutabilityQualifier2 = null;
        for (TAnnotation tannotation : annotations) {
            FqName fqName = getFqName(tannotation);
            if (JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS().contains(fqName)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS().contains(fqName)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    @Nullable
    public final NullabilityQualifierWithMigrationStatus extractNullability(@NotNull Iterable<? extends TAnnotation> annotations, @NotNull Function1<? super TAnnotation, Boolean> forceWarning) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(forceWarning, "forceWarning");
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        for (TAnnotation tannotation : annotations) {
            NullabilityQualifierWithMigrationStatus m28438c = m28438c(tannotation, forceWarning);
            if (nullabilityQualifierWithMigrationStatus != null) {
                if (m28438c != null && !Intrinsics.areEqual(m28438c, nullabilityQualifierWithMigrationStatus) && (!m28438c.isForWarningOnly() || nullabilityQualifierWithMigrationStatus.isForWarningOnly())) {
                    if (m28438c.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus.isForWarningOnly()) {
                        return null;
                    }
                }
            }
            nullabilityQualifierWithMigrationStatus = m28438c;
        }
        return nullabilityQualifierWithMigrationStatus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
        if (r7.equals("ALWAYS") != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
        if (r7.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (r7.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
        r7 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus m28435f(java.lang.Object r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.m28435f(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final ReportLevel m28434g(Object obj) {
        FqName fqName = getFqName(obj);
        if (fqName != null && AnnotationQualifiersFqNamesKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) {
            return this.f68932a.getGetReportLevelForAnnotation().invoke(fqName);
        }
        return m28433h(obj);
    }

    @Nullable
    public abstract FqName getFqName(@NotNull TAnnotation tannotation);

    @NotNull
    public abstract Object getKey(@NotNull TAnnotation tannotation);

    @NotNull
    public abstract Iterable<TAnnotation> getMetaAnnotations(@NotNull TAnnotation tannotation);

    /* renamed from: h */
    public final ReportLevel m28433h(Object obj) {
        ReportLevel m28432i = m28432i(obj);
        if (m28432i != null) {
            return m28432i;
        }
        return this.f68932a.getJsr305().getGlobalLevel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final ReportLevel m28432i(Object obj) {
        Iterable<String> enumArguments;
        String str;
        ReportLevel reportLevel = this.f68932a.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(getFqName(obj));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object m28437d = m28437d(obj, AnnotationQualifiersFqNamesKt.getMIGRATION_ANNOTATION_FQNAME());
        if (m28437d == null || (enumArguments = enumArguments(m28437d, false)) == null || (str = (String) CollectionsKt___CollectionsKt.firstOrNull(enumArguments)) == null) {
            return null;
        }
        ReportLevel migrationLevel = this.f68932a.getJsr305().getMigrationLevel();
        if (migrationLevel == null) {
            int hashCode = str.hashCode();
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode != 2656902 || !str.equals("WARN")) {
                        return null;
                    }
                    return ReportLevel.WARN;
                } else if (!str.equals("STRICT")) {
                    return null;
                } else {
                    return ReportLevel.STRICT;
                }
            } else if (!str.equals("IGNORE")) {
                return null;
            } else {
                return ReportLevel.IGNORE;
            }
        }
        return migrationLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isTypeUseAnnotation(@NotNull TAnnotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Object m28437d = m28437d(annotation, StandardNames.FqNames.target);
        if (m28437d == null) {
            return false;
        }
        Iterable<String> enumArguments = enumArguments(m28437d, false);
        if ((enumArguments instanceof Collection) && ((Collection) enumArguments).isEmpty()) {
            return false;
        }
        for (String str : enumArguments) {
            if (Intrinsics.areEqual(str, KotlinTarget.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final JavaDefaultQualifiers m28431j(Object obj) {
        JavaDefaultQualifiers javaDefaultQualifiers;
        if (this.f68932a.getDisabledDefaultAnnotations() || (javaDefaultQualifiers = AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(getFqName(obj))) == null) {
            return null;
        }
        ReportLevel m28434g = m28434g(obj);
        if (m28434g == ReportLevel.IGNORE) {
            m28434g = null;
        }
        if (m28434g == null) {
            return null;
        }
        return JavaDefaultQualifiers.copy$default(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.copy$default(javaDefaultQualifiers.getNullabilityQualifier(), null, m28434g.isWarning(), 1, null), null, false, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final Pair m28430k(Object obj) {
        Object m28437d;
        Object obj2;
        if (this.f68932a.getJsr305().isDisabled() || (m28437d = m28437d(obj, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_DEFAULT_FQNAME())) == null) {
            return null;
        }
        Iterator it = getMetaAnnotations(obj).iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (resolveTypeQualifierAnnotation(obj2) != null) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        if (obj2 == null) {
            return null;
        }
        Iterable<String> enumArguments = enumArguments(m28437d, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : enumArguments) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = (AnnotationQualifierApplicabilityType) f68931d.get(str);
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair(obj2, m28440a(linkedHashSet));
    }

    @Nullable
    public final TAnnotation resolveTypeQualifierAnnotation(@NotNull TAnnotation annotation) {
        TAnnotation tannotation;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (this.f68932a.getJsr305().isDisabled()) {
            return null;
        }
        if (!CollectionsKt___CollectionsKt.contains(AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_FQ_NAMES(), getFqName(annotation)) && !m28436e(annotation, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_FQNAME())) {
            if (!m28436e(annotation, AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_NICKNAME_FQNAME())) {
                return null;
            }
            ConcurrentHashMap concurrentHashMap = this.f68933b;
            Object key = getKey(annotation);
            TAnnotation tannotation2 = (TAnnotation) concurrentHashMap.get(key);
            if (tannotation2 == null) {
                Iterator<TAnnotation> it = getMetaAnnotations(annotation).iterator();
                while (true) {
                    if (it.hasNext()) {
                        tannotation = resolveTypeQualifierAnnotation(it.next());
                        if (tannotation != null) {
                            break;
                        }
                    } else {
                        tannotation = null;
                        break;
                    }
                }
                if (tannotation == null) {
                    return null;
                }
                TAnnotation tannotation3 = (TAnnotation) concurrentHashMap.putIfAbsent(key, tannotation);
                if (tannotation3 != null) {
                    return tannotation3;
                }
                return tannotation;
            }
            return tannotation2;
        }
        return annotation;
    }
}
