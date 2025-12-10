package org.apache.commons.p028io.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* renamed from: org.apache.commons.io.channels.FileChannels */
/* loaded from: classes6.dex */
public final class FileChannels {
    /* renamed from: a */
    public static long m25304a(FileChannel fileChannel) {
        if (fileChannel != null) {
            return fileChannel.size();
        }
        return 0L;
    }

    public static boolean contentEquals(FileChannel fileChannel, FileChannel fileChannel2, int i) throws IOException {
        if (Objects.equals(fileChannel, fileChannel2)) {
            return true;
        }
        long m25304a = m25304a(fileChannel);
        long m25304a2 = m25304a(fileChannel2);
        if (m25304a != m25304a2) {
            return false;
        }
        if (m25304a == 0 && m25304a2 == 0) {
            return true;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i);
        do {
            int read = fileChannel.read(allocateDirect);
            int read2 = fileChannel2.read(allocateDirect2);
            allocateDirect.clear();
            allocateDirect2.clear();
            if (read == -1 && read2 == -1) {
                return allocateDirect.equals(allocateDirect2);
            }
            if (read != read2) {
                return false;
            }
        } while (allocateDirect.equals(allocateDirect2));
        return false;
    }
}
