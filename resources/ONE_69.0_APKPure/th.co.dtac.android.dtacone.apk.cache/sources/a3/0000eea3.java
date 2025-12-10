package org.apache.commons.cli;

import java.util.function.Supplier;

/* loaded from: classes6.dex */
public final class DeprecatedAttributes {

    /* renamed from: d */
    public static final DeprecatedAttributes f73049d = new DeprecatedAttributes("", "", false);

    /* renamed from: a */
    public final String f73050a;

    /* renamed from: b */
    public final boolean f73051b;

    /* renamed from: c */
    public final String f73052c;

    /* loaded from: classes6.dex */
    public static class Builder implements Supplier<DeprecatedAttributes> {

        /* renamed from: a */
        public String f73053a;

        /* renamed from: b */
        public boolean f73054b;

        /* renamed from: c */
        public String f73055c;

        public Builder setDescription(String str) {
            this.f73053a = str;
            return this;
        }

        public Builder setForRemoval(boolean z) {
            this.f73054b = z;
            return this;
        }

        public Builder setSince(String str) {
            this.f73055c = str;
            return this;
        }

        @Override // java.util.function.Supplier
        public DeprecatedAttributes get() {
            return new DeprecatedAttributes(this.f73053a, this.f73055c, this.f73054b);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: a */
    public final String m25916a(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getDescription() {
        return this.f73050a;
    }

    public String getSince() {
        return this.f73052c;
    }

    public boolean isForRemoval() {
        return this.f73051b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Deprecated");
        if (this.f73051b) {
            sb.append(" for removal");
        }
        if (!this.f73052c.isEmpty()) {
            sb.append(" since ");
            sb.append(this.f73052c);
        }
        if (!this.f73050a.isEmpty()) {
            sb.append(": ");
            sb.append(this.f73050a);
        }
        return sb.toString();
    }

    public DeprecatedAttributes(String str, String str2, boolean z) {
        this.f73050a = m25916a(str);
        this.f73052c = m25916a(str2);
        this.f73051b = z;
    }
}