package p000;

import com.google.android.datatransport.ProductData;

/* renamed from: O8 */
/* loaded from: classes3.dex */
public final class C0983O8 extends ProductData {

    /* renamed from: a */
    public final Integer f4372a;

    public C0983O8(Integer num) {
        this.f4372a = num;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProductData)) {
            return false;
        }
        Integer num = this.f4372a;
        Integer productId = ((ProductData) obj).getProductId();
        if (num == null) {
            if (productId == null) {
                return true;
            }
            return false;
        }
        return num.equals(productId);
    }

    @Override // com.google.android.datatransport.ProductData
    public Integer getProductId() {
        return this.f4372a;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f4372a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f4372a + "}";
    }
}