package kotlinx.serialization.json.internal;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import org.apache.http.message.TokenParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0016\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001a-\u0010\u001d\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aj\u0010'\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00052!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b \u0012\b\b\u0015\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00180\u001f2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040#2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020%0#H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\",\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,\"&\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, m28850d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "", "", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Ljava/util/Map;", "descriptor", "deserializationNamesMap", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/util/Map;", "Lkotlinx/serialization/json/JsonNamingStrategy;", "strategy", "", "serializationNamesIndices", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonNamingStrategy;)[Ljava/lang/String;", FirebaseAnalytics.Param.INDEX, "getJsonElementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;I)Ljava/lang/String;", "namingStrategy", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/JsonNamingStrategy;", "name", "d", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;)I", "", OperatorName.CURVE_TO, "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "getJsonNameIndex", "suffix", "getJsonNameIndexOrThrow", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Ljava/lang/String;Ljava/lang/String;)I", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "consume", "peekNull", "Lkotlin/Function0;", "peekString", "", "onEnumCoercing", "tryCoerceValue", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "getJsonDeserializationNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonDeserializationNamesKey", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getJsonSerializationNamesKey", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, m28849k = 2, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n800#2,11:138\n13309#3,2:149\n1#4:151\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:138,11\n35#1:149,2\n*E\n"})
/* loaded from: classes6.dex */
public final class JsonNamesMapKt {

    /* renamed from: a */
    public static final DescriptorSchemaCache.Key f71386a = new DescriptorSchemaCache.Key();

    /* renamed from: b */
    public static final DescriptorSchemaCache.Key f71387b = new DescriptorSchemaCache.Key();

    /* renamed from: a */
    public static final Map m26638a(SerialDescriptor serialDescriptor, Json json) {
        String str;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean m26636c = m26636c(json, serialDescriptor);
        JsonNamingStrategy namingStrategy = namingStrategy(serialDescriptor, json);
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : serialDescriptor.getElementAnnotations(i)) {
                if (obj instanceof JsonNames) {
                    arrayList.add(obj);
                }
            }
            JsonNames jsonNames = (JsonNames) CollectionsKt___CollectionsKt.singleOrNull((List<? extends Object>) arrayList);
            if (jsonNames != null && (names = jsonNames.names()) != null) {
                for (String str2 : names) {
                    if (m26636c) {
                        str2 = str2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                    }
                    m26637b(linkedHashMap, serialDescriptor, str2, i);
                }
            }
            if (m26636c) {
                str = serialDescriptor.getElementName(i).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else if (namingStrategy != null) {
                str = namingStrategy.serialNameForJson(serialDescriptor, i, serialDescriptor.getElementName(i));
            } else {
                str = null;
            }
            if (str != null) {
                m26637b(linkedHashMap, serialDescriptor, str, i);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return AbstractC11687a.emptyMap();
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static final void m26637b(Map map, SerialDescriptor serialDescriptor, String str, int i) {
        String str2;
        if (Intrinsics.areEqual(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + TokenParser.f74560SP + serialDescriptor.getElementName(i) + " is already one of the names for " + str2 + TokenParser.f74560SP + serialDescriptor.getElementName(((Number) AbstractC11687a.getValue(map, str)).intValue()) + " in " + serialDescriptor);
    }

    /* renamed from: c */
    public static final boolean m26636c(Json json, SerialDescriptor serialDescriptor) {
        if (json.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.areEqual(serialDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final int m26635d(SerialDescriptor serialDescriptor, Json json, String str) {
        Integer num = deserializationNamesMap(json, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @NotNull
    public static final Map<String, Integer> deserializationNamesMap(@NotNull Json json, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(descriptor, f71386a, new JsonNamesMapKt$deserializationNamesMap$1(descriptor, json));
    }

    @NotNull
    public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() {
        return f71386a;
    }

    @NotNull
    public static final String getJsonElementName(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        JsonNamingStrategy namingStrategy = namingStrategy(serialDescriptor, json);
        if (namingStrategy == null) {
            return serialDescriptor.getElementName(i);
        }
        return serializationNamesIndices(serialDescriptor, json, namingStrategy)[i];
    }

    public static final int getJsonNameIndex(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, @NotNull String name) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (m26636c(json, serialDescriptor)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return m26635d(serialDescriptor, json, lowerCase);
        } else if (namingStrategy(serialDescriptor, json) != null) {
            return m26635d(serialDescriptor, json, name);
        } else {
            int elementIndex = serialDescriptor.getElementIndex(name);
            if (elementIndex != -3) {
                return elementIndex;
            }
            if (!json.getConfiguration().getUseAlternativeNames()) {
                return elementIndex;
            }
            return m26635d(serialDescriptor, json, name);
        }
    }

    public static final int getJsonNameIndexOrThrow(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, @NotNull String name, @NotNull String suffix) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int jsonNameIndex = getJsonNameIndex(serialDescriptor, json, name);
        if (jsonNameIndex != -3) {
            return jsonNameIndex;
        }
        throw new SerializationException(serialDescriptor.getSerialName() + " does not contain element with name '" + name + CoreConstants.SINGLE_QUOTE_CHAR + suffix);
    }

    public static /* synthetic */ int getJsonNameIndexOrThrow$default(SerialDescriptor serialDescriptor, Json json, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return getJsonNameIndexOrThrow(serialDescriptor, json, str, str2);
    }

    @NotNull
    public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() {
        return f71387b;
    }

    @Nullable
    public static final JsonNamingStrategy namingStrategy(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(serialDescriptor.getKind(), StructureKind.CLASS.INSTANCE)) {
            return json.getConfiguration().getNamingStrategy();
        }
        return null;
    }

    @NotNull
    public static final String[] serializationNamesIndices(@NotNull SerialDescriptor serialDescriptor, @NotNull Json json, @NotNull JsonNamingStrategy strategy) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return (String[]) JsonSchemaCacheKt.getSchemaCache(json).getOrPut(serialDescriptor, f71387b, new JsonNamesMapKt$serializationNamesIndices$1(serialDescriptor, strategy));
    }

    public static final boolean tryCoerceValue(@NotNull Json json, @NotNull SerialDescriptor descriptor, int i, @NotNull Function1<? super Boolean, Boolean> peekNull, @NotNull Function0<String> peekString, @NotNull Function0<Unit> onEnumCoercing) {
        String invoke;
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        if (!descriptor.isElementOptional(i)) {
            return false;
        }
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i);
        if (!elementDescriptor.isNullable() && peekNull.invoke(Boolean.TRUE).booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && peekNull.invoke(Boolean.FALSE).booleanValue()) || (invoke = peekString.invoke()) == null || getJsonNameIndex(elementDescriptor, json, invoke) != -3)) {
            return false;
        }
        onEnumCoercing.invoke();
        return true;
    }

    public static /* synthetic */ boolean tryCoerceValue$default(Json json, SerialDescriptor descriptor, int i, Function1 peekNull, Function0 peekString, Function0 onEnumCoercing, int i2, Object obj) {
        String str;
        if ((i2 & 16) != 0) {
            onEnumCoercing = JsonNamesMapKt$tryCoerceValue$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(peekNull, "peekNull");
        Intrinsics.checkNotNullParameter(peekString, "peekString");
        Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
        if (!descriptor.isElementOptional(i)) {
            return false;
        }
        SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i);
        if (!elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && ((Boolean) peekNull.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) peekString.invoke()) == null || getJsonNameIndex(elementDescriptor, json, str) != -3)) {
            return false;
        }
        onEnumCoercing.invoke();
        return true;
    }
}
