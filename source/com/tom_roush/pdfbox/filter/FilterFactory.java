package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSName;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class FilterFactory {
    public static final FilterFactory INSTANCE = new FilterFactory();

    /* renamed from: a */
    public final Map f59877a;

    public FilterFactory() {
        HashMap hashMap = new HashMap();
        this.f59877a = hashMap;
        K20 k20 = new K20();
        C17103yB c17103yB = new C17103yB();
        C10097dg c10097dg = new C10097dg();
        LZWFilter lZWFilter = new LZWFilter();
        C12328n c12328n = new C12328n();
        C11501j c11501j = new C11501j();
        C21542pA1 c21542pA1 = new C21542pA1();
        C1281Rz c1281Rz = new C1281Rz();
        JPXFilter jPXFilter = new JPXFilter();
        hashMap.put(COSName.FLATE_DECODE, k20);
        hashMap.put(COSName.FLATE_DECODE_ABBREVIATION, k20);
        hashMap.put(COSName.DCT_DECODE, c17103yB);
        hashMap.put(COSName.DCT_DECODE_ABBREVIATION, c17103yB);
        hashMap.put(COSName.CCITTFAX_DECODE, c10097dg);
        hashMap.put(COSName.CCITTFAX_DECODE_ABBREVIATION, c10097dg);
        hashMap.put(COSName.LZW_DECODE, lZWFilter);
        hashMap.put(COSName.LZW_DECODE_ABBREVIATION, lZWFilter);
        hashMap.put(COSName.ASCII_HEX_DECODE, c12328n);
        hashMap.put(COSName.ASCII_HEX_DECODE_ABBREVIATION, c12328n);
        hashMap.put(COSName.ASCII85_DECODE, c11501j);
        hashMap.put(COSName.ASCII85_DECODE_ABBREVIATION, c11501j);
        hashMap.put(COSName.RUN_LENGTH_DECODE, c21542pA1);
        hashMap.put(COSName.RUN_LENGTH_DECODE_ABBREVIATION, c21542pA1);
        hashMap.put(COSName.CRYPT, c1281Rz);
        hashMap.put(COSName.JPX_DECODE, jPXFilter);
    }

    public Filter getFilter(String str) throws IOException {
        return getFilter(COSName.getPDFName(str));
    }

    public Filter getFilter(COSName cOSName) throws IOException {
        Filter filter = (Filter) this.f59877a.get(cOSName);
        if (filter != null) {
            return filter;
        }
        throw new IOException("Invalid filter: " + cOSName);
    }
}
