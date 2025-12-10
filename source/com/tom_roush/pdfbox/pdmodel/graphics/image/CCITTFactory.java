package com.tom_roush.pdfbox.pdmodel.graphics.image;

import android.graphics.Bitmap;
import androidx.core.app.NotificationManagerCompat;
import com.tom_roush.harmony.javax.imageio.stream.MemoryCacheImageOutputStream;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.filter.FilterFactory;
import com.tom_roush.pdfbox.p019io.RandomAccess;
import com.tom_roush.pdfbox.p019io.RandomAccessBuffer;
import com.tom_roush.pdfbox.p019io.RandomAccessFile;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class CCITTFactory {
    /* renamed from: a */
    public static PDImageXObject m32403a(PDDocument pDDocument, RandomAccess randomAccess, int i) {
        COSDictionary cOSDictionary = new COSDictionary();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m32402b(randomAccess, byteArrayOutputStream, cOSDictionary, i);
        if (byteArrayOutputStream.size() == 0) {
            return null;
        }
        PDImageXObject pDImageXObject = new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), COSName.CCITTFAX_DECODE, cOSDictionary.getInt(COSName.COLUMNS), cOSDictionary.getInt(COSName.ROWS), 1, PDDeviceGray.INSTANCE);
        pDImageXObject.getCOSObject().setItem(COSName.DECODE_PARMS, (COSBase) cOSDictionary);
        return pDImageXObject;
    }

    /* renamed from: b */
    public static void m32402b(RandomAccess randomAccess, OutputStream outputStream, COSDictionary cOSDictionary, int i) {
        char read;
        int read2;
        try {
            randomAccess.seek(0L);
            read = (char) randomAccess.read();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (((char) randomAccess.read()) == read) {
                if (read != 'M' && read != 'I') {
                    throw new IOException("Not a valid tiff file");
                }
                if (m32399e(read, randomAccess) == 42) {
                    int m32400d = m32400d(read, randomAccess);
                    randomAccess.seek(m32400d);
                    for (int i2 = 0; i2 < i; i2++) {
                        int m32399e = m32399e(read, randomAccess);
                        if (m32399e <= 50) {
                            randomAccess.seek(m32400d + 2 + (m32399e * 12));
                            m32400d = m32400d(read, randomAccess);
                            if (m32400d == 0) {
                                outputStream.close();
                                return;
                            }
                            randomAccess.seek(m32400d);
                        } else {
                            throw new IOException("Not a valid tiff file");
                        }
                    }
                    int m32399e2 = m32399e(read, randomAccess);
                    if (m32399e2 <= 50) {
                        int i3 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                        int i4 = 0;
                        int i5 = 0;
                        for (int i6 = 0; i6 < m32399e2; i6++) {
                            int m32399e3 = m32399e(read, randomAccess);
                            int m32399e4 = m32399e(read, randomAccess);
                            int m32400d2 = m32400d(read, randomAccess);
                            if (m32399e4 != 1) {
                                if (m32399e4 != 3) {
                                    read2 = m32400d(read, randomAccess);
                                } else {
                                    read2 = m32399e(read, randomAccess);
                                    randomAccess.read();
                                    randomAccess.read();
                                }
                            } else {
                                read2 = randomAccess.read();
                                randomAccess.read();
                                randomAccess.read();
                                randomAccess.read();
                            }
                            if (m32399e3 != 256) {
                                if (m32399e3 != 257) {
                                    if (m32399e3 != 259) {
                                        if (m32399e3 != 262) {
                                            if (m32399e3 != 266) {
                                                if (m32399e3 != 279) {
                                                    if (m32399e3 != 292) {
                                                        if (m32399e3 != 273) {
                                                            if (m32399e3 != 274) {
                                                                if (m32399e3 != 324) {
                                                                    if (m32399e3 == 325) {
                                                                        if (m32400d2 != 1) {
                                                                        }
                                                                        i5 = read2;
                                                                    }
                                                                } else {
                                                                    if (m32400d2 != 1) {
                                                                    }
                                                                    i4 = read2;
                                                                }
                                                            } else if (read2 != 1) {
                                                                throw new IOException("Orientation " + read2 + " is not supported");
                                                            }
                                                        } else {
                                                            if (m32400d2 != 1) {
                                                            }
                                                            i4 = read2;
                                                        }
                                                    } else {
                                                        if ((read2 & 1) != 0) {
                                                            i3 = 50;
                                                        }
                                                        if ((read2 & 4) == 0) {
                                                            if ((read2 & 2) != 0) {
                                                                throw new IOException("CCITT Group 3 'fill bits before EOL' is not supported");
                                                            }
                                                        } else {
                                                            throw new IOException("CCITT Group 3 'uncompressed mode' is not supported");
                                                        }
                                                    }
                                                } else {
                                                    if (m32400d2 != 1) {
                                                    }
                                                    i5 = read2;
                                                }
                                            } else if (read2 != 1) {
                                                throw new IOException("FillOrder " + read2 + " is not supported");
                                            }
                                        } else if (read2 == 1) {
                                            cOSDictionary.setBoolean(COSName.BLACK_IS_1, true);
                                        }
                                    } else {
                                        if (read2 == 4) {
                                            i3 = -1;
                                        }
                                        if (read2 == 3) {
                                            i3 = 0;
                                        }
                                    }
                                } else {
                                    cOSDictionary.setInt(COSName.ROWS, read2);
                                }
                            } else {
                                cOSDictionary.setInt(COSName.COLUMNS, read2);
                            }
                        }
                        if (i3 != -1000) {
                            if (i4 != 0) {
                                cOSDictionary.setInt(COSName.f59797K, i3);
                                randomAccess.seek(i4);
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int read3 = randomAccess.read(bArr, 0, Math.min(8192, i5));
                                    if (read3 > 0) {
                                        i5 -= read3;
                                        outputStream.write(bArr, 0, read3);
                                    } else {
                                        outputStream.close();
                                        return;
                                    }
                                }
                            } else {
                                throw new IOException("First image in tiff is not a single tile/strip");
                            }
                        } else {
                            throw new IOException("First image in tiff is not CCITT T4 or T6 compressed");
                        }
                    } else {
                        throw new IOException("Not a valid tiff file");
                    }
                } else {
                    throw new IOException("Not a valid tiff file");
                }
            } else {
                throw new IOException("Not a valid tiff file");
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream.close();
            throw th;
        }
    }

    /* renamed from: c */
    public static PDImageXObject m32401c(PDDocument pDDocument, byte[] bArr, int i, int i2, PDColorSpace pDColorSpace) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FilterFactory filterFactory = FilterFactory.INSTANCE;
        COSName cOSName = COSName.CCITTFAX_DECODE;
        Filter filter = filterFactory.getFilter(cOSName);
        COSDictionary cOSDictionary = new COSDictionary();
        cOSDictionary.setInt(COSName.COLUMNS, i);
        cOSDictionary.setInt(COSName.ROWS, i2);
        filter.encode(new ByteArrayInputStream(bArr), byteArrayOutputStream, cOSDictionary, 0);
        PDImageXObject pDImageXObject = new PDImageXObject(pDDocument, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), cOSName, i, i2, 1, pDColorSpace);
        cOSDictionary.setInt(COSName.f59797K, -1);
        pDImageXObject.getCOSObject().setItem(COSName.DECODE_PARMS, (COSBase) cOSDictionary);
        return pDImageXObject;
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr) throws IOException {
        return createFromByteArray(pDDocument, bArr, 0);
    }

    public static PDImageXObject createFromFile(PDDocument pDDocument, File file) throws IOException {
        return createFromFile(pDDocument, file, 0);
    }

    public static PDImageXObject createFromImage(PDDocument pDDocument, Bitmap bitmap) throws IOException {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            int[] iArr = new int[width];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            MemoryCacheImageOutputStream memoryCacheImageOutputStream = new MemoryCacheImageOutputStream(byteArrayOutputStream);
            for (int i = 0; i < height; i++) {
                bitmap.getPixels(iArr, 0, width, 0, i, width, 1);
                for (int i2 = 0; i2 < width; i2++) {
                    memoryCacheImageOutputStream.writeBits(~(iArr[i2] & 1), 1);
                }
                if (memoryCacheImageOutputStream.getBitOffset() != 0) {
                    memoryCacheImageOutputStream.writeBits(0L, 8 - memoryCacheImageOutputStream.getBitOffset());
                }
            }
            memoryCacheImageOutputStream.flush();
            memoryCacheImageOutputStream.close();
            return m32401c(pDDocument, byteArrayOutputStream.toByteArray(), width, height, PDDeviceGray.INSTANCE);
        }
        throw new IllegalArgumentException("Only 1-bit b/w images supported");
    }

    @Deprecated
    public static PDImageXObject createFromRandomAccess(PDDocument pDDocument, RandomAccess randomAccess) throws IOException {
        return m32403a(pDDocument, randomAccess, 0);
    }

    /* renamed from: d */
    public static int m32400d(char c, RandomAccess randomAccess) {
        int read;
        int read2;
        if (c == 'I') {
            read = randomAccess.read() | (randomAccess.read() << 8) | (randomAccess.read() << 16);
            read2 = randomAccess.read() << 24;
        } else {
            read = (randomAccess.read() << 24) | (randomAccess.read() << 16) | (randomAccess.read() << 8);
            read2 = randomAccess.read();
        }
        return read | read2;
    }

    /* renamed from: e */
    public static int m32399e(char c, RandomAccess randomAccess) {
        int read;
        int read2;
        if (c == 'I') {
            read = randomAccess.read();
            read2 = randomAccess.read() << 8;
        } else {
            read = randomAccess.read() << 8;
            read2 = randomAccess.read();
        }
        return read | read2;
    }

    public static PDImageXObject createFromByteArray(PDDocument pDDocument, byte[] bArr, int i) throws IOException {
        RandomAccessBuffer randomAccessBuffer = new RandomAccessBuffer(bArr);
        try {
            return m32403a(pDDocument, randomAccessBuffer, i);
        } finally {
            randomAccessBuffer.close();
        }
    }

    public static PDImageXObject createFromFile(PDDocument pDDocument, File file, int i) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, PDPageLabelRange.STYLE_ROMAN_LOWER);
        try {
            return m32403a(pDDocument, randomAccessFile, i);
        } finally {
            randomAccessFile.close();
        }
    }

    @Deprecated
    public static PDImageXObject createFromRandomAccess(PDDocument pDDocument, RandomAccess randomAccess, int i) throws IOException {
        return m32403a(pDDocument, randomAccess, i);
    }
}
