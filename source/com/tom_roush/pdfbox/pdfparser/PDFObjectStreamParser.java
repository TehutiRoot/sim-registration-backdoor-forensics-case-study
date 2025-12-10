package com.tom_roush.pdfbox.pdfparser;

import com.tom_roush.pdfbox.android.PDFBoxConfig;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public class PDFObjectStreamParser extends BaseParser {

    /* renamed from: d */
    public List f60023d;

    /* renamed from: e */
    public final int f60024e;

    /* renamed from: f */
    public final int f60025f;

    public PDFObjectStreamParser(COSStream cOSStream, COSDocument cOSDocument) throws IOException {
        super(new C18425Se0(cOSStream.createInputStream()));
        this.f60023d = null;
        this.document = cOSDocument;
        int i = cOSStream.getInt(COSName.f59807N);
        this.f60024e = i;
        if (i != -1) {
            if (i >= 0) {
                int i2 = cOSStream.getInt(COSName.FIRST);
                this.f60025f = i2;
                if (i2 != -1) {
                    if (i2 >= 0) {
                        return;
                    }
                    throw new IOException("Illegal /First entry in object stream: " + i2);
                }
                throw new IOException("/First entry missing in object stream");
            }
            throw new IOException("Illegal /N entry in object stream: " + i);
        }
        throw new IOException("/N entry missing in object stream");
    }

    public List<COSObject> getObjects() {
        return this.f60023d;
    }

    /* renamed from: l */
    public final COSBase m32648l(int i) {
        long position = this.f60000b.getPosition();
        int i2 = this.f60025f + i;
        if (i2 > 0 && position < i2) {
            this.f60000b.readFully(i2 - ((int) position));
        }
        return parseDirObject();
    }

    /* renamed from: m */
    public final Map m32647m() {
        TreeMap treeMap = new TreeMap();
        long position = (this.f60000b.getPosition() + this.f60025f) - 1;
        for (int i = 0; i < this.f60024e && this.f60000b.getPosition() < position; i++) {
            treeMap.put(Integer.valueOf((int) readLong()), Long.valueOf(readObjectNumber()));
        }
        return treeMap;
    }

    public void parse() throws IOException {
        try {
            Map m32647m = m32647m();
            this.f60023d = new ArrayList(m32647m.size());
            for (Map.Entry entry : m32647m.entrySet()) {
                COSObject cOSObject = new COSObject(m32648l(((Integer) entry.getKey()).intValue()));
                cOSObject.setGenerationNumber(0);
                cOSObject.setObjectNumber(((Long) entry.getValue()).longValue());
                this.f60023d.add(cOSObject);
                if (PDFBoxConfig.isDebugEnabled()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("parsed=");
                    sb.append(cOSObject);
                }
            }
        } finally {
            this.f60000b.close();
        }
    }
}
