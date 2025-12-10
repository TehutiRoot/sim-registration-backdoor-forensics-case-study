package com.shockwave.pdfium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.Size;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class PdfiumCore {

    /* renamed from: b */
    public static final Class f59063b = FileDescriptor.class;

    /* renamed from: c */
    public static final Object f59064c;

    /* renamed from: d */
    public static Field f59065d;

    /* renamed from: a */
    public int f59066a;

    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("modpng");
            System.loadLibrary("modft2");
            System.loadLibrary("modpdfium");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Native libraries failed to load - ");
            sb.append(e);
        }
        f59064c = new Object();
        f59065d = null;
    }

    public PdfiumCore(Context context) {
        this.f59066a = context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int getNumFd(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            if (f59065d == null) {
                Field declaredField = f59063b.getDeclaredField("descriptor");
                f59065d = declaredField;
                declaredField.setAccessible(true);
            }
            return f59065d.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    private native void nativeCloseDocument(long j);

    private native void nativeClosePage(long j);

    private native long nativeGetBookmarkDestIndex(long j, long j2);

    private native String nativeGetBookmarkTitle(long j);

    private native Integer nativeGetDestPageIndex(long j, long j2);

    private native String nativeGetDocumentMetaText(long j, String str);

    private native Long nativeGetFirstChildBookmark(long j, Long l);

    private native RectF nativeGetLinkRect(long j);

    private native String nativeGetLinkURI(long j, long j2);

    private native int nativeGetPageCount(long j);

    private native int nativeGetPageHeightPixel(long j, int i);

    private native int nativeGetPageHeightPoint(long j);

    private native long[] nativeGetPageLinks(long j);

    private native Size nativeGetPageSizeByIndex(long j, int i, int i2);

    private native int nativeGetPageWidthPixel(long j, int i);

    private native int nativeGetPageWidthPoint(long j);

    private native Long nativeGetSiblingBookmark(long j, long j2);

    private native long nativeLoadPage(long j, int i);

    private native long[] nativeLoadPages(long j, int i, int i2);

    private native long nativeOpenDocument(int i, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native Point nativePageCoordsToDevice(long j, int i, int i2, int i3, int i4, int i5, double d, double d2);

    private native void nativeRenderPage(long j, Surface surface, int i, int i2, int i3, int i4, int i5, boolean z);

    private native void nativeRenderPageBitmap(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z);

    /* renamed from: a */
    public final void m33212a(List list, PdfDocument pdfDocument, long j) {
        PdfDocument.Bookmark bookmark = new PdfDocument.Bookmark();
        bookmark.f59051d = j;
        bookmark.f59049b = nativeGetBookmarkTitle(j);
        bookmark.f59050c = nativeGetBookmarkDestIndex(pdfDocument.f59045a, j);
        list.add(bookmark);
        Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f59045a, Long.valueOf(j));
        if (nativeGetFirstChildBookmark != null) {
            m33212a(bookmark.getChildren(), pdfDocument, nativeGetFirstChildBookmark.longValue());
        }
        Long nativeGetSiblingBookmark = nativeGetSiblingBookmark(pdfDocument.f59045a, j);
        if (nativeGetSiblingBookmark != null) {
            m33212a(list, pdfDocument, nativeGetSiblingBookmark.longValue());
        }
    }

    public void closeDocument(PdfDocument pdfDocument) {
        synchronized (f59064c) {
            try {
                for (Integer num : pdfDocument.f59047c.keySet()) {
                    nativeClosePage(((Long) pdfDocument.f59047c.get(num)).longValue());
                }
                pdfDocument.f59047c.clear();
                nativeCloseDocument(pdfDocument.f59045a);
                ParcelFileDescriptor parcelFileDescriptor = pdfDocument.f59046b;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    pdfDocument.f59046b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public PdfDocument.Meta getDocumentMeta(PdfDocument pdfDocument) {
        PdfDocument.Meta meta;
        synchronized (f59064c) {
            meta = new PdfDocument.Meta();
            meta.f59055a = nativeGetDocumentMetaText(pdfDocument.f59045a, "Title");
            meta.f59056b = nativeGetDocumentMetaText(pdfDocument.f59045a, "Author");
            meta.f59057c = nativeGetDocumentMetaText(pdfDocument.f59045a, "Subject");
            meta.f59058d = nativeGetDocumentMetaText(pdfDocument.f59045a, "Keywords");
            meta.f59059e = nativeGetDocumentMetaText(pdfDocument.f59045a, "Creator");
            meta.f59060f = nativeGetDocumentMetaText(pdfDocument.f59045a, "Producer");
            meta.f59061g = nativeGetDocumentMetaText(pdfDocument.f59045a, "CreationDate");
            meta.f59062h = nativeGetDocumentMetaText(pdfDocument.f59045a, "ModDate");
        }
        return meta;
    }

    public int getPageCount(PdfDocument pdfDocument) {
        int nativeGetPageCount;
        synchronized (f59064c) {
            nativeGetPageCount = nativeGetPageCount(pdfDocument.f59045a);
        }
        return nativeGetPageCount;
    }

    public int getPageHeight(PdfDocument pdfDocument, int i) {
        synchronized (f59064c) {
            try {
                Long l = (Long) pdfDocument.f59047c.get(Integer.valueOf(i));
                if (l != null) {
                    return nativeGetPageHeightPixel(l.longValue(), this.f59066a);
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getPageHeightPoint(PdfDocument pdfDocument, int i) {
        synchronized (f59064c) {
            try {
                Long l = (Long) pdfDocument.f59047c.get(Integer.valueOf(i));
                if (l != null) {
                    return nativeGetPageHeightPoint(l.longValue());
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List<PdfDocument.Link> getPageLinks(PdfDocument pdfDocument, int i) {
        long[] nativeGetPageLinks;
        synchronized (f59064c) {
            try {
                ArrayList arrayList = new ArrayList();
                Long l = (Long) pdfDocument.f59047c.get(Integer.valueOf(i));
                if (l == null) {
                    return arrayList;
                }
                for (long j : nativeGetPageLinks(l.longValue())) {
                    Integer nativeGetDestPageIndex = nativeGetDestPageIndex(pdfDocument.f59045a, j);
                    String nativeGetLinkURI = nativeGetLinkURI(pdfDocument.f59045a, j);
                    RectF nativeGetLinkRect = nativeGetLinkRect(j);
                    if (nativeGetLinkRect != null && (nativeGetDestPageIndex != null || nativeGetLinkURI != null)) {
                        arrayList.add(new PdfDocument.Link(nativeGetLinkRect, nativeGetDestPageIndex, nativeGetLinkURI));
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Size getPageSize(PdfDocument pdfDocument, int i) {
        Size nativeGetPageSizeByIndex;
        synchronized (f59064c) {
            nativeGetPageSizeByIndex = nativeGetPageSizeByIndex(pdfDocument.f59045a, i, this.f59066a);
        }
        return nativeGetPageSizeByIndex;
    }

    public int getPageWidth(PdfDocument pdfDocument, int i) {
        synchronized (f59064c) {
            try {
                Long l = (Long) pdfDocument.f59047c.get(Integer.valueOf(i));
                if (l != null) {
                    return nativeGetPageWidthPixel(l.longValue(), this.f59066a);
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getPageWidthPoint(PdfDocument pdfDocument, int i) {
        synchronized (f59064c) {
            try {
                Long l = (Long) pdfDocument.f59047c.get(Integer.valueOf(i));
                if (l != null) {
                    return nativeGetPageWidthPoint(l.longValue());
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List<PdfDocument.Bookmark> getTableOfContents(PdfDocument pdfDocument) {
        ArrayList arrayList;
        synchronized (f59064c) {
            try {
                arrayList = new ArrayList();
                Long nativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.f59045a, null);
                if (nativeGetFirstChildBookmark != null) {
                    m33212a(arrayList, pdfDocument, nativeGetFirstChildBookmark.longValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public Point mapPageCoordsToDevice(PdfDocument pdfDocument, int i, int i2, int i3, int i4, int i5, int i6, double d, double d2) {
        return nativePageCoordsToDevice(((Long) pdfDocument.f59047c.get(Integer.valueOf(i))).longValue(), i2, i3, i4, i5, i6, d, d2);
    }

    public RectF mapRectToDevice(PdfDocument pdfDocument, int i, int i2, int i3, int i4, int i5, int i6, RectF rectF) {
        Point mapPageCoordsToDevice = mapPageCoordsToDevice(pdfDocument, i, i2, i3, i4, i5, i6, rectF.left, rectF.top);
        Point mapPageCoordsToDevice2 = mapPageCoordsToDevice(pdfDocument, i, i2, i3, i4, i5, i6, rectF.right, rectF.bottom);
        return new RectF(mapPageCoordsToDevice.x, mapPageCoordsToDevice.y, mapPageCoordsToDevice2.x, mapPageCoordsToDevice2.y);
    }

    public PdfDocument newDocument(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        return newDocument(parcelFileDescriptor, (String) null);
    }

    public long openPage(PdfDocument pdfDocument, int i) {
        long nativeLoadPage;
        synchronized (f59064c) {
            nativeLoadPage = nativeLoadPage(pdfDocument.f59045a, i);
            pdfDocument.f59047c.put(Integer.valueOf(i), Long.valueOf(nativeLoadPage));
        }
        return nativeLoadPage;
    }

    public void renderPage(PdfDocument pdfDocument, Surface surface, int i, int i2, int i3, int i4, int i5) {
        renderPage(pdfDocument, surface, i, i2, i3, i4, i5, false);
    }

    public void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        renderPageBitmap(pdfDocument, bitmap, i, i2, i3, i4, i5, false);
    }

    public PdfDocument newDocument(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        PdfDocument pdfDocument = new PdfDocument();
        pdfDocument.f59046b = parcelFileDescriptor;
        synchronized (f59064c) {
            pdfDocument.f59045a = nativeOpenDocument(getNumFd(parcelFileDescriptor), str);
        }
        return pdfDocument;
    }

    public void renderPage(PdfDocument pdfDocument, Surface surface, int i, int i2, int i3, int i4, int i5, boolean z) {
        synchronized (f59064c) {
            try {
                try {
                } catch (NullPointerException e) {
                    e = e;
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
                try {
                    nativeRenderPage(((Long) pdfDocument.f59047c.get(Integer.valueOf(i))).longValue(), surface, this.f59066a, i2, i3, i4, i5, z);
                } catch (NullPointerException e3) {
                    e = e3;
                    e.printStackTrace();
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z) {
        synchronized (f59064c) {
            try {
                try {
                } catch (NullPointerException e) {
                    e = e;
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
                try {
                    nativeRenderPageBitmap(((Long) pdfDocument.f59047c.get(Integer.valueOf(i))).longValue(), bitmap, this.f59066a, i2, i3, i4, i5, z);
                } catch (NullPointerException e3) {
                    e = e3;
                    e.printStackTrace();
                } catch (Exception e4) {
                    e = e4;
                    e.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public long[] openPage(PdfDocument pdfDocument, int i, int i2) {
        long[] nativeLoadPages;
        synchronized (f59064c) {
            try {
                nativeLoadPages = nativeLoadPages(pdfDocument.f59045a, i, i2);
                for (long j : nativeLoadPages) {
                    if (i <= i2) {
                        pdfDocument.f59047c.put(Integer.valueOf(i), Long.valueOf(j));
                        i++;
                    }
                }
            } finally {
            }
        }
        return nativeLoadPages;
    }

    public PdfDocument newDocument(byte[] bArr) throws IOException {
        return newDocument(bArr, (String) null);
    }

    public PdfDocument newDocument(byte[] bArr, String str) throws IOException {
        PdfDocument pdfDocument = new PdfDocument();
        synchronized (f59064c) {
            pdfDocument.f59045a = nativeOpenMemDocument(bArr, str);
        }
        return pdfDocument;
    }
}
