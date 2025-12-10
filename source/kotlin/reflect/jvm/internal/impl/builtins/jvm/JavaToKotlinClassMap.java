package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nJavaToKotlinClassMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n49#1,2:221\n49#1,2:223\n49#1,2:225\n49#1,2:227\n49#1,2:229\n49#1,2:231\n49#1,2:233\n49#1,2:235\n1#2:220\n*S KotlinDebug\n*F\n+ 1 JavaToKotlinClassMap.kt\norg/jetbrains/kotlin/builtins/jvm/JavaToKotlinClassMap\n*L\n54#1:221,2\n55#1:223,2\n56#1:225,2\n57#1:227,2\n58#1:229,2\n59#1:231,2\n60#1:233,2\n61#1:235,2\n*E\n"})
/* loaded from: classes6.dex */
public final class JavaToKotlinClassMap {
    @NotNull
    public static final JavaToKotlinClassMap INSTANCE;

    /* renamed from: a */
    public static final String f68568a;

    /* renamed from: b */
    public static final String f68569b;

    /* renamed from: c */
    public static final String f68570c;

    /* renamed from: d */
    public static final String f68571d;

    /* renamed from: e */
    public static final ClassId f68572e;

    /* renamed from: f */
    public static final FqName f68573f;

    /* renamed from: g */
    public static final ClassId f68574g;

    /* renamed from: h */
    public static final ClassId f68575h;

    /* renamed from: i */
    public static final ClassId f68576i;

    /* renamed from: j */
    public static final HashMap f68577j;

    /* renamed from: k */
    public static final HashMap f68578k;

    /* renamed from: l */
    public static final HashMap f68579l;

    /* renamed from: m */
    public static final HashMap f68580m;

    /* renamed from: n */
    public static final HashMap f68581n;

    /* renamed from: o */
    public static final HashMap f68582o;

    /* renamed from: p */
    public static final List f68583p;

    /* loaded from: classes6.dex */
    public static final class PlatformMutabilityMapping {

        /* renamed from: a */
        public final ClassId f68584a;

        /* renamed from: b */
        public final ClassId f68585b;

        /* renamed from: c */
        public final ClassId f68586c;

        public PlatformMutabilityMapping(@NotNull ClassId javaClass, @NotNull ClassId kotlinReadOnly, @NotNull ClassId kotlinMutable) {
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
            this.f68584a = javaClass;
            this.f68585b = kotlinReadOnly;
            this.f68586c = kotlinMutable;
        }

        @NotNull
        public final ClassId component1() {
            return this.f68584a;
        }

        @NotNull
        public final ClassId component2() {
            return this.f68585b;
        }

        @NotNull
        public final ClassId component3() {
            return this.f68586c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PlatformMutabilityMapping) {
                PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
                return Intrinsics.areEqual(this.f68584a, platformMutabilityMapping.f68584a) && Intrinsics.areEqual(this.f68585b, platformMutabilityMapping.f68585b) && Intrinsics.areEqual(this.f68586c, platformMutabilityMapping.f68586c);
            }
            return false;
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.f68584a;
        }

        public int hashCode() {
            return (((this.f68584a.hashCode() * 31) + this.f68585b.hashCode()) * 31) + this.f68586c.hashCode();
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f68584a + ", kotlinReadOnly=" + this.f68585b + ", kotlinMutable=" + this.f68586c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        JvmPrimitiveType[] values;
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb.append(functionClassKind.getPackageFqName().toString());
        sb.append('.');
        sb.append(functionClassKind.getClassNamePrefix());
        f68568a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb2.append(functionClassKind2.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind2.getClassNamePrefix());
        f68569b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb3.append(functionClassKind3.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind3.getClassNamePrefix());
        f68570c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb4.append(functionClassKind4.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind4.getClassNamePrefix());
        f68571d = sb4.toString();
        ClassId classId = ClassId.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f68572e = classId;
        FqName asSingleFqName = classId.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f68573f = asSingleFqName;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        f68574g = standardClassIds.getKFunction();
        f68575h = standardClassIds.getKClass();
        f68576i = javaToKotlinClassMap.m28592g(Class.class);
        f68577j = new HashMap();
        f68578k = new HashMap();
        f68579l = new HashMap();
        f68580m = new HashMap();
        f68581n = new HashMap();
        f68582o = new HashMap();
        ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.iterable);
        Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(FqNames.iterable)");
        FqName fqName = StandardNames.FqNames.mutableIterable;
        FqName packageFqName = classId2.getPackageFqName();
        FqName packageFqName2 = classId2.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName2, "kotlinReadOnly.packageFqName");
        FqName tail = FqNamesUtilKt.tail(fqName, packageFqName2);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.m28592g(Iterable.class), classId2, new ClassId(packageFqName, tail, false));
        ClassId classId3 = ClassId.topLevel(StandardNames.FqNames.iterator);
        Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(FqNames.iterator)");
        FqName fqName2 = StandardNames.FqNames.mutableIterator;
        FqName packageFqName3 = classId3.getPackageFqName();
        FqName packageFqName4 = classId3.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName4, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.m28592g(Iterator.class), classId3, new ClassId(packageFqName3, FqNamesUtilKt.tail(fqName2, packageFqName4), false));
        ClassId classId4 = ClassId.topLevel(StandardNames.FqNames.collection);
        Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(FqNames.collection)");
        FqName fqName3 = StandardNames.FqNames.mutableCollection;
        FqName packageFqName5 = classId4.getPackageFqName();
        FqName packageFqName6 = classId4.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName6, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.m28592g(Collection.class), classId4, new ClassId(packageFqName5, FqNamesUtilKt.tail(fqName3, packageFqName6), false));
        ClassId classId5 = ClassId.topLevel(StandardNames.FqNames.list);
        Intrinsics.checkNotNullExpressionValue(classId5, "topLevel(FqNames.list)");
        FqName fqName4 = StandardNames.FqNames.mutableList;
        FqName packageFqName7 = classId5.getPackageFqName();
        FqName packageFqName8 = classId5.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName8, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.m28592g(List.class), classId5, new ClassId(packageFqName7, FqNamesUtilKt.tail(fqName4, packageFqName8), false));
        ClassId classId6 = ClassId.topLevel(StandardNames.FqNames.set);
        Intrinsics.checkNotNullExpressionValue(classId6, "topLevel(FqNames.set)");
        FqName fqName5 = StandardNames.FqNames.mutableSet;
        FqName packageFqName9 = classId6.getPackageFqName();
        FqName packageFqName10 = classId6.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName10, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.m28592g(Set.class), classId6, new ClassId(packageFqName9, FqNamesUtilKt.tail(fqName5, packageFqName10), false));
        ClassId classId7 = ClassId.topLevel(StandardNames.FqNames.listIterator);
        Intrinsics.checkNotNullExpressionValue(classId7, "topLevel(FqNames.listIterator)");
        FqName fqName6 = StandardNames.FqNames.mutableListIterator;
        FqName packageFqName11 = classId7.getPackageFqName();
        FqName packageFqName12 = classId7.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName12, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.m28592g(ListIterator.class), classId7, new ClassId(packageFqName11, FqNamesUtilKt.tail(fqName6, packageFqName12), false));
        FqName fqName7 = StandardNames.FqNames.map;
        ClassId classId8 = ClassId.topLevel(fqName7);
        Intrinsics.checkNotNullExpressionValue(classId8, "topLevel(FqNames.map)");
        FqName fqName8 = StandardNames.FqNames.mutableMap;
        FqName packageFqName13 = classId8.getPackageFqName();
        FqName packageFqName14 = classId8.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName14, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.m28592g(Map.class), classId8, new ClassId(packageFqName13, FqNamesUtilKt.tail(fqName8, packageFqName14), false));
        ClassId createNestedClassId = ClassId.topLevel(fqName7).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        Intrinsics.checkNotNullExpressionValue(createNestedClassId, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        FqName fqName9 = StandardNames.FqNames.mutableMapEntry;
        FqName packageFqName15 = createNestedClassId.getPackageFqName();
        FqName packageFqName16 = createNestedClassId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName16, "kotlinReadOnly.packageFqName");
        List<PlatformMutabilityMapping> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new PlatformMutabilityMapping[]{platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.m28592g(Map.Entry.class), createNestedClassId, new ClassId(packageFqName15, FqNamesUtilKt.tail(fqName9, packageFqName16), false))});
        f68583p = listOf;
        javaToKotlinClassMap.m28593f(Object.class, StandardNames.FqNames.any);
        javaToKotlinClassMap.m28593f(String.class, StandardNames.FqNames.string);
        javaToKotlinClassMap.m28593f(CharSequence.class, StandardNames.FqNames.charSequence);
        javaToKotlinClassMap.m28594e(Throwable.class, StandardNames.FqNames.throwable);
        javaToKotlinClassMap.m28593f(Cloneable.class, StandardNames.FqNames.cloneable);
        javaToKotlinClassMap.m28593f(Number.class, StandardNames.FqNames.number);
        javaToKotlinClassMap.m28594e(Comparable.class, StandardNames.FqNames.comparable);
        javaToKotlinClassMap.m28593f(Enum.class, StandardNames.FqNames._enum);
        javaToKotlinClassMap.m28594e(Annotation.class, StandardNames.FqNames.annotation);
        for (PlatformMutabilityMapping platformMutabilityMapping8 : listOf) {
            INSTANCE.m28595d(platformMutabilityMapping8);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId classId9 = ClassId.topLevel(jvmPrimitiveType.getWrapperFqName());
            Intrinsics.checkNotNullExpressionValue(classId9, "topLevel(jvmType.wrapperFqName)");
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "jvmType.primitiveType");
            ClassId classId10 = ClassId.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            Intrinsics.checkNotNullExpressionValue(classId10, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            javaToKotlinClassMap2.m28598a(classId9, classId10);
        }
        for (ClassId classId11 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            ClassId classId12 = ClassId.topLevel(new FqName("kotlin.jvm.internal." + classId11.getShortClassName().asString() + "CompanionObject"));
            Intrinsics.checkNotNullExpressionValue(classId12, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            ClassId createNestedClassId2 = classId11.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            Intrinsics.checkNotNullExpressionValue(createNestedClassId2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            javaToKotlinClassMap3.m28598a(classId12, createNestedClassId2);
        }
        for (int i = 0; i < 23; i++) {
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            ClassId classId13 = ClassId.topLevel(new FqName("kotlin.jvm.functions.Function" + i));
            Intrinsics.checkNotNullExpressionValue(classId13, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            javaToKotlinClassMap4.m28598a(classId13, StandardNames.getFunctionClassId(i));
            javaToKotlinClassMap4.m28596c(new FqName(f68569b + i), f68574g);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            INSTANCE.m28596c(new FqName((functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix()) + i2), f68574g);
        }
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        FqName safe = StandardNames.FqNames.nothing.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "nothing.toSafe()");
        javaToKotlinClassMap5.m28596c(safe, javaToKotlinClassMap5.m28592g(Void.class));
    }

    /* renamed from: a */
    public final void m28598a(ClassId classId, ClassId classId2) {
        m28597b(classId, classId2);
        FqName asSingleFqName = classId2.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "kotlinClassId.asSingleFqName()");
        m28596c(asSingleFqName, classId);
    }

    /* renamed from: b */
    public final void m28597b(ClassId classId, ClassId classId2) {
        HashMap hashMap = f68577j;
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(unsafe, classId2);
    }

    /* renamed from: c */
    public final void m28596c(FqName fqName, ClassId classId) {
        HashMap hashMap = f68578k;
        FqNameUnsafe unsafe = fqName.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(unsafe, classId);
    }

    /* renamed from: d */
    public final void m28595d(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId component1 = platformMutabilityMapping.component1();
        ClassId component2 = platformMutabilityMapping.component2();
        ClassId component3 = platformMutabilityMapping.component3();
        m28598a(component1, component2);
        FqName asSingleFqName = component3.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "mutableClassId.asSingleFqName()");
        m28596c(asSingleFqName, component1);
        f68581n.put(component3, component2);
        f68582o.put(component2, component3);
        FqName asSingleFqName2 = component2.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName2, "readOnlyClassId.asSingleFqName()");
        FqName asSingleFqName3 = component3.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName3, "mutableClassId.asSingleFqName()");
        HashMap hashMap = f68579l;
        FqNameUnsafe unsafe = component3.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(unsafe, asSingleFqName2);
        HashMap hashMap2 = f68580m;
        FqNameUnsafe unsafe2 = asSingleFqName2.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(unsafe2, asSingleFqName3);
    }

    /* renamed from: e */
    public final void m28594e(Class cls, FqName fqName) {
        ClassId m28592g = m28592g(cls);
        ClassId classId = ClassId.topLevel(fqName);
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(kotlinFqName)");
        m28598a(m28592g, classId);
    }

    /* renamed from: f */
    public final void m28593f(Class cls, FqNameUnsafe fqNameUnsafe) {
        FqName safe = fqNameUnsafe.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "kotlinFqName.toSafe()");
        m28594e(cls, safe);
    }

    /* renamed from: g */
    public final ClassId m28592g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId classId = ClassId.topLevel(new FqName(cls.getCanonicalName()));
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(clazz.canonicalName))");
            return classId;
        }
        ClassId createNestedClassId = m28592g(declaringClass).createNestedClassId(Name.identifier(cls.getSimpleName()));
        Intrinsics.checkNotNullExpressionValue(createNestedClassId, "classId(outer).createNes…tifier(clazz.simpleName))");
        return createNestedClassId;
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return f68573f;
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return f68583p;
    }

    /* renamed from: h */
    public final boolean m28591h(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String asString = fqNameUnsafe.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "kotlinFqName.asString()");
        String substringAfter = StringsKt__StringsKt.substringAfter(asString, str, "");
        if (substringAfter.length() <= 0 || StringsKt__StringsKt.startsWith$default((CharSequence) substringAfter, '0', false, 2, (Object) null) || (intOrNull = AbstractC20032gN1.toIntOrNull(substringAfter)) == null || intOrNull.intValue() < 23) {
            return false;
        }
        return true;
    }

    public final boolean isMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f68579l.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return f68580m.containsKey(fqNameUnsafe);
    }

    @Nullable
    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (ClassId) f68577j.get(fqName.toUnsafe());
    }

    @Nullable
    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        if (m28591h(kotlinFqName, f68568a)) {
            return f68572e;
        }
        if (m28591h(kotlinFqName, f68570c)) {
            return f68572e;
        }
        if (m28591h(kotlinFqName, f68569b)) {
            return f68574g;
        }
        if (m28591h(kotlinFqName, f68571d)) {
            return f68574g;
        }
        return (ClassId) f68578k.get(kotlinFqName);
    }

    @Nullable
    public final FqName mutableToReadOnly(@Nullable FqNameUnsafe fqNameUnsafe) {
        return (FqName) f68579l.get(fqNameUnsafe);
    }

    @Nullable
    public final FqName readOnlyToMutable(@Nullable FqNameUnsafe fqNameUnsafe) {
        return (FqName) f68580m.get(fqNameUnsafe);
    }
}
