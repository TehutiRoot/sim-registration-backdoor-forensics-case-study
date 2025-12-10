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
    public final Writer f76049a;

    /* renamed from: b */
    public final StrictCharacterStreamJsonWriterSettings f76050b;

    /* renamed from: c */
    public C12939a f76051c = new C12939a(null, JsonContextType.TOP_LEVEL, "");

    /* renamed from: d */
    public State f76052d = State.INITIAL;

    /* renamed from: e */
    public int f76053e;

    /* renamed from: f */
    public boolean f76054f;

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
        public final C12939a f76055a;

        /* renamed from: b */
        public final JsonContextType f76056b;

        /* renamed from: c */
        public final String f76057c;

        /* renamed from: d */
        public boolean f76058d;

        public C12939a(C12939a c12939a, JsonContextType jsonContextType, String str) {
            this.f76055a = c12939a;
            this.f76056b = jsonContextType;
            if (c12939a != null) {
                str = c12939a.f76057c + str;
            }
            this.f76057c = str;
        }
    }

    public StrictCharacterStreamJsonWriter(Writer writer, StrictCharacterStreamJsonWriterSettings strictCharacterStreamJsonWriterSettings) {
        this.f76049a = writer;
        this.f76050b = strictCharacterStreamJsonWriterSettings;
    }

    /* renamed from: a */
    public final void m24096a(State state) {
        if (this.f76052d == state) {
            return;
        }
        throw new BsonInvalidOperationException("Invalid state " + this.f76052d);
    }

    /* renamed from: b */
    public void m24095b() {
        try {
            this.f76049a.flush();
        } catch (IOException e) {
            m24091f(e);
        }
    }

    /* renamed from: c */
    public Writer m24094c() {
        return this.f76049a;
    }

    /* renamed from: d */
    public final void m24093d() {
        if (this.f76051c.f76056b == JsonContextType.ARRAY) {
            if (this.f76051c.f76058d) {
                m24089h(",");
            }
            if (this.f76050b.isIndent()) {
                m24089h(this.f76050b.getNewLineCharacters());
                m24089h(this.f76051c.f76057c);
            } else if (this.f76051c.f76058d) {
                m24089h(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            }
        }
        this.f76051c.f76058d = true;
    }

    /* renamed from: e */
    public final void m24092e() {
        if (this.f76051c.f76056b == JsonContextType.ARRAY) {
            this.f76052d = State.VALUE;
        } else {
            this.f76052d = State.NAME;
        }
    }

    /* renamed from: f */
    public final void m24091f(IOException iOException) {
        throw new BSONException("Wrapping IOException", iOException);
    }

    /* renamed from: g */
    public final void m24090g(char c) {
        try {
            if (this.f76050b.getMaxLength() != 0 && this.f76053e >= this.f76050b.getMaxLength()) {
                this.f76054f = true;
            }
            this.f76049a.write(c);
            this.f76053e++;
        } catch (IOException e) {
            m24091f(e);
        }
    }

    public int getCurrentLength() {
        return this.f76053e;
    }

    /* renamed from: h */
    public final void m24089h(String str) {
        try {
            if (this.f76050b.getMaxLength() != 0 && str.length() + this.f76053e >= this.f76050b.getMaxLength()) {
                this.f76049a.write(str.substring(0, this.f76050b.getMaxLength() - this.f76053e));
                this.f76053e = this.f76050b.getMaxLength();
                this.f76054f = true;
            }
            this.f76049a.write(str);
            this.f76053e += str.length();
        } catch (IOException e) {
            m24091f(e);
        }
    }

    /* renamed from: i */
    public final void m24088i(String str) {
        m24090g('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt != '\"') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case '\b':
                                    m24089h("\\b");
                                    continue;
                                case '\t':
                                    m24089h("\\t");
                                    continue;
                                case '\n':
                                    m24089h("\\n");
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
                                                        m24089h("\\u");
                                                        m24089h(Integer.toHexString((61440 & charAt) >> 12));
                                                        m24089h(Integer.toHexString((charAt & 3840) >> 8));
                                                        m24089h(Integer.toHexString((charAt & 240) >> 4));
                                                        m24089h(Integer.toHexString(charAt & 15));
                                                        continue;
                                                }
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                                m24090g(charAt);
                                                break;
                                        }
                                    }
                                    m24090g(charAt);
                                    break;
                            }
                        } else {
                            m24089h("\\\\");
                        }
                    } else {
                        m24089h("\\\"");
                    }
                } else {
                    m24089h("\\r");
                }
            } else {
                m24089h("\\f");
            }
        }
        m24090g('\"');
    }

    @Override // org.bson.json.StrictJsonWriter
    public boolean isTruncated() {
        return this.f76054f;
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeBoolean(String str, boolean z) {
        Assertions.notNull("name", str);
        writeName(str);
        writeBoolean(z);
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeEndArray() {
        m24096a(State.VALUE);
        if (this.f76051c.f76056b == JsonContextType.ARRAY) {
            if (this.f76050b.isIndent() && this.f76051c.f76058d) {
                m24089h(this.f76050b.getNewLineCharacters());
                m24089h(this.f76051c.f76055a.f76057c);
            }
            m24089h("]");
            C12939a c12939a = this.f76051c.f76055a;
            this.f76051c = c12939a;
            if (c12939a.f76056b == JsonContextType.TOP_LEVEL) {
                this.f76052d = State.DONE;
                return;
            } else {
                m24092e();
                return;
            }
        }
        throw new BsonInvalidOperationException("Can't end an array if not in an array");
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeEndObject() {
        m24096a(State.NAME);
        if (this.f76050b.isIndent() && this.f76051c.f76058d) {
            m24089h(this.f76050b.getNewLineCharacters());
            m24089h(this.f76051c.f76055a.f76057c);
        }
        m24089h("}");
        C12939a c12939a = this.f76051c.f76055a;
        this.f76051c = c12939a;
        if (c12939a.f76056b == JsonContextType.TOP_LEVEL) {
            this.f76052d = State.DONE;
        } else {
            m24092e();
        }
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeName(String str) {
        Assertions.notNull("name", str);
        m24096a(State.NAME);
        if (this.f76051c.f76058d) {
            m24089h(",");
        }
        if (this.f76050b.isIndent()) {
            m24089h(this.f76050b.getNewLineCharacters());
            m24089h(this.f76051c.f76057c);
        } else if (this.f76051c.f76058d) {
            m24089h(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        }
        m24088i(str);
        m24089h(": ");
        this.f76052d = State.VALUE;
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
        m24096a(State.VALUE);
        m24093d();
        m24089h(AbstractJsonLexerKt.NULL);
        m24092e();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartArray() {
        m24093d();
        m24089h("[");
        this.f76051c = new C12939a(this.f76051c, JsonContextType.ARRAY, this.f76050b.getIndentCharacters());
        this.f76052d = State.VALUE;
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeStartObject() {
        State state = this.f76052d;
        if (state != State.INITIAL && state != State.VALUE) {
            throw new BsonInvalidOperationException("Invalid state " + this.f76052d);
        }
        m24093d();
        m24089h("{");
        this.f76051c = new C12939a(this.f76051c, JsonContextType.DOCUMENT, this.f76050b.getIndentCharacters());
        this.f76052d = State.NAME;
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeBoolean(boolean z) {
        m24096a(State.VALUE);
        m24093d();
        m24089h(z ? "true" : "false");
        m24092e();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeNumber(String str) {
        Assertions.notNull("value", str);
        m24096a(State.VALUE);
        m24093d();
        m24089h(str);
        m24092e();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeRaw(String str) {
        Assertions.notNull("value", str);
        m24096a(State.VALUE);
        m24093d();
        m24089h(str);
        m24092e();
    }

    @Override // org.bson.json.StrictJsonWriter
    public void writeString(String str) {
        Assertions.notNull("value", str);
        m24096a(State.VALUE);
        m24093d();
        m24088i(str);
        m24092e();
    }
}
