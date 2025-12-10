package org.bson.json;

import java.io.Reader;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.cli.HelpFormatter;
import org.bson.AbstractBsonReader;
import org.bson.BSONException;
import org.bson.BsonBinary;
import org.bson.BsonBinarySubType;
import org.bson.BsonContextType;
import org.bson.BsonDbPointer;
import org.bson.BsonInvalidOperationException;
import org.bson.BsonReaderMark;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.BsonType;
import org.bson.BsonUndefined;
import org.bson.internal.Base64;
import org.bson.types.Decimal128;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;

/* loaded from: classes4.dex */
public class JsonReader extends AbstractBsonReader {

    /* renamed from: f */
    public final JsonScanner f75951f;

    /* renamed from: g */
    public C12941a f75952g;

    /* renamed from: h */
    public Object f75953h;

    /* renamed from: i */
    public Mark f75954i;

    /* loaded from: classes4.dex */
    public class Context extends AbstractBsonReader.Context {
        public Context(AbstractBsonReader.Context context, BsonContextType bsonContextType) {
            super(context, bsonContextType);
        }

        @Override // org.bson.AbstractBsonReader.Context
        public BsonContextType getContextType() {
            return super.getContextType();
        }

        @Override // org.bson.AbstractBsonReader.Context
        public Context getParentContext() {
            return (Context) super.getParentContext();
        }
    }

    /* loaded from: classes4.dex */
    public class Mark extends AbstractBsonReader.Mark {

        /* renamed from: g */
        public final C12941a f75956g;

        /* renamed from: h */
        public final Object f75957h;

        /* renamed from: i */
        public final int f75958i;

        public Mark() {
            super();
            this.f75956g = JsonReader.this.f75952g;
            this.f75957h = JsonReader.this.f75953h;
            this.f75958i = JsonReader.this.f75951f.m24127b();
        }

        public void discard() {
            JsonReader.this.f75951f.m24128a(this.f75958i);
        }

        @Override // org.bson.AbstractBsonReader.Mark, org.bson.BsonReaderMark
        public void reset() {
            super.reset();
            JsonReader.this.f75952g = this.f75956g;
            JsonReader.this.f75953h = this.f75957h;
            JsonReader.this.f75951f.m24125d(this.f75958i);
            JsonReader jsonReader = JsonReader.this;
            jsonReader.setContext(new Context(getParentContext(), getContextType()));
        }
    }

    /* renamed from: org.bson.json.JsonReader$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C12934a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f75960a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f75961b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f75962c;

        static {
            int[] iArr = new int[BsonType.values().length];
            f75962c = iArr;
            try {
                iArr[BsonType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75962c[BsonType.BINARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f75962c[BsonType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f75962c[BsonType.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f75962c[BsonType.DOCUMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f75962c[BsonType.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f75962c[BsonType.INT32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f75962c[BsonType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f75962c[BsonType.DECIMAL128.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f75962c[BsonType.JAVASCRIPT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f75962c[BsonType.JAVASCRIPT_WITH_SCOPE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f75962c[BsonType.MAX_KEY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f75962c[BsonType.MIN_KEY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f75962c[BsonType.NULL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f75962c[BsonType.OBJECT_ID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f75962c[BsonType.REGULAR_EXPRESSION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f75962c[BsonType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f75962c[BsonType.SYMBOL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f75962c[BsonType.TIMESTAMP.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f75962c[BsonType.UNDEFINED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr2 = new int[BsonContextType.values().length];
            f75961b = iArr2;
            try {
                iArr2[BsonContextType.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f75961b[BsonContextType.SCOPE_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f75961b[BsonContextType.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f75961b[BsonContextType.JAVASCRIPT_WITH_SCOPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f75961b[BsonContextType.TOP_LEVEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr3 = new int[JsonTokenType.values().length];
            f75960a = iArr3;
            try {
                iArr3[JsonTokenType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f75960a[JsonTokenType.UNQUOTED_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f75960a[JsonTokenType.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f75960a[JsonTokenType.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f75960a[JsonTokenType.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f75960a[JsonTokenType.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f75960a[JsonTokenType.END_OF_FILE.ordinal()] = 7;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f75960a[JsonTokenType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f75960a[JsonTokenType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f75960a[JsonTokenType.REGULAR_EXPRESSION.ordinal()] = 10;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f75960a[JsonTokenType.COMMA.ordinal()] = 11;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public JsonReader(String str) {
        this(new JsonScanner(str));
    }

    /* renamed from: t */
    public static byte[] m24135t(String str) {
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[str.length() / 2];
            for (int i = 0; i < str.length(); i += 2) {
                int digit = Character.digit(str.charAt(i), 16);
                int digit2 = Character.digit(str.charAt(i + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i / 2] = (byte) ((digit * 16) + digit2);
                } else {
                    throw new IllegalArgumentException("A hex string can only contain the characters 0-9, A-F, a-f: " + str);
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("A hex string must contain an even number of characters: " + str);
    }

    /* renamed from: A */
    public final void m24177A(String str) {
        if (str != null) {
            C12941a m24134u = m24134u();
            JsonTokenType m24078a = m24134u.m24078a();
            if ((m24078a == JsonTokenType.STRING || m24078a == JsonTokenType.UNQUOTED_STRING) && str.equals(m24134u.m24077b())) {
                return;
            }
            throw new JsonParseException("JSON reader expected '%s' but found '%s'.", str, m24134u.m24077b());
        }
        throw new IllegalArgumentException("Can't be null");
    }

    /* renamed from: B */
    public final void m24176B(JsonTokenType jsonTokenType) {
        C12941a m24134u = m24134u();
        if (jsonTokenType == m24134u.m24078a()) {
            return;
        }
        throw new JsonParseException("JSON reader expected token type '%s' but found '%s'.", jsonTokenType, m24134u.m24077b());
    }

    /* renamed from: C */
    public final void m24175C(JsonTokenType jsonTokenType, Object obj) {
        C12941a m24134u = m24134u();
        if (jsonTokenType == m24134u.m24078a()) {
            if (obj.equals(m24134u.m24077b())) {
                return;
            }
            throw new JsonParseException("JSON reader expected '%s' but found '%s'.", obj, m24134u.m24077b());
        }
        throw new JsonParseException("JSON reader expected token type '%s' but found '%s'.", jsonTokenType, m24134u.m24077b());
    }

    /* renamed from: D */
    public final BsonBinary m24174D() {
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.INT32) {
            m24176B(JsonTokenType.COMMA);
            C12941a m24134u2 = m24134u();
            if (m24134u2.m24078a() != JsonTokenType.UNQUOTED_STRING && m24134u2.m24078a() != JsonTokenType.STRING) {
                throw new JsonParseException("JSON reader expected a string but found '%s'.", m24134u2.m24077b());
            }
            m24176B(JsonTokenType.RIGHT_PAREN);
            return new BsonBinary(((Integer) m24134u.m24076c(Integer.class)).byteValue(), Base64.decode((String) m24134u2.m24076c(String.class)));
        }
        throw new JsonParseException("JSON reader expected a binary subtype but found '%s'.", m24134u.m24077b());
    }

    /* renamed from: E */
    public final BsonBinary m24173E(String str) {
        byte b;
        byte[] decode;
        Mark mark = new Mark();
        try {
            JsonTokenType jsonTokenType = JsonTokenType.COLON;
            m24176B(jsonTokenType);
            if (str.equals("$binary")) {
                if (m24134u().m24078a() == JsonTokenType.BEGIN_OBJECT) {
                    String str2 = (String) m24134u().m24076c(String.class);
                    if (str2.equals("base64")) {
                        m24176B(jsonTokenType);
                        decode = Base64.decode(m24129z());
                        m24176B(JsonTokenType.COMMA);
                        m24177A("subType");
                        m24176B(jsonTokenType);
                        b = m24132w();
                    } else if (str2.equals("subType")) {
                        m24176B(jsonTokenType);
                        byte m24132w = m24132w();
                        m24176B(JsonTokenType.COMMA);
                        m24177A("base64");
                        m24176B(jsonTokenType);
                        b = m24132w;
                        decode = Base64.decode(m24129z());
                    } else {
                        throw new JsonParseException("Unexpected key for $binary: " + str2);
                    }
                    JsonTokenType jsonTokenType2 = JsonTokenType.END_OBJECT;
                    m24176B(jsonTokenType2);
                    m24176B(jsonTokenType2);
                    BsonBinary bsonBinary = new BsonBinary(b, decode);
                    mark.discard();
                    return bsonBinary;
                }
                mark.reset();
                BsonBinary m24162P = m24162P(str);
                mark.discard();
                return m24162P;
            }
            mark.reset();
            BsonBinary m24162P2 = m24162P(str);
            mark.discard();
            return m24162P2;
        } catch (Throwable th2) {
            mark.discard();
            throw th2;
        }
    }

    /* renamed from: F */
    public final BsonDbPointer m24172F() {
        m24176B(JsonTokenType.LEFT_PAREN);
        String m24129z = m24129z();
        m24176B(JsonTokenType.COMMA);
        ObjectId objectId = new ObjectId(m24129z());
        m24176B(JsonTokenType.RIGHT_PAREN);
        return new BsonDbPointer(m24129z, objectId);
    }

    /* renamed from: G */
    public final long m24171G() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH);
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        JsonTokenType m24078a = m24134u.m24078a();
        JsonTokenType jsonTokenType = JsonTokenType.RIGHT_PAREN;
        if (m24078a == jsonTokenType) {
            return new Date().getTime();
        }
        if (m24134u.m24078a() == JsonTokenType.STRING) {
            m24176B(jsonTokenType);
            String str = (String) m24134u.m24076c(String.class);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = simpleDateFormat.parse(str, parsePosition);
            if (parse != null && parsePosition.getIndex() == str.length()) {
                return parse.getTime();
            }
            throw new JsonParseException("JSON reader expected a date in 'EEE MMM dd yyyy HH:mm:ss z' format but found '%s'.", str);
        } else if (m24134u.m24078a() != JsonTokenType.INT32 && m24134u.m24078a() != JsonTokenType.INT64) {
            throw new JsonParseException("JSON reader expected an integer or a string but found '%s'.", m24134u.m24077b());
        } else {
            long[] jArr = new long[7];
            int i = 0;
            while (true) {
                if (i < 7) {
                    jArr[i] = ((Long) m24134u.m24076c(Long.class)).longValue();
                    i++;
                }
                C12941a m24134u2 = m24134u();
                if (m24134u2.m24078a() == JsonTokenType.RIGHT_PAREN) {
                    if (i == 1) {
                        return jArr[0];
                    }
                    if (i >= 3 && i <= 7) {
                        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        calendar.set(1, (int) jArr[0]);
                        calendar.set(2, (int) jArr[1]);
                        calendar.set(5, (int) jArr[2]);
                        calendar.set(11, (int) jArr[3]);
                        calendar.set(12, (int) jArr[4]);
                        calendar.set(13, (int) jArr[5]);
                        calendar.set(14, (int) jArr[6]);
                        return calendar.getTimeInMillis();
                    }
                    throw new JsonParseException("JSON reader expected 1 or 3-7 integers but found %d.", Integer.valueOf(i));
                } else if (m24134u2.m24078a() == JsonTokenType.COMMA) {
                    m24134u = m24134u();
                    if (m24134u.m24078a() != JsonTokenType.INT32 && m24134u.m24078a() != JsonTokenType.INT64) {
                        throw new JsonParseException("JSON reader expected an integer but found '%s'.", m24134u.m24077b());
                    }
                } else {
                    throw new JsonParseException("JSON reader expected a ',' or a ')' but found '%s'.", m24134u2.m24077b());
                }
            }
        }
    }

    /* renamed from: H */
    public final String m24170H() {
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() != JsonTokenType.RIGHT_PAREN) {
            while (m24134u.m24078a() != JsonTokenType.END_OF_FILE) {
                m24134u = m24134u();
                if (m24134u.m24078a() == JsonTokenType.RIGHT_PAREN) {
                    break;
                }
            }
            if (m24134u.m24078a() != JsonTokenType.RIGHT_PAREN) {
                throw new JsonParseException("JSON reader expected a ')' but found '%s'.", m24134u.m24077b());
            }
        }
        return new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss z", Locale.ENGLISH).format(new Date());
    }

    /* renamed from: I */
    public final long m24169I() {
        long longValue;
        m24176B(JsonTokenType.COLON);
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.BEGIN_OBJECT) {
            String str = (String) m24134u().m24076c(String.class);
            if (str.equals("$numberLong")) {
                long longValue2 = m24151a0().longValue();
                m24176B(JsonTokenType.END_OBJECT);
                return longValue2;
            }
            throw new JsonParseException(String.format("JSON reader expected $numberLong within $date, but found %s", str));
        }
        if (m24134u.m24078a() != JsonTokenType.INT32 && m24134u.m24078a() != JsonTokenType.INT64) {
            if (m24134u.m24078a() == JsonTokenType.STRING) {
                try {
                    longValue = AbstractC1663XD.m65532c((String) m24134u.m24076c(String.class));
                } catch (IllegalArgumentException e) {
                    throw new JsonParseException("Failed to parse string as a date", e);
                }
            } else {
                throw new JsonParseException("JSON reader expected an integer or string but found '%s'.", m24134u.m24077b());
            }
        } else {
            longValue = ((Long) m24134u.m24076c(Long.class)).longValue();
        }
        m24176B(JsonTokenType.END_OBJECT);
        return longValue;
    }

    /* renamed from: J */
    public final BsonDbPointer m24168J() {
        ObjectId m24131x;
        String m24129z;
        JsonTokenType jsonTokenType = JsonTokenType.COLON;
        m24176B(jsonTokenType);
        m24176B(JsonTokenType.BEGIN_OBJECT);
        String m24129z2 = m24129z();
        if (m24129z2.equals("$ref")) {
            m24176B(jsonTokenType);
            m24129z = m24129z();
            m24176B(JsonTokenType.COMMA);
            m24177A("$id");
            m24131x = m24131x();
            m24176B(JsonTokenType.END_OBJECT);
        } else if (m24129z2.equals("$id")) {
            m24131x = m24131x();
            m24176B(JsonTokenType.COMMA);
            m24177A("$ref");
            m24176B(jsonTokenType);
            m24129z = m24129z();
        } else {
            throw new JsonParseException("Expected $ref and $id fields in $dbPointer document but found " + m24129z2);
        }
        m24176B(JsonTokenType.END_OBJECT);
        return new BsonDbPointer(m24129z, m24131x);
    }

    /* renamed from: K */
    public final void m24167K() {
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.LEFT_PAREN) {
            m24176B(JsonTokenType.RIGHT_PAREN);
        } else {
            m24133v(m24134u);
        }
    }

    /* renamed from: L */
    public final void m24166L() {
        C12941a m24134u = m24134u();
        String str = (String) m24134u.m24076c(String.class);
        JsonTokenType m24078a = m24134u.m24078a();
        if (m24078a == JsonTokenType.STRING || m24078a == JsonTokenType.UNQUOTED_STRING) {
            if (!"$binary".equals(str) && !"$type".equals(str)) {
                if (!"$regex".equals(str) && !"$options".equals(str)) {
                    if ("$code".equals(str)) {
                        m24163O();
                        return;
                    } else if ("$date".equals(str)) {
                        this.f75953h = Long.valueOf(m24169I());
                        setCurrentBsonType(BsonType.DATE_TIME);
                        return;
                    } else if ("$maxKey".equals(str)) {
                        this.f75953h = m24161Q();
                        setCurrentBsonType(BsonType.MAX_KEY);
                        return;
                    } else if ("$minKey".equals(str)) {
                        this.f75953h = m24160R();
                        setCurrentBsonType(BsonType.MIN_KEY);
                        return;
                    } else if ("$oid".equals(str)) {
                        this.f75953h = m24149c0();
                        setCurrentBsonType(BsonType.OBJECT_ID);
                        return;
                    } else if ("$regularExpression".equals(str)) {
                        this.f75953h = m24158T();
                        setCurrentBsonType(BsonType.REGULAR_EXPRESSION);
                        return;
                    } else if ("$symbol".equals(str)) {
                        this.f75953h = m24146f0();
                        setCurrentBsonType(BsonType.SYMBOL);
                        return;
                    } else if ("$timestamp".equals(str)) {
                        this.f75953h = m24144h0();
                        setCurrentBsonType(BsonType.TIMESTAMP);
                        return;
                    } else if ("$undefined".equals(str)) {
                        this.f75953h = m24142j0();
                        setCurrentBsonType(BsonType.UNDEFINED);
                        return;
                    } else if ("$numberLong".equals(str)) {
                        this.f75953h = m24151a0();
                        setCurrentBsonType(BsonType.INT64);
                        return;
                    } else if ("$numberInt".equals(str)) {
                        this.f75953h = m24153Y();
                        setCurrentBsonType(BsonType.INT32);
                        return;
                    } else if ("$numberDouble".equals(str)) {
                        this.f75953h = m24155W();
                        setCurrentBsonType(BsonType.DOUBLE);
                        return;
                    } else if ("$numberDecimal".equals(str)) {
                        this.f75953h = m24156V();
                        setCurrentBsonType(BsonType.DECIMAL128);
                        return;
                    } else if ("$dbPointer".equals(str)) {
                        this.f75953h = m24168J();
                        setCurrentBsonType(BsonType.DB_POINTER);
                        return;
                    }
                } else {
                    BsonRegularExpression m24147e0 = m24147e0(str);
                    this.f75953h = m24147e0;
                    if (m24147e0 != null) {
                        setCurrentBsonType(BsonType.REGULAR_EXPRESSION);
                        return;
                    }
                }
            } else {
                BsonBinary m24173E = m24173E(str);
                this.f75953h = m24173E;
                if (m24173E != null) {
                    setCurrentBsonType(BsonType.BINARY);
                    return;
                }
            }
        }
        m24133v(m24134u);
        setCurrentBsonType(BsonType.DOCUMENT);
    }

    /* renamed from: M */
    public final BsonBinary m24165M() {
        BsonBinarySubType[] values;
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.INT32) {
            m24176B(JsonTokenType.COMMA);
            String m24129z = m24129z();
            m24176B(JsonTokenType.RIGHT_PAREN);
            if ((m24129z.length() & 1) != 0) {
                m24129z = "0" + m24129z;
            }
            for (BsonBinarySubType bsonBinarySubType : BsonBinarySubType.values()) {
                if (bsonBinarySubType.getValue() == ((Integer) m24134u.m24076c(Integer.class)).intValue()) {
                    return new BsonBinary(bsonBinarySubType, m24135t(m24129z));
                }
            }
            return new BsonBinary(m24135t(m24129z));
        }
        throw new JsonParseException("JSON reader expected a binary subtype but found '%s'.", m24134u.m24077b());
    }

    /* renamed from: N */
    public final long m24164N() {
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        JsonTokenType m24078a = m24134u.m24078a();
        JsonTokenType jsonTokenType = JsonTokenType.RIGHT_PAREN;
        if (m24078a == jsonTokenType) {
            return new Date().getTime();
        }
        if (m24134u.m24078a() == JsonTokenType.STRING) {
            m24176B(jsonTokenType);
            String[] strArr = {"yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ssz", "yyyy-MM-dd'T'HH:mm:ss.SSSz"};
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strArr[0], Locale.ENGLISH);
            ParsePosition parsePosition = new ParsePosition(0);
            String str = (String) m24134u.m24076c(String.class);
            if (str.endsWith("Z")) {
                str = str.substring(0, str.length() - 1) + "GMT-00:00";
            }
            for (int i = 0; i < 3; i++) {
                simpleDateFormat.applyPattern(strArr[i]);
                simpleDateFormat.setLenient(true);
                parsePosition.setIndex(0);
                Date parse = simpleDateFormat.parse(str, parsePosition);
                if (parse != null && parsePosition.getIndex() == str.length()) {
                    return parse.getTime();
                }
            }
            throw new JsonParseException("Invalid date format.");
        }
        throw new JsonParseException("JSON reader expected a string but found '%s'.", m24134u.m24077b());
    }

    /* renamed from: O */
    public final void m24163O() {
        JsonTokenType jsonTokenType = JsonTokenType.COLON;
        m24176B(jsonTokenType);
        String m24129z = m24129z();
        C12941a m24134u = m24134u();
        int i = C12934a.f75960a[m24134u.m24078a().ordinal()];
        if (i != 3) {
            if (i == 11) {
                m24177A("$scope");
                m24176B(jsonTokenType);
                setState(AbstractBsonReader.State.VALUE);
                this.f75953h = m24129z;
                setCurrentBsonType(BsonType.JAVASCRIPT_WITH_SCOPE);
                setContext(new Context(getContext(), BsonContextType.SCOPE_DOCUMENT));
                return;
            }
            throw new JsonParseException("JSON reader expected ',' or '}' but found '%s'.", m24134u);
        }
        this.f75953h = m24129z;
        setCurrentBsonType(BsonType.JAVASCRIPT);
    }

    /* renamed from: P */
    public final BsonBinary m24162P(String str) {
        byte b;
        byte[] decode;
        Mark mark = new Mark();
        try {
            try {
                JsonTokenType jsonTokenType = JsonTokenType.COLON;
                m24176B(jsonTokenType);
                if (str.equals("$binary")) {
                    decode = Base64.decode(m24129z());
                    m24176B(JsonTokenType.COMMA);
                    m24177A("$type");
                    m24176B(jsonTokenType);
                    b = m24132w();
                } else {
                    byte m24132w = m24132w();
                    m24176B(JsonTokenType.COMMA);
                    m24177A("$binary");
                    m24176B(jsonTokenType);
                    b = m24132w;
                    decode = Base64.decode(m24129z());
                }
                m24176B(JsonTokenType.END_OBJECT);
                BsonBinary bsonBinary = new BsonBinary(b, decode);
                mark.discard();
                return bsonBinary;
            } catch (NumberFormatException unused) {
                mark.reset();
                mark.discard();
                return null;
            } catch (JsonParseException unused2) {
                mark.reset();
                mark.discard();
                return null;
            }
        } catch (Throwable th2) {
            mark.discard();
            throw th2;
        }
    }

    /* renamed from: Q */
    public final MaxKey m24161Q() {
        m24176B(JsonTokenType.COLON);
        m24175C(JsonTokenType.INT32, 1);
        m24176B(JsonTokenType.END_OBJECT);
        return new MaxKey();
    }

    /* renamed from: R */
    public final MinKey m24160R() {
        m24176B(JsonTokenType.COLON);
        m24175C(JsonTokenType.INT32, 1);
        m24176B(JsonTokenType.END_OBJECT);
        return new MinKey();
    }

    /* renamed from: S */
    public final void m24159S() {
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.UNQUOTED_STRING) {
            String str = (String) m24134u.m24076c(String.class);
            if ("MinKey".equals(str)) {
                m24167K();
                setCurrentBsonType(BsonType.MIN_KEY);
                this.f75953h = new MinKey();
                return;
            } else if ("MaxKey".equals(str)) {
                m24167K();
                setCurrentBsonType(BsonType.MAX_KEY);
                this.f75953h = new MaxKey();
                return;
            } else if ("BinData".equals(str)) {
                this.f75953h = m24174D();
                setCurrentBsonType(BsonType.BINARY);
                return;
            } else if ("Date".equals(str)) {
                this.f75953h = Long.valueOf(m24171G());
                setCurrentBsonType(BsonType.DATE_TIME);
                return;
            } else if ("HexData".equals(str)) {
                this.f75953h = m24165M();
                setCurrentBsonType(BsonType.BINARY);
                return;
            } else if ("ISODate".equals(str)) {
                this.f75953h = Long.valueOf(m24164N());
                setCurrentBsonType(BsonType.DATE_TIME);
                return;
            } else if ("NumberInt".equals(str)) {
                this.f75953h = Integer.valueOf(m24154X());
                setCurrentBsonType(BsonType.INT32);
                return;
            } else if ("NumberLong".equals(str)) {
                this.f75953h = Long.valueOf(m24152Z());
                setCurrentBsonType(BsonType.INT64);
                return;
            } else if ("NumberDecimal".equals(str)) {
                this.f75953h = m24157U();
                setCurrentBsonType(BsonType.DECIMAL128);
                return;
            } else if ("ObjectId".equals(str)) {
                this.f75953h = m24150b0();
                setCurrentBsonType(BsonType.OBJECT_ID);
                return;
            } else if ("RegExp".equals(str)) {
                this.f75953h = m24148d0();
                setCurrentBsonType(BsonType.REGULAR_EXPRESSION);
                return;
            } else if ("DBPointer".equals(str)) {
                this.f75953h = m24172F();
                setCurrentBsonType(BsonType.DB_POINTER);
                return;
            } else if (!"UUID".equals(str) && !"GUID".equals(str) && !"CSUUID".equals(str) && !"CSGUID".equals(str) && !"JUUID".equals(str) && !"JGUID".equals(str) && !"PYUUID".equals(str) && !"PYGUID".equals(str)) {
                throw new JsonParseException("JSON reader expected a type name but found '%s'.", str);
            } else {
                this.f75953h = m24143i0(str);
                setCurrentBsonType(BsonType.BINARY);
                return;
            }
        }
        throw new JsonParseException("JSON reader expected a type name but found '%s'.", m24134u.m24077b());
    }

    /* renamed from: T */
    public final BsonRegularExpression m24158T() {
        String m24129z;
        String str;
        JsonTokenType jsonTokenType = JsonTokenType.COLON;
        m24176B(jsonTokenType);
        m24176B(JsonTokenType.BEGIN_OBJECT);
        String m24129z2 = m24129z();
        if (m24129z2.equals("pattern")) {
            m24176B(jsonTokenType);
            m24129z = m24129z();
            m24176B(JsonTokenType.COMMA);
            m24177A("options");
            m24176B(jsonTokenType);
            str = m24129z();
        } else if (m24129z2.equals("options")) {
            m24176B(jsonTokenType);
            String m24129z3 = m24129z();
            m24176B(JsonTokenType.COMMA);
            m24177A("pattern");
            m24176B(jsonTokenType);
            m24129z = m24129z();
            str = m24129z3;
        } else {
            throw new JsonParseException("Expected 't' and 'i' fields in $timestamp document but found " + m24129z2);
        }
        JsonTokenType jsonTokenType2 = JsonTokenType.END_OBJECT;
        m24176B(jsonTokenType2);
        m24176B(jsonTokenType2);
        return new BsonRegularExpression(m24129z, str);
    }

    /* renamed from: U */
    public final Decimal128 m24157U() {
        Decimal128 decimal128;
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() != JsonTokenType.INT32 && m24134u.m24078a() != JsonTokenType.INT64 && m24134u.m24078a() != JsonTokenType.DOUBLE) {
            if (m24134u.m24078a() == JsonTokenType.STRING) {
                decimal128 = Decimal128.parse((String) m24134u.m24076c(String.class));
            } else {
                throw new JsonParseException("JSON reader expected a number or a string but found '%s'.", m24134u.m24077b());
            }
        } else {
            decimal128 = (Decimal128) m24134u.m24076c(Decimal128.class);
        }
        m24176B(JsonTokenType.RIGHT_PAREN);
        return decimal128;
    }

    /* renamed from: V */
    public final Decimal128 m24156V() {
        m24176B(JsonTokenType.COLON);
        String m24129z = m24129z();
        try {
            Decimal128 parse = Decimal128.parse(m24129z);
            m24176B(JsonTokenType.END_OBJECT);
            return parse;
        } catch (NumberFormatException e) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", m24129z, Decimal128.class.getName()), e);
        }
    }

    /* renamed from: W */
    public final Double m24155W() {
        m24176B(JsonTokenType.COLON);
        String m24129z = m24129z();
        try {
            Double valueOf = Double.valueOf(m24129z);
            m24176B(JsonTokenType.END_OBJECT);
            return valueOf;
        } catch (NumberFormatException e) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", m24129z, Double.class.getName()), e);
        }
    }

    /* renamed from: X */
    public final int m24154X() {
        int parseInt;
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.INT32) {
            parseInt = ((Integer) m24134u.m24076c(Integer.class)).intValue();
        } else if (m24134u.m24078a() == JsonTokenType.STRING) {
            parseInt = Integer.parseInt((String) m24134u.m24076c(String.class));
        } else {
            throw new JsonParseException("JSON reader expected an integer or a string but found '%s'.", m24134u.m24077b());
        }
        m24176B(JsonTokenType.RIGHT_PAREN);
        return parseInt;
    }

    /* renamed from: Y */
    public final Integer m24153Y() {
        m24176B(JsonTokenType.COLON);
        String m24129z = m24129z();
        try {
            Integer valueOf = Integer.valueOf(m24129z);
            m24176B(JsonTokenType.END_OBJECT);
            return valueOf;
        } catch (NumberFormatException e) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", m24129z, Integer.class.getName()), e);
        }
    }

    /* renamed from: Z */
    public final long m24152Z() {
        long longValue;
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() != JsonTokenType.INT32 && m24134u.m24078a() != JsonTokenType.INT64) {
            if (m24134u.m24078a() == JsonTokenType.STRING) {
                longValue = Long.parseLong((String) m24134u.m24076c(String.class));
            } else {
                throw new JsonParseException("JSON reader expected an integer or a string but found '%s'.", m24134u.m24077b());
            }
        } else {
            longValue = ((Long) m24134u.m24076c(Long.class)).longValue();
        }
        m24176B(JsonTokenType.RIGHT_PAREN);
        return longValue;
    }

    /* renamed from: a0 */
    public final Long m24151a0() {
        m24176B(JsonTokenType.COLON);
        String m24129z = m24129z();
        try {
            Long valueOf = Long.valueOf(m24129z);
            m24176B(JsonTokenType.END_OBJECT);
            return valueOf;
        } catch (NumberFormatException e) {
            throw new JsonParseException(String.format("Exception converting value '%s' to type %s", m24129z, Long.class.getName()), e);
        }
    }

    /* renamed from: b0 */
    public final ObjectId m24150b0() {
        m24176B(JsonTokenType.LEFT_PAREN);
        ObjectId objectId = new ObjectId(m24129z());
        m24176B(JsonTokenType.RIGHT_PAREN);
        return objectId;
    }

    /* renamed from: c0 */
    public final ObjectId m24149c0() {
        m24176B(JsonTokenType.COLON);
        ObjectId objectId = new ObjectId(m24129z());
        m24176B(JsonTokenType.END_OBJECT);
        return objectId;
    }

    /* renamed from: d0 */
    public final BsonRegularExpression m24148d0() {
        String str;
        m24176B(JsonTokenType.LEFT_PAREN);
        String m24129z = m24129z();
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.COMMA) {
            str = m24129z();
        } else {
            m24133v(m24134u);
            str = "";
        }
        m24176B(JsonTokenType.RIGHT_PAREN);
        return new BsonRegularExpression(m24129z, str);
    }

    @Override // org.bson.AbstractBsonReader
    public int doPeekBinarySize() {
        return doReadBinaryData().getData().length;
    }

    @Override // org.bson.AbstractBsonReader
    public byte doPeekBinarySubType() {
        return doReadBinaryData().getType();
    }

    @Override // org.bson.AbstractBsonReader
    public BsonBinary doReadBinaryData() {
        return (BsonBinary) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public boolean doReadBoolean() {
        return ((Boolean) this.f75953h).booleanValue();
    }

    @Override // org.bson.AbstractBsonReader
    public BsonDbPointer doReadDBPointer() {
        return (BsonDbPointer) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public long doReadDateTime() {
        return ((Long) this.f75953h).longValue();
    }

    @Override // org.bson.AbstractBsonReader
    public Decimal128 doReadDecimal128() {
        return (Decimal128) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public double doReadDouble() {
        return ((Double) this.f75953h).doubleValue();
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadEndArray() {
        setContext(getContext().getParentContext());
        if (getContext().getContextType() == BsonContextType.ARRAY || getContext().getContextType() == BsonContextType.DOCUMENT) {
            C12941a m24134u = m24134u();
            if (m24134u.m24078a() != JsonTokenType.COMMA) {
                m24133v(m24134u);
            }
        }
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadEndDocument() {
        setContext(getContext().getParentContext());
        if (getContext() != null && getContext().getContextType() == BsonContextType.SCOPE_DOCUMENT) {
            setContext(getContext().getParentContext());
            m24176B(JsonTokenType.END_OBJECT);
        }
        if (getContext() != null) {
            if (getContext().getContextType() == BsonContextType.ARRAY || getContext().getContextType() == BsonContextType.DOCUMENT) {
                C12941a m24134u = m24134u();
                if (m24134u.m24078a() != JsonTokenType.COMMA) {
                    m24133v(m24134u);
                    return;
                }
                return;
            }
            return;
        }
        throw new JsonParseException("Unexpected end of document.");
    }

    @Override // org.bson.AbstractBsonReader
    public int doReadInt32() {
        return ((Integer) this.f75953h).intValue();
    }

    @Override // org.bson.AbstractBsonReader
    public long doReadInt64() {
        return ((Long) this.f75953h).longValue();
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadJavaScript() {
        return (String) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadJavaScriptWithScope() {
        return (String) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadMaxKey() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadMinKey() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadNull() {
    }

    @Override // org.bson.AbstractBsonReader
    public ObjectId doReadObjectId() {
        return (ObjectId) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public BsonRegularExpression doReadRegularExpression() {
        return (BsonRegularExpression) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadStartArray() {
        setContext(new Context(getContext(), BsonContextType.ARRAY));
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadStartDocument() {
        setContext(new Context(getContext(), BsonContextType.DOCUMENT));
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadString() {
        return (String) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public String doReadSymbol() {
        return (String) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public BsonTimestamp doReadTimestamp() {
        return (BsonTimestamp) this.f75953h;
    }

    @Override // org.bson.AbstractBsonReader
    public void doReadUndefined() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doSkipName() {
    }

    @Override // org.bson.AbstractBsonReader
    public void doSkipValue() {
        switch (C12934a.f75962c[getCurrentBsonType().ordinal()]) {
            case 1:
                readStartArray();
                while (readBsonType() != BsonType.END_OF_DOCUMENT) {
                    skipValue();
                }
                readEndArray();
                return;
            case 2:
                readBinaryData();
                return;
            case 3:
                readBoolean();
                return;
            case 4:
                readDateTime();
                return;
            case 5:
                readStartDocument();
                while (readBsonType() != BsonType.END_OF_DOCUMENT) {
                    skipName();
                    skipValue();
                }
                readEndDocument();
                return;
            case 6:
                readDouble();
                return;
            case 7:
                readInt32();
                return;
            case 8:
                readInt64();
                return;
            case 9:
                readDecimal128();
                return;
            case 10:
                readJavaScript();
                return;
            case 11:
                readJavaScriptWithScope();
                readStartDocument();
                while (readBsonType() != BsonType.END_OF_DOCUMENT) {
                    skipName();
                    skipValue();
                }
                readEndDocument();
                return;
            case 12:
                readMaxKey();
                return;
            case 13:
                readMinKey();
                return;
            case 14:
                readNull();
                return;
            case 15:
                readObjectId();
                return;
            case 16:
                readRegularExpression();
                return;
            case 17:
                readString();
                return;
            case 18:
                readSymbol();
                return;
            case 19:
                readTimestamp();
                return;
            case 20:
                readUndefined();
                return;
            default:
                return;
        }
    }

    /* renamed from: e0 */
    public final BsonRegularExpression m24147e0(String str) {
        String str2;
        String m24129z;
        Mark mark = new Mark();
        try {
            try {
                JsonTokenType jsonTokenType = JsonTokenType.COLON;
                m24176B(jsonTokenType);
                if (str.equals("$regex")) {
                    m24129z = m24129z();
                    m24176B(JsonTokenType.COMMA);
                    m24177A("$options");
                    m24176B(jsonTokenType);
                    str2 = m24129z();
                } else {
                    String m24129z2 = m24129z();
                    m24176B(JsonTokenType.COMMA);
                    m24177A("$regex");
                    m24176B(jsonTokenType);
                    str2 = m24129z2;
                    m24129z = m24129z();
                }
                m24176B(JsonTokenType.END_OBJECT);
                BsonRegularExpression bsonRegularExpression = new BsonRegularExpression(m24129z, str2);
                mark.discard();
                return bsonRegularExpression;
            } catch (JsonParseException unused) {
                mark.reset();
                mark.discard();
                return null;
            }
        } catch (Throwable th2) {
            mark.discard();
            throw th2;
        }
    }

    /* renamed from: f0 */
    public final String m24146f0() {
        m24176B(JsonTokenType.COLON);
        String m24129z = m24129z();
        m24176B(JsonTokenType.END_OBJECT);
        return m24129z;
    }

    /* renamed from: g0 */
    public final BsonTimestamp m24145g0() {
        m24176B(JsonTokenType.LEFT_PAREN);
        C12941a m24134u = m24134u();
        JsonTokenType m24078a = m24134u.m24078a();
        JsonTokenType jsonTokenType = JsonTokenType.INT32;
        if (m24078a == jsonTokenType) {
            int intValue = ((Integer) m24134u.m24076c(Integer.class)).intValue();
            m24176B(JsonTokenType.COMMA);
            C12941a m24134u2 = m24134u();
            if (m24134u2.m24078a() == jsonTokenType) {
                int intValue2 = ((Integer) m24134u2.m24076c(Integer.class)).intValue();
                m24176B(JsonTokenType.RIGHT_PAREN);
                return new BsonTimestamp(intValue, intValue2);
            }
            throw new JsonParseException("JSON reader expected an integer but found '%s'.", m24134u.m24077b());
        }
        throw new JsonParseException("JSON reader expected an integer but found '%s'.", m24134u.m24077b());
    }

    @Override // org.bson.BsonReader
    public BsonReaderMark getMark() {
        return new Mark();
    }

    /* renamed from: h0 */
    public final BsonTimestamp m24144h0() {
        int m24130y;
        int i;
        JsonTokenType jsonTokenType = JsonTokenType.COLON;
        m24176B(jsonTokenType);
        m24176B(JsonTokenType.BEGIN_OBJECT);
        String m24129z = m24129z();
        if (m24129z.equals("t")) {
            m24176B(jsonTokenType);
            m24130y = m24130y();
            m24176B(JsonTokenType.COMMA);
            m24177A("i");
            m24176B(jsonTokenType);
            i = m24130y();
        } else if (m24129z.equals("i")) {
            m24176B(jsonTokenType);
            int m24130y2 = m24130y();
            m24176B(JsonTokenType.COMMA);
            m24177A("t");
            m24176B(jsonTokenType);
            m24130y = m24130y();
            i = m24130y2;
        } else {
            throw new JsonParseException("Expected 't' and 'i' fields in $timestamp document but found " + m24129z);
        }
        JsonTokenType jsonTokenType2 = JsonTokenType.END_OBJECT;
        m24176B(jsonTokenType2);
        m24176B(jsonTokenType2);
        return new BsonTimestamp(m24130y, i);
    }

    /* renamed from: i0 */
    public final BsonBinary m24143i0(String str) {
        m24176B(JsonTokenType.LEFT_PAREN);
        String replaceAll = m24129z().replaceAll("\\{", "").replaceAll("}", "").replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX, "");
        m24176B(JsonTokenType.RIGHT_PAREN);
        byte[] m24135t = m24135t(replaceAll);
        BsonBinarySubType bsonBinarySubType = BsonBinarySubType.UUID_STANDARD;
        if (!"UUID".equals(str) || !"GUID".equals(str)) {
            bsonBinarySubType = BsonBinarySubType.UUID_LEGACY;
        }
        return new BsonBinary(bsonBinarySubType, m24135t);
    }

    /* renamed from: j0 */
    public final BsonUndefined m24142j0() {
        m24176B(JsonTokenType.COLON);
        C12941a m24134u = m24134u();
        if (((String) m24134u.m24076c(String.class)).equals("true")) {
            m24176B(JsonTokenType.END_OBJECT);
            return new BsonUndefined();
        }
        throw new JsonParseException("JSON reader requires $undefined to have the value of true but found '%s'.", m24134u.m24077b());
    }

    @Override // org.bson.BsonReader
    @Deprecated
    public void mark() {
        if (this.f75954i == null) {
            this.f75954i = new Mark();
            return;
        }
        throw new BSONException("A mark already exists; it needs to be reset before creating a new one");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0354  */
    @Override // org.bson.AbstractBsonReader, org.bson.BsonReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.bson.BsonType readBsonType() {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.json.JsonReader.readBsonType():org.bson.BsonType");
    }

    @Override // org.bson.BsonReader
    @Deprecated
    public void reset() {
        Mark mark = this.f75954i;
        if (mark != null) {
            mark.reset();
            this.f75954i = null;
            return;
        }
        throw new BSONException("trying to reset a mark before creating it");
    }

    /* renamed from: u */
    public final C12941a m24134u() {
        C12941a c12941a = this.f75952g;
        if (c12941a != null) {
            this.f75952g = null;
            return c12941a;
        }
        return this.f75951f.m24126c();
    }

    /* renamed from: v */
    public final void m24133v(C12941a c12941a) {
        if (this.f75952g == null) {
            this.f75952g = c12941a;
            return;
        }
        throw new BsonInvalidOperationException("There is already a pending token.");
    }

    /* renamed from: w */
    public final byte m24132w() {
        C12941a m24134u = m24134u();
        JsonTokenType m24078a = m24134u.m24078a();
        JsonTokenType jsonTokenType = JsonTokenType.STRING;
        if (m24078a != jsonTokenType && m24134u.m24078a() != JsonTokenType.INT32) {
            throw new JsonParseException("JSON reader expected a string or number but found '%s'.", m24134u.m24077b());
        }
        if (m24134u.m24078a() == jsonTokenType) {
            return (byte) Integer.parseInt((String) m24134u.m24076c(String.class), 16);
        }
        return ((Integer) m24134u.m24076c(Integer.class)).byteValue();
    }

    /* renamed from: x */
    public final ObjectId m24131x() {
        m24176B(JsonTokenType.COLON);
        m24176B(JsonTokenType.BEGIN_OBJECT);
        m24175C(JsonTokenType.STRING, "$oid");
        return m24149c0();
    }

    /* renamed from: y */
    public final int m24130y() {
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.INT32) {
            return ((Integer) m24134u.m24076c(Integer.class)).intValue();
        }
        if (m24134u.m24078a() == JsonTokenType.INT64) {
            return ((Long) m24134u.m24076c(Long.class)).intValue();
        }
        throw new JsonParseException("JSON reader expected an integer but found '%s'.", m24134u.m24077b());
    }

    /* renamed from: z */
    public final String m24129z() {
        C12941a m24134u = m24134u();
        if (m24134u.m24078a() == JsonTokenType.STRING) {
            return (String) m24134u.m24076c(String.class);
        }
        throw new JsonParseException("JSON reader expected a string but found '%s'.", m24134u.m24077b());
    }

    public JsonReader(Reader reader) {
        this(new JsonScanner(reader));
    }

    @Override // org.bson.AbstractBsonReader
    public Context getContext() {
        return (Context) super.getContext();
    }

    public JsonReader(JsonScanner jsonScanner) {
        this.f75951f = jsonScanner;
        setContext(new Context(null, BsonContextType.TOP_LEVEL));
    }
}
