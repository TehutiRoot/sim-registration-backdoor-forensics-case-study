package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.ReLinker;
import com.getkeepsafe.relinker.elf.ElfParser;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public class ReLinkerInstance {
    protected boolean force;
    protected final ReLinker.LibraryInstaller libraryInstaller;
    protected final ReLinker.LibraryLoader libraryLoader;
    protected final Set<String> loadedLibraries;
    protected ReLinker.Logger logger;
    protected boolean recursive;

    /* renamed from: com.getkeepsafe.relinker.ReLinkerInstance$a */
    /* loaded from: classes3.dex */
    public class RunnableC6156a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f43567a;

        /* renamed from: b */
        public final /* synthetic */ String f43568b;

        /* renamed from: c */
        public final /* synthetic */ String f43569c;

        /* renamed from: d */
        public final /* synthetic */ ReLinker.LoadListener f43570d;

        public RunnableC6156a(Context context, String str, String str2, ReLinker.LoadListener loadListener) {
            ReLinkerInstance.this = r1;
            this.f43567a = context;
            this.f43568b = str;
            this.f43569c = str2;
            this.f43570d = loadListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ReLinkerInstance.this.m49336b(this.f43567a, this.f43568b, this.f43569c);
                this.f43570d.success();
            } catch (MissingLibraryException e) {
                this.f43570d.failure(e);
            } catch (UnsatisfiedLinkError e2) {
                this.f43570d.failure(e2);
            }
        }
    }

    /* renamed from: com.getkeepsafe.relinker.ReLinkerInstance$b */
    /* loaded from: classes3.dex */
    public class C6157b implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ String f43572a;

        public C6157b(String str) {
            ReLinkerInstance.this = r1;
            this.f43572a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f43572a);
        }
    }

    public ReLinkerInstance() {
        this(new C6158a(), new ApkLibraryInstaller());
    }

    /* renamed from: b */
    public final void m49336b(Context context, String str, String str2) {
        ElfParser elfParser;
        if (this.loadedLibraries.contains(str) && !this.force) {
            log("%s already loaded previously!", str);
            return;
        }
        try {
            this.libraryLoader.loadLibrary(str);
            this.loadedLibraries.add(str);
            log("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            log("Loading the library normally failed: %s", Log.getStackTraceString(e));
            log("%s (%s) was not loaded normally, re-linking...", str, str2);
            File workaroundLibFile = getWorkaroundLibFile(context, str, str2);
            if (!workaroundLibFile.exists() || this.force) {
                if (this.force) {
                    log("Forcing a re-link of %s (%s)...", str, str2);
                }
                cleanupOldLibFiles(context, str, str2);
                this.libraryInstaller.installLibrary(context, this.libraryLoader.supportedAbis(), this.libraryLoader.mapLibraryName(str), workaroundLibFile, this);
            }
            try {
                if (this.recursive) {
                    ElfParser elfParser2 = null;
                    try {
                        elfParser = new ElfParser(workaroundLibFile);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        List<String> parseNeededDependencies = elfParser.parseNeededDependencies();
                        elfParser.close();
                        for (String str3 : parseNeededDependencies) {
                            loadLibrary(context, this.libraryLoader.unmapLibraryName(str3));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        elfParser2 = elfParser;
                        elfParser2.close();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
            this.libraryLoader.loadPath(workaroundLibFile.getAbsolutePath());
            this.loadedLibraries.add(str);
            log("%s (%s) was re-linked!", str, str2);
        }
    }

    public void cleanupOldLibFiles(Context context, String str, String str2) {
        File workaroundLibDir = getWorkaroundLibDir(context);
        File workaroundLibFile = getWorkaroundLibFile(context, str, str2);
        File[] listFiles = workaroundLibDir.listFiles(new C6157b(this.libraryLoader.mapLibraryName(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.force || !file.getAbsolutePath().equals(workaroundLibFile.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public ReLinkerInstance force() {
        this.force = true;
        return this;
    }

    public File getWorkaroundLibDir(Context context) {
        return context.getDir("lib", 0);
    }

    public File getWorkaroundLibFile(Context context, String str, String str2) {
        String mapLibraryName = this.libraryLoader.mapLibraryName(str);
        if (AbstractC21590pS1.m23687a(str2)) {
            return new File(getWorkaroundLibDir(context), mapLibraryName);
        }
        File workaroundLibDir = getWorkaroundLibDir(context);
        return new File(workaroundLibDir, mapLibraryName + "." + str2);
    }

    public void loadLibrary(Context context, String str) {
        loadLibrary(context, str, null, null);
    }

    public ReLinkerInstance log(ReLinker.Logger logger) {
        this.logger = logger;
        return this;
    }

    public ReLinkerInstance recursively() {
        this.recursive = true;
        return this;
    }

    public ReLinkerInstance(ReLinker.LibraryLoader libraryLoader, ReLinker.LibraryInstaller libraryInstaller) {
        this.loadedLibraries = new HashSet();
        if (libraryLoader == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (libraryInstaller != null) {
            this.libraryLoader = libraryLoader;
            this.libraryInstaller = libraryInstaller;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null library installer");
    }

    public void loadLibrary(Context context, String str, String str2) {
        loadLibrary(context, str, str2, null);
    }

    public void log(String str, Object... objArr) {
        log(String.format(Locale.US, str, objArr));
    }

    public void loadLibrary(Context context, String str, ReLinker.LoadListener loadListener) {
        loadLibrary(context, str, null, loadListener);
    }

    public void log(String str) {
        ReLinker.Logger logger = this.logger;
        if (logger != null) {
            logger.log(str);
        }
    }

    public void loadLibrary(Context context, String str, String str2, ReLinker.LoadListener loadListener) {
        if (context != null) {
            if (!AbstractC21590pS1.m23687a(str)) {
                log("Beginning load of %s...", str);
                if (loadListener == null) {
                    m49336b(context, str, str2);
                    return;
                } else {
                    new Thread(new RunnableC6156a(context, str, str2, loadListener)).start();
                    return;
                }
            }
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
