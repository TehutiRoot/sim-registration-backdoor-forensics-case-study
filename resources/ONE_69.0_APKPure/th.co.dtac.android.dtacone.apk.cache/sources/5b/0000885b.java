package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    /* loaded from: classes3.dex */
    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String reverse = this._t1.reverse(str);
            if (reverse != null) {
                return this._t2.reverse(reverse);
            }
            return reverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    /* loaded from: classes3.dex */
    public static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$a */
    /* loaded from: classes3.dex */
    public static class C6132a extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f43480a;

        /* renamed from: b */
        public final /* synthetic */ String f43481b;

        public C6132a(String str, String str2) {
            this.f43480a = str;
            this.f43481b = str2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.startsWith(this.f43480a)) {
                String substring = str.substring(this.f43480a.length());
                if (substring.endsWith(this.f43481b)) {
                    return substring.substring(0, substring.length() - this.f43481b.length());
                }
                return null;
            }
            return null;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.f43480a + "','" + this.f43481b + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f43480a + str + this.f43481b;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$b */
    /* loaded from: classes3.dex */
    public static class C6133b extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f43482a;

        public C6133b(String str) {
            this.f43482a = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.startsWith(this.f43482a)) {
                return str.substring(this.f43482a.length());
            }
            return null;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.f43482a + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f43482a + str;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$c */
    /* loaded from: classes3.dex */
    public static class C6134c extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f43483a;

        public C6134c(String str) {
            this.f43483a = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.endsWith(this.f43483a)) {
                return str.substring(0, str.length() - this.f43483a.length());
            }
            return null;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.f43483a + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str + this.f43483a;
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (str != null && str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (str2 != null && str2.length() > 0) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                return new C6132a(str, str2);
            }
            return new C6133b(str);
        } else if (z2) {
            return new C6134c(str2);
        } else {
            return NOP;
        }
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}