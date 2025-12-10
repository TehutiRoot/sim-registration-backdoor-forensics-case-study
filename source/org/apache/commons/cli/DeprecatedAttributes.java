package org.apache.commons.cli;

import java.util.function.Supplier;

/* loaded from: classes6.dex */
public final class DeprecatedAttributes {

    /* renamed from: d */
    public static final DeprecatedAttributes f72965d = new DeprecatedAttributes("", "", false);

    /* renamed from: a */
    public final String f72966a;

    /* renamed from: b */
    public final boolean f72967b;

    /* renamed from: c */
    public final String f72968c;

    /* loaded from: classes6.dex */
    public static class Builder implements Supplier<DeprecatedAttributes> {

        /* renamed from: a */
        public String f72969a;

        /* renamed from: b */
        public boolean f72970b;

        /* renamed from: c */
        public String f72971c;

        public Builder setDescription(String str) {
            this.f72969a = str;
            return this;
        }

        public Builder setForRemoval(boolean z) {
            this.f72970b = z;
            return this;
        }

        public Builder setSince(String str) {
            this.f72971c = str;
            return this;
        }

        @Override // java.util.function.Supplier
        public DeprecatedAttributes get() {
            return new DeprecatedAttributes(this.f72969a, this.f72971c, this.f72970b);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: a */
    public final String m25726a(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getDescription() {
        return this.f72966a;
    }

    public String getSince() {
        return this.f72968c;
    }

    public boolean isForRemoval() {
        return this.f72967b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Deprecated");
        if (this.f72967b) {
            sb.append(" for removal");
        }
        if (!this.f72968c.isEmpty()) {
            sb.append(" since ");
            sb.append(this.f72968c);
        }
        if (!this.f72966a.isEmpty()) {
            sb.append(": ");
            sb.append(this.f72966a);
        }
        return sb.toString();
    }

    public DeprecatedAttributes(String str, String str2, boolean z) {
        this.f72966a = m25726a(str);
        this.f72968c = m25726a(str2);
        this.f72967b = z;
    }
}
