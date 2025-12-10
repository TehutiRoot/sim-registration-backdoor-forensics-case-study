package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.visible;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class PDFTemplateCreator {

    /* renamed from: a */
    public final PDFTemplateBuilder f60638a;

    public PDFTemplateCreator(PDFTemplateBuilder pDFTemplateBuilder) {
        this.f60638a = pDFTemplateBuilder;
    }

    /* renamed from: a */
    public final InputStream m32281a(COSDocument cOSDocument) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        COSWriter cOSWriter = new COSWriter(byteArrayOutputStream);
        cOSWriter.write(cOSDocument);
        cOSWriter.close();
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public InputStream buildPDF(PDVisibleSignDesigner pDVisibleSignDesigner) throws IOException {
        PDFTemplateStructure structure = this.f60638a.getStructure();
        this.f60638a.createProcSetArray();
        this.f60638a.createPage(pDVisibleSignDesigner);
        PDPage page = structure.getPage();
        this.f60638a.createTemplate(page);
        PDDocument template = structure.getTemplate();
        this.f60638a.createAcroForm(template);
        PDAcroForm acroForm = structure.getAcroForm();
        this.f60638a.createSignatureField(acroForm);
        PDSignatureField signatureField = structure.getSignatureField();
        this.f60638a.createSignature(signatureField, page, "");
        this.f60638a.createAcroFormDictionary(acroForm, signatureField);
        this.f60638a.createAffineTransform(pDVisibleSignDesigner.getTransform());
        AffineTransform affineTransform = structure.getAffineTransform();
        this.f60638a.createSignatureRectangle(signatureField, pDVisibleSignDesigner);
        this.f60638a.createFormatterRectangle(pDVisibleSignDesigner.getFormatterRectangleParameters());
        PDRectangle formatterRectangle = structure.getFormatterRectangle();
        this.f60638a.createSignatureImage(template, pDVisibleSignDesigner.getImage());
        this.f60638a.createHolderFormStream(template);
        PDStream holderFormStream = structure.getHolderFormStream();
        this.f60638a.createHolderFormResources();
        PDResources holderFormResources = structure.getHolderFormResources();
        this.f60638a.createHolderForm(holderFormResources, holderFormStream, formatterRectangle);
        this.f60638a.createAppearanceDictionary(structure.getHolderForm(), signatureField);
        this.f60638a.createInnerFormStream(template);
        this.f60638a.createInnerFormResource();
        PDResources innerFormResources = structure.getInnerFormResources();
        this.f60638a.createInnerForm(innerFormResources, structure.getInnerFormStream(), formatterRectangle);
        PDFormXObject innerForm = structure.getInnerForm();
        this.f60638a.insertInnerFormToHolderResources(innerForm, holderFormResources);
        this.f60638a.createImageFormStream(template);
        PDStream imageFormStream = structure.getImageFormStream();
        this.f60638a.createImageFormResources();
        PDResources imageFormResources = structure.getImageFormResources();
        this.f60638a.createImageForm(imageFormResources, innerFormResources, imageFormStream, formatterRectangle, affineTransform, structure.getImage());
        this.f60638a.createBackgroundLayerForm(innerFormResources, formatterRectangle);
        this.f60638a.injectProcSetArray(innerForm, page, innerFormResources, imageFormResources, holderFormResources, structure.getProcSet());
        this.f60638a.injectAppearanceStreams(holderFormStream, imageFormStream, imageFormStream, structure.getImageFormName(), structure.getImageName(), structure.getInnerFormName(), pDVisibleSignDesigner);
        this.f60638a.createVisualSignature(template);
        this.f60638a.createWidgetDictionary(signatureField, holderFormResources);
        InputStream m32281a = m32281a(structure.getVisualSignature());
        StringBuilder sb = new StringBuilder();
        sb.append("stream returning started, size= ");
        sb.append(m32281a.available());
        template.close();
        return m32281a;
    }

    public PDFTemplateStructure getPdfStructure() {
        return this.f60638a.getStructure();
    }
}
