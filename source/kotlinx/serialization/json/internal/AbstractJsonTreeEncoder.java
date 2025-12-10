package kotlinx.serialization.json.internal;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.modules.SerializersModule;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {

    /* renamed from: b */
    public final Json f71352b;

    /* renamed from: c */
    public final Function1 f71353c;

    /* renamed from: d */
    public final JsonConfiguration f71354d;

    /* renamed from: e */
    public String f71355e;

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, function1);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        Function1 abstractJsonTreeEncoder$beginStructure$consumer$1;
        boolean z;
        AbstractJsonTreeEncoder c22142sh0;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (getCurrentTagOrNull() == null) {
            abstractJsonTreeEncoder$beginStructure$consumer$1 = this.f71353c;
        } else {
            abstractJsonTreeEncoder$beginStructure$consumer$1 = new AbstractJsonTreeEncoder$beginStructure$consumer$1(this);
        }
        SerialKind kind = descriptor.getKind();
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE)) {
            z = true;
        } else {
            z = kind instanceof PolymorphicKind;
        }
        if (z) {
            c22142sh0 = new C22486uh0(this.f71352b, abstractJsonTreeEncoder$beginStructure$consumer$1);
        } else if (Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            Json json = this.f71352b;
            SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
            SerialKind kind2 = carrierDescriptor.getKind();
            if (!(kind2 instanceof PrimitiveKind) && !Intrinsics.areEqual(kind2, SerialKind.ENUM.INSTANCE)) {
                if (json.getConfiguration().getAllowStructuredMapKeys()) {
                    c22142sh0 = new C22486uh0(this.f71352b, abstractJsonTreeEncoder$beginStructure$consumer$1);
                } else {
                    throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
                }
            } else {
                c22142sh0 = new C22830wh0(this.f71352b, abstractJsonTreeEncoder$beginStructure$consumer$1);
            }
        } else {
            c22142sh0 = new C22142sh0(this.f71352b, abstractJsonTreeEncoder$beginStructure$consumer$1);
        }
        String str = this.f71355e;
        if (str != null) {
            Intrinsics.checkNotNull(str);
            c22142sh0.mo744t(str, JsonElementKt.JsonPrimitive(descriptor.getSerialName()));
            this.f71355e = null;
        }
        return c22142sh0;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: c */
    public void encodeTaggedBoolean(String tag, boolean z) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(z)));
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String composeName(String parentName, String childName) {
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: d */
    public void encodeTaggedByte(String tag, byte b) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: e */
    public void encodeTaggedChar(String tag, char c) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonElementKt.JsonPrimitive(String.valueOf(c)));
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String elementName(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return JsonNamesMapKt.getJsonElementName(descriptor, this.f71352b, i);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (getCurrentTagOrNull() != null) {
            return super.encodeInline(descriptor);
        }
        return new C21110mh0(this.f71352b, this.f71353c).encodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.f71353c.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L16;
     */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void encodeSerializableValue(kotlinx.serialization.SerializationStrategy r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r0 = r3.getCurrentTagOrNull()
            if (r0 != 0) goto L2c
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getDescriptor()
            kotlinx.serialization.modules.SerializersModule r1 = r3.getSerializersModule()
            kotlinx.serialization.descriptors.SerialDescriptor r0 = kotlinx.serialization.json.internal.WriteModeKt.carrierDescriptor(r0, r1)
            boolean r0 = kotlinx.serialization.json.internal.TreeJsonEncoderKt.access$getRequiresTopLevelTag(r0)
            if (r0 != 0) goto L1e
            goto L2c
        L1e:
            mh0 r0 = new mh0
            kotlinx.serialization.json.Json r1 = r3.f71352b
            kotlin.jvm.functions.Function1 r2 = r3.f71353c
            r0.<init>(r1, r2)
            r0.encodeSerializableValue(r4, r5)
            goto Lea
        L2c:
            kotlinx.serialization.json.Json r0 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r0 = r0.getConfiguration()
            boolean r0 = r0.getUseArrayPolymorphism()
            if (r0 == 0) goto L3f
            r4.serialize(r3, r5)
            goto Lea
        L3f:
            boolean r0 = r4 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r0 == 0) goto L54
            kotlinx.serialization.json.Json r1 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.getConfiguration()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.getClassDiscriminatorMode()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L9c
            goto L89
        L54:
            kotlinx.serialization.json.Json r1 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.getConfiguration()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.getClassDiscriminatorMode()
            int[] r2 = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L9c
            r2 = 2
            if (r1 == r2) goto L9c
            r2 = 3
            if (r1 != r2) goto L96
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kotlinx.serialization.descriptors.SerialKind r1 = r1.getKind()
            kotlinx.serialization.descriptors.StructureKind$CLASS r2 = kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 != 0) goto L89
            kotlinx.serialization.descriptors.StructureKind$OBJECT r2 = kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L9c
        L89:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kotlinx.serialization.json.Json r2 = r3.getJson()
            java.lang.String r1 = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(r1, r2)
            goto L9d
        L96:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L9c:
            r1 = 0
        L9d:
            if (r0 == 0) goto Le3
            r0 = r4
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r0 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r0
            if (r5 == 0) goto Lbf
            kotlinx.serialization.SerializationStrategy r0 = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(r0, r3, r5)
            if (r1 == 0) goto Lad
            kotlinx.serialization.json.internal.PolymorphicKt.access$validateIfSealed(r4, r0, r1)
        Lad:
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.getDescriptor()
            kotlinx.serialization.descriptors.SerialKind r4 = r4.getKind()
            kotlinx.serialization.json.internal.PolymorphicKt.checkKind(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r4)
            r4 = r0
            goto Le3
        Lbf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Value for serializer "
            r5.append(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r4.getDescriptor()
            r5.append(r4)
            java.lang.String r4 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        Le3:
            if (r1 == 0) goto Le7
            r3.f71355e = r1
        Le7:
            r4.serialize(r3, r5)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.encodeSerializableValue(kotlinx.serialization.SerializationStrategy, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void endEncode(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f71353c.invoke(mo745p());
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: f */
    public void encodeTaggedDouble(String tag, double d) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonElementKt.JsonPrimitive(Double.valueOf(d)));
        if (!this.f71354d.getAllowSpecialFloatingPointValues()) {
            if (Double.isInfinite(d) || Double.isNaN(d)) {
                throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(d), tag, mo745p().toString());
            }
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: g */
    public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo744t(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(i)));
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.f71352b;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final SerializersModule getSerializersModule() {
        return this.f71352b.getSerializersModule();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: h */
    public void encodeTaggedFloat(String tag, float f) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonElementKt.JsonPrimitive(Float.valueOf(f)));
        if (!this.f71354d.getAllowSpecialFloatingPointValues()) {
            if (Float.isInfinite(f) || Float.isNaN(f)) {
                throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(f), tag, mo745p().toString());
            }
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: i */
    public Encoder encodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            return m26652s(tag);
        }
        if (StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor)) {
            return m26653r(tag, inlineDescriptor);
        }
        return super.encodeTaggedInline(tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: j */
    public void encodeTaggedInt(String tag, int i) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(i)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: k */
    public void encodeTaggedLong(String tag, long j) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonElementKt.JsonPrimitive(Long.valueOf(j)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: l */
    public void encodeTaggedNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonNull.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: m */
    public void encodeTaggedShort(String tag, short s) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        mo744t(tag, JsonElementKt.JsonPrimitive(Short.valueOf(s)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: n */
    public void encodeTaggedString(String tag, String value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        mo744t(tag, JsonElementKt.JsonPrimitive(value));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    /* renamed from: o */
    public void encodeTaggedValue(String tag, Object value) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        mo744t(tag, JsonElementKt.JsonPrimitive(value.toString()));
    }

    /* renamed from: p */
    public abstract JsonElement mo745p();

    /* renamed from: q */
    public final Function1 m26654q() {
        return this.f71353c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1] */
    /* renamed from: r */
    public final AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1 m26653r(final String str, final SerialDescriptor serialDescriptor) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1
            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeString(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AbstractJsonTreeEncoder.this.mo744t(str, new JsonLiteral(value, false, serialDescriptor));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            @NotNull
            public SerializersModule getSerializersModule() {
                return AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1] */
    /* renamed from: s */
    public final AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 m26652s(final String str) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1

            /* renamed from: a */
            public final SerializersModule f71359a;

            {
                this.f71359a = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte b) {
                putUnquotedString(UByte.m74102toStringimpl(UByte.m74098constructorimpl(b)));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int i) {
                String l;
                l = Long.toString(UInt.m74122constructorimpl(i) & BodyPartID.bodyIdMax, 10);
                putUnquotedString(l);
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long j) {
                String m65717a;
                m65717a = AbstractC1579W.m65717a(ULong.m74146constructorimpl(j), 10);
                putUnquotedString(m65717a);
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short s) {
                putUnquotedString(UShort.m74174toStringimpl(UShort.m74170constructorimpl(s)));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            @NotNull
            public SerializersModule getSerializersModule() {
                return this.f71359a;
            }

            public final void putUnquotedString(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "s");
                AbstractJsonTreeEncoder.this.mo744t(str, new JsonLiteral(s, false, null, 4, null));
            }
        };
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.f71354d.getEncodeDefaults();
    }

    /* renamed from: t */
    public abstract void mo744t(String str, JsonElement jsonElement);

    public AbstractJsonTreeEncoder(Json json, Function1 function1) {
        this.f71352b = json;
        this.f71353c = function1;
        this.f71354d = json.getConfiguration();
    }
}
