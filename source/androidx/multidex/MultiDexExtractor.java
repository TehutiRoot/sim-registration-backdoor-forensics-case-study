package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public final class MultiDexExtractor implements Closeable {

    /* renamed from: a */
    public final File f36159a;

    /* renamed from: b */
    public final long f36160b;

    /* renamed from: c */
    public final File f36161c;

    /* renamed from: d */
    public final RandomAccessFile f36162d;

    /* renamed from: e */
    public final FileChannel f36163e;

    /* renamed from: f */
    public final FileLock f36164f;

    /* loaded from: classes2.dex */
    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    /* renamed from: androidx.multidex.MultiDexExtractor$a */
    /* loaded from: classes2.dex */
    public class C4802a implements FileFilter {
        public C4802a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    public MultiDexExtractor(File file, File file2) {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        this.f36159a = file;
        this.f36161c = file2;
        this.f36160b = m53917k(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f36162d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f36163e = channel;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                this.f36164f = channel.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
            } catch (IOException e) {
                e = e;
                m53921d(this.f36163e);
                throw e;
            } catch (Error e2) {
                e = e2;
                m53921d(this.f36163e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                m53921d(this.f36163e);
                throw e;
            }
        } catch (IOException e4) {
            e = e4;
            m53921d(this.f36162d);
            throw e;
        } catch (Error e5) {
            e = e5;
            m53921d(this.f36162d);
            throw e;
        } catch (RuntimeException e6) {
            e = e6;
            m53921d(this.f36162d);
            throw e;
        }
    }

    /* renamed from: d */
    public static void m53921d(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: g */
    public static void m53920g(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        StringBuilder sb = new StringBuilder();
        sb.append("Extracting ");
        sb.append(createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Renaming to ");
                sb2.append(file.getPath());
                if (createTempFile.renameTo(file)) {
                    m53921d(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th2) {
            m53921d(inputStream);
            createTempFile.delete();
            throw th2;
        }
    }

    /* renamed from: i */
    public static SharedPreferences m53919i(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* renamed from: j */
    public static long m53918j(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    /* renamed from: k */
    public static long m53917k(File file) {
        long m67998c = I62.m67998c(file);
        if (m67998c == -1) {
            return m67998c - 1;
        }
        return m67998c;
    }

    /* renamed from: l */
    public static boolean m53916l(Context context, File file, long j, String str) {
        SharedPreferences m53919i = m53919i(context);
        if (m53919i.getLong(str + "timestamp", -1L) == m53918j(file)) {
            if (m53919i.getLong(str + "crc", -1L) == j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public static void m53912p(Context context, String str, long j, long j2, List list) {
        SharedPreferences.Editor edit = m53919i(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            ExtractedDex extractedDex = (ExtractedDex) it.next();
            edit.putLong(str + "dex.crc." + i, extractedDex.crc);
            edit.putLong(str + "dex.time." + i, extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: b */
    public final void m53922b() {
        File[] listFiles = this.f36161c.listFiles(new C4802a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f36161c.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to delete old file ");
            sb.append(file.getPath());
            sb.append(" of size ");
            sb.append(file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Deleted old file ");
                sb2.append(file.getPath());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36164f.release();
        this.f36163e.close();
        this.f36162d.close();
    }

    /* renamed from: m */
    public List m53915m(Context context, String str, boolean z) {
        List m53913o;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f36159a.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(str);
        sb.append(")");
        if (this.f36164f.isValid()) {
            if (!z && !m53916l(context, this.f36159a, this.f36160b, str)) {
                try {
                    m53913o = m53914n(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    m53913o = m53913o();
                    m53912p(context, str, m53918j(this.f36159a), this.f36160b, m53913o);
                }
            } else {
                m53913o = m53913o();
                m53912p(context, str, m53918j(this.f36159a), this.f36160b, m53913o);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("load found ");
            sb2.append(m53913o.size());
            sb2.append(" secondary dex files");
            return m53913o;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: n */
    public final List m53914n(Context context, String str) {
        String str2 = this.f36159a.getName() + ".classes";
        SharedPreferences m53919i = m53919i(context);
        int i = m53919i.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            ExtractedDex extractedDex = new ExtractedDex(this.f36161c, str2 + i2 + ".zip");
            if (extractedDex.isFile()) {
                extractedDex.crc = m53917k(extractedDex);
                long j = m53919i.getLong(str + "dex.crc." + i2, -1L);
                long j2 = m53919i.getLong(str + "dex.time." + i2, -1L);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = m53919i;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        m53919i = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
            }
            throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + OperatorName.SHOW_TEXT_LINE);
        }
        return arrayList;
    }

    /* renamed from: o */
    public final List m53913o() {
        boolean z;
        String str;
        String str2 = this.f36159a.getName() + ".classes";
        m53922b();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f36159a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.f36161c, str2 + i + ".zip");
                arrayList.add(extractedDex);
                StringBuilder sb = new StringBuilder();
                sb.append("Extraction is needed for file ");
                sb.append(extractedDex);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    m53920g(zipFile, entry, extractedDex, str2);
                    try {
                        extractedDex.crc = m53917k(extractedDex);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    if (z) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb2.append(str);
                    sb2.append(" '");
                    sb2.append(extractedDex.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(extractedDex.length());
                    sb2.append(" - crc: ");
                    sb2.append(extractedDex.crc);
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + OperatorName.SHOW_TEXT_LINE);
                        }
                    }
                    z2 = z;
                    i2 = i3;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th2;
        }
    }
}
