package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.RolloverFailure;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;

/* loaded from: classes.dex */
public class RenameUtil extends ContextAwareBase {

    /* renamed from: c */
    public static String f40079c = "http://logback.qos.ch/codes.html#renamingError";

    /* renamed from: b */
    public Boolean m51384b(File file, File file2) {
        if (EnvUtil.isJDK7OrHigher()) {
            File parentFile = file2.getAbsoluteFile().getParentFile();
            if (parentFile == null) {
                addWarn("Parent of target file [" + file2 + "] is null");
                return null;
            } else if (parentFile.exists()) {
                try {
                    return Boolean.valueOf(!FileStoreUtil.areOnSameFileStore(file, parentFile));
                } catch (RolloverFailure e) {
                    addWarn("Error while checking file store equality", e);
                    return null;
                }
            } else {
                addWarn("Parent of target file [" + file2 + "] does not exist");
                return null;
            }
        }
        return Boolean.FALSE;
    }

    /* renamed from: d */
    public void m51383d(File file) {
        if (FileUtil.createMissingParentDirectories(file)) {
            return;
        }
        throw new RolloverFailure("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
    }

    public void rename(String str, String str2) throws RolloverFailure {
        if (str.equals(str2)) {
            addWarn("Source and target files are the same [" + str + "]. Skipping.");
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            throw new RolloverFailure("File [" + str + "] does not exist.");
        }
        File file2 = new File(str2);
        m51383d(file2);
        addInfo("Renaming file [" + file + "] to [" + file2 + "]");
        if (file.renameTo(file2)) {
            return;
        }
        addWarn("Failed to rename file [" + file + "] as [" + file2 + "].");
        if (Boolean.TRUE.equals(m51384b(file, file2))) {
            addWarn("Detected different file systems for source [" + str + "] and target [" + str2 + "]. Attempting rename by copying.");
            renameByCopying(str, str2);
            return;
        }
        addWarn("Please consider leaving the [file] option of " + RollingFileAppender.class.getSimpleName() + " empty.");
        StringBuilder sb = new StringBuilder();
        sb.append("See also ");
        sb.append(f40079c);
        addWarn(sb.toString());
    }

    public void renameByCopying(String str, String str2) throws RolloverFailure {
        new FileUtil(getContext()).copy(str, str2);
        if (new File(str).delete()) {
            return;
        }
        addWarn("Could not delete " + str);
    }

    public String toString() {
        return "c.q.l.co.rolling.helper.RenameUtil";
    }
}
