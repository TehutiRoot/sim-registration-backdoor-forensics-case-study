package org.apache.commons.p028io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import org.apache.commons.p028io.channels.FileChannels;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOTriFunction;

/* renamed from: org.apache.commons.io.RandomAccessFiles */
/* loaded from: classes6.dex */
public class RandomAccessFiles {
    /* renamed from: a */
    public static long m25503a(RandomAccessFile randomAccessFile) {
        if (randomAccessFile != null) {
            return randomAccessFile.length();
        }
        return 0L;
    }

    public static boolean contentEquals(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2) throws IOException {
        if (Objects.equals(randomAccessFile, randomAccessFile2)) {
            return true;
        }
        long m25503a = m25503a(randomAccessFile);
        long m25503a2 = m25503a(randomAccessFile2);
        if (m25503a != m25503a2) {
            return false;
        }
        if (m25503a == 0 && m25503a2 == 0) {
            return true;
        }
        return FileChannels.contentEquals(randomAccessFile.getChannel(), randomAccessFile2.getChannel(), 8192);
    }

    public static byte[] read(final RandomAccessFile randomAccessFile, long j, int i) throws IOException {
        randomAccessFile.seek(j);
        return IOUtils.m25505u(new IOTriFunction() { // from class: Es1
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC18392Rb0.m66627a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return Integer.valueOf(randomAccessFile.read((byte[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue()));
            }
        }, i);
    }

    public static RandomAccessFile reset(RandomAccessFile randomAccessFile) throws IOException {
        randomAccessFile.seek(0L);
        return randomAccessFile;
    }
}