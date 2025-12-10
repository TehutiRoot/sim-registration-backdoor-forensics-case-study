package kotlinx.serialization.json.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JX\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2/\u0010\u0012\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u001b\u001a\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b\"\b\b\u0001\u0010\u0017*\u00028\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJR\u0010 \u001a\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n2)\u0010\u001f\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001d\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e0\fH\u0016¢\u0006\u0004\b \u0010\u0015JT\u0010$\u001a\u00020\u0013\"\b\b\u0000\u0010\u0016*\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n2+\u0010#\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(!\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"0\fH\u0016¢\u0006\u0004\b$\u0010\u0015J#\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010+¨\u0006,"}, m29142d2 = {"Lkotlinx/serialization/json/internal/PolymorphismValidator;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "useArrayPolymorphism", "", "discriminator", "<init>", "(ZLjava/lang/String;)V", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "value", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KClass;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "Ljava/lang/String;", "kotlinx-serialization-json"}, m29141k = 1, m29140mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class PolymorphismValidator implements SerializersModuleCollector {

    /* renamed from: a */
    public final boolean f71437a;

    /* renamed from: b */
    public final String f71438b;

    public PolymorphismValidator(boolean z, @NotNull String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.f71437a = z;
        this.f71438b = discriminator;
    }

    /* renamed from: a */
    public final void m26911a(SerialDescriptor serialDescriptor, KClass kClass) {
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            String elementName = serialDescriptor.getElementName(i);
            if (Intrinsics.areEqual(elementName, this.f71438b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + elementName + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* renamed from: b */
    public final void m26910b(SerialDescriptor serialDescriptor, KClass kClass) {
        SerialKind kind = serialDescriptor.getKind();
        if (!(kind instanceof PolymorphicKind) && !Intrinsics.areEqual(kind, SerialKind.CONTEXTUAL.INSTANCE)) {
            if (this.f71437a) {
                return;
            }
            if (!Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE) && !Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE) && !(kind instanceof PrimitiveKind) && !(kind instanceof SerialKind.ENUM)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        m26910b(descriptor, actualClass);
        if (!this.f71437a) {
            m26911a(descriptor, actualClass);
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public <Base> void polymorphicDefault(@NotNull KClass<Base> kClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function1) {
        SerializersModuleCollector.DefaultImpls.polymorphicDefault(this, kClass, function1);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultDeserializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(@NotNull KClass<T> kClass, @NotNull KSerializer<T> kSerializer) {
        SerializersModuleCollector.DefaultImpls.contextual(this, kClass, kSerializer);
    }
}