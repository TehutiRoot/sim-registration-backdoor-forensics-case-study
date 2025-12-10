package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;

/* renamed from: kotlinx.serialization.json.internal.b */
/* loaded from: classes6.dex */
public final class C12174b implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final Json f71433a;

    /* renamed from: b */
    public final ReaderJsonLexer f71434b;

    /* renamed from: c */
    public final DeserializationStrategy f71435c;

    public C12174b(Json json, ReaderJsonLexer lexer, DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f71433a = json;
        this.f71434b = lexer;
        this.f71435c = deserializer;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71434b.isNotEof();
    }

    @Override // java.util.Iterator
    public Object next() {
        return new StreamingJsonDecoder(this.f71433a, WriteMode.OBJ, this.f71434b, this.f71435c.getDescriptor(), null).decodeSerializableValue(this.f71435c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
