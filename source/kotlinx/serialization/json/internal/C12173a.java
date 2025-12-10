package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;

/* renamed from: kotlinx.serialization.json.internal.a */
/* loaded from: classes6.dex */
public final class C12173a implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final Json f71428a;

    /* renamed from: b */
    public final ReaderJsonLexer f71429b;

    /* renamed from: c */
    public final DeserializationStrategy f71430c;

    /* renamed from: d */
    public boolean f71431d;

    /* renamed from: e */
    public boolean f71432e;

    public C12173a(Json json, ReaderJsonLexer lexer, DeserializationStrategy deserializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f71428a = json;
        this.f71429b = lexer;
        this.f71430c = deserializer;
        this.f71431d = true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f71432e) {
            return false;
        }
        if (this.f71429b.peekNextToken() == 9) {
            this.f71432e = true;
            this.f71429b.consumeNextToken((byte) 9);
            if (this.f71429b.isNotEof()) {
                if (this.f71429b.peekNextToken() != 8) {
                    this.f71429b.expectEof();
                } else {
                    AbstractJsonLexer.fail$default(this.f71429b, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return false;
        } else if (this.f71429b.isNotEof() || this.f71432e) {
            return true;
        } else {
            AbstractJsonLexer.fail$kotlinx_serialization_json$default(this.f71429b, (byte) 9, false, 2, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f71431d) {
            this.f71431d = false;
        } else {
            this.f71429b.consumeNextToken(',');
        }
        return new StreamingJsonDecoder(this.f71428a, WriteMode.OBJ, this.f71429b, this.f71430c.getDescriptor(), null).decodeSerializableValue(this.f71430c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
