package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
public class PDFTemplateStructure {

    /* renamed from: A */
    public COSDictionary f60639A;

    /* renamed from: a */
    public PDPage f60640a;

    /* renamed from: b */
    public PDDocument f60641b;

    /* renamed from: c */
    public PDAcroForm f60642c;

    /* renamed from: d */
    public PDSignatureField f60643d;

    /* renamed from: e */
    public PDSignature f60644e;

    /* renamed from: f */
    public COSDictionary f60645f;

    /* renamed from: g */
    public PDRectangle f60646g;

    /* renamed from: h */
    public AffineTransform f60647h;

    /* renamed from: i */
    public COSArray f60648i;

    /* renamed from: j */
    public PDImageXObject f60649j;

    /* renamed from: k */
    public PDRectangle f60650k;

    /* renamed from: l */
    public PDStream f60651l;

    /* renamed from: m */
    public PDResources f60652m;

    /* renamed from: n */
    public PDFormXObject f60653n;

    /* renamed from: o */
    public PDAppearanceDictionary f60654o;

    /* renamed from: p */
    public PDStream f60655p;

    /* renamed from: q */
    public PDResources f60656q;

    /* renamed from: r */
    public PDFormXObject f60657r;

    /* renamed from: s */
    public PDStream f60658s;

    /* renamed from: t */
    public PDResources f60659t;

    /* renamed from: u */
    public List f60660u;

    /* renamed from: v */
    public COSName f60661v;

    /* renamed from: w */
    public COSName f60662w;

    /* renamed from: x */
    public COSName f60663x;

    /* renamed from: y */
    public COSDocument f60664y;

    /* renamed from: z */
    public PDFormXObject f60665z;

    public PDAcroForm getAcroForm() {
        return this.f60642c;
    }

    public COSDictionary getAcroFormDictionary() {
        return this.f60645f;
    }

    public List<PDField> getAcroFormFields() {
        return this.f60660u;
    }

    public AffineTransform getAffineTransform() {
        return this.f60647h;
    }

    public PDAppearanceDictionary getAppearanceDictionary() {
        return this.f60654o;
    }

    public PDRectangle getFormatterRectangle() {
        return this.f60650k;
    }

    public PDFormXObject getHolderForm() {
        return this.f60653n;
    }

    public PDResources getHolderFormResources() {
        return this.f60652m;
    }

    public PDStream getHolderFormStream() {
        return this.f60651l;
    }

    public PDImageXObject getImage() {
        return this.f60649j;
    }

    public PDFormXObject getImageForm() {
        return this.f60665z;
    }

    public COSName getImageFormName() {
        return this.f60662w;
    }

    public PDResources getImageFormResources() {
        return this.f60659t;
    }

    public PDStream getImageFormStream() {
        return this.f60658s;
    }

    public COSName getImageName() {
        return this.f60663x;
    }

    public PDFormXObject getInnerForm() {
        return this.f60657r;
    }

    public COSName getInnerFormName() {
        return this.f60661v;
    }

    public PDResources getInnerFormResources() {
        return this.f60656q;
    }

    public PDStream getInnerFormStream() {
        return this.f60655p;
    }

    public PDPage getPage() {
        return this.f60640a;
    }

    public PDSignature getPdSignature() {
        return this.f60644e;
    }

    public COSArray getProcSet() {
        return this.f60648i;
    }

    public PDSignatureField getSignatureField() {
        return this.f60643d;
    }

    public PDRectangle getSignatureRectangle() {
        return this.f60646g;
    }

    public PDDocument getTemplate() {
        return this.f60641b;
    }

    @Deprecated
    public ByteArrayInputStream getTemplateAppearanceStream() throws IOException {
        COSDocument visualSignature = getVisualSignature();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new COSWriter(byteArrayOutputStream).write(visualSignature);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        getTemplate().close();
        return byteArrayInputStream;
    }

    public COSDocument getVisualSignature() {
        return this.f60664y;
    }

    public COSDictionary getWidgetDictionary() {
        return this.f60639A;
    }

    public void setAcroForm(PDAcroForm pDAcroForm) {
        this.f60642c = pDAcroForm;
    }

    public void setAcroFormDictionary(COSDictionary cOSDictionary) {
        this.f60645f = cOSDictionary;
    }

    public void setAcroFormFields(List<PDField> list) {
        this.f60660u = list;
    }

    public void setAffineTransform(AffineTransform affineTransform) {
        this.f60647h = affineTransform;
    }

    public void setAppearanceDictionary(PDAppearanceDictionary pDAppearanceDictionary) {
        this.f60654o = pDAppearanceDictionary;
    }

    public void setFormatterRectangle(PDRectangle pDRectangle) {
        this.f60650k = pDRectangle;
    }

    public void setHolderForm(PDFormXObject pDFormXObject) {
        this.f60653n = pDFormXObject;
    }

    public void setHolderFormResources(PDResources pDResources) {
        this.f60652m = pDResources;
    }

    public void setHolderFormStream(PDStream pDStream) {
        this.f60651l = pDStream;
    }

    public void setImage(PDImageXObject pDImageXObject) {
        this.f60649j = pDImageXObject;
    }

    public void setImageForm(PDFormXObject pDFormXObject) {
        this.f60665z = pDFormXObject;
    }

    public void setImageFormName(COSName cOSName) {
        this.f60662w = cOSName;
    }

    public void setImageFormResources(PDResources pDResources) {
        this.f60659t = pDResources;
    }

    public void setImageFormStream(PDStream pDStream) {
        this.f60658s = pDStream;
    }

    public void setImageName(COSName cOSName) {
        this.f60663x = cOSName;
    }

    public void setInnerForm(PDFormXObject pDFormXObject) {
        this.f60657r = pDFormXObject;
    }

    public void setInnerFormName(COSName cOSName) {
        this.f60661v = cOSName;
    }

    public void setInnerFormResources(PDResources pDResources) {
        this.f60656q = pDResources;
    }

    public void setInnterFormStream(PDStream pDStream) {
        this.f60655p = pDStream;
    }

    public void setPage(PDPage pDPage) {
        this.f60640a = pDPage;
    }

    public void setPdSignature(PDSignature pDSignature) {
        this.f60644e = pDSignature;
    }

    public void setProcSet(COSArray cOSArray) {
        this.f60648i = cOSArray;
    }

    public void setSignatureField(PDSignatureField pDSignatureField) {
        this.f60643d = pDSignatureField;
    }

    public void setSignatureRectangle(PDRectangle pDRectangle) {
        this.f60646g = pDRectangle;
    }

    public void setTemplate(PDDocument pDDocument) {
        this.f60641b = pDDocument;
    }

    public void setVisualSignature(COSDocument cOSDocument) {
        this.f60664y = cOSDocument;
    }

    public void setWidgetDictionary(COSDictionary cOSDictionary) {
        this.f60639A = cOSDictionary;
    }
}
