package p000;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.C12175c;
import kotlinx.serialization.json.internal.JsonDecoderForUnsignedTypes;
import kotlinx.serialization.json.internal.JsonExceptionsKt;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.json.internal.PolymorphicKt;
import kotlinx.serialization.json.internal.StreamingJsonEncoderKt;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.WriteModeKt;
import kotlinx.serialization.modules.SerializersModule;

/* renamed from: S */
/* loaded from: classes6.dex */
public abstract class AbstractC1282S extends NamedValueDecoder implements JsonDecoder {

    /* renamed from: c */
    public final Json f5486c;

    /* renamed from: d */
    public final JsonElement f5487d;

    /* renamed from: e */
    public final JsonConfiguration f5488e;

    public /* synthetic */ AbstractC1282S(Json json, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement);
    }

    /* renamed from: b */
    public final JsonLiteral m66402b(JsonPrimitive jsonPrimitive, String str) {
        JsonLiteral jsonLiteral;
        if (jsonPrimitive instanceof JsonLiteral) {
            jsonLiteral = (JsonLiteral) jsonPrimitive;
        } else {
            jsonLiteral = null;
        }
        if (jsonLiteral != null) {
            return jsonLiteral;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected 'null' literal when non-nullable " + str + " was expected");
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        boolean z;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonElement m66401d = m66401d();
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE)) {
            z = true;
        } else {
            z = kind instanceof PolymorphicKind;
        }
        if (z) {
            Json json = getJson();
            if (m66401d instanceof JsonArray) {
                return new C22314th0(json, (JsonArray) m66401d);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(m66401d.getClass()));
        } else if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json2 = getJson();
            SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json2.getSerializersModule());
            SerialKind kind2 = carrierDescriptor.getKind();
            if (!(kind2 instanceof PrimitiveKind) && !Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
                if (json2.getConfiguration().getAllowStructuredMapKeys()) {
                    Json json3 = getJson();
                    if (m66401d instanceof JsonArray) {
                        return new C22314th0(json3, (JsonArray) m66401d);
                    }
                    throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonArray.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(m66401d.getClass()));
                }
                throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
            }
            Json json4 = getJson();
            if (m66401d instanceof JsonObject) {
                return new C22658vh0(json4, (JsonObject) m66401d);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(m66401d.getClass()));
        } else {
            Json json5 = getJson();
            if (m66401d instanceof JsonObject) {
                return new C12175c(json5, (JsonObject) m66401d, null, null, 12, null);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class) + " as the serialized body of " + descriptor.getSerialName() + ", but had " + Reflection.getOrCreateKotlinClass(m66401d.getClass()));
        }
    }

    /* renamed from: c */
    public abstract JsonElement mo1015c(String str);

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    /* renamed from: d */
    public final JsonElement m66401d() {
        JsonElement mo1015c;
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null || (mo1015c = mo1015c(currentTagOrNull)) == null) {
            return mo1014s();
        }
        return mo1015c;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (getCurrentTagOrNull() != null) {
            return super.decodeInline(descriptor);
        }
        return new C20938lh0(getJson(), mo1014s()).decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return m66401d();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(m66401d() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public Object decodeSerializableValue(DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return PolymorphicKt.decodeSerializableValuePolymorphic(this, deserializer);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: e */
    public boolean decodeTaggedBoolean(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(m66387r(tag));
            if (booleanOrNull != null) {
                return booleanOrNull.booleanValue();
            }
            m66386t(TypedValues.Custom.S_BOOLEAN);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            m66386t(TypedValues.Custom.S_BOOLEAN);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: f */
    public byte decodeTaggedByte(String tag) {
        Byte b;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int i = JsonElementKt.getInt(m66387r(tag));
            if (-128 <= i && i <= 127) {
                b = Byte.valueOf((byte) i);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            m66386t("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            m66386t("byte");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: g */
    public char decodeTaggedChar(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return StringsKt___StringsKt.single(m66387r(tag).getContent());
        } catch (IllegalArgumentException unused) {
            m66386t("char");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public Json getJson() {
        return this.f5486c;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: h */
    public double decodeTaggedDouble(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            double d = JsonElementKt.getDouble(m66387r(tag));
            if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues() && (Double.isInfinite(d) || Double.isNaN(d))) {
                throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(d), tag, m66401d().toString());
            }
            return d;
        } catch (IllegalArgumentException unused) {
            m66386t("double");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: i */
    public int decodeTaggedEnum(String tag, SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, getJson(), m66387r(tag).getContent(), null, 4, null);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: j */
    public float decodeTaggedFloat(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            float f = JsonElementKt.getFloat(m66387r(tag));
            if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues() && (Float.isInfinite(f) || Float.isNaN(f))) {
                throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(f), tag, m66401d().toString());
            }
            return f;
        } catch (IllegalArgumentException unused) {
            m66386t(TypedValues.Custom.S_FLOAT);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: k */
    public Decoder decodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            return new JsonDecoderForUnsignedTypes(new StringJsonLexer(m66387r(tag).getContent()), getJson());
        }
        return super.decodeTaggedInline(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: l */
    public int decodeTaggedInt(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return JsonElementKt.getInt(m66387r(tag));
        } catch (IllegalArgumentException unused) {
            m66386t("int");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: m */
    public long decodeTaggedLong(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return JsonElementKt.getLong(m66387r(tag));
        } catch (IllegalArgumentException unused) {
            m66386t("long");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: n */
    public boolean decodeTaggedNotNullMark(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (mo1015c(tag) != JsonNull.INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: o */
    public Void decodeTaggedNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return null;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: p */
    public short decodeTaggedShort(String tag) {
        Short sh;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            int i = JsonElementKt.getInt(m66387r(tag));
            if (-32768 <= i && i <= 32767) {
                sh = Short.valueOf((short) i);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            m66386t("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            m66386t("short");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* renamed from: q */
    public String decodeTaggedString(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonPrimitive m66387r = m66387r(tag);
        if (!getJson().getConfiguration().isLenient() && !m66402b(m66387r, TypedValues.Custom.S_STRING).isString()) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m66401d().toString());
        } else if (!(m66387r instanceof JsonNull)) {
            return m66387r.getContent();
        } else {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected 'null' value instead of string literal", m66401d().toString());
        }
    }

    /* renamed from: r */
    public final JsonPrimitive m66387r(String tag) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(tag, "tag");
        JsonElement mo1015c = mo1015c(tag);
        if (mo1015c instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) mo1015c;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Expected JsonPrimitive at " + tag + ", found " + mo1015c, m66401d().toString());
    }

    /* renamed from: s */
    public abstract JsonElement mo1014s();

    /* renamed from: t */
    public final Void m66386t(String str) {
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal as '" + str + "' value", m66401d().toString());
    }

    public AbstractC1282S(Json json, JsonElement jsonElement) {
        this.f5486c = json;
        this.f5487d = jsonElement;
        this.f5488e = getJson().getConfiguration();
    }
}
