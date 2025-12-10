package org.bson.json;

import java.io.IOException;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.cli.HelpFormatter;
import org.bson.BSONException;
import org.bson.BsonInvalidOperationException;
import org.bson.assertions.Assertions;

/* loaded from: classes4.dex */
public final class StrictCharacterStreamJsonWriter implements StrictJsonWriter {

    /* renamed from: a */
    public final Writer f76133a;

    /* renamed from: b */
    public final StrictCharacterStreamJsonWriterSettings f76134b;

    /* renamed from: c */
    public C12939a f76135c = new C12939a(null, JsonContextType.TOP_LEVEL, "");

    /* renamed from: d */
    public State f76136d = State.INITIAL;

    /* renamed from: e */
    public int f76137e;

    /* renamed from: f */
    public boolean f76138f;

    /* loaded from: classes4.dex */
    public enum JsonContextType {
        TOP_LEVEL,
        DOCUMENT,
        ARRAY
    }

    /* loaded from: classes4.dex */
    public enum State {
        INITIAL,
        NAME,
        VALUE,
        DONE
    }

    /* renamed from: org.bson.json.StrictCharacterStreamJsonWriter$a */
    /* loaded from: classes4.dex */
    public static class C12939a {

        /* renamed from: a */
        public final C12939a f76139a;

        /* renamed from: b */
        public final JsonContextType f76140b;

        /* renamed from: c */
        public final String f76141c;

        /* renamed from: d */
        public boolean f76142d;

        public C12939a(C12939a c12939a, JsonContextType jsonContextType, String str) {
            this.f76139a = c12939a;
            this.f76140b = jsonContextType;
            if (c12939a != null) {
                str = c12939a.f76141c + str;
            }
            this.f76141c = str;
        }
    }

    public StrictCharacterStreamJsonWriter(Writer writer, StrictCharacterStreamJsonWriterSettings strictCharacterStreamJsonWriterSettings) {
        this.f76133a = writer;
        this.f76134b = strictCharacterStreamJsonWriterSettings;
    }

    /* renamed from: a */
    public final void m24285a(State state) {
        if (this.f76136d == state) {
            return;
        }
        throw new BsonInvalidOperationException("Invalid state " + this.f76136d);
    }

    /* renamed from: b */
    public void m24284b() {
        try {
            this.f76133a.flush();
        } catch (IOException e) {
            m24280f(e);
        }
    }

    /* renamed from: c */
    public Writer m24283c() {
        return this.f76133a;
    }

    /* renamed from: d */
    public final void m24282d() {
        if (this.f76135c.f76140b == JsonContextType.ARRAY) {
            if (this.f76135c.f76142d) {
                m24278h(",");
            }
            if (this.f76134b.isIndent()) {
                m24278h(this.f76134b.getNewLineCharacters());
                m24278h(this.f76135c.f76141c);
            } else if (this.f76135c.f76142d) {
                m24278h(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            }
        }
        this.f76135c.f76142d = true;
    }

    /* renamed from: e */
    public final void m24281e() {
        if (this.f76135c.f76140b == JsonContextType.ARRAY) {
            this.f76136d = State.VALUE;
        } else {
            this.f76136d = State.NAME;
        }
    }

    /* renamed from: f */
    public final void m24280f(IOException iOException) {
        throw new BSONException("Wrapping IOException", iOException);
    }

    /* renamed from: g */
    public final void m24279g(char c) {
        try {
            if (this.f76134b.getMaxLength() != 0 && this.f76137e >= this.f76134b.getMaxLength()) {
                this.f76138f = true;
            }
            this.f76133a.write(c);
            this.f76137e++;
        } catch (IOException e) {
            m24280f(e);
        }
    }

    public int getCurrentLength() {
        return this.f76137e;
    }

    /* renamed from: h */
    public final void m24278h(String str) {
        try {
            if (this.f76134b.getMaxLength() != 0 && str.length() + this.f76137e >= this.f76134b.getMaxLength()) {
                this.f76133a.write(str.substring(0, this.f76134b.getMaxLength() - this.f76137e));
                this.f76137e = this.f76134b.getMaxLength();
                this.f76138f = true;
            }
            this.f76133a.write(str);
            this.f76137e += str.length();
        } catch (IOException e) {
            m24280f(e);
        }
    }

    /* renamed from: i */
    public final void m24277i(String str) {
        m24279g('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case '\b':
                                    m24278h("\\b");
                                    continue;
                                case '\t':
                                    m24278h("\\t");
                                    continue;
                                case '\n':
                                    m24278h("\\n");
                                    continue;
                                default:
                                    int type = Character.getType(charAt);
                                    if (type != 1 && type != 2 && type != 3 && type != 5) {
                                        switch (type) {
                                            default:
                                                switch (type) {
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                        break;
                                                    default:
                                                        m24278h("\\u");
                                                        m24278h(Integer.toHexString((61440 & charAt) >> 12));
                                                        m24278h(Integer.toHexString((charAt & 3840) >> 8));
                                                        m24278h(Integer.toHexString((charAt & 240) >> 4));
                                                        m24278h(Integer.toHexString(charAt & 15));
                                                        continue;
                                                }
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                                m24279g(charAt);
                                                break;
                                        }
                                    }
                                    m24279g(charAt);
                                    break;
                            }
                        } else {
                            m24278h("\\\\");
                        }
                    } else {
                        m24278h("\\\"");
                    }
                } else {
                    m24278h("\\r");
                }
            } else {
                m24278h("\\f");
            }
        }
        m24279g('\"');
    }

    @Override // org.bson.json.StrictJsonWriter
    public boolean isTruncated() {
        return this.f76138f;
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeBoolean(String str, boolean z) {
        Assertions.notNull("name", str);
        writeName(str);
        writeBoolean(z);
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeEndArray() {
        m24285a(State.VALUE);
        if (this.f76135c.f76140b == JsonContextType.ARRAY) {
            if (this.f76134b.isIndent() && this.f76135c.f76142d) {
                m24278h(this.f76134b.getNewLineCharacters());
                m24278h(this.f76135c.f76139a.f76141c);
            }
            m24278h("]");
            C12939a c12939a = this.f76135c.f76139a;
            this.f76135c = c12939a;
            if (c12939a.f76140b == JsonContextType.TOP_LEVEL) {
                this.f76136d = State.DONE;
                return;
            } else {
                m24281e();
                return;
            }
        }
        throw new BsonInvalidOperationException("Can't end an array if not in an array");
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeEndObject() {
        m24285a(State.NAME);
        if (this.f76134b.isIndent() && this.f76135c.f76142d) {
            m24278h(this.f76134b.getNewLineCharacters());
            m24278h(this.f76135c.f76139a.f76141c);
        }
        m24278h("}");
        C12939a c12939a = this.f76135c.f76139a;
        this.f76135c = c12939a;
        if (c12939a.f76140b == JsonContextType.TOP_LEVEL) {
            this.f76136d = State.DONE;
        } else {
            m24281e();
        }
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeName(String str) {
        Assertions.notNull("name", str);
        m24285a(State.NAME);
        if (this.f76135c.f76142d) {
            m24278h(",");
        }
        if (this.f76134b.isIndent()) {
            m24278h(this.f76134b.getNewLineCharacters());
            m24278h(this.f76135c.f76141c);
        } else if (this.f76135c.f76142d) {
            m24278h(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        m24277i(str);
        m24278h(": ");
        this.f76136d = State.VALUE;
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNull(String str) {
        writeName(str);
        writeNull();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNumber(String str, String str2) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", str2);
        writeName(str);
        writeNumber(str2);
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeRaw(String str, String str2) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", str2);
        writeName(str);
        writeRaw(str2);
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartArray(String str) {
        writeName(str);
        writeStartArray();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartObject(String str) {
        writeName(str);
        writeStartObject();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeString(String str, String str2) {
        Assertions.notNull("name", str);
        Assertions.notNull("value", str2);
        writeName(str);
        writeString(str2);
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNull() {
        m24285a(State.VALUE);
        m24282d();
        m24278h(AbstractJsonLexerKt.NULL);
        m24281e();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartArray() {
        m24282d();
        m24278h("[");
        this.f76135c = new C12939a(this.f76135c, JsonContextType.ARRAY, this.f76134b.getIndentCharacters());
        this.f76136d = State.VALUE;
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartObject() {
        State state = this.f76136d;
        if (state != State.INITIAL && state != State.VALUE) {
            throw new BsonInvalidOperationException("Invalid state " + this.f76136d);
        }
        m24282d();
        m24278h("{");
        this.f76135c = new C12939a(this.f76135c, JsonContextType.DOCUMENT, this.f76134b.getIndentCharacters());
        this.f76136d = State.NAME;
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeBoolean(boolean z) {
        m24285a(State.VALUE);
        m24282d();
        m24278h(z ? "true" : "false");
        m24281e();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNumber(String str) {
        Assertions.notNull("value", str);
        m24285a(State.VALUE);
        m24282d();
        m24278h(str);
        m24281e();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeRaw(String str) {
        Assertions.notNull("value", str);
        m24285a(State.VALUE);
        m24282d();
        m24278h(str);
        m24281e();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeString(String str) {
        Assertions.notNull("value", str);
        m24285a(State.VALUE);
        m24282d();
        m24277i(str);
        m24281e();
    }
}