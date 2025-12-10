package kotlinx.serialization.modules;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;
import kotlinx.serialization.modules.SerializersModuleCollector;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJX\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062/\u0010\u0012\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\rH\u0016¢\u0006\u0004\b\u000b\u0010\u0013JM\u0010\u0019\u001a\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u0004\"\b\b\u0001\u0010\u0015*\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010\u001e\u001a\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062)\u0010\u001d\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001b\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c0\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0013JT\u0010#\u001a\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062+\u0010\"\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b( \u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!0\rH\u0016¢\u0006\u0004\b#\u0010\u0013J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J9\u0010,\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0012\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b,\u0010-JZ\u0010.\u001a\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062)\u0010\u001d\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001b\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c0\r2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b.\u0010/J\\\u00100\u001a\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062+\u0010\"\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b( \u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!0\r2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b0\u0010/JW\u00103\u001a\u00020\n\"\b\b\u0000\u0010\u0014*\u00020\u0004\"\b\b\u0001\u0010\u0015*\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\b\b\u0002\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020$H\u0001¢\u0006\u0004\b5\u00106R$\u0010:\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020)078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R8\u0010<\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b07078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R<\u0010?\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u001c0\rj\u0006\u0012\u0002\b\u0003`=078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109R4\u0010A\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b07078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00109RO\u0010D\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b( \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010!0\rj\u0006\u0012\u0002\b\u0003`B078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00109¨\u0006E"}, m28850d2 = {"Lkotlinx/serialization/modules/SerializersModuleBuilder;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "<init>", "()V", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "value", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "Lkotlinx/serialization/modules/SerializersModule;", "module", "include", "(Lkotlinx/serialization/modules/SerializersModule;)V", "forClass", "Lkotlinx/serialization/modules/ContextualProvider;", "", "allowOverwrite", "registerSerializer", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/modules/ContextualProvider;Z)V", "registerDefaultPolymorphicSerializer", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Z)V", "registerDefaultPolymorphicDeserializer", "concreteClass", "concreteSerializer", "registerPolymorphicSerializer", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;Z)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Lkotlinx/serialization/modules/SerializersModule;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Map;", "class2ContextualProvider", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "polyBase2Serializers", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", OperatorName.CURVE_TO, "polyBase2DefaultSerializerProvider", "d", "polyBase2NamedSerializers", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "e", "polyBase2DefaultDeserializerProvider", "kotlinx-serialization-core"}, m28849k = 1, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n372#2,7:271\n372#2,7:278\n1#3:285\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n*L\n195#1:271,7\n197#1:278,7\n*E\n"})
/* loaded from: classes6.dex */
public final class SerializersModuleBuilder implements SerializersModuleCollector {

    /* renamed from: a */
    public final Map f71452a = new HashMap();

    /* renamed from: b */
    public final Map f71453b = new HashMap();

    /* renamed from: c */
    public final Map f71454c = new HashMap();

    /* renamed from: d */
    public final Map f71455d = new HashMap();

    /* renamed from: e */
    public final Map f71456e = new HashMap();

    public static /* synthetic */ void registerPolymorphicSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, KClass kClass2, KSerializer kSerializer, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        serializersModuleBuilder.registerPolymorphicSerializer(kClass, kClass2, kSerializer, z);
    }

    public static /* synthetic */ void registerSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, ContextualProvider contextualProvider, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        serializersModuleBuilder.registerSerializer(kClass, contextualProvider, z);
    }

    @PublishedApi
    @NotNull
    public final SerializersModule build() {
        return new SerialModuleImpl(this.f71452a, this.f71453b, this.f71454c, this.f71455d, this.f71456e);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(@NotNull KClass<T> kClass, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        registerSerializer$default(this, kClass, new ContextualProvider.Argless(serializer), false, 4, null);
    }

    public final void include(@NotNull SerializersModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        module.dumpTo(this);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull KSerializer<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, null);
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
        registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false);
    }

    @JvmName(name = "registerDefaultPolymorphicDeserializer")
    public final <Base> void registerDefaultPolymorphicDeserializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider, boolean z) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1 function1 = (Function1) this.f71456e.get(baseClass);
        if (function1 != null && !Intrinsics.areEqual(function1, defaultDeserializerProvider) && !z) {
            throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.f71456e.put(baseClass, defaultDeserializerProvider);
    }

    @JvmName(name = "registerDefaultPolymorphicSerializer")
    public final <Base> void registerDefaultPolymorphicSerializer(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider, boolean z) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Function1 function1 = (Function1) this.f71454c.get(baseClass);
        if (function1 != null && !Intrinsics.areEqual(function1, defaultSerializerProvider) && !z) {
            throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.f71454c.put(baseClass, defaultSerializerProvider);
    }

    @JvmName(name = "registerPolymorphicSerializer")
    public final <Base, Sub extends Base> void registerPolymorphicSerializer(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> concreteClass, @NotNull KSerializer<Sub> concreteSerializer, boolean z) {
        Object obj;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String serialName = concreteSerializer.getDescriptor().getSerialName();
        Map map = this.f71453b;
        Object obj2 = map.get(baseClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            map.put(baseClass, obj2);
        }
        Map map2 = (Map) obj2;
        KSerializer kSerializer = (KSerializer) map2.get(concreteClass);
        Map map3 = this.f71455d;
        Object obj3 = map3.get(baseClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            map3.put(baseClass, obj3);
        }
        Map map4 = (Map) obj3;
        if (z) {
            if (kSerializer != null) {
                map4.remove(kSerializer.getDescriptor().getSerialName());
            }
            map2.put(concreteClass, concreteSerializer);
            map4.put(serialName, concreteSerializer);
            return;
        }
        if (kSerializer != null) {
            if (Intrinsics.areEqual(kSerializer, concreteSerializer)) {
                map4.remove(kSerializer.getDescriptor().getSerialName());
            } else {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
        }
        KSerializer kSerializer2 = (KSerializer) map4.get(serialName);
        if (kSerializer2 != null) {
            Object obj4 = this.f71453b.get(baseClass);
            Intrinsics.checkNotNull(obj4);
            Iterator it = AbstractC18643Vn0.asSequence((Map) obj4).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == kSerializer2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + serialName + "': '" + concreteClass + "' and '" + ((Map.Entry) obj) + CoreConstants.SINGLE_QUOTE_CHAR);
        }
        map2.put(concreteClass, concreteSerializer);
        map4.put(serialName, concreteSerializer);
    }

    @JvmName(name = "registerSerializer")
    public final <T> void registerSerializer(@NotNull KClass<T> forClass, @NotNull ContextualProvider provider, boolean z) {
        ContextualProvider contextualProvider;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (!z && (contextualProvider = (ContextualProvider) this.f71452a.get(forClass)) != null && !Intrinsics.areEqual(contextualProvider, provider)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        this.f71452a.put(forClass, provider);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        registerSerializer$default(this, kClass, new ContextualProvider.WithTypeArguments(provider), false, 4, null);
    }
}
