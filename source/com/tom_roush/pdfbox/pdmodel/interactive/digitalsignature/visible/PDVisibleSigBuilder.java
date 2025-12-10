package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import android.graphics.Bitmap;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.LosslessFactory;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes5.dex */
public class PDVisibleSigBuilder implements PDFTemplateBuilder {

    /* renamed from: a */
    public final PDFTemplateStructure f60666a = new PDFTemplateStructure();

    public void appendRawCommands(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes("UTF-8"));
        outputStream.close();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void closeTemplate(PDDocument pDDocument) throws IOException {
        pDDocument.close();
        this.f60666a.getTemplate().close();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createAcroForm(PDDocument pDDocument) {
        PDAcroForm pDAcroForm = new PDAcroForm(pDDocument);
        pDDocument.getDocumentCatalog().setAcroForm(pDAcroForm);
        this.f60666a.setAcroForm(pDAcroForm);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createAcroFormDictionary(PDAcroForm pDAcroForm, PDSignatureField pDSignatureField) throws IOException {
        List<PDField> fields = pDAcroForm.getFields();
        COSDictionary cOSObject = pDAcroForm.getCOSObject();
        pDAcroForm.setSignaturesExist(true);
        pDAcroForm.setAppendOnly(true);
        cOSObject.setDirect(true);
        fields.add(pDSignatureField);
        pDAcroForm.setDefaultAppearance("/sylfaen 0 Tf 0 g");
        this.f60666a.setAcroFormFields(fields);
        this.f60666a.setAcroFormDictionary(cOSObject);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    @Deprecated
    public void createAffineTransform(byte[] bArr) {
        this.f60666a.setAffineTransform(new AffineTransform(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5]));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createAppearanceDictionary(PDFormXObject pDFormXObject, PDSignatureField pDSignatureField) throws IOException {
        PDAppearanceDictionary pDAppearanceDictionary = new PDAppearanceDictionary();
        pDAppearanceDictionary.getCOSObject().setDirect(true);
        pDAppearanceDictionary.setNormalAppearance(new PDAppearanceStream(pDFormXObject.getCOSObject()));
        pDSignatureField.getWidgets().get(0).setAppearance(pDAppearanceDictionary);
        this.f60666a.setAppearanceDictionary(pDAppearanceDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createBackgroundLayerForm(PDResources pDResources, PDRectangle pDRectangle) throws IOException {
        PDFormXObject pDFormXObject = new PDFormXObject(this.f60666a.getTemplate().getDocument().createCOSStream());
        pDFormXObject.setBBox(pDRectangle);
        pDFormXObject.setResources(new PDResources());
        pDFormXObject.setFormType(1);
        pDResources.put(COSName.getPDFName("n0"), pDFormXObject);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    @Deprecated
    public void createFormatterRectangle(byte[] bArr) {
        PDRectangle pDRectangle = new PDRectangle();
        pDRectangle.setLowerLeftX(Math.min((int) bArr[0], (int) bArr[2]));
        pDRectangle.setLowerLeftY(Math.min((int) bArr[1], (int) bArr[3]));
        pDRectangle.setUpperRightX(Math.max((int) bArr[0], (int) bArr[2]));
        pDRectangle.setUpperRightY(Math.max((int) bArr[1], (int) bArr[3]));
        this.f60666a.setFormatterRectangle(pDRectangle);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createHolderForm(PDResources pDResources, PDStream pDStream, PDRectangle pDRectangle) {
        PDFormXObject pDFormXObject = new PDFormXObject(pDStream);
        pDFormXObject.setResources(pDResources);
        pDFormXObject.setBBox(pDRectangle);
        pDFormXObject.setFormType(1);
        this.f60666a.setHolderForm(pDFormXObject);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createHolderFormResources() {
        this.f60666a.setHolderFormResources(new PDResources());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createHolderFormStream(PDDocument pDDocument) {
        this.f60666a.setHolderFormStream(new PDStream(pDDocument));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createImageForm(PDResources pDResources, PDResources pDResources2, PDStream pDStream, PDRectangle pDRectangle, AffineTransform affineTransform, PDImageXObject pDImageXObject) throws IOException {
        PDFormXObject pDFormXObject = new PDFormXObject(pDStream);
        pDFormXObject.setBBox(pDRectangle);
        pDFormXObject.setMatrix(affineTransform);
        pDFormXObject.setResources(pDResources);
        pDFormXObject.setFormType(1);
        pDResources.getCOSObject().setDirect(true);
        COSName pDFName = COSName.getPDFName("n2");
        pDResources2.put(pDFName, pDFormXObject);
        COSName add = pDResources.add(pDImageXObject, "img");
        this.f60666a.setImageForm(pDFormXObject);
        this.f60666a.setImageFormName(pDFName);
        this.f60666a.setImageName(add);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createImageFormResources() {
        this.f60666a.setImageFormResources(new PDResources());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createImageFormStream(PDDocument pDDocument) {
        this.f60666a.setImageFormStream(new PDStream(pDDocument));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createInnerForm(PDResources pDResources, PDStream pDStream, PDRectangle pDRectangle) {
        PDFormXObject pDFormXObject = new PDFormXObject(pDStream);
        pDFormXObject.setResources(pDResources);
        pDFormXObject.setBBox(pDRectangle);
        pDFormXObject.setFormType(1);
        this.f60666a.setInnerForm(pDFormXObject);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createInnerFormResource() {
        this.f60666a.setInnerFormResources(new PDResources());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createInnerFormStream(PDDocument pDDocument) {
        this.f60666a.setInnterFormStream(new PDStream(pDDocument));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createPage(PDVisibleSignDesigner pDVisibleSignDesigner) {
        this.f60666a.setPage(new PDPage(new PDRectangle(pDVisibleSignDesigner.getPageWidth(), pDVisibleSignDesigner.getPageHeight())));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createProcSetArray() {
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) COSName.getPDFName("PDF"));
        cOSArray.add((COSBase) COSName.getPDFName("Text"));
        cOSArray.add((COSBase) COSName.getPDFName("ImageB"));
        cOSArray.add((COSBase) COSName.getPDFName("ImageC"));
        cOSArray.add((COSBase) COSName.getPDFName("ImageI"));
        this.f60666a.setProcSet(cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createSignature(PDSignatureField pDSignatureField, PDPage pDPage, String str) throws IOException {
        PDSignature pDSignature = new PDSignature();
        PDAnnotationWidget pDAnnotationWidget = pDSignatureField.getWidgets().get(0);
        pDSignatureField.setValue(pDSignature);
        pDAnnotationWidget.setPage(pDPage);
        pDPage.getAnnotations().add(pDAnnotationWidget);
        if (!str.isEmpty()) {
            pDSignature.setName(str);
        }
        this.f60666a.setPdSignature(pDSignature);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createSignatureField(PDAcroForm pDAcroForm) throws IOException {
        this.f60666a.setSignatureField(new PDSignatureField(pDAcroForm));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createSignatureImage(PDDocument pDDocument, Bitmap bitmap) throws IOException {
        this.f60666a.setImage(LosslessFactory.createFromImage(pDDocument, bitmap));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createSignatureRectangle(PDSignatureField pDSignatureField, PDVisibleSignDesigner pDVisibleSignDesigner) throws IOException {
        PDRectangle pDRectangle = new PDRectangle();
        pDRectangle.setUpperRightX(pDVisibleSignDesigner.getxAxis() + pDVisibleSignDesigner.getWidth());
        pDRectangle.setUpperRightY(pDVisibleSignDesigner.getTemplateHeight() - pDVisibleSignDesigner.getyAxis());
        pDRectangle.setLowerLeftY((pDVisibleSignDesigner.getTemplateHeight() - pDVisibleSignDesigner.getyAxis()) - pDVisibleSignDesigner.getHeight());
        pDRectangle.setLowerLeftX(pDVisibleSignDesigner.getxAxis());
        pDSignatureField.getWidgets().get(0).setRectangle(pDRectangle);
        this.f60666a.setSignatureRectangle(pDRectangle);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createTemplate(PDPage pDPage) throws IOException {
        PDDocument pDDocument = new PDDocument();
        pDDocument.addPage(pDPage);
        this.f60666a.setTemplate(pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createVisualSignature(PDDocument pDDocument) {
        this.f60666a.setVisualSignature(pDDocument.getDocument());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createWidgetDictionary(PDSignatureField pDSignatureField, PDResources pDResources) throws IOException {
        COSDictionary cOSObject = pDSignatureField.getWidgets().get(0).getCOSObject();
        cOSObject.setNeedToBeUpdated(true);
        cOSObject.setItem(COSName.f59776DR, (COSBase) pDResources.getCOSObject());
        this.f60666a.setWidgetDictionary(cOSObject);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public PDFTemplateStructure getStructure() {
        return this.f60666a;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void injectAppearanceStreams(PDStream pDStream, PDStream pDStream2, PDStream pDStream3, COSName cOSName, COSName cOSName2, COSName cOSName3, PDVisibleSignDesigner pDVisibleSignDesigner) throws IOException {
        appendRawCommands(this.f60666a.getHolderFormStream().createOutputStream(), "q 1 0 0 1 0 0 cm /" + cOSName3.getName() + " Do Q\n");
        appendRawCommands(this.f60666a.getInnerFormStream().createOutputStream(), "q 1 0 0 1 0 0 cm /n0 Do Q q 1 0 0 1 0 0 cm /" + cOSName.getName() + " Do Q\n");
        appendRawCommands(this.f60666a.getImageFormStream().createOutputStream(), "q " + ((int) getStructure().getFormatterRectangle().getWidth()) + " 0 0 " + ((int) getStructure().getFormatterRectangle().getHeight()) + " 0 0 cm /" + cOSName2.getName() + " Do Q\n");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void injectProcSetArray(PDFormXObject pDFormXObject, PDPage pDPage, PDResources pDResources, PDResources pDResources2, PDResources pDResources3, COSArray cOSArray) {
        COSDictionary cOSObject = pDFormXObject.getResources().getCOSObject();
        COSName cOSName = COSName.PROC_SET;
        cOSObject.setItem(cOSName, (COSBase) cOSArray);
        pDPage.getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        pDResources.getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        pDResources2.getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        pDResources3.getCOSObject().setItem(cOSName, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void insertInnerFormToHolderResources(PDFormXObject pDFormXObject, PDResources pDResources) {
        COSName cOSName = COSName.FRM;
        pDResources.put(cOSName, pDFormXObject);
        this.f60666a.setInnerFormName(cOSName);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createAffineTransform(AffineTransform affineTransform) {
        this.f60666a.setAffineTransform(affineTransform);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder
    public void createFormatterRectangle(int[] iArr) {
        PDRectangle pDRectangle = new PDRectangle();
        pDRectangle.setLowerLeftX(Math.min(iArr[0], iArr[2]));
        pDRectangle.setLowerLeftY(Math.min(iArr[1], iArr[3]));
        pDRectangle.setUpperRightX(Math.max(iArr[0], iArr[2]));
        pDRectangle.setUpperRightY(Math.max(iArr[1], iArr[3]));
        this.f60666a.setFormatterRectangle(pDRectangle);
    }
}
