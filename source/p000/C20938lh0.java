package p000;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;

/* renamed from: lh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20938lh0 extends AbstractC1282S {

    /* renamed from: f */
    public final JsonElement f71684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20938lh0(Json json, JsonElement value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f71684f = value;
        pushTag(TreeJsonEncoderKt.PRIMITIVE_TAG);
    }

    @Override // p000.AbstractC1282S
    /* renamed from: c */
    public JsonElement mo1015c(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == TreeJsonEncoderKt.PRIMITIVE_TAG) {
            return mo1014s();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // p000.AbstractC1282S
    /* renamed from: s */
    public JsonElement mo1014s() {
        return this.f71684f;
    }
}
