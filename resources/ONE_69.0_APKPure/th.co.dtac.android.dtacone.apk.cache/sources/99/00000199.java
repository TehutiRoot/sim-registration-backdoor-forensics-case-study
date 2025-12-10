package p000;

import java.util.List;
import kotlin.collections.AbstractC11663a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.C12151c;

/* renamed from: Bh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C17370Bh0 extends C12151c {

    /* renamed from: k */
    public final JsonObject f465k;

    /* renamed from: l */
    public final List f466l;

    /* renamed from: m */
    public final int f467m;

    /* renamed from: n */
    public int f468n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17370Bh0(Json json, JsonObject value) {
        super(json, value, null, null, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f465k = value;
        List list = CollectionsKt___CollectionsKt.toList(mo80s().keySet());
        this.f466l = list;
        this.f467m = list.size() * 2;
        this.f468n = -1;
    }

    @Override // kotlinx.serialization.json.internal.C12151c, p000.AbstractC1263S
    /* renamed from: c */
    public JsonElement mo81c(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.f468n % 2 == 0) {
            return JsonElementKt.JsonPrimitive(tag);
        }
        return (JsonElement) AbstractC11663a.getValue(mo80s(), tag);
    }

    @Override // kotlinx.serialization.json.internal.C12151c, kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f468n;
        if (i < this.f467m - 1) {
            int i2 = i + 1;
            this.f468n = i2;
            return i2;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.C12151c, kotlinx.serialization.internal.NamedValueDecoder
    public String elementName(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f466l.get(i / 2);
    }

    @Override // kotlinx.serialization.json.internal.C12151c, p000.AbstractC1263S, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.C12151c, p000.AbstractC1263S
    /* renamed from: w */
    public JsonObject mo80s() {
        return this.f465k;
    }
}