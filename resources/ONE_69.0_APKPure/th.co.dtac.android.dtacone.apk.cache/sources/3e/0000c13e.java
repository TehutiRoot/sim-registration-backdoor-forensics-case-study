package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSName;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class FilterFactory {
    public static final FilterFactory INSTANCE = new FilterFactory();

    /* renamed from: a */
    public final Map f59889a;

    public FilterFactory() {
        HashMap hashMap = new HashMap();
        this.f59889a = hashMap;
        O20 o20 = new O20();
        C17110yB c17110yB = new C17110yB();
        C10089dg c10089dg = new C10089dg();
        LZWFilter lZWFilter = new LZWFilter();
        C12319n c12319n = new C12319n();
        C11489j c11489j = new C11489j();
        C21087mB1 c21087mB1 = new C21087mB1();
        C1262Rz c1262Rz = new C1262Rz();
        JPXFilter jPXFilter = new JPXFilter();
        hashMap.put(COSName.FLATE_DECODE, o20);
        hashMap.put(COSName.FLATE_DECODE_ABBREVIATION, o20);
        hashMap.put(COSName.DCT_DECODE, c17110yB);
        hashMap.put(COSName.DCT_DECODE_ABBREVIATION, c17110yB);
        hashMap.put(COSName.CCITTFAX_DECODE, c10089dg);
        hashMap.put(COSName.CCITTFAX_DECODE_ABBREVIATION, c10089dg);
        hashMap.put(COSName.LZW_DECODE, lZWFilter);
        hashMap.put(COSName.LZW_DECODE_ABBREVIATION, lZWFilter);
        hashMap.put(COSName.ASCII_HEX_DECODE, c12319n);
        hashMap.put(COSName.ASCII_HEX_DECODE_ABBREVIATION, c12319n);
        hashMap.put(COSName.ASCII85_DECODE, c11489j);
        hashMap.put(COSName.ASCII85_DECODE_ABBREVIATION, c11489j);
        hashMap.put(COSName.RUN_LENGTH_DECODE, c21087mB1);
        hashMap.put(COSName.RUN_LENGTH_DECODE_ABBREVIATION, c21087mB1);
        hashMap.put(COSName.CRYPT, c1262Rz);
        hashMap.put(COSName.JPX_DECODE, jPXFilter);
    }

    public Filter getFilter(String str) throws IOException {
        return getFilter(COSName.getPDFName(str));
    }

    public Filter getFilter(COSName cOSName) throws IOException {
        Filter filter = (Filter) this.f59889a.get(cOSName);
        if (filter != null) {
            return filter;
        }
        throw new IOException("Invalid filter: " + cOSName);
    }
}