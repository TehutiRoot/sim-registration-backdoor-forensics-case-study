package org.apache.commons.p028io.monitor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.commons.p028io.file.attribute.FileTimes;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.apache.commons.io.monitor.SerializableFileTime */
/* loaded from: classes6.dex */
public final class SerializableFileTime implements Serializable {
    static final SerializableFileTime EPOCH = new SerializableFileTime(FileTimes.EPOCH);
    private static final long serialVersionUID = 1;
    private FileTime fileTime;

    public SerializableFileTime(FileTime fileTime) {
        Objects.requireNonNull(fileTime);
        this.fileTime = AbstractC14008tZ.m22407a(fileTime);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        FileTime from;
        from = FileTime.from(MF1.m67420a(objectInputStream.readObject()));
        this.fileTime = from;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Instant instant;
        instant = this.fileTime.toInstant();
        objectOutputStream.writeObject(instant);
    }

    public int compareTo(FileTime fileTime) {
        int compareTo;
        compareTo = this.fileTime.compareTo(fileTime);
        return compareTo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableFileTime)) {
            return false;
        }
        return Objects.equals(this.fileTime, ((SerializableFileTime) obj).fileTime);
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.fileTime.hashCode();
        return hashCode;
    }

    /* renamed from: to */
    public long m24957to(TimeUnit timeUnit) {
        long j;
        j = this.fileTime.to(timeUnit);
        return j;
    }

    public Instant toInstant() {
        Instant instant;
        instant = this.fileTime.toInstant();
        return instant;
    }

    public long toMillis() {
        long millis;
        millis = this.fileTime.toMillis();
        return millis;
    }

    public String toString() {
        String fileTime;
        fileTime = this.fileTime.toString();
        return fileTime;
    }

    public FileTime unwrap() {
        return this.fileTime;
    }
}
