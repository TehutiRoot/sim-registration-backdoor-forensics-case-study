package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,42:1\n1549#2:43\n1620#2,3:44\n1490#2:47\n1520#2,3:48\n1523#2,3:58\n1238#2,4:63\n1549#2:67\n1620#2,3:68\n361#3,7:51\n442#3:61\n392#3:62\n*S KotlinDebug\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n*L\n27#1:43\n27#1:44,3\n28#1:47\n28#1:48,3\n28#1:58,3\n29#1:63,4\n34#1:67\n34#1:68,3\n28#1:51,7\n29#1:61\n29#1:62\n*E\n"})
/* loaded from: classes6.dex */
public final class BuiltinSpecialProperties {
    @NotNull
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    /* renamed from: a */
    public static final Map f68942a;

    /* renamed from: b */
    public static final Map f68943b;

    /* renamed from: c */
    public static final Set f68944c;

    /* renamed from: d */
    public static final Set f68945d;

    static {
        FqName m28426b;
        FqName m28426b2;
        FqName m28427a;
        FqName m28427a2;
        FqName m28426b3;
        FqName m28427a3;
        FqName m28427a4;
        FqName m28427a5;
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        m28426b = BuiltinSpecialPropertiesKt.m28426b(fqNameUnsafe, "name");
        Pair m28844to = TuplesKt.m28844to(m28426b, Name.identifier("name"));
        m28426b2 = BuiltinSpecialPropertiesKt.m28426b(fqNameUnsafe, "ordinal");
        Pair m28844to2 = TuplesKt.m28844to(m28426b2, Name.identifier("ordinal"));
        m28427a = BuiltinSpecialPropertiesKt.m28427a(StandardNames.FqNames.collection, "size");
        Pair m28844to3 = TuplesKt.m28844to(m28427a, Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        m28427a2 = BuiltinSpecialPropertiesKt.m28427a(fqName, "size");
        Pair m28844to4 = TuplesKt.m28844to(m28427a2, Name.identifier("size"));
        m28426b3 = BuiltinSpecialPropertiesKt.m28426b(StandardNames.FqNames.charSequence, "length");
        Pair m28844to5 = TuplesKt.m28844to(m28426b3, Name.identifier("length"));
        m28427a3 = BuiltinSpecialPropertiesKt.m28427a(fqName, UserMetadata.KEYDATA_FILENAME);
        Pair m28844to6 = TuplesKt.m28844to(m28427a3, Name.identifier("keySet"));
        m28427a4 = BuiltinSpecialPropertiesKt.m28427a(fqName, "values");
        Pair m28844to7 = TuplesKt.m28844to(m28427a4, Name.identifier("values"));
        m28427a5 = BuiltinSpecialPropertiesKt.m28427a(fqName, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        Map mapOf = AbstractC11687a.mapOf(m28844to, m28844to2, m28844to3, m28844to4, m28844to5, m28844to6, m28844to7, TuplesKt.m28844to(m28427a5, Name.identifier("entrySet")));
        f68942a = mapOf;
        Set<Map.Entry> entrySet = mapOf.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.getSecond();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add((Name) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC18515Tn0.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), CollectionsKt___CollectionsKt.distinct((Iterable) entry2.getValue()));
        }
        f68943b = linkedHashMap2;
        Set keySet = f68942a.keySet();
        f68944c = keySet;
        Set<FqName> set = keySet;
        ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(set, 10));
        for (FqName fqName2 : set) {
            arrayList2.add(fqName2.shortName());
        }
        f68945d = CollectionsKt___CollectionsKt.toSet(arrayList2);
    }

    @NotNull
    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return f68942a;
    }

    @NotNull
    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(@NotNull Name name1) {
        Intrinsics.checkNotNullParameter(name1, "name1");
        List<Name> list = (List) f68943b.get(name1);
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return list;
    }

    @NotNull
    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return f68944c;
    }

    @NotNull
    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return f68945d;
    }
}
