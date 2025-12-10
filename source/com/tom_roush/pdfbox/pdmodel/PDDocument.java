package com.tom_roush.pdfbox.pdmodel;

import android.util.Log;
import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSDocument;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.p019io.MemoryUsageSetting;
import com.tom_roush.pdfbox.p019io.RandomAccessBuffer;
import com.tom_roush.pdfbox.p019io.RandomAccessBufferedFileInputStream;
import com.tom_roush.pdfbox.p019io.RandomAccessRead;
import com.tom_roush.pdfbox.p019io.ScratchFile;
import com.tom_roush.pdfbox.pdfparser.PDFParser;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.encryption.AccessPermission;
import com.tom_roush.pdfbox.pdmodel.encryption.PDEncryption;
import com.tom_roush.pdfbox.pdmodel.encryption.ProtectionPolicy;
import com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandler;
import com.tom_roush.pdfbox.pdmodel.encryption.SecurityHandlerFactory;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.ExternalSigningSupport;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions;
import com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDAcroForm;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDField;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PDSignatureField;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class PDDocument implements Closeable {

    /* renamed from: o */
    public static final int[] f60095o = {0, 1000000000, 1000000000, 1000000000};

    /* renamed from: a */
    public final COSDocument f60096a;

    /* renamed from: b */
    public PDDocumentInformation f60097b;

    /* renamed from: c */
    public PDDocumentCatalog f60098c;

    /* renamed from: d */
    public PDEncryption f60099d;

    /* renamed from: e */
    public boolean f60100e;

    /* renamed from: f */
    public Long f60101f;

    /* renamed from: g */
    public final RandomAccessRead f60102g;

    /* renamed from: h */
    public AccessPermission f60103h;

    /* renamed from: i */
    public final Set f60104i;

    /* renamed from: j */
    public final Set f60105j;

    /* renamed from: k */
    public SignatureInterface f60106k;

    /* renamed from: l */
    public SigningSupport f60107l;

    /* renamed from: m */
    public ResourceCache f60108m;

    /* renamed from: n */
    public boolean f60109n;

    static {
        PDDeviceRGB.INSTANCE.toRGB(new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        try {
            COSNumber.get("0");
            COSNumber.get("1");
        } catch (IOException unused) {
        }
    }

    public PDDocument() {
        this(MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(File file) throws IOException {
        return load(file, "", MemoryUsageSetting.setupMainMemoryOnly());
    }

    /* renamed from: m */
    public static PDDocument m32606m(RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream, String str, InputStream inputStream, String str2, MemoryUsageSetting memoryUsageSetting) {
        ScratchFile scratchFile = new ScratchFile(memoryUsageSetting);
        try {
            PDFParser pDFParser = new PDFParser(randomAccessBufferedFileInputStream, str, inputStream, str2, scratchFile);
            pDFParser.parse();
            return pDFParser.getPDDocument();
        } catch (IOException e) {
            IOUtils.closeQuietly(scratchFile);
            throw e;
        }
    }

    public void addPage(PDPage pDPage) {
        getPages().add(pDPage);
    }

    public void addSignature(PDSignature pDSignature) throws IOException {
        addSignature(pDSignature, new SignatureOptions());
    }

    @Deprecated
    public void addSignatureField(List<PDSignatureField> list, SignatureInterface signatureInterface, SignatureOptions signatureOptions) throws IOException {
        PDDocumentCatalog documentCatalog = getDocumentCatalog();
        documentCatalog.getCOSObject().setNeedToBeUpdated(true);
        PDAcroForm acroForm = documentCatalog.getAcroForm(null);
        if (acroForm == null) {
            acroForm = new PDAcroForm(this);
            documentCatalog.setAcroForm(acroForm);
        }
        COSDictionary cOSObject = acroForm.getCOSObject();
        cOSObject.setDirect(true);
        cOSObject.setNeedToBeUpdated(true);
        if (!acroForm.isSignaturesExist()) {
            acroForm.setSignaturesExist(true);
        }
        List<PDField> fields = acroForm.getFields();
        for (PDSignatureField pDSignatureField : list) {
            pDSignatureField.getCOSObject().setNeedToBeUpdated(true);
            if (m32609j(acroForm.getFieldIterator(), pDSignatureField)) {
                pDSignatureField.getCOSObject().setNeedToBeUpdated(true);
            } else {
                fields.add(pDSignatureField);
            }
            if (pDSignatureField.getSignature() != null) {
                pDSignatureField.getCOSObject().setNeedToBeUpdated(true);
                addSignature(pDSignatureField.getSignature(), signatureInterface, signatureOptions);
            }
        }
    }

    /* renamed from: b */
    public final void m32613b(PDAcroForm pDAcroForm, COSDictionary cOSDictionary) {
        COSName cOSName = COSName.f59776DR;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary2 = (COSDictionary) dictionaryObject;
            PDResources defaultResources = pDAcroForm.getDefaultResources();
            if (defaultResources == null) {
                pDAcroForm.getCOSObject().setItem(cOSName, (COSBase) cOSDictionary2);
                cOSDictionary2.setDirect(true);
                cOSDictionary2.setNeedToBeUpdated(true);
                return;
            }
            COSDictionary cOSObject = defaultResources.getCOSObject();
            COSName cOSName2 = COSName.XOBJECT;
            COSBase item = cOSDictionary2.getItem(cOSName2);
            COSBase item2 = cOSObject.getItem(cOSName2);
            if ((item instanceof COSDictionary) && (item2 instanceof COSDictionary)) {
                ((COSDictionary) item2).addAll((COSDictionary) item);
                cOSObject.setNeedToBeUpdated(true);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f60096a.isClosed()) {
            SigningSupport signingSupport = this.f60107l;
            IOException iOException = null;
            if (signingSupport != null) {
                iOException = IOUtils.closeAndLogException(signingSupport, "SigningSupport", null);
            }
            IOException closeAndLogException = IOUtils.closeAndLogException(this.f60096a, "COSDocument", iOException);
            RandomAccessRead randomAccessRead = this.f60102g;
            if (randomAccessRead != null) {
                closeAndLogException = IOUtils.closeAndLogException(randomAccessRead, "RandomAccessRead pdfSource", closeAndLogException);
            }
            for (TrueTypeFont trueTypeFont : this.f60105j) {
                closeAndLogException = IOUtils.closeAndLogException(trueTypeFont, "TrueTypeFont", closeAndLogException);
            }
            if (closeAndLogException != null) {
                throw closeAndLogException;
            }
        }
    }

    /* renamed from: d */
    public final void m32612d(PDSignatureField pDSignatureField, COSDictionary cOSDictionary) {
        PDAppearanceDictionary pDAppearanceDictionary = new PDAppearanceDictionary(cOSDictionary);
        cOSDictionary.setDirect(true);
        pDSignatureField.getWidgets().get(0).setAppearance(pDAppearanceDictionary);
    }

    /* renamed from: g */
    public final void m32611g(PDSignatureField pDSignatureField, COSDictionary cOSDictionary) {
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(COSName.RECT);
        PDRectangle rectangle = pDSignatureField.getWidgets().get(0).getRectangle();
        if (rectangle == null || rectangle.getCOSArray().size() != 4) {
            pDSignatureField.getWidgets().get(0).setRectangle(new PDRectangle(cOSArray));
        }
    }

    public AccessPermission getCurrentAccessPermission() {
        if (this.f60103h == null) {
            this.f60103h = AccessPermission.getOwnerAccessPermission();
        }
        return this.f60103h;
    }

    public COSDocument getDocument() {
        return this.f60096a;
    }

    public PDDocumentCatalog getDocumentCatalog() {
        if (this.f60098c == null) {
            COSBase dictionaryObject = this.f60096a.getTrailer().getDictionaryObject(COSName.ROOT);
            if (dictionaryObject instanceof COSDictionary) {
                this.f60098c = new PDDocumentCatalog(this, (COSDictionary) dictionaryObject);
            } else {
                this.f60098c = new PDDocumentCatalog(this);
            }
        }
        return this.f60098c;
    }

    public Long getDocumentId() {
        return this.f60101f;
    }

    public PDDocumentInformation getDocumentInformation() {
        if (this.f60097b == null) {
            COSDictionary trailer = this.f60096a.getTrailer();
            COSName cOSName = COSName.INFO;
            COSDictionary cOSDictionary = trailer.getCOSDictionary(cOSName);
            if (cOSDictionary == null) {
                cOSDictionary = new COSDictionary();
                trailer.setItem(cOSName, (COSBase) cOSDictionary);
            }
            this.f60097b = new PDDocumentInformation(cOSDictionary);
        }
        return this.f60097b;
    }

    public PDEncryption getEncryption() {
        if (this.f60099d == null && isEncrypted()) {
            this.f60099d = new PDEncryption(this.f60096a.getEncryptionDictionary());
        }
        return this.f60099d;
    }

    public PDSignature getLastSignatureDictionary() throws IOException {
        List<PDSignature> signatureDictionaries = getSignatureDictionaries();
        int size = signatureDictionaries.size();
        if (size > 0) {
            return signatureDictionaries.get(size - 1);
        }
        return null;
    }

    public int getNumberOfPages() {
        return getDocumentCatalog().getPages().getCount();
    }

    public PDPage getPage(int i) {
        return getDocumentCatalog().getPages().get(i);
    }

    public PDPageTree getPages() {
        return getDocumentCatalog().getPages();
    }

    public ResourceCache getResourceCache() {
        return this.f60108m;
    }

    public List<PDSignature> getSignatureDictionaries() throws IOException {
        ArrayList arrayList = new ArrayList();
        for (PDSignatureField pDSignatureField : getSignatureFields()) {
            COSBase dictionaryObject = pDSignatureField.getCOSObject().getDictionaryObject(COSName.f59843V);
            if (dictionaryObject != null) {
                arrayList.add(new PDSignature((COSDictionary) dictionaryObject));
            }
        }
        return arrayList;
    }

    public List<PDSignatureField> getSignatureFields() throws IOException {
        ArrayList arrayList = new ArrayList();
        PDAcroForm acroForm = getDocumentCatalog().getAcroForm(null);
        if (acroForm != null) {
            Iterator<PDField> it = acroForm.getFieldTree().iterator();
            while (it.hasNext()) {
                PDField next = it.next();
                if (next instanceof PDSignatureField) {
                    arrayList.add((PDSignatureField) next);
                }
            }
        }
        return arrayList;
    }

    public float getVersion() {
        float parseFloat;
        float version = getDocument().getVersion();
        if (version >= 1.4f) {
            String version2 = getDocumentCatalog().getVersion();
            if (version2 != null) {
                try {
                    parseFloat = Float.parseFloat(version2);
                } catch (NumberFormatException unused) {
                }
                return Math.max(parseFloat, version);
            }
            parseFloat = -1.0f;
            return Math.max(parseFloat, version);
        }
        return version;
    }

    /* renamed from: i */
    public final boolean m32610i(List list, PDAnnotationWidget pDAnnotationWidget) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((PDAnnotation) it.next()).getCOSObject().equals(pDAnnotationWidget.getCOSObject())) {
                return true;
            }
        }
        return false;
    }

    public PDPage importPage(PDPage pDPage) throws IOException {
        PDPage pDPage2 = new PDPage(new COSDictionary(pDPage.getCOSObject()), this.f60108m);
        pDPage2.setContents(new PDStream(this, pDPage.getContents(), COSName.FLATE_DECODE));
        addPage(pDPage2);
        pDPage2.setCropBox(new PDRectangle(pDPage.getCropBox().getCOSArray()));
        pDPage2.setMediaBox(new PDRectangle(pDPage.getMediaBox().getCOSArray()));
        pDPage2.setRotation(pDPage.getRotation());
        if (pDPage.getResources() != null && !pDPage.getCOSObject().containsKey(COSName.RESOURCES)) {
            Log.w("PdfBox-Android", "inherited resources of source document are not imported to destination page");
            Log.w("PdfBox-Android", "call importedPage.setResources(page.getResources()) to do this");
        }
        return pDPage2;
    }

    public boolean isAllSecurityToBeRemoved() {
        return this.f60100e;
    }

    public boolean isEncrypted() {
        return this.f60096a.isEncrypted();
    }

    /* renamed from: j */
    public final boolean m32609j(Iterator it, PDSignatureField pDSignatureField) {
        while (it.hasNext()) {
            PDField pDField = (PDField) it.next();
            if ((pDField instanceof PDSignatureField) && pDField.getCOSObject().equals(pDSignatureField.getCOSObject())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final PDSignatureField m32608k(Iterator it, PDSignature pDSignature) {
        PDSignatureField pDSignatureField;
        PDSignature signature;
        while (it.hasNext()) {
            PDField pDField = (PDField) it.next();
            if ((pDField instanceof PDSignatureField) && (signature = (pDSignatureField = (PDSignatureField) pDField).getSignature()) != null && signature.getCOSObject().equals(pDSignature.getCOSObject())) {
                return pDSignatureField;
            }
        }
        return null;
    }

    /* renamed from: l */
    public Set m32607l() {
        return this.f60104i;
    }

    /* renamed from: n */
    public final void m32605n(PDSignatureField pDSignatureField) {
        pDSignatureField.getWidgets().get(0).setRectangle(new PDRectangle());
        PDAppearanceDictionary pDAppearanceDictionary = new PDAppearanceDictionary();
        PDAppearanceStream pDAppearanceStream = new PDAppearanceStream(this);
        pDAppearanceStream.setBBox(new PDRectangle());
        pDAppearanceDictionary.setNormalAppearance(pDAppearanceStream);
        pDSignatureField.getWidgets().get(0).setAppearance(pDAppearanceDictionary);
    }

    /* renamed from: o */
    public final void m32604o(PDSignatureField pDSignatureField, PDAcroForm pDAcroForm, COSDocument cOSDocument) {
        boolean z = true;
        boolean z2 = true;
        for (COSObject cOSObject : cOSDocument.getObjects()) {
            if (!z && !z2) {
                break;
            }
            COSBase object = cOSObject.getObject();
            if (object instanceof COSDictionary) {
                COSDictionary cOSDictionary = (COSDictionary) object;
                COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.TYPE);
                if (z && COSName.ANNOT.equals(dictionaryObject)) {
                    m32611g(pDSignatureField, cOSDictionary);
                    z = false;
                }
                COSBase dictionaryObject2 = cOSDictionary.getDictionaryObject(COSName.f59786FT);
                COSBase dictionaryObject3 = cOSDictionary.getDictionaryObject(COSName.f59751AP);
                if (z2 && COSName.SIG.equals(dictionaryObject2) && (dictionaryObject3 instanceof COSDictionary)) {
                    m32612d(pDSignatureField, (COSDictionary) dictionaryObject3);
                    m32613b(pDAcroForm, cOSDictionary);
                    z2 = false;
                }
            }
        }
        if (!z && !z2) {
            return;
        }
        throw new IllegalArgumentException("Template is missing required objects");
    }

    public void protect(ProtectionPolicy protectionPolicy) throws IOException {
        if (isAllSecurityToBeRemoved()) {
            Log.w("PdfBox-Android", "do not call setAllSecurityToBeRemoved(true) before calling protect(), as protect() implies setAllSecurityToBeRemoved(false)");
            setAllSecurityToBeRemoved(false);
        }
        if (!isEncrypted()) {
            this.f60099d = new PDEncryption();
        }
        SecurityHandler newSecurityHandlerForPolicy = SecurityHandlerFactory.INSTANCE.newSecurityHandlerForPolicy(protectionPolicy);
        if (newSecurityHandlerForPolicy != null) {
            getEncryption().setSecurityHandler(newSecurityHandlerForPolicy);
            return;
        }
        throw new IOException("No security handler for policy " + protectionPolicy);
    }

    public void registerTrueTypeFontForClosing(TrueTypeFont trueTypeFont) {
        this.f60105j.add(trueTypeFont);
    }

    public void removePage(PDPage pDPage) {
        getPages().remove(pDPage);
    }

    public void save(String str) throws IOException {
        save(new File(str));
    }

    public void saveIncremental(OutputStream outputStream) throws IOException {
        COSWriter cOSWriter = null;
        try {
            if (this.f60102g != null) {
                COSWriter cOSWriter2 = new COSWriter(outputStream, this.f60102g);
                try {
                    cOSWriter2.write(this, this.f60106k);
                    cOSWriter2.close();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    cOSWriter = cOSWriter2;
                    if (cOSWriter != null) {
                        cOSWriter.close();
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("document was not loaded from a file or a stream");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public ExternalSigningSupport saveIncrementalForExternalSigning(OutputStream outputStream) throws IOException {
        if (this.f60102g != null) {
            Iterator<PDSignature> it = getSignatureDictionaries().iterator();
            PDSignature pDSignature = null;
            while (it.hasNext()) {
                pDSignature = it.next();
                if (pDSignature.getCOSObject().isNeedToBeUpdated()) {
                    break;
                }
            }
            if (Arrays.equals(pDSignature.getByteRange(), f60095o)) {
                COSWriter cOSWriter = new COSWriter(outputStream, this.f60102g);
                cOSWriter.write(this);
                SigningSupport signingSupport = new SigningSupport(cOSWriter);
                this.f60107l = signingSupport;
                return signingSupport;
            }
            throw new IllegalStateException("signature reserve byte range has been changed after addSignature(), please set the byte range that existed after addSignature()");
        }
        throw new IllegalStateException("document was not loaded from a file or a stream");
    }

    public void setAllSecurityToBeRemoved(boolean z) {
        this.f60100e = z;
    }

    public void setDocumentId(Long l) {
        this.f60101f = l;
    }

    public void setDocumentInformation(PDDocumentInformation pDDocumentInformation) {
        this.f60097b = pDDocumentInformation;
        this.f60096a.getTrailer().setItem(COSName.INFO, (COSBase) pDDocumentInformation.getCOSObject());
    }

    public void setEncryptionDictionary(PDEncryption pDEncryption) throws IOException {
        this.f60099d = pDEncryption;
    }

    public void setResourceCache(ResourceCache resourceCache) {
        this.f60108m = resourceCache;
    }

    public void setVersion(float f) {
        float version = getVersion();
        if (f == version || f < version) {
            return;
        }
        if (getDocument().getVersion() >= 1.4f) {
            getDocumentCatalog().setVersion(Float.toString(f));
        } else {
            getDocument().setVersion(f);
        }
    }

    public PDDocument(MemoryUsageSetting memoryUsageSetting) {
        ScratchFile scratchFile;
        this.f60104i = new HashSet();
        this.f60105j = new HashSet();
        this.f60108m = new DefaultResourceCache();
        this.f60109n = false;
        try {
            scratchFile = new ScratchFile(memoryUsageSetting);
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Error initializing scratch file: " + e.getMessage() + ". Fall back to main memory usage only.");
            try {
                scratchFile = new ScratchFile(MemoryUsageSetting.setupMainMemoryOnly());
            } catch (IOException unused) {
                scratchFile = null;
            }
        }
        COSDocument cOSDocument = new COSDocument(scratchFile);
        this.f60096a = cOSDocument;
        this.f60102g = null;
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDocument.setTrailer(cOSDictionary);
        COSDictionary cOSDictionary2 = new COSDictionary();
        cOSDictionary.setItem(COSName.ROOT, (COSBase) cOSDictionary2);
        COSName cOSName = COSName.TYPE;
        cOSDictionary2.setItem(cOSName, COSName.CATALOG);
        cOSDictionary2.setItem(COSName.VERSION, COSName.getPDFName("1.4"));
        COSDictionary cOSDictionary3 = new COSDictionary();
        COSName cOSName2 = COSName.PAGES;
        cOSDictionary2.setItem(cOSName2, (COSBase) cOSDictionary3);
        cOSDictionary3.setItem(cOSName, (COSBase) cOSName2);
        cOSDictionary3.setItem(COSName.KIDS, (COSBase) new COSArray());
        cOSDictionary3.setItem(COSName.COUNT, (COSBase) COSInteger.ZERO);
    }

    public static PDDocument load(File file, MemoryUsageSetting memoryUsageSetting) throws IOException {
        return load(file, "", (InputStream) null, (String) null, memoryUsageSetting);
    }

    public void addSignature(PDSignature pDSignature, SignatureOptions signatureOptions) throws IOException {
        addSignature(pDSignature, null, signatureOptions);
    }

    public void removePage(int i) {
        getPages().remove(i);
    }

    public void save(File file) throws IOException {
        save(new BufferedOutputStream(new FileOutputStream(file)));
    }

    public static PDDocument load(File file, String str) throws IOException {
        return load(file, str, (InputStream) null, (String) null, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public void addSignature(PDSignature pDSignature, SignatureInterface signatureInterface) throws IOException {
        addSignature(pDSignature, signatureInterface, new SignatureOptions());
    }

    public void save(OutputStream outputStream) throws IOException {
        if (!this.f60096a.isClosed()) {
            for (PDFont pDFont : this.f60104i) {
                pDFont.subset();
            }
            this.f60104i.clear();
            COSWriter cOSWriter = new COSWriter(outputStream);
            try {
                cOSWriter.write(this);
                return;
            } finally {
                cOSWriter.close();
            }
        }
        throw new IOException("Cannot save a document which has been closed");
    }

    public static PDDocument load(File file, String str, MemoryUsageSetting memoryUsageSetting) throws IOException {
        return load(file, str, (InputStream) null, (String) null, memoryUsageSetting);
    }

    public void addSignature(PDSignature pDSignature, SignatureInterface signatureInterface, SignatureOptions signatureOptions) throws IOException {
        if (!this.f60109n) {
            this.f60109n = true;
            int preferredSignatureSize = signatureOptions.getPreferredSignatureSize();
            if (preferredSignatureSize > 0) {
                pDSignature.setContents(new byte[preferredSignatureSize]);
            } else {
                pDSignature.setContents(new byte[SignatureOptions.DEFAULT_SIGNATURE_SIZE]);
            }
            pDSignature.setByteRange(f60095o);
            this.f60106k = signatureInterface;
            int numberOfPages = getNumberOfPages();
            if (numberOfPages != 0) {
                PDPage page = getPage(Math.min(Math.max(signatureOptions.getPage(), 0), numberOfPages - 1));
                PDDocumentCatalog documentCatalog = getDocumentCatalog();
                PDSignatureField pDSignatureField = null;
                PDAcroForm acroForm = documentCatalog.getAcroForm(null);
                documentCatalog.getCOSObject().setNeedToBeUpdated(true);
                if (acroForm == null) {
                    acroForm = new PDAcroForm(this);
                    documentCatalog.setAcroForm(acroForm);
                } else {
                    acroForm.getCOSObject().setNeedToBeUpdated(true);
                }
                COSDictionary cOSObject = acroForm.getCOSObject();
                COSName cOSName = COSName.FIELDS;
                COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName);
                if (dictionaryObject instanceof COSArray) {
                    ((COSArray) dictionaryObject).setNeedToBeUpdated(true);
                    pDSignatureField = m32608k(acroForm.getFieldIterator(), pDSignature);
                } else {
                    acroForm.getCOSObject().setItem(cOSName, (COSBase) new COSArray());
                }
                if (pDSignatureField == null) {
                    pDSignatureField = new PDSignatureField(acroForm);
                    pDSignatureField.setValue(pDSignature);
                    pDSignatureField.getWidgets().get(0).setPage(page);
                } else {
                    pDSignature.getCOSObject().setNeedToBeUpdated(true);
                }
                pDSignatureField.getWidgets().get(0).setPrinted(true);
                List<PDField> fields = acroForm.getFields();
                acroForm.getCOSObject().setDirect(true);
                acroForm.setSignaturesExist(true);
                acroForm.setAppendOnly(true);
                boolean m32609j = m32609j(acroForm.getFieldIterator(), pDSignatureField);
                if (m32609j) {
                    pDSignatureField.getCOSObject().setNeedToBeUpdated(true);
                } else {
                    fields.add(pDSignatureField);
                }
                COSDocument visualSignature = signatureOptions.getVisualSignature();
                if (visualSignature == null) {
                    m32605n(pDSignatureField);
                    return;
                }
                m32604o(pDSignatureField, acroForm, visualSignature);
                List<PDAnnotation> annotations = page.getAnnotations();
                page.setAnnotations(annotations);
                if (!(annotations instanceof COSArrayList) || !(fields instanceof COSArrayList) || !((COSArrayList) annotations).toList().equals(((COSArrayList) fields).toList()) || !m32609j) {
                    PDAnnotationWidget pDAnnotationWidget = pDSignatureField.getWidgets().get(0);
                    if (m32610i(annotations, pDAnnotationWidget)) {
                        pDAnnotationWidget.getCOSObject().setNeedToBeUpdated(true);
                    } else {
                        annotations.add(pDAnnotationWidget);
                    }
                }
                page.getCOSObject().setNeedToBeUpdated(true);
                return;
            }
            throw new IllegalStateException("Cannot sign an empty document");
        }
        throw new IllegalStateException("Only one signature may be added in a document");
    }

    public static PDDocument load(File file, String str, InputStream inputStream, String str2) throws IOException {
        return load(file, str, inputStream, str2, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(File file, String str, InputStream inputStream, String str2, MemoryUsageSetting memoryUsageSetting) throws IOException {
        RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream = new RandomAccessBufferedFileInputStream(file);
        try {
            return m32606m(randomAccessBufferedFileInputStream, str, inputStream, str2, memoryUsageSetting);
        } catch (IOException e) {
            IOUtils.closeQuietly(randomAccessBufferedFileInputStream);
            throw e;
        }
    }

    public void saveIncremental(OutputStream outputStream, Set<COSDictionary> set) throws IOException {
        COSWriter cOSWriter;
        if (this.f60102g != null) {
            COSWriter cOSWriter2 = null;
            try {
                cOSWriter = new COSWriter(outputStream, this.f60102g, set);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                cOSWriter.write(this, this.f60106k);
                cOSWriter.close();
                return;
            } catch (Throwable th3) {
                th = th3;
                cOSWriter2 = cOSWriter;
                if (cOSWriter2 != null) {
                    cOSWriter2.close();
                }
                throw th;
            }
        }
        throw new IllegalStateException("document was not loaded from a file or a stream");
    }

    public static PDDocument load(InputStream inputStream) throws IOException {
        return load(inputStream, "", (InputStream) null, (String) null, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(InputStream inputStream, MemoryUsageSetting memoryUsageSetting) throws IOException {
        return load(inputStream, "", (InputStream) null, (String) null, memoryUsageSetting);
    }

    public static PDDocument load(InputStream inputStream, String str) throws IOException {
        return load(inputStream, str, (InputStream) null, (String) null, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(InputStream inputStream, String str, InputStream inputStream2, String str2) throws IOException {
        return load(inputStream, str, inputStream2, str2, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public static PDDocument load(InputStream inputStream, String str, MemoryUsageSetting memoryUsageSetting) throws IOException {
        return load(inputStream, str, (InputStream) null, (String) null, memoryUsageSetting);
    }

    public static PDDocument load(InputStream inputStream, String str, InputStream inputStream2, String str2, MemoryUsageSetting memoryUsageSetting) throws IOException {
        ScratchFile scratchFile = new ScratchFile(memoryUsageSetting);
        try {
            PDFParser pDFParser = new PDFParser(scratchFile.createBuffer(inputStream), str, inputStream2, str2, scratchFile);
            pDFParser.parse();
            return pDFParser.getPDDocument();
        } catch (IOException e) {
            IOUtils.closeQuietly(scratchFile);
            throw e;
        }
    }

    public static PDDocument load(byte[] bArr) throws IOException {
        return load(bArr, "");
    }

    public static PDDocument load(byte[] bArr, String str) throws IOException {
        return load(bArr, str, (InputStream) null, (String) null);
    }

    public PDDocument(COSDocument cOSDocument) {
        this(cOSDocument, null);
    }

    public static PDDocument load(byte[] bArr, String str, InputStream inputStream, String str2) throws IOException {
        return load(bArr, str, inputStream, str2, MemoryUsageSetting.setupMainMemoryOnly());
    }

    public PDDocument(COSDocument cOSDocument, RandomAccessRead randomAccessRead) {
        this(cOSDocument, randomAccessRead, null);
    }

    public static PDDocument load(byte[] bArr, String str, InputStream inputStream, String str2, MemoryUsageSetting memoryUsageSetting) throws IOException {
        PDFParser pDFParser = new PDFParser(new RandomAccessBuffer(bArr), str, inputStream, str2, new ScratchFile(memoryUsageSetting));
        pDFParser.parse();
        return pDFParser.getPDDocument();
    }

    public PDDocument(COSDocument cOSDocument, RandomAccessRead randomAccessRead, AccessPermission accessPermission) {
        this.f60104i = new HashSet();
        this.f60105j = new HashSet();
        this.f60108m = new DefaultResourceCache();
        this.f60109n = false;
        this.f60096a = cOSDocument;
        this.f60102g = randomAccessRead;
        this.f60103h = accessPermission;
    }
}
