package com.tom_roush.pdfbox.pdmodel.font.encoding;

import com.tom_roush.pdfbox.cos.COSBase;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes5.dex */
public class MacOSRomanEncoding extends MacRomanEncoding {

    /* renamed from: b */
    public static final Object[][] f60452b = {new Object[]{255, "notequal"}, new Object[]{260, "infinity"}, new Object[]{262, "lessequal"}, new Object[]{263, "greaterequal"}, new Object[]{266, "partialdiff"}, new Object[]{267, "summation"}, new Object[]{Integer.valueOf((int) BitmapUtil.IMAGE_270_DEGREE), "product"}, new Object[]{271, "pi"}, new Object[]{272, "integral"}, new Object[]{275, "Omega"}, new Object[]{303, "radical"}, new Object[]{305, "approxequal"}, new Object[]{306, "Delta"}, new Object[]{327, "lozenge"}, new Object[]{333, "Euro"}, new Object[]{360, "apple"}};
    public static final MacOSRomanEncoding INSTANCE = new MacOSRomanEncoding();

    public MacOSRomanEncoding() {
        Object[][] objArr;
        for (Object[] objArr2 : f60452b) {
            add(((Integer) objArr2[0]).intValue(), objArr2[1].toString());
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.font.encoding.MacRomanEncoding, com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return null;
    }
}
