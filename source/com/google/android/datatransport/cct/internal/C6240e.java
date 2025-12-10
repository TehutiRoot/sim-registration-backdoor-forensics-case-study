package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExternalPRequestContext;

/* renamed from: com.google.android.datatransport.cct.internal.e */
/* loaded from: classes3.dex */
public final class C6240e extends ExternalPRequestContext {

    /* renamed from: a */
    public final Integer f43966a;

    /* renamed from: com.google.android.datatransport.cct.internal.e$b */
    /* loaded from: classes3.dex */
    public static final class C6242b extends ExternalPRequestContext.Builder {

        /* renamed from: a */
        public Integer f43967a;

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext build() {
            return new C6240e(this.f43967a);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext.Builder setOriginAssociatedProductId(Integer num) {
            this.f43967a = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.f43966a;
        Integer originAssociatedProductId = ((ExternalPRequestContext) obj).getOriginAssociatedProductId();
        if (num == null) {
            if (originAssociatedProductId == null) {
                return true;
            }
            return false;
        }
        return num.equals(originAssociatedProductId);
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public Integer getOriginAssociatedProductId() {
        return this.f43966a;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f43966a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f43966a + "}";
    }

    public C6240e(Integer num) {
        this.f43966a = num;
    }
}
