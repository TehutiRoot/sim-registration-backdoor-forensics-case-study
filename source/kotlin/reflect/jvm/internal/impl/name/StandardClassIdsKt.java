package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1179#2,2:266\n1253#2,4:268\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n*L\n264#1:266,2\n264#1:268,4\n*E\n"})
/* loaded from: classes6.dex */
public final class StandardClassIdsKt {

    /* renamed from: a */
    public static final FqName f69687a;

    /* renamed from: b */
    public static final FqName f69688b;

    static {
        FqName fqName = new FqName("java.lang");
        f69687a = fqName;
        FqName child = fqName.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(child, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f69688b = child;
    }

    /* renamed from: a */
    public static final ClassId m28014a(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: b */
    public static final ClassId m28013b(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: c */
    public static final ClassId m28012c(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: d */
    public static final ClassId m28011d(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: e */
    public static final ClassId m28010e(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: f */
    public static final Map m28009f(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11719c.coerceAtLeast(AbstractC18515Tn0.mapCapacity(AbstractC10176es.collectionSizeOrDefault(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Pair m28844to = TuplesKt.m28844to(entry.getValue(), entry.getKey());
            linkedHashMap.put(m28844to.getFirst(), m28844to.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: g */
    public static final ClassId m28008g(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        FqName packageFqName = standardClassIds.getArray().getPackageFqName();
        return new ClassId(packageFqName, Name.identifier(name.getIdentifier() + standardClassIds.getArray().getShortClassName().getIdentifier()));
    }

    /* renamed from: h */
    public static final ClassId m28007h(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: i */
    public static final ClassId m28006i(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: j */
    public static final ClassId m28005j(ClassId classId) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        return new ClassId(base_kotlin_package, Name.identifier(Matrix.MATRIX_TYPE_RANDOM_UT + classId.getShortClassName().getIdentifier()));
    }
}
