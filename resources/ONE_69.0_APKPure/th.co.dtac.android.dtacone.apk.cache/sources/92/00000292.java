package p000;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

/* renamed from: Ch0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17435Ch0 extends C23245yh0 {

    /* renamed from: g */
    public String f815g;

    /* renamed from: h */
    public boolean f816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17435Ch0(Json json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f816h = true;
    }

    @Override // p000.C23245yh0, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: p */
    public JsonElement mo267p() {
        return new JsonObject(m265u());
    }

    @Override // p000.C23245yh0, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: t */
    public void mo266t(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f816h) {
            if (element instanceof JsonPrimitive) {
                this.f815g = ((JsonPrimitive) element).getContent();
                this.f816h = false;
                return;
            } else if (!(element instanceof JsonObject)) {
                if (element instanceof JsonArray) {
                    throw JsonExceptionsKt.InvalidKeyKindException(JsonArraySerializer.INSTANCE.getDescriptor());
                }
                throw new NoWhenBranchMatchedException();
            } else {
                throw JsonExceptionsKt.InvalidKeyKindException(JsonObjectSerializer.INSTANCE.getDescriptor());
            }
        }
        Map m265u = m265u();
        String str = this.f815g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tag");
            str = null;
        }
        m265u.put(str, element);
        this.f816h = true;
    }
}