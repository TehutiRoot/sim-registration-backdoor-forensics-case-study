package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObject;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDMetadata;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.util.filetypedetector.FileType;
import com.tom_roush.pdfbox.util.filetypedetector.FileTypeDetector;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class PDImageXObject extends PDXObject implements PDImage {

    /* renamed from: b */
    public SoftReference f60500b;

    /* renamed from: c */
    public PDColorSpace f60501c;

    /* renamed from: d */
    public int f60502d;

    /* renamed from: e */
    public final PDResources f60503e;

    public PDImageXObject(PDDocument pDDocument) throws IOException {
        this(new PDStream(pDDocument), null);
    }

    /* renamed from: b */
    public static int m32375b(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* renamed from: c */
    public static COSStream m32374c(PDDocument pDDocument, InputStream inputStream) {
        OutputStream outputStream;
        COSStream createCOSStream = pDDocument.getDocument().createCOSStream();
        try {
            outputStream = createCOSStream.createRawOutputStream();
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            IOUtils.copy(inputStream, outputStream);
            if (outputStream != null) {
                outputStream.close();
            }
            return createCOSStream;
        } catch (Throwable th3) {
            th = th3;
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr, String str) throws IOException {
        try {
            FileType detectFileType = FileTypeDetector.detectFileType(bArr);
            if (detectFileType != null) {
                if (detectFileType.equals(FileType.JPEG)) {
                    return JPEGFactory.createFromByteArray(pDDocument, bArr);
                }
                if (detectFileType.equals(FileType.TIFF)) {
                    try {
                        return CCITTFactory.createFromByteArray(pDDocument, bArr);
                    } catch (IOException unused) {
                        detectFileType = FileType.PNG;
                    }
                }
                if (!detectFileType.equals(FileType.BMP) && !detectFileType.equals(FileType.GIF) && !detectFileType.equals(FileType.PNG)) {
                    throw new IllegalArgumentException("Image type " + detectFileType + " not supported: " + str);
                }
                return LosslessFactory.createFromImage(pDDocument, BitmapFactory.decodeStream(new ByteArrayInputStream(bArr)));
            }
            throw new IllegalArgumentException("Image type not supported: " + str);
        } catch (IOException e) {
            throw new IOException("Could not determine file type: " + str, e);
        }
    }

    public static PDImageXObject createFromFile(String str, PDDocument pDDocument) throws IOException {
        return createFromFileByExtension(new File(str), pDDocument);
    }

    public static PDImageXObject createFromFileByContent(File file, PDDocument pDDocument) throws IOException {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream2);
                try {
                    FileType detectFileType = FileTypeDetector.detectFileType(bufferedInputStream);
                    IOUtils.closeQuietly(fileInputStream2);
                    IOUtils.closeQuietly(bufferedInputStream);
                    if (detectFileType != null) {
                        if (detectFileType.equals(FileType.JPEG)) {
                            FileInputStream fileInputStream3 = new FileInputStream(file);
                            PDImageXObject createFromStream = JPEGFactory.createFromStream(pDDocument, fileInputStream3);
                            fileInputStream3.close();
                            return createFromStream;
                        }
                        if (detectFileType.equals(FileType.TIFF)) {
                            try {
                                return CCITTFactory.createFromFile(pDDocument, file);
                            } catch (IOException unused) {
                                detectFileType = FileType.PNG;
                            }
                        }
                        if (!detectFileType.equals(FileType.BMP) && !detectFileType.equals(FileType.GIF) && !detectFileType.equals(FileType.PNG)) {
                            throw new IllegalArgumentException("Image type " + detectFileType + " not supported: " + file.getName());
                        }
                        return LosslessFactory.createFromImage(pDDocument, BitmapFactory.decodeFile(file.getPath()));
                    }
                    throw new IllegalArgumentException("Image type not supported: " + file.getName());
                } catch (IOException e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    try {
                        throw new IOException("Could not determine file type: " + file.getName(), e);
                    } catch (Throwable th2) {
                        th = th2;
                        IOUtils.closeQuietly(fileInputStream);
                        IOUtils.closeQuietly(bufferedInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    IOUtils.closeQuietly(fileInputStream);
                    IOUtils.closeQuietly(bufferedInputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedInputStream = null;
        }
    }

    public static PDImageXObject createFromFileByExtension(File file, PDDocument pDDocument) throws IOException {
        FileInputStream fileInputStream;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf != -1) {
            String lowerCase = name.substring(lastIndexOf + 1).toLowerCase();
            if (!"jpg".equals(lowerCase) && !"jpeg".equals(lowerCase)) {
                if (!"tif".equals(lowerCase) && !"tiff".equals(lowerCase)) {
                    if (!"gif".equals(lowerCase) && !"bmp".equals(lowerCase) && !"png".equals(lowerCase)) {
                        throw new IllegalArgumentException("Image type not supported: " + name);
                    }
                    return LosslessFactory.createFromImage(pDDocument, BitmapFactory.decodeFile(file.getPath()));
                }
                return CCITTFactory.createFromFile(pDDocument, file);
            }
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                PDImageXObject createFromStream = JPEGFactory.createFromStream(pDDocument, fileInputStream);
                IOUtils.closeQuietly(fileInputStream);
                return createFromStream;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                IOUtils.closeQuietly(fileInputStream2);
                throw th;
            }
        }
        throw new IllegalArgumentException("Image type not supported: " + name);
    }

    public static PDImageXObject createThumbnail(COSStream cOSStream) throws IOException {
        return new PDImageXObject(new PDStream(cOSStream), null);
    }

    /* renamed from: a */
    public final Bitmap m32376a(Bitmap bitmap, Bitmap bitmap2, boolean z, boolean z2, float[] fArr) {
        Bitmap bitmap3 = bitmap;
        Bitmap bitmap4 = bitmap2;
        if (bitmap4 == null) {
            return bitmap3;
        }
        int max = Math.max(bitmap.getWidth(), bitmap2.getWidth());
        int max2 = Math.max(bitmap.getHeight(), bitmap2.getHeight());
        if (bitmap2.getWidth() < max || bitmap2.getHeight() < max2) {
            bitmap4 = m32372e(bitmap4, max, max2, z);
        }
        Bitmap.Config config = bitmap4.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
        if (config != config2 || !bitmap.isMutable()) {
            bitmap4 = bitmap4.copy(config2, true);
        }
        if (bitmap.getWidth() < max || bitmap.getHeight() < max2) {
            bitmap3 = m32372e(bitmap3, max, max2, getInterpolate());
        }
        Bitmap.Config config3 = bitmap3.getConfig();
        Bitmap.Config config4 = Bitmap.Config.ARGB_8888;
        if (config3 != config4 || !bitmap3.isMutable()) {
            bitmap3 = bitmap3.copy(config4, true);
        }
        int[] iArr = new int[max];
        int[] iArr2 = new int[max];
        if (!z2 && bitmap3.getByteCount() == bitmap4.getByteCount()) {
            int i = 0;
            while (i < max2) {
                int i2 = i;
                bitmap3.getPixels(iArr, 0, max, 0, i, max, 1);
                bitmap4.getPixels(iArr2, 0, max, 0, i2, max, 1);
                int i3 = 0;
                for (int i4 = max; i4 > 0; i4--) {
                    iArr[i3] = (iArr[i3] & ViewCompat.MEASURED_SIZE_MASK) | ((~iArr2[i3]) & (-16777216));
                    i3++;
                }
                bitmap3.setPixels(iArr, 0, max, 0, i2, max, 1);
                i = i2 + 1;
            }
        } else if (fArr == null) {
            for (int i5 = 0; i5 < max2; i5++) {
                int i6 = i5;
                bitmap3.getPixels(iArr, 0, max, 0, i6, max, 1);
                bitmap4.getPixels(iArr2, 0, max, 0, i6, max, 1);
                for (int i7 = 0; i7 < max; i7++) {
                    if (!z2) {
                        iArr2[i7] = ~iArr2[i7];
                    }
                    iArr[i7] = (iArr[i7] & ViewCompat.MEASURED_SIZE_MASK) | (iArr2[i7] & (-16777216));
                }
                bitmap3.setPixels(iArr, 0, max, 0, i5, max, 1);
            }
        } else {
            int round = Math.round(fArr[0] * 8355840.0f) * 255;
            int round2 = Math.round(fArr[1] * 8355840.0f) * 255;
            int round3 = Math.round(fArr[2] * 8355840.0f) * 255;
            int i8 = (round / 255) + 16384;
            int i9 = (round2 / 255) + 16384;
            int i10 = (round3 / 255) + 16384;
            int i11 = 0;
            while (i11 < max2) {
                int i12 = i11;
                int i13 = i10;
                int i14 = i9;
                int i15 = i8;
                int i16 = round3;
                int i17 = round;
                bitmap3.getPixels(iArr, 0, max, 0, i12, max, 1);
                bitmap4.getPixels(iArr2, 0, max, 0, i12, max, 1);
                for (int i18 = 0; i18 < max; i18++) {
                    int alpha = Color.alpha(iArr2[i18]);
                    if (alpha == 0) {
                        iArr[i18] = iArr[i18] & ViewCompat.MEASURED_SIZE_MASK;
                    } else {
                        int i19 = iArr[i18];
                        iArr[i18] = Color.argb(alpha, m32375b(((((Color.red(i19) * 8355840) - i17) / alpha) + i15) >> 15), m32375b(((((Color.green(i19) * 8355840) - round2) / alpha) + i14) >> 15), m32375b(((((Color.blue(i19) * 8355840) - i16) / alpha) + i13) >> 15));
                    }
                }
                bitmap3.setPixels(iArr, 0, max, 0, i12, max, 1);
                i11 = i12 + 1;
                i8 = i15;
                i10 = i13;
                i9 = i14;
                round3 = i16;
                round = i17;
            }
        }
        return bitmap3;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream() throws IOException {
        return getStream().createInputStream();
    }

    /* renamed from: d */
    public final float[] m32373d(PDImageXObject pDImageXObject) {
        COSBase item = pDImageXObject.getCOSObject().getItem(COSName.MATTE);
        if (!(item instanceof COSArray)) {
            return null;
        }
        float[] floatArray = ((COSArray) item).toFloatArray();
        if (floatArray.length < getColorSpace().getNumberOfComponents()) {
            return null;
        }
        return getColorSpace().toRGB(floatArray);
    }

    /* renamed from: e */
    public final Bitmap m32372e(Bitmap bitmap, int i, int i2, boolean z) {
        return Bitmap.createScaledBitmap(bitmap, i, i2, !z);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getBitsPerComponent() {
        if (isStencil()) {
            return 1;
        }
        return getCOSObject().getInt(COSName.BITS_PER_COMPONENT, COSName.BPC);
    }

    public COSArray getColorKeyMask() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.MASK);
        if (dictionaryObject instanceof COSArray) {
            return (COSArray) dictionaryObject;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public PDColorSpace getColorSpace() throws IOException {
        COSObject cOSObject;
        PDResources pDResources;
        if (this.f60501c == null) {
            COSBase item = getCOSObject().getItem(COSName.COLORSPACE, COSName.f59769CS);
            if (item != null) {
                if ((item instanceof COSObject) && (pDResources = this.f60503e) != null && pDResources.getResourceCache() != null) {
                    cOSObject = (COSObject) item;
                    PDColorSpace colorSpace = this.f60503e.getResourceCache().getColorSpace(cOSObject);
                    this.f60501c = colorSpace;
                    if (colorSpace != null) {
                        return colorSpace;
                    }
                } else {
                    cOSObject = null;
                }
                this.f60501c = PDColorSpace.create(item, this.f60503e);
                if (cOSObject != null) {
                    this.f60503e.getResourceCache().put(cOSObject, this.f60501c);
                }
            } else if (isStencil()) {
                return PDDeviceGray.INSTANCE;
            } else {
                throw new IOException("could not determine color space");
            }
        }
        return this.f60501c;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public COSArray getDecode() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.DECODE);
        if (dictionaryObject instanceof COSArray) {
            return (COSArray) dictionaryObject;
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getHeight() {
        return getCOSObject().getInt(COSName.HEIGHT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getImage() throws IOException {
        return getImage(null, 1);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean getInterpolate() {
        return getCOSObject().getBoolean(COSName.INTERPOLATE, false);
    }

    public PDImageXObject getMask() throws IOException {
        COSStream cOSStream;
        COSStream cOSObject = getCOSObject();
        COSName cOSName = COSName.MASK;
        if ((cOSObject.getDictionaryObject(cOSName) instanceof COSArray) || (cOSStream = getCOSObject().getCOSStream(cOSName)) == null) {
            return null;
        }
        return new PDImageXObject(new PDStream(cOSStream), null);
    }

    public PDMetadata getMetadata() {
        COSStream cOSStream = getCOSObject().getCOSStream(COSName.METADATA);
        if (cOSStream != null) {
            return new PDMetadata(cOSStream);
        }
        return null;
    }

    public Bitmap getOpaqueImage() throws IOException {
        return AbstractC20691kD1.m28977g(this, null);
    }

    public PDPropertyList getOptionalContent() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.f59810OC);
        if (dictionaryObject instanceof COSDictionary) {
            return PDPropertyList.create((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDImageXObject getSoftMask() throws IOException {
        COSStream cOSStream = getCOSObject().getCOSStream(COSName.SMASK);
        if (cOSStream == null) {
            return null;
        }
        return new PDImageXObject(new PDStream(cOSStream), null);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getStencilImage(Paint paint) throws IOException {
        if (isStencil()) {
            return AbstractC20691kD1.m28976h(this, paint);
        }
        throw new IllegalStateException("Image is not a stencil");
    }

    public int getStructParent() {
        return getCOSObject().getInt(COSName.STRUCT_PARENT);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public String getSuffix() {
        List<COSName> filters = getStream().getFilters();
        if (filters == null) {
            return "png";
        }
        if (filters.contains(COSName.DCT_DECODE)) {
            return "jpg";
        }
        if (filters.contains(COSName.JPX_DECODE)) {
            return "jpx";
        }
        if (filters.contains(COSName.CCITTFAX_DECODE)) {
            return "tiff";
        }
        if (filters.contains(COSName.FLATE_DECODE) || filters.contains(COSName.LZW_DECODE) || filters.contains(COSName.RUN_LENGTH_DECODE)) {
            return "png";
        }
        if (filters.contains(COSName.JBIG2_DECODE)) {
            return "jb2";
        }
        Log.w("PdfBox-Android", "getSuffix() returns null, filters: " + filters);
        return null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public int getWidth() {
        return getCOSObject().getInt(COSName.WIDTH);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean isEmpty() {
        if (getStream().getCOSObject().getLength() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public boolean isStencil() {
        return getCOSObject().getBoolean(COSName.IMAGE_MASK, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setBitsPerComponent(int i) {
        getCOSObject().setInt(COSName.BITS_PER_COMPONENT, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setColorSpace(PDColorSpace pDColorSpace) {
        COSBase cOSBase;
        COSStream cOSObject = getCOSObject();
        COSName cOSName = COSName.COLORSPACE;
        if (pDColorSpace != null) {
            cOSBase = pDColorSpace.getCOSObject();
        } else {
            cOSBase = null;
        }
        cOSObject.setItem(cOSName, cOSBase);
        this.f60501c = null;
        this.f60500b = null;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setDecode(COSArray cOSArray) {
        getCOSObject().setItem(COSName.DECODE, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setHeight(int i) {
        getCOSObject().setInt(COSName.HEIGHT, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setInterpolate(boolean z) {
        getCOSObject().setBoolean(COSName.INTERPOLATE, z);
    }

    public void setMetadata(PDMetadata pDMetadata) {
        getCOSObject().setItem(COSName.METADATA, pDMetadata);
    }

    public void setOptionalContent(PDPropertyList pDPropertyList) {
        getCOSObject().setItem(COSName.f59810OC, pDPropertyList);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setStencil(boolean z) {
        getCOSObject().setBoolean(COSName.IMAGE_MASK, z);
    }

    public void setStructParent(int i) {
        getCOSObject().setInt(COSName.STRUCT_PARENT, i);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public void setWidth(int i) {
        getCOSObject().setInt(COSName.WIDTH, i);
    }

    public PDImageXObject(PDDocument pDDocument, InputStream inputStream, COSBase cOSBase, int i, int i2, int i3, PDColorSpace pDColorSpace) throws IOException {
        super(m32374c(pDDocument, inputStream), COSName.IMAGE);
        this.f60502d = Integer.MAX_VALUE;
        getCOSObject().setItem(COSName.FILTER, cOSBase);
        this.f60503e = null;
        this.f60501c = null;
        setBitsPerComponent(i3);
        setWidth(i);
        setHeight(i2);
        setColorSpace(pDColorSpace);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream(DecodeOptions decodeOptions) throws IOException {
        return getStream().createInputStream(decodeOptions);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public Bitmap getImage(Rect rect, int i) throws IOException {
        Bitmap m28978f;
        SoftReference softReference;
        Bitmap bitmap;
        if (rect != null || i != this.f60502d || (softReference = this.f60500b) == null || (bitmap = (Bitmap) softReference.get()) == null) {
            PDImageXObject softMask = getSoftMask();
            PDImageXObject mask = getMask();
            if (softMask != null) {
                m28978f = m32376a(AbstractC20691kD1.m28978f(this, rect, i, getColorKeyMask()), softMask.getOpaqueImage(), softMask.getInterpolate(), true, m32373d(softMask));
            } else if (mask != null && mask.isStencil()) {
                m28978f = m32376a(AbstractC20691kD1.m28978f(this, rect, i, getColorKeyMask()), mask.getOpaqueImage(), mask.getInterpolate(), false, null);
            } else {
                m28978f = AbstractC20691kD1.m28978f(this, rect, i, getColorKeyMask());
            }
            if (rect == null && i <= this.f60502d) {
                this.f60502d = i;
                this.f60500b = new SoftReference(m28978f);
            }
            return m28978f;
        }
        return bitmap;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.image.PDImage
    public InputStream createInputStream(List<String> list) throws IOException {
        return getStream().createInputStream(list);
    }

    public PDImageXObject(PDStream pDStream, PDResources pDResources) throws IOException {
        super(pDStream, COSName.IMAGE);
        COSInputStream cOSInputStream;
        this.f60502d = Integer.MAX_VALUE;
        this.f60503e = pDResources;
        List<COSName> filters = pDStream.getFilters();
        if (filters == null || filters.isEmpty() || !COSName.JPX_DECODE.equals(filters.get(filters.size() - 1))) {
            return;
        }
        List<COSName> asList = Arrays.asList(COSName.WIDTH, COSName.HEIGHT, COSName.COLORSPACE);
        COSStream cOSObject = pDStream.getCOSObject();
        for (COSName cOSName : asList) {
            if (!cOSObject.containsKey(cOSName)) {
                try {
                    cOSInputStream = pDStream.createInputStream();
                } catch (Throwable th2) {
                    th = th2;
                    cOSInputStream = null;
                }
                try {
                    DecodeResult decodeResult = cOSInputStream.getDecodeResult();
                    pDStream.getCOSObject().addAll(decodeResult.getParameters());
                    this.f60501c = decodeResult.getJPXColorSpace();
                    IOUtils.closeQuietly(cOSInputStream);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    IOUtils.closeQuietly(cOSInputStream);
                    throw th;
                }
            }
        }
    }
}
