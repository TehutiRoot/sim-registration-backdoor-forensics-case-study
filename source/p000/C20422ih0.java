package p000;

import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializersKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

/* renamed from: ih0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20422ih0 implements KSerializer {

    /* renamed from: a */
    public static final C20422ih0 f62868a = new C20422ih0();

    /* renamed from: b */
    public static final SerialDescriptor f62869b = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", PrimitiveKind.STRING.INSTANCE);

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: a */
    public JsonLiteral deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        JsonElement decodeJsonElement = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (decodeJsonElement instanceof JsonLiteral) {
            return (JsonLiteral) decodeJsonElement;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(decodeJsonElement.getClass()), decodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: b */
    public void serialize(Encoder encoder, JsonLiteral value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.m26684c(encoder);
        if (value.isString()) {
            encoder.encodeString(value.getContent());
        } else if (value.getCoerceToInlineType$kotlinx_serialization_json() != null) {
            encoder.encodeInline(value.getCoerceToInlineType$kotlinx_serialization_json()).encodeString(value.getContent());
        } else {
            Long longOrNull = AbstractC20032gN1.toLongOrNull(value.getContent());
            if (longOrNull != null) {
                encoder.encodeLong(longOrNull.longValue());
                return;
            }
            ULong uLongOrNull = UStringsKt.toULongOrNull(value.getContent());
            if (uLongOrNull != null) {
                encoder.encodeInline(BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor()).encodeLong(uLongOrNull.m74151unboximpl());
                return;
            }
            Double doubleOrNull = AbstractC19860fN1.toDoubleOrNull(value.getContent());
            if (doubleOrNull != null) {
                encoder.encodeDouble(doubleOrNull.doubleValue());
                return;
            }
            Boolean booleanStrictOrNull = StringsKt__StringsKt.toBooleanStrictOrNull(value.getContent());
            if (booleanStrictOrNull != null) {
                encoder.encodeBoolean(booleanStrictOrNull.booleanValue());
            } else {
                encoder.encodeString(value.getContent());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return f62869b;
    }
}
