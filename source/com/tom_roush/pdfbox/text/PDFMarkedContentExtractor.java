package com.tom_roush.pdfbox.text;

import com.tom_roush.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequence;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequenceWithProperties;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.DrawObject;
import com.tom_roush.pdfbox.contentstream.operator.markedcontent.EndMarkedContentSequence;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDFMarkedContentExtractor extends AbstractC9979a {

    /* renamed from: o */
    public boolean f60779o;

    /* renamed from: p */
    public final List f60780p;

    /* renamed from: q */
    public final Deque f60781q;

    /* renamed from: r */
    public final Map f60782r;

    public PDFMarkedContentExtractor() throws IOException {
        this(null);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void beginMarkedContentSequence(COSName cOSName, COSDictionary cOSDictionary) {
        PDMarkedContent create = PDMarkedContent.create(cOSName, cOSDictionary);
        if (this.f60781q.isEmpty()) {
            this.f60780p.add(create);
        } else {
            PDMarkedContent pDMarkedContent = (PDMarkedContent) this.f60781q.peek();
            if (pDMarkedContent != null) {
                pDMarkedContent.addMarkedContent(create);
            }
        }
        this.f60781q.push(create);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void endMarkedContentSequence() {
        if (!this.f60781q.isEmpty()) {
            this.f60781q.pop();
        }
    }

    /* renamed from: g */
    public final boolean m32132g(float f, float f2, float f3) {
        return f2 > f - f3 && f2 < f + f3;
    }

    public List<PDMarkedContent> getMarkedContents() {
        return this.f60780p;
    }

    public boolean isSuppressDuplicateOverlappingText() {
        return this.f60779o;
    }

    @Override // com.tom_roush.pdfbox.text.AbstractC9979a, com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public /* bridge */ /* synthetic */ void processPage(PDPage pDPage) throws IOException {
        super.processPage(pDPage);
    }

    @Override // com.tom_roush.pdfbox.text.AbstractC9979a
    public void processTextPosition(TextPosition textPosition) {
        if (this.f60779o) {
            String unicode = textPosition.getUnicode();
            float x = textPosition.getX();
            float y = textPosition.getY();
            List<TextPosition> list = (List) this.f60782r.get(unicode);
            if (list == null) {
                list = new ArrayList();
                this.f60782r.put(unicode, list);
            }
            float width = (textPosition.getWidth() / unicode.length()) / 3.0f;
            for (TextPosition textPosition2 : list) {
                String unicode2 = textPosition2.getUnicode();
                float x2 = textPosition2.getX();
                float y2 = textPosition2.getY();
                if (unicode2 != null && m32132g(x2, x, width) && m32132g(y2, y, width)) {
                    return;
                }
            }
            list.add(textPosition);
        }
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            arrayList.add(textPosition);
        } else {
            TextPosition textPosition3 = (TextPosition) arrayList.get(arrayList.size() - 1);
            if (textPosition.isDiacritic() && textPosition3.contains(textPosition)) {
                textPosition3.mergeDiacritic(textPosition);
            } else if (textPosition3.isDiacritic() && textPosition.contains(textPosition3)) {
                textPosition.mergeDiacritic(textPosition3);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(textPosition);
            } else {
                arrayList.add(textPosition);
            }
        }
        if (!this.f60781q.isEmpty()) {
            ((PDMarkedContent) this.f60781q.peek()).addText(textPosition);
        }
    }

    public void setSuppressDuplicateOverlappingText(boolean z) {
        this.f60779o = z;
    }

    public void xobject(PDXObject pDXObject) {
        if (!this.f60781q.isEmpty()) {
            ((PDMarkedContent) this.f60781q.peek()).addXObject(pDXObject);
        }
    }

    public PDFMarkedContentExtractor(String str) throws IOException {
        this.f60779o = true;
        this.f60780p = new ArrayList();
        this.f60781q = new ArrayDeque();
        this.f60782r = new HashMap();
        addOperator(new BeginMarkedContentSequenceWithProperties());
        addOperator(new BeginMarkedContentSequence());
        addOperator(new EndMarkedContentSequence());
        addOperator(new DrawObject());
    }
}
