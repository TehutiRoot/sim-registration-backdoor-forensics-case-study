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
import p000.AbstractC19524dR1;

/* renamed from: dR1 */
/* loaded from: classes4.dex */
public abstract class AbstractC19524dR1 {

    /* renamed from: a */
    public static final AbstractC19524dR1 f61162a = m31881c();

    /* renamed from: dR1$b */
    /* loaded from: classes4.dex */
    public static final class C10072b extends AbstractC19524dR1 {
        public C10072b() {
            super();
        }

        @Override // p000.AbstractC19524dR1
        /* renamed from: a */
        public File mo31867a() {
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

        @Override // p000.AbstractC19524dR1
        /* renamed from: b */
        public File mo31866b(String str) {
            return File.createTempFile(str, null, null);
        }
    }

    /* renamed from: dR1$d */
    /* loaded from: classes4.dex */
    public static final class C10076d extends AbstractC19524dR1 {
        public C10076d() {
            super();
        }

        @Override // p000.AbstractC19524dR1
        /* renamed from: a */
        public File mo31867a() {
            throw new IllegalStateException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }

        @Override // p000.AbstractC19524dR1
        /* renamed from: b */
        public File mo31866b(String str) {
            throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }
    }

    /* renamed from: c */
    public static AbstractC19524dR1 m31881c() {
        try {
            try {
                Class.forName("java.nio.file.Path");
                return new C10073c();
            } catch (ClassNotFoundException unused) {
                return new C10076d();
            } catch (IllegalAccessException unused2) {
                return new C10076d();
            } catch (NoSuchFieldException unused3) {
                return new C10076d();
            }
        } catch (ClassNotFoundException unused4) {
            if (((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue()) {
                return new C10076d();
            }
            return new C10072b();
        }
    }

    /* renamed from: a */
    public abstract File mo31867a();

    /* renamed from: b */
    public abstract File mo31866b(String str);

    public AbstractC19524dR1() {
    }

    /* renamed from: dR1$c */
    /* loaded from: classes4.dex */
    public static final class C10073c extends AbstractC19524dR1 {

        /* renamed from: b */
        public static final InterfaceC10075b f61163b;

        /* renamed from: c */
        public static final InterfaceC10075b f61164c;

        /* renamed from: dR1$c$a */
        /* loaded from: classes4.dex */
        public class C10074a implements FileAttribute {

            /* renamed from: a */
            public final /* synthetic */ ImmutableList f61165a;

            public C10074a(ImmutableList immutableList) {
                this.f61165a = immutableList;
            }

            @Override // java.nio.file.attribute.FileAttribute
            /* renamed from: a */
            public ImmutableList value() {
                return this.f61165a;
            }

            @Override // java.nio.file.attribute.FileAttribute
            public String name() {
                return "acl:acl";
            }
        }

        /* renamed from: dR1$c$b */
        /* loaded from: classes4.dex */
        public interface InterfaceC10075b {
            FileAttribute get();
        }

        static {
            FileSystem fileSystem;
            Set supportedFileAttributeViews;
            fileSystem = FileSystems.getDefault();
            supportedFileAttributeViews = fileSystem.supportedFileAttributeViews();
            if (supportedFileAttributeViews.contains("posix")) {
                f61163b = new InterfaceC10075b() { // from class: rR1
                    @Override // p000.AbstractC19524dR1.C10073c.InterfaceC10075b
                    public final FileAttribute get() {
                        return AbstractC19524dR1.C10073c.m31879e();
                    }
                };
                f61164c = new InterfaceC10075b() { // from class: sR1
                    @Override // p000.AbstractC19524dR1.C10073c.InterfaceC10075b
                    public final FileAttribute get() {
                        return AbstractC19524dR1.C10073c.m31880d();
                    }
                };
            } else if (supportedFileAttributeViews.contains("acl")) {
                InterfaceC10075b m31869o = m31869o();
                f61164c = m31869o;
                f61163b = m31869o;
            } else {
                InterfaceC10075b interfaceC10075b = new InterfaceC10075b() { // from class: tR1
                    @Override // p000.AbstractC19524dR1.C10073c.InterfaceC10075b
                    public final FileAttribute get() {
                        return AbstractC19524dR1.C10073c.m31877g();
                    }
                };
                f61164c = interfaceC10075b;
                f61163b = interfaceC10075b;
            }
        }

        public C10073c() {
            super();
        }

        /* renamed from: d */
        public static /* synthetic */ FileAttribute m31880d() {
            return m31873k();
        }

        /* renamed from: e */
        public static /* synthetic */ FileAttribute m31879e() {
            return m31874j();
        }

        /* renamed from: f */
        public static /* synthetic */ FileAttribute m31878f(FileAttribute fileAttribute) {
            return m31871m(fileAttribute);
        }

        /* renamed from: g */
        public static /* synthetic */ FileAttribute m31877g() {
            return m31872l();
        }

        /* renamed from: h */
        public static /* synthetic */ FileAttribute m31876h(IOException iOException) {
            return m31870n(iOException);
        }

        /* renamed from: i */
        public static String m31875i() {
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
        public static /* synthetic */ FileAttribute m31874j() {
            Set fromString;
            FileAttribute asFileAttribute;
            fromString = PosixFilePermissions.fromString("rw-------");
            asFileAttribute = PosixFilePermissions.asFileAttribute(fromString);
            return asFileAttribute;
        }

        /* renamed from: k */
        public static /* synthetic */ FileAttribute m31873k() {
            Set fromString;
            FileAttribute asFileAttribute;
            fromString = PosixFilePermissions.fromString("rwx------");
            asFileAttribute = PosixFilePermissions.asFileAttribute(fromString);
            return asFileAttribute;
        }

        /* renamed from: l */
        public static /* synthetic */ FileAttribute m31872l() {
            FileSystem fileSystem;
            StringBuilder sb = new StringBuilder();
            sb.append("unrecognized FileSystem type ");
            fileSystem = FileSystems.getDefault();
            sb.append(fileSystem);
            throw new IOException(sb.toString());
        }

        /* renamed from: n */
        public static /* synthetic */ FileAttribute m31870n(IOException iOException) {
            throw new IOException("Could not find user", iOException);
        }

        /* renamed from: o */
        public static InterfaceC10075b m31869o() {
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
                lookupPrincipalByName = userPrincipalLookupService.lookupPrincipalByName(m31875i());
                newBuilder = AclEntry.newBuilder();
                aclEntryType = AclEntryType.ALLOW;
                type = newBuilder.setType(aclEntryType);
                principal = type.setPrincipal(lookupPrincipalByName);
                permissions = principal.setPermissions(EnumSet.allOf(AbstractC20040gR1.m31128a()));
                aclEntryFlag = AclEntryFlag.DIRECTORY_INHERIT;
                aclEntryFlag2 = AclEntryFlag.FILE_INHERIT;
                flags = permissions.setFlags(aclEntryFlag, aclEntryFlag2);
                build = flags.build();
                final C10074a c10074a = new C10074a(ImmutableList.m40997of(build));
                return new InterfaceC10075b() { // from class: uR1
                    @Override // p000.AbstractC19524dR1.C10073c.InterfaceC10075b
                    public final FileAttribute get() {
                        return AbstractC19524dR1.C10073c.m31878f(c10074a);
                    }
                };
            } catch (IOException e) {
                return new InterfaceC10075b() { // from class: vR1
                    @Override // p000.AbstractC19524dR1.C10073c.InterfaceC10075b
                    public final FileAttribute get() {
                        return AbstractC19524dR1.C10073c.m31876h(e);
                    }
                };
            }
        }

        @Override // p000.AbstractC19524dR1
        /* renamed from: a */
        public File mo31867a() {
            Path path;
            Path createTempDirectory;
            File file;
            try {
                path = Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]);
                createTempDirectory = Files.createTempDirectory(path, null, f61164c.get());
                file = createTempDirectory.toFile();
                return file;
            } catch (IOException e) {
                throw new IllegalStateException("Failed to create directory", e);
            }
        }

        @Override // p000.AbstractC19524dR1
        /* renamed from: b */
        public File mo31866b(String str) {
            Path path;
            Path createTempFile;
            File file;
            path = Paths.get(StandardSystemProperty.JAVA_IO_TMPDIR.value(), new String[0]);
            createTempFile = Files.createTempFile(path, str, null, f61163b.get());
            file = createTempFile.toFile();
            return file;
        }

        /* renamed from: m */
        public static /* synthetic */ FileAttribute m31871m(FileAttribute fileAttribute) {
            return fileAttribute;
        }
    }
}
