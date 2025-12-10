package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class JsonElementSerializer$descriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    public static final JsonElementSerializer$descriptor$1 INSTANCE = new JsonElementSerializer$descriptor$1();

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$1 */
    /* loaded from: classes6.dex */
    public static final class C121651 extends Lambda implements Function0<SerialDescriptor> {
        public static final C121651 INSTANCE = new C121651();

        public C121651() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SerialDescriptor invoke() {
            return JsonPrimitiveSerializer.INSTANCE.getDescriptor();
        }
    }

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$2 */
    /* loaded from: classes6.dex */
    public static final class C121662 extends Lambda implements Function0<SerialDescriptor> {
        public static final C121662 INSTANCE = new C121662();

        public C121662() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SerialDescriptor invoke() {
            return JsonNullSerializer.INSTANCE.getDescriptor();
        }
    }

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$3 */
    /* loaded from: classes6.dex */
    public static final class C121673 extends Lambda implements Function0<SerialDescriptor> {
        public static final C121673 INSTANCE = new C121673();

        public C121673() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SerialDescriptor invoke() {
            return C20422ih0.f62868a.getDescriptor();
        }
    }

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$4 */
    /* loaded from: classes6.dex */
    public static final class C121684 extends Lambda implements Function0<SerialDescriptor> {
        public static final C121684 INSTANCE = new C121684();

        public C121684() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SerialDescriptor invoke() {
            return JsonObjectSerializer.INSTANCE.getDescriptor();
        }
    }

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "invoke"}, m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonElementSerializer$descriptor$1$5 */
    /* loaded from: classes6.dex */
    public static final class C121695 extends Lambda implements Function0<SerialDescriptor> {
        public static final C121695 INSTANCE = new C121695();

        public C121695() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SerialDescriptor invoke() {
            return JsonArraySerializer.INSTANCE.getDescriptor();
        }
    }

    public JsonElementSerializer$descriptor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        invoke2(classSerialDescriptorBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ClassSerialDescriptorBuilder buildSerialDescriptor) {
        SerialDescriptor m26686a;
        SerialDescriptor m26686a2;
        SerialDescriptor m26686a3;
        SerialDescriptor m26686a4;
        SerialDescriptor m26686a5;
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        m26686a = JsonElementSerializersKt.m26686a(C121651.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonPrimitive", m26686a, null, false, 12, null);
        m26686a2 = JsonElementSerializersKt.m26686a(C121662.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonNull", m26686a2, null, false, 12, null);
        m26686a3 = JsonElementSerializersKt.m26686a(C121673.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonLiteral", m26686a3, null, false, 12, null);
        m26686a4 = JsonElementSerializersKt.m26686a(C121684.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonObject", m26686a4, null, false, 12, null);
        m26686a5 = JsonElementSerializersKt.m26686a(C121695.INSTANCE);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "JsonArray", m26686a5, null, false, 12, null);
    }
}
