package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.ReLinker;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class ApkLibraryInstaller implements ReLinker.LibraryInstaller {

    /* renamed from: com.getkeepsafe.relinker.ApkLibraryInstaller$a */
    /* loaded from: classes3.dex */
    public static class C6143a {

        /* renamed from: a */
        public ZipFile f43577a;

        /* renamed from: b */
        public ZipEntry f43578b;

        public C6143a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f43577a = zipFile;
            this.f43578b = zipEntry;
        }
    }

    /* renamed from: a */
    public final void m49339a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public final long m49338b(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: c */
    public final C6143a m49337c(Context context, String[] strArr, String str, ReLinkerInstance reLinkerInstance) {
        String[] m49335e = m49335e(context);
        int length = m49335e.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = m49335e[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str3 = strArr[i6];
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            Object[] objArr = new Object[2];
                            objArr[c] = sb2;
                            objArr[1] = str2;
                            reLinkerInstance.log("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new C6143a(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        i4 = i5;
                        c = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    /* renamed from: d */
    public final String[] m49336d(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m49335e(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: e */
    public final String[] m49335e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            String[] strArr2 = new String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new String[]{applicationInfo.sourceDir};
    }

    @Override // com.getkeepsafe.relinker.ReLinker.LibraryInstaller
    public void installLibrary(Context context, String[] strArr, String str, File file, ReLinkerInstance reLinkerInstance) {
        C6143a m49337c;
        String[] strArr2;
        Closeable closeable;
        InputStream inputStream;
        long m49338b;
        C6143a c6143a = null;
        Closeable closeable2 = null;
        try {
            m49337c = m49337c(context, strArr, str, reLinkerInstance);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (m49337c != null) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i < 5) {
                        reLinkerInstance.log("Found %s! Extracting...", str);
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = m49337c.f43577a.getInputStream(m49337c.f43578b);
                                    try {
                                        closeable = new FileOutputStream(file);
                                        try {
                                            m49338b = m49338b(inputStream, closeable);
                                            closeable.getFD().sync();
                                        } catch (FileNotFoundException unused) {
                                            m49339a(inputStream);
                                            m49339a(closeable);
                                            i = i2;
                                        } catch (IOException unused2) {
                                            m49339a(inputStream);
                                            m49339a(closeable);
                                            i = i2;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            closeable2 = inputStream;
                                            m49339a(closeable2);
                                            m49339a(closeable);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        closeable = null;
                                    } catch (IOException unused4) {
                                        closeable = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        closeable = null;
                                    }
                                } catch (FileNotFoundException unused5) {
                                    inputStream = null;
                                    closeable = null;
                                } catch (IOException unused6) {
                                    inputStream = null;
                                    closeable = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    closeable = null;
                                }
                                if (m49338b != file.length()) {
                                    m49339a(inputStream);
                                    m49339a(closeable);
                                } else {
                                    m49339a(inputStream);
                                    m49339a(closeable);
                                    file.setReadable(true, false);
                                    file.setExecutable(true, false);
                                    file.setWritable(true);
                                    try {
                                        ZipFile zipFile = m49337c.f43577a;
                                        if (zipFile != null) {
                                            zipFile.close();
                                            return;
                                        }
                                        return;
                                    } catch (IOException unused7) {
                                        return;
                                    }
                                }
                            }
                        } catch (IOException unused8) {
                        }
                        i = i2;
                    } else {
                        reLinkerInstance.log("FATAL! Couldn't extract the library from the APK!");
                        try {
                            ZipFile zipFile2 = m49337c.f43577a;
                            if (zipFile2 != null) {
                                zipFile2.close();
                                return;
                            }
                            return;
                        } catch (IOException unused9) {
                            return;
                        }
                    }
                }
            } else {
                try {
                    strArr2 = m49336d(context, str);
                } catch (Exception e) {
                    strArr2 = new String[]{e.toString()};
                }
                throw new MissingLibraryException(str, strArr, strArr2);
            }
        } catch (Throwable th6) {
            th = th6;
            c6143a = m49337c;
            if (c6143a != null) {
                try {
                    ZipFile zipFile3 = c6143a.f43577a;
                    if (zipFile3 != null) {
                        zipFile3.close();
                    }
                } catch (IOException unused10) {
                }
            }
            throw th;
        }
    }
}