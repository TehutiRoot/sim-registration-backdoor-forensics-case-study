package ch.qos.logback.classic.android;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.classic.p008db.SQLBuilder;
import ch.qos.logback.classic.p008db.names.DBNameResolver;
import ch.qos.logback.classic.p008db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.util.Duration;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SQLiteAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {

    /* renamed from: g */
    public SQLiteDatabase f39520g;

    /* renamed from: h */
    public String f39521h;

    /* renamed from: i */
    public String f39522i;

    /* renamed from: j */
    public String f39523j;

    /* renamed from: k */
    public String f39524k;

    /* renamed from: l */
    public DBNameResolver f39525l;

    /* renamed from: m */
    public Duration f39526m;

    /* renamed from: o */
    public SQLiteLogCleaner f39528o;

    /* renamed from: n */
    public long f39527n = 0;

    /* renamed from: p */
    public InterfaceC10027cq f39529p = new C19522dQ1();

    /* renamed from: ch.qos.logback.classic.android.SQLiteAppender$a */
    /* loaded from: classes.dex */
    public class C5463a implements SQLiteLogCleaner {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10027cq f39530a;

        public C5463a(InterfaceC10027cq interfaceC10027cq) {
            this.f39530a = interfaceC10027cq;
        }

        @Override // ch.qos.logback.classic.android.SQLiteLogCleaner
        public void performLogCleanup(SQLiteDatabase sQLiteDatabase, Duration duration) {
            sQLiteDatabase.execSQL(SQLBuilder.buildDeleteExpiredLogsSQL(SQLiteAppender.this.f39525l, this.f39530a.currentTimeMillis() - duration.getMilliseconds()));
        }
    }

    /* renamed from: m */
    public static short m51639m(ILoggingEvent iLoggingEvent) {
        short s = 0;
        s = ((iLoggingEvent.getMDCPropertyMap() != null ? iLoggingEvent.getMDCPropertyMap().keySet().size() : 0) > 0 || (iLoggingEvent.getLoggerContextVO().getPropertyMap() != null ? iLoggingEvent.getLoggerContextVO().getPropertyMap().size() : 0) > 0) ? (short) 1 : (short) 1;
        return iLoggingEvent.getThrowableProxy() != null ? (short) (s | 2) : s;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            try {
                m51640l(this.f39520g);
                SQLiteStatement compileStatement = this.f39520g.compileStatement(this.f39523j);
                this.f39520g.beginTransaction();
                long m51632t = m51632t(iLoggingEvent, compileStatement);
                if (m51632t != -1) {
                    m51633s(iLoggingEvent, m51632t);
                    this.f39520g.setTransactionSuccessful();
                }
                if (this.f39520g.inTransaction()) {
                    this.f39520g.endTransaction();
                }
                compileStatement.close();
            } catch (Throwable th2) {
                addError("Cannot append event", th2);
            }
        }
    }

    /* renamed from: d */
    public final String m51645d(Object obj) {
        String obj2 = obj != null ? obj.toString() : null;
        if (obj2 != null && obj2.length() > 254) {
            obj2 = obj2.substring(0, 254);
        }
        return obj2 == null ? "" : obj2;
    }

    public void finalize() throws Throwable {
        this.f39520g.close();
    }

    /* renamed from: g */
    public final void m51644g(SQLiteStatement sQLiteStatement, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0 || (stackTraceElement = stackTraceElementArr[0]) == null) {
            return;
        }
        m51641k(sQLiteStatement, 11, stackTraceElement.getFileName());
        m51641k(sQLiteStatement, 12, stackTraceElement.getClassName());
        m51641k(sQLiteStatement, 13, stackTraceElement.getMethodName());
        m51641k(sQLiteStatement, 14, Integer.toString(stackTraceElement.getLineNumber()));
    }

    public File getDatabaseFile(String str) {
        File file = (str == null || str.trim().length() <= 0) ? null : new File(str);
        return (file == null || file.isDirectory()) ? new File(new AndroidContextUtil().getDatabasePath("logback.db")) : file;
    }

    public String getFilename() {
        return this.f39524k;
    }

    public SQLiteLogCleaner getLogCleaner() {
        if (this.f39528o == null) {
            this.f39528o = new C5463a(this.f39529p);
        }
        return this.f39528o;
    }

    public String getMaxHistory() {
        Duration duration = this.f39526m;
        return duration != null ? duration.toString() : "";
    }

    public long getMaxHistoryMs() {
        Duration duration = this.f39526m;
        if (duration != null) {
            return duration.getMilliseconds();
        }
        return 0L;
    }

    /* renamed from: i */
    public final void m51643i(SQLiteStatement sQLiteStatement, ILoggingEvent iLoggingEvent) {
        sQLiteStatement.bindLong(1, iLoggingEvent.getTimeStamp());
        sQLiteStatement.bindString(2, iLoggingEvent.getFormattedMessage());
        sQLiteStatement.bindString(3, iLoggingEvent.getLoggerName());
        sQLiteStatement.bindString(4, iLoggingEvent.getLevel().toString());
        sQLiteStatement.bindString(5, iLoggingEvent.getThreadName());
        sQLiteStatement.bindLong(6, m51639m(iLoggingEvent));
    }

    /* renamed from: j */
    public final void m51642j(SQLiteStatement sQLiteStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        for (int i = 0; i < length && i < 4; i++) {
            sQLiteStatement.bindString(i + 7, m51645d(objArr[i]));
        }
    }

    /* renamed from: k */
    public final void m51641k(SQLiteStatement sQLiteStatement, int i, String str) {
        if (str != null) {
            sQLiteStatement.bindString(i, str);
        }
    }

    /* renamed from: l */
    public final void m51640l(SQLiteDatabase sQLiteDatabase) {
        if (m51635q(this.f39526m, this.f39527n)) {
            this.f39527n = this.f39529p.currentTimeMillis();
            getLogCleaner().performLogCleanup(sQLiteDatabase, this.f39526m);
        }
    }

    /* renamed from: n */
    public final void m51638n(SQLiteStatement sQLiteStatement, String str, short s, long j) {
        sQLiteStatement.bindLong(1, j);
        sQLiteStatement.bindLong(2, s);
        sQLiteStatement.bindString(3, str);
        sQLiteStatement.executeInsert();
    }

    /* renamed from: o */
    public final void m51637o(Map map, long j) {
        if (map.size() > 0) {
            SQLiteStatement compileStatement = this.f39520g.compileStatement(this.f39521h);
            try {
                for (Map.Entry entry : map.entrySet()) {
                    compileStatement.bindLong(1, j);
                    compileStatement.bindString(2, (String) entry.getKey());
                    compileStatement.bindString(3, (String) entry.getValue());
                    compileStatement.executeInsert();
                }
            } finally {
                compileStatement.close();
            }
        }
    }

    /* renamed from: p */
    public final void m51636p(IThrowableProxy iThrowableProxy, long j) {
        SQLiteStatement compileStatement = this.f39520g.compileStatement(this.f39522i);
        short s = 0;
        while (iThrowableProxy != null) {
            try {
                StringBuilder sb = new StringBuilder();
                ThrowableProxyUtil.subjoinFirstLine(sb, iThrowableProxy);
                m51638n(compileStatement, sb.toString(), s, j);
                int commonFrames = iThrowableProxy.getCommonFrames();
                StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
                s = (short) (s + 1);
                int i = 0;
                while (i < stackTraceElementProxyArray.length - commonFrames) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('\t');
                    ThrowableProxyUtil.subjoinSTEP(sb2, stackTraceElementProxyArray[i]);
                    m51638n(compileStatement, sb2.toString(), s, j);
                    i++;
                    s = (short) (s + 1);
                }
                if (commonFrames > 0) {
                    m51638n(compileStatement, "\t... " + commonFrames + " common frames omitted", s, j);
                    s = (short) (s + 1);
                }
                iThrowableProxy = iThrowableProxy.getCause();
            } catch (Throwable th2) {
                compileStatement.close();
                throw th2;
            }
        }
        compileStatement.close();
    }

    /* renamed from: q */
    public final boolean m51635q(Duration duration, long j) {
        if (duration == null || duration.getMilliseconds() <= 0) {
            return false;
        }
        return j <= 0 || this.f39529p.currentTimeMillis() - j >= duration.getMilliseconds();
    }

    /* renamed from: r */
    public final Map m51634r(ILoggingEvent iLoggingEvent) {
        HashMap hashMap = new HashMap();
        Map<String, String> propertyMap = iLoggingEvent.getLoggerContextVO().getPropertyMap();
        if (propertyMap != null) {
            hashMap.putAll(propertyMap);
        }
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap != null) {
            hashMap.putAll(mDCPropertyMap);
        }
        return hashMap;
    }

    /* renamed from: s */
    public final void m51633s(ILoggingEvent iLoggingEvent, long j) {
        m51637o(m51634r(iLoggingEvent), j);
        if (iLoggingEvent.getThrowableProxy() != null) {
            m51636p(iLoggingEvent.getThrowableProxy(), j);
        }
    }

    public void setDbNameResolver(DBNameResolver dBNameResolver) {
        this.f39525l = dBNameResolver;
    }

    public void setFilename(String str) {
        this.f39524k = str;
    }

    public void setLogCleaner(SQLiteLogCleaner sQLiteLogCleaner) {
        this.f39528o = sQLiteLogCleaner;
    }

    public void setMaxHistory(String str) {
        this.f39526m = Duration.valueOf(str);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String str;
        this.started = false;
        File databaseFile = getDatabaseFile(this.f39524k);
        if (databaseFile == null) {
            addError("Cannot determine database filename");
            return;
        }
        try {
            databaseFile.getParentFile().mkdirs();
            addInfo("db path: " + databaseFile.getAbsolutePath());
            this.f39520g = SQLiteDatabase.openOrCreateDatabase(databaseFile.getPath(), (SQLiteDatabase.CursorFactory) null);
            if (this.f39525l == null) {
                this.f39525l = new DefaultDBNameResolver();
            }
            this.f39522i = SQLBuilder.buildInsertExceptionSQL(this.f39525l);
            this.f39521h = SQLBuilder.buildInsertPropertiesSQL(this.f39525l);
            this.f39523j = SQLBuilder.buildInsertSQL(this.f39525l);
            try {
                this.f39520g.execSQL(SQLBuilder.buildCreateLoggingEventTableSQL(this.f39525l));
                this.f39520g.execSQL(SQLBuilder.buildCreatePropertyTableSQL(this.f39525l));
                this.f39520g.execSQL(SQLBuilder.buildCreateExceptionTableSQL(this.f39525l));
                m51640l(this.f39520g);
                super.start();
                this.started = true;
            } catch (SQLiteException e) {
                e = e;
                str = "Cannot create database tables";
                addError(str, e);
            }
        } catch (SQLiteException e2) {
            e = e2;
            str = "Cannot open database";
        }
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f39520g.close();
        this.f39527n = 0L;
    }

    /* renamed from: t */
    public final long m51632t(ILoggingEvent iLoggingEvent, SQLiteStatement sQLiteStatement) {
        m51643i(sQLiteStatement, iLoggingEvent);
        m51642j(sQLiteStatement, iLoggingEvent.getArgumentArray());
        m51644g(sQLiteStatement, iLoggingEvent.getCallerData());
        try {
            return sQLiteStatement.executeInsert();
        } catch (SQLiteException e) {
            addWarn("Failed to insert loggingEvent", e);
            return -1L;
        }
    }
}
