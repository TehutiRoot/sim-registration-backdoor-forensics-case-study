package ch.qos.logback.core;

import ch.qos.logback.core.recovery.ResilientFileOutputStream;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.FileUtil;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;

/* loaded from: classes.dex */
public class FileAppender<E> extends OutputStreamAppender<E> {
    protected static String COLLISION_WITH_EARLIER_APPENDER_URL = "http://logback.qos.ch/codes.html#earlier_fa_collision";
    public static final long DEFAULT_BUFFER_SIZE = 8192;
    protected boolean append = true;
    protected String fileName = null;

    /* renamed from: i */
    public boolean f39719i = false;

    /* renamed from: j */
    public boolean f39720j = false;

    /* renamed from: k */
    public boolean f39721k = false;

    /* renamed from: l */
    public FileSize f39722l = new FileSize(8192);

    public void addErrorForCollision(String str, String str2, String str3) {
        addError(OperatorName.SHOW_TEXT_LINE + str + "' option has the same value \"" + str2 + "\" as that given for appender [" + str3 + "] defined earlier.");
    }

    public boolean checkForFileCollisionInPreviousFileAppenders() {
        Map map;
        boolean z = false;
        if (this.fileName == null || (map = (Map) this.context.getObject(CoreConstants.FA_FILENAME_COLLISION_MAP)) == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (this.fileName.equals(entry.getValue())) {
                addErrorForCollision("File", (String) entry.getValue(), (String) entry.getKey());
                z = true;
            }
        }
        if (this.name != null) {
            map.put(getName(), this.fileName);
        }
        return z;
    }

    /* renamed from: g */
    public final String m51542g(String str) {
        return (!EnvUtil.isAndroidOS() || new File(str).isAbsolute()) ? str : FileUtil.prefixRelativePath(this.context.getProperty(CoreConstants.DATA_DIR_KEY), str);
    }

    public String getFile() {
        return this.fileName;
    }

    public boolean getLazy() {
        return this.f39721k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final void m51541i(Object obj) {
        ResilientFileOutputStream resilientFileOutputStream = (ResilientFileOutputStream) getOutputStream();
        FileChannel channel = resilientFileOutputStream.getChannel();
        if (channel == null) {
            return;
        }
        boolean interrupted = Thread.interrupted();
        FileLock fileLock = null;
        try {
            try {
                fileLock = channel.lock();
                long position = channel.position();
                long size = channel.size();
                if (size != position) {
                    channel.position(size);
                }
                super.writeOut(obj);
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                if (!interrupted) {
                    return;
                }
            } catch (IOException e) {
                resilientFileOutputStream.postIOFailure(e);
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                if (!interrupted) {
                    return;
                }
            }
            Thread.currentThread().interrupt();
        } catch (Throwable th2) {
            if (fileLock != null && fileLock.isValid()) {
                fileLock.release();
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            throw th2;
        }
    }

    public boolean isAppend() {
        return this.append;
    }

    public boolean isPrudent() {
        return this.f39719i;
    }

    public boolean openFile(String str) throws IOException {
        String m51542g = m51542g(str);
        this.lock.lock();
        try {
            File file = new File(m51542g);
            if (!FileUtil.createMissingParentDirectories(file)) {
                addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
            }
            ResilientFileOutputStream resilientFileOutputStream = new ResilientFileOutputStream(file, this.append, this.f39722l.getSize());
            resilientFileOutputStream.setContext(this.context);
            setOutputStream(resilientFileOutputStream);
            this.lock.unlock();
            return true;
        } catch (Throwable th2) {
            this.lock.unlock();
            throw th2;
        }
    }

    public final String rawFileProperty() {
        return this.fileName;
    }

    public void setAppend(boolean z) {
        this.append = z;
    }

    public void setBufferSize(FileSize fileSize) {
        addInfo("Setting bufferSize to [" + fileSize.toString() + "]");
        this.f39722l = fileSize;
    }

    public void setFile(String str) {
        this.fileName = str == null ? null : str.trim();
    }

    public void setLazy(boolean z) {
        this.f39721k = z;
    }

    public void setPrudent(boolean z) {
        this.f39719i = z;
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String str;
        String file = getFile();
        if (file != null) {
            String m51542g = m51542g(file);
            addInfo("File property is set to [" + m51542g + "]");
            if (this.f39719i && !isAppend()) {
                setAppend(true);
                addWarn("Setting \"Append\" property to true on account of \"Prudent\" mode");
            }
            if (this.f39721k) {
                setOutputStream(new NOPOutputStream());
            } else if (checkForFileCollisionInPreviousFileAppenders()) {
                addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                str = COLLISION_WITH_EARLIER_APPENDER_URL;
            } else {
                try {
                    openFile(m51542g);
                } catch (IOException e) {
                    addError("openFile(" + m51542g + "," + this.append + ") failed", e);
                    return;
                }
            }
            super.start();
            return;
        }
        str = "\"File\" property not set for appender named [" + this.name + "]";
        addError(str);
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        super.stop();
        Map<String, String> filenameCollisionMap = ContextUtil.getFilenameCollisionMap(this.context);
        if (filenameCollisionMap == null || getName() == null) {
            return;
        }
        filenameCollisionMap.remove(getName());
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void subAppend(E e) {
        if (!this.f39720j && this.f39721k) {
            this.f39720j = true;
            if (checkForFileCollisionInPreviousFileAppenders()) {
                addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                addError(COLLISION_WITH_EARLIER_APPENDER_URL);
            } else {
                try {
                    openFile(getFile());
                    super.start();
                } catch (IOException e2) {
                    this.started = false;
                    addError("openFile(" + this.fileName + "," + this.append + ") failed", e2);
                }
            }
        }
        super.subAppend(e);
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void writeOut(E e) throws IOException {
        if (this.f39719i) {
            m51541i(e);
        } else {
            super.writeOut(e);
        }
    }
}
