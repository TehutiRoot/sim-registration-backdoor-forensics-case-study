package org.bson.json;

import org.bson.assertions.Assertions;

/* loaded from: classes4.dex */
public final class StrictCharacterStreamJsonWriterSettings {

    /* renamed from: a */
    public final boolean f76143a;

    /* renamed from: b */
    public final String f76144b;

    /* renamed from: c */
    public final String f76145c;

    /* renamed from: d */
    public final int f76146d;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f76147a;

        /* renamed from: b */
        public String f76148b;

        /* renamed from: c */
        public String f76149c;

        /* renamed from: d */
        public int f76150d;

        public StrictCharacterStreamJsonWriterSettings build() {
            return new StrictCharacterStreamJsonWriterSettings(this);
        }

        public Builder indent(boolean z) {
            this.f76147a = z;
            return this;
        }

        public Builder indentCharacters(String str) {
            Assertions.notNull("indentCharacters", str);
            this.f76149c = str;
            return this;
        }

        public Builder maxLength(int i) {
            this.f76150d = i;
            return this;
        }

        public Builder newLineCharacters(String str) {
            Assertions.notNull("newLineCharacters", str);
            this.f76148b = str;
            return this;
        }

        public Builder() {
            this.f76148b = System.getProperty("line.separator");
            this.f76149c = "  ";
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getIndentCharacters() {
        return this.f76145c;
    }

    public int getMaxLength() {
        return this.f76146d;
    }

    public String getNewLineCharacters() {
        return this.f76144b;
    }

    public boolean isIndent() {
        return this.f76143a;
    }

    public StrictCharacterStreamJsonWriterSettings(Builder builder) {
        this.f76143a = builder.f76147a;
        this.f76144b = builder.f76148b != null ? builder.f76148b : System.getProperty("line.separator");
        this.f76145c = builder.f76149c;
        this.f76146d = builder.f76150d;
    }
}