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
    public static final Logger f54098b = Logger.getLogger(ClassPath.class.getName());

    /* renamed from: c */
    public static final Splitter f54099c = Splitter.m41276on(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR).omitEmptyStrings();

    /* renamed from: a */
    public final ImmutableSet f54100a;

    /* loaded from: classes4.dex */
    public static final class ClassInfo extends ResourceInfo {

        /* renamed from: d */
        public final String f54101d;

        public ClassInfo(File file, String str, ClassLoader classLoader) {
            super(file, str, classLoader);
            this.f54101d = ClassPath.m39786c(str);
        }

        public String getName() {
            return this.f54101d;
        }

        public String getPackageName() {
            return Reflection.getPackageName(this.f54101d);
        }

        public String getSimpleName() {
            int lastIndexOf = this.f54101d.lastIndexOf(36);
            if (lastIndexOf != -1) {
                return CharMatcher.inRange('0', '9').trimLeadingFrom(this.f54101d.substring(lastIndexOf + 1));
            }
            String packageName = getPackageName();
            if (packageName.isEmpty()) {
                return this.f54101d;
            }
            return this.f54101d.substring(packageName.length() + 1);
        }

        public boolean isTopLevel() {
            if (this.f54101d.indexOf(36) == -1) {
                return true;
            }
            return false;
        }

        public Class<?> load() {
            try {
                return this.f54104c.loadClass(this.f54101d);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public String toString() {
            return this.f54101d;
        }
    }

    /* loaded from: classes4.dex */
    public static class ResourceInfo {

        /* renamed from: a */
        public final File f54102a;

        /* renamed from: b */
        public final String f54103b;

        /* renamed from: c */
        public final ClassLoader f54104c;

        public ResourceInfo(File file, String str, ClassLoader classLoader) {
            this.f54102a = (File) Preconditions.checkNotNull(file);
            this.f54103b = (String) Preconditions.checkNotNull(str);
            this.f54104c = (ClassLoader) Preconditions.checkNotNull(classLoader);
        }

        /* renamed from: a */
        public static ResourceInfo m39779a(File file, String str, ClassLoader classLoader) {
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
            if (!this.f54103b.equals(resourceInfo.f54103b) || this.f54104c != resourceInfo.f54104c) {
                return false;
            }
            return true;
        }

        public final String getResourceName() {
            return this.f54103b;
        }

        public int hashCode() {
            return this.f54103b.hashCode();
        }

        public String toString() {
            return this.f54103b;
        }

        public final URL url() {
            URL resource = this.f54104c.getResource(this.f54103b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f54103b);
        }
    }

    /* renamed from: com.google.common.reflect.ClassPath$a */
    /* loaded from: classes4.dex */
    public static final class C8125a {

        /* renamed from: a */
        public final File f54105a;

        /* renamed from: b */
        public final ClassLoader f54106b;

        public C8125a(File file, ClassLoader classLoader) {
            this.f54105a = (File) Preconditions.checkNotNull(file);
            this.f54106b = (ClassLoader) Preconditions.checkNotNull(classLoader);
        }

        /* renamed from: a */
        public final File m39778a() {
            return this.f54105a;
        }

        /* renamed from: b */
        public final void m39777b(File file, Set set, ImmutableSet.Builder builder) {
            try {
                if (!file.exists()) {
                    return;
                }
                if (file.isDirectory()) {
                    m39776c(file, builder);
                } else {
                    m39774e(file, set, builder);
                }
            } catch (SecurityException e) {
                Logger logger = ClassPath.f54098b;
                logger.warning("Cannot access " + file + ": " + e);
            }
        }

        /* renamed from: c */
        public final void m39776c(File file, ImmutableSet.Builder builder) {
            HashSet hashSet = new HashSet();
            hashSet.add(file.getCanonicalFile());
            m39775d(file, "", hashSet, builder);
        }

        /* renamed from: d */
        public final void m39775d(File file, String str, Set set, ImmutableSet.Builder builder) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                ClassPath.f54098b.warning("Cannot read directory " + file);
                return;
            }
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        m39775d(canonicalFile, str + name + RemoteSettings.FORWARD_SLASH_STRING, set, builder);
                        set.remove(canonicalFile);
                    }
                } else {
                    String str2 = str + name;
                    if (!str2.equals("META-INF/MANIFEST.MF")) {
                        builder.add((ImmutableSet.Builder) ResourceInfo.m39779a(file2, str2, this.f54106b));
                    }
                }
            }
        }

        /* renamed from: e */
        public final void m39774e(File file, Set set, ImmutableSet.Builder builder) {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    UnmodifiableIterator it = ClassPath.m39783f(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        if (set.add(file2.getCanonicalFile())) {
                            m39777b(file2, set, builder);
                        }
                    }
                    m39773f(jarFile, builder);
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
            if (!(obj instanceof C8125a)) {
                return false;
            }
            C8125a c8125a = (C8125a) obj;
            if (!this.f54105a.equals(c8125a.f54105a) || !this.f54106b.equals(c8125a.f54106b)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final void m39773f(JarFile jarFile, ImmutableSet.Builder builder) {
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory() && !nextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    builder.add((ImmutableSet.Builder) ResourceInfo.m39779a(new File(jarFile.getName()), nextElement.getName(), this.f54106b));
                }
            }
        }

        /* renamed from: g */
        public ImmutableSet m39772g(Set set) {
            ImmutableSet.Builder builder = ImmutableSet.builder();
            set.add(this.f54105a);
            m39777b(this.f54105a, set, builder);
            return builder.build();
        }

        public int hashCode() {
            return this.f54105a.hashCode();
        }

        public String toString() {
            return this.f54105a.toString();
        }
    }

    public ClassPath(ImmutableSet immutableSet) {
        this.f54100a = immutableSet;
    }

    /* renamed from: b */
    public static ImmutableList m39787b(ClassLoader classLoader) {
        if (classLoader instanceof URLClassLoader) {
            return ImmutableList.copyOf(((URLClassLoader) classLoader).getURLs());
        }
        if (classLoader.equals(ClassLoader.getSystemClassLoader())) {
            return m39781h();
        }
        return ImmutableList.m40987of();
    }

    /* renamed from: c */
    public static String m39786c(String str) {
        return str.substring(0, str.length() - 6).replace('/', '.');
    }

    /* renamed from: d */
    public static ImmutableMap m39785d(ClassLoader classLoader) {
        LinkedHashMap newLinkedHashMap = Maps.newLinkedHashMap();
        ClassLoader parent = classLoader.getParent();
        if (parent != null) {
            newLinkedHashMap.putAll(m39785d(parent));
        }
        UnmodifiableIterator it = m39787b(classLoader).iterator();
        while (it.hasNext()) {
            URL url = (URL) it.next();
            if (url.getProtocol().equals("file")) {
                File m39780i = m39780i(url);
                if (!newLinkedHashMap.containsKey(m39780i)) {
                    newLinkedHashMap.put(m39780i, classLoader);
                }
            }
        }
        return ImmutableMap.copyOf((Map) newLinkedHashMap);
    }

    /* renamed from: e */
    public static URL m39784e(File file, String str) {
        return new URL(file.toURI().toURL(), str);
    }

    /* renamed from: f */
    public static ImmutableSet m39783f(File file, Manifest manifest) {
        if (manifest == null) {
            return ImmutableSet.m40920of();
        }
        ImmutableSet.Builder builder = ImmutableSet.builder();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str : f54099c.split(value)) {
                try {
                    URL m39784e = m39784e(file, str);
                    if (m39784e.getProtocol().equals("file")) {
                        builder.add((ImmutableSet.Builder) m39780i(m39784e));
                    }
                } catch (MalformedURLException unused) {
                    Logger logger = f54098b;
                    logger.warning("Invalid Class-Path entry: " + str);
                }
            }
        }
        return builder.build();
    }

    public static ClassPath from(ClassLoader classLoader) throws IOException {
        ImmutableSet m39782g = m39782g(classLoader);
        HashSet hashSet = new HashSet();
        UnmodifiableIterator it = m39782g.iterator();
        while (it.hasNext()) {
            hashSet.add(((C8125a) it.next()).m39778a());
        }
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator it2 = m39782g.iterator();
        while (it2.hasNext()) {
            builder.addAll((Iterable) ((C8125a) it2.next()).m39772g(hashSet));
        }
        return new ClassPath(builder.build());
    }

    /* renamed from: g */
    public static ImmutableSet m39782g(ClassLoader classLoader) {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator it = m39785d(classLoader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.add((ImmutableSet.Builder) new C8125a((File) entry.getKey(), (ClassLoader) entry.getValue()));
        }
        return builder.build();
    }

    /* renamed from: h */
    public static ImmutableList m39781h() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (String str : Splitter.m41276on(StandardSystemProperty.PATH_SEPARATOR.value()).split(StandardSystemProperty.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    builder.add((ImmutableList.Builder) new File(str).toURI().toURL());
                } catch (SecurityException unused) {
                    builder.add((ImmutableList.Builder) new URL("file", (String) null, new File(str).getAbsolutePath()));
                }
            } catch (MalformedURLException e) {
                Logger logger = f54098b;
                Level level = Level.WARNING;
                logger.log(level, "malformed classpath entry: " + str, (Throwable) e);
            }
        }
        return builder.build();
    }

    /* renamed from: i */
    public static File m39780i(URL url) {
        Preconditions.checkArgument(url.getProtocol().equals("file"));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public ImmutableSet<ClassInfo> getAllClasses() {
        return FluentIterable.from(this.f54100a).filter(ClassInfo.class).toSet();
    }

    public ImmutableSet<ResourceInfo> getResources() {
        return this.f54100a;
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses() {
        return FluentIterable.from(this.f54100a).filter(ClassInfo.class).filter(new Predicate() { // from class: Dp
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