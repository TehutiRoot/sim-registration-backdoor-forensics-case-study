package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class MemberDeserializer$loadProperty$5 extends Lambda implements Function0<NullableLazyValue<? extends ConstantValue<?>>> {
    final /* synthetic */ DeserializedPropertyDescriptor $property;
    final /* synthetic */ ProtoBuf.Property $proto;
    final /* synthetic */ MemberDeserializer this$0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$5$1 */
    /* loaded from: classes6.dex */
    public static final class C119331 extends Lambda implements Function0<ConstantValue<?>> {
        final /* synthetic */ DeserializedPropertyDescriptor $property;
        final /* synthetic */ ProtoBuf.Property $proto;
        final /* synthetic */ MemberDeserializer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119331(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
            super(0);
            this.this$0 = memberDeserializer;
            this.$proto = property;
            this.$property = deserializedPropertyDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final ConstantValue<?> invoke() {
            DeserializationContext deserializationContext;
            ProtoContainer m28010a;
            DeserializationContext deserializationContext2;
            MemberDeserializer memberDeserializer = this.this$0;
            deserializationContext = memberDeserializer.f70094a;
            m28010a = memberDeserializer.m28010a(deserializationContext.getContainingDeclaration());
            Intrinsics.checkNotNull(m28010a);
            deserializationContext2 = this.this$0.f70094a;
            AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext2.getComponents().getAnnotationAndConstantLoader();
            ProtoBuf.Property property = this.$proto;
            KotlinType returnType = this.$property.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "property.returnType");
            return annotationAndConstantLoader.loadAnnotationDefaultValue(m28010a, property, returnType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$loadProperty$5(MemberDeserializer memberDeserializer, ProtoBuf.Property property, DeserializedPropertyDescriptor deserializedPropertyDescriptor) {
        super(0);
        this.this$0 = memberDeserializer;
        this.$proto = property;
        this.$property = deserializedPropertyDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
        DeserializationContext deserializationContext;
        deserializationContext = this.this$0.f70094a;
        return deserializationContext.getStorageManager().createNullableLazyValue(new C119331(this.this$0, this.$proto, this.$property));
    }
}