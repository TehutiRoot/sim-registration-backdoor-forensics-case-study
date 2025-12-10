package kotlinx.serialization.modules;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001B)\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\n\u001a\u00020\f\"\b\b\u0001\u0010\t*\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\n\u0010\bJ:\u0010\u0014\u001a\u00020\f2+\u0010\u0013\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00120\r¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u0017\u001a\u00020\f2+\u0010\u0016\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00120\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR6\u0010$\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00050!0 8\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R,\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%\u0018\u00010\r8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b&\u0010'R.\u0010\u0013\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\u0018\u00010\r8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, m28850d2 = {"Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "", "Base", "Lkotlin/reflect/KClass;", "baseClass", "Lkotlinx/serialization/KSerializer;", "baseSerializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "T", "subclass", "serializer", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "defaultDeserializer", "(Lkotlin/jvm/functions/Function1;)V", "defaultSerializerProvider", "default", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "builder", "buildTo", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/reflect/KClass;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/serialization/KSerializer;", "", "Lkotlin/Pair;", OperatorName.CURVE_TO, "Ljava/util/List;", "subclasses", "Lkotlinx/serialization/SerializationStrategy;", "d", "Lkotlin/jvm/functions/Function1;", "e", "kotlinx-serialization-core"}, m28849k = 1, m28848mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPolymorphicModuleBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,119:1\n1855#2:120\n1856#2:122\n79#3:121\n*S KotlinDebug\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n*L\n88#1:120\n88#1:122\n92#1:121\n*E\n"})
/* loaded from: classes6.dex */
public final class PolymorphicModuleBuilder<Base> {

    /* renamed from: a */
    public final KClass f71443a;

    /* renamed from: b */
    public final KSerializer f71444b;

    /* renamed from: c */
    public final List f71445c;

    /* renamed from: d */
    public Function1 f71446d;

    /* renamed from: e */
    public Function1 f71447e;

    @PublishedApi
    public PolymorphicModuleBuilder(@NotNull KClass<Base> baseClass, @Nullable KSerializer<Base> kSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f71443a = baseClass;
        this.f71444b = kSerializer;
        this.f71445c = new ArrayList();
    }

    @PublishedApi
    public final void buildTo(@NotNull SerializersModuleBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        KSerializer kSerializer = this.f71444b;
        if (kSerializer != null) {
            KClass kClass = this.f71443a;
            SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, kClass, kClass, kSerializer, false, 8, null);
        }
        for (Pair pair : this.f71445c) {
            KClass kClass2 = (KClass) pair.component1();
            KSerializer kSerializer2 = (KSerializer) pair.component2();
            KClass kClass3 = this.f71443a;
            Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder.buildTo$lambda$1>");
            Intrinsics.checkNotNull(kSerializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, kClass3, kClass2, kSerializer2, false, 8, null);
        }
        Function1<? super Base, ? extends SerializationStrategy<? super Base>> function1 = this.f71446d;
        if (function1 != null) {
            builder.registerDefaultPolymorphicSerializer(this.f71443a, function1, false);
        }
        Function1<? super String, ? extends DeserializationStrategy<? extends Base>> function12 = this.f71447e;
        if (function12 != null) {
            builder.registerDefaultPolymorphicDeserializer(this.f71443a, function12, false);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: defaultDeserializer", replaceWith = @ReplaceWith(expression = "defaultDeserializer(defaultSerializerProvider)", imports = {}))
    /* renamed from: default  reason: not valid java name */
    public final void m74760default(@NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        defaultDeserializer(defaultSerializerProvider);
    }

    public final void defaultDeserializer(@NotNull Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        if (this.f71447e == null) {
            this.f71447e = defaultDeserializerProvider;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.f71443a + ": " + this.f71447e).toString());
    }

    public final <T extends Base> void subclass(@NotNull KClass<T> subclass, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(subclass, "subclass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f71445c.add(TuplesKt.m28844to(subclass, serializer));
    }

    public /* synthetic */ PolymorphicModuleBuilder(KClass kClass, KSerializer kSerializer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, (i & 2) != 0 ? null : kSerializer);
    }
}
