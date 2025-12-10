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
    public static class C6143a extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f43468a;

        /* renamed from: b */
        public final /* synthetic */ String f43469b;

        public C6143a(String str, String str2) {
            this.f43468a = str;
            this.f43469b = str2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.startsWith(this.f43468a)) {
                String substring = str.substring(this.f43468a.length());
                if (substring.endsWith(this.f43469b)) {
                    return substring.substring(0, substring.length() - this.f43469b.length());
                }
                return null;
            }
            return null;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.f43468a + "','" + this.f43469b + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f43468a + str + this.f43469b;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$b */
    /* loaded from: classes3.dex */
    public static class C6144b extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f43470a;

        public C6144b(String str) {
            this.f43470a = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.startsWith(this.f43470a)) {
                return str.substring(this.f43470a.length());
            }
            return null;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.f43470a + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this.f43470a + str;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$c */
    /* loaded from: classes3.dex */
    public static class C6145c extends NameTransformer {

        /* renamed from: a */
        public final /* synthetic */ String f43471a;

        public C6145c(String str) {
            this.f43471a = str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            if (str.endsWith(this.f43471a)) {
                return str.substring(0, str.length() - this.f43471a.length());
            }
            return null;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.f43471a + "')]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str + this.f43471a;
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
                return new C6143a(str, str2);
            }
            return new C6144b(str);
        } else if (z2) {
            return new C6145c(str2);
        } else {
            return NOP;
        }
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}
