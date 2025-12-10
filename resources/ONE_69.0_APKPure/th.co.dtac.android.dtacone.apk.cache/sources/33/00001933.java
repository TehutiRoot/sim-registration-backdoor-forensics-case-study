package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.StandardSystemProperty;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.cli.HelpFormatter;
import p000.AbstractC19052aS1;

/* renamed from: aS1 */
/* loaded from: classes4.dex */
public abstract class AbstractC19052aS1 {

    /* renamed from: a */
    public static final AbstractC19052aS1 f8431a = m65140c();

    /* renamed from: aS1$b */
    /* loaded from: classes4.dex */
    public static final class C1873b extends AbstractC19052aS1 {
        public C1873b() {
            super();
        }

        @Override // p000.AbstractC19052aS1
        /* renamed from: a */
        public File mo65126a() {
            File file = new File(StandardSystemProperty.JAVA_IO_TMPDIR.value());
            String str = System.currentTimeMillis() + HelpFormatter.DEFAULT_OPT_PREFIX;
            for (int i = 0; i < 10000; i++) {
                File file2 = new File(file, str + i);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            throw new IllegalStateException("Failed to create directory within 10000 attempts (tried " + str + "0 to " + str + 9999 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Override // p000.AbstractC19052aS1
        /* renamed from: b */
        public File mo65125b(String str) {
            return File.createTempFile(str, null, null);
        }
    }

    /* renamed from: aS1$d */
    /* loaded from: classes4.dex */
    public static final class C1877d extends AbstractC19052aS1 {
        public C1877d() {
            super();
        }

        @Override // p000.AbstractC19052aS1
        /* renamed from: a */
        public File mo65126a() {
            throw new IllegalStateException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }

        @Override // p000.AbstractC19052aS1
        /* renamed from: b */
        public File mo65125b(String str) {
            throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }
    }

    /* renamed from: c */
    public static AbstractC19052aS1 m65140c() {
        try {
            try {
                Class.forName("java.nio.file.Path");
                return new C1874c();
            } catch (ClassNotFoundException unused) {
                return new C1877d();
            } catch (IllegalAccessException unused2) {
                return new C1877d();
            } catch (NoSuchFieldException unused3) {
                return new C1877d();
            }
        } catch (ClassNotFoundException unused4) {
            if (((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue()) {
                return new C1877d();
            }
            return new C1873b();
        }
    }

    /* renamed from: a */
    public abstract File mo65126a();

    /* renamed from: b */
    public abstract File mo65125b(String str);

    public AbstractC19052aS1() {
    }

    /* renamed from: aS1$c */
    /* loaded from: classes4.dex */
    public static final class C1874c extends AbstractC19052aS1 {

        /* renamed from: b */
        public static final InterfaceC1876b f8432b;

        /* renamed from: c */
        public static final InterfaceC1876b f8433c;

        /* renamed from: aS1$c$a */
        /* loaded from: classes4.dex */
        public class C1875a implements FileAttribute {

            /* renamed from: a */
            public final /* synthetic */ ImmutableList f8434a;

            public C1875a(ImmutableList immutableList) {
                this.f8434a = immutableList;
            }

            @Override // java.nio.file.attribute.FileAttribute
            /* renamed from: a */
            public ImmutableList value() {
                return this.f8434a;
            }

            @Override // java.nio.file.attribute.FileAttribute
            public String name() {
                return "acl:acl";
            }
        }

        /* renamed from: aS1$c$b */
        /* loaded from: classes4.dex */
        public interface InterfaceC1876b {
            FileAttribute get();
        }

        static {
            FileSystem fileSystem;
            Set supportedFileAttributeViews;
            fileSystem = FileSystems.getDefault();
            supportedFileAttributeViews = fileSystem.supportedFileAttributeViews();
            if (supportedFileAttributeViews.contains("posix")) {
                f8432b = new InterfaceC1876b() { // from class: oS1
                    @Override // p000.AbstractC19052aS1.C1874c.InterfaceC1876b
                    public final FileAttribute get() {
                        return AbstractC19052aS1.C1874c.m65138e();
                    }
                };
                f8433c = new InterfaceC1876b() { // from class: pS1
                    @Override // p000.AbstractC19052aS1.C1874c.InterfaceC1876b
                    public final FileAttribute get() {
                        return AbstractC19052aS1.C1874c.m65139d();
                    }
                };
            } else if (supportedFileAttributeViews.contains("acl")) {
                InterfaceC1876b m65128o = m65128o();
                f8433c = m65128o;
                f8432b = m65128o;
            } else {
                InterfaceC1876b interfaceC1876b = new InterfaceC1876b() { // from class: qS1
                    @Override // p000.AbstractC19052aS1.C1874c.InterfaceC1876b
                    public final FileAttribute get() {
                        return AbstractC19052aS1.C1874c.m65136g();
                    }
                };
                f8433c = interfaceC1876b;
                f8432b = interfaceC1876b;
            }
        }

        public C1874c() {
            super();
        }

        /* renamed from: d */
        public static /* synthetic */ FileAttribute m65139d() {
            return m65132k();
        }

        /* renamed from: e */
        public static /* synthetic */ FileAttribute m65138e() {
            return m65133j();
        }

        /* renamed from: f */
        public static /* synthetic */ FileAttribute m65137f(FileAttribute fileAttribute) {
            return m65130m(fileAttribute);
        }

        /* renamed from: g */
        public static /* synthetic */ FileAttribute m65136g() {
            return m65131l();
        }

        /* renamed from: h */
        public static /* synthetic */ FileAttribute m65135h(IOException iOException) {
            return m65129n(iOException);
        }

        /* renamed from: i */
        public static String m65134i() {
            String value = StandardSystemProperty.USER_NAME.value();
            Objects.requireNonNull(value);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", null);
                Method method2 = cls.getMethod("info", null);
                Object invoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", null).invoke(method2.invoke(method.invoke(null, null), null), null), value);
                Objects.requireNonNull(invoke);
                return (String) invoke;
            } catch (ClassNotFoundException unused) {
                return value;
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
                return value;
            } catch (InvocationTargetException e) {
                Throwables.throwIfUnchecked(e.getCause());
                return value;
            }
        }

        /* renamed from: j */
        public static /* synthetic */ FileAttribute m65133j() {
            Set fromString;
            FileAttribute asFileAttribute;
            fromString = PosixFilePermissions.fromString("rw-------");
            asFileAttribute = PosixFilePermissions.asFileAttribute(fromString);
            return asFileAttribute;
        }

        /* renamed from: k */
        public static /* synthetic */ FileAttribute m65132k() {
            Set fromString;
            FileAttribute asFileAttribute;
            fromString = PosixFilePermissions.fromString("rwx------");
            asFileAttribute = PosixFilePermissions.asFileAttribute(fromString);
            return asFileAttribute;
        }

        /* renamed from: l */
        public static /* synthetic */ FileAttribute m65131l() {
            FileSystem fileSystem;
            StringBuilder sb = new StringBuilder();
            sb.append("unrecognized FileSystem type ");
            fileSystem = FileSystems.getDefault();
            sb.append(fileSystem);
            throw new IOException(sb.toString());
        }

        /* renamed from: n */
        public static /* synthetic */ FileAttribute m65129n(IOException iOException) {
            throw new IOException("Could not find user", iOException);
        }

        /* renamed from: o */
        public static InterfaceC1876b m65128o() {
            FileSystem fileSystem;
            UserPrincipalLookupService userPrincipalLookupService;
            UserPrincipal lookupPrincipalByName;
            AclEntry.Builder newBuilder;
            AclEntryType aclEntryType;
            AclEntry.Builder type;
            AclEntry.Builder principal;
            AclEntry.Builder permissions;
            AclEntryFlag aclEntryFlag;
            AclEntryFlag aclEntryFlag2;
            AclEntry.Builder flags;
            AclEntry build;
            try {
                fileSystem = FileSystems.getDefault();
                userPrincipalLookupService = fileSystem.getUserPrincipalLookupService();
                lookupPrincipalByName = userPrincipalLookupService.lookupPrincipalByName(m65134i());
                newBuilder = AclEntry.newBuilder();
                aclEntryType = AclEntryType.ALLOW;
                type = newBuilder.setType(aclEntryType);
                principal = type.setPrincipal(lookupPrincipalByName);
                permissions = principal.setPermissions(EnumSet.allOf(AbstractC19576dS1.m31831a()));
                aclEntryFlag = AclEntryFlag.DIRECTORY_INHERIT;
                aclEntryFlag2 = AclEntryFlag.FILE_INHERIT;
                flags = permissions.setFlags(aclEntryFlag, aclEntryFlag2);
                build = flags.build();
                final C1875a c1875a = new C1875a(ImmutableList.m40986of(build));
                return new InterfaceC1876b() { // from class: rS1
                    @Override // p000.AbstractC19052aS1.C1874c.InterfaceC1876b
                    public final FileAttribute get() {
                        return AbstractC19052aS1.C1874c.m65137f(c1875a);
                    }
                };
            } catch (IOException e) {
                return new InterfaceC1876b() { // from class: sS1
                    @Override // p000.AbstractC19052aS1.C1874c.InterfaceC1876b
                    public final FileAttribute get() {
                        return AbstractC19052aS1.C1874c.m65135h(e);
                    }
                };
            }
        }

        @Override // p000.AbstractC19052aS1
        /* renamed from: a */
        public File mo65126a() {
            Path path;
            Path createTempDirectory;
            File file;
            try {
                path = Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]);
                createTempDirectory = Files.createTempDirectory(path, null, f8433c.get());
                file = createTempDirectory.toFile();
                return file;
            } catch (IOException e) {
                throw new IllegalStateException("Failed to create directory", e);
            }
        }

        @Override // p000.AbstractC19052aS1
        /* renamed from: b */
        public File mo65125b(String str) {
            Path path;
            Path createTempFile;
            File file;
            path = Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]);
            createTempFile = Files.createTempFile(path, str, null, f8432b.get());
            file = createTempFile.toFile();
            return file;
        }

        /* renamed from: m */
        public static /* synthetic */ FileAttribute m65130m(FileAttribute fileAttribute) {
            return fileAttribute;
        }
    }
}