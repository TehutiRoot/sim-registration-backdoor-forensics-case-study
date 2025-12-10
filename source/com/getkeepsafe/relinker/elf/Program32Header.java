package com.getkeepsafe.relinker.elf;

import com.getkeepsafe.relinker.elf.Elf;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class Program32Header extends Elf.ProgramHeader {
    public Program32Header(ElfParser elfParser, Elf.Header header, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (header.bigEndian) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = header.phoff + (j * header.phentsize);
        this.type = elfParser.readWord(allocate, j2);
        this.offset = elfParser.readWord(allocate, 4 + j2);
        this.vaddr = elfParser.readWord(allocate, 8 + j2);
        this.memsz = elfParser.readWord(allocate, j2 + 20);
    }
}
