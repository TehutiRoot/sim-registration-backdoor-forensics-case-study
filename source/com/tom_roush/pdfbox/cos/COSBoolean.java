package com.tom_roush.pdfbox.cos;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class COSBoolean extends COSBase {

    /* renamed from: b */
    public final boolean f59727b;
    public static final byte[] TRUE_BYTES = {116, 114, 117, 101};
    public static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};
    public static final COSBoolean TRUE = new COSBoolean(true);
    public static final COSBoolean FALSE = new COSBoolean(false);

    public COSBoolean(boolean z) {
        this.f59727b = z;
    }

    public static COSBoolean getBoolean(boolean z) {
        return z ? TRUE : FALSE;
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        return iCOSVisitor.visitFromBoolean(this);
    }

    public boolean getValue() {
        return this.f59727b;
    }

    public Boolean getValueAsObject() {
        if (this.f59727b) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public String toString() {
        return String.valueOf(this.f59727b);
    }

    public void writePDF(OutputStream outputStream) throws IOException {
        if (this.f59727b) {
            outputStream.write(TRUE_BYTES);
        } else {
            outputStream.write(FALSE_BYTES);
        }
    }

    public static COSBoolean getBoolean(Boolean bool) {
        return getBoolean(bool.booleanValue());
    }
}
