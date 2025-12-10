package p000;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

/* renamed from: sh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22207sh0 extends AbstractJsonTreeEncoder {

    /* renamed from: f */
    public JsonElement f79955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22207sh0(Json json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        pushTag(TreeJsonEncoderKt.PRIMITIVE_TAG);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: p */
    public JsonElement mo267p() {
        JsonElement jsonElement = this.f79955f;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: t */
    public void mo266t(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (key == TreeJsonEncoderKt.PRIMITIVE_TAG) {
            if (this.f79955f == null) {
                this.f79955f = element;
                m26946q().invoke(element);
                return;
            }
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
    }
}