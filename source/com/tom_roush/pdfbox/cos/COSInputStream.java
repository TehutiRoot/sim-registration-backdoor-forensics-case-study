package com.tom_roush.pdfbox.cos;

import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.p019io.RandomAccess;
import com.tom_roush.pdfbox.p019io.RandomAccessInputStream;
import com.tom_roush.pdfbox.p019io.RandomAccessOutputStream;
import com.tom_roush.pdfbox.p019io.RandomAccessRead;
import com.tom_roush.pdfbox.p019io.ScratchFile;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class COSInputStream extends FilterInputStream {

    /* renamed from: a */
    public final List f59743a;

    /* renamed from: com.tom_roush.pdfbox.cos.COSInputStream$a */
    /* loaded from: classes5.dex */
    public class C9899a extends RandomAccessInputStream {

        /* renamed from: c */
        public final /* synthetic */ RandomAccess f59744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9899a(RandomAccessRead randomAccessRead, RandomAccess randomAccess) {
            super(randomAccessRead);
            this.f59744c = randomAccess;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f59744c.close();
        }
    }

    public COSInputStream(InputStream inputStream, List list) {
        super(inputStream);
        this.f59743a = list;
    }

    /* renamed from: b */
    public static COSInputStream m32789b(List list, COSDictionary cOSDictionary, InputStream inputStream, ScratchFile scratchFile, DecodeOptions decodeOptions) {
        InputStream byteArrayInputStream;
        if (list.isEmpty()) {
            return new COSInputStream(inputStream, Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 1 && new HashSet(list).size() != list.size()) {
            throw new IOException("Duplicate");
        }
        InputStream inputStream2 = inputStream;
        for (int i = 0; i < list.size(); i++) {
            if (scratchFile != null) {
                RandomAccess createBuffer = scratchFile.createBuffer();
                arrayList.add(((Filter) list.get(i)).decode(inputStream2, new RandomAccessOutputStream(createBuffer), cOSDictionary, i, decodeOptions));
                byteArrayInputStream = new C9899a(createBuffer, createBuffer);
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                arrayList.add(((Filter) list.get(i)).decode(inputStream2, byteArrayOutputStream, cOSDictionary, i, decodeOptions));
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            }
            inputStream2 = byteArrayInputStream;
        }
        return new COSInputStream(inputStream2, arrayList);
    }

    public DecodeResult getDecodeResult() {
        if (this.f59743a.isEmpty()) {
            return DecodeResult.DEFAULT;
        }
        List list = this.f59743a;
        return (DecodeResult) list.get(list.size() - 1);
    }
}
