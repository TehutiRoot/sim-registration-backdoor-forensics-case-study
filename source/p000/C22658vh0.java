package p000;

import java.util.List;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.C12175c;

/* renamed from: vh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C22658vh0 extends C12175c {

    /* renamed from: k */
    public final JsonObject f107751k;

    /* renamed from: l */
    public final List f107752l;

    /* renamed from: m */
    public final int f107753m;

    /* renamed from: n */
    public int f107754n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22658vh0(Json json, JsonObject value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f107751k = value;
        List list = CollectionsKt___CollectionsKt.toList(mo1014s().keySet());
        this.f107752l = list;
        this.f107753m = list.size() * 2;
        this.f107754n = -1;
    }

    @Override // kotlinx.serialization.json.internal.C12175c, p000.AbstractC1282S
    /* renamed from: c */
    public JsonElement mo1015c(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.f107754n % 2 == 0) {
            return JsonElementKt.JsonPrimitive(tag);
        }
        return (JsonElement) AbstractC11687a.getValue(mo1014s(), tag);
    }

    @Override // kotlinx.serialization.json.internal.C12175c, kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f107754n;
        if (i < this.f107753m - 1) {
            int i2 = i + 1;
            this.f107754n = i2;
            return i2;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.C12175c, kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f107752l.get(i / 2);
    }

    @Override // kotlinx.serialization.json.internal.C12175c, p000.AbstractC1282S, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.C12175c, p000.AbstractC1282S
    /* renamed from: w */
    public JsonObject mo1014s() {
        return this.f107751k;
    }
}
