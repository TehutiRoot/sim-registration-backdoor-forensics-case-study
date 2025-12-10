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

/* renamed from: n70  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21247n70 extends JsonParser {

    /* renamed from: c */
    public final JsonReader f72252c;

    /* renamed from: d */
    public final GsonFactory f72253d;

    /* renamed from: e */
    public List f72254e = new ArrayList();

    /* renamed from: f */
    public JsonToken f72255f;

    /* renamed from: g */
    public String f72256g;

    /* renamed from: n70$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C12329a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f72257a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f72258b;

        static {
            int[] iArr = new int[com.google.gson.stream.JsonToken.values().length];
            f72258b = iArr;
            try {
                iArr[com.google.gson.stream.JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72258b[com.google.gson.stream.JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72258b[com.google.gson.stream.JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72258b[com.google.gson.stream.JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72258b[com.google.gson.stream.JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72258b[com.google.gson.stream.JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72258b[com.google.gson.stream.JsonToken.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f72258b[com.google.gson.stream.JsonToken.NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f72258b[com.google.gson.stream.JsonToken.NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f72257a = iArr2;
            try {
                iArr2[JsonToken.START_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f72257a[JsonToken.START_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public C21247n70(GsonFactory gsonFactory, JsonReader jsonReader) {
        this.f72253d = gsonFactory;
        this.f72252c = jsonReader;
        jsonReader.setLenient(gsonFactory.m41709c());
    }

    @Override // com.google.api.client.json.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f72252c.close();
    }

    @Override // com.google.api.client.json.JsonParser
    public BigInteger getBigIntegerValue() {
        m26449m();
        return new BigInteger(this.f72256g);
    }

    @Override // com.google.api.client.json.JsonParser
    public byte getByteValue() {
        m26449m();
        return Byte.parseByte(this.f72256g);
    }

    @Override // com.google.api.client.json.JsonParser
    public String getCurrentName() {
        if (this.f72254e.isEmpty()) {
            return null;
        }
        List list = this.f72254e;
        return (String) list.get(list.size() - 1);
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken getCurrentToken() {
        return this.f72255f;
    }

    @Override // com.google.api.client.json.JsonParser
    public BigDecimal getDecimalValue() {
        m26449m();
        return new BigDecimal(this.f72256g);
    }

    @Override // com.google.api.client.json.JsonParser
    public double getDoubleValue() {
        m26449m();
        return Double.parseDouble(this.f72256g);
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonFactory getFactory() {
        return this.f72253d;
    }

    @Override // com.google.api.client.json.JsonParser
    public float getFloatValue() {
        m26449m();
        return Float.parseFloat(this.f72256g);
    }

    @Override // com.google.api.client.json.JsonParser
    public int getIntValue() {
        m26449m();
        return Integer.parseInt(this.f72256g);
    }

    @Override // com.google.api.client.json.JsonParser
    public long getLongValue() {
        m26449m();
        return Long.parseLong(this.f72256g);
    }

    @Override // com.google.api.client.json.JsonParser
    public short getShortValue() {
        m26449m();
        return Short.parseShort(this.f72256g);
    }

    @Override // com.google.api.client.json.JsonParser
    public String getText() {
        return this.f72256g;
    }

    /* renamed from: m */
    public final void m26449m() {
        JsonToken jsonToken = this.f72255f;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            throw new IOException("Token is not a number");
        }
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonToken nextToken() {
        com.google.gson.stream.JsonToken jsonToken;
        JsonToken jsonToken2;
        JsonToken jsonToken3 = this.f72255f;
        if (jsonToken3 != null) {
            int i = C12329a.f72257a[jsonToken3.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f72252c.beginObject();
                    this.f72254e.add(null);
                }
            } else {
                this.f72252c.beginArray();
                this.f72254e.add(null);
            }
        }
        try {
            jsonToken = this.f72252c.peek();
        } catch (EOFException unused) {
            jsonToken = com.google.gson.stream.JsonToken.END_DOCUMENT;
        }
        switch (C12329a.f72258b[jsonToken.ordinal()]) {
            case 1:
                this.f72256g = "[";
                this.f72255f = JsonToken.START_ARRAY;
                break;
            case 2:
                this.f72256g = "]";
                this.f72255f = JsonToken.END_ARRAY;
                List list = this.f72254e;
                list.remove(list.size() - 1);
                this.f72252c.endArray();
                break;
            case 3:
                this.f72256g = "{";
                this.f72255f = JsonToken.START_OBJECT;
                break;
            case 4:
                this.f72256g = "}";
                this.f72255f = JsonToken.END_OBJECT;
                List list2 = this.f72254e;
                list2.remove(list2.size() - 1);
                this.f72252c.endObject();
                break;
            case 5:
                if (this.f72252c.nextBoolean()) {
                    this.f72256g = "true";
                    this.f72255f = JsonToken.VALUE_TRUE;
                    break;
                } else {
                    this.f72256g = "false";
                    this.f72255f = JsonToken.VALUE_FALSE;
                    break;
                }
            case 6:
                this.f72256g = AbstractJsonLexerKt.NULL;
                this.f72255f = JsonToken.VALUE_NULL;
                this.f72252c.nextNull();
                break;
            case 7:
                this.f72256g = this.f72252c.nextString();
                this.f72255f = JsonToken.VALUE_STRING;
                break;
            case 8:
                String nextString = this.f72252c.nextString();
                this.f72256g = nextString;
                if (nextString.indexOf(46) == -1) {
                    jsonToken2 = JsonToken.VALUE_NUMBER_INT;
                } else {
                    jsonToken2 = JsonToken.VALUE_NUMBER_FLOAT;
                }
                this.f72255f = jsonToken2;
                break;
            case 9:
                this.f72256g = this.f72252c.nextName();
                this.f72255f = JsonToken.FIELD_NAME;
                List list3 = this.f72254e;
                list3.set(list3.size() - 1, this.f72256g);
                break;
            default:
                this.f72256g = null;
                this.f72255f = null;
                break;
        }
        return this.f72255f;
    }

    @Override // com.google.api.client.json.JsonParser
    public JsonParser skipChildren() {
        JsonToken jsonToken = this.f72255f;
        if (jsonToken != null) {
            int i = C12329a.f72257a[jsonToken.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.f72252c.skipValue();
                    this.f72256g = "}";
                    this.f72255f = JsonToken.END_OBJECT;
                }
            } else {
                this.f72252c.skipValue();
                this.f72256g = "]";
                this.f72255f = JsonToken.END_ARRAY;
            }
        }
        return this;
    }
}