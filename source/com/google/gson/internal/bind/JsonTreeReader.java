package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class JsonTreeReader extends JsonReader {

    /* renamed from: t */
    public static final Reader f56761t = new C8737a();

    /* renamed from: u */
    public static final Object f56762u = new Object();

    /* renamed from: p */
    public Object[] f56763p;

    /* renamed from: q */
    public int f56764q;

    /* renamed from: r */
    public String[] f56765r;

    /* renamed from: s */
    public int[] f56766s;

    /* renamed from: com.google.gson.internal.bind.JsonTreeReader$a */
    /* loaded from: classes4.dex */
    public class C8737a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.gson.internal.bind.JsonTreeReader$b */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8738b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56767a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f56767a = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56767a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56767a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56767a[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(f56761t);
        this.f56763p = new Object[32];
        this.f56764q = 0;
        this.f56765r = new String[32];
        this.f56766s = new int[32];
        m37522F(jsonElement);
    }

    /* renamed from: m */
    private String m37520m() {
        return " at path " + getPath();
    }

    /* renamed from: A */
    public final void m37527A(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + m37520m());
    }

    /* renamed from: B */
    public JsonElement m37526B() {
        JsonToken peek = peek();
        if (peek != JsonToken.NAME && peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT && peek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) m37524D();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
    }

    /* renamed from: C */
    public final String m37525C(boolean z) {
        String str;
        m37527A(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m37524D()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.f56765r;
        int i = this.f56764q - 1;
        if (z) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i] = str;
        m37522F(entry.getValue());
        return str2;
    }

    /* renamed from: D */
    public final Object m37524D() {
        return this.f56763p[this.f56764q - 1];
    }

    /* renamed from: E */
    public final Object m37523E() {
        Object[] objArr = this.f56763p;
        int i = this.f56764q - 1;
        this.f56764q = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: F */
    public final void m37522F(Object obj) {
        int i = this.f56764q;
        Object[] objArr = this.f56763p;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f56763p = Arrays.copyOf(objArr, i2);
            this.f56766s = Arrays.copyOf(this.f56766s, i2);
            this.f56765r = (String[]) Arrays.copyOf(this.f56765r, i2);
        }
        Object[] objArr2 = this.f56763p;
        int i3 = this.f56764q;
        this.f56764q = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        m37527A(JsonToken.BEGIN_ARRAY);
        m37522F(((JsonArray) m37524D()).iterator());
        this.f56766s[this.f56764q - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        m37527A(JsonToken.BEGIN_OBJECT);
        m37522F(((JsonObject) m37524D()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56763p = new Object[]{f56762u};
        this.f56764q = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        m37527A(JsonToken.END_ARRAY);
        m37523E();
        m37523E();
        int i = this.f56764q;
        if (i > 0) {
            int[] iArr = this.f56766s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        m37527A(JsonToken.END_OBJECT);
        this.f56765r[this.f56764q - 1] = null;
        m37523E();
        m37523E();
        int i = this.f56764q;
        if (i > 0) {
            int[] iArr = this.f56766s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return m37521k(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return m37521k(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.END_OBJECT && peek != JsonToken.END_ARRAY && peek != JsonToken.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final String m37521k(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f56764q;
            if (i < i2) {
                Object[] objArr = this.f56763p;
                Object obj = objArr[i];
                if (obj instanceof JsonArray) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.f56766s[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                        sb.append(i3);
                        sb.append(AbstractJsonLexerKt.END_LIST);
                    }
                } else if ((obj instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.f56765r[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        m37527A(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) m37523E()).getAsBoolean();
        int i = this.f56764q;
        if (i > 0) {
            int[] iArr = this.f56766s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + m37520m());
        }
        double asDouble = ((JsonPrimitive) m37524D()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
        }
        m37523E();
        int i = this.f56764q;
        if (i > 0) {
            int[] iArr = this.f56766s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + m37520m());
        }
        int asInt = ((JsonPrimitive) m37524D()).getAsInt();
        m37523E();
        int i = this.f56764q;
        if (i > 0) {
            int[] iArr = this.f56766s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + m37520m());
        }
        long asLong = ((JsonPrimitive) m37524D()).getAsLong();
        m37523E();
        int i = this.f56764q;
        if (i > 0) {
            int[] iArr = this.f56766s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return m37525C(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        m37527A(JsonToken.NULL);
        m37523E();
        int i = this.f56764q;
        if (i > 0) {
            int[] iArr = this.f56766s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + m37520m());
        }
        String asString = ((JsonPrimitive) m37523E()).getAsString();
        int i = this.f56764q;
        if (i > 0) {
            int[] iArr = this.f56766s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f56764q == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object m37524D = m37524D();
        if (m37524D instanceof Iterator) {
            boolean z = this.f56763p[this.f56764q - 2] instanceof JsonObject;
            Iterator it = (Iterator) m37524D;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                m37522F(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (m37524D instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (m37524D instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (m37524D instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) m37524D;
                if (jsonPrimitive.isString()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.isBoolean()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.isNumber()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (m37524D instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (m37524D == f56762u) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new MalformedJsonException("Custom JsonElement subclass " + m37524D.getClass().getName() + " is not supported");
            }
        }
    }

    public void promoteNameToValue() throws IOException {
        m37527A(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m37524D()).next();
        m37522F(entry.getValue());
        m37522F(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        int i = C8738b.f56767a[peek().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        m37523E();
                        int i2 = this.f56764q;
                        if (i2 > 0) {
                            int[] iArr = this.f56766s;
                            int i3 = i2 - 1;
                            iArr[i3] = iArr[i3] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                endObject();
                return;
            }
            endArray();
            return;
        }
        m37525C(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return JsonTreeReader.class.getSimpleName() + m37520m();
    }
}
