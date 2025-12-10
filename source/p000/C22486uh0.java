package p000;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.AbstractJsonTreeEncoder;

/* renamed from: uh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22486uh0 extends AbstractJsonTreeEncoder {

    /* renamed from: f */
    public final ArrayList f107434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22486uh0(Json json, Function1 nodeConsumer) {
        super(json, nodeConsumer, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.f107434f = new ArrayList();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder, kotlinx.serialization.internal.NamedValueEncoder
    public String elementName(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: p */
    public JsonElement mo745p() {
        return new JsonArray(this.f107434f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    /* renamed from: t */
    public void mo744t(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f107434f.add(Integer.parseInt(key), element);
    }
}
