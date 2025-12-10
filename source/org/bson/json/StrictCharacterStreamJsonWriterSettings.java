package org.bson.json;

import org.bson.assertions.Assertions;

/* loaded from: classes4.dex */
public final class StrictCharacterStreamJsonWriterSettings {

    /* renamed from: a */
    public final boolean f76059a;

    /* renamed from: b */
    public final String f76060b;

    /* renamed from: c */
    public final String f76061c;

    /* renamed from: d */
    public final int f76062d;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f76063a;

        /* renamed from: b */
        public String f76064b;

        /* renamed from: c */
        public String f76065c;

        /* renamed from: d */
        public int f76066d;

        public StrictCharacterStreamJsonWriterSettings build() {
            return new StrictCharacterStreamJsonWriterSettings(this);
        }

        public Builder indent(boolean z) {
            this.f76063a = z;
            return this;
        }

        public Builder indentCharacters(String str) {
            Assertions.notNull("indentCharacters", str);
            this.f76065c = str;
            return this;
        }

        public Builder maxLength(int i) {
            this.f76066d = i;
            return this;
        }

        public Builder newLineCharacters(String str) {
            Assertions.notNull("newLineCharacters", str);
            this.f76064b = str;
            return this;
        }

        public Builder() {
            this.f76064b = System.getProperty("line.separator");
            this.f76065c = "  ";
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getIndentCharacters() {
        return this.f76061c;
    }

    public int getMaxLength() {
        return this.f76062d;
    }

    public String getNewLineCharacters() {
        return this.f76060b;
    }

    public boolean isIndent() {
        return this.f76059a;
    }

    public StrictCharacterStreamJsonWriterSettings(Builder builder) {
        this.f76059a = builder.f76063a;
        this.f76060b = builder.f76064b != null ? builder.f76064b : System.getProperty("line.separator");
        this.f76061c = builder.f76065c;
        this.f76062d = builder.f76066d;
    }
}
