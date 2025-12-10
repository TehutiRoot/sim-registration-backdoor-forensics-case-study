package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.UShort;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public class ElfParser implements Closeable, Elf {

    /* renamed from: a */
    public final int f43576a = 1179403647;

    /* renamed from: b */
    public final FileChannel f43577b;

    public ElfParser(File file) throws FileNotFoundException {
        if (file != null && file.exists()) {
            this.f43577b = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }

    /* renamed from: b */
    public final long m49335b(Elf.Header header, long j, long j2) {
        for (long j3 = 0; j3 < j; j3++) {
            Elf.ProgramHeader programHeader = header.getProgramHeader(j3);
            if (programHeader.type == 1) {
                long j4 = programHeader.vaddr;
                if (j4 <= j2 && j2 <= programHeader.memsz + j4) {
                    return (j2 - j4) + programHeader.offset;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f43577b.close();
    }

    public Elf.Header parseHeader() throws IOException {
        boolean z;
        this.f43577b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (readWord(allocate, 0L) == 1179403647) {
            short readByte = readByte(allocate, 4L);
            if (readByte(allocate, 5L) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (readByte == 1) {
                return new Elf32Header(z, this);
            }
            if (readByte == 2) {
                return new Elf64Header(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public List<String> parseNeededDependencies() throws IOException {
        ByteOrder byteOrder;
        long j;
        this.f43577b.position(0L);
        ArrayList arrayList = new ArrayList();
        Elf.Header parseHeader = parseHeader();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (parseHeader.bigEndian) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = parseHeader.phnum;
        int i = 0;
        if (j2 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j2 = parseHeader.getSectionHeader(0).info;
        }
        long j3 = 0;
        while (true) {
            if (j3 < j2) {
                Elf.ProgramHeader programHeader = parseHeader.getProgramHeader(j3);
                if (programHeader.type == 2) {
                    j = programHeader.offset;
                    break;
                }
                j3++;
            } else {
                j = 0;
                break;
            }
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList();
        long j4 = 0;
        while (true) {
            Elf.DynamicStructure dynamicStructure = parseHeader.getDynamicStructure(j, i);
            long j5 = j;
            long j6 = dynamicStructure.tag;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(dynamicStructure.val));
            } else if (j6 == 5) {
                j4 = dynamicStructure.val;
            }
            i++;
            if (dynamicStructure.tag == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long m49335b = m49335b(parseHeader, j2, j4);
            for (Long l : arrayList2) {
                arrayList.add(readString(allocate, l.longValue() + m49335b));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public void read(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.f43577b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    public short readByte(ByteBuffer byteBuffer, long j) throws IOException {
        read(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int readHalf(ByteBuffer byteBuffer, long j) throws IOException {
        read(byteBuffer, j, 2);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    public long readLong(ByteBuffer byteBuffer, long j) throws IOException {
        read(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    public String readString(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short readByte = readByte(byteBuffer, j);
            if (readByte != 0) {
                sb.append((char) readByte);
                j = j2;
            } else {
                return sb.toString();
            }
        }
    }

    public long readWord(ByteBuffer byteBuffer, long j) throws IOException {
        read(byteBuffer, j, 4);
        return byteBuffer.getInt() & BodyPartID.bodyIdMax;
    }
}
