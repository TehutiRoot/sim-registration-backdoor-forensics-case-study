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
    public final File f41769a;

    /* renamed from: b */
    public final File f41770b;

    /* renamed from: c */
    public final File f41771c;

    /* renamed from: d */
    public final File f41772d;

    /* renamed from: e */
    public final int f41773e;

    /* renamed from: f */
    public long f41774f;

    /* renamed from: g */
    public final int f41775g;

    /* renamed from: i */
    public Writer f41777i;

    /* renamed from: k */
    public int f41779k;

    /* renamed from: h */
    public long f41776h = 0;

    /* renamed from: j */
    public final LinkedHashMap f41778j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l */
    public long f41780l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f41781m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5739b(null));

    /* renamed from: n */
    public final Callable f41782n = new CallableC5738a();

    /* loaded from: classes3.dex */
    public final class Editor {

        /* renamed from: a */
        public final C5740c f41783a;

        /* renamed from: b */
        public final boolean[] f41784b;

        /* renamed from: c */
        public boolean f41785c;

        public /* synthetic */ Editor(DiskLruCache diskLruCache, C5740c c5740c, CallableC5738a callableC5738a) {
            this(c5740c);
        }

        public void abort() throws IOException {
            DiskLruCache.this.m50556r(this, false);
        }

        public void abortUnlessCommitted() {
            if (!this.f41785c) {
                try {
                    abort();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: c */
        public final InputStream m50545c(int i) {
            synchronized (DiskLruCache.this) {
                if (this.f41783a.f41798f == this) {
                    if (!this.f41783a.f41797e) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.f41783a.m50534j(i));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public void commit() throws IOException {
            DiskLruCache.this.m50556r(this, true);
            this.f41785c = true;
        }

        public File getFile(int i) throws IOException {
            File m50533k;
            synchronized (DiskLruCache.this) {
                try {
                    if (this.f41783a.f41798f == this) {
                        if (!this.f41783a.f41797e) {
                            this.f41784b[i] = true;
                        }
                        m50533k = this.f41783a.m50533k(i);
                        DiskLruCache.this.f41769a.mkdirs();
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m50533k;
        }

        public String getString(int i) throws IOException {
            InputStream m50545c = m50545c(i);
            if (m50545c != null) {
                return DiskLruCache.m50552v(m50545c);
            }
            return null;
        }

        public void set(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(getFile(i)), B12.f297b);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                outputStreamWriter.write(str);
                B12.m69162a(outputStreamWriter);
            } catch (Throwable th3) {
                th = th3;
                outputStreamWriter2 = outputStreamWriter;
                B12.m69162a(outputStreamWriter2);
                throw th;
            }
        }

        public Editor(C5740c c5740c) {
            this.f41783a = c5740c;
            this.f41784b = c5740c.f41797e ? null : new boolean[DiskLruCache.this.f41775g];
        }
    }

    /* loaded from: classes3.dex */
    public final class Value {

        /* renamed from: a */
        public final String f41787a;

        /* renamed from: b */
        public final long f41788b;

        /* renamed from: c */
        public final long[] f41789c;

        /* renamed from: d */
        public final File[] f41790d;

        public /* synthetic */ Value(DiskLruCache diskLruCache, String str, long j, File[] fileArr, long[] jArr, CallableC5738a callableC5738a) {
            this(str, j, fileArr, jArr);
        }

        public Editor edit() throws IOException {
            return DiskLruCache.this.m50554t(this.f41787a, this.f41788b);
        }

        public File getFile(int i) {
            return this.f41790d[i];
        }

        public long getLength(int i) {
            return this.f41789c[i];
        }

        public String getString(int i) throws IOException {
            return DiskLruCache.m50552v(new FileInputStream(this.f41790d[i]));
        }

        public Value(String str, long j, File[] fileArr, long[] jArr) {
            this.f41787a = str;
            this.f41788b = j;
            this.f41790d = fileArr;
            this.f41789c = jArr;
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.DiskLruCache$a */
    /* loaded from: classes3.dex */
    public class CallableC5738a implements Callable {
        public CallableC5738a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            synchronized (DiskLruCache.this) {
                try {
                    if (DiskLruCache.this.f41777i != null) {
                        DiskLruCache.this.m50569C();
                        if (DiskLruCache.this.m50551w()) {
                            DiskLruCache.this.m50571A();
                            DiskLruCache.this.f41779k = 0;
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
    public static final class ThreadFactoryC5739b implements ThreadFactory {
        public ThreadFactoryC5739b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC5739b(CallableC5738a callableC5738a) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.DiskLruCache$c */
    /* loaded from: classes3.dex */
    public final class C5740c {

        /* renamed from: a */
        public final String f41793a;

        /* renamed from: b */
        public final long[] f41794b;

        /* renamed from: c */
        public File[] f41795c;

        /* renamed from: d */
        public File[] f41796d;

        /* renamed from: e */
        public boolean f41797e;

        /* renamed from: f */
        public Editor f41798f;

        /* renamed from: g */
        public long f41799g;

        public /* synthetic */ C5740c(DiskLruCache diskLruCache, String str, CallableC5738a callableC5738a) {
            this(str);
        }

        /* renamed from: j */
        public File m50534j(int i) {
            return this.f41795c[i];
        }

        /* renamed from: k */
        public File m50533k(int i) {
            return this.f41796d[i];
        }

        /* renamed from: l */
        public String m50532l() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f41794b) {
                sb.append(TokenParser.f74644SP);
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException m50531m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void m50530n(String[] strArr) {
            if (strArr.length == DiskLruCache.this.f41775g) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f41794b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m50531m(strArr);
                    }
                }
                return;
            }
            throw m50531m(strArr);
        }

        public C5740c(String str) {
            this.f41793a = str;
            this.f41794b = new long[DiskLruCache.this.f41775g];
            this.f41795c = new File[DiskLruCache.this.f41775g];
            this.f41796d = new File[DiskLruCache.this.f41775g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < DiskLruCache.this.f41775g; i++) {
                sb.append(i);
                this.f41795c[i] = new File(DiskLruCache.this.f41769a, sb.toString());
                sb.append(".tmp");
                this.f41796d[i] = new File(DiskLruCache.this.f41769a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public DiskLruCache(File file, int i, int i2, long j) {
        this.f41769a = file;
        this.f41773e = i;
        this.f41770b = new File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
        this.f41771c = new File(file, coil.disk.DiskLruCache.JOURNAL_FILE_TMP);
        this.f41772d = new File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f41775g = i2;
        this.f41774f = j;
    }

    /* renamed from: B */
    public static void m50570B(File file, File file2, boolean z) {
        if (z) {
            m50555s(file2);
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
                        m50570B(file2, file3, false);
                    }
                }
                DiskLruCache diskLruCache = new DiskLruCache(file, i, i2, j);
                if (diskLruCache.f41770b.exists()) {
                    try {
                        diskLruCache.m50549y();
                        diskLruCache.m50550x();
                        return diskLruCache;
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                        diskLruCache.delete();
                    }
                }
                file.mkdirs();
                DiskLruCache diskLruCache2 = new DiskLruCache(file, i, i2, j);
                diskLruCache2.m50571A();
                return diskLruCache2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: q */
    public static void m50557q(Writer writer) {
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
    public static void m50555s(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: u */
    public static void m50553u(Writer writer) {
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
    public static String m50552v(InputStream inputStream) {
        return B12.m69160c(new InputStreamReader(inputStream, B12.f297b));
    }

    /* renamed from: A */
    public final synchronized void m50571A() {
        try {
            Writer writer = this.f41777i;
            if (writer != null) {
                m50557q(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f41771c), B12.f296a));
            bufferedWriter.write(coil.disk.DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f41773e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f41775g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C5740c c5740c : this.f41778j.values()) {
                if (c5740c.f41798f != null) {
                    bufferedWriter.write("DIRTY " + c5740c.f41793a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + c5740c.f41793a + c5740c.m50532l() + '\n');
                }
            }
            m50557q(bufferedWriter);
            if (this.f41770b.exists()) {
                m50570B(this.f41770b, this.f41772d, true);
            }
            m50570B(this.f41771c, this.f41770b, false);
            this.f41772d.delete();
            this.f41777i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f41770b, true), B12.f296a));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: C */
    public final void m50569C() {
        while (this.f41776h > this.f41774f) {
            remove((String) ((Map.Entry) this.f41778j.entrySet().iterator().next()).getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f41777i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f41778j.values()).iterator();
            while (it.hasNext()) {
                C5740c c5740c = (C5740c) it.next();
                if (c5740c.f41798f != null) {
                    c5740c.f41798f.abort();
                }
            }
            m50569C();
            m50557q(this.f41777i);
            this.f41777i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void delete() throws IOException {
        close();
        B12.m69161b(this.f41769a);
    }

    public Editor edit(String str) throws IOException {
        return m50554t(str, -1L);
    }

    public synchronized void flush() throws IOException {
        m50558p();
        m50569C();
        m50553u(this.f41777i);
    }

    public synchronized Value get(String str) throws IOException {
        m50558p();
        C5740c c5740c = (C5740c) this.f41778j.get(str);
        if (c5740c == null) {
            return null;
        }
        if (!c5740c.f41797e) {
            return null;
        }
        for (File file : c5740c.f41795c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f41779k++;
        this.f41777i.append((CharSequence) "READ");
        this.f41777i.append(TokenParser.f74644SP);
        this.f41777i.append((CharSequence) str);
        this.f41777i.append('\n');
        if (m50551w()) {
            this.f41781m.submit(this.f41782n);
        }
        return new Value(this, str, c5740c.f41799g, c5740c.f41795c, c5740c.f41794b, null);
    }

    public File getDirectory() {
        return this.f41769a;
    }

    public synchronized long getMaxSize() {
        return this.f41774f;
    }

    public synchronized boolean isClosed() {
        boolean z;
        if (this.f41777i == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: p */
    public final void m50558p() {
        if (this.f41777i != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: r */
    public final synchronized void m50556r(Editor editor, boolean z) {
        C5740c c5740c = editor.f41783a;
        if (c5740c.f41798f == editor) {
            if (z && !c5740c.f41797e) {
                for (int i = 0; i < this.f41775g; i++) {
                    if (editor.f41784b[i]) {
                        if (!c5740c.m50533k(i).exists()) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f41775g; i2++) {
                File m50533k = c5740c.m50533k(i2);
                if (z) {
                    if (m50533k.exists()) {
                        File m50534j = c5740c.m50534j(i2);
                        m50533k.renameTo(m50534j);
                        long j = c5740c.f41794b[i2];
                        long length = m50534j.length();
                        c5740c.f41794b[i2] = length;
                        this.f41776h = (this.f41776h - j) + length;
                    }
                } else {
                    m50555s(m50533k);
                }
            }
            this.f41779k++;
            c5740c.f41798f = null;
            if (c5740c.f41797e | z) {
                c5740c.f41797e = true;
                this.f41777i.append((CharSequence) "CLEAN");
                this.f41777i.append(TokenParser.f74644SP);
                this.f41777i.append((CharSequence) c5740c.f41793a);
                this.f41777i.append((CharSequence) c5740c.m50532l());
                this.f41777i.append('\n');
                if (z) {
                    long j2 = this.f41780l;
                    this.f41780l = 1 + j2;
                    c5740c.f41799g = j2;
                }
            } else {
                this.f41778j.remove(c5740c.f41793a);
                this.f41777i.append((CharSequence) "REMOVE");
                this.f41777i.append(TokenParser.f74644SP);
                this.f41777i.append((CharSequence) c5740c.f41793a);
                this.f41777i.append('\n');
            }
            m50553u(this.f41777i);
            if (this.f41776h > this.f41774f || m50551w()) {
                this.f41781m.submit(this.f41782n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized boolean remove(String str) throws IOException {
        try {
            m50558p();
            C5740c c5740c = (C5740c) this.f41778j.get(str);
            if (c5740c != null && c5740c.f41798f == null) {
                for (int i = 0; i < this.f41775g; i++) {
                    File m50534j = c5740c.m50534j(i);
                    if (m50534j.exists() && !m50534j.delete()) {
                        throw new IOException("failed to delete " + m50534j);
                    }
                    this.f41776h -= c5740c.f41794b[i];
                    c5740c.f41794b[i] = 0;
                }
                this.f41779k++;
                this.f41777i.append((CharSequence) "REMOVE");
                this.f41777i.append(TokenParser.f74644SP);
                this.f41777i.append((CharSequence) str);
                this.f41777i.append('\n');
                this.f41778j.remove(str);
                if (m50551w()) {
                    this.f41781m.submit(this.f41782n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized void setMaxSize(long j) {
        this.f41774f = j;
        this.f41781m.submit(this.f41782n);
    }

    public synchronized long size() {
        return this.f41776h;
    }

    /* renamed from: t */
    public final synchronized Editor m50554t(String str, long j) {
        m50558p();
        C5740c c5740c = (C5740c) this.f41778j.get(str);
        if (j != -1 && (c5740c == null || c5740c.f41799g != j)) {
            return null;
        }
        if (c5740c == null) {
            c5740c = new C5740c(this, str, null);
            this.f41778j.put(str, c5740c);
        } else if (c5740c.f41798f != null) {
            return null;
        }
        Editor editor = new Editor(this, c5740c, null);
        c5740c.f41798f = editor;
        this.f41777i.append((CharSequence) "DIRTY");
        this.f41777i.append(TokenParser.f74644SP);
        this.f41777i.append((CharSequence) str);
        this.f41777i.append('\n');
        m50553u(this.f41777i);
        return editor;
    }

    /* renamed from: w */
    public final boolean m50551w() {
        int i = this.f41779k;
        if (i >= 2000 && i >= this.f41778j.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final void m50550x() {
        m50555s(this.f41771c);
        Iterator it = this.f41778j.values().iterator();
        while (it.hasNext()) {
            C5740c c5740c = (C5740c) it.next();
            int i = 0;
            if (c5740c.f41798f != null) {
                c5740c.f41798f = null;
                while (i < this.f41775g) {
                    m50555s(c5740c.m50534j(i));
                    m50555s(c5740c.m50533k(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.f41775g) {
                    this.f41776h += c5740c.f41794b[i];
                    i++;
                }
            }
        }
    }

    /* renamed from: y */
    public final void m50549y() {
        PN1 pn1 = new PN1(new FileInputStream(this.f41770b), B12.f296a);
        try {
            String m66967i = pn1.m66967i();
            String m66967i2 = pn1.m66967i();
            String m66967i3 = pn1.m66967i();
            String m66967i4 = pn1.m66967i();
            String m66967i5 = pn1.m66967i();
            if (coil.disk.DiskLruCache.MAGIC.equals(m66967i) && "1".equals(m66967i2) && Integer.toString(this.f41773e).equals(m66967i3) && Integer.toString(this.f41775g).equals(m66967i4) && "".equals(m66967i5)) {
                int i = 0;
                while (true) {
                    try {
                        m50548z(pn1.m66967i());
                        i++;
                    } catch (EOFException unused) {
                        this.f41779k = i - this.f41778j.size();
                        if (pn1.m66968g()) {
                            m50571A();
                        } else {
                            this.f41777i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f41770b, true), B12.f296a));
                        }
                        B12.m69162a(pn1);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + m66967i + ", " + m66967i2 + ", " + m66967i4 + ", " + m66967i5 + "]");
            }
        } catch (Throwable th2) {
            B12.m69162a(pn1);
            throw th2;
        }
    }

    /* renamed from: z */
    public final void m50548z(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f41778j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C5740c c5740c = (C5740c) this.f41778j.get(substring);
            if (c5740c == null) {
                c5740c = new C5740c(this, substring, null);
                this.f41778j.put(substring, c5740c);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
                c5740c.f41797e = true;
                c5740c.f41798f = null;
                c5740c.m50530n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c5740c.f41798f = new Editor(this, c5740c, null);
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