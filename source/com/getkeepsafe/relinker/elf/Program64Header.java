package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class Program64Header extends Elf.ProgramHeader {
    public Program64Header(ElfParser elfParser, Elf.Header header, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (header.bigEndian) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = header.phoff + (j * header.phentsize);
        this.type = elfParser.readWord(allocate, j2);
        this.offset = elfParser.readLong(allocate, 8 + j2);
        this.vaddr = elfParser.readLong(allocate, 16 + j2);
        this.memsz = elfParser.readLong(allocate, j2 + 40);
    }
}
