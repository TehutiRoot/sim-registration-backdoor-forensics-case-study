package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n1179#2,2:266\n1253#2,4:268\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n*L\n264#1:266,2\n264#1:268,4\n*E\n"})
/* loaded from: classes6.dex */
public final class StandardClassIdsKt {

    /* renamed from: a */
    public static final FqName f69721a;

    /* renamed from: b */
    public static final FqName f69722b;

    static {
        FqName fqName = new FqName("java.lang");
        f69721a = fqName;
        FqName child = fqName.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(child, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f69722b = child;
    }

    /* renamed from: a */
    public static final ClassId m28306a(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE(), Name.identifier(str));
    }

    public static final /* synthetic */ ClassId access$annotationId(String str) {
        return m28306a(str);
    }

    public static final /* synthetic */ ClassId access$baseId(String str) {
        return m28305b(str);
    }

    public static final /* synthetic */ ClassId access$collectionsId(String str) {
        return m28304c(str);
    }

    public static final /* synthetic */ ClassId access$coroutinesId(String str) {
        return m28303d(str);
    }

    public static final /* synthetic */ ClassId access$enumsId(String str) {
        return m28302e(str);
    }

    public static final /* synthetic */ Map access$inverseMap(Map map) {
        return m28301f(map);
    }

    public static final /* synthetic */ ClassId access$primitiveArrayId(Name name) {
        return m28300g(name);
    }

    public static final /* synthetic */ ClassId access$rangesId(String str) {
        return m28299h(str);
    }

    public static final /* synthetic */ ClassId access$reflectId(String str) {
        return m28298i(str);
    }

    public static final /* synthetic */ ClassId access$unsignedId(ClassId classId) {
        return m28297j(classId);
    }

    /* renamed from: b */
    public static final ClassId m28305b(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: c */
    public static final ClassId m28304c(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: d */
    public static final ClassId m28303d(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: e */
    public static final ClassId m28302e(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: f */
    public static final Map m28301f(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11695c.coerceAtLeast(AbstractC18946Zn0.mapCapacity(AbstractC10172es.collectionSizeOrDefault(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Pair m29136to = TuplesKt.m29136to(entry.getValue(), entry.getKey());
            linkedHashMap.put(m29136to.getFirst(), m29136to.getSecond());
        }
        return linkedHashMap;
    }

    /* renamed from: g */
    public static final ClassId m28300g(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        FqName packageFqName = standardClassIds.getArray().getPackageFqName();
        return new ClassId(packageFqName, Name.identifier(name.getIdentifier() + standardClassIds.getArray().getShortClassName().getIdentifier()));
    }

    /* renamed from: h */
    public static final ClassId m28299h(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: i */
    public static final ClassId m28298i(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE(), Name.identifier(str));
    }

    /* renamed from: j */
    public static final ClassId m28297j(ClassId classId) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        return new ClassId(base_kotlin_package, Name.identifier(Matrix.MATRIX_TYPE_RANDOM_UT + classId.getShortClassName().getIdentifier()));
    }
}