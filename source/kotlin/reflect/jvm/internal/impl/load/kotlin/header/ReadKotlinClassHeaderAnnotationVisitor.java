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
    public static final boolean f69343j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    public static final Map f69344k;

    /* renamed from: a */
    public int[] f69345a = null;

    /* renamed from: b */
    public String f69346b = null;

    /* renamed from: c */
    public int f69347c = 0;

    /* renamed from: d */
    public String f69348d = null;

    /* renamed from: e */
    public String[] f69349e = null;

    /* renamed from: f */
    public String[] f69350f = null;

    /* renamed from: g */
    public String[] f69351g = null;

    /* renamed from: h */
    public KotlinClassHeader.Kind f69352h = null;

    /* renamed from: i */
    public String[] f69353i = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC11843b implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* renamed from: a */
        public final List f69354a = new ArrayList();

        /* renamed from: a */
        private static /* synthetic */ void m28233a(int i) {
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
        public abstract void mo28219b(String[] strArr);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visit(Object obj) {
            if (obj instanceof String) {
                this.f69354a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId) {
            if (classId == null) {
                m28233a(3);
                return null;
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitClassLiteral(ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m28233a(2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnd() {
            mo28219b((String[]) this.f69354a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public void visitEnum(ClassId classId, Name name) {
            if (classId == null) {
                m28233a(0);
            }
            if (name == null) {
                m28233a(1);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c */
    /* loaded from: classes6.dex */
    public class C11844c implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c$a */
        /* loaded from: classes6.dex */
        public class C11845a extends AbstractC11843b {
            public C11845a() {
            }

            /* renamed from: a */
            public static /* synthetic */ void m28229a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11843b
            /* renamed from: b */
            public void mo28219b(String[] strArr) {
                if (strArr == null) {
                    m28229a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69349e = strArr;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$c$b */
        /* loaded from: classes6.dex */
        public class C11846b extends AbstractC11843b {
            public C11846b() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28228a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11843b
            /* renamed from: b */
            public void mo28219b(String[] strArr) {
                if (strArr == null) {
                    m28228a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69350f = strArr;
            }
        }

        public C11844c() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m28232a(int i) {
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
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28231b() {
            return new C11845a();
        }

        /* renamed from: c */
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28230c() {
            return new C11846b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            if (name == null) {
                return;
            }
            String asString = name.asString();
            if (OperatorName.NON_STROKING_CMYK.equals(asString)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69352h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                }
            } else if ("mv".equals(asString)) {
                if (obj instanceof int[]) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69345a = (int[]) obj;
                }
            } else if ("xs".equals(asString)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.isEmpty()) {
                        ReadKotlinClassHeaderAnnotationVisitor.this.f69346b = str;
                    }
                }
            } else if ("xi".equals(asString)) {
                if (obj instanceof Integer) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69347c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(asString) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (!str2.isEmpty()) {
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69348d = str2;
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId == null) {
                m28232a(3);
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
                return m28231b();
            }
            if (!"d2".equals(str)) {
                return null;
            }
            return m28230c();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m28232a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                m28232a(1);
            }
            if (name2 == null) {
                m28232a(2);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$d */
    /* loaded from: classes6.dex */
    public class C11847d implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$d$a */
        /* loaded from: classes6.dex */
        public class C11848a extends AbstractC11843b {
            public C11848a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28225a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11843b
            /* renamed from: b */
            public void mo28219b(String[] strArr) {
                if (strArr == null) {
                    m28225a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69353i = strArr;
            }
        }

        public C11847d() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m28227a(int i) {
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
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28226b() {
            return new C11848a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId == null) {
                m28227a(3);
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
            return m28226b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m28227a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                m28227a(1);
            }
            if (name2 == null) {
                m28227a(2);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e */
    /* loaded from: classes6.dex */
    public class C11849e implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e$a */
        /* loaded from: classes6.dex */
        public class C11850a extends AbstractC11843b {
            public C11850a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28221a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11843b
            /* renamed from: b */
            public void mo28219b(String[] strArr) {
                if (strArr == null) {
                    m28221a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69349e = strArr;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor$e$b */
        /* loaded from: classes6.dex */
        public class C11851b extends AbstractC11843b {
            public C11851b() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m28220a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.AbstractC11843b
            /* renamed from: b */
            public void mo28219b(String[] strArr) {
                if (strArr == null) {
                    m28220a(0);
                }
                ReadKotlinClassHeaderAnnotationVisitor.this.f69350f = strArr;
            }
        }

        public C11849e() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m28224a(int i) {
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
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28223b() {
            return new C11850a();
        }

        /* renamed from: c */
        private KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor m28222c() {
            return new C11851b();
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
                    ReadKotlinClassHeaderAnnotationVisitor.this.f69345a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(asString)) {
                ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                readKotlinClassHeaderAnnotationVisitor.f69346b = str;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
            if (classId == null) {
                m28224a(3);
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
                return m28222c();
            }
            return m28223b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
            if (classLiteralValue == null) {
                m28224a(0);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnd() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId classId, Name name2) {
            if (classId == null) {
                m28224a(1);
            }
            if (name2 == null) {
                m28224a(2);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f69344k = hashMap;
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    /* renamed from: a */
    public static /* synthetic */ void m28243a(int i) {
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
        if (this.f69352h == null || this.f69345a == null) {
            return null;
        }
        int[] iArr = this.f69345a;
        if ((this.f69347c & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        JvmMetadataVersion jvmMetadataVersion2 = new JvmMetadataVersion(iArr, z);
        if (!jvmMetadataVersion2.isCompatible(jvmMetadataVersion)) {
            this.f69351g = this.f69349e;
            this.f69349e = null;
        } else if (m28234j() && this.f69349e == null) {
            return null;
        }
        String[] strArr = this.f69353i;
        if (strArr != null) {
            bArr = BitEncoding.decodeBytes(strArr);
        }
        return new KotlinClassHeader(this.f69352h, jvmMetadataVersion2, this.f69349e, this.f69351g, this.f69350f, this.f69346b, this.f69347c, this.f69348d, bArr);
    }

    @Nullable
    public KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return createHeader(JvmMetadataVersion.INSTANCE);
    }

    /* renamed from: j */
    public final boolean m28234j() {
        KotlinClassHeader.Kind kind = this.f69352h;
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
            m28243a(0);
        }
        if (sourceElement == null) {
            m28243a(1);
        }
        FqName asSingleFqName = classId.asSingleFqName();
        if (asSingleFqName.equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new C11844c();
        }
        if (asSingleFqName.equals(JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
            return new C11847d();
        }
        if (f69343j || this.f69352h != null || (kind = (KotlinClassHeader.Kind) f69344k.get(classId)) == null) {
            return null;
        }
        this.f69352h = kind;
        return new C11849e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}
