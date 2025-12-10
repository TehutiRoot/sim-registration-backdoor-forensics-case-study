package p000;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import com.google.api.client.json.gson.GsonFactory;
import com.google.gson.stream.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: h70  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20156h70 extends JsonParser {

    /* renamed from: c */
    public final JsonReader f62399c;

    /* renamed from: d */
    public final GsonFactory f62400d;

    /* renamed from: e */
    public List f62401e = new ArrayList();

    /* renamed from: f */
    public JsonToken f62402f;

    /* renamed from: g */
    public String f62403g;

    /* renamed from: h70$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C10361a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62404a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f62405b;

        static {
            int[] iArr = new int[com.google.gson.stream.JsonToken.values().length];
            f62405b = iArr;
            try {
                iArr[com.google.gson.stream.JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62405b[com.google.gson.stream.JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62405b[com.google.gson.stream.JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62405b[com.google.gson.stream.JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62405b[com.google.gson.stream.JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62405b[com.google.gson.stream.JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62405b[com.google.gson.stream.JsonToken.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62405b[com.google.gson.stream.JsonToken.NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62405b[com.google.gson.stream.JsonToken.NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f62404a = iArr2;
            try {
                iArr2[JsonToken.START_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f62404a[JsonToken.START_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public C20156h70(GsonFactory gsonFactory, JsonReader jsonReader) {
        this.f62400d = gsonFactory;
        this.f62399c = jsonReader;
        jsonReader.setLenient(gsonFactory.m41722c());
    }

    @Override // com.google.api.client.json.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f62399c.close();
    }

    @Override // com.google.api.client.json.JsonParser
    public BigInteger getBigIntegerValue() {
        m30925m();
        return new BigInteger(this.f62403g);
    }

    @Override // com.google.api.client.json.JsonParser
    public byte getByteValue() {
        m30925m();
        return Byte.parseByte(this.f62403g);
    }

    @Override // com.google.api.client.json.JsonParser
    public String getCurrentName() {
        if (this.f62401e.isEmpty()) {
            return null;
        }
        List list = this.f62401e;
        return (String) list.get(list.size() - 1);
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken getCurrentToken() {
        return this.f62402f;
    }

    @Override // com.google.api.client.json.JsonParser
    public BigDecimal getDecimalValue() {
        m30925m();
        return new BigDecimal(this.f62403g);
    }

    @Override // com.google.api.client.json.JsonParser
    public double getDoubleValue() {
        m30925m();
        return Double.parseDouble(this.f62403g);
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonFactory getFactory() {
        return this.f62400d;
    }

    @Override // com.google.api.client.json.JsonParser
    public float getFloatValue() {
        m30925m();
        return Float.parseFloat(this.f62403g);
    }

    @Override // com.google.api.client.json.JsonParser
    public int getIntValue() {
        m30925m();
        return Integer.parseInt(this.f62403g);
    }

    @Override // com.google.api.client.json.JsonParser
    public long getLongValue() {
        m30925m();
        return Long.parseLong(this.f62403g);
    }

    @Override // com.google.api.client.json.JsonParser
    public short getShortValue() {
        m30925m();
        return Short.parseShort(this.f62403g);
    }

    @Override // com.google.api.client.json.JsonParser
    public String getText() {
        return this.f62403g;
    }

    /* renamed from: m */
    public final void m30925m() {
        JsonToken jsonToken = this.f62402f;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            throw new IOException("Token is not a number");
        }
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken nextToken() {
        com.google.gson.stream.JsonToken jsonToken;
        JsonToken jsonToken2;
        JsonToken jsonToken3 = this.f62402f;
        if (jsonToken3 != null) {
            int i = C10361a.f62404a[jsonToken3.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f62399c.beginObject();
                    this.f62401e.add(null);
                }
            } else {
                this.f62399c.beginArray();
                this.f62401e.add(null);
            }
        }
        try {
            jsonToken = this.f62399c.peek();
        } catch (EOFException unused) {
            jsonToken = com.google.gson.stream.JsonToken.END_DOCUMENT;
        }
        switch (C10361a.f62405b[jsonToken.ordinal()]) {
            case 1:
                this.f62403g = "[";
                this.f62402f = JsonToken.START_ARRAY;
                break;
            case 2:
                this.f62403g = "]";
                this.f62402f = JsonToken.END_ARRAY;
                List list = this.f62401e;
                list.remove(list.size() - 1);
                this.f62399c.endArray();
                break;
            case 3:
                this.f62403g = "{";
                this.f62402f = JsonToken.START_OBJECT;
                break;
            case 4:
                this.f62403g = "}";
                this.f62402f = JsonToken.END_OBJECT;
                List list2 = this.f62401e;
                list2.remove(list2.size() - 1);
                this.f62399c.endObject();
                break;
            case 5:
                if (this.f62399c.nextBoolean()) {
                    this.f62403g = "true";
                    this.f62402f = JsonToken.VALUE_TRUE;
                    break;
                } else {
                    this.f62403g = "false";
                    this.f62402f = JsonToken.VALUE_FALSE;
                    break;
                }
            case 6:
                this.f62403g = AbstractJsonLexerKt.NULL;
                this.f62402f = JsonToken.VALUE_NULL;
                this.f62399c.nextNull();
                break;
            case 7:
                this.f62403g = this.f62399c.nextString();
                this.f62402f = JsonToken.VALUE_STRING;
                break;
            case 8:
                String nextString = this.f62399c.nextString();
                this.f62403g = nextString;
                if (nextString.indexOf(46) == -1) {
                    jsonToken2 = JsonToken.VALUE_NUMBER_INT;
                } else {
                    jsonToken2 = JsonToken.VALUE_NUMBER_FLOAT;
                }
                this.f62402f = jsonToken2;
                break;
            case 9:
                this.f62403g = this.f62399c.nextName();
                this.f62402f = JsonToken.FIELD_NAME;
                List list3 = this.f62401e;
                list3.set(list3.size() - 1, this.f62403g);
                break;
            default:
                this.f62403g = null;
                this.f62402f = null;
                break;
        }
        return this.f62402f;
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonParser skipChildren() {
        JsonToken jsonToken = this.f62402f;
        if (jsonToken != null) {
            int i = C10361a.f62404a[jsonToken.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f62399c.skipValue();
                    this.f62403g = "}";
                    this.f62402f = JsonToken.END_OBJECT;
                }
            } else {
                this.f62399c.skipValue();
                this.f62403g = "]";
                this.f62402f = JsonToken.END_ARRAY;
            }
        }
        return this;
    }
}
