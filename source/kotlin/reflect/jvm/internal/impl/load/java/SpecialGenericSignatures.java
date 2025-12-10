package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSpecialGenericSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,146:1\n1549#2:147\n1620#2,3:148\n1549#2:151\n1620#2,3:152\n1549#2:155\n1620#2,3:156\n1238#2,4:162\n1549#2:166\n1620#2,3:167\n1549#2:170\n1620#2,3:171\n1238#2,4:177\n1549#2:181\n1620#2,3:182\n1549#2:185\n1620#2,3:186\n1208#2,2:189\n1238#2,4:191\n13#3:159\n13#3:174\n457#4:160\n403#4:161\n457#4:175\n403#4:176\n*S KotlinDebug\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n*L\n54#1:147\n54#1:148,3\n56#1:151\n56#1:152,3\n57#1:155\n57#1:156,3\n95#1:162,4\n101#1:166\n101#1:167,3\n102#1:170\n102#1:171,3\n126#1:177,4\n128#1:181\n128#1:182,3\n132#1:185\n132#1:186,3\n133#1:189,2\n133#1:191,4\n60#1:159\n111#1:174\n95#1:160\n95#1:161\n126#1:175\n126#1:176\n*E\n"})
/* loaded from: classes6.dex */
public class SpecialGenericSignatures {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public static final List f69003a;

    /* renamed from: b */
    public static final List f69004b;

    /* renamed from: c */
    public static final List f69005c;

    /* renamed from: d */
    public static final Map f69006d;

    /* renamed from: e */
    public static final Map f69007e;

    /* renamed from: f */
    public static final Set f69008f;

    /* renamed from: g */
    public static final Set f69009g;

    /* renamed from: h */
    public static final Companion.NameAndSignature f69010h;

    /* renamed from: i */
    public static final Map f69011i;

    /* renamed from: j */
    public static final Map f69012j;

    /* renamed from: k */
    public static final List f69013k;

    /* renamed from: l */
    public static final Map f69014l;

    /* loaded from: classes6.dex */
    public static final class Companion {

        /* loaded from: classes6.dex */
        public static final class NameAndSignature {

            /* renamed from: a */
            public final Name f69015a;

            /* renamed from: b */
            public final String f69016b;

            public NameAndSignature(@NotNull Name name, @NotNull String signature) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(signature, "signature");
                this.f69015a = name;
                this.f69016b = signature;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof NameAndSignature) {
                    NameAndSignature nameAndSignature = (NameAndSignature) obj;
                    return Intrinsics.areEqual(this.f69015a, nameAndSignature.f69015a) && Intrinsics.areEqual(this.f69016b, nameAndSignature.f69016b);
                }
                return false;
            }

            @NotNull
            public final Name getName() {
                return this.f69015a;
            }

            @NotNull
            public final String getSignature() {
                return this.f69016b;
            }

            public int hashCode() {
                return (this.f69015a.hashCode() * 31) + this.f69016b.hashCode();
            }

            @NotNull
            public String toString() {
                return "NameAndSignature(name=" + this.f69015a + ", signature=" + this.f69016b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NameAndSignature m28406a(String str, String str2, String str3, String str4) {
            Name identifier = Name.identifier(str2);
            Intrinsics.checkNotNullExpressionValue(identifier, "identifier(name)");
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            return new NameAndSignature(identifier, signatureBuildingComponents.signature(str, str2 + CoreConstants.LEFT_PARENTHESIS_CHAR + str3 + CoreConstants.RIGHT_PARENTHESIS_CHAR + str4));
        }

        @Nullable
        public final Name getBuiltinFunctionNamesByJvmName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
        }

        @NotNull
        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.f69004b;
        }

        @NotNull
        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.f69008f;
        }

        @NotNull
        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.f69009g;
        }

        @NotNull
        public final Map<Name, Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.f69014l;
        }

        @NotNull
        public final List<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.f69013k;
        }

        @NotNull
        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.f69010h;
        }

        @NotNull
        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.f69007e;
        }

        @NotNull
        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.f69012j;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "<this>");
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        @NotNull
        public final SpecialSignatureInfo getSpecialSignatureInfo(@NotNull String builtinSignature) {
            Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
            if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(builtinSignature)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            if (((TypeSafeBarrierDescription) AbstractC11687a.getValue(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), builtinSignature)) == TypeSafeBarrierDescription.NULL) {
                return SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC;
            }
            return SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        public Companion() {
        }
    }

    /* loaded from: classes6.dex */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        @Nullable
        private final String valueParametersSignature;

        SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public static final class TypeSafeBarrierDescription {
        @Nullable
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription(ActionConst.NULL, 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES = $values();

        /* loaded from: classes6.dex */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            public MAP_GET_OR_DEFAULT(String str, int i) {
                super(str, i, null, null);
            }
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] $values() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        private TypeSafeBarrierDescription(String str, int i, Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        Set<String> of = DG1.setOf((Object[]) new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(of, 10));
        for (String str : of) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "BOOLEAN.desc");
            arrayList.add(companion.m28406a("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f69003a = arrayList;
        ArrayList<Companion.NameAndSignature> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList2, 10));
        for (Companion.NameAndSignature nameAndSignature : arrayList2) {
            arrayList3.add(nameAndSignature.getSignature());
        }
        f69004b = arrayList3;
        List<Companion.NameAndSignature> list = f69003a;
        ArrayList arrayList4 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (Companion.NameAndSignature nameAndSignature2 : list) {
            arrayList4.add(nameAndSignature2.getName().asString());
        }
        f69005c = arrayList4;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String javaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc2, "BOOLEAN.desc");
        Companion.NameAndSignature m28406a = companion2.m28406a(javaUtil, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair m28844to = TuplesKt.m28844to(m28406a, typeSafeBarrierDescription);
        String javaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc3, "BOOLEAN.desc");
        Pair m28844to2 = TuplesKt.m28844to(companion2.m28406a(javaUtil2, ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String javaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc4, "BOOLEAN.desc");
        Pair m28844to3 = TuplesKt.m28844to(companion2.m28406a(javaUtil3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String javaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc5, "BOOLEAN.desc");
        Pair m28844to4 = TuplesKt.m28844to(companion2.m28406a(javaUtil4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String javaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc6, "BOOLEAN.desc");
        Pair m28844to5 = TuplesKt.m28844to(companion2.m28406a(javaUtil5, ProductAction.ACTION_REMOVE, "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair m28844to6 = TuplesKt.m28844to(companion2.m28406a(signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature m28406a2 = companion2.m28406a(signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair m28844to7 = TuplesKt.m28844to(m28406a2, typeSafeBarrierDescription2);
        Pair m28844to8 = TuplesKt.m28844to(companion2.m28406a(signatureBuildingComponents.javaUtil("Map"), ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String javaUtil6 = signatureBuildingComponents.javaUtil(PDListAttributeObject.OWNER_LIST);
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc7, "INT.desc");
        Companion.NameAndSignature m28406a3 = companion2.m28406a(javaUtil6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair m28844to9 = TuplesKt.m28844to(m28406a3, typeSafeBarrierDescription3);
        String javaUtil7 = signatureBuildingComponents.javaUtil(PDListAttributeObject.OWNER_LIST);
        String desc8 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc8, "INT.desc");
        Map mapOf = AbstractC11687a.mapOf(m28844to, m28844to2, m28844to3, m28844to4, m28844to5, m28844to6, m28844to7, m28844to8, m28844to9, TuplesKt.m28844to(companion2.m28406a(javaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f69006d = mapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC18515Tn0.mapCapacity(mapOf.size()));
        for (Map.Entry entry : mapOf.entrySet()) {
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        f69007e = linkedHashMap;
        Set<Companion.NameAndSignature> plus = EG1.plus(f69006d.keySet(), (Iterable) f69003a);
        ArrayList arrayList5 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(plus, 10));
        for (Companion.NameAndSignature nameAndSignature3 : plus) {
            arrayList5.add(nameAndSignature3.getName());
        }
        f69008f = CollectionsKt___CollectionsKt.toSet(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(plus, 10));
        for (Companion.NameAndSignature nameAndSignature4 : plus) {
            arrayList6.add(nameAndSignature4.getSignature());
        }
        f69009g = CollectionsKt___CollectionsKt.toSet(arrayList6);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc9, "INT.desc");
        Companion.NameAndSignature m28406a4 = companion3.m28406a("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f69010h = m28406a4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String javaLang = signatureBuildingComponents2.javaLang("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc10, "BYTE.desc");
        Pair m28844to10 = TuplesKt.m28844to(companion3.m28406a(javaLang, "toByte", "", desc10), Name.identifier("byteValue"));
        String javaLang2 = signatureBuildingComponents2.javaLang("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc11, "SHORT.desc");
        Pair m28844to11 = TuplesKt.m28844to(companion3.m28406a(javaLang2, "toShort", "", desc11), Name.identifier("shortValue"));
        String javaLang3 = signatureBuildingComponents2.javaLang("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc12, "INT.desc");
        Pair m28844to12 = TuplesKt.m28844to(companion3.m28406a(javaLang3, "toInt", "", desc12), Name.identifier("intValue"));
        String javaLang4 = signatureBuildingComponents2.javaLang("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc13, "LONG.desc");
        Pair m28844to13 = TuplesKt.m28844to(companion3.m28406a(javaLang4, "toLong", "", desc13), Name.identifier("longValue"));
        String javaLang5 = signatureBuildingComponents2.javaLang("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc14, "FLOAT.desc");
        Pair m28844to14 = TuplesKt.m28844to(companion3.m28406a(javaLang5, "toFloat", "", desc14), Name.identifier("floatValue"));
        String javaLang6 = signatureBuildingComponents2.javaLang("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc15, "DOUBLE.desc");
        Pair m28844to15 = TuplesKt.m28844to(companion3.m28406a(javaLang6, "toDouble", "", desc15), Name.identifier("doubleValue"));
        Pair m28844to16 = TuplesKt.m28844to(m28406a4, Name.identifier(ProductAction.ACTION_REMOVE));
        String javaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc16, "INT.desc");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc17, "CHAR.desc");
        Map mapOf2 = AbstractC11687a.mapOf(m28844to10, m28844to11, m28844to12, m28844to13, m28844to14, m28844to15, m28844to16, TuplesKt.m28844to(companion3.m28406a(javaLang7, "get", desc16, desc17), Name.identifier("charAt")));
        f69011i = mapOf2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC18515Tn0.mapCapacity(mapOf2.size()));
        for (Map.Entry entry2 : mapOf2.entrySet()) {
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        f69012j = linkedHashMap2;
        Set<Companion.NameAndSignature> keySet = f69011i.keySet();
        ArrayList arrayList7 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(keySet, 10));
        for (Companion.NameAndSignature nameAndSignature5 : keySet) {
            arrayList7.add(nameAndSignature5.getName());
        }
        f69013k = arrayList7;
        Set<Map.Entry> entrySet = f69011i.entrySet();
        ArrayList<Pair> arrayList8 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(entrySet, 10));
        for (Map.Entry entry3 : entrySet) {
            arrayList8.add(new Pair(((Companion.NameAndSignature) entry3.getKey()).getName(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC11719c.coerceAtLeast(AbstractC18515Tn0.mapCapacity(AbstractC10176es.collectionSizeOrDefault(arrayList8, 10)), 16));
        for (Pair pair : arrayList8) {
            linkedHashMap3.put((Name) pair.getSecond(), (Name) pair.getFirst());
        }
        f69014l = linkedHashMap3;
    }
}
