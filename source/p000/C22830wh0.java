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

/* renamed from: wh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22830wh0 extends C22142sh0 {

    /* renamed from: g */
    public String f108097g;

    /* renamed from: h */
    public boolean f108098h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22830wh0(Json json, Function1 nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f108098h = true;
    }

    @Override // p000.C22142sh0, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: p */
    public JsonElement mo745p() {
        return new JsonObject(m22560u());
    }

    @Override // p000.C22142sh0, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: t */
    public void mo744t(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.f108098h) {
            if (element instanceof JsonPrimitive) {
                this.f108097g = ((JsonPrimitive) element).getContent();
                this.f108098h = false;
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
        Map m22560u = m22560u();
        String str = this.f108097g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tag");
            str = null;
        }
        m22560u.put(str, element);
        this.f108098h = true;
    }
}
