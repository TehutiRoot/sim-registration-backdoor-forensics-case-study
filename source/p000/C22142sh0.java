package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;

/* renamed from: sh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C22142sh0 extends AbstractJsonTreeEncoder {

    /* renamed from: f */
    public final Map f79858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22142sh0(Json json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f79858f = new LinkedHashMap();
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void encodeNullableSerializableElement(SerialDescriptor descriptor, int i, SerializationStrategy serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (obj != null || this.f71354d.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, i, serializer, obj);
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: p */
    public JsonElement mo745p() {
        return new JsonObject(this.f79858f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: t */
    public void mo744t(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f79858f.put(key, element);
    }

    /* renamed from: u */
    public final Map m22560u() {
        return this.f79858f;
    }
}
