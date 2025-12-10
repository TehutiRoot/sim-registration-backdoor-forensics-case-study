package com.google.gson;

import java.util.Objects;

/* loaded from: classes4.dex */
public class FormattingStyle {
    public static final FormattingStyle COMPACT = new FormattingStyle("", "", false);
    public static final FormattingStyle PRETTY = new FormattingStyle("\n", "  ", true);

    /* renamed from: a */
    public final String f56637a;

    /* renamed from: b */
    public final String f56638b;

    /* renamed from: c */
    public final boolean f56639c;

    public FormattingStyle(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f56637a = str;
                this.f56638b = str2;
                this.f56639c = z;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }

    public String getIndent() {
        return this.f56638b;
    }

    public String getNewline() {
        return this.f56637a;
    }

    public boolean usesSpaceAfterSeparators() {
        return this.f56639c;
    }

    public FormattingStyle withIndent(String str) {
        return new FormattingStyle(this.f56637a, str, this.f56639c);
    }

    public FormattingStyle withNewline(String str) {
        return new FormattingStyle(str, this.f56638b, this.f56639c);
    }

    public FormattingStyle withSpaceAfterSeparators(boolean z) {
        return new FormattingStyle(this.f56637a, this.f56638b, z);
    }
}
