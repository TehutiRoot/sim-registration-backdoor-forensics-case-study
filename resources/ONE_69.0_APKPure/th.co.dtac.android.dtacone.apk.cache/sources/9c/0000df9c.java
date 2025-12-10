package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* renamed from: j */
    public static final boolean f69377j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    public static final Map f69378k;

    /* renamed from: a */
    public int[] f69379a = null;

    /* renamed from: b */
    public String f69380b = null;

    /* renamed from: c */
    public int f69381c = 0;

    /* renamed from: d */
    public String f69382d = null;

    /* renamed from: e */
    public String[] f69383e = null;

    /* renamed from: f */
    public String[] f69384f = null;

    /* renamed from: g */
    public String[] f69385g = null;

    /* renamed from: h */
    public KotlinClassHeader.Kind f69386h = null;

    /* renamed from: i */
    public String[] f69387i = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC11819b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* renamed from: a */
        public final List f69388a = new ArrayList();

        /* renamed from: a */
        private static /* synthetic */ void m28525a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public abstract void mo28511b(String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visit(Object obj) {
            if (obj instanceof String) {
                this.f69388a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId) {
            if (classId == null) {
                m28525a(3);
                return null;
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitClassLiteral(ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m28525a(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnd() {
            mo28511b((String[]) this.f69388a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnum(ClassId classId, Name name) {
            if (classId == null) {
                m28525a(0);
            }
            if (name == null) {
                m28525a(1);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c */
    /* loaded from: classes6.dex */
    public class C11820c implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c$a */
        /* loaded from: classes6.dex */
        public class C11821a extends AbstractC11819b {
            public C11821a() {
            }

            /* renamed from: a */
            public static /* synthetic */ void m28521a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11819b
            /* renamed from: b */
            public void mo28511b(String[] strArr) {
                if (strArr == null) {
                    m28521a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69383e = strArr;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c$b */
        /* loaded from: classes6.dex */
        public class C11822b extends AbstractC11819b {
            public C11822b() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28520a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11819b
            /* renamed from: b */
            public void mo28511b(String[] strArr) {
                if (strArr == null) {
                    m28520a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69384f = strArr;
            }
        }

        public C11820c() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m28524a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28523b() {
            return new C11821a();
        }

        /* renamed from: c */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28522c() {
            return new C11822b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            if (name == null) {
                return;
            }
            String asString = name.asString();
            if (OperatorName.NON_STROKING_CMYK.equals(asString)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69386h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                }
            } else if ("mv".equals(asString)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69379a = (int[]) obj;
                }
            } else if ("xs".equals(asString)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.isEmpty()) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.f69380b = str;
                    }
                }
            } else if ("xi".equals(asString)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69381c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(asString) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (!str2.isEmpty()) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69382d = str2;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId == null) {
                m28524a(3);
                return null;
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            String str;
            if (name != null) {
                str = name.asString();
            } else {
                str = null;
            }
            if (OperatorName.TYPE3_D1.equals(str)) {
                return m28523b();
            }
            if (!"d2".equals(str)) {
                return null;
            }
            return m28522c();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m28524a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                m28524a(1);
            }
            if (name2 == null) {
                m28524a(2);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$d */
    /* loaded from: classes6.dex */
    public class C11823d implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$d$a */
        /* loaded from: classes6.dex */
        public class C11824a extends AbstractC11819b {
            public C11824a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28517a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11819b
            /* renamed from: b */
            public void mo28511b(String[] strArr) {
                if (strArr == null) {
                    m28517a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69387i = strArr;
            }
        }

        public C11823d() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m28519a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28518b() {
            return new C11824a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId == null) {
                m28519a(3);
                return null;
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            String str;
            if (name != null) {
                str = name.asString();
            } else {
                str = null;
            }
            if (!OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE.equals(str)) {
                return null;
            }
            return m28518b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m28519a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                m28519a(1);
            }
            if (name2 == null) {
                m28519a(2);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e */
    /* loaded from: classes6.dex */
    public class C11825e implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e$a */
        /* loaded from: classes6.dex */
        public class C11826a extends AbstractC11819b {
            public C11826a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28513a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11819b
            /* renamed from: b */
            public void mo28511b(String[] strArr) {
                if (strArr == null) {
                    m28513a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69383e = strArr;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e$b */
        /* loaded from: classes6.dex */
        public class C11827b extends AbstractC11819b {
            public C11827b() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28512a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11819b
            /* renamed from: b */
            public void mo28511b(String[] strArr) {
                if (strArr == null) {
                    m28512a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69384f = strArr;
            }
        }

        public C11825e() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m28516a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28515b() {
            return new C11826a();
        }

        /* renamed from: c */
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28514c() {
            return new C11827b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            String str;
            if (name == null) {
                return;
            }
            String asString = name.asString();
            if (ClientCookie.VERSION_ATTR.equals(asString)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69379a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(asString)) {
                ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                readKotlinClassHeaderAnnotationVisitor.f69380b = str;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId == null) {
                m28516a(3);
                return null;
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            String str;
            if (name != null) {
                str = name.asString();
            } else {
                str = null;
            }
            if (!"data".equals(str) && !"filePartClassNames".equals(str)) {
                if (!"strings".equals(str)) {
                    return null;
                }
                return m28514c();
            }
            return m28515b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m28516a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                m28516a(1);
            }
            if (name2 == null) {
                m28516a(2);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f69378k = hashMap;
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    /* renamed from: a */
    public static /* synthetic */ void m28535a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Nullable
    public KotlinClassHeader createHeader(JvmMetadataVersion jvmMetadataVersion) {
        boolean z;
        byte[] bArr = null;
        if (this.f69386h == null || this.f69379a == null) {
            return null;
        }
        int[] iArr = this.f69379a;
        if ((this.f69381c & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        JvmMetadataVersion jvmMetadataVersion2 = new JvmMetadataVersion(iArr, z);
        if (!jvmMetadataVersion2.isCompatible(jvmMetadataVersion)) {
            this.f69385g = this.f69383e;
            this.f69383e = null;
        } else if (m28526j() && this.f69383e == null) {
            return null;
        }
        String[] strArr = this.f69387i;
        if (strArr != null) {
            bArr = BitEncoding.decodeBytes(strArr);
        }
        return new KotlinClassHeader(this.f69386h, jvmMetadataVersion2, this.f69383e, this.f69385g, this.f69384f, this.f69380b, this.f69381c, this.f69382d, bArr);
    }

    @Nullable
    public KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return createHeader(JvmMetadataVersion.INSTANCE);
    }

    /* renamed from: j */
    public final boolean m28526j() {
        KotlinClassHeader.Kind kind = this.f69386h;
        if (kind != KotlinClassHeader.Kind.CLASS && kind != KotlinClassHeader.Kind.FILE_FACADE && kind != KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    @Nullable
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            m28535a(0);
        }
        if (sourceElement == null) {
            m28535a(1);
        }
        FqName asSingleFqName = classId.asSingleFqName();
        if (asSingleFqName.equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new C11820c();
        }
        if (asSingleFqName.equals(JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
            return new C11823d();
        }
        if (f69377j || this.f69386h != null || (kind = (KotlinClassHeader.Kind) f69378k.get(classId)) == null) {
            return null;
        }
        this.f69386h = kind;
        return new C11825e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}