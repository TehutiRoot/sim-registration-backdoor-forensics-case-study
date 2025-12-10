package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {

    /* renamed from: a */
    public final JsonReader f56706a;

    /* renamed from: b */
    public final Object f56707b;

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z;
        synchronized (this.f56707b) {
            try {
                try {
                    try {
                        if (this.f56706a.peek() != JsonToken.END_DOCUMENT) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (MalformedJsonException e) {
                        throw new JsonSyntaxException(e);
                    }
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.f56706a = jsonReader;
        jsonReader.setStrictness(Strictness.LENIENT);
        this.f56707b = new Object();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() throws JsonParseException {
        if (hasNext()) {
            try {
                return Streams.parse(this.f56706a);
            } catch (OutOfMemoryError e) {
                throw new JsonParseException("Failed parsing JSON source to Json", e);
            } catch (StackOverflowError e2) {
                throw new JsonParseException("Failed parsing JSON source to Json", e2);
            }
        }
        throw new NoSuchElementException();
    }
}