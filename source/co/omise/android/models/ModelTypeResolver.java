package co.omise.android.models;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J0\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004H\u0002J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28850d2 = {"Lco/omise/android/models/ModelTypeResolver;", "Lcom/fasterxml/jackson/databind/jsontype/impl/TypeIdResolverBase;", "()V", "types", "", "", "Ljava/lang/Class;", "getKnownTypes", "getMechanism", "Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;", "idFromValue", "value", "", "idFromValueAndType", "suggestedType", "reverse", "map", "typeFromId", "Lcom/fasterxml/jackson/databind/JavaType;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/fasterxml/jackson/databind/DatabindContext;", "id", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class ModelTypeResolver extends TypeIdResolverBase {
    @Nullable
    private Map<String, ? extends Class<?>> types;

    private final Map<Class<?>, String> reverse(Map<String, ? extends Class<?>> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Class<?>> entry : map.entrySet()) {
            hashMap.put(entry.getValue(), entry.getKey());
        }
        return hashMap;
    }

    @NotNull
    public final Map<String, Class<?>> getKnownTypes() {
        if (this.types == null) {
            HashMap hashMap = new HashMap();
            this.types = hashMap;
            Intrinsics.checkNotNull(hashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            hashMap.put("card", Card.class);
            Map<String, ? extends Class<?>> map = this.types;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            ((HashMap) map).put("token", Token.class);
            Map<String, ? extends Class<?>> map2 = this.types;
            Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            ((HashMap) map2).put("capability", Capability.class);
            Map<String, ? extends Class<?>> map3 = this.types;
            Intrinsics.checkNotNull(map3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            ((HashMap) map3).put("payment_method", PaymentMethod.class);
            Map<String, ? extends Class<?>> map4 = this.types;
            Intrinsics.checkNotNull(map4, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            ((HashMap) map4).put("source", Source.class);
            Map<String, ? extends Class<?>> map5 = this.types;
            Intrinsics.checkNotNull(map5, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            ((HashMap) map5).put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, APIError.class);
            Map<String, ? extends Class<?>> map6 = this.types;
            Intrinsics.checkNotNull(map6, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            ((HashMap) map6).put(OptionalModuleUtils.BARCODE, Barcode.class);
            Map<String, ? extends Class<?>> map7 = this.types;
            Intrinsics.checkNotNull(map7, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            ((HashMap) map7).put("document", Document.class);
            Map<String, ? extends Class<?>> map8 = this.types;
            Intrinsics.checkNotNull(map8, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, java.lang.Class<*>>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, java.lang.Class<*>> }");
            ((HashMap) map8).put("authentication", Authentication.class);
        }
        Map<String, ? extends Class<?>> map9 = this.types;
        Intrinsics.checkNotNull(map9, "null cannot be cast to non-null type kotlin.collections.MutableMap<out kotlin.String, out java.lang.Class<*>>");
        Map<String, Class<?>> unmodifiableMap = Collections.unmodifiableMap(TypeIntrinsics.asMutableMap(map9));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(types as…ut String, out Class<*>>)");
        return unmodifiableMap;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    @NotNull
    public JsonTypeInfo.EnumC6075Id getMechanism() {
        return JsonTypeInfo.EnumC6075Id.CUSTOM;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    @NotNull
    public String idFromValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return idFromValueAndType(value, value.getClass());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    @NotNull
    public String idFromValueAndType(@NotNull Object value, @NotNull Class<?> suggestedType) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(suggestedType, "suggestedType");
        String str = reverse(getKnownTypes()).get(suggestedType);
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    @Nullable
    public JavaType typeFromId(@NotNull DatabindContext context, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id2, "id");
        Class<?> cls = getKnownTypes().get(id2);
        if (cls == null) {
            return null;
        }
        return context.getTypeFactory().constructSimpleType(cls, new JavaType[0]);
    }
}
