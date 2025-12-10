package org.apache.commons.p028io;

import java.io.File;

@Deprecated
/* renamed from: org.apache.commons.io.FileCleaner */
/* loaded from: classes6.dex */
public class FileCleaner {

    /* renamed from: a */
    public static final FileCleaningTracker f73231a = new FileCleaningTracker();

    @Deprecated
    public static synchronized void exitWhenFinished() {
        synchronized (FileCleaner.class) {
            f73231a.exitWhenFinished();
        }
    }

    public static FileCleaningTracker getInstance() {
        return f73231a;
    }

    @Deprecated
    public static int getTrackCount() {
        return f73231a.getTrackCount();
    }

    @Deprecated
    public static void track(File file, Object obj) {
        f73231a.track(file, obj);
    }

    @Deprecated
    public static void track(File file, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        f73231a.track(file, obj, fileDeleteStrategy);
    }

    @Deprecated
    public static void track(String str, Object obj) {
        f73231a.track(str, obj);
    }

    @Deprecated
    public static void track(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
        f73231a.track(str, obj, fileDeleteStrategy);
    }
}
