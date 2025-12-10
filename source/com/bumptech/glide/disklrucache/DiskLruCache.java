package com.bumptech.glide.disklrucache;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable {

    /* renamed from: a */
    public final File f41757a;

    /* renamed from: b */
    public final File f41758b;

    /* renamed from: c */
    public final File f41759c;

    /* renamed from: d */
    public final File f41760d;

    /* renamed from: e */
    public final int f41761e;

    /* renamed from: f */
    public long f41762f;

    /* renamed from: g */
    public final int f41763g;

    /* renamed from: i */
    public Writer f41765i;

    /* renamed from: k */
    public int f41767k;

    /* renamed from: h */
    public long f41764h = 0;

    /* renamed from: j */
    public final LinkedHashMap f41766j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f41768l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f41769m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5750b(null));

    /* renamed from: n */
    public final Callable f41770n = new CallableC5749a();

    /* loaded from: classes3.dex */
    public final class Editor {

        /* renamed from: a */
        public final C5751c f41771a;

        /* renamed from: b */
        public final boolean[] f41772b;

        /* renamed from: c */
        public boolean f41773c;

        public /* synthetic */ Editor(DiskLruCache diskLruCache, C5751c c5751c, CallableC5749a callableC5749a) {
            this(c5751c);
        }

        public void abort() throws IOException {
            DiskLruCache.this.m50559r(this, false);
        }

        public void abortUnlessCommitted() {
            if (!this.f41773c) {
                try {
                    abort();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c */
        public final InputStream m50548c(int i) {
            synchronized (DiskLruCache.this) {
                if (this.f41771a.f41786f == this) {
                    if (!this.f41771a.f41785e) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.f41771a.m50537j(i));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public void commit() throws IOException {
            DiskLruCache.this.m50559r(this, true);
            this.f41773c = true;
        }

        public File getFile(int i) throws IOException {
            File m50536k;
            synchronized (DiskLruCache.this) {
                try {
                    if (this.f41771a.f41786f == this) {
                        if (!this.f41771a.f41785e) {
                            this.f41772b[i] = true;
                        }
                        m50536k = this.f41771a.m50536k(i);
                        DiskLruCache.this.f41757a.mkdirs();
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m50536k;
        }

        public String getString(int i) throws IOException {
            InputStream m50548c = m50548c(i);
            if (m50548c != null) {
                return DiskLruCache.m50555v(m50548c);
            }
            return null;
        }

        public void set(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(getFile(i)), E02.f1182b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                outputStreamWriter.write(str);
                E02.m68555a(outputStreamWriter);
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter2 = outputStreamWriter;
                E02.m68555a(outputStreamWriter2);
                throw th;
            }
        }

        public Editor(C5751c c5751c) {
            this.f41771a = c5751c;
            this.f41772b = c5751c.f41785e ? null : new boolean[DiskLruCache.this.f41763g];
        }
    }

    /* loaded from: classes3.dex */
    public final class Value {

        /* renamed from: a */
        public final String f41775a;

        /* renamed from: b */
        public final long f41776b;

        /* renamed from: c */
        public final long[] f41777c;

        /* renamed from: d */
        public final File[] f41778d;

        public /* synthetic */ Value(DiskLruCache diskLruCache, String str, long j, File[] fileArr, long[] jArr, CallableC5749a callableC5749a) {
            this(str, j, fileArr, jArr);
        }

        public Editor edit() throws IOException {
            return DiskLruCache.this.m50557t(this.f41775a, this.f41776b);
        }

        public File getFile(int i) {
            return this.f41778d[i];
        }

        public long getLength(int i) {
            return this.f41777c[i];
        }

        public String getString(int i) throws IOException {
            return DiskLruCache.m50555v(new FileInputStream(this.f41778d[i]));
        }

        public Value(String str, long j, File[] fileArr, long[] jArr) {
            this.f41775a = str;
            this.f41776b = j;
            this.f41778d = fileArr;
            this.f41777c = jArr;
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.DiskLruCache$a */
    /* loaded from: classes3.dex */
    public class CallableC5749a implements Callable {
        public CallableC5749a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (DiskLruCache.this) {
                try {
                    if (DiskLruCache.this.f41765i != null) {
                        DiskLruCache.this.m50572C();
                        if (DiskLruCache.this.m50554w()) {
                            DiskLruCache.this.m50574A();
                            DiskLruCache.this.f41767k = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.DiskLruCache$b */
    /* loaded from: classes3.dex */
    public static final class ThreadFactoryC5750b implements ThreadFactory {
        public ThreadFactoryC5750b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC5750b(CallableC5749a callableC5749a) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.DiskLruCache$c */
    /* loaded from: classes3.dex */
    public final class C5751c {

        /* renamed from: a */
        public final String f41781a;

        /* renamed from: b */
        public final long[] f41782b;

        /* renamed from: c */
        public File[] f41783c;

        /* renamed from: d */
        public File[] f41784d;

        /* renamed from: e */
        public boolean f41785e;

        /* renamed from: f */
        public Editor f41786f;

        /* renamed from: g */
        public long f41787g;

        public /* synthetic */ C5751c(DiskLruCache diskLruCache, String str, CallableC5749a callableC5749a) {
            this(str);
        }

        /* renamed from: j */
        public File m50537j(int i) {
            return this.f41783c[i];
        }

        /* renamed from: k */
        public File m50536k(int i) {
            return this.f41784d[i];
        }

        /* renamed from: l */
        public String m50535l() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f41782b) {
                sb.append(TokenParser.f74560SP);
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m50534m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m50533n(String[] strArr) {
            if (strArr.length == DiskLruCache.this.f41763g) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f41782b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m50534m(strArr);
                    }
                }
                return;
            }
            throw m50534m(strArr);
        }

        public C5751c(String str) {
            this.f41781a = str;
            this.f41782b = new long[DiskLruCache.this.f41763g];
            this.f41783c = new File[DiskLruCache.this.f41763g];
            this.f41784d = new File[DiskLruCache.this.f41763g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.f41763g; i++) {
                sb.append(i);
                this.f41783c[i] = new File(DiskLruCache.this.f41757a, sb.toString());
                sb.append(".tmp");
                this.f41784d[i] = new File(DiskLruCache.this.f41757a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public DiskLruCache(File file, int i, int i2, long j) {
        this.f41757a = file;
        this.f41761e = i;
        this.f41758b = new File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
        this.f41759c = new File(file, coil.disk.DiskLruCache.JOURNAL_FILE_TMP);
        this.f41760d = new File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f41763g = i2;
        this.f41762f = j;
    }

    /* renamed from: B */
    public static void m50573B(File file, File file2, boolean z) {
        if (z) {
            m50558s(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    public static DiskLruCache open(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
                if (file2.exists()) {
                    File file3 = new File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m50573B(file2, file3, false);
                    }
                }
                DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
                if (diskLruCache.f41758b.exists()) {
                    try {
                        diskLruCache.m50552y();
                        diskLruCache.m50553x();
                        return diskLruCache;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        diskLruCache.delete();
                    }
                }
                file.mkdirs();
                DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
                diskLruCache2.m50574A();
                return diskLruCache2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: q */
    public static void m50560q(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: s */
    public static void m50558s(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: u */
    public static void m50556u(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: v */
    public static String m50555v(InputStream inputStream) {
        return E02.m68553c(new InputStreamReader(inputStream, E02.f1182b));
    }

    /* renamed from: A */
    public final synchronized void m50574A() {
        try {
            Writer writer = this.f41765i;
            if (writer != null) {
                m50560q(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f41759c), E02.f1181a));
            bufferedWriter.write(coil.disk.DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f41761e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f41763g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C5751c c5751c : this.f41766j.values()) {
                if (c5751c.f41786f != null) {
                    bufferedWriter.write("DIRTY " + c5751c.f41781a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + c5751c.f41781a + c5751c.m50535l() + '\n');
                }
            }
            m50560q(bufferedWriter);
            if (this.f41758b.exists()) {
                m50573B(this.f41758b, this.f41760d, true);
            }
            m50573B(this.f41759c, this.f41758b, false);
            this.f41760d.delete();
            this.f41765i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f41758b, true), E02.f1181a));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: C */
    public final void m50572C() {
        while (this.f41764h > this.f41762f) {
            remove((String) ((Map.Entry) this.f41766j.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f41765i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f41766j.values()).iterator();
            while (it.hasNext()) {
                C5751c c5751c = (C5751c) it.next();
                if (c5751c.f41786f != null) {
                    c5751c.f41786f.abort();
                }
            }
            m50572C();
            m50560q(this.f41765i);
            this.f41765i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void delete() throws IOException {
        close();
        E02.m68554b(this.f41757a);
    }

    public Editor edit(String str) throws IOException {
        return m50557t(str, -1L);
    }

    public synchronized void flush() throws IOException {
        m50561p();
        m50572C();
        m50556u(this.f41765i);
    }

    public synchronized Value get(String str) throws IOException {
        m50561p();
        C5751c c5751c = (C5751c) this.f41766j.get(str);
        if (c5751c == null) {
            return null;
        }
        if (!c5751c.f41785e) {
            return null;
        }
        for (File file : c5751c.f41783c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f41767k++;
        this.f41765i.append((CharSequence) "READ");
        this.f41765i.append(TokenParser.f74560SP);
        this.f41765i.append((CharSequence) str);
        this.f41765i.append('\n');
        if (m50554w()) {
            this.f41769m.submit(this.f41770n);
        }
        return new Value(this, str, c5751c.f41787g, c5751c.f41783c, c5751c.f41782b, null);
    }

    public File getDirectory() {
        return this.f41757a;
    }

    public synchronized long getMaxSize() {
        return this.f41762f;
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.f41765i == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: p */
    public final void m50561p() {
        if (this.f41765i != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: r */
    public final synchronized void m50559r(Editor editor, boolean z) {
        C5751c c5751c = editor.f41771a;
        if (c5751c.f41786f == editor) {
            if (z && !c5751c.f41785e) {
                for (int i = 0; i < this.f41763g; i++) {
                    if (editor.f41772b[i]) {
                        if (!c5751c.m50536k(i).exists()) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f41763g; i2++) {
                File m50536k = c5751c.m50536k(i2);
                if (z) {
                    if (m50536k.exists()) {
                        File m50537j = c5751c.m50537j(i2);
                        m50536k.renameTo(m50537j);
                        long j = c5751c.f41782b[i2];
                        long length = m50537j.length();
                        c5751c.f41782b[i2] = length;
                        this.f41764h = (this.f41764h - j) + length;
                    }
                } else {
                    m50558s(m50536k);
                }
            }
            this.f41767k++;
            c5751c.f41786f = null;
            if (c5751c.f41785e | z) {
                c5751c.f41785e = true;
                this.f41765i.append((CharSequence) "CLEAN");
                this.f41765i.append(TokenParser.f74560SP);
                this.f41765i.append((CharSequence) c5751c.f41781a);
                this.f41765i.append((CharSequence) c5751c.m50535l());
                this.f41765i.append('\n');
                if (z) {
                    long j2 = this.f41768l;
                    this.f41768l = 1 + j2;
                    c5751c.f41787g = j2;
                }
            } else {
                this.f41766j.remove(c5751c.f41781a);
                this.f41765i.append((CharSequence) "REMOVE");
                this.f41765i.append(TokenParser.f74560SP);
                this.f41765i.append((CharSequence) c5751c.f41781a);
                this.f41765i.append('\n');
            }
            m50556u(this.f41765i);
            if (this.f41764h > this.f41762f || m50554w()) {
                this.f41769m.submit(this.f41770n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized boolean remove(String str) throws IOException {
        try {
            m50561p();
            C5751c c5751c = (C5751c) this.f41766j.get(str);
            if (c5751c != null && c5751c.f41786f == null) {
                for (int i = 0; i < this.f41763g; i++) {
                    File m50537j = c5751c.m50537j(i);
                    if (m50537j.exists() && !m50537j.delete()) {
                        throw new IOException("failed to delete " + m50537j);
                    }
                    this.f41764h -= c5751c.f41782b[i];
                    c5751c.f41782b[i] = 0;
                }
                this.f41767k++;
                this.f41765i.append((CharSequence) "REMOVE");
                this.f41765i.append(TokenParser.f74560SP);
                this.f41765i.append((CharSequence) str);
                this.f41765i.append('\n');
                this.f41766j.remove(str);
                if (m50554w()) {
                    this.f41769m.submit(this.f41770n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized void setMaxSize(long j) {
        this.f41762f = j;
        this.f41769m.submit(this.f41770n);
    }

    public synchronized long size() {
        return this.f41764h;
    }

    /* renamed from: t */
    public final synchronized Editor m50557t(String str, long j) {
        m50561p();
        C5751c c5751c = (C5751c) this.f41766j.get(str);
        if (j != -1 && (c5751c == null || c5751c.f41787g != j)) {
            return null;
        }
        if (c5751c == null) {
            c5751c = new C5751c(this, str, null);
            this.f41766j.put(str, c5751c);
        } else if (c5751c.f41786f != null) {
            return null;
        }
        Editor editor = new Editor(this, c5751c, null);
        c5751c.f41786f = editor;
        this.f41765i.append((CharSequence) "DIRTY");
        this.f41765i.append(TokenParser.f74560SP);
        this.f41765i.append((CharSequence) str);
        this.f41765i.append('\n');
        m50556u(this.f41765i);
        return editor;
    }

    /* renamed from: w */
    public final boolean m50554w() {
        int i = this.f41767k;
        if (i >= 2000 && i >= this.f41766j.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void m50553x() {
        m50558s(this.f41759c);
        Iterator it = this.f41766j.values().iterator();
        while (it.hasNext()) {
            C5751c c5751c = (C5751c) it.next();
            int i = 0;
            if (c5751c.f41786f != null) {
                c5751c.f41786f = null;
                while (i < this.f41763g) {
                    m50558s(c5751c.m50537j(i));
                    m50558s(c5751c.m50536k(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.f41763g) {
                    this.f41764h += c5751c.f41782b[i];
                    i++;
                }
            }
        }
    }

    /* renamed from: y */
    public final void m50552y() {
        SM1 sm1 = new SM1(new FileInputStream(this.f41758b), E02.f1181a);
        try {
            String m66331i = sm1.m66331i();
            String m66331i2 = sm1.m66331i();
            String m66331i3 = sm1.m66331i();
            String m66331i4 = sm1.m66331i();
            String m66331i5 = sm1.m66331i();
            if (coil.disk.DiskLruCache.MAGIC.equals(m66331i) && "1".equals(m66331i2) && Integer.toString(this.f41761e).equals(m66331i3) && Integer.toString(this.f41763g).equals(m66331i4) && "".equals(m66331i5)) {
                int i = 0;
                while (true) {
                    try {
                        m50551z(sm1.m66331i());
                        i++;
                    } catch (EOFException unused) {
                        this.f41767k = i - this.f41766j.size();
                        if (sm1.m66332g()) {
                            m50574A();
                        } else {
                            this.f41765i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f41758b, true), E02.f1181a));
                        }
                        E02.m68555a(sm1);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + m66331i + ", " + m66331i2 + ", " + m66331i4 + ", " + m66331i5 + "]");
            }
        } catch (Throwable th2) {
            E02.m68555a(sm1);
            throw th2;
        }
    }

    /* renamed from: z */
    public final void m50551z(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f41766j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C5751c c5751c = (C5751c) this.f41766j.get(substring);
            if (c5751c == null) {
                c5751c = new C5751c(this, substring, null);
                this.f41766j.put(substring, c5751c);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                c5751c.f41785e = true;
                c5751c.f41786f = null;
                c5751c.m50533n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c5751c.f41786f = new Editor(this, c5751c, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }
}
