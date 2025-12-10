package com.google.gson;

import java.util.Objects;

/* loaded from: classes4.dex */
public class FormattingStyle {
    public static final FormattingStyle COMPACT = new FormattingStyle("", "", false);
    public static final FormattingStyle PRETTY = new FormattingStyle("\n", "  ", true);

    /* renamed from: a */
    public final String f56649a;

    /* renamed from: b */
    public final String f56650b;

    /* renamed from: c */
    public final boolean f56651c;

    public FormattingStyle(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f56649a = str;
                this.f56650b = str2;
                this.f56651c = z;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }

    public String getIndent() {
        return this.f56650b;
    }

    public String getNewline() {
        return this.f56649a;
    }

    public boolean usesSpaceAfterSeparators() {
        return this.f56651c;
    }

    public FormattingStyle withIndent(String str) {
        return new FormattingStyle(this.f56649a, str, this.f56651c);
    }

    public FormattingStyle withNewline(String str) {
        return new FormattingStyle(str, this.f56650b, this.f56651c);
    }

    public FormattingStyle withSpaceAfterSeparators(boolean z) {
        return new FormattingStyle(this.f56649a, this.f56650b, z);
    }
}