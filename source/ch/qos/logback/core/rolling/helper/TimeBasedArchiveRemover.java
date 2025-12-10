package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.FileSize;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class TimeBasedArchiveRemover extends ContextAwareBase implements ArchiveRemover {

    /* renamed from: c */
    public final RollingCalendar f40081c;

    /* renamed from: d */
    public int f40082d = 0;

    /* renamed from: e */
    public long f40083e = 0;

    /* renamed from: f */
    public final FileProvider f40084f;
    protected final FileNamePattern fileNamePattern;

    /* renamed from: g */
    public final C12226lX f40085g;

    /* renamed from: h */
    public final C1156QD f40086h;

    /* renamed from: ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover$a */
    /* loaded from: classes.dex */
    public class C5490a implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ Date f40087a;

        public C5490a(Date date) {
            this.f40087a = date;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return TimeBasedArchiveRemover.this.f40081c.normalizeDate(TimeBasedArchiveRemover.this.f40086h.mo30618a(str)).compareTo(TimeBasedArchiveRemover.this.f40081c.normalizeDate(TimeBasedArchiveRemover.this.f40081c.getEndOfNextNthPeriod(this.f40087a, -TimeBasedArchiveRemover.this.f40082d))) < 0;
        }
    }

    /* renamed from: ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover$b */
    /* loaded from: classes.dex */
    public class RunnableC5491b implements Runnable {

        /* renamed from: a */
        public Date f40089a;

        public RunnableC5491b(Date date) {
            this.f40089a = date;
        }

        @Override // java.lang.Runnable
        public void run() {
            TimeBasedArchiveRemover.this.clean(this.f40089a);
        }
    }

    public TimeBasedArchiveRemover(FileNamePattern fileNamePattern, RollingCalendar rollingCalendar, FileProvider fileProvider) {
        this.fileNamePattern = fileNamePattern;
        this.f40081c = rollingCalendar;
        this.f40084f = fileProvider;
        C1156QD c1156qd = new C1156QD(fileNamePattern);
        this.f40086h = c1156qd;
        this.f40085g = new C12226lX(c1156qd, new C20416if0(fileNamePattern));
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void clean(Date date) {
        List m51374n = m51374n();
        for (String str : m51376l(m51374n, m51378j(date))) {
            m51377k(new File(str));
        }
        long j = this.f40083e;
        if (j != 0 && j > 0) {
            m51379i(m51374n);
        }
        for (String str2 : m51375m()) {
            m51377k(new File(str2));
        }
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public Future<?> cleanAsynchronously(Date date) {
        return this.context.getScheduledExecutorService().submit(new RunnableC5491b(date));
    }

    /* renamed from: i */
    public final void m51379i(List list) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        this.f40085g.m26463b(strArr);
        long j = 0;
        long j2 = 0;
        for (String str : strArr) {
            File file = new File(str);
            long length = this.f40084f.length(file);
            if (j2 + length > this.f40083e) {
                addInfo("Deleting [" + file + "] of size " + new FileSize(length));
                if (!m51377k(file)) {
                    length = 0;
                }
                j += length;
            }
            j2 += length;
        }
        addInfo("Removed  " + new FileSize(j) + " of files");
    }

    /* renamed from: j */
    public final FilenameFilter m51378j(Date date) {
        return new C5490a(date);
    }

    /* renamed from: k */
    public final boolean m51377k(File file) {
        addInfo("deleting " + file);
        boolean deleteFile = this.f40084f.deleteFile(file);
        if (!deleteFile) {
            addWarn("cannot delete " + file);
        }
        return deleteFile;
    }

    /* renamed from: l */
    public final List m51376l(List list, FilenameFilter filenameFilter) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : (String[]) list.toArray(new String[0])) {
            if (filenameFilter.accept(null, str)) {
                arrayList.add(str);
                list.remove(str);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public final List m51375m() {
        List<String> m31105a = new C10309gX(this.f40084f).m31105a(this.fileNamePattern.toRegex());
        Collections.reverse(m31105a);
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : m31105a) {
            int length = this.f40084f.list(new File(str), null).length;
            if (length == 0 || (length == 1 && arrayDeque.size() > 0 && str.equals(arrayDeque.peekLast()))) {
                arrayDeque.add(str);
            }
        }
        return Arrays.asList(arrayDeque.toArray(new String[0]));
    }

    /* renamed from: n */
    public final List m51374n() {
        return new C10309gX(this.f40084f).m31103c(this.fileNamePattern.toRegex());
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setMaxHistory(int i) {
        this.f40082d = i;
    }

    @Override // ch.qos.logback.core.rolling.helper.ArchiveRemover
    public void setTotalSizeCap(long j) {
        this.f40083e = j;
    }

    public String toString() {
        return "c.q.l.core.rolling.helper.TimeBasedArchiveRemover";
    }
}
