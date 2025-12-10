package com.tom_roush.pdfbox.text;

import android.graphics.RectF;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDFTextStripperByArea extends PDFTextStripper {

    /* renamed from: T */
    public final List f60836T = new ArrayList();

    /* renamed from: U */
    public final Map f60837U = new HashMap();

    /* renamed from: V */
    public final Map f60838V = new HashMap();

    /* renamed from: W */
    public final Map f60839W = new HashMap();

    public PDFTextStripperByArea() throws IOException {
        super.setShouldSeparateByBeads(false);
    }

    public void addRegion(String str, RectF rectF) {
        this.f60836T.add(str);
        this.f60837U.put(str, rectF);
    }

    public void extractRegions(PDPage pDPage) throws IOException {
        for (String str : this.f60836T) {
            setStartPage(getCurrentPageNo());
            setEndPage(getCurrentPageNo());
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ArrayList());
            this.f60838V.put(str, arrayList);
            this.f60839W.put(str, new StringWriter());
        }
        if (pDPage.hasContents()) {
            processPage(pDPage);
        }
    }

    public List<String> getRegions() {
        return this.f60836T;
    }

    public String getTextForRegion(String str) {
        return ((StringWriter) this.f60839W.get(str)).toString();
    }

    @Override // com.tom_roush.pdfbox.text.PDFTextStripper, com.tom_roush.pdfbox.text.AbstractC9968a
    public void processTextPosition(TextPosition textPosition) {
        for (Map.Entry entry : this.f60837U.entrySet()) {
            if (((RectF) entry.getValue()).contains(textPosition.getX(), textPosition.getY())) {
                this.charactersByArticle = (ArrayList) this.f60838V.get(entry.getKey());
                super.processTextPosition(textPosition);
            }
        }
    }

    public void removeRegion(String str) {
        this.f60836T.remove(str);
        this.f60837U.remove(str);
    }

    @Override // com.tom_roush.pdfbox.text.PDFTextStripper
    public final void setShouldSeparateByBeads(boolean z) {
    }

    @Override // com.tom_roush.pdfbox.text.PDFTextStripper
    public void writePage() throws IOException {
        for (String str : this.f60837U.keySet()) {
            this.charactersByArticle = (ArrayList) this.f60838V.get(str);
            this.output = (Writer) this.f60839W.get(str);
            super.writePage();
        }
    }
}