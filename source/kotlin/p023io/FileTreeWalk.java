package kotlin.p023io;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f(!B\u008b\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u00128\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\u001bJ!\u0010\n\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u001bJ'\u0010\u0011\u001a\u00020\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0011\u0010\u001cJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$RF\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010'¨\u0006)"}, m28850d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/Function1;", "", "onEnter", "", "onLeave", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", OperatorName.FILL_NON_ZERO, "Ljava/io/IOException;", "e", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "", "iterator", "()Ljava/util/Iterator;", "function", "(Lkotlin/jvm/functions/Function1;)Lkotlin/io/FileTreeWalk;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/io/FileTreeWalk;", "depth", "(I)Lkotlin/io/FileTreeWalk;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/io/File;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/io/FileWalkDirection;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "d", "Lkotlin/jvm/functions/Function2;", "I", "FileTreeWalkIterator", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
/* renamed from: kotlin.io.FileTreeWalk */
/* loaded from: classes5.dex */
public final class FileTreeWalk implements Sequence<File> {

    /* renamed from: a */
    public final File f68203a;

    /* renamed from: b */
    public final FileWalkDirection f68204b;

    /* renamed from: c */
    public final Function1 f68205c;

    /* renamed from: d */
    public final Function1 f68206d;

    /* renamed from: e */
    public final Function2 f68207e;

    /* renamed from: f */
    public final int f68208f;

    /* renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator */
    /* loaded from: classes5.dex */
    public final class FileTreeWalkIterator extends AbstractIterator {

        /* renamed from: c */
        public final ArrayDeque f68209c;

        @Metadata(m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
        /* renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$WhenMappings */
        /* loaded from: classes5.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$a */
        /* loaded from: classes5.dex */
        public final class C11704a extends AbstractC11707a {

            /* renamed from: b */
            public boolean f68211b;

            /* renamed from: c */
            public File[] f68212c;

            /* renamed from: d */
            public int f68213d;

            /* renamed from: e */
            public boolean f68214e;

            /* renamed from: f */
            public final /* synthetic */ FileTreeWalkIterator f68215f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11704a(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f68215f = fileTreeWalkIterator;
            }

            @Override // kotlin.p023io.FileTreeWalk.AbstractC11708b
            /* renamed from: b */
            public File mo28777b() {
                if (!this.f68214e && this.f68212c == null) {
                    Function1 function1 = FileTreeWalk.this.f68205c;
                    if (function1 != null && !((Boolean) function1.invoke(m28778a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = m28778a().listFiles();
                    this.f68212c = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = FileTreeWalk.this.f68207e;
                        if (function2 != null) {
                            function2.invoke(m28778a(), new AccessDeniedException(m28778a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f68214e = true;
                    }
                }
                File[] fileArr = this.f68212c;
                if (fileArr != null) {
                    int i = this.f68213d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f68212c;
                        Intrinsics.checkNotNull(fileArr2);
                        int i2 = this.f68213d;
                        this.f68213d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.f68211b) {
                    Function1 function12 = FileTreeWalk.this.f68206d;
                    if (function12 != null) {
                        function12.invoke(m28778a());
                    }
                    return null;
                }
                this.f68211b = true;
                return m28778a();
            }
        }

        /* renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$b */
        /* loaded from: classes5.dex */
        public final class C11705b extends AbstractC11708b {

            /* renamed from: b */
            public boolean f68216b;

            /* renamed from: c */
            public final /* synthetic */ FileTreeWalkIterator f68217c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11705b(FileTreeWalkIterator fileTreeWalkIterator, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f68217c = fileTreeWalkIterator;
            }

            @Override // kotlin.p023io.FileTreeWalk.AbstractC11708b
            /* renamed from: b */
            public File mo28777b() {
                if (this.f68216b) {
                    return null;
                }
                this.f68216b = true;
                return m28778a();
            }
        }

        /* renamed from: kotlin.io.FileTreeWalk$FileTreeWalkIterator$c */
        /* loaded from: classes5.dex */
        public final class C11706c extends AbstractC11707a {

            /* renamed from: b */
            public boolean f68218b;

            /* renamed from: c */
            public File[] f68219c;

            /* renamed from: d */
            public int f68220d;

            /* renamed from: e */
            public final /* synthetic */ FileTreeWalkIterator f68221e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11706c(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f68221e = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
                if (r0.length == 0) goto L30;
             */
            @Override // kotlin.p023io.FileTreeWalk.AbstractC11708b
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File mo28777b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f68218b
                    r1 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.f68221e
                    kotlin.io.FileTreeWalk r0 = kotlin.p023io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.p023io.FileTreeWalk.access$getOnEnter$p(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.m28778a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.f68218b = r0
                    java.io.File r0 = r10.m28778a()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f68219c
                    if (r0 == 0) goto L47
                    int r2 = r10.f68220d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.f68221e
                    kotlin.io.FileTreeWalk r0 = kotlin.p023io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.p023io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.m28778a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.f68219c
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.m28778a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f68219c = r0
                    if (r0 != 0) goto L77
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.f68221e
                    kotlin.io.FileTreeWalk r0 = kotlin.p023io.FileTreeWalk.this
                    kotlin.jvm.functions.Function2 r0 = kotlin.p023io.FileTreeWalk.access$getOnFail$p(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.m28778a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.m28778a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.f68219c
                    if (r0 == 0) goto L81
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r10.f68221e
                    kotlin.io.FileTreeWalk r0 = kotlin.p023io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r0 = kotlin.p023io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.m28778a()
                    r0.invoke(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.f68219c
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r10.f68220d
                    int r2 = r1 + 1
                    r10.f68220d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p023io.FileTreeWalk.FileTreeWalkIterator.C11706c.mo28777b():java.io.File");
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f68209c = arrayDeque;
            if (FileTreeWalk.this.f68203a.isDirectory()) {
                arrayDeque.push(m28780b(FileTreeWalk.this.f68203a));
            } else if (FileTreeWalk.this.f68203a.isFile()) {
                arrayDeque.push(new C11705b(this, FileTreeWalk.this.f68203a));
            } else {
                done();
            }
        }

        /* renamed from: b */
        public final AbstractC11707a m28780b(File file) {
            int i = WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.f68204b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new C11704a(this, file);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C11706c(this, file);
        }

        /* renamed from: c */
        public final File m28779c() {
            File mo28777b;
            while (true) {
                AbstractC11708b abstractC11708b = (AbstractC11708b) this.f68209c.peek();
                if (abstractC11708b == null) {
                    return null;
                }
                mo28777b = abstractC11708b.mo28777b();
                if (mo28777b == null) {
                    this.f68209c.pop();
                } else if (Intrinsics.areEqual(mo28777b, abstractC11708b.m28778a()) || !mo28777b.isDirectory() || this.f68209c.size() >= FileTreeWalk.this.f68208f) {
                    break;
                } else {
                    this.f68209c.push(m28780b(mo28777b));
                }
            }
            return mo28777b;
        }

        @Override // kotlin.collections.AbstractIterator
        public void computeNext() {
            File m28779c = m28779c();
            if (m28779c != null) {
                setNext(m28779c);
            } else {
                done();
            }
        }
    }

    /* renamed from: kotlin.io.FileTreeWalk$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11707a extends AbstractC11708b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC11707a(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* renamed from: kotlin.io.FileTreeWalk$b */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC11708b {

        /* renamed from: a */
        public final File f68222a;

        public AbstractC11708b(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f68222a = root;
        }

        /* renamed from: a */
        public final File m28778a() {
            return this.f68222a;
        }

        /* renamed from: b */
        public abstract File mo28777b();
    }

    public FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i) {
        this.f68203a = file;
        this.f68204b = fileWalkDirection;
        this.f68205c = function1;
        this.f68206d = function12;
        this.f68207e = function2;
        this.f68208f = i;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    @NotNull
    public final FileTreeWalk maxDepth(int i) {
        if (i > 0) {
            return new FileTreeWalk(this.f68203a, this.f68204b, this.f68205c, this.f68206d, this.f68207e, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }

    @NotNull
    public final FileTreeWalk onEnter(@NotNull Function1<? super File, Boolean> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.f68203a, this.f68204b, function, this.f68206d, this.f68207e, this.f68208f);
    }

    @NotNull
    public final FileTreeWalk onFail(@NotNull Function2<? super File, ? super IOException, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.f68203a, this.f68204b, this.f68205c, this.f68206d, function, this.f68208f);
    }

    @NotNull
    public final FileTreeWalk onLeave(@NotNull Function1<? super File, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.f68203a, this.f68204b, this.f68205c, function, this.f68207e, this.f68208f);
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function12, function2, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(@NotNull File start, @NotNull FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
