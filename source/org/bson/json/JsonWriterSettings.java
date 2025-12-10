package org.bson.json;

import org.bson.BsonBinary;
import org.bson.BsonMaxKey;
import org.bson.BsonMinKey;
import org.bson.BsonNull;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.BsonUndefined;
import org.bson.BsonWriterSettings;
import org.bson.assertions.Assertions;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes4.dex */
public class JsonWriterSettings extends BsonWriterSettings {

    /* renamed from: b */
    public final boolean f76005b;

    /* renamed from: c */
    public final String f76006c;

    /* renamed from: d */
    public final String f76007d;

    /* renamed from: e */
    public final int f76008e;

    /* renamed from: f */
    public final JsonMode f76009f;

    /* renamed from: g */
    public final Converter f76010g;

    /* renamed from: h */
    public final Converter f76011h;

    /* renamed from: i */
    public final Converter f76012i;

    /* renamed from: j */
    public final Converter f76013j;

    /* renamed from: k */
    public final Converter f76014k;

    /* renamed from: l */
    public final Converter f76015l;

    /* renamed from: m */
    public final Converter f76016m;

    /* renamed from: n */
    public final Converter f76017n;

    /* renamed from: o */
    public final Converter f76018o;

    /* renamed from: p */
    public final Converter f76019p;

    /* renamed from: q */
    public final Converter f76020q;

    /* renamed from: r */
    public final Converter f76021r;

    /* renamed from: s */
    public final Converter f76022s;

    /* renamed from: t */
    public final Converter f76023t;

    /* renamed from: u */
    public final Converter f76024u;

    /* renamed from: v */
    public final Converter f76025v;

    /* renamed from: w */
    public final Converter f76026w;

    /* renamed from: x */
    public static final C20766kh0 f76002x = new C20766kh0();

    /* renamed from: y */
    public static final C21798qh0 f76003y = new C21798qh0();

    /* renamed from: z */
    public static final C18751Xg0 f76004z = new C18751Xg0();

    /* renamed from: A */
    public static final C19390ch0 f75971A = new C19390ch0();

    /* renamed from: B */
    public static final C0741KT f75972B = new C0741KT();

    /* renamed from: C */
    public static final C19261bv1 f75973C = new C19261bv1();

    /* renamed from: D */
    public static final C20078gh0 f75974D = new C20078gh0();

    /* renamed from: E */
    public static final C0805LT f75975E = new C0805LT();

    /* renamed from: F */
    public static final C21970rh0 f75976F = new C21970rh0();

    /* renamed from: G */
    public static final C1016OT f75977G = new C1016OT();

    /* renamed from: H */
    public static final C19327cH1 f75978H = new C19327cH1();

    /* renamed from: I */
    public static final C0946NT f75979I = new C0946NT();

    /* renamed from: J */
    public static final C19155bH1 f75980J = new C19155bH1();

    /* renamed from: K */
    public static final C1315ST f75981K = new C1315ST();

    /* renamed from: L */
    public static final C20015gH1 f75982L = new C20015gH1();

    /* renamed from: M */
    public static final C17605Fi0 f75983M = new C17605Fi0();

    /* renamed from: N */
    public static final C0600IT f75984N = new C0600IT();

    /* renamed from: O */
    public static final C19089av1 f75985O = new C19089av1();

    /* renamed from: P */
    public static final YG1 f75986P = new YG1();

    /* renamed from: Q */
    public static final C0527HT f75987Q = new C0527HT();

    /* renamed from: R */
    public static final C17541Ei0 f75988R = new C17541Ei0();

    /* renamed from: S */
    public static final XG1 f75989S = new XG1();

    /* renamed from: T */
    public static final C0872MT f75990T = new C0872MT();

    /* renamed from: U */
    public static final C19433cv1 f75991U = new C19433cv1();

    /* renamed from: V */
    public static final C18977aH1 f75992V = new C18977aH1();

    /* renamed from: W */
    public static final C0673JT f75993W = new C0673JT();

    /* renamed from: X */
    public static final ZG1 f75994X = new ZG1();

    /* renamed from: Y */
    public static final C1100PT f75995Y = new C1100PT();

    /* renamed from: Z */
    public static final C19499dH1 f75996Z = new C19499dH1();

    /* renamed from: a0 */
    public static final C1244RT f75997a0 = new C1244RT();

    /* renamed from: b0 */
    public static final C19843fH1 f75998b0 = new C19843fH1();

    /* renamed from: c0 */
    public static final C1180QT f75999c0 = new C1180QT();

    /* renamed from: d0 */
    public static final C17669Gi0 f76000d0 = new C17669Gi0();

    /* renamed from: e0 */
    public static final C19671eH1 f76001e0 = new C19671eH1();

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f76027a;

        /* renamed from: b */
        public String f76028b;

        /* renamed from: c */
        public String f76029c;

        /* renamed from: d */
        public JsonMode f76030d;

        /* renamed from: e */
        public int f76031e;

        /* renamed from: f */
        public Converter f76032f;

        /* renamed from: g */
        public Converter f76033g;

        /* renamed from: h */
        public Converter f76034h;

        /* renamed from: i */
        public Converter f76035i;

        /* renamed from: j */
        public Converter f76036j;

        /* renamed from: k */
        public Converter f76037k;

        /* renamed from: l */
        public Converter f76038l;

        /* renamed from: m */
        public Converter f76039m;

        /* renamed from: n */
        public Converter f76040n;

        /* renamed from: o */
        public Converter f76041o;

        /* renamed from: p */
        public Converter f76042p;

        /* renamed from: q */
        public Converter f76043q;

        /* renamed from: r */
        public Converter f76044r;

        /* renamed from: s */
        public Converter f76045s;

        /* renamed from: t */
        public Converter f76046t;

        /* renamed from: u */
        public Converter f76047u;

        /* renamed from: v */
        public Converter f76048v;

        public Builder binaryConverter(Converter<BsonBinary> converter) {
            this.f76035i = converter;
            return this;
        }

        public Builder booleanConverter(Converter<Boolean> converter) {
            this.f76036j = converter;
            return this;
        }

        public JsonWriterSettings build() {
            return new JsonWriterSettings(this);
        }

        public Builder dateTimeConverter(Converter<Long> converter) {
            this.f76034h = converter;
            return this;
        }

        public Builder decimal128Converter(Converter<Decimal128> converter) {
            this.f76040n = converter;
            return this;
        }

        public Builder doubleConverter(Converter<Double> converter) {
            this.f76037k = converter;
            return this;
        }

        public Builder indent(boolean z) {
            this.f76027a = z;
            return this;
        }

        public Builder indentCharacters(String str) {
            Assertions.notNull("indentCharacters", str);
            this.f76029c = str;
            return this;
        }

        public Builder int32Converter(Converter<Integer> converter) {
            this.f76038l = converter;
            return this;
        }

        public Builder int64Converter(Converter<Long> converter) {
            this.f76039m = converter;
            return this;
        }

        public Builder javaScriptConverter(Converter<String> converter) {
            this.f76048v = converter;
            return this;
        }

        public Builder maxKeyConverter(Converter<BsonMaxKey> converter) {
            this.f76047u = converter;
            return this;
        }

        public Builder maxLength(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.isTrueArgument("maxLength >= 0", z);
            this.f76031e = i;
            return this;
        }

        public Builder minKeyConverter(Converter<BsonMinKey> converter) {
            this.f76046t = converter;
            return this;
        }

        public Builder newLineCharacters(String str) {
            Assertions.notNull("newLineCharacters", str);
            this.f76028b = str;
            return this;
        }

        public Builder nullConverter(Converter<BsonNull> converter) {
            this.f76032f = converter;
            return this;
        }

        public Builder objectIdConverter(Converter<ObjectId> converter) {
            this.f76041o = converter;
            return this;
        }

        public Builder outputMode(JsonMode jsonMode) {
            Assertions.notNull("outputMode", jsonMode);
            this.f76030d = jsonMode;
            return this;
        }

        public Builder regularExpressionConverter(Converter<BsonRegularExpression> converter) {
            this.f76043q = converter;
            return this;
        }

        public Builder stringConverter(Converter<String> converter) {
            this.f76033g = converter;
            return this;
        }

        public Builder symbolConverter(Converter<String> converter) {
            this.f76044r = converter;
            return this;
        }

        public Builder timestampConverter(Converter<BsonTimestamp> converter) {
            this.f76042p = converter;
            return this;
        }

        public Builder undefinedConverter(Converter<BsonUndefined> converter) {
            this.f76045s = converter;
            return this;
        }

        public Builder() {
            this.f76028b = System.getProperty("line.separator");
            this.f76029c = "  ";
            this.f76030d = JsonMode.RELAXED;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public Converter<BsonBinary> getBinaryConverter() {
        return this.f76013j;
    }

    public Converter<Boolean> getBooleanConverter() {
        return this.f76014k;
    }

    public Converter<Long> getDateTimeConverter() {
        return this.f76012i;
    }

    public Converter<Decimal128> getDecimal128Converter() {
        return this.f76018o;
    }

    public Converter<Double> getDoubleConverter() {
        return this.f76015l;
    }

    public String getIndentCharacters() {
        return this.f76007d;
    }

    public Converter<Integer> getInt32Converter() {
        return this.f76016m;
    }

    public Converter<Long> getInt64Converter() {
        return this.f76017n;
    }

    public Converter<String> getJavaScriptConverter() {
        return this.f76026w;
    }

    public Converter<BsonMaxKey> getMaxKeyConverter() {
        return this.f76025v;
    }

    public int getMaxLength() {
        return this.f76008e;
    }

    public Converter<BsonMinKey> getMinKeyConverter() {
        return this.f76024u;
    }

    public String getNewLineCharacters() {
        return this.f76006c;
    }

    public Converter<BsonNull> getNullConverter() {
        return this.f76010g;
    }

    public Converter<ObjectId> getObjectIdConverter() {
        return this.f76019p;
    }

    public JsonMode getOutputMode() {
        return this.f76009f;
    }

    public Converter<BsonRegularExpression> getRegularExpressionConverter() {
        return this.f76021r;
    }

    public Converter<String> getStringConverter() {
        return this.f76011h;
    }

    public Converter<String> getSymbolConverter() {
        return this.f76022s;
    }

    public Converter<BsonTimestamp> getTimestampConverter() {
        return this.f76020q;
    }

    public Converter<BsonUndefined> getUndefinedConverter() {
        return this.f76023t;
    }

    public boolean isIndent() {
        return this.f76005b;
    }

    @Deprecated
    public JsonWriterSettings() {
        this(builder().outputMode(JsonMode.STRICT));
    }

    @Deprecated
    public JsonWriterSettings(JsonMode jsonMode) {
        this(builder().outputMode(jsonMode));
    }

    @Deprecated
    public JsonWriterSettings(boolean z) {
        this(builder().indent(z));
    }

    @Deprecated
    public JsonWriterSettings(JsonMode jsonMode, boolean z) {
        this(builder().outputMode(jsonMode).indent(z));
    }

    @Deprecated
    public JsonWriterSettings(JsonMode jsonMode, String str) {
        this(builder().outputMode(jsonMode).indent(true).indentCharacters(str));
    }

    @Deprecated
    public JsonWriterSettings(JsonMode jsonMode, String str, String str2) {
        this(builder().outputMode(jsonMode).indent(true).indentCharacters(str).newLineCharacters(str2));
    }

    public JsonWriterSettings(Builder builder) {
        this.f76005b = builder.f76027a;
        this.f76006c = builder.f76028b != null ? builder.f76028b : System.getProperty("line.separator");
        this.f76007d = builder.f76029c;
        JsonMode jsonMode = builder.f76030d;
        this.f76009f = jsonMode;
        this.f76008e = builder.f76031e;
        if (builder.f76032f != null) {
            this.f76010g = builder.f76032f;
        } else {
            this.f76010g = f76002x;
        }
        if (builder.f76033g != null) {
            this.f76011h = builder.f76033g;
        } else {
            this.f76011h = f76003y;
        }
        if (builder.f76036j != null) {
            this.f76014k = builder.f76036j;
        } else {
            this.f76014k = f76004z;
        }
        if (builder.f76037k != null) {
            this.f76015l = builder.f76037k;
        } else if (jsonMode == JsonMode.EXTENDED) {
            this.f76015l = f75972B;
        } else if (jsonMode == JsonMode.RELAXED) {
            this.f76015l = f75973C;
        } else {
            this.f76015l = f75971A;
        }
        if (builder.f76038l != null) {
            this.f76016m = builder.f76038l;
        } else if (jsonMode == JsonMode.EXTENDED) {
            this.f76016m = f75975E;
        } else {
            this.f76016m = f75974D;
        }
        if (builder.f76044r != null) {
            this.f76022s = builder.f76044r;
        } else {
            this.f76022s = f75976F;
        }
        if (builder.f76048v != null) {
            this.f76026w = builder.f76048v;
        } else {
            this.f76026w = new C20250hh0();
        }
        if (builder.f76046t != null) {
            this.f76024u = builder.f76046t;
        } else if (jsonMode != JsonMode.STRICT && jsonMode != JsonMode.EXTENDED && jsonMode != JsonMode.RELAXED) {
            this.f76024u = f75978H;
        } else {
            this.f76024u = f75977G;
        }
        if (builder.f76047u != null) {
            this.f76025v = builder.f76047u;
        } else if (jsonMode != JsonMode.STRICT && jsonMode != JsonMode.EXTENDED && jsonMode != JsonMode.RELAXED) {
            this.f76025v = f75980J;
        } else {
            this.f76025v = f75979I;
        }
        if (builder.f76045s != null) {
            this.f76023t = builder.f76045s;
        } else if (jsonMode != JsonMode.STRICT && jsonMode != JsonMode.EXTENDED && jsonMode != JsonMode.RELAXED) {
            this.f76023t = f75982L;
        } else {
            this.f76023t = f75981K;
        }
        if (builder.f76034h != null) {
            this.f76012i = builder.f76034h;
        } else if (jsonMode == JsonMode.STRICT) {
            this.f76012i = f75983M;
        } else if (jsonMode == JsonMode.EXTENDED) {
            this.f76012i = f75984N;
        } else if (jsonMode == JsonMode.RELAXED) {
            this.f76012i = f75985O;
        } else {
            this.f76012i = f75986P;
        }
        if (builder.f76035i != null) {
            this.f76013j = builder.f76035i;
        } else if (jsonMode == JsonMode.STRICT) {
            this.f76013j = f75988R;
        } else if (jsonMode != JsonMode.EXTENDED && jsonMode != JsonMode.RELAXED) {
            this.f76013j = f75989S;
        } else {
            this.f76013j = f75987Q;
        }
        if (builder.f76039m != null) {
            this.f76017n = builder.f76039m;
        } else if (jsonMode != JsonMode.STRICT && jsonMode != JsonMode.EXTENDED) {
            if (jsonMode == JsonMode.RELAXED) {
                this.f76017n = f75991U;
            } else {
                this.f76017n = f75992V;
            }
        } else {
            this.f76017n = f75990T;
        }
        if (builder.f76040n != null) {
            this.f76018o = builder.f76040n;
        } else if (jsonMode != JsonMode.STRICT && jsonMode != JsonMode.EXTENDED && jsonMode != JsonMode.RELAXED) {
            this.f76018o = f75994X;
        } else {
            this.f76018o = f75993W;
        }
        if (builder.f76041o != null) {
            this.f76019p = builder.f76041o;
        } else if (jsonMode != JsonMode.STRICT && jsonMode != JsonMode.EXTENDED && jsonMode != JsonMode.RELAXED) {
            this.f76019p = f75996Z;
        } else {
            this.f76019p = f75995Y;
        }
        if (builder.f76042p != null) {
            this.f76020q = builder.f76042p;
        } else if (jsonMode != JsonMode.STRICT && jsonMode != JsonMode.EXTENDED && jsonMode != JsonMode.RELAXED) {
            this.f76020q = f75998b0;
        } else {
            this.f76020q = f75997a0;
        }
        if (builder.f76043q != null) {
            this.f76021r = builder.f76043q;
        } else if (jsonMode != JsonMode.EXTENDED && jsonMode != JsonMode.RELAXED) {
            if (jsonMode == JsonMode.STRICT) {
                this.f76021r = f76000d0;
            } else {
                this.f76021r = f76001e0;
            }
        } else {
            this.f76021r = f75999c0;
        }
    }
}
