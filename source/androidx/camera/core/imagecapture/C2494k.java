package androidx.camera.core.imagecapture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* renamed from: androidx.camera.core.imagecapture.k */
/* loaded from: classes.dex */
public class C2494k implements Operation {

    /* renamed from: androidx.camera.core.imagecapture.k$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2495a {
        /* renamed from: c */
        public static AbstractC2495a m63003c(Packet packet, ImageCapture.OutputFileOptions outputFileOptions) {
            return new C2482e(packet, outputFileOptions);
        }

        /* renamed from: a */
        public abstract ImageCapture.OutputFileOptions mo63005a();

        /* renamed from: b */
        public abstract Packet mo63004b();
    }

    /* renamed from: b */
    public static Uri m63019b(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    /* renamed from: c */
    public static Uri m63018c(File file, ImageCapture.OutputFileOptions outputFileOptions) {
        ContentValues contentValues;
        ContentResolver contentResolver = outputFileOptions.getContentResolver();
        Objects.requireNonNull(contentResolver);
        if (outputFileOptions.getContentValues() != null) {
            contentValues = new ContentValues(outputFileOptions.getContentValues());
        } else {
            contentValues = new ContentValues();
        }
        m63009l(contentValues, 1);
        Uri uri = null;
        try {
            try {
                Uri insert = contentResolver.insert(outputFileOptions.getSaveCollection(), contentValues);
                try {
                    if (insert != null) {
                        m63016e(file, insert, contentResolver);
                        m63007n(insert, contentResolver, 0);
                        return insert;
                    }
                    throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
                } catch (IOException e) {
                    e = e;
                    uri = insert;
                    throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (SecurityException e2) {
                    e = e2;
                    uri = insert;
                    throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
                } catch (Throwable th2) {
                    th = th2;
                    uri = insert;
                    if (uri != null) {
                        m63007n(uri, contentResolver, 0);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (SecurityException e4) {
                e = e4;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: d */
    public static void m63017d(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: e */
    public static void m63016e(File file, Uri uri, ContentResolver contentResolver) {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (openOutputStream != null) {
                m63017d(file, openOutputStream);
                openOutputStream.close();
                return;
            }
            throw new FileNotFoundException(uri + " cannot be resolved.");
        } catch (Throwable th2) {
            if (openOutputStream != null) {
                try {
                    openOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* renamed from: f */
    public static File m63015f(ImageCapture.OutputFileOptions outputFileOptions) {
        try {
            File file = outputFileOptions.getFile();
            if (file != null) {
                String parent = file.getParent();
                return new File(parent, "CameraX" + UUID.randomUUID().toString() + m63014g(file));
            }
            return File.createTempFile("CameraX", ".tmp");
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e);
        }
    }

    /* renamed from: g */
    public static String m63014g(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            return name.substring(lastIndexOf);
        }
        return "";
    }

    /* renamed from: h */
    public static boolean m63013h(ImageCapture.OutputFileOptions outputFileOptions) {
        if (outputFileOptions.getFile() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m63012i(ImageCapture.OutputFileOptions outputFileOptions) {
        if (outputFileOptions.getSaveCollection() != null && outputFileOptions.getContentResolver() != null && outputFileOptions.getContentValues() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m63011j(ImageCapture.OutputFileOptions outputFileOptions) {
        if (outputFileOptions.getOutputStream() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static Uri m63010k(File file, ImageCapture.OutputFileOptions outputFileOptions) {
        Uri uri = null;
        try {
            try {
                if (m63012i(outputFileOptions)) {
                    uri = m63018c(file, outputFileOptions);
                } else if (m63011j(outputFileOptions)) {
                    OutputStream outputStream = outputFileOptions.getOutputStream();
                    Objects.requireNonNull(outputStream);
                    m63017d(file, outputStream);
                } else if (m63013h(outputFileOptions)) {
                    File file2 = outputFileOptions.getFile();
                    Objects.requireNonNull(file2);
                    uri = m63019b(file, file2);
                }
                file.delete();
                return uri;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th2) {
            file.delete();
            throw th2;
        }
    }

    /* renamed from: l */
    public static void m63009l(ContentValues contentValues, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i));
        }
    }

    /* renamed from: m */
    public static void m63008m(File file, Exif exif, ImageCapture.OutputFileOptions outputFileOptions, int i) {
        try {
            Exif createFromFile = Exif.createFromFile(file);
            exif.copyToCroppedImage(createFromFile);
            if (createFromFile.getRotation() == 0 && i != 0) {
                createFromFile.rotate(i);
            }
            ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (metadata.isReversedHorizontal()) {
                createFromFile.flipHorizontally();
            }
            if (metadata.isReversedVertical()) {
                createFromFile.flipVertically();
            }
            if (metadata.getLocation() != null) {
                createFromFile.attachLocation(metadata.getLocation());
            }
            createFromFile.save();
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e);
        }
    }

    /* renamed from: n */
    public static void m63007n(Uri uri, ContentResolver contentResolver, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            m63009l(contentValues, i);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    /* renamed from: o */
    public static void m63006o(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr, 0, new InvalidJpegDataParser().getValidDataLength(bArr));
            fileOutputStream.close();
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    /* renamed from: a */
    public ImageCapture.OutputFileResults apply(AbstractC2495a abstractC2495a) {
        Packet mo63004b = abstractC2495a.mo63004b();
        ImageCapture.OutputFileOptions mo63005a = abstractC2495a.mo63005a();
        File m63015f = m63015f(mo63005a);
        m63006o(m63015f, (byte[]) mo63004b.getData());
        Exif exif = mo63004b.getExif();
        Objects.requireNonNull(exif);
        m63008m(m63015f, exif, mo63005a, mo63004b.getRotationDegrees());
        return new ImageCapture.OutputFileResults(m63010k(m63015f, mo63005a));
    }
}
