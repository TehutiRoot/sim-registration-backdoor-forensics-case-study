package p000;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* renamed from: th0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22314th0 extends AbstractC1282S {

    /* renamed from: f */
    public final JsonArray f107154f;

    /* renamed from: g */
    public final int f107155g;

    /* renamed from: h */
    public int f107156h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22314th0(Json json, JsonArray value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f107154f = value;
        this.f107155g = mo1014s().size();
        this.f107156h = -1;
    }

    @Override // p000.AbstractC1282S
    /* renamed from: c */
    public JsonElement mo1015c(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return mo1014s().get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f107156h;
        if (i < this.f107155g - 1) {
            int i2 = i + 1;
            this.f107156h = i2;
            return i2;
        }
        return -1;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // p000.AbstractC1282S
    /* renamed from: u */
    public JsonArray mo1014s() {
        return this.f107154f;
    }
}
