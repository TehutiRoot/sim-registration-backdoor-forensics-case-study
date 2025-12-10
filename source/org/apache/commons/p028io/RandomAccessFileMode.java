package org.apache.commons.p028io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;

/* renamed from: org.apache.commons.io.RandomAccessFileMode */
/* loaded from: classes6.dex */
public enum RandomAccessFileMode {
    READ_ONLY("r", 1),
    READ_WRITE(f73260RW, 2),
    READ_WRITE_SYNC_ALL(RWS, 4),
    READ_WRITE_SYNC_CONTENT(RWD, 3);
    

    /* renamed from: R */
    private static final String f73259R = "r";

    /* renamed from: RW */
    private static final String f73260RW = "rw";
    private static final String RWD = "rwd";
    private static final String RWS = "rws";
    private final int level;
    private final String mode;

    /* renamed from: org.apache.commons.io.RandomAccessFileMode$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12508a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73261a;

        static {
            StandardOpenOption[] values;
            StandardOpenOption standardOpenOption;
            int ordinal;
            StandardOpenOption standardOpenOption2;
            int ordinal2;
            StandardOpenOption standardOpenOption3;
            int ordinal3;
            values = StandardOpenOption.values();
            int[] iArr = new int[values.length];
            f73261a = iArr;
            try {
                standardOpenOption3 = StandardOpenOption.WRITE;
                ordinal3 = standardOpenOption3.ordinal();
                iArr[ordinal3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f73261a;
                standardOpenOption2 = StandardOpenOption.DSYNC;
                ordinal2 = standardOpenOption2.ordinal();
                iArr2[ordinal2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f73261a;
                standardOpenOption = StandardOpenOption.SYNC;
                ordinal = standardOpenOption.ordinal();
                iArr3[ordinal] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    RandomAccessFileMode(String str, int i) {
        this.mode = str;
        this.level = i;
    }

    private int getLevel() {
        return this.level;
    }

    public static RandomAccessFileMode valueOfMode(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 114:
                if (str.equals("r")) {
                    c = 0;
                    break;
                }
                break;
            case 3653:
                if (str.equals(f73260RW)) {
                    c = 1;
                    break;
                }
                break;
            case 113343:
                if (str.equals(RWD)) {
                    c = 2;
                    break;
                }
                break;
            case 113358:
                if (str.equals(RWS)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return READ_ONLY;
            case 1:
                return READ_WRITE;
            case 2:
                return READ_WRITE_SYNC_CONTENT;
            case 3:
                return READ_WRITE_SYNC_ALL;
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public void accept(Path path, IOConsumer<RandomAccessFile> iOConsumer) throws IOException {
        RandomAccessFile create = create(path);
        try {
            iOConsumer.accept(create);
            if (create != null) {
                create.close();
            }
        } catch (Throwable th2) {
            if (create != null) {
                try {
                    create.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public <T> T apply(Path path, IOFunction<RandomAccessFile, T> iOFunction) throws IOException {
        RandomAccessFile create = create(path);
        try {
            T apply = iOFunction.apply(create);
            if (create != null) {
                create.close();
            }
            return apply;
        } catch (Throwable th2) {
            if (create != null) {
                try {
                    create.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public RandomAccessFile create(File file) throws FileNotFoundException {
        return new IORandomAccessFile(file, this.mode);
    }

    public String getMode() {
        return this.mode;
    }

    public boolean implies(RandomAccessFileMode randomAccessFileMode) {
        if (getLevel() >= randomAccessFileMode.getLevel()) {
            return true;
        }
        return false;
    }

    /* renamed from: io */
    public IORandomAccessFile m25314io(String str) throws FileNotFoundException {
        return new IORandomAccessFile(str, this.mode);
    }

    public static RandomAccessFileMode valueOf(OpenOption... openOptionArr) {
        int ordinal;
        RandomAccessFileMode randomAccessFileMode;
        RandomAccessFileMode randomAccessFileMode2 = READ_ONLY;
        for (OpenOption openOption : openOptionArr) {
            if (AbstractC17308Ar1.m69045a(openOption)) {
                int[] iArr = C12508a.f73261a;
                ordinal = AbstractC17372Br1.m68853a(openOption).ordinal();
                int i = iArr[ordinal];
                if (i == 1) {
                    randomAccessFileMode = READ_WRITE;
                    if (randomAccessFileMode2.implies(randomAccessFileMode)) {
                    }
                    randomAccessFileMode2 = randomAccessFileMode;
                } else if (i == 2) {
                    randomAccessFileMode = READ_WRITE_SYNC_CONTENT;
                    if (randomAccessFileMode2.implies(randomAccessFileMode)) {
                    }
                    randomAccessFileMode2 = randomAccessFileMode;
                } else if (i == 3) {
                    randomAccessFileMode = READ_WRITE_SYNC_ALL;
                    if (randomAccessFileMode2.implies(randomAccessFileMode)) {
                    }
                    randomAccessFileMode2 = randomAccessFileMode;
                }
            }
        }
        return randomAccessFileMode2;
    }

    public RandomAccessFile create(Path path) throws FileNotFoundException {
        File file;
        file = path.toFile();
        Objects.requireNonNull(file, "file");
        return create(file);
    }

    public RandomAccessFile create(String str) throws FileNotFoundException {
        return new IORandomAccessFile(str, this.mode);
    }
}
