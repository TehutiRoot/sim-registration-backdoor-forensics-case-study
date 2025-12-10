package com.google.common.reflect;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.p014io.ByteSource;
import com.google.common.p014io.CharSource;
import com.google.common.p014io.Resources;
import com.google.common.reflect.ClassPath;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes4.dex */
public final class ClassPath {

    /* renamed from: b */
    public static final Logger f54086b = Logger.getLogger(ClassPath.class.getName());

    /* renamed from: c */
    public static final Splitter f54087c = Splitter.m41289on(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).omitEmptyStrings();

    /* renamed from: a */
    public final ImmutableSet f54088a;

    /* loaded from: classes4.dex */
    public static final class ClassInfo extends ResourceInfo {

        /* renamed from: d */
        public final String f54089d;

        public ClassInfo(File file, String str, ClassLoader classLoader) {
            super(file, str, classLoader);
            this.f54089d = ClassPath.m39794c(str);
        }

        public String getName() {
            return this.f54089d;
        }

        public String getPackageName() {
            return Reflection.getPackageName(this.f54089d);
        }

        public String getSimpleName() {
            int lastIndexOf = this.f54089d.lastIndexOf(36);
            if (lastIndexOf != -1) {
                return CharMatcher.inRange('0', '9').trimLeadingFrom(this.f54089d.substring(lastIndexOf + 1));
            }
            String packageName = getPackageName();
            if (packageName.isEmpty()) {
                return this.f54089d;
            }
            return this.f54089d.substring(packageName.length() + 1);
        }

        public boolean isTopLevel() {
            if (this.f54089d.indexOf(36) == -1) {
                return true;
            }
            return false;
        }

        public Class<?> load() {
            try {
                return this.f54092c.loadClass(this.f54089d);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public String toString() {
            return this.f54089d;
        }
    }

    /* loaded from: classes4.dex */
    public static class ResourceInfo {

        /* renamed from: a */
        public final File f54090a;

        /* renamed from: b */
        public final String f54091b;

        /* renamed from: c */
        public final ClassLoader f54092c;

        public ResourceInfo(File file, String str, ClassLoader classLoader) {
            this.f54090a = (File) Preconditions.checkNotNull(file);
            this.f54091b = (String) Preconditions.checkNotNull(str);
            this.f54092c = (ClassLoader) Preconditions.checkNotNull(classLoader);
        }

        /* renamed from: a */
        public static ResourceInfo m39787a(File file, String str, ClassLoader classLoader) {
            if (str.endsWith(".class")) {
                return new ClassInfo(file, str, classLoader);
            }
            return new ResourceInfo(file, str, classLoader);
        }

        public final ByteSource asByteSource() {
            return Resources.asByteSource(url());
        }

        public final CharSource asCharSource(Charset charset) {
            return Resources.asCharSource(url(), charset);
        }

        public boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof ResourceInfo)) {
                return false;
            }
            ResourceInfo resourceInfo = (ResourceInfo) obj;
            if (!this.f54091b.equals(resourceInfo.f54091b) || this.f54092c != resourceInfo.f54092c) {
                return false;
            }
            return true;
        }

        public final String getResourceName() {
            return this.f54091b;
        }

        public int hashCode() {
            return this.f54091b.hashCode();
        }

        public String toString() {
            return this.f54091b;
        }

        public final URL url() {
            URL resource = this.f54092c.getResource(this.f54091b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f54091b);
        }
    }

    /* renamed from: com.google.common.reflect.ClassPath$a */
    /* loaded from: classes4.dex */
    public static final class C8136a {

        /* renamed from: a */
        public final File f54093a;

        /* renamed from: b */
        public final ClassLoader f54094b;

        public C8136a(File file, ClassLoader classLoader) {
            this.f54093a = (File) Preconditions.checkNotNull(file);
            this.f54094b = (ClassLoader) Preconditions.checkNotNull(classLoader);
        }

        /* renamed from: a */
        public final File m39786a() {
            return this.f54093a;
        }

        /* renamed from: b */
        public final void m39785b(File file, Set set, ImmutableSet.Builder builder) {
            try {
                if (!file.exists()) {
                    return;
                }
                if (file.isDirectory()) {
                    m39784c(file, builder);
                } else {
                    m39782e(file, set, builder);
                }
            } catch (SecurityException e) {
                Logger logger = ClassPath.f54086b;
                logger.warning("Cannot access " + file + ": " + e);
            }
        }

        /* renamed from: c */
        public final void m39784c(File file, ImmutableSet.Builder builder) {
            HashSet hashSet = new HashSet();
            hashSet.add(file.getCanonicalFile());
            m39783d(file, "", hashSet, builder);
        }

        /* renamed from: d */
        public final void m39783d(File file, String str, Set set, ImmutableSet.Builder builder) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                ClassPath.f54086b.warning("Cannot read directory " + file);
                return;
            }
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        m39783d(canonicalFile, str + name + RemoteSettings.FORWARD_SLASH_STRING, set, builder);
                        set.remove(canonicalFile);
                    }
                } else {
                    String str2 = str + name;
                    if (!str2.equals("META-INF/MANIFEST.MF")) {
                        builder.add((ImmutableSet.Builder) ResourceInfo.m39787a(file2, str2, this.f54094b));
                    }
                }
            }
        }

        /* renamed from: e */
        public final void m39782e(File file, Set set, ImmutableSet.Builder builder) {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    UnmodifiableIterator it = ClassPath.m39791f(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        if (set.add(file2.getCanonicalFile())) {
                            m39785b(file2, set, builder);
                        }
                    }
                    m39781f(jarFile, builder);
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (IOException unused3) {
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8136a)) {
                return false;
            }
            C8136a c8136a = (C8136a) obj;
            if (!this.f54093a.equals(c8136a.f54093a) || !this.f54094b.equals(c8136a.f54094b)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final void m39781f(JarFile jarFile, ImmutableSet.Builder builder) {
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && !nextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    builder.add((ImmutableSet.Builder) ResourceInfo.m39787a(new File(jarFile.getName()), nextElement.getName(), this.f54094b));
                }
            }
        }

        /* renamed from: g */
        public ImmutableSet m39780g(Set set) {
            ImmutableSet.Builder builder = ImmutableSet.builder();
            set.add(this.f54093a);
            m39785b(this.f54093a, set, builder);
            return builder.build();
        }

        public int hashCode() {
            return this.f54093a.hashCode();
        }

        public String toString() {
            return this.f54093a.toString();
        }
    }

    public ClassPath(ImmutableSet immutableSet) {
        this.f54088a = immutableSet;
    }

    /* renamed from: b */
    public static ImmutableList m39795b(ClassLoader classLoader) {
        if (classLoader instanceof URLClassLoader) {
            return ImmutableList.copyOf(((URLClassLoader) classLoader).getURLs());
        }
        if (classLoader.equals(ClassLoader.getSystemClassLoader())) {
            return m39789h();
        }
        return ImmutableList.m40998of();
    }

    /* renamed from: c */
    public static String m39794c(String str) {
        return str.substring(0, str.length() - 6).replace('/', '.');
    }

    /* renamed from: d */
    public static ImmutableMap m39793d(ClassLoader classLoader) {
        LinkedHashMap newLinkedHashMap = Maps.newLinkedHashMap();
        ClassLoader parent = classLoader.getParent();
        if (parent != null) {
            newLinkedHashMap.putAll(m39793d(parent));
        }
        UnmodifiableIterator it = m39795b(classLoader).iterator();
        while (it.hasNext()) {
            URL url = (URL) it.next();
            if (url.getProtocol().equals("file")) {
                File m39788i = m39788i(url);
                if (!newLinkedHashMap.containsKey(m39788i)) {
                    newLinkedHashMap.put(m39788i, classLoader);
                }
            }
        }
        return ImmutableMap.copyOf((Map) newLinkedHashMap);
    }

    /* renamed from: e */
    public static URL m39792e(File file, String str) {
        return new URL(file.toURI().toURL(), str);
    }

    /* renamed from: f */
    public static ImmutableSet m39791f(File file, Manifest manifest) {
        if (manifest == null) {
            return ImmutableSet.m40931of();
        }
        ImmutableSet.Builder builder = ImmutableSet.builder();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str : f54087c.split(value)) {
                try {
                    URL m39792e = m39792e(file, str);
                    if (m39792e.getProtocol().equals("file")) {
                        builder.add((ImmutableSet.Builder) m39788i(m39792e));
                    }
                } catch (MalformedURLException unused) {
                    Logger logger = f54086b;
                    logger.warning("Invalid Class-Path entry: " + str);
                }
            }
        }
        return builder.build();
    }

    public static ClassPath from(ClassLoader classLoader) throws IOException {
        ImmutableSet m39790g = m39790g(classLoader);
        HashSet hashSet = new HashSet();
        UnmodifiableIterator it = m39790g.iterator();
        while (it.hasNext()) {
            hashSet.add(((C8136a) it.next()).m39786a());
        }
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator it2 = m39790g.iterator();
        while (it2.hasNext()) {
            builder.addAll((Iterable) ((C8136a) it2.next()).m39780g(hashSet));
        }
        return new ClassPath(builder.build());
    }

    /* renamed from: g */
    public static ImmutableSet m39790g(ClassLoader classLoader) {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator it = m39793d(classLoader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.add((ImmutableSet.Builder) new C8136a((File) entry.getKey(), (ClassLoader) entry.getValue()));
        }
        return builder.build();
    }

    /* renamed from: h */
    public static ImmutableList m39789h() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (String str : Splitter.m41289on(StandardSystemProperty.PATH_SEPARATOR.value()).split(StandardSystemProperty.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    builder.add((ImmutableList.Builder) new File(str).toURI().toURL());
                } catch (SecurityException unused) {
                    builder.add((ImmutableList.Builder) new URL("file", (String) null, new File(str).getAbsolutePath()));
                }
            } catch (MalformedURLException e) {
                Logger logger = f54086b;
                Level level = Level.WARNING;
                logger.log(level, "malformed classpath entry: " + str, (Throwable) e);
            }
        }
        return builder.build();
    }

    /* renamed from: i */
    public static File m39788i(URL url) {
        Preconditions.checkArgument(url.getProtocol().equals("file"));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public ImmutableSet<ClassInfo> getAllClasses() {
        return FluentIterable.from(this.f54088a).filter(ClassInfo.class).toSet();
    }

    public ImmutableSet<ResourceInfo> getResources() {
        return this.f54088a;
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses() {
        return FluentIterable.from(this.f54088a).filter(ClassInfo.class).filter(new Predicate() { // from class: Dp
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return ((ClassPath.ClassInfo) obj).isTopLevel();
            }
        }).toSet();
    }

    public ImmutableSet<ClassInfo> getTopLevelClassesRecursive(String str) {
        Preconditions.checkNotNull(str);
        String str2 = str + '.';
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator<ClassInfo> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            ClassInfo next = it.next();
            if (next.getName().startsWith(str2)) {
                builder.add((ImmutableSet.Builder) next);
            }
        }
        return builder.build();
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses(String str) {
        Preconditions.checkNotNull(str);
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator<ClassInfo> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            ClassInfo next = it.next();
            if (next.getPackageName().equals(str)) {
                builder.add((ImmutableSet.Builder) next);
            }
        }
        return builder.build();
    }
}
