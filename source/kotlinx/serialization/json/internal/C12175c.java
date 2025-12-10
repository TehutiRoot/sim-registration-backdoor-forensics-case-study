package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;

/* renamed from: kotlinx.serialization.json.internal.c */
/* loaded from: classes6.dex */
public class C12175c extends AbstractC1282S {

    /* renamed from: f */
    public final JsonObject f71436f;

    /* renamed from: g */
    public final String f71437g;

    /* renamed from: h */
    public final SerialDescriptor f71438h;

    /* renamed from: i */
    public int f71439i;

    /* renamed from: j */
    public boolean f71440j;

    public /* synthetic */ C12175c(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    @Override // p000.AbstractC1282S, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor == this.f71438h) {
            Json json = getJson();
            JsonElement m66401d = m66401d();
            SerialDescriptor serialDescriptor = this.f71438h;
            if (m66401d instanceof JsonObject) {
                return new C12175c(json, (JsonObject) m66401d, this.f71437g, serialDescriptor);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + serialDescriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(m66401d.getClass()));
        }
        return super.beginStructure(descriptor);
    }

    @Override // p000.AbstractC1282S
    /* renamed from: c */
    public JsonElement mo1015c(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) AbstractC11687a.getValue(mo1014s(), tag);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.f71439i < descriptor.getElementsCount()) {
            int i = this.f71439i;
            this.f71439i = i + 1;
            String tag = getTag(descriptor, i);
            int i2 = this.f71439i - 1;
            this.f71440j = false;
            if (mo1014s().containsKey((Object) tag) || m26604u(descriptor, i2)) {
                if (!this.f5488e.getCoerceInputValues() || !m26603v(descriptor, i2, tag)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1282S, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        if (!this.f71440j && super.decodeNotNullMark()) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor descriptor, int i) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonNamingStrategy namingStrategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
        String elementName = descriptor.getElementName(i);
        if (namingStrategy == null) {
            if (!this.f5488e.getUseAlternativeNames()) {
                return elementName;
            }
            if (mo1014s().keySet().contains(elementName)) {
                return elementName;
            }
        }
        Map<String, Integer> deserializationNamesMap = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor);
        Iterator<T> it = mo1014s().keySet().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                Integer num = deserializationNamesMap.get((String) obj);
                if (num != null && num.intValue() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return str2;
        }
        if (namingStrategy != null) {
            str = namingStrategy.serialNameForJson(descriptor, i, elementName);
        }
        if (str != null) {
            return str;
        }
        return elementName;
    }

    @Override // p000.AbstractC1282S, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Set set;
        Set<String> plus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.f5488e.getIgnoreUnknownKeys() && !(descriptor.getKind() instanceof PolymorphicKind)) {
            JsonNamingStrategy namingStrategy = JsonNamesMapKt.namingStrategy(descriptor, getJson());
            if (namingStrategy == null && !this.f5488e.getUseAlternativeNames()) {
                plus = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            } else if (namingStrategy != null) {
                plus = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor).keySet();
            } else {
                Set<String> jsonCachedSerialNames = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
                Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, JsonNamesMapKt.getJsonDeserializationNamesKey());
                if (map != null) {
                    set = map.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = DG1.emptySet();
                }
                plus = EG1.plus((Set) jsonCachedSerialNames, (Iterable) set);
            }
            for (String str : mo1014s().keySet()) {
                if (!plus.contains(str) && !Intrinsics.areEqual(str, this.f71437g)) {
                    throw JsonExceptionsKt.UnknownKeyException(str, mo1014s().toString());
                }
            }
        }
    }

    /* renamed from: u */
    public final boolean m26604u(SerialDescriptor serialDescriptor, int i) {
        boolean z;
        if (!getJson().getConfiguration().getExplicitNulls() && !serialDescriptor.isElementOptional(i) && serialDescriptor.getElementDescriptor(i).isNullable()) {
            z = true;
        } else {
            z = false;
        }
        this.f71440j = z;
        return z;
    }

    /* renamed from: v */
    public final boolean m26603v(SerialDescriptor serialDescriptor, int i, String str) {
        JsonPrimitive jsonPrimitive;
        Json json = getJson();
        if (!serialDescriptor.isElementOptional(i)) {
            return false;
        }
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i);
        if (elementDescriptor.isNullable() || !(mo1015c(str) instanceof JsonNull)) {
            if (!Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
                return false;
            }
            if (elementDescriptor.isNullable() && (mo1015c(str) instanceof JsonNull)) {
                return false;
            }
            JsonElement mo1015c = mo1015c(str);
            String str2 = null;
            if (mo1015c instanceof JsonPrimitive) {
                jsonPrimitive = (JsonPrimitive) mo1015c;
            } else {
                jsonPrimitive = null;
            }
            if (jsonPrimitive != null) {
                str2 = JsonElementKt.getContentOrNull(jsonPrimitive);
            }
            if (str2 == null || JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, str2) != -3) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC1282S
    /* renamed from: w */
    public JsonObject mo1014s() {
        return this.f71436f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12175c(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f71436f = value;
        this.f71437g = str;
        this.f71438h = serialDescriptor;
    }
}
